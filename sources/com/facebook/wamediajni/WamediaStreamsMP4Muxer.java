package com.facebook.wamediajni;

import X.AnonymousClass2VV;
import X.AnonymousClass3Ea;
import X.C54052dW;
import X.C71193Eh;
import X.CSX;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

public class WamediaStreamsMP4Muxer {
    public boolean A00;
    public final CSX A01;
    public final String A02;
    public final NativeWrapper mNativeWrapper = new NativeWrapper(this);

    public class NativeWrapper {
        public volatile long mNativeContext;

        private native void nativeFinalize();

        public native void nativeInit(String str);

        public native int nativeSetAudioMediaFormat(MediaFormat mediaFormat);

        public native int nativeSetOrientationHint(int i);

        public native int nativeSetVideoMediaFormat(MediaFormat mediaFormat);

        public native int nativeStart();

        public native int nativeStop();

        public native int nativeWriteAudioSampleData(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        public native int nativeWriteVideoSampleData(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        public NativeWrapper(Object obj) {
            C54052dW r2 = AnonymousClass2VV.A00;
            C71193Eh r1 = new C71193Eh(this, obj, r2.A01);
            synchronized (r2) {
                if (!r2.A02.add(r1)) {
                    throw new IllegalStateException((String) null);
                } else if (!r2.A00) {
                    r2.A00 = true;
                    new AnonymousClass3Ea(r2).start();
                }
            }
        }

        public void targetDestructed() {
            try {
                nativeFinalize();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.wamediajni.WamediaStreamsMP4Muxer initialize() {
        /*
            r6 = this;
            X.CSX r4 = r6.A01
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            java.lang.Boolean r0 = r4.A00     // Catch:{ all -> 0x0068 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0011
            boolean r1 = r4.A02     // Catch:{ all -> 0x0068 }
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            goto L_0x005b
        L_0x0011:
            r5 = 0
            java.util.List r0 = r4.A01     // Catch:{ UnsatisfiedLinkError -> 0x0047, all -> 0x0030 }
            if (r0 == 0) goto L_0x0028
            java.util.Iterator r1 = r0.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x0047, all -> 0x0030 }
        L_0x001a:
            boolean r0 = r1.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x0047, all -> 0x0030 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0047, all -> 0x0030 }
            X.AnonymousClass1A8.A06(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0047, all -> 0x0030 }
            goto L_0x001a
        L_0x0028:
            r0 = 1
            r4.A02 = r0     // Catch:{ UnsatisfiedLinkError -> 0x0047, all -> 0x0030 }
            r1 = 1
            r0 = 0
            r4.A01 = r0     // Catch:{ UnsatisfiedLinkError -> 0x0047, all -> 0x0030 }
            goto L_0x0054
        L_0x0030:
            r2 = move-exception
            java.lang.String r1 = "com.facebook.soloader.NativeLibrary"
            java.lang.String r0 = "Failed to load native lib (other error): "
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "Failed loading libraries"
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0068 }
            r0.<init>(r1)     // Catch:{ all -> 0x0068 }
            r4.A04 = r0     // Catch:{ all -> 0x0068 }
            java.lang.UnsatisfiedLinkError r0 = r4.A04     // Catch:{ all -> 0x0068 }
            r0.initCause(r2)     // Catch:{ all -> 0x0068 }
            goto L_0x0051
        L_0x0047:
            r2 = move-exception
            java.lang.String r1 = "com.facebook.soloader.NativeLibrary"
            java.lang.String r0 = "Failed to load native lib (initial check): "
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0068 }
            r4.A04 = r2     // Catch:{ all -> 0x0068 }
        L_0x0051:
            r4.A02 = r5     // Catch:{ all -> 0x0068 }
            r1 = 0
        L_0x0054:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0068 }
            r4.A00 = r0     // Catch:{ all -> 0x0068 }
            goto L_0x000f
        L_0x005b:
            if (r1 == 0) goto L_0x0065
            com.facebook.wamediajni.WamediaStreamsMP4Muxer$NativeWrapper r1 = r6.mNativeWrapper
            java.lang.String r0 = r6.A02
            r1.nativeInit(r0)
            return r6
        L_0x0065:
            java.lang.UnsatisfiedLinkError r0 = r4.A04
            throw r0
        L_0x0068:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wamediajni.WamediaStreamsMP4Muxer.initialize():com.facebook.wamediajni.WamediaStreamsMP4Muxer");
    }

    public WamediaStreamsMP4Muxer(CSX csx, String str) {
        this.A01 = csx;
        this.A02 = str;
    }
}
