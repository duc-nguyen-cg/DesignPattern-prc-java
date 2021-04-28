import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.*;

public class TaxiPool {
    private static final long EXPIRED_TIME_IN_MILLISECOND = 1200;
    private static final int NUMBER_OF_TAXI = 4;
    private static AtomicInteger count = new AtomicInteger(0);
    private static final AtomicBoolean waiting = new AtomicBoolean(false);

    //create thread-safe lists
    private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
    private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());

    public synchronized void release(Taxi taxi){
        inUse.remove(taxi);
        available.add(taxi);
        System.out.println(taxi.getName() + " is free");
    }


    public synchronized Taxi getTaxi(){
        //there are free taxi
        if (!available.isEmpty()){
            Taxi taxi = available.get(0);
            inUse.add(taxi);
            return taxi;
        }
        //reach the limit of taxi pool, then wait
        if (count.get() == NUMBER_OF_TAXI){
            this.waitingUntilTaxiAvailable();
            return this.getTaxi();
        }
        //if cannot reuse, init a new one
        Taxi taxi = this.createTaxi();
        inUse.add(taxi);
        return taxi;
    }

    //init a totally new taxi
    private Taxi createTaxi(){
        waiting(200);
        Taxi taxi = new Taxi("Taxi "+count.incrementAndGet());
        System.out.println(taxi.getName());
        return taxi;
    }


    private void waitingUntilTaxiAvailable(){
        if (waiting.get()){
            waiting.set(false);
            throw new TaxiNotFoundException("No taxi available");
        }
        waiting.set(true);
        waiting(EXPIRED_TIME_IN_MILLISECOND);
    }


    private void waiting(long time){
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}
