package com.maximumintelligence.pinup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WebViewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.webview_layout, container, false);

        WebView myWebView = new WebView(getContext());
        getActivity().setContentView(myWebView);

        myWebView.loadUrl("https://pin-up.games/");

        CookieManager manager = CookieManager.getInstance();
        manager.setAcceptCookie(true);

        return view;


    }
}
