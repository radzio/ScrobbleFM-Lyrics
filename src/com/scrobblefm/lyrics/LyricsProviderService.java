package com.scrobblefm.lyrics;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created with IntelliJ IDEA.
 * User: Radek Piekarz
 * Date: 25.11.12
 * Time: 12:44
 */
public class LyricsProviderService extends Service
{
    private final ILyricsProvider.Stub binder = new ILyricsProvider.Stub()
    {
        public  String getLyrics(String artist, String song)
        {
            return getLyricsImpl(artist, song);
        }
    };

    private String getLyricsImpl(String artist, String song)
    {
        Log.d("LyricsProvider", artist + " " + song);
        return this.lyricsProvider.getLyrics(artist, song);
    }

    private LyricsProvider lyricsProvider;

    @Override
    public void onCreate() {
        super.onCreate();
        this.lyricsProvider = LyricsProviderFactory.getMainOnlineProvider();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return(binder);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


}