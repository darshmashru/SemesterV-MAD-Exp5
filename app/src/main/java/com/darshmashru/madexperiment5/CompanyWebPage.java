package com.darshmashru.madexperiment5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CompanyWebPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_web_page);

        WebView webView = findViewById(R.id.companyWebView);
        shouldOverrideUrlLoading(webView, "https://www.splunk.com/en_us/about-splunk/contact-us.html#customer-support");
    }
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url.startsWith("tel:")) {
            Intent tel = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
            startActivity(tel);
            return true;
        }
        else if (url.contains("mailto:")) {
            view.getContext().startActivity(
                    new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            return true;

        }else {
            view.loadUrl(url);
            return true;
        }
    }
    public void goToHomePage(View view) {
        Intent intent = new Intent(CompanyWebPage.this, MainActivity.class);
        startActivity(intent);
    }
}