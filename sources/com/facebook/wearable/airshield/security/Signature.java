package com.facebook.wearable.airshield.security;

import X.AnonymousClass1A8;
import X.AnonymousClass1Y1;
import X.C108975cc;
import X.C18070vi;
import X.C24582CAd;
import com.facebook.jni.HybridData;

public final class Signature {
    public static final C24582CAd Companion = new Object();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native byte[] toByteArray();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CAd] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Signature(HybridData hybridData, int i, AnonymousClass1Y1 r4) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.Signature");
        return equalsNative(((Signature) obj).getHandleNative());
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public Signature(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
