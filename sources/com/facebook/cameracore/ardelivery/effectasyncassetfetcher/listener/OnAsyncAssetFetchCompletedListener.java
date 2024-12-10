package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.AnonymousClass1A8;
import X.C18070vi;
import X.C8E;
import com.facebook.jni.HybridData;

public abstract class OnAsyncAssetFetchCompletedListener {
    public static final C8E Companion = new Object();
    public final HybridData mHybridData;

    public OnAsyncAssetFetchCompletedListener(HybridData hybridData) {
        C18070vi.A0d(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void onAsyncAssetFetchCompleted(String str, String str2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C8E, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("ard-android-async-asset-fetcher-listener");
    }
}
