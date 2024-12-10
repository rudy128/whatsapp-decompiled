package com.facebook.wearable.airshield.stream;

import X.AnonymousClass1A8;
import X.AnonymousClass1Y1;
import X.BE8;
import X.C18070vi;
import X.C24346Bzh;
import X.C24584CAf;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

public final class Framing {
    public static final C24584CAf Companion = new Object();
    public final HybridData mHybridData;

    private final native int cipherPayloadSizeNative(ByteBuffer byteBuffer, int i, int i2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native int lastErrorNative();

    /* access modifiers changed from: private */
    public final native int outerFrameSizeNative(int i);

    private final native int packNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private final native int unpackNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public final C24346Bzh pack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        C18070vi.A0h(byteBuffer, byteBuffer2);
        int outerFrameSizeNative = outerFrameSizeNative(byteBuffer.remaining());
        if (byteBuffer2.remaining() < outerFrameSizeNative) {
            return C24346Bzh.BUFFER_TOO_SMALL;
        }
        int packNative = packNative(byteBuffer3, byteBuffer.position(), byteBuffer.remaining(), byteBuffer4, byteBuffer2.position(), byteBuffer2.remaining());
        if (packNative == -1) {
            int lastErrorNative = lastErrorNative();
            for (C24346Bzh bzh : C24346Bzh.values()) {
                if (bzh.rawValue == lastErrorNative) {
                    return bzh;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        BE8.A1G(byteBuffer, packNative);
        BE8.A1G(byteBuffer2, outerFrameSizeNative);
        return C24346Bzh.SUCCESS;
    }

    public final C24346Bzh unpack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        C18070vi.A0h(byteBuffer, byteBuffer2);
        if (byteBuffer2.remaining() < cipherPayloadSizeNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining())) {
            return C24346Bzh.BUFFER_TOO_SMALL;
        }
        int unpackNative = unpackNative(byteBuffer3, byteBuffer.position(), byteBuffer.remaining(), byteBuffer4, byteBuffer2.position(), byteBuffer2.remaining());
        if (unpackNative == -1) {
            int lastErrorNative = lastErrorNative();
            for (C24346Bzh bzh : C24346Bzh.values()) {
                if (bzh.rawValue == lastErrorNative) {
                    return bzh;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        byteBuffer.position(byteBuffer.position() + outerFrameSizeNative(unpackNative));
        BE8.A1G(byteBuffer2, unpackNative);
        return C24346Bzh.SUCCESS;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CAf] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Framing(HybridData hybridData, int i, AnonymousClass1Y1 r4) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public Framing(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
