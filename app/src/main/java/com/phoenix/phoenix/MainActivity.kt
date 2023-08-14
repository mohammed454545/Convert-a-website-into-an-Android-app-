package com.phoenix.phoenix

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var mWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mWebView=findViewById(R.id.WebView)
        mWebView.loadUrl("https://phoenix4545.blogspot.com/")
        val webSetting = mWebView.settings
        webSetting.javaScriptEnabled = true
        mWebView.webViewClient = WebViewClient()
    }

    override fun onBackPressed() {
        if (mWebView.canGoBack()) {
            mWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}