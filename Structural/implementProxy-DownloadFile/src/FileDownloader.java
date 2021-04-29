import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }


    @Override
    public void download(URL url){
        OutputStream out = null;
        URLConnection conn = null;
        InputStream in = null;
        System.out.println(userAgent);
        try {
            out = new BufferedOutputStream(new FileOutputStream("downloaded.txt"));
            conn = url.openConnection();
            in = conn.getInputStream();
            byte[] buffer = new byte[1024];
            int numRead;

            while ((numRead = in.read(buffer)) != -1){
                out.write(buffer, 0, numRead);
            }
            System.out.println("Downloaded data from "+url.toString());

        } catch (IOException e) {
            System.err.println("Failed to download from "+ url.toString());
        } finally {
            try {
                if (out != null){
                    out.close();
                }
                if (in != null){
                    in.close();
                }
            } catch (IOException e){
                System.err.println("Failed to close streams");
            }
        }

    }
}
