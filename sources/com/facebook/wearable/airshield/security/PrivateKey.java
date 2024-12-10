package com.facebook.wearable.airshield.security;

import X.AnonymousClass1A8;
import X.AnonymousClass1Y1;
import X.C108975cc;
import X.C18070vi;
import X.C24579CAa;
import com.facebook.jni.HybridData;

public final class PrivateKey {
    public static final C24579CAa Companion = new Object();
    public final HybridData mHybridData;

    public /* synthetic */ PrivateKey(AnonymousClass1Y1 r1) {
        this();
    }

    private final native Hash deriveNative(long j);

    private final native boolean equalsNative(long j);

    /* access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native Signature signNative(long j);

    public final Hash derive(PublicKey publicKey) {
        C18070vi.A0d(publicKey, 0);
        return deriveNative(publicKey.getNative());
    }

    public native int hashCode();

    public final native PublicKey recoverPublicKey();

    public final native byte[] serialize();

    public final Signature sign(Hash hash) {
        C18070vi.A0d(hash, 0);
        return signNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CAa, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PrivateKey");
        return equalsNative(((PrivateKey) obj).getHandleNative());
    }

    public PrivateKey() {
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }
}
