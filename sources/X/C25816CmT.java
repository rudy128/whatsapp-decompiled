package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;

/* renamed from: X.CmT  reason: case insensitive filesystem */
public class C25816CmT {
    public static final C24555C9b A0G = new C24555C9b();
    public CameraDevice A00;
    public C25267Cc8 A01;
    public C26225CvG A02;
    public C25090CXb A03;
    public C26223CvD A04;
    public C22907BUs A05;
    public EBS A06;
    public C25632CjI A07;
    public E9U A08;
    public E9U A09;
    public boolean A0A;
    public final C25158Ca9 A0B;
    public final C24555C9b A0C;
    public final C26035Cqv A0D;
    public final C25850CnB A0E;
    public volatile boolean A0F;

    public C25816CmT(C26035Cqv cqv, C25850CnB cnB) {
        C24555C9b c9b = A0G;
        this.A0E = cnB;
        this.A0D = cqv;
        this.A0B = new C25158Ca9(cnB);
        this.A0C = c9b;
    }

    public C26132Csv A00(int i) {
        C25632CjI cjI;
        CKI cki;
        List A11;
        C22907BUs bUs;
        CKJ ckj;
        if (i != 32) {
            if (i == 35) {
                bUs = this.A05;
                if (bUs != null) {
                    ckj = C25971Cpe.A10;
                }
            } else if (i == 37) {
                cjI = this.A07;
                if (cjI != null) {
                    cki = C25632CjI.A10;
                    A11 = BE6.A11(cki, cjI);
                    if (A11 != null && !A11.isEmpty()) {
                        return (C26132Csv) C108955ca.A0p(A11);
                    }
                }
            } else if ((i == 256 || i == 4101) && (bUs = this.A05) != null) {
                ckj = C25971Cpe.A0k;
            }
            return (C26132Csv) bUs.A04(ckj);
        }
        cjI = this.A07;
        if (cjI != null) {
            cki = C25632CjI.A11;
            A11 = BE6.A11(cki, cjI);
            return (C26132Csv) C108955ca.A0p(A11);
        }
        return null;
    }

