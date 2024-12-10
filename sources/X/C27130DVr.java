package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.DVr  reason: case insensitive filesystem */
public final /* synthetic */ class C27130DVr implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ CaptureRequest.Builder A04;
    public final /* synthetic */ E1D A05;
    public final /* synthetic */ C25090CXb A06;
    public final /* synthetic */ DEU A07;
    public final /* synthetic */ C26132Csv A08;
    public final /* synthetic */ EAW A09;
    public final /* synthetic */ String A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0164, code lost:
        if (X.AnonymousClass000.A0M(r13.A06.A04(r1)) == 1) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a8, code lost:
        if (r0.equals(X.C24331BzS.LOW) == false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r21 = this;
            r1 = r21
            X.CXb r8 = r1.A06
            java.lang.String r0 = r1.A0A
            r20 = r0
            X.Csv r14 = r1.A08
            int r9 = r1.A00
            int r12 = r1.A01
            int r11 = r1.A02
            X.EAW r0 = r1.A09
            r16 = r0
            X.E1D r13 = r1.A05
            android.hardware.camera2.CaptureRequest$Builder r10 = r1.A04
            X.DEU r7 = r1.A07
            long r0 = r1.A03
            r18 = r0
            X.C28111Yx.A02(r14)
            r15 = 1
            r6 = 0
            X.Ca9 r1 = r8.A09
            java.lang.String r0 = "Method recordVideo() must run on the Optic Background Thread."
            r1.A01(r0)
            android.hardware.camera2.CameraDevice r0 = r8.A0B
            if (r0 == 0) goto L_0x01b3
            X.CjI r0 = r8.A05
            if (r0 == 0) goto L_0x01b3
            X.BUs r2 = r8.A03
            if (r2 == 0) goto L_0x01b3
            X.CvG r0 = r8.A02
            if (r0 == 0) goto L_0x01b3
            X.Cc8 r0 = r8.A01
            if (r0 == 0) goto L_0x01b3
            X.EBS r0 = r8.A04
            if (r0 == 0) goto L_0x01ac
            X.CKJ r1 = X.C25971Cpe.A0B
            int r0 = X.BEA.A09(r1, r2)
            r2 = 3
            if (r0 == 0) goto L_0x006a
            if (r10 == 0) goto L_0x006a
            X.Csq r0 = new X.Csq
            r0.<init>()
            X.C26128Csq.A01(r1, r0, r2)
            X.CXe r1 = r0.A03()
            X.BUs r0 = r8.A03
            r0.A06(r1)
            X.BUs r1 = r8.A03
            X.CjI r0 = r8.A05
            X.C25315CdL.A01(r10, r1, r0, r6)
            X.CvG r0 = r8.A02
            r0.A05()
        L_0x006a:
            X.C28111Yx.A02(r10)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            X.BE7.A14(r10, r0, r2)
            X.EBS r1 = r8.A04
            X.ChN r0 = X.EBS.A0b
            java.lang.Object r0 = r1.BMB(r0)
            X.CvA r5 = r8.A08
            X.CPY r1 = X.C26221CvA.A01(r5, r9)     // Catch:{ CameraAccessException -> 0x0087 }
            java.lang.String r1 = r1.A02     // Catch:{ CameraAccessException -> 0x0087 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ CameraAccessException -> 0x0087 }
            goto L_0x008f
        L_0x0087:
            java.lang.String r2 = "CameraInventory"
            java.lang.String r1 = "Failed to load CameraInfo to obtain camera id"
            X.C26175Cts.A02(r2, r1)
            r1 = 0
        L_0x008f:
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r1, r15)
            X.BUs r1 = r8.A03
            X.CKJ r3 = X.C25971Cpe.A0w
            java.lang.Object r1 = r1.A04(r3)
            X.C28111Yx.A02(r1)
            int r2 = r14.A02
            int r1 = r14.A01
            X.BzS r14 = X.C24331BzS.HIGH
            boolean r14 = r0.equals(r14)
            if (r14 == 0) goto L_0x0192
            r14 = 5000000(0x4c4b40, float:7.006492E-39)
        L_0x00ad:
            r4.videoBitRate = r14
        L_0x00af:
            r0 = 2
            r4.videoCodec = r0
            X.BUs r0 = r8.A03
            int r0 = X.BEA.A09(r3, r0)
            r4.videoFrameRate = r0
            r4.videoFrameWidth = r2
            r4.videoFrameHeight = r1
            X.C28111Yx.A02(r16)
            X.E7e r0 = r16.BbR()
            r8.A07 = r0
            if (r0 != 0) goto L_0x00d8
            X.BUs r1 = r8.A03
            X.CKJ r0 = X.C25971Cpe.A0N
            boolean r1 = X.BEA.A1X(r0, r1)
            X.DEz r0 = new X.DEz
            r0.<init>(r13, r1)
            r8.A07 = r0
        L_0x00d8:
            X.Cc8 r13 = r8.A01
            X.CnB r1 = r13.A0B
            java.lang.String r0 = "Method setFocusModeForVideo() must run on the Optic Background Thread."
            r1.A06(r0)
            android.hardware.camera2.CameraManager r0 = r13.A01
            if (r0 == 0) goto L_0x00fe
            android.hardware.camera2.CameraDevice r0 = r13.A00
            if (r0 == 0) goto L_0x00fe
            X.CvG r1 = r13.A04
            if (r1 == 0) goto L_0x00fe
            X.CjI r0 = r13.A07
            if (r0 == 0) goto L_0x00fe
            X.E9T r2 = r1.A08
            if (r2 == 0) goto L_0x00fe
            r13.A0E = r15
            boolean r0 = r13.A0C
            if (r0 == 0) goto L_0x0143
            r13.A00()
        L_0x00fe:
            X.E7e r3 = r8.A07
            int r15 = r5.A05(r9, r12, r11)
            X.BUs r1 = r8.A03
            X.CKJ r0 = X.C25971Cpe.A0N
            boolean r16 = X.BEA.A1X(r0, r1)
            X.CvG r0 = r8.A02
            if (r0 == 0) goto L_0x0140
            X.BUs r2 = r0.A09
            if (r2 == 0) goto L_0x0140
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.CKJ r0 = X.C25971Cpe.A0J
            java.lang.Object r0 = r2.A04(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0140
            r17 = 1
        L_0x0124:
            X.CvG r0 = r8.A02
            r10 = r3
            r11 = r4
            r12 = r0
            r13 = r20
            r14 = r9
            X.CmS r2 = r10.COQ(r11, r12, r13, r14, r15, r16, r17)
            r8.A06 = r2
            r8.A06 = r2
            X.CKP r1 = X.C25815CmS.A0N
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r2.A02(r1, r0)
            X.CmS r0 = r8.A06
            return r0
        L_0x0140:
            r17 = 0
            goto L_0x0124
        L_0x0143:
            X.CjI r1 = r13.A07
            X.CKI r0 = X.C25632CjI.A0D
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x0186
            r3 = 3
        L_0x014e:
            X.BUs r0 = r13.A06
            if (r0 == 0) goto L_0x0166
            X.CKJ r1 = X.C25971Cpe.A0e
            java.lang.Object r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x0166
            X.BUs r0 = r13.A06
            java.lang.Object r0 = r0.A04(r1)
            int r0 = X.AnonymousClass000.A0M(r0)
            if (r0 == r15) goto L_0x0173
        L_0x0166:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = 2
            X.BE7.A14(r10, r1, r0)
            android.hardware.camera2.CaptureRequest r0 = r10.build()
            r2.BEY(r0, r7)
        L_0x0173:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            X.BE7.A14(r10, r0, r3)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            X.BE7.A14(r10, r0, r6)
            android.hardware.camera2.CaptureRequest r0 = r10.build()
            r2.CKN(r0, r7)
            goto L_0x00fe
        L_0x0186:
            X.CjI r1 = r13.A07
            X.CKI r0 = X.C25632CjI.A0C
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x00fe
            r3 = 4
            goto L_0x014e
        L_0x0192:
            X.BzS r14 = X.C24331BzS.MEDIUM
            boolean r14 = r0.equals(r14)
            if (r14 == 0) goto L_0x019f
            r14 = 3000000(0x2dc6c0, float:4.203895E-39)
            goto L_0x00ad
        L_0x019f:
            X.BzS r14 = X.C24331BzS.LOW
            boolean r0 = r0.equals(r14)
            r14 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 != 0) goto L_0x00ad
            goto L_0x00af
        L_0x01ac:
            java.lang.String r0 = "Cannot setup media recorder, trying to setup camera params without a StartupSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x01b3:
            java.lang.String r0 = "Cannot start recording video, camera is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27130DVr.call():java.lang.Object");
    }

    public /* synthetic */ C27130DVr(CaptureRequest.Builder builder, E1D e1d, C25090CXb cXb, DEU deu, C26132Csv csv, EAW eaw, String str, int i, int i2, int i3, long j) {
        this.A06 = cXb;
        this.A0A = str;
        this.A08 = csv;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A09 = eaw;
        this.A05 = e1d;
        this.A04 = builder;
        this.A07 = deu;
        this.A03 = j;
    }
}
