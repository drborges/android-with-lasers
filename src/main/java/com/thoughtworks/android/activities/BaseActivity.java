package com.thoughtworks.android.activities;

import android.app.Activity;
import android.os.Bundle;

import com.thoughtworks.android.App;

public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App) getApplication()).inject(this);
    }
}
