package com.facebook.wearable.datax;

import X.AnonymousClass000;
import X.BE7;
import X.C18070vi;
import X.C18090vk;
import X.C22821Di;
import X.C24202BxE;
import X.C24587CAi;
import X.C24683CEx;
import X.C25527ChP;
import X.C25792Cm4;
import X.C27260Dam;
import X.C27446DfX;
import X.C27888DnP;
import java.io.Closeable;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;

public final class LocalChannel extends C24683CEx implements Closeable {
    public static final C24587CAi Companion = new Object();

    /* renamed from: native  reason: not valid java name */
    public final C27260Dam f4native;
    public C18090vk onClosed;
    public C22821Di onError;
    public C22821Di onReceived;
    public final int service;

    public LocalChannel(Connection connection, int i) {
        C18070vi.A0d(connection, 1);
        this.service = i;
        ReferenceQueue referenceQueue = C27260Dam.A03;
        this.f4native = new C27260Dam(this, new C27446DfX(Companion, 5), allocateNative(connection.getHandle(), i));
    }

    private final native long allocateNative(long j, int i);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final native int idNative(long j);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    public final void send(C25527ChP chP) {
        C18070vi.A0d(chP, 0);
        ByteBuffer byteBuffer = chP.A00;
        if (byteBuffer != null) {
            C25792Cm4 cm4 = new C25792Cm4(sendNative(this.f4native.A00(), chP.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
            if (cm4.equals(C25792Cm4.A08)) {
                BE7.A1P(byteBuffer);
                return;
            }
            throw new C24202BxE(cm4);
        }
        throw AnonymousClass000.A0n("invalid buffer");
    }

    private final void handleClosed() {
        C18090vk r0 = this.onClosed;
        if (r0 != null) {
            r0.invoke();
        }
    }

    private final void handleError(int i) {
        C22821Di r2 = this.onError;
        if (r2 != null) {
            r2.invoke(new C24202BxE(new C25792Cm4(i)));
        }
    }

    private final void handleReceived(int i, ByteBuffer byteBuffer) {
        C22821Di r1 = this.onReceived;
        if (r1 != null) {
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            C18070vi.A0X(asReadOnlyBuffer);
            C25527ChP chP = new C25527ChP(i, asReadOnlyBuffer);
            try {
                r1.invoke(chP);
            } finally {
                chP.A00 = null;
            }
        }
    }

    public void close() {
        closeNative(this.f4native.A00());
    }

    public final void finalize() {
        ReferenceQueue referenceQueue = C27260Dam.A03;
        C27888DnP.A00.invoke();
    }

    public final boolean getClosed() {
        if (this.f4native.A01.get() == 0 || closedNative(this.f4native.A00())) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return idNative(this.f4native.A00());
    }

    public final C18090vk getOnClosed() {
        return this.onClosed;
    }

    public final C22821Di getOnError() {
        return this.onError;
    }

    public final C22821Di getOnReceived() {
        return this.onReceived;
    }

    public final int getService() {
        return this.service;
    }

    public final void setOnClosed(C18090vk r1) {
        this.onClosed = r1;
    }

    public final void setOnError(C22821Di r1) {
        this.onError = r1;
    }

    public final void setOnReceived(C22821Di r1) {
        this.onReceived = r1;
    }
}
