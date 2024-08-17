package wolvengard.app.rimworldcompanion;

import android.media.Image;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class WikiGrabber {

    public static Document mainPageHTML;

    public static void getMainPage() throws IOException {

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    String url = "https://rimworldwiki.com/";
                    mainPageHTML = Jsoup.connect(url).get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
