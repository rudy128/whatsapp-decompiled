package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.AnonymousClass1A8;
import X.C8F;
import com.facebook.jni.HybridData;

public final class OnAsyncAssetFetchCompletedListenerImpl extends OnAsyncAssetFetchCompletedListener {
    public static final C8F Companion = new Object();

    public native void onAsyncAssetFetchCompleted(String str, String str2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C8F, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("ard-android-async-asset-fetcher-listener");
    }

    public OnAsyncAssetFetchCompletedListenerImpl(HybridData hybridData) {
        super(hybridData);
    }
}
