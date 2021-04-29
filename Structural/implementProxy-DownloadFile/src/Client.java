import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) {
        FileDownloaderProxy proxy = new FileDownloaderProxy();
        URL url = null;
        try {
            url = new URL("https://vi.wikipedia.org/wiki/Wikipedia");
            proxy.download(url);
        } catch (MalformedURLException e) {
            System.err.println("Cannot access this site");
        }
    }
}
