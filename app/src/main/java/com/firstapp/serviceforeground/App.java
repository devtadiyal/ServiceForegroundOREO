package com.firstapp.serviceforeground;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {

    public static final String CHANNEL_ID = "exampleservice";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotification();
    }

    public void createNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,"NOTIFICATION",NotificationManager.IMPORTANCE_DEFAULT);
NotificationManager manager = getSystemService(NotificationManager.class);
manager.createNotificationChannel(notificationChannel);
        }
    }
}