    public void A02(E9C e9c, Exception exc) {
        this.A0E.A05(new C27076DTa(e9c, exc, 16), this.A0D.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r1 != 1) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (r4.A0C != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r1.A0R == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        if (r8 == null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016b, code lost:
        if (r11 == null) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (X.BE9.A1S(X.EBS.A0D, r3) != false) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.hardware.camera2.CameraManager r30, android.hardware.camera2.CaptureRequest.Builder r31, X.DEU r32, X.EB1 r33, X.E9C r34, X.C25729Ckz r35, java.lang.Integer r36, int r37, int r38, int r39, boolean r40) {
        /*
            r29 = this;
            r0 = r29
            X.BUs r2 = r0.A05
            X.C28111Yx.A02(r2)
            X.CKJ r1 = X.C25971Cpe.A0h
            int r3 = X.BEA.A09(r1, r2)
            r2 = 20
            r1 = 0
            X.C26175Cts.A01(r1, r2, r3)
            X.Ca9 r5 = r0.A0B
            java.lang.String r1 = "Cannot capture photo, not prepared"
            r5.A00(r1)
            X.CvG r1 = r0.A02
            r9 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0025
            boolean r1 = r1.A0R
            r4 = 1
            if (r1 != 0) goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            X.EBS r3 = r0.A06
            if (r3 == 0) goto L_0x0036
            if (r4 != 0) goto L_0x0035
            X.ChN r1 = X.EBS.A0D
            boolean r1 = X.BE9.A1S(r1, r3)
            r4 = 0
            if (r1 == 0) goto L_0x0036
        L_0x0035:
            r4 = 1
        L_0x0036:
            X.CvG r1 = r0.A02
            if (r1 == 0) goto L_0x0582
            if (r4 == 0) goto L_0x0582
            X.CnB r1 = r0.A0E
            r25 = r1
            X.Cqv r1 = r0.A0D
            r24 = r1
            java.util.UUID r4 = r1.A03
            r3 = 24
            r28 = r34
            r1 = r28
            X.DTh r3 = X.C27082DTh.A00(r1, r3)
            r1 = r25
            r1.A05(r3, r4)
            X.CvG r1 = r0.A02
            X.Ca9 r3 = r1.A0I
            java.lang.String r1 = "Can only check if the prepared on the Optic thread"
            r3.A01(r1)
            boolean r1 = r3.A00
            if (r1 == 0) goto L_0x006e
            if (r40 == 0) goto L_0x006e
            X.CvG r1 = r0.A02
            r1.A08(r9)
            X.CvG r1 = r0.A02
            r1.A05()
        L_0x006e:
            X.BUs r3 = r0.A05
            X.CKJ r1 = X.C25971Cpe.A0B
            int r1 = X.BEA.A09(r1, r3)
            r6 = 2
            r14 = 1
            if (r1 == r6) goto L_0x007e
            r14 = 0
            r13 = 1
            if (r1 == r2) goto L_0x007f
        L_0x007e:
            r13 = 0
        L_0x007f:
            X.BUs r3 = r0.A05
            X.CKJ r1 = X.C25971Cpe.A0D
            int r4 = X.BEA.A09(r1, r3)
            X.BUs r3 = r0.A05
            X.CKJ r1 = X.C25971Cpe.A0e
            int r10 = X.BEA.A09(r1, r3)
            boolean r4 = X.AnonymousClass000.A1T(r4, r2)
            r1 = r31
            r3 = r32
            if (r14 != 0) goto L_0x02bd
            if (r4 == 0) goto L_0x00a4
            X.Cc8 r4 = r0.A01
            X.C28111Yx.A02(r4)
            boolean r4 = r4.A0C
            if (r4 == 0) goto L_0x02bd
        L_0x00a4:
            r26 = r37
            if (r10 == r2) goto L_0x00ae
            r4 = r26
            if (r4 != r2) goto L_0x02b5
            if (r13 == 0) goto L_0x0134
        L_0x00ae:
            java.lang.String r4 = "Cannot run precapture sequence, not prepared"
            r5.A00(r4)
            if (r31 == 0) goto L_0x0573
            X.BUs r4 = r0.A05
            if (r4 == 0) goto L_0x0573
            X.CjI r4 = r0.A07
            if (r4 == 0) goto L_0x0573
            X.CvG r8 = r0.A02
            if (r8 == 0) goto L_0x0573
            X.CvD r4 = r0.A04
            if (r4 == 0) goto L_0x0573
            X.Ca9 r7 = r8.A0I
            java.lang.String r4 = "Cannot get camera operations callback."
            r7.A00(r4)
            X.DEU r4 = r8.A07
            X.BUs r9 = r0.A05
            X.CjI r8 = r0.A07
            r7 = 0
            X.C25315CdL.A01(r1, r9, r8, r7)
            X.BUs r8 = r0.A05
            X.CKJ r7 = X.C25971Cpe.A09
            int r7 = X.BEA.A09(r7, r8)
            if (r7 == 0) goto L_0x00e7
            X.BUs r8 = r0.A05
            X.CjI r7 = r0.A07
            X.C25315CdL.A01(r1, r8, r7, r2)
        L_0x00e7:
            X.CvD r7 = r0.A04
            int r7 = r7.A07()
            if (r7 != 0) goto L_0x00fb
            X.CvD r7 = r0.A04
            float r8 = r7.A06()
            r7 = 1120403456(0x42c80000, float:100.0)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x011a
        L_0x00fb:
            X.CvD r7 = r0.A04
            float r14 = r7.A06()
            X.CvD r8 = r0.A04
            android.graphics.Rect r9 = r8.A04
            android.hardware.camera2.params.MeteringRectangle[] r7 = r8.A0D
            android.hardware.camera2.params.MeteringRectangle[] r12 = X.C26223CvD.A04(r8, r7)
            X.CvD r8 = r0.A04
            android.hardware.camera2.params.MeteringRectangle[] r7 = r8.A0C
            android.hardware.camera2.params.MeteringRectangle[] r13 = X.C26223CvD.A04(r8, r7)
            X.CjI r7 = r0.A07
            r10 = r1
            r11 = r7
            X.C26225CvG.A01(r9, r10, r11, r12, r13, r14)
        L_0x011a:
            X.C28111Yx.A02(r4)
            r7 = 3
            r4.A0G = r7
            X.Caw r9 = r4.A0E
            r7 = 3000(0xbb8, double:1.482E-320)
            r9.A02(r7)
            r7 = 4
            X.DVh r8 = new X.DVh
            r8.<init>(r1, r0, r4, r7)
            java.lang.String r7 = "run_precapture_sequence_on_camera_handler_thread"
            r4 = r25
            r4.A04(r7, r8)
        L_0x0134:
            java.lang.String r4 = "Cannot capture still picture, not prepared"
            r5.A00(r4)
            android.hardware.camera2.CameraDevice r4 = r0.A00
            r9 = 0
            if (r4 == 0) goto L_0x0569
            X.BUs r4 = r0.A05
            if (r4 == 0) goto L_0x0569
            X.E9U r10 = r0.A08
            java.lang.String r4 = "Cannot get picture ImageReader, not prepared"
            r5.A00(r4)
            X.E9U r4 = r0.A08
            if (r4 == 0) goto L_0x02b2
            android.view.Surface r11 = r4.BZw()
        L_0x0151:
            boolean r7 = r0.A0A
            X.E9U r15 = r0.A09
            java.lang.String r4 = "Cannot get YUV picture ImageReader, not prepared"
            r5.A00(r4)
            X.E9U r4 = r0.A09
            if (r4 == 0) goto L_0x02af
            android.view.Surface r8 = r4.BZw()
        L_0x0162:
            if (r15 == 0) goto L_0x0167
            r12 = 1
            if (r8 != 0) goto L_0x0168
        L_0x0167:
            r12 = 0
        L_0x0168:
            if (r10 == 0) goto L_0x016d
            r4 = 1
            if (r11 != 0) goto L_0x016e
        L_0x016d:
            r4 = 0
        L_0x016e:
            if (r7 == 0) goto L_0x0299
            if (r12 == 0) goto L_0x029b
        L_0x0172:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            X.CKM r12 = X.C25729Ckz.A05
            r27 = r35
            r4 = r27
            java.lang.Object r4 = r4.A00(r12)
            boolean r14 = r13.equals(r4)
            r12 = 0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            if (r7 != 0) goto L_0x0294
            r4.add(r11)
            r4.add(r12)
        L_0x018f:
            java.lang.String r8 = "Cannot create still capture builder, not prepared"
            r5.A00(r8)
            if (r31 == 0) goto L_0x0562
            android.hardware.camera2.CameraDevice r11 = r0.A00
            if (r11 == 0) goto L_0x0562
            X.CvD r8 = r0.A04
            if (r8 == 0) goto L_0x0562
            X.BUs r8 = r0.A05
            if (r8 == 0) goto L_0x0562
            X.CvG r8 = r0.A02
            if (r8 == 0) goto L_0x0562
            X.CjI r8 = r0.A07
            if (r8 == 0) goto L_0x0562
            android.hardware.camera2.CaptureRequest$Builder r8 = r11.createCaptureRequest(r6)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)
            r11 = r17
            r8.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.Object r11 = r1.get(r12)
            r8.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Object r11 = r1.get(r12)
            r8.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r11 = r1.get(r12)
            r8.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            java.lang.Object r11 = r1.get(r12)
            r8.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            java.lang.Object r11 = r1.get(r12)
            r8.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r11 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            r12 = r38
            X.BE7.A14(r8, r11, r12)
            android.hardware.camera2.CaptureRequest$Key r11 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            if (r36 == 0) goto L_0x0290
            byte r12 = r36.byteValue()
        L_0x01f5:
            java.lang.Byte r12 = java.lang.Byte.valueOf(r12)
            r8.set(r11, r12)
            X.BUs r12 = r0.A05
            X.CjI r11 = r0.A07
            X.C25315CdL.A01(r8, r12, r11, r9)
            X.BUs r13 = r0.A05
            X.CjI r12 = r0.A07
            r11 = 3
            X.C25315CdL.A01(r8, r13, r12, r11)
            X.BUs r13 = r0.A05
            X.CjI r12 = r0.A07
            r11 = 4
            X.C25315CdL.A01(r8, r13, r12, r11)
            X.BUs r13 = r0.A05
            X.CjI r12 = r0.A07
            r11 = 7
            X.C25315CdL.A01(r8, r13, r12, r11)
            X.BUs r12 = r0.A05
            X.CjI r11 = r0.A07
            X.C25315CdL.A01(r8, r12, r11, r6)
            X.BUs r12 = r0.A05
            X.CjI r11 = r0.A07
            r6 = 6
            X.C25315CdL.A01(r8, r12, r11, r6)
            X.BUs r12 = r0.A05
            X.CjI r11 = r0.A07
            r6 = 5
            X.C25315CdL.A01(r8, r12, r11, r6)
            X.BUs r11 = r0.A05
            X.CKJ r6 = X.C25971Cpe.A09
            int r6 = X.BEA.A09(r6, r11)
            if (r6 == 0) goto L_0x0243
            X.BUs r11 = r0.A05
            X.CjI r6 = r0.A07
            X.C25315CdL.A01(r1, r11, r6, r2)
        L_0x0243:
            X.CvD r6 = r0.A04
            int r6 = r6.A07()
            if (r6 != 0) goto L_0x0257
            X.CvD r6 = r0.A04
            float r11 = r6.A06()
            r6 = 1120403456(0x42c80000, float:100.0)
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x027a
        L_0x0257:
            X.CvD r6 = r0.A04
            float r23 = r6.A06()
            X.CvD r11 = r0.A04
            android.graphics.Rect r12 = r11.A04
            android.hardware.camera2.params.MeteringRectangle[] r6 = r11.A0D
            android.hardware.camera2.params.MeteringRectangle[] r21 = X.C26223CvD.A04(r11, r6)
            X.CvD r11 = r0.A04
            android.hardware.camera2.params.MeteringRectangle[] r6 = r11.A0C
            android.hardware.camera2.params.MeteringRectangle[] r22 = X.C26223CvD.A04(r11, r6)
            X.CjI r6 = r0.A07
            r19 = r8
            r20 = r6
            r18 = r12
            X.C26225CvG.A01(r18, r19, r20, r21, r22, r23)
        L_0x027a:
            java.util.Iterator r6 = r4.iterator()
        L_0x027e:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x02fc
            java.lang.Object r4 = r6.next()
            android.view.Surface r4 = (android.view.Surface) r4
            if (r4 == 0) goto L_0x027e
            r8.addTarget(r4)
            goto L_0x027e
        L_0x0290:
            r12 = 90
            goto L_0x01f5
        L_0x0294:
            r4.add(r8)
            goto L_0x018f
        L_0x0299:
            if (r4 != 0) goto L_0x0172
        L_0x029b:
            r0.A0F = r9
            java.lang.Object[] r1 = new java.lang.Object[r2]
            if (r7 == 0) goto L_0x02ac
            java.lang.String r0 = "YUV"
        L_0x02a3:
            r1[r9] = r0
            java.lang.String r0 = "%s ImageReader not setup before taking picture."
            java.lang.IllegalStateException r1 = X.BE8.A0Y(r0, r1)
            throw r1
        L_0x02ac:
            java.lang.String r0 = "JPEG"
            goto L_0x02a3
        L_0x02af:
            r8 = 0
            goto L_0x0162
        L_0x02b2:
            r11 = 0
            goto L_0x0151
        L_0x02b5:
            if (r13 != 0) goto L_0x00ae
            if (r14 == 0) goto L_0x0134
            if (r9 != 0) goto L_0x0134
            goto L_0x00ae
        L_0x02bd:
            X.Cc8 r11 = r0.A01
            X.C28111Yx.A02(r11)
            X.CvG r4 = r0.A02
            X.E9T r4 = r4.A08
            X.Ca9 r8 = r11.A0A
            java.lang.String r7 = "Method lockFocusForCapture() must run on the Optic Background Thread."
            r8.A01(r7)
            if (r32 == 0) goto L_0x057a
            r3.A0G = r6
            X.Caw r12 = r3.A0E
            r7 = 300(0x12c, double:1.48E-321)
            r12.A02(r7)
            X.CnB r8 = r11.A0B
            X.DVm r7 = new X.DVm
            r15 = r7
            r16 = r1
            r17 = r11
            r18 = r3
            r19 = r4
            r20 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.String r4 = "lock_focus_for_capture_on_camera_handler_thread"
            r8.A04(r4, r7)
            java.lang.Integer r4 = r3.A0B
            if (r4 == 0) goto L_0x00a4
            int r4 = r4.intValue()
            if (r4 != r6) goto L_0x00a4
            r9 = 1
            goto L_0x00a4
        L_0x02fc:
            int r6 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r6 < r4) goto L_0x030b
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r8.set(r6, r4)
        L_0x030b:
            X.CjI r6 = r0.A07
            X.CKI r4 = X.C25632CjI.A0O
            boolean r4 = X.BE9.A1T(r4, r6)
            if (r4 == 0) goto L_0x031c
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            r4 = r17
            r8.set(r6, r4)
        L_0x031c:
            X.CjI r6 = r0.A07
            X.CKI r4 = X.C25632CjI.A0F
            r6.A02(r4)
            if (r7 != 0) goto L_0x055c
            X.C28111Yx.A02(r10)
        L_0x0328:
            boolean r6 = r10 instanceof X.C26806DEo
            X.DET r4 = new X.DET
            r4.<init>(r6, r14)
            r6 = r25
            android.os.Handler r7 = r6.A02
            X.CVC r6 = r4.A04
            r10.CCL(r7, r6)
            java.lang.ref.WeakReference r6 = X.AnonymousClass3MW.A0z(r28)
            r4.A01 = r6
            r6 = 3
            X.DVh r10 = new X.DVh
            r10.<init>(r4, r0, r8, r6)
            java.lang.String r7 = "capture_still_picture_on_camera_handler_thread"
            r6 = r25
            java.lang.Object r13 = r6.A04(r7, r10)
            X.CiL r13 = (X.C25581CiL) r13
            r0.A0F = r9
            byte[] r12 = r13.A04
            X.CXa r6 = r13.A01
            r16 = r6
            if (r12 == 0) goto L_0x035b
            int r6 = r12.length
            if (r6 != 0) goto L_0x0411
        L_0x035b:
            if (r16 != 0) goto L_0x0411
            java.lang.String r4 = "Image data was null."
            java.lang.IllegalStateException r6 = X.AnonymousClass000.A0n(r4)
            r4 = 22
            X.C26175Cts.A01(r6, r4, r9)
            java.lang.String r4 = "Photo capture returned empty image data."
            X.Da2 r6 = new X.Da2
            r6.<init>(r4)
            r4 = r28
            r0.A02(r4, r6)
        L_0x0374:
            X.CKM r6 = X.C25729Ckz.A07
            r4 = r27
            boolean r4 = X.BEA.A1Y(r6, r4)
            if (r4 == 0) goto L_0x0410
            java.lang.String r4 = "Cannot restore preview post capture, not prepared"
            r5.A00(r4)
            if (r33 == 0) goto L_0x0410
            X.CvG r6 = r0.A02
            if (r6 == 0) goto L_0x0410
            X.CjI r4 = r0.A07
            if (r4 == 0) goto L_0x0410
            X.BUs r4 = r0.A05
            if (r4 == 0) goto L_0x0410
            X.CvD r4 = r0.A04
            if (r4 == 0) goto L_0x0410
            X.E9T r5 = r6.A08
            if (r5 == 0) goto L_0x0410
            if (r40 == 0) goto L_0x039e
            r6.A08(r2)
        L_0x039e:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r4 = r17
            r1.set(r6, r4)
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            r1.set(r6, r4)
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            r6 = 0
            X.BE7.A14(r1, r4, r6)
            X.CvD r4 = r0.A04
            float r13 = r4.A06()
            X.CvD r7 = r0.A04
            android.graphics.Rect r8 = r7.A04
            android.hardware.camera2.params.MeteringRectangle[] r4 = r7.A0D
            android.hardware.camera2.params.MeteringRectangle[] r11 = X.C26223CvD.A04(r7, r4)
            X.CvD r7 = r0.A04
            android.hardware.camera2.params.MeteringRectangle[] r4 = r7.A0C
            android.hardware.camera2.params.MeteringRectangle[] r12 = X.C26223CvD.A04(r7, r4)
            X.CjI r4 = r0.A07
            r9 = r1
            r10 = r4
            X.C26225CvG.A01(r8, r9, r10, r11, r12, r13)
            android.hardware.camera2.CameraDevice r4 = r0.A00
            X.C28111Yx.A02(r4)
            java.lang.String r12 = r4.getId()
            X.BUs r7 = r0.A05
            X.CjI r4 = r0.A07
            r8 = r30
            r10 = r7
            r11 = r4
            r13 = r6
            X.C25315CdL.A00(r8, r9, r10, r11, r12, r13)
            if (r32 == 0) goto L_0x03f7
            X.CvG r4 = r0.A02
            X.E1E r4 = r4.A0K
            r3.A0G = r2
            r3.A06 = r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.A0A = r2
            r2 = 0
            r3.A00 = r2
        L_0x03f7:
            android.hardware.camera2.CaptureRequest r4 = r1.build()
            r2 = 0
            r5.BEY(r4, r2)
            r5.CKN(r4, r3)
            X.BUs r2 = r0.A05
            X.CjI r0 = r0.A07
            X.C25315CdL.A01(r1, r2, r0, r6)
            android.hardware.camera2.CaptureRequest r0 = r1.build()
            r5.CKN(r0, r3)
        L_0x0410:
            return
        L_0x0411:
            java.lang.Integer r7 = r13.A03
            if (r7 == 0) goto L_0x0548
            java.lang.Integer r6 = r13.A02
            if (r6 == 0) goto L_0x0548
            int r10 = r7.intValue()
            int r6 = r6.intValue()
        L_0x0421:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>(r9, r9, r10, r6)
            X.BUs r7 = r0.A05
            X.CKJ r6 = X.C25971Cpe.A0p
            java.lang.Object r11 = X.BE7.A0b(r6, r7)
            android.graphics.Rect r11 = (android.graphics.Rect) r11
            java.lang.Long r10 = r4.A00
            X.Cje r4 = r4.A02
            int r6 = r4.A00
            int r6 = r6 + 3
            int r6 = r6 + -1
            int r6 = r6 % 3
            X.ClK[] r4 = r4.A01
            r7 = r4[r6]
            if (r7 == 0) goto L_0x0542
            boolean r4 = r0.A0A
            if (r4 == 0) goto L_0x053f
            X.CKL r4 = X.C25750ClK.A0T
            java.lang.Object r4 = r7.A00(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 != 0) goto L_0x0458
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            java.lang.Object r4 = r8.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
        L_0x0458:
            if (r10 != 0) goto L_0x0460
            X.CKL r6 = X.C25750ClK.A0K
            java.lang.Object r10 = r7.A00(r6)
        L_0x0460:
            if (r4 == 0) goto L_0x0542
            int r15 = r4.intValue()
        L_0x0466:
            r4 = r39
            X.C24557C9d.A00(r14, r11, r4, r15)
            X.CZR r6 = new X.CZR
            r4 = r26
            r6.<init>(r14, r11, r9, r4)
            X.CKO r11 = X.C25751ClL.A0d
            X.CKM r9 = X.C25729Ckz.A08
            r4 = r27
            java.lang.Object r4 = r4.A00(r9)
            r6.A01(r11, r4)
            X.CKO r4 = X.C25751ClL.A0T
            r6.A01(r4, r10)
            int r9 = r13.A00
            r4 = 35
            if (r9 != r4) goto L_0x0538
            X.CKO r9 = X.C25751ClL.A0Y
            r4 = r16
            r6.A01(r9, r4)
        L_0x0491:
            if (r7 == 0) goto L_0x04e2
            X.CKO r9 = X.C25751ClL.A0Z
            X.CKL r4 = X.C25750ClK.A0R
            java.lang.Object r4 = r7.A00(r4)
            r6.A01(r9, r4)
            X.CKO r9 = X.C25751ClL.A0O
            X.CKL r4 = X.C25750ClK.A0F
            java.lang.Object r4 = r7.A00(r4)
            r6.A01(r9, r4)
            X.CKO r9 = X.C25751ClL.A0V
            X.CKL r4 = X.C25750ClK.A0M
            java.lang.Object r4 = r7.A00(r4)
            r6.A01(r9, r4)
            X.CKO r9 = X.C25751ClL.A0P
            X.CKL r4 = X.C25750ClK.A0G
            java.lang.Object r4 = r7.A00(r4)
            r6.A01(r9, r4)
            X.CKO r9 = X.C25751ClL.A0S
            X.CKL r4 = X.C25750ClK.A0J
            java.lang.Object r4 = r7.A00(r4)
            r6.A01(r9, r4)
            X.CKO r9 = X.C25751ClL.A0U
            X.CKL r4 = X.C25750ClK.A0L
            java.lang.Object r4 = r7.A00(r4)
            r6.A01(r9, r4)
            boolean r4 = r0.A0A
            if (r4 == 0) goto L_0x04e2
            X.CKO r7 = X.C25751ClL.A0a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r6.A01(r7, r4)
        L_0x04e2:
            X.CvD r4 = r0.A04
            if (r4 == 0) goto L_0x04f3
            X.CKO r7 = X.C25751ClL.A0e
            int r4 = r4.A07()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.A01(r7, r4)
        L_0x04f3:
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r4 = r8.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            X.CKO r7 = X.C25751ClL.A0c
            if (r4 == 0) goto L_0x0536
            int r4 = r4.intValue()
            int r4 = X.C26288Cwo.A00(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x050b:
            r6.A01(r7, r4)
            int r8 = r14.width()
            int r4 = r14.height()
            int r8 = r8 * r4
            r7 = 21
            r4 = 0
            X.C26175Cts.A01(r4, r7, r8)
            X.ClL r9 = new X.ClL
            r9.<init>(r6)
            r4 = r24
            java.util.UUID r8 = r4.A03
            r7 = 17
            X.DTa r6 = new X.DTa
            r4 = r28
            r6.<init>(r4, r9, r7)
            r4 = r25
            r4.A05(r6, r8)
            goto L_0x0374
        L_0x0536:
            r4 = 0
            goto L_0x050b
        L_0x0538:
            X.CKO r4 = X.C25751ClL.A0X
            r6.A01(r4, r12)
            goto L_0x0491
        L_0x053f:
            r4 = 0
            goto L_0x0458
        L_0x0542:
            int r15 = X.C25317CdN.A00(r12)
            goto L_0x0466
        L_0x0548:
            X.C28111Yx.A02(r12)
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r7.inJustDecodeBounds = r2
            int r6 = r12.length
            android.graphics.BitmapFactory.decodeByteArray(r12, r9, r6, r7)
            int r10 = r7.outWidth
            int r6 = r7.outHeight
            goto L_0x0421
        L_0x055c:
            X.C28111Yx.A02(r15)
            r10 = r15
            goto L_0x0328
        L_0x0562:
            java.lang.String r0 = "Trying to create capture settings after camera closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0569:
            r0.A0F = r9
            java.lang.String r0 = "Camera must be opened to capture still picture."
            X.Da2 r1 = new X.Da2
            r1.<init>(r0)
            throw r1
        L_0x0573:
            java.lang.String r0 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x057a:
            java.lang.String r1 = "Preview closed while processing capture request."
            X.Da2 r0 = new X.Da2
            r0.<init>(r1)
            throw r0
        L_0x0582:
            r0.A0F = r9
            java.lang.String r0 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25816CmT.A01(android.hardware.camera2.CameraManager, android.hardware.camera2.CaptureRequest$Builder, X.DEU, X.EB1, X.E9C, X.Ckz, java.lang.Integer, int, int, int, boolean):void");
    }
}
