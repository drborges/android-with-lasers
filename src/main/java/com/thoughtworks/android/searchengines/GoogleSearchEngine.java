package com.thoughtworks.android.searchengines;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class GoogleSearchEngine extends AsyncTask<> implements SearchEngine {

    @Override
    public String search(String query) {
        HttpClient httpclient = new DefaultHttpClient();

        // Prepare a request object
        HttpGet httpget = new HttpGet(url);

        try {
            HttpResponse response = httpclient.execute(httpget);
            Log.i("Praeda", response.getStatusLine().toString());

            return "Results from Google: ";

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
