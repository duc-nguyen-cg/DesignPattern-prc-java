public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy calProxy = new MathCalculatorProxy();
        double result = calProxy.add(1,2);
        System.out.println("1 + 2 = " + result);
        result = calProxy.add(2, Double.MAX_VALUE);
        System.out.println("2 + Double.MAX_VALUE = " + result);//Should throw exception
    }
}
