package com.example.wen.testandroidapp.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private final String TAG = getPackageName();

    private DownloadBinder mBinder = new DownloadBinder();
    public MyService() {
    }

    public class DownloadBinder extends Binder{
        public void startDownload(){
            Log.d(TAG, "startDownload: startDownload executed ");
        }
        public int getProgress(){
            Log.d(TAG, "getProgress: getProgress executed");
            return 0;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
