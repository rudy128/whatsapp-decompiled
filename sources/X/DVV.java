package X;

import java.util.concurrent.Callable;

public class DVV implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public DVV(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0236, code lost:
        r7.CI8(0, 0, 4);
        r6.A0P.CDC(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010b, code lost:
        if (r8 >= r1) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0124, code lost:
        r0 = -6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0127;
                case 2: goto L_0x019b;
                case 3: goto L_0x0050;
                case 4: goto L_0x01b7;
                case 5: goto L_0x010f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A02
            X.DRB r2 = (X.DRB) r2
            int r1 = r14.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0F
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0124
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r2.A0E
            r0.setScaleType(r1)
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x001d:
            return r5
        L_0x001e:
            java.lang.Object r4 = r14.A02
            X.DEs r4 = (X.C26810DEs) r4
            int r3 = r14.A01
            r0 = 30
            r2 = 0
            r1 = 0
            X.C26175Cts.A01(r1, r0, r2)
            android.hardware.Camera r5 = android.hardware.Camera.open(r3)
            r0 = 31
            X.C26175Cts.A01(r1, r0, r2)
            X.CXw r3 = r4.A0b
            if (r3 == 0) goto L_0x001d
            X.Cqv r0 = r4.A0R
            java.lang.String r2 = r0.A02()
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001d
            r1 = 6
            X.AkJ r0 = new X.AkJ
            r0.<init>(r1, r2, r3)
            X.C26078Crs.A00(r0)
            return r5
        L_0x0050:
            java.lang.Object r4 = r14.A02
            X.DEr r4 = (X.C26809DEr) r4
            int r5 = r14.A01
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x0018
            X.CvG r3 = r4.A0V
            X.Ca9 r1 = r3.A0I
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0018
            X.CvD r7 = r4.A08
            if (r7 == 0) goto L_0x0018
            X.CjI r1 = r7.A08
            X.BUs r0 = r7.A06
            X.BUt r10 = r7.A07
            android.graphics.Rect r6 = r7.A05
            android.graphics.Rect r2 = r7.A04
            java.util.List r9 = r7.A0A
            if (r0 == 0) goto L_0x0089
            if (r10 == 0) goto L_0x0089
            if (r1 == 0) goto L_0x0089
            if (r9 == 0) goto L_0x0089
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0090
            java.util.List r0 = r7.A09
            if (r0 != 0) goto L_0x0090
        L_0x0089:
            X.CvD r0 = r4.A08
            int r0 = r0.A07()
            goto L_0x0019
        L_0x0090:
            if (r2 == 0) goto L_0x0089
            if (r6 == 0) goto L_0x0089
            int r0 = r7.A03
            int r1 = java.lang.Math.max(r5, r0)
            int r0 = r7.A02
            int r5 = java.lang.Math.min(r1, r0)
            int r0 = r7.A07()
            if (r5 == r0) goto L_0x0089
            float r11 = (float) r5
            int r0 = r7.A03
            float r12 = (float) r0
            int r0 = r7.A02
            float r8 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = X.C26223CvD.A01(r11, r12, r8, r1, r0)
            float r8 = r7.A05()
            float r1 = r7.A01
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0104
            r13 = 1
        L_0x00c4:
            int r0 = r7.A03
            float r12 = (float) r0
            int r0 = r7.A02
            float r8 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = X.C26223CvD.A01(r11, r12, r8, r1, r0)
            X.CKJ r1 = X.C25971Cpe.A11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.C26128Csq.A00(r10, r1, r0)
            X.CKJ r1 = X.C25971Cpe.A0t
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            X.C26128Csq.A00(r10, r1, r0)
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x00f2
            float r1 = X.BE9.A05(r9, r5)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            X.C26223CvD.A02(r6, r2, r1)
        L_0x00f2:
            android.os.Handler r2 = r7.A0E
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0 = 1
            android.os.Message r0 = r2.obtainMessage(r0, r5, r0, r1)
            r2.sendMessage(r0)
            X.C26223CvD.A03(r4, r3)
            goto L_0x0089
        L_0x0104:
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x010d
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r13 = 2
            if (r0 < 0) goto L_0x00c4
        L_0x010d:
            r13 = 0
            goto L_0x00c4
        L_0x010f:
            java.lang.Object r2 = r14.A02
            X.DRB r2 = (X.DRB) r2
            int r1 = r14.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0F
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0124
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r2.A0E
            r0.useLanczosFilter(r1)
            goto L_0x0018
        L_0x0124:
            r0 = -6
            goto L_0x0019
        L_0x0127:
            java.lang.Object r4 = r14.A02
            X.DEs r4 = (X.C26810DEs) r4
            int r1 = r14.A01
            java.lang.String r0 = "Can not update preview display rotation"
            r4.A0C(r0)
            r4.A01 = r1
            android.hardware.Camera r0 = r4.A0a
            X.C28111Yx.A02(r0)
            X.EAW r0 = r4.A0c
            if (r0 != 0) goto L_0x016c
            android.hardware.Camera r1 = r4.A0a
            int r0 = r4.A01
            int r0 = X.C26810DEs.A00(r4, r0)
            r1.setDisplayOrientation(r0)
        L_0x0148:
            X.Cpe r3 = r4.BZ5()
            X.CKJ r0 = X.C25971Cpe.A0q
            java.lang.Object r0 = X.BE7.A0b(r0, r3)
            X.Csv r0 = (X.C26132Csv) r0
            int r1 = r0.A02
            int r0 = r0.A01
            X.C26810DEs.A08(r4, r1, r0)
            int r2 = r4.A00
            X.CjI r1 = r4.BOK()
            X.CPb r0 = new X.CPb
            r0.<init>(r1, r3, r2)
            X.Chu r5 = new X.Chu
            r5.<init>(r0)
            return r5
        L_0x016c:
            X.EAW r0 = r4.A0c
            boolean r0 = r0.CSA()
            android.hardware.Camera r1 = r4.A0a
            if (r0 == 0) goto L_0x0198
            r0 = 0
        L_0x0177:
            int r0 = X.C26810DEs.A00(r4, r0)
            r1.setDisplayOrientation(r0)
            X.EAW r3 = r4.A0c
            int r2 = r4.A01
            r0 = 1
            if (r2 == r0) goto L_0x0195
            r0 = 2
            if (r2 == r0) goto L_0x0192
            r1 = 3
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 == r1) goto L_0x018e
            r0 = 0
        L_0x018e:
            r3.Bnd(r0)
            goto L_0x0148
        L_0x0192:
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x018e
        L_0x0195:
            r0 = 90
            goto L_0x018e
        L_0x0198:
            int r0 = r4.A01
            goto L_0x0177
        L_0x019b:
            java.lang.Object r2 = r14.A02
            X.DEs r2 = (X.C26810DEs) r2
            int r1 = r14.A01
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r2.A0f
            if (r0 == 0) goto L_0x01b5
            X.Cy7 r0 = r2.A0N
            r0.A00(r1)
        L_0x01b0:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            return r5
        L_0x01b5:
            r1 = 0
            goto L_0x01b0
        L_0x01b7:
            java.lang.Object r6 = r14.A02
            X.DHc r6 = (X.C26871DHc) r6
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x01cd
            r0 = -4
        L_0x01c0:
            android.os.Process.setThreadPriority(r0)
            X.DcC r4 = r6.A06
            boolean r0 = r4.mEnableThreadLockSync
            if (r0 == 0) goto L_0x01d0
            r4.lock()
            goto L_0x01d0
        L_0x01cd:
            int r0 = r14.A01
            goto L_0x01c0
        L_0x01d0:
            boolean r0 = r6.A0R     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x0242
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0247 }
            boolean r0 = r0.isInterrupted()     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x0242
            boolean r0 = r4.mEnableThreadLockSync     // Catch:{ all -> 0x0247 }
            if (r0 == 0) goto L_0x01e7
            boolean r0 = r6.A0T     // Catch:{ all -> 0x0247 }
            if (r0 == 0) goto L_0x01e7
            goto L_0x0242
        L_0x01e7:
            X.EAS r2 = r6.A0P     // Catch:{ all -> 0x0247 }
            int r0 = r6.A0D     // Catch:{ all -> 0x0247 }
            long r0 = (long) r0     // Catch:{ all -> 0x0247 }
            X.DH2 r7 = r2.BIR(r0)     // Catch:{ all -> 0x0247 }
            if (r7 == 0) goto L_0x01d0
            X.EAS r0 = r6.A0P     // Catch:{ all -> 0x0247 }
            boolean r0 = r0.CMT()     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x0236
            java.nio.ByteBuffer r1 = r7.BNu()     // Catch:{ all -> 0x0247 }
            r0 = 0
            if (r1 == 0) goto L_0x0226
            X.EAd r0 = r6.A0O     // Catch:{ all -> 0x0247 }
            int r5 = r0.CDT(r1)     // Catch:{ all -> 0x0247 }
            X.EAd r0 = r6.A0O     // Catch:{ all -> 0x0247 }
            long r2 = r0.BYW()     // Catch:{ all -> 0x0247 }
            long r0 = r6.A0N     // Catch:{ all -> 0x0247 }
            long r2 = r2 - r0
            if (r5 <= 0) goto L_0x0236
            X.EAd r0 = r6.A0O     // Catch:{ all -> 0x0247 }
            int r0 = r0.BYU()     // Catch:{ all -> 0x0247 }
            r7.CI8(r5, r2, r0)     // Catch:{ all -> 0x0247 }
            X.EAS r0 = r6.A0P     // Catch:{ all -> 0x0247 }
            r0.CDC(r7)     // Catch:{ all -> 0x0247 }
            X.EAd r0 = r6.A0O     // Catch:{ all -> 0x0247 }
            r0.BBv()     // Catch:{ all -> 0x0247 }
            goto L_0x01d0
        L_0x0226:
            java.lang.String r2 = "extractVideoFrame: byteBuffer cannot be null"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0247 }
            java.lang.String r0 = "VideoDemuxDecodeWrapperTag"
            X.CAF.A00(r0, r2, r1)     // Catch:{ all -> 0x0247 }
            java.lang.String r0 = "byteBuffer cannot be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0247 }
            throw r0     // Catch:{ all -> 0x0247 }
        L_0x0236:
            r0 = 0
            r3 = 4
            r2 = 0
            r7.CI8(r2, r0, r3)     // Catch:{ all -> 0x0247 }
            X.EAS r0 = r6.A0P     // Catch:{ all -> 0x0247 }
            r0.CDC(r7)     // Catch:{ all -> 0x0247 }
        L_0x0242:
            r4.close()
            r5 = 0
            return r5
        L_0x0247:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x024c }
            throw r1
        L_0x024c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DVV.call():java.lang.Object");
    }
}
