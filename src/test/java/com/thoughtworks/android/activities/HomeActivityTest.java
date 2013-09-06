package com.thoughtworks.android.activities;

import android.os.Bundle;

import com.thoughtworks.android.searchengines.SearchEngine;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import javax.inject.Inject;

import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;

@RunWith(RobolectricTestRunner.class)
public class HomeActivityTest {
    @Mock Bundle bundle;
    @Mock SearchEngine googleSearchEngine;

    @Inject HomeActivity activity;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        ObjectGraph.create(new FakeSearchEnginesModule()).inject(this);
    }

    @Test
    public void usesGoogleSearchEngineToPerformTheQuery() throws Exception {
        activity.onCreate(bundle);

        Mockito.verify(googleSearchEngine).search("le query");
    }

    @Module(overrides = true, injects = { HomeActivity.class, HomeActivityTest.class })
    class FakeSearchEnginesModule {
        @Provides SearchEngine providesGoogleSearchEngine() {
            System.out.println("Providing FAKE impl of google search engine");
            return googleSearchEngine;
        }
    }
}
