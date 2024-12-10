package com.facebook.cameracore.musiceffect;

import X.AnonymousClass1A8;
import X.C180839Od;
import android.os.Build;
import com.facebook.jni.HybridData;

public final class AudioServiceConfigurationAnnouncer {
    public static final C180839Od Companion = new Object();
    public HybridData mHybridData;

    private final native boolean announce(String str, String str2, String str3, String str4, long j, long j2, String str5);

    public static final native HybridData initHybrid();

    public final native float audioClipProgress();

    public final native boolean pause();

    public final native boolean resume();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9Od, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("musiceffect-native");
    }

    public AudioServiceConfigurationAnnouncer() {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            this.mHybridData = initHybrid();
        }
    }
}
