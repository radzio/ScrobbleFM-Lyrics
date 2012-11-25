package com.scrobblefm.lyrics;
/**
 * Created with IntelliJ IDEA.
 * User: Radek Piekarz
 * Date: 25.11.12
 * Time: 12:43
 */
interface ILyricsProvider
{
    String getLyrics(String artist, String song);
}
