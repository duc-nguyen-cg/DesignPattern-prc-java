import java.net.URL;

public class FileDownloaderProxy implements Downloader{

    static final String CHROME_USER_AGENT = "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) coc_coc_browser/42.0 CoRom/36.0.1985.144 Chrome/36.0.1985.144 Safari/537.36";

    @Override
    public void download(URL url){
        FileDownloader fileDownloader = new FileDownloader(CHROME_USER_AGENT);
        fileDownloader.download(url);
    }
}
