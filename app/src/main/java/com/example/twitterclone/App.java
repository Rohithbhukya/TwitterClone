package com.example.twitterclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WmiG5QLbD63Hcbg7rc4EUTTnM3NO2EGWtaNbtbrJ")
                // if defined
                .clientKey("IRT7svedoOTumqHpMMHs3PYBQ9vnboZ0YVSdDnVI")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}


