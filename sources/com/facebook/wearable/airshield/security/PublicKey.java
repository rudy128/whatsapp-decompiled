package com.facebook.wearable.airshield.security;

import X.AnonymousClass1A8;
import X.AnonymousClass1Y1;
import X.C108975cc;
import X.C18070vi;
import X.C24580CAb;
import com.facebook.jni.HybridData;

public final class PublicKey {
    public static final C24580CAb Companion = new Object();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    public static final PublicKey from(byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        PublicKey publicKey = new PublicKey((HybridData) null);
        publicKey.setRaw(bArr);
        return publicKey;
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native boolean verifySignatureNative(long j, long j2);

    public native int hashCode();

    public final native byte[] serialize();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CAb, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PublicKey(HybridData hybridData, int i, AnonymousClass1Y1 r4) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PublicKey");
        return equalsNative(((PublicKey) obj).getHandleNative());
    }

    public final long getNative() {
        return getHandleNative();
    }

    public final boolean verifySignature(Hash hash, Signature signature) {
        C18070vi.A0h(hash, signature);
        return verifySignatureNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed(), signature.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public PublicKey(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
