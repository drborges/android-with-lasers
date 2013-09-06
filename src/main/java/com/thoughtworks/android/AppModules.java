package com.thoughtworks.android;

import com.thoughtworks.android.activities.HomeActivity;
import com.thoughtworks.android.searchengines.GoogleSearchEngine;
import com.thoughtworks.android.searchengines.SearchEngine;

import dagger.Module;
import dagger.Provides;

@Module(
    library = true,
    injects = HomeActivity.class
)
public class AppModules {
    private final App app;

    public AppModules(App app) {
        this.app = app;
    }

    //@Provides
    App providesApplication() {
        return app;
    }

    @Provides SearchEngine providesGoogleSearchEngine() {
        System.out.println("Providing real impl of google search engine");
        return new GoogleSearchEngine();
    }
}