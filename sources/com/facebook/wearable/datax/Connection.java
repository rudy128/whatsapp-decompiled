package com.facebook.wearable.datax;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.BE7;
import X.C18070vi;
import X.C22821Di;
import X.C24202BxE;
import X.C24585CAg;
import X.C24683CEx;
import X.C25792Cm4;
import X.C27260Dam;
import X.C27446DfX;
import X.C27888DnP;
import X.C36001nB;
import X.CVI;
import com.facebook.wearable.datax.util.MessageInfo;
import java.io.Closeable;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;

public final class Connection extends C24683CEx implements Closeable {
    public static final C24585CAg Companion = new Object();

    /* renamed from: native  reason: not valid java name */
    public final C27260Dam f3native;
    public C22821Di onRead;
    public C36001nB onWriteError;
    public final CVI receiveFragment;
    public final AnonymousClass1OS writer;

    private final native long allocateNative(long j);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final native MessageInfo getMessageInfoNative(long j, ByteBuffer byteBuffer, int i, int i2, boolean z);

    private final native long handleNative(long j);

    private final native int interruptCodeNative(long j);

    private final native void interruptNative(long j, int i);

    private final native int mtuNative(long j);

    private final native boolean onReceivedNative(long j, ByteBuffer byteBuffer, int i, int i2);

    /* access modifiers changed from: private */
    public final native int pollReceiveFragmentNative(long j, ByteBuffer byteBuffer, int i);

    private final native void registerServiceNative(long j, long j2);

    private final native void resetNative(long j);

    private final native int versionNative(long j);

    public final MessageInfo getMessageInfo(ByteBuffer byteBuffer, boolean z) {
        C18070vi.A0d(byteBuffer, 0);
        return getMessageInfoNative(this.f3native.A00(), byteBuffer, byteBuffer.remaining(), byteBuffer.position(), z);
    }

    public final void interruptWithError(C25792Cm4 cm4) {
        C18070vi.A0d(cm4, 0);
        interruptNative(this.f3native.A00(), cm4.A00);
    }

    public final void onReceived(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        C18070vi.A0d(byteBuffer, 0);
        if (!byteBuffer.isDirect()) {
            throw AnonymousClass000.A0n("Bytes buffer must be direct");
        } else if (onReceivedNative(this.f3native.A00(), byteBuffer2, byteBuffer.position(), byteBuffer.remaining())) {
            BE7.A1P(byteBuffer);
        } else {
            throw new C24202BxE(C25792Cm4.A07);
        }
    }

    public final C25792Cm4 onReceivedWithInterrupt(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        C18070vi.A0d(byteBuffer, 0);
        if (byteBuffer.isDirect()) {
            int position = byteBuffer.position();
            int remaining = byteBuffer.remaining();
            BE7.A1P(byteBuffer);
            if (onReceivedNative(this.f3native.A00(), byteBuffer2, position, remaining)) {
                int interruptCodeNative = interruptCodeNative(this.f3native.A00());
                if (interruptCodeNative != 0) {
                    return new C25792Cm4(interruptCodeNative);
                }
                return C25792Cm4.A08;
            }
            throw new C24202BxE(C25792Cm4.A07);
        }
        throw AnonymousClass000.A0n("Bytes buffer must be direct");
    }

    public final void register(Service service) {
        C18070vi.A0d(service, 0);
        registerServiceNative(this.f3native.A00(), service.getHandle$fbandroid_java_com_facebook_wearable_datax_datax());
    }

    private final void handleRead(MessageInfo messageInfo) {
        C22821Di r0 = this.onRead;
        if (r0 != null) {
            r0.invoke(messageInfo);
        }
    }

    private final int handleWrite(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        AnonymousClass1OS r0 = this.writer;
        if (r0 != null) {
            return ((C25792Cm4) r0.invoke(byteBuffer, byteBuffer2)).A00;
        }
        throw AnonymousClass000.A0n("invalid connection configuration");
    }

    private final int handleWriteError(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        C25792Cm4 cm4;
        C36001nB r1 = this.onWriteError;
        if (r1 == null || (cm4 = (C25792Cm4) r1.invoke(new C25792Cm4(i), byteBuffer, byteBuffer2)) == null) {
            return i;
        }
        return cm4.A00;
    }

    public void close() {
        closeNative(this.f3native.A00());
        C27888DnP.A00.invoke();
    }

    public final boolean getClosed() {
        if (this.f3native.A01.get() == 0 || closedNative(this.f3native.A00())) {
            return true;
        }
        return false;
    }

    public final long getHandle() {
        return handleNative(this.f3native.A00());
    }

    public final int getMtu() {
        return mtuNative(this.f3native.A00());
    }

    public final C22821Di getOnRead() {
        return this.onRead;
    }

    public final C36001nB getOnWriteError() {
        return this.onWriteError;
    }

    public final CVI getReceiveFragment() {
        return this.receiveFragment;
    }

    public final int getVersion() {
        return versionNative(this.f3native.A00());
    }

    public final LocalChannel openChannel(int i) {
        return new LocalChannel(this, i);
    }

    public final void reset() {
        resetNative(this.f3native.A00());
    }

    public Connection(Long l, AnonymousClass1OS r7) {
        long j;
        this.writer = r7;
        ReferenceQueue referenceQueue = C27260Dam.A03;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.f3native = new C27260Dam(this, new C27446DfX(Companion, 4), allocateNative(j));
        this.receiveFragment = new CVI(this);
    }

    public final void setOnRead(C22821Di r1) {
        this.onRead = r1;
    }

    public final void setOnWriteError(C36001nB r1) {
        this.onWriteError = r1;
    }

    public Connection(long j) {
        this(Long.valueOf(j), (AnonymousClass1OS) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Connection(AnonymousClass1OS r2) {
        this((Long) null, r2);
        C18070vi.A0d(r2, 1);
    }
}
