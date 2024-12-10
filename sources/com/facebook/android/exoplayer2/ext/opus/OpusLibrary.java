package com.facebook.android.exoplayer2.ext.opus;

import X.C25926Cop;

public final class OpusLibrary {
    public static final OpusLibrary $redex_init_class = null;

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();

    static {
        C25926Cop.A00("goog.exo.opus");
    }
}
