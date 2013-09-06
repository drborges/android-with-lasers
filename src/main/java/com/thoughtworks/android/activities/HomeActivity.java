package com.thoughtworks.android.activities;

import android.os.Bundle;
import android.util.Log;

import com.thoughtworks.android.searchengines.SearchEngine;

import javax.inject.Inject;

public class HomeActivity extends BaseActivity {
    private static final String TAG = HomeActivity.class.getName();

    @Inject SearchEngine searchEngine;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String result = searchEngine.search("le query");

        Log.i(TAG, result);
        System.out.println(result);
    }
}