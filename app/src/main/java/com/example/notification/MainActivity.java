package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetNotification(View view) {
        NotificationManagerCompat mynotiManager=NotificationManagerCompat.from(this);
        NotificationCompat.Builder noti=new NotificationCompat.Builder(this);
        noti.setContentTitle("One new Messege");
        noti.setContentText("Hi Em chestunnau?");
        noti.setSmallIcon(R.drawable.icon);
        Intent i1=new Intent(this,MainActivity.class);
        PendingIntent pi=PendingIntent.getActivity(this,1,i1,0);
        noti.setContentIntent(pi);
        noti.setAutoCancel(true);
        mynotiManager.notify(1,noti.build());
        finish();
    }
}