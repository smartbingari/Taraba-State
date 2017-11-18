package com.smartbingari.tarabastate;


import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Schools extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools);
        wv = (WebView) findViewById(R.id.wv);

        wv.loadUrl("https://tarabastate.gov.ng/about-taraba/schools");
        wv.setWebViewClient(new MyClient());
        wv.setWebChromeClient(new GoogleClient());
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wv.clearCache(true);
        wv.clearHistory();
        wv.setDownloadListener(new DownloadListener()
        {

            @Override


            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimeType,
                                        long contentLength) {

                DownloadManager.Request request = new DownloadManager.Request(
                        Uri.parse(url));


                request.setMimeType(mimeType);


                String cookies = CookieManager.getInstance().getCookie(url);


                request.addRequestHeader("cookie", cookies);


                request.addRequestHeader("User-Agent", userAgent);


                request.setDescription("Downloading file...");


                request.setTitle(URLUtil.guessFileName(url, contentDisposition,
                        mimeType));


                request.allowScanningByMediaScanner();


                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalFilesDir(Schools.this,
                        Environment.DIRECTORY_DOWNLOADS,".pdf");
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(request);
                Toast.makeText(getApplicationContext(), "Downloading File",
                        Toast.LENGTH_LONG).show();
            }});


        wv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.loadUrl("https://tarabastate.gov.ng/about-taraba/schools");
            }
        });


    }

    class MyClient extends WebViewClient
    {

        @Override
        public void onPageStarted(WebView view,String url,Bitmap favicon){
            super.onPageStarted(view,url,favicon);
            findViewById(R.id.progressBar).setVisibility(View.VISIBLE);

        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String Url)
        {
            view.loadUrl(Url);
            return true;

        }
        @Override
        public void onPageFinished(WebView view,String url)
        {
            super.onPageFinished(view,url);
            findViewById(R.id.progressBar).setVisibility(View.GONE);

        }
    }
    class GoogleClient extends WebChromeClient
    {
        @Override
        public void onProgressChanged(WebView view,int newProgress)
        {
            super.onProgressChanged(view,newProgress);

        }
    }
    @Override
    public void onBackPressed() {
        if (wv.canGoBack())
            wv.goBack();
        else
            super.onBackPressed();

    }
}