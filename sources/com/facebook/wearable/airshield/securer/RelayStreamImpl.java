package com.facebook.wearable.airshield.securer;

import X.AnonymousClass1A8;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C24334BzV;
import X.C25792Cm4;
import X.CAR;
import X.E1U;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class RelayStreamImpl implements E1U {
    public static final CAR Companion = new Object();
    public final HybridData mHybridData;

    /* renamed from: native  reason: not valid java name */
    public final long f1native;
    public AnonymousClass1OS onReceived;

    private final native boolean flushWithErrorNative(int i);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(RelayStreamImpl relayStreamImpl, long j);

    private final native int sendCommandNative(int i);

    private final native int sendSpanNative(ByteBuffer byteBuffer, int i, int i2);

    private final native int streamIdNative();

    public boolean flush(C25792Cm4 cm4) {
        C18070vi.A0d(cm4, 0);
        return flushWithErrorNative(cm4.A00);
    }

    public int send(ByteBuffer byteBuffer) {
        C18070vi.A0d(byteBuffer, 0);
        byteBuffer.put(0, streamHeader(byteBuffer.get(0)));
        return sendSpanNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public int sendCommand(C24334BzV bzV) {
        C18070vi.A0d(bzV, 0);
        return sendCommandNative(bzV.code);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CAR, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    private final void handleReceived(boolean z, ByteBuffer byteBuffer) {
        AnonymousClass1OS r1 = this.onReceived;
        if (r1 != null) {
            r1.invoke(Boolean.valueOf(z), byteBuffer);
        }
    }

    private final byte streamHeader(byte b) {
        return (byte) (((byte) (b & -64)) | ((byte) streamIdNative()));
    }

    public AnonymousClass1OS getOnReceived() {
        return this.onReceived;
    }

    public RelayStreamImpl(long j) {
        this.f1native = j;
        this.mHybridData = initHybrid(this, j);
    }

    public int getStreamId() {
        return streamIdNative();
    }

    public void sendFromPeer(E1U e1u, ByteBuffer byteBuffer) {
        C18070vi.A0h(e1u, byteBuffer);
        if (!e1u.equals(this)) {
            send(byteBuffer);
        }
    }

    public void setOnReceived(AnonymousClass1OS r1) {
        this.onReceived = r1;
    }
}
