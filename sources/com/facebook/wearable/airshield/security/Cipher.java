package com.facebook.wearable.airshield.security;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.C18070vi;
import X.C24252ByA;
import X.CAV;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class Cipher {
    public static final CAV Companion = new Object();
    public final HybridData mHybridData;
    public final C24252ByA operation;

    public /* synthetic */ Cipher(C24252ByA byA, AnonymousClass1Y1 r2) {
        this(byA);
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setup(long j, boolean z, long j2);

    private final native int size();

    private final native boolean update(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3);

    public final boolean update(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        C18070vi.A0h(byteBuffer, byteBuffer2);
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect()) {
            throw AnonymousClass000.A0k("Byte buffer must be direct!");
        }
        return update(byteBuffer3, byteBuffer.position(), byteBuffer.remaining(), byteBuffer4, byteBuffer2.position());
    }

    public final C24252ByA getOperation() {
        return this.operation;
    }

    public Cipher(C24252ByA byA) {
        this.operation = byA;
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public final int getSize() {
        return size();
    }
}
