package X;

import java.util.concurrent.Callable;

public class DVY implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DVY(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0341, code lost:
        if (r1 == 1) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04ef, code lost:
        if (r8 == 1) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0780, code lost:
        if (r1 == null) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0833, code lost:
        if (r0 != false) goto L_0x0835;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0835, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r19 = this;
            r4 = r19
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x022c;
                case 1: goto L_0x023b;
                case 2: goto L_0x0014;
                case 3: goto L_0x0260;
                case 4: goto L_0x00d8;
                case 5: goto L_0x027f;
                case 6: goto L_0x028e;
                case 7: goto L_0x010a;
                case 8: goto L_0x02e8;
                case 9: goto L_0x0149;
                case 10: goto L_0x05c5;
                case 11: goto L_0x01b6;
                case 12: goto L_0x0312;
                case 13: goto L_0x058e;
                case 14: goto L_0x020e;
                case 15: goto L_0x0598;
                case 16: goto L_0x06a2;
                case 17: goto L_0x07ad;
                case 18: goto L_0x07f8;
                case 19: goto L_0x081a;
                case 20: goto L_0x0837;
                case 21: goto L_0x0848;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r4.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r4.A02
            com.whatsapp.voipcalling.camera.VoipCamera r0 = (com.whatsapp.voipcalling.camera.VoipCamera) r0
            java.lang.Integer r6 = r1.m75lambda$registerVirtualCamera$6$comwhatsappvoipcallingcameraVoipPhysicalCamera(r0)
        L_0x0013:
            return r6
        L_0x0014:
            java.lang.Object r1 = r4.A01
            X.DEs r1 = (X.C26810DEs) r1
            java.lang.Object r8 = r4.A02
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            boolean r0 = r1.isConnected()
            r6 = 0
            if (r0 == 0) goto L_0x0013
            X.C26810DEs.A06(r1)
            X.CkL r4 = r1.A0J
            r0 = 2
            X.DEK r3 = new X.DEK
            r3.<init>(r1, r0)
            X.CnB r1 = r4.A06
            java.lang.String r0 = "Focus requests must be on the Optic thread. "
            r1.A06(r0)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0013
            X.Cav r9 = r4.A05
            int r0 = r4.A00
            X.CjI r1 = r9.A01(r0)
            X.CKI r0 = X.C25632CjI.A0V
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x005d
            int r0 = r4.A00
            X.BUu r5 = r9.A00(r0)
            java.util.ArrayList r2 = X.C26170Ctm.A01(r8)
            X.Csq r1 = r5.A00
            X.CKJ r0 = X.C25971Cpe.A0f
            r1.A04(r0, r2)
            r5.A02()
        L_0x005d:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0013
            int r0 = r4.A00
            X.CjI r1 = r9.A01(r0)
            X.CKI r2 = X.C25632CjI.A0U
            boolean r0 = X.BE9.A1T(r2, r1)
            if (r0 != 0) goto L_0x0077
            X.CKI r0 = X.C25632CjI.A05
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x0013
        L_0x0077:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0083
            android.hardware.Camera r0 = r4.A01
            X.C28111Yx.A02(r0)
            r0.cancelAutoFocus()
        L_0x0083:
            r1 = 0
            r4.A07 = r1
            r7 = 1
            r4.A08 = r7
            r4.A0A = r1
            int r0 = r4.A00
            X.BUu r5 = r9.A00(r0)
            int r0 = r4.A00
            X.CjI r0 = r9.A01(r0)
            boolean r0 = X.BE9.A1T(r2, r0)
            if (r0 == 0) goto L_0x00d2
            java.util.ArrayList r2 = X.C26170Ctm.A01(r8)
            X.Csq r1 = r5.A00
            X.CKJ r0 = X.C25971Cpe.A0C
            r1.A04(r0, r2)
            int r1 = r8.centerX()
            int r0 = r8.centerY()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r0)
        L_0x00b5:
            X.CKJ r0 = X.C25971Cpe.A0D
            X.C26128Csq.A02(r0, r5, r7)
            r5.A02()
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            X.E4g r0 = r4.A02
            X.C25690CkL.A00(r2, r0, r4, r1)
            android.hardware.Camera r1 = r4.A01
            X.C28111Yx.A02(r1)
            X.Cy5 r0 = new X.Cy5
            r0.<init>(r2, r3, r4)
            r1.autoFocus(r0)
            return r6
        L_0x00d2:
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r1)
            goto L_0x00b5
        L_0x00d8:
            java.lang.Object r3 = r4.A01
            X.DEs r3 = (X.C26810DEs) r3
            java.lang.Object r2 = r4.A02
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            boolean r0 = r3.isConnected()
            r6 = 0
            if (r0 == 0) goto L_0x0013
            X.CjI r1 = r3.BOK()
            X.CKI r0 = X.C25632CjI.A0V
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x0013
            int r1 = r3.A00
            X.Cav r0 = r3.A0O
            X.BUu r3 = r0.A00(r1)
            java.util.ArrayList r2 = X.C26170Ctm.A01(r2)
            X.Csq r1 = r3.A00
            X.CKJ r0 = X.C25971Cpe.A0f
            r1.A04(r0, r2)
            r3.A02()
            return r6
        L_0x010a:
            java.lang.Object r5 = r4.A01
            X.DEs r5 = (X.C26810DEs) r5
            X.CWY r1 = r5.A0K
            java.lang.Object r3 = r4.A02
            android.hardware.Camera r3 = (android.hardware.Camera) r3
            r0 = 1
            r1.A00(r0, r3)
            r6 = 0
            r3.setPreviewTexture(r6)     // Catch:{ IOException -> 0x011d }
            goto L_0x0125
        L_0x011d:
            r2 = move-exception
            java.lang.String r1 = "Camera1Device"
            java.lang.String r0 = "Unable to remove the current SurfaceTexture"
            android.util.Log.e(r1, r0, r2)
        L_0x0125:
            X.CbQ r0 = r5.A0L
            r0.A01(r3)
            r3.release()
            X.CXw r3 = r5.A0b
            if (r3 == 0) goto L_0x0013
            X.Cqv r0 = r5.A0R
            java.lang.String r2 = r0.A02()
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0013
            r1 = 7
            X.AkJ r0 = new X.AkJ
            r0.<init>(r1, r2, r3)
            X.C26078Crs.A00(r0)
            return r6
        L_0x0149:
            java.lang.Object r1 = r4.A01
            X.DEr r1 = (X.C26809DEr) r1
            java.lang.Object r4 = r4.A02
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            boolean r0 = r1.isConnected()
            r6 = 0
            if (r0 == 0) goto L_0x0013
            X.CvG r2 = r1.A0V
            X.Ca9 r7 = r2.A0I
            java.lang.String r5 = "Can only check if the prepared on the Optic thread"
            r7.A01(r5)
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0013
            X.CvD r1 = r1.A08
            if (r1 == 0) goto L_0x0013
            r0 = 1
            android.hardware.camera2.params.MeteringRectangle[] r3 = new android.hardware.camera2.params.MeteringRectangle[r0]
            android.graphics.Rect r4 = r1.A08(r4)
            r0 = 1000(0x3e8, float:1.401E-42)
            android.hardware.camera2.params.MeteringRectangle r1 = new android.hardware.camera2.params.MeteringRectangle
            r1.<init>(r4, r0)
            r0 = 0
            r3[r0] = r1
            java.lang.String r0 = "Can only perform spot metering on the Optic thread"
            r7.A01(r0)
            r7.A01(r5)
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0013
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x0013
            android.hardware.camera2.CaptureRequest$Builder r0 = r2.A02
            if (r0 == 0) goto L_0x0013
            X.E9T r0 = r2.A08
            if (r0 == 0) goto L_0x0013
            X.CjI r1 = r2.A0E
            if (r1 == 0) goto L_0x0013
            X.CKI r0 = X.C25632CjI.A0V
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x0013
            X.EB1 r0 = r2.A0D
            X.C28111Yx.A02(r0)
            android.hardware.camera2.CaptureRequest$Builder r1 = r2.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            r1.set(r0, r3)
            X.E9T r1 = r2.A08
            android.hardware.camera2.CaptureRequest$Builder r0 = r2.A02
            android.hardware.camera2.CaptureRequest r0 = r0.build()
            r1.CKN(r0, r6)
            return r6
        L_0x01b6:
            java.lang.Object r5 = r4.A02     // Catch:{ Exception -> 0x01f5 }
            java.util.UUID r5 = (java.util.UUID) r5     // Catch:{ Exception -> 0x01f5 }
            java.lang.Object r3 = r4.A01     // Catch:{ Exception -> 0x01f5 }
            X.DEr r3 = (X.C26809DEr) r3     // Catch:{ Exception -> 0x01f5 }
            X.Cqv r2 = r3.A0a     // Catch:{ Exception -> 0x01f5 }
            java.util.UUID r0 = r2.A03     // Catch:{ Exception -> 0x01f5 }
            boolean r0 = X.AnonymousClass026.A00(r5, r0)     // Catch:{ Exception -> 0x01f5 }
            r1 = r0 ^ 1
            r6 = 0
            r0 = 24
            X.C26175Cts.A01(r6, r0, r1)     // Catch:{ Exception -> 0x01f5 }
            X.C26809DEr.A01(r3)     // Catch:{ Exception -> 0x01f5 }
            X.EAW r0 = r3.A0o     // Catch:{ Exception -> 0x01f5 }
            if (r0 == 0) goto L_0x01e3
            X.EAW r1 = r3.A0o     // Catch:{ Exception -> 0x01f5 }
            X.EAW r0 = r3.A0o     // Catch:{ Exception -> 0x01f5 }
            r0.Ba1()     // Catch:{ Exception -> 0x01f5 }
            r1.CEN()     // Catch:{ Exception -> 0x01f5 }
            r3.A0o = r6     // Catch:{ Exception -> 0x01f5 }
            r3.A0D = r6     // Catch:{ Exception -> 0x01f5 }
        L_0x01e3:
            r3.A0G = r6     // Catch:{ Exception -> 0x01f5 }
            r3.A0B = r6     // Catch:{ Exception -> 0x01f5 }
            java.util.UUID r0 = r2.A03
            boolean r0 = X.AnonymousClass026.A00(r5, r0)
            r1 = r0 ^ 1
            r0 = 25
            X.C26175Cts.A01(r6, r0, r1)
            return r6
        L_0x01f5:
            r2 = move-exception
            java.lang.Object r1 = r4.A02     // Catch:{ all -> 0x02d0 }
            java.util.UUID r1 = (java.util.UUID) r1     // Catch:{ all -> 0x02d0 }
            java.lang.Object r0 = r4.A01     // Catch:{ all -> 0x02d0 }
            X.DEr r0 = (X.C26809DEr) r0     // Catch:{ all -> 0x02d0 }
            X.Cqv r0 = r0.A0a     // Catch:{ all -> 0x02d0 }
            java.util.UUID r0 = r0.A03     // Catch:{ all -> 0x02d0 }
            boolean r0 = X.AnonymousClass026.A00(r1, r0)     // Catch:{ all -> 0x02d0 }
            r1 = r0 ^ 1
            r0 = 26
            X.C26175Cts.A01(r2, r0, r1)     // Catch:{ all -> 0x02d0 }
            throw r2     // Catch:{ all -> 0x02d0 }
        L_0x020e:
            java.lang.Object r0 = r4.A02     // Catch:{ all -> 0x021f }
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0     // Catch:{ all -> 0x021f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x021f }
            X.EAT r0 = (X.EAT) r0     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x069d
            r0.release()     // Catch:{ all -> 0x021f }
            goto L_0x069d
        L_0x021f:
            r2 = move-exception
            java.lang.Object r0 = r4.A01
            X.CvW r0 = (X.C26236CvW) r0
            android.os.Handler r1 = r0.A0D
            r0 = 7
            X.BE7.A18(r1, r2, r0)
            goto L_0x069d
        L_0x022c:
            java.lang.Object r0 = r4.A01
            X.DEs r0 = (X.C26810DEs) r0
            java.lang.Object r1 = r4.A02
            X.CWY r0 = r0.A0K
            X.CZh r0 = r0.A01
            r0.A01(r1)
            r6 = 0
            return r6
        L_0x023b:
            java.lang.Object r1 = r4.A01
            X.DEs r1 = (X.C26810DEs) r1
            java.lang.Object r4 = r4.A02
            X.Cpe r4 = (X.C25971Cpe) r4
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x069d
            X.CbQ r3 = r1.A0L
            android.hardware.Camera r2 = r1.A0a
            X.CKJ r0 = X.C25971Cpe.A0q
            java.lang.Object r1 = r4.A04(r0)
            X.Csv r1 = (X.C26132Csv) r1
            X.CKJ r0 = X.C25971Cpe.A0m
            int r0 = X.BEA.A09(r0, r4)
            r3.A02(r2, r1, r0)
            goto L_0x069d
        L_0x0260:
            java.lang.Object r3 = r4.A01
            X.DEs r3 = (X.C26810DEs) r3
            java.lang.Object r2 = r4.A02
            X.CXe r2 = (X.C25093CXe) r2
            java.lang.String r0 = "Cannot modify settings"
            r3.A0C(r0)
            int r0 = r3.A00
            X.Cav r1 = r3.A0O
            X.BUu r0 = r1.A00(r0)
            r0.A04(r2)
            int r0 = r3.A00
            X.Cpe r6 = r1.A02(r0)
            return r6
        L_0x027f:
            java.lang.Object r0 = r4.A01
            X.DEs r0 = (X.C26810DEs) r0
            java.lang.Object r1 = r4.A02
            X.CWY r0 = r0.A0K
            X.CZh r0 = r0.A01
            r0.A02(r1)
            r6 = 0
            return r6
        L_0x028e:
            java.lang.Object r5 = r4.A01
            X.DEs r5 = (X.C26810DEs) r5
            java.lang.Object r4 = r4.A02
            X.Cqv r2 = r5.A0R     // Catch:{ Exception -> 0x02b5 }
            java.util.UUID r0 = r2.A03     // Catch:{ Exception -> 0x02b5 }
            boolean r0 = X.AnonymousClass026.A00(r4, r0)     // Catch:{ Exception -> 0x02b5 }
            r1 = r0 ^ 1
            r6 = 0
            r0 = 24
            X.C26175Cts.A01(r6, r0, r1)     // Catch:{ Exception -> 0x02b5 }
            r5.A09()     // Catch:{ Exception -> 0x02b5 }
            java.util.UUID r0 = r2.A03
            boolean r0 = X.AnonymousClass026.A00(r4, r0)
            r1 = r0 ^ 1
            r0 = 25
            X.C26175Cts.A01(r6, r0, r1)
            return r6
        L_0x02b5:
            r2 = move-exception
            X.Cqv r0 = r5.A0R     // Catch:{ all -> 0x02c6 }
            java.util.UUID r0 = r0.A03     // Catch:{ all -> 0x02c6 }
            boolean r0 = X.AnonymousClass026.A00(r4, r0)     // Catch:{ all -> 0x02c6 }
            r1 = r0 ^ 1
            r0 = 26
            X.C26175Cts.A01(r2, r0, r1)     // Catch:{ all -> 0x02c6 }
            throw r2     // Catch:{ all -> 0x02c6 }
        L_0x02c6:
            r3 = move-exception
            X.Cqv r0 = r5.A0R
            java.util.UUID r0 = r0.A03
            boolean r0 = X.AnonymousClass026.A00(r4, r0)
            goto L_0x02df
        L_0x02d0:
            r3 = move-exception
            java.lang.Object r1 = r4.A02
            java.lang.Object r0 = r4.A01
            X.DEr r0 = (X.C26809DEr) r0
            X.Cqv r0 = r0.A0a
            java.util.UUID r0 = r0.A03
            boolean r0 = X.AnonymousClass026.A00(r1, r0)
        L_0x02df:
            r2 = r0 ^ 1
            r1 = 0
            r0 = 25
            X.C26175Cts.A01(r1, r0, r2)
            throw r3
        L_0x02e8:
            java.lang.Object r0 = r4.A01
            X.BUk r0 = (X.C22899BUk) r0
            java.lang.Object r1 = r4.A02
            X.Ckz r1 = (X.C25729Ckz) r1
            java.lang.Object r2 = r0.A01
            X.DEs r2 = (X.C26810DEs) r2
            X.CKM r0 = X.C25729Ckz.A07
            boolean r1 = X.BEA.A1Y(r0, r1)
            java.lang.String r0 = "Performing post photo capture on UI thread"
            X.C26078Crs.A01(r0)
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x069d
            if (r1 == 0) goto L_0x030a
            X.C26810DEs.A04(r2)
        L_0x030a:
            X.CV9 r1 = r2.A0M
            r0 = 0
            r1.A00(r0)
            goto L_0x069d
        L_0x0312:
            java.lang.Object r2 = r4.A01
            X.DEr r2 = (X.C26809DEr) r2
            X.BUs r0 = r2.A09
            if (r0 == 0) goto L_0x0587
            android.hardware.camera2.CaptureRequest$Builder r0 = r2.A07
            if (r0 == 0) goto L_0x0587
            android.hardware.camera2.CameraDevice r0 = r2.A0l
            if (r0 == 0) goto L_0x0587
            X.CjI r0 = r2.A0E
            if (r0 == 0) goto L_0x0587
            X.BUs r0 = r2.A09
            X.CKJ r8 = X.C25971Cpe.A0J
            boolean r7 = X.BEA.A1X(r8, r0)
            X.BUs r1 = r2.A09
            if (r1 == 0) goto L_0x0584
            X.CKJ r0 = X.C25971Cpe.A0e
            java.lang.Object r0 = r1.A04(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0584
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0584
        L_0x0343:
            X.BUs r3 = r2.A09
            X.CKJ r1 = X.C25971Cpe.A03
            boolean r6 = X.BEA.A1X(r1, r3)
            X.BUs r3 = r2.A09
            X.CKJ r9 = X.C25971Cpe.A0M
            boolean r11 = X.BEA.A1X(r9, r3)
            X.BUs r3 = r2.A09
            X.CKJ r12 = X.C25971Cpe.A02
            java.lang.Object r3 = r3.A04(r12)
            java.util.HashMap r3 = (java.util.HashMap) r3
            if (r3 == 0) goto L_0x057e
            java.util.HashMap r10 = X.BE6.A10(r3)
        L_0x0363:
            X.BUs r5 = r2.A09
            java.lang.Object r3 = r4.A02
            X.CXe r3 = (X.C25093CXe) r3
            boolean r3 = r5.A06(r3)
            if (r3 == 0) goto L_0x03a7
            X.CvG r5 = r2.A0V
            boolean r3 = r5.A0R
            if (r3 == 0) goto L_0x03a7
            X.EB1 r3 = r2.A0D
            r4 = 1
            if (r3 == 0) goto L_0x03af
            X.BUs r3 = r2.A09
            boolean r9 = X.BEA.A1X(r9, r3)
            X.BUs r3 = r2.A09
            java.lang.Object r3 = r3.A04(r12)
            java.util.HashMap r3 = (java.util.HashMap) r3
            if (r3 == 0) goto L_0x03aa
            java.util.HashMap r3 = X.BE6.A10(r3)
        L_0x038e:
            if (r11 != r9) goto L_0x03a7
            if (r11 == 0) goto L_0x03af
            if (r9 == 0) goto L_0x03af
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x03af
            X.C26809DEr.A06(r2, r4)
        L_0x039d:
            android.hardware.camera2.CameraDevice r0 = r2.A0l
            java.lang.String r1 = r0.getId()
            r0 = 0
            X.C26809DEr.A03(r2, r0, r1)
        L_0x03a7:
            X.BUs r6 = r2.A09
            return r6
        L_0x03aa:
            java.util.HashMap r3 = X.C17880vN.A11()
            goto L_0x038e
        L_0x03af:
            X.BUs r9 = r2.A09
            X.CKJ r3 = X.C25971Cpe.A0U
            boolean r3 = X.BEA.A1X(r3, r9)
            r2.A0p = r3
            X.BUs r9 = r2.A09
            X.CKJ r3 = X.C25971Cpe.A0Q
            boolean r3 = X.BEA.A1X(r3, r9)
            if (r3 == 0) goto L_0x03ce
            X.DEU r3 = r2.A0m
            if (r3 == 0) goto L_0x03ce
            X.Cc8 r9 = r2.A0T
            X.DEU r3 = r2.A0m
            r9.A03(r3)
        L_0x03ce:
            r5.A06()
            android.hardware.camera2.CaptureRequest$Builder r11 = r2.A07
            X.BUs r10 = r2.A09
            X.CjI r9 = r2.A0E
            r3 = 0
            X.C25315CdL.A01(r11, r10, r9, r3)
            android.hardware.camera2.CaptureRequest$Builder r10 = r2.A07
            X.BUs r9 = r2.A09
            X.CjI r3 = r2.A0E
            X.C25315CdL.A01(r10, r9, r3, r4)
            android.hardware.camera2.CaptureRequest$Builder r11 = r2.A07
            X.BUs r10 = r2.A09
            X.CjI r9 = r2.A0E
            r3 = 2
            X.C25315CdL.A01(r11, r10, r9, r3)
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A07
            X.BUs r11 = r2.A09
            X.CjI r10 = r2.A0E
            r9 = 3
            X.C25315CdL.A01(r12, r11, r10, r9)
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A07
            X.BUs r11 = r2.A09
            X.CjI r10 = r2.A0E
            r9 = 4
            X.C25315CdL.A01(r12, r11, r10, r9)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 5
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 6
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 7
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 8
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 9
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 10
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 11
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 12
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 13
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 14
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CaptureRequest$Builder r13 = r2.A07
            X.BUs r12 = r2.A09
            X.CjI r11 = r2.A0E
            r10 = 15
            X.C25315CdL.A01(r13, r12, r11, r10)
            android.hardware.camera2.CameraManager r13 = r2.A0O
            android.hardware.camera2.CameraDevice r10 = r2.A0l
            java.lang.String r17 = r10.getId()
            android.hardware.camera2.CaptureRequest$Builder r14 = r2.A07
            X.BUs r15 = r2.A09
            X.CjI r10 = r2.A0E
            r18 = 0
            r16 = r10
            X.C25315CdL.A00(r13, r14, r15, r16, r17, r18)
            android.hardware.camera2.CameraDevice r10 = r2.A0l
            java.lang.String r17 = r10.getId()
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A07
            X.BUs r11 = r2.A09
            X.CjI r10 = r2.A0E
            r14 = r12
            r15 = r11
            r16 = r10
            r18 = r4
            X.C25315CdL.A00(r13, r14, r15, r16, r17, r18)
            X.CjI r11 = r2.A0E
            X.CKI r10 = X.C25632CjI.A0F
            boolean r10 = X.BE9.A1T(r10, r11)
            if (r10 == 0) goto L_0x04b3
            X.BUs r11 = r2.A09
            X.CKJ r10 = X.C25971Cpe.A0l
            r11.A04(r10)
        L_0x04b3:
            X.BUs r12 = r5.A09
            if (r12 == 0) goto L_0x04c3
            X.DEU r11 = r5.A07
            if (r11 == 0) goto L_0x04c3
            X.CKJ r10 = X.C25971Cpe.A0S
            boolean r10 = X.BEA.A1X(r10, r12)
            r11.A0H = r10
        L_0x04c3:
            X.BUs r10 = r2.A09
            boolean r8 = X.BEA.A1X(r8, r10)
            if (r8 == r7) goto L_0x04dc
            X.C26809DEr.A06(r2, r4)
            android.hardware.camera2.CameraDevice r0 = r2.A0l
            java.lang.String r1 = r0.getId()
            r0 = 0
            X.C26809DEr.A03(r2, r0, r1)
            r2.A0q = r8
            goto L_0x03a7
        L_0x04dc:
            X.BUs r8 = r2.A09
            if (r8 == 0) goto L_0x054e
            X.CKJ r7 = X.C25971Cpe.A0e
            java.lang.Object r7 = r8.A04(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x054e
            int r8 = r7.intValue()
            r7 = 1
            if (r8 != r4) goto L_0x054e
        L_0x04f1:
            X.CjI r8 = r2.A0E
            boolean r8 = r8 instanceof X.C22904BUp
            if (r8 == 0) goto L_0x0550
            X.CmT r8 = r2.A0U
            boolean r8 = r8.A0F
            if (r8 != 0) goto L_0x0550
            X.CXb r8 = r2.A0W
            boolean r8 = r8.A0D
            if (r8 != 0) goto L_0x0550
            if (r7 == r0) goto L_0x0550
            X.CvD r0 = r2.A08
            if (r0 == 0) goto L_0x054c
            float r3 = r0.A06()
            java.lang.String r1 = "Google"
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r1.equalsIgnoreCase(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0521
            r0 = 1066443735(0x3f90a3d7, float:1.13)
            if (r7 == 0) goto L_0x054a
            r1 = 1066443735(0x3f90a3d7, float:1.13)
        L_0x0521:
            float r3 = r3 * r1
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
        L_0x0526:
            X.C26809DEr.A06(r2, r4)
            X.CjI r0 = r2.A0E
            X.BUp r0 = (X.C22904BUp) r0
            if (r7 != 0) goto L_0x0530
            r9 = -1
        L_0x0530:
            r0.A03(r9)
            android.hardware.camera2.CameraDevice r0 = r2.A0l
            java.lang.String r0 = r0.getId()
            r2.A0B(r0)
            X.C26809DEr.A02(r2)
            android.hardware.camera2.CameraDevice r0 = r2.A0l
            java.lang.String r0 = r0.getId()
            X.C26809DEr.A03(r2, r1, r0)
            goto L_0x03a7
        L_0x054a:
            float r1 = r1 / r0
            goto L_0x0521
        L_0x054c:
            r1 = 0
            goto L_0x0526
        L_0x054e:
            r7 = 0
            goto L_0x04f1
        L_0x0550:
            X.BUs r0 = r2.A09
            boolean r1 = X.BEA.A1X(r1, r0)
            X.CjI r0 = r2.A0E
            boolean r0 = r0 instanceof X.C22904BUp
            if (r0 == 0) goto L_0x0579
            if (r1 == r6) goto L_0x0579
            X.C26809DEr.A06(r2, r4)
            X.CjI r0 = r2.A0E
            X.BUp r0 = (X.C22904BUp) r0
            if (r1 != 0) goto L_0x0568
            r3 = -1
        L_0x0568:
            r0.A03(r3)
            android.hardware.camera2.CameraDevice r0 = r2.A0l
            java.lang.String r0 = r0.getId()
            r2.A0B(r0)
            X.C26809DEr.A02(r2)
            goto L_0x039d
        L_0x0579:
            r5.A05()
            goto L_0x03a7
        L_0x057e:
            java.util.HashMap r10 = X.C17880vN.A11()
            goto L_0x0363
        L_0x0584:
            r0 = 0
            goto L_0x0343
        L_0x0587:
            java.lang.String r0 = "Cannot modify settings, camera was closed."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            throw r1
        L_0x058e:
            java.lang.Object r6 = r4.A02
            X.DEx r6 = (X.C26815DEx) r6
            X.Caw r0 = r6.A00
            r0.A01()
            return r6
        L_0x0598:
            java.lang.Object r0 = r4.A02
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.lang.Object r3 = r0.get()
            X.EAT r3 = (X.EAT) r3
            r0 = 0
            java.lang.String r2 = "scheduleReleaseDemuxDecodeWrapper: demuxDecodeWrapper.release"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x05b1 }
            java.lang.String r0 = "MultipleTrackCoordinatorRealtime"
            X.CAF.A00(r0, r2, r1)     // Catch:{ all -> 0x05b1 }
            r3.release()     // Catch:{ all -> 0x05b1 }
            goto L_0x069d
        L_0x05b1:
            r3 = move-exception
            java.lang.Object[] r2 = X.BE7.A1b(r3)
            java.lang.String r1 = "scheduleReleaseDemuxDecodeWrapper: Throwable=%s"
            java.lang.String r0 = "MultipleTrackCoordinatorRealtime"
            X.CAF.A00(r0, r1, r2)
            java.lang.String r0 = "async release failed"
            X.C2Z r1 = new X.C2Z
            r1.<init>(r0, r3)
            throw r1
        L_0x05c5:
            java.lang.Object r5 = r4.A01
            X.DEr r5 = (X.C26809DEr) r5
            java.lang.Object r2 = r4.A02
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            float[] r11 = X.C108945cZ.A1V()
            int r0 = r2.centerX()
            float r1 = (float) r0
            r0 = 0
            r11[r0] = r1
            int r0 = r2.centerY()
            float r0 = (float) r0
            r6 = 1
            r11[r6] = r0
            android.graphics.Matrix r0 = r5.A05
            if (r0 == 0) goto L_0x05f1
            android.graphics.Matrix r1 = X.C108945cZ.A0J()
            android.graphics.Matrix r0 = r5.A05
            r0.invert(r1)
            r1.mapPoints(r11)
        L_0x05f1:
            X.Cc8 r9 = r5.A0T
            boolean r12 = r5.A0K
            android.hardware.camera2.CaptureRequest$Builder r8 = r5.A07
            X.EB1 r3 = r5.A0D
            X.DEU r10 = r5.A0m
            X.Ca9 r1 = r9.A0A
            java.lang.String r0 = "Cannot perform focus, not on Optic thread."
            r1.A01(r0)
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x069d
            X.CK9 r0 = r9.A03
            X.C28111Yx.A02(r0)
            X.DEr r0 = r0.A00
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x069d
            X.CvG r0 = r9.A04
            if (r0 == 0) goto L_0x069d
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x069d
            if (r8 == 0) goto L_0x069d
            if (r10 == 0) goto L_0x069d
            X.CjI r1 = r9.A07
            X.C28111Yx.A02(r1)
            X.CKI r0 = X.C25632CjI.A0U
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x069d
            if (r3 == 0) goto L_0x069d
            X.CvD r0 = r9.A05
            if (r0 == 0) goto L_0x069d
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x069d
            X.CvG r0 = r9.A04
            X.E9T r3 = r0.A08
            if (r3 == 0) goto L_0x069d
            r9.A00()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r9.A04(r0, r11)
            android.hardware.camera2.params.MeteringRectangle[] r5 = new android.hardware.camera2.params.MeteringRectangle[r6]
            X.CvD r0 = r9.A05
            android.graphics.Rect r2 = r0.A08(r2)
            r1 = 1000(0x3e8, float:1.401E-42)
            android.hardware.camera2.params.MeteringRectangle r0 = new android.hardware.camera2.params.MeteringRectangle
            r0.<init>(r2, r1)
            r4 = 0
            r5[r4] = r0
            r0 = 0
            r10.A04 = r0
            X.DEQ r7 = new X.DEQ
            r7.<init>(r8, r9, r10, r11, r12)
            r10.A05 = r7
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r8.set(r0, r2)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r8.set(r0, r5)
            r9.A0C = r6
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = 2
            X.BE7.A14(r8, r1, r0)
            android.hardware.camera2.CaptureRequest r0 = r8.build()
            r3.BEY(r0, r10)
            X.BE7.A14(r8, r1, r4)
            android.hardware.camera2.CaptureRequest r0 = r8.build()
            r3.CKN(r0, r10)
            r8.set(r1, r2)
            android.hardware.camera2.CaptureRequest r0 = r8.build()
            r3.BEY(r0, r10)
            if (r12 == 0) goto L_0x069f
            r0 = 6000(0x1770, double:2.9644E-320)
        L_0x069a:
            r9.A02(r8, r10, r0)
        L_0x069d:
            r6 = 0
            return r6
        L_0x069f:
            r0 = 4000(0xfa0, double:1.9763E-320)
            goto L_0x069a
        L_0x06a2:
            java.lang.Object r5 = r4.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r1 = r4.A02
            X.0z8 r2 = X.C19860z8.A00()
            r0 = 3
            java.lang.String r3 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x06ba
            java.lang.String r0 = "Starting service"
            android.util.Log.d(r3, r0)
        L_0x06ba:
            java.util.Queue r0 = r2.A03
            r0.offer(r1)
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r6 = X.C108945cZ.A0G(r0)
            java.lang.String r0 = r5.getPackageName()
            r6.setPackage(r0)
            monitor-enter(r2)
            java.lang.String r4 = r2.A02     // Catch:{ all -> 0x07aa }
            if (r4 != 0) goto L_0x072c
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x07aa }
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r6, r0)     // Catch:{ all -> 0x07aa }
            r4 = 0
            if (r0 == 0) goto L_0x0727
            android.content.pm.ServiceInfo r8 = r0.serviceInfo     // Catch:{ all -> 0x07aa }
            if (r8 == 0) goto L_0x0727
            java.lang.String r0 = r5.getPackageName()     // Catch:{ all -> 0x07aa }
            java.lang.String r7 = r8.packageName     // Catch:{ all -> 0x07aa }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x07aa }
            if (r0 == 0) goto L_0x070f
            java.lang.String r1 = r8.name     // Catch:{ all -> 0x07aa }
            if (r1 == 0) goto L_0x070f
            java.lang.String r0 = "."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x07aa }
            if (r0 == 0) goto L_0x070a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x07aa }
            java.lang.String r0 = r5.getPackageName()     // Catch:{ all -> 0x07aa }
            r1.append(r0)     // Catch:{ all -> 0x07aa }
            java.lang.String r0 = r8.name     // Catch:{ all -> 0x07aa }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x07aa }
        L_0x070a:
            r2.A02 = r1     // Catch:{ all -> 0x07aa }
            monitor-exit(r2)
            r4 = r1
            goto L_0x072d
        L_0x070f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x07aa }
            java.lang.String r0 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r1.append(r0)     // Catch:{ all -> 0x07aa }
            r1.append(r7)     // Catch:{ all -> 0x07aa }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x07aa }
            java.lang.String r0 = r8.name     // Catch:{ all -> 0x07aa }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x07aa }
            goto L_0x0729
        L_0x0727:
            java.lang.String r0 = "Failed to resolve target intent service, skipping classname enforcement"
        L_0x0729:
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x07aa }
        L_0x072c:
            monitor-exit(r2)
        L_0x072d:
            if (r4 == 0) goto L_0x074a
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x0743
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Restricting intent to a specific service: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            android.util.Log.d(r3, r0)
        L_0x0743:
            java.lang.String r0 = r5.getPackageName()
            r6.setClassName(r0, r4)
        L_0x074a:
            boolean r0 = r2.A01(r5)     // Catch:{ SecurityException -> 0x07a0, IllegalStateException -> 0x078e }
            if (r0 == 0) goto L_0x0777
            java.lang.Object r4 = X.C25928Cos.A02     // Catch:{ SecurityException -> 0x07a0, IllegalStateException -> 0x078e }
            monitor-enter(r4)     // Catch:{ SecurityException -> 0x07a0, IllegalStateException -> 0x078e }
            X.C25928Cos.A00(r5)     // Catch:{ all -> 0x0774 }
            java.lang.String r2 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r0 = 0
            boolean r1 = r6.getBooleanExtra(r2, r0)     // Catch:{ all -> 0x0774 }
            r0 = 1
            r6.putExtra(r2, r0)     // Catch:{ all -> 0x0774 }
            android.content.ComponentName r0 = r5.startService(r6)     // Catch:{ all -> 0x0774 }
            if (r0 != 0) goto L_0x0769
            monitor-exit(r4)     // Catch:{ all -> 0x0774 }
            goto L_0x0782
        L_0x0769:
            if (r1 != 0) goto L_0x0772
            X.CqV r2 = X.C25928Cos.A00     // Catch:{ all -> 0x0774 }
            long r0 = X.C25928Cos.A01     // Catch:{ all -> 0x0774 }
            r2.A01(r0)     // Catch:{ all -> 0x0774 }
        L_0x0772:
            monitor-exit(r4)     // Catch:{ all -> 0x0774 }
            goto L_0x078b
        L_0x0774:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0774 }
            throw r0     // Catch:{ SecurityException -> 0x07a0, IllegalStateException -> 0x078e }
        L_0x0777:
            android.content.ComponentName r1 = r5.startService(r6)     // Catch:{ SecurityException -> 0x07a0, IllegalStateException -> 0x078e }
            java.lang.String r0 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r3, r0)     // Catch:{ SecurityException -> 0x07a0, IllegalStateException -> 0x078e }
            if (r1 != 0) goto L_0x078b
        L_0x0782:
            java.lang.String r0 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r3, r0)     // Catch:{ SecurityException -> 0x07a0, IllegalStateException -> 0x078e }
            r1 = 404(0x194, float:5.66E-43)
            goto L_0x0843
        L_0x078b:
            r1 = -1
            goto L_0x0843
        L_0x078e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to start service while in background: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            android.util.Log.e(r3, r0)
            r1 = 402(0x192, float:5.63E-43)
            goto L_0x0843
        L_0x07a0:
            r1 = move-exception
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r3, r0, r1)
            r1 = 401(0x191, float:5.62E-43)
            goto L_0x0843
        L_0x07aa:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x07ad:
            java.lang.Object r1 = r4.A01
            X.BwL r1 = (X.C24155BwL) r1
            java.lang.Object r2 = r4.A02
            X.Cm3 r2 = (X.C25791Cm3) r2
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 != 0) goto L_0x07c5
            android.hardware.display.VirtualDisplay r0 = r1.A01
            if (r0 == 0) goto L_0x07c2
            r0.release()
        L_0x07c2:
            r0 = 0
            r1.A01 = r0
        L_0x07c5:
            android.media.Image r0 = r1.A02
            if (r0 == 0) goto L_0x07cc
            r0.close()
        L_0x07cc:
            r0 = 0
            r1.A02 = r0
            android.media.ImageReader r0 = r1.A03
            r0.close()
            r1.stopPeriodicCameraCallbackCheck()
            r1.A04 = r2
            int r3 = r2.A02
            int r4 = r2.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r1.A05
            int r5 = r0.format
            int r6 = r0.fps1000
            boolean r7 = r0.isFrontCamera
            int r8 = r0.orientation
            int r9 = r0.idx
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r2 = new com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.A05 = r2
            X.C24155BwL.A02(r1)
            int r1 = X.C24155BwL.A00(r1)
            goto L_0x0843
        L_0x07f8:
            java.lang.Object r3 = r4.A01
            X.DRB r3 = (X.DRB) r3
            java.lang.Object r2 = r4.A02
            X.CZE r2 = (X.CZE) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/ releasing surface texture holder for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0D
            X.C17900vP.A0b(r0, r1)
            r2.A00()
            android.os.HandlerThread r0 = r3.A0B
            X.C17960vV.A04(r0)
            r0 = 0
            r3.A04 = r0
            goto L_0x0835
        L_0x081a:
            java.lang.Object r2 = r4.A01
            X.DRB r2 = (X.DRB) r2
            java.lang.Object r1 = r4.A02
            float[] r1 = (float[]) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0F
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x082c
            r1 = -6
            goto L_0x0843
        L_0x082c:
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r2.A0E
            boolean r0 = r0.setBackgroundColor(r1)
            r1 = -2
            if (r0 == 0) goto L_0x0843
        L_0x0835:
            r1 = 0
            goto L_0x0843
        L_0x0837:
            java.lang.Object r1 = r4.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r4.A02
            com.whatsapp.voipcalling.VideoPort r0 = (com.whatsapp.voipcalling.VideoPort) r0
            int r1 = r1.m76lambda$setVideoPort$2$comwhatsappvoipcallingcameraVoipPhysicalCamera(r0)
        L_0x0843:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            return r6
        L_0x0848:
            java.lang.Object r1 = r4.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r4.A02
            com.whatsapp.voipcalling.camera.VoipCamera r0 = (com.whatsapp.voipcalling.camera.VoipCamera) r0
            java.lang.Integer r6 = r1.m81lambda$unregisterVirtualCamera$7$comwhatsappvoipcallingcameraVoipPhysicalCamera(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DVY.call():java.lang.Object");
    }
}
