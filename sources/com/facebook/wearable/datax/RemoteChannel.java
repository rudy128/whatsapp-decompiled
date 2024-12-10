package com.facebook.wearable.datax;

import X.AnonymousClass000;
import X.BE7;
import X.C18070vi;
import X.C24202BxE;
import X.C24588CAj;
import X.C24683CEx;
import X.C25527ChP;
import X.C25792Cm4;
import X.C27260Dam;
import X.C27446DfX;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;

public final class RemoteChannel extends C24683CEx {
    public static final C24588CAj Companion = new Object();

    /* renamed from: native  reason: not valid java name */
    public final C27260Dam f5native;

    private final native long allocateNative(long j);

    private final native boolean closed(long j);

    public static final native void deallocateNative(long j);

    private final native int idNative(long j);

    private final native int sendErrorNative(long j, int i);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    public final void send(C25527ChP chP) {
        C18070vi.A0d(chP, 0);
        ByteBuffer byteBuffer = chP.A00;
        if (byteBuffer != null) {
            C25792Cm4 cm4 = new C25792Cm4(sendNative(this.f5native.A00(), chP.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
            if (cm4.equals(C25792Cm4.A08)) {
                BE7.A1P(byteBuffer);
                return;
            }
            throw new C24202BxE(cm4);
        }
        throw AnonymousClass000.A0n("invalid buffer");
    }

    public final int getId() {
        return idNative(this.f5native.A00());
    }

    public final boolean isClosed() {
        return closed(this.f5native.A00());
    }

    public RemoteChannel(long j) {
        ReferenceQueue referenceQueue = C27260Dam.A03;
        this.f5native = new C27260Dam(this, new C27446DfX(Companion, 6), allocateNative(j));
    }

    public final void send(C25792Cm4 cm4) {
        C18070vi.A0d(cm4, 0);
        C25792Cm4 cm42 = new C25792Cm4(sendErrorNative(this.f5native.A00(), cm4.A00));
        if (!cm42.equals(C25792Cm4.A08)) {
            throw new C24202BxE(cm42);
        }
    }
}
