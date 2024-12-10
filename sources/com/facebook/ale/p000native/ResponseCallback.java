package com.facebook.ale.p000native;

import X.C18070vi;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ale.native.ResponseCallback  reason: invalid package */
public final class ResponseCallback {
    public HybridData mHybridData;

    public ResponseCallback(HybridData hybridData) {
        C18070vi.A0d(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public final native void onFailure(String str);

    public final native void onSuccess(String str);

    public final native void onSuccessfullCdnDownload(ByteBuffer byteBuffer);
}
