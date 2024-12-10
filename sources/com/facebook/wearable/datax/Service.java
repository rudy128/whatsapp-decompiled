package com.facebook.wearable.datax;

import X.AnonymousClass1OS;
import X.C18070vi;
import X.C22821Di;
import X.C24589CAk;
import X.C24683CEx;
import X.C25527ChP;
import X.C27260Dam;
import X.C27888DnP;
import X.C27950Dom;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;

public class Service extends C24683CEx {
    public static final C24589CAk Companion = new Object();
    public static final String TAG = "DataXService";
    public final int id;

    /* renamed from: native  reason: not valid java name */
    public final C27260Dam f6native;
    public C22821Di onConnected;
    public C22821Di onDisconnected;
    public AnonymousClass1OS onReceived;

    private final native long allocateNative(int i);

    public static final native void deallocateNative(long j);

    public static /* synthetic */ void getNative$annotations() {
    }

    private final native long handleNative(long j);

    private final native void unregisterNative(long j);

    public void onConnected(RemoteChannel remoteChannel) {
    }

    public void onDisconnected(RemoteChannel remoteChannel) {
    }

    public void onReceived(RemoteChannel remoteChannel, C25527ChP chP) {
    }

    public void onUnregister() {
    }

    private final void handleConnected(RemoteChannel remoteChannel) {
        C22821Di r0 = this.onConnected;
        if (r0 != null) {
            r0.invoke(remoteChannel);
        }
    }

    private final void handleDisconnected(RemoteChannel remoteChannel) {
        C22821Di r0 = this.onDisconnected;
        if (r0 != null) {
            r0.invoke(remoteChannel);
        }
        ReferenceQueue referenceQueue = C27260Dam.A03;
        C27888DnP.A00.invoke();
    }

    public final long getHandle$fbandroid_java_com_facebook_wearable_datax_datax() {
        return handleNative(this.f6native.A00());
    }

    public final int getId() {
        return this.id;
    }

    public final C22821Di getOnConnected() {
        return this.onConnected;
    }

    public final C22821Di getOnDisconnected() {
        return this.onDisconnected;
    }

    public final AnonymousClass1OS getOnReceived() {
        return this.onReceived;
    }

    public final void unregister() {
        unregisterNative(this.f6native.A00());
        C27888DnP.A00.invoke();
    }

    public Service(int i) {
        this.id = i;
        ReferenceQueue referenceQueue = C27260Dam.A03;
        this.f6native = new C27260Dam(this, new C27950Dom(this), allocateNative(i));
    }

    private final void handleReceived(RemoteChannel remoteChannel, int i, ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        C18070vi.A0X(asReadOnlyBuffer);
        C25527ChP chP = new C25527ChP(i, asReadOnlyBuffer);
        try {
            ByteBuffer byteBuffer2 = chP.A00;
            if (byteBuffer2 != null) {
                byteBuffer2.rewind();
            }
            AnonymousClass1OS r0 = this.onReceived;
            if (r0 != null) {
                r0.invoke(remoteChannel, chP);
            }
        } finally {
            chP.A00 = null;
        }
    }

    public final void setOnConnected(C22821Di r1) {
        this.onConnected = r1;
    }

    public final void setOnDisconnected(C22821Di r1) {
        this.onDisconnected = r1;
    }

    public final void setOnReceived(AnonymousClass1OS r1) {
        this.onReceived = r1;
    }
}
