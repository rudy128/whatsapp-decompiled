package com.facebook.wearable.airshield.securer;

import X.AnonymousClass000;
import X.AnonymousClass1A8;
import X.AnonymousClass1OS;
import X.BE7;
import X.BEA;
import X.C18070vi;
import X.C22821Di;
import X.C24348Bzj;
import X.C24349Bzk;
import X.CAR;
import X.CAT;
import X.CAU;
import X.E1U;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class StreamSecurerImpl {
    public static final CAU Companion = new Object();
    public boolean initialized;
    public final HybridData mHybridData = initHybrid(this);
    public C22821Di onPreambleReady;
    public C22821Di onSend;
    public AnonymousClass1OS onStreamClosed;
    public AnonymousClass1OS onStreamReady;

    private final native void closeStreamNative(int i, int i2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(StreamSecurerImpl streamSecurerImpl);

    private final native void initializeNative(boolean z);

    private final native boolean linkSwitchingEnabledNative();

    private final native long openRelayedStreamNative();

    private final native int receiveDataNative(ByteBuffer byteBuffer, int i, int i2);

    private final native boolean relayEnabledNative();

    private final native byte[] rxUUIDNative();

    private final native void startNative();

    private final native void stopNative();

    private final native byte[] txUUIDNative();

    public void closeStream(int i, C24348Bzj bzj) {
        C18070vi.A0d(bzj, 1);
        closeStreamNative(i, bzj.code);
    }

    public void initialize(boolean z) {
        this.initialized = true;
        initializeNative(z);
    }

    public C24349Bzk receiveData(ByteBuffer byteBuffer) {
        C18070vi.A0d(byteBuffer, 0);
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        BE7.A1P(byteBuffer);
        return CAT.A00(receiveDataNative(byteBuffer, position, remaining));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CAU] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    private final void handlePreambleReady(Preamble preamble) {
        C22821Di r0 = this.onPreambleReady;
        if (r0 != null) {
            r0.invoke(preamble);
            return;
        }
        throw AnonymousClass000.A0n("onPreambleReady callback is not set");
    }

    private final int handleSend(ByteBuffer byteBuffer) {
        C22821Di r0 = this.onSend;
        if (r0 != null) {
            return AnonymousClass000.A0M(r0.invoke(byteBuffer));
        }
        throw AnonymousClass000.A0n("onSend callback is not set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r1 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleStreamClosed(int r7, int r8) {
        /*
            r6 = this;
            X.1OS r5 = r6.onStreamClosed
            if (r5 == 0) goto L_0x004b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            X.Bzj r3 = X.C24348Bzj.UNSUPPORTED_TYPE
            int r0 = r3.code
            if (r8 <= r0) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Stream error returned an unknown code: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ". It may be dataX error: "
            r1.append(r0)
            X.Cm4 r0 = new X.Cm4
            r0.<init>(r8)
            java.lang.String r1 = X.C17890vO.A0V(r0, r1)
            java.lang.String r0 = "StreamError"
            X.C26294Cx6.A07(r0, r1)
        L_0x002d:
            X.0z2 r0 = X.C24348Bzj.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0033:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Bzj r0 = (X.C24348Bzj) r0
            int r0 = r0.code
            if (r0 != r8) goto L_0x0033
            if (r1 != 0) goto L_0x0047
        L_0x0046:
            r1 = r3
        L_0x0047:
            r5.invoke(r4, r1)
            return
        L_0x004b:
            java.lang.String r0 = "onError callback is not set"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.airshield.securer.StreamSecurerImpl.handleStreamClosed(int, int):void");
    }

    private final void handleStreamReady(long j, byte[] bArr) {
        Stream stream = new Stream(j);
        AnonymousClass1OS r0 = this.onStreamReady;
        if (r0 != null) {
            r0.invoke(stream, bArr);
            return;
        }
        throw AnonymousClass000.A0n("onStreamReady callback is not set");
    }

    public C22821Di getOnPreambleReady() {
        return this.onPreambleReady;
    }

    public C22821Di getOnSend() {
        return this.onSend;
    }

    public AnonymousClass1OS getOnStreamClosed() {
        return this.onStreamClosed;
    }

    public AnonymousClass1OS getOnStreamReady() {
        return this.onStreamReady;
    }

    public void start() {
        if (this.initialized) {
            startNative();
            return;
        }
        throw AnonymousClass000.A0n("StreamSecurer not initialized when starting!");
    }

    public UUID getRxUUID() {
        return BEA.A0v(rxUUIDNative());
    }

    public UUID getTxUUID() {
        return BEA.A0v(txUUIDNative());
    }

    public boolean isLinkSwitchingEnabled() {
        return linkSwitchingEnabledNative();
    }

    public boolean isRelayEnabled() {
        return relayEnabledNative();
    }

    public E1U openRelayStream() {
        if (!relayEnabledNative()) {
            return null;
        }
        CAR car = RelayStreamImpl.Companion;
        return new RelayStreamImpl(openRelayedStreamNative());
    }

    public void stop() {
        stopNative();
    }

    public void setOnPreambleReady(C22821Di r1) {
        this.onPreambleReady = r1;
    }

    public void setOnSend(C22821Di r1) {
        this.onSend = r1;
    }

    public void setOnStreamClosed(AnonymousClass1OS r1) {
        this.onStreamClosed = r1;
    }

    public void setOnStreamReady(AnonymousClass1OS r1) {
        this.onStreamReady = r1;
    }
}
