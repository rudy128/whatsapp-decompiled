package com.facebook.wearable.airshield.security;

import X.AnonymousClass1A8;
import X.AnonymousClass1Y1;
import X.C108975cc;
import X.C18070vi;
import X.CAZ;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class InitializationVector {
    public static final CAZ Companion = new Object();
    public final HybridData mHybridData;

    public /* synthetic */ InitializationVector(AnonymousClass1Y1 r1) {
        this();
    }

    private final native boolean equalsNative(long j);

    /* access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(ByteBuffer byteBuffer, int i, int i2);

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native int size();

    public final native byte[] toByteArray();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CAZ, java.lang.Object] */
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
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.InitializationVector");
        return equalsNative(((InitializationVector) obj).getHandleNative());
    }

    public InitializationVector() {
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }
}
