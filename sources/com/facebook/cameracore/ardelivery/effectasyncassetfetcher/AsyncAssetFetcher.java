package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.AnonymousClass1A8;
import X.AnonymousClass9IY;
import X.B4W;
import X.C22407B6l;
import X.C26294Cx6;
import android.os.Build;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.jni.HybridData;
import java.util.Collections;
import java.util.List;

public class AsyncAssetFetcher {
    public static final String TAG = "AsyncAssetFetcher";
    public final List mAsyncAssets;
    public final String mEffectId;
    public final String mEffectInstanceId;
    public final B4W mFetchCallback;
    public HybridData mHybridData;
    public final boolean mIsLoggingDisabled;

    private native HybridData initHybrid();

    public CancelableToken fetchAsyncAsset(String str, String str2, String str3, int i, int i2, int i3, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener) {
        C26294Cx6.A08(TAG, "fetch asset async but AsyncAssetFetchCallback is null.");
        onAsyncAssetFetchCompletedListener.onAsyncAssetFetchCompleted((String) null, "No AsyncAssetFetchCallback. Abort.");
        return new CancelableLoadToken((C22407B6l) null);
    }

    public static ARAssetType fromAsyncAssetType(AnonymousClass9IY r1) {
        if (r1 == AnonymousClass9IY.Remote) {
            return ARAssetType.REMOTE;
        }
        if (r1 == AnonymousClass9IY.Block || r1 == AnonymousClass9IY.ShareableBlock || r1 == AnonymousClass9IY.ExternalBlock) {
            return ARAssetType.ASYNC;
        }
        return null;
    }

    public List getAsyncAssets() {
        List list = this.mAsyncAssets;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public AsyncAssetFetcher(String str, String str2, List list, B4W b4w, boolean z) {
        HybridData hybridData;
        this.mEffectId = str;
        this.mEffectInstanceId = str2;
        this.mAsyncAssets = list;
        this.mFetchCallback = b4w;
        this.mIsLoggingDisabled = z;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            AnonymousClass1A8.A06("ard-android-async-asset-fetcher");
            hybridData = initHybrid();
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
    }
}
