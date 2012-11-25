package com.scrobblefm.lyrics;

/**
 * Created with IntelliJ IDEA.
 * User: Radek Piekarz
 * Date: 21.11.12
 * Time: 18:43
 */
public final class LyricsProviderFactory {

    /* This class is never initiated. */
    public LyricsProviderFactory()
    {

    }

    /**
     * @return The current lyrics provider.
     */

    public static final LyricsProvider getMainOnlineProvider()
    {
        return new LyricsWikiProvider();
    }

}
