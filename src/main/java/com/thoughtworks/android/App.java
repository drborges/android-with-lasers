package com.thoughtworks.android;

import android.app.Application;
import android.util.Log;

import dagger.ObjectGraph;

public class App extends Application {
    private static final String TAG = App.class.getName();

    private ObjectGraph dependencyGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Building Application Object Graph");
        dependencyGraph = ObjectGraph.create(new AppModules(this));
    }

    public void inject(Object target) {
        Log.i(TAG, "Injecting dependencies into " + target.getClass().getName());
        dependencyGraph.inject(target);
    }
}
