package com.facebook.wearable.airshield.securer;

import X.AnonymousClass1A8;
import X.BEA;
import X.C18070vi;
import X.C22821Di;
import X.C24349Bzk;
import X.C25792Cm4;
import X.CAS;
import X.CAT;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class Stream {
    public static final CAS Companion = new Object();
    public final HybridData mHybridData;

    /* renamed from: native  reason: not valid java name */
    public final long f2native;
    public C22821Di onReceived;

    private final native boolean flushWithErrorNative(int i);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(Stream stream, long j);

    private final native byte[] rxUUIDNative();

    private final native int sendNative(ByteBuffer byteBuffer, int i, int i2);

    private final native int streamIdNative();

    private final native byte[] txUUIDNative();

    public final boolean flush(C25792Cm4 cm4) {
        C18070vi.A0d(cm4, 0);
        return flushWithErrorNative(cm4.A00);
    }

    public final C24349Bzk send(ByteBuffer byteBuffer) {
        C18070vi.A0d(byteBuffer, 0);
        return CAT.A00(sendNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
    }

    public final UUID toUUID(byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        return BEA.A0v(bArr);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CAS, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    private final void handleReceived(ByteBuffer byteBuffer) {
        C22821Di r0 = this.onReceived;
        if (r0 != null) {
            r0.invoke(byteBuffer);
        }
    }

    public final C22821Di getOnReceived() {
        return this.onReceived;
    }

    public Stream(long j) {
        this.f2native = j;
        this.mHybridData = initHybrid(this, j);
    }

    public final UUID getRxUUID() {
        byte[] rxUUIDNative = rxUUIDNative();
        C18070vi.A0d(rxUUIDNative, 0);
        return BEA.A0v(rxUUIDNative);
    }

    public final int getStreamId() {
        return streamIdNative();
    }

    public final UUID getTxUUID() {
        byte[] txUUIDNative = txUUIDNative();
        C18070vi.A0d(txUUIDNative, 0);
        return BEA.A0v(txUUIDNative);
    }

    public final void setOnReceived(C22821Di r1) {
        this.onReceived = r1;
    }
}
