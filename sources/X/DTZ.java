package X;

import java.util.concurrent.CountDownLatch;

public class DTZ implements Runnable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    public DTZ(DHE dhe, CountDownLatch countDownLatch, long j) {
        this.A00 = 0;
        this.A03 = dhe;
        this.A01 = 0;
        this.A02 = j;
        this.A04 = countDownLatch;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cf, code lost:
        if (r7 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0104;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r15.A03
            X.2r7 r3 = (X.C62262r7) r3
            int r14 = r15.A01
            java.lang.Object r4 = r15.A04
            X.206 r4 = (X.AnonymousClass206) r4
            long r0 = r15.A02
            X.00H r2 = r3.A02
            java.lang.Object r6 = r2.get()
            X.2q2 r6 = (X.C61652q2) r6
            r10 = 0
            java.lang.String r12 = X.C61652q2.A00(r6)
            X.205 r2 = r4.A0v
            X.1BI r5 = r2.A00
            X.00H r2 = r6.A04
            java.lang.Object r2 = r2.get()
            X.2sb r2 = (X.C63152sb) r2
            int r2 = r2.A02(r5)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            android.os.Parcelable$Creator r2 = X.AnonymousClass1EC.CREATOR
            X.1EC r5 = X.C42941yz.A00(r5)
            if (r5 == 0) goto L_0x004a
            X.1PU r2 = r6.A01
            X.1MZ r2 = r2.A01
            boolean r2 = r2.A0K(r5)
            boolean r2 = X.AnonymousClass000.A1O(r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
        L_0x004a:
            X.00H r2 = r6.A03
            java.lang.Object r2 = r2.get()
            X.2r5 r2 = (X.C62242r5) r2
            int r2 = r2.A01(r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            X.22C r0 = X.C63892tr.A03(r4)
            if (r0 == 0) goto L_0x007c
            X.205 r0 = r0.A0v
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.A02
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x006e:
            r13 = 40
            X.8rf r2 = X.C181749Rr.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.18K r1 = r3.A00
            X.0vt r0 = X.C62262r7.A03
            r1.CC6(r2, r0)
            return
        L_0x007c:
            r7 = 0
            goto L_0x006e
        L_0x007e:
            java.lang.Object r0 = r15.A03     // Catch:{ all -> 0x00fb }
            X.DHE r0 = (X.DHE) r0     // Catch:{ all -> 0x00fb }
            java.util.Map r1 = r0.A0L     // Catch:{ all -> 0x00fb }
            int r0 = r15.A01     // Catch:{ all -> 0x00fb }
            java.lang.Object r6 = X.AnonymousClass000.A0w(r1, r0)     // Catch:{ all -> 0x00fb }
            X.DE3 r6 = (X.DE3) r6     // Catch:{ all -> 0x00fb }
            X.C26159CtX.A01(r6)     // Catch:{ all -> 0x00fb }
            long r4 = r15.A02     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "displayFrame"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00f6 }
            X.ClC r3 = r6.A0G     // Catch:{ all -> 0x00f6 }
            monitor-enter(r3)     // Catch:{ all -> 0x00f6 }
            X.CWt r2 = r6.A0K     // Catch:{ all -> 0x00f3 }
            X.EAJ r7 = r6.A07     // Catch:{ all -> 0x00f3 }
            if (r2 == 0) goto L_0x00c8
            if (r7 == 0) goto L_0x00d1
            boolean r0 = r6.A0B     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00d8
            r0 = 0
            r6.A0B = r0     // Catch:{ all -> 0x00f3 }
            r2.A00()     // Catch:{ all -> 0x00c3 }
            X.Ct3 r6 = r2.A01     // Catch:{ all -> 0x00c3 }
            android.opengl.EGLSurface r1 = r2.A00     // Catch:{ all -> 0x00c3 }
            android.opengl.EGLDisplay r0 = r6.A04     // Catch:{ all -> 0x00c3 }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r1, r4)     // Catch:{ all -> 0x00c3 }
            android.opengl.EGLSurface r2 = r2.A00     // Catch:{ all -> 0x00c3 }
            java.lang.Object r1 = r6.A07     // Catch:{ all -> 0x00c3 }
            monitor-enter(r1)     // Catch:{ all -> 0x00c3 }
            android.opengl.EGLDisplay r0 = r6.A04     // Catch:{ all -> 0x00c0 }
            android.opengl.EGL14.eglSwapBuffers(r0, r2)     // Catch:{ all -> 0x00c0 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c0 }
            goto L_0x00e4
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c0 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            r7.Big()     // Catch:{ all -> 0x00f3 }
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x00c8:
            X.CjS r1 = r6.A0F     // Catch:{ all -> 0x00f3 }
            X.C0H r0 = X.C0H.A0d     // Catch:{ all -> 0x00f3 }
            r1.A00(r0)     // Catch:{ all -> 0x00f3 }
            if (r7 != 0) goto L_0x00d8
        L_0x00d1:
            X.CjS r1 = r6.A0F     // Catch:{ all -> 0x00f3 }
            X.C0H r0 = X.C0H.A0c     // Catch:{ all -> 0x00f3 }
            r1.A00(r0)     // Catch:{ all -> 0x00f3 }
        L_0x00d8:
            boolean r0 = r6.A0B     // Catch:{ all -> 0x00f3 }
            if (r0 != 0) goto L_0x00e7
            X.CjS r1 = r6.A0F     // Catch:{ all -> 0x00f3 }
            X.C0H r0 = X.C0H.A0b     // Catch:{ all -> 0x00f3 }
            r1.A00(r0)     // Catch:{ all -> 0x00f3 }
            goto L_0x00e7
        L_0x00e4:
            r7.Big()     // Catch:{ all -> 0x00f3 }
        L_0x00e7:
            monitor-exit(r3)     // Catch:{ all -> 0x00f3 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00fb }
            java.lang.Object r0 = r15.A04
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f3 }
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r1 = move-exception
            java.lang.Object r0 = r15.A04
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            throw r1
        L_0x0104:
            java.lang.Object r6 = r15.A03
            X.2qF r6 = (X.C61782qF) r6
            java.lang.Object r5 = r15.A04
            X.1BI r5 = (X.AnonymousClass1BI) r5
            long r3 = r15.A02
            int r0 = r15.A01
            X.1Rj r2 = r6.A09
            com.whatsapp.jid.GroupJid r1 = r2.A08(r5, r0, r3)
            r0 = 1
            r2.A0D(r5, r0)
            if (r1 == 0) goto L_0x0121
            X.1mk r0 = r6.A04
            r0.A00(r1)
        L_0x0121:
            X.1mk r0 = r6.A04
            r0.A00(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DTZ.run():void");
    }

    public DTZ(Object obj, Object obj2, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = j;
        this.A01 = i;
    }
}
