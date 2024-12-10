package com.facebook.cameracore.mediapipeline.engine.provider.whatsapp;

import X.AnonymousClass1A8;
import X.C24529C8a;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.jni.HybridData;

public final class WhatsAppPluginConfigProvider extends PluginConfigProvider {
    public static final C24529C8a Companion = new Object();

    public static final native HybridData initHybrid(Context context);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C8a, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("graphicsengine-whatsapp-native");
    }
}
