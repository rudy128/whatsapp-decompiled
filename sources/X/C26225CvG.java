package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CvG  reason: case insensitive filesystem */
public class C26225CvG {
    public static final Object A0T = C17880vN.A0p();
    public CameraCharacteristics A00;
    public CameraDevice A01;
    public CaptureRequest.Builder A02;
    public Surface A03;
    public Surface A04;
    public Surface A05;
    public Surface A06;
    public DEU A07;
    public E9T A08;
    public C22907BUs A09;
    public C22908BUt A0A;
    public EBS A0B;
    public C28628EBb A0C;
    public EB1 A0D;
    public C25632CjI A0E;
    public boolean A0F;
    public MeteringRectangle[] A0G;
    public MeteringRectangle[] A0H;
    public final C25158Ca9 A0I;
    public final E1E A0J = new DER(this, 1);
    public final E1E A0K = new DER(this, 0);
    public final C26816DEy A0L = new C26816DEy(new CKF(this));
    public final C25132CZh A0M = new C25132CZh();
    public final C25132CZh A0N = new C25132CZh();
    public final C25850CnB A0O;
    public final List A0P = AnonymousClass000.A13();
    public volatile C25103CXw A0Q;
    public volatile boolean A0R;
    public volatile boolean A0S;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (java.lang.Boolean.TRUE.equals(r2.A04(X.C25971Cpe.A03)) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.AnonymousClass000.A0M(r7.A09.A04(r1)) != 1) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.E9T A00(X.C26225CvG r7, java.lang.String r8, java.util.List r9, boolean r10) {
        /*
            r3 = r7
            X.Ca9 r1 = r7.A0I
            java.lang.String r0 = "Method createCaptureSession must be called on Optic Thread"
            r1.A01(r0)
            X.BUs r0 = r7.A09
            r2 = 1
            if (r0 == 0) goto L_0x0022
            X.CKJ r1 = X.C25971Cpe.A0e
            java.lang.Object r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x0022
            X.BUs r0 = r7.A09
            java.lang.Object r0 = r0.A04(r1)
            int r0 = X.AnonymousClass000.A0M(r0)
            r5 = 1
            if (r0 == r2) goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            X.BUs r2 = r7.A09
            if (r2 == 0) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.CKJ r0 = X.C25971Cpe.A03
            java.lang.Object r0 = r2.A04(r0)
            boolean r0 = r1.equals(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r6 = 0
        L_0x0037:
            X.DEy r1 = r7.A0L
            r0 = 1
            r1.A03 = r0
            X.Caw r2 = r1.A01
            r0 = 0
            r2.A02(r0)
            X.CnB r0 = r7.A0O
            X.DVk r2 = new X.DVk
            r4 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r0 = r0.A04(r8, r2)
            X.E9T r0 = (X.E9T) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26225CvG.A00(X.CvG, java.lang.String, java.util.List, boolean):X.E9T");
    }

    public static boolean A03(List list, int[] iArr) {
        if (!(list == null || iArr == null || (iArr[0] == 0 && iArr[1] == 0))) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void A01(Rect rect, CaptureRequest.Builder builder, C25632CjI cjI, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f) {
        if (Build.VERSION.SDK_INT >= 30 && BE9.A1T(C25632CjI.A0N, cjI)) {
            builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f / 100.0f));
        } else if (BE9.A1T(C25632CjI.A0e, cjI)) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        if (BE9.A1T(C25632CjI.A0U, cjI)) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        if (BE9.A1T(C25632CjI.A0V, cjI)) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
    }

    private boolean A02(int i) {
        CameraCharacteristics cameraCharacteristics = this.A00;
        C28111Yx.A02(cameraCharacteristics);
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (java.lang.Boolean.TRUE.equals(r7.A04(X.C25971Cpe.A0J)) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r9 != 0) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.E9T A04(X.E1E r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            X.Ca9 r5 = r10.A0I
            java.lang.String r0 = "Cannot start preview."
            r5.A00(r0)
            X.DEU r1 = r10.A07
            X.C28111Yx.A02(r1)
            r0 = 1
            r1.A0G = r0
            r1.A06 = r11
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0A = r0
            r0 = 0
            r1.A00 = r0
            X.E9T r0 = r10.A08
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r2 = 0
            if (r1 < r0) goto L_0x00cc
            X.BUs r0 = r10.A09
            if (r0 == 0) goto L_0x00cc
            X.CKJ r1 = X.C25971Cpe.A0v
            java.lang.Object r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x00cc
            X.BUs r0 = r10.A09
            java.lang.Object r0 = X.BE7.A0b(r1, r0)
            long r0 = X.C17880vN.A05(r0)
        L_0x003f:
            X.BUs r7 = r10.A09
            if (r7 == 0) goto L_0x0052
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            X.CKJ r4 = X.C25971Cpe.A0J
            java.lang.Object r4 = r7.A04(r4)
            boolean r4 = r6.equals(r4)
            r9 = 1
            if (r4 != 0) goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            r6 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x005b
            r8 = 0
            if (r9 == 0) goto L_0x005c
        L_0x005b:
            r8 = 1
        L_0x005c:
            java.lang.String r4 = "Cannot get output surfaces."
            r5.A00(r4)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            android.view.Surface r5 = r10.A04
            if (r5 == 0) goto L_0x0071
            X.CPZ r4 = new X.CPZ
            r4.<init>(r5, r9, r0)
            r7.add(r4)
        L_0x0071:
            r4 = 0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x0085
            X.EBS r1 = r10.A0B
            if (r1 == 0) goto L_0x0085
            X.ChN r0 = X.EBS.A0V
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x0085
            r4 = 2
        L_0x0085:
            if (r12 == 0) goto L_0x00a6
            X.EBb r1 = r10.A0C
            if (r1 == 0) goto L_0x00a6
            boolean r0 = r1.Bge()
            if (r0 == 0) goto L_0x00a6
            android.view.Surface r0 = r1.BZw()
            if (r0 == 0) goto L_0x00a6
            X.EBb r0 = r10.A0C
            android.view.Surface r9 = r0.BZw()
            r1 = 0
            X.CPZ r0 = new X.CPZ
            r0.<init>(r9, r1, r2)
            r7.add(r0)
        L_0x00a6:
            android.view.Surface r2 = r10.A06
            if (r2 != 0) goto L_0x00ae
            android.view.Surface r2 = r10.A03
            if (r2 == 0) goto L_0x00b7
        L_0x00ae:
            r1 = 0
            X.CPZ r0 = new X.CPZ
            r0.<init>(r2, r1, r4)
            r7.add(r0)
        L_0x00b7:
            java.lang.String r0 = "start_preview_on_camera_handler_thread"
            X.E9T r0 = A00(r10, r0, r7, r8)
            r10.A08 = r0
            r10.A08(r12)
            java.lang.String r0 = "Preview session was closed while starting preview"
            r10.A09(r13, r0)
            r10.A0R = r6
            X.E9T r0 = r10.A08
            return r0
        L_0x00cc:
            r0 = 0
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26225CvG.A04(X.E1E, boolean, boolean):X.E9T");
    }

    public void A05() {
        this.A0I.A00("Cannot refresh camera preview.");
        try {
            A09(false, (String) null);
        } catch (Exception unused) {
        }
    }

    public void A06() {
        CKH ckh;
        this.A0I.A00("Cannot update frame metadata collection.");
        C22907BUs bUs = this.A09;
        if (bUs != null && this.A0C != null && this.A07 != null) {
            boolean A1X = BEA.A1X(C25971Cpe.A0U, bUs);
            DEU deu = this.A07;
            if (A1X) {
                ckh = this.A0C.BRz();
                if (deu.A07 == null) {
                    deu.A07 = new C25648Cje();
                }
            } else {
                ckh = null;
            }
            deu.A0J = A1X;
            deu.A09 = ckh;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.Surface r10, X.CVA r11, boolean r12) {
        /*
            r9 = this;
            X.Ca9 r1 = r9.A0I
            java.lang.String r0 = "Cannot configure camera preview."
            r1.A00(r0)
            r9.A04 = r10
            r9.A0F = r12
            android.hardware.camera2.CameraDevice r1 = r9.A01
            X.C28111Yx.A02(r1)
            X.EB1 r0 = r9.A0D
            X.C28111Yx.A02(r0)
            r0 = 1
            android.hardware.camera2.CaptureRequest$Builder r1 = r1.createCaptureRequest(r0)
            r9.A02 = r1
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r0 = r1.get(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = (android.hardware.camera2.params.MeteringRectangle[]) r0
            r9.A0H = r0
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            java.lang.Object r0 = r1.get(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = (android.hardware.camera2.params.MeteringRectangle[]) r0
            r9.A0G = r0
            r8 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            r2 = 0
            r5 = 1
            if (r1 < r0) goto L_0x0056
            X.EBS r1 = r9.A0B
            if (r1 == 0) goto L_0x023e
            X.ChN r0 = X.EBS.A09
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x023e
            android.hardware.camera2.CaptureRequest$Builder r3 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SETTINGS_OVERRIDE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0053:
            r3.set(r1, r0)
        L_0x0056:
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1.set(r0, r4)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r1.set(r0, r4)
            X.EBS r1 = r9.A0B
            X.C28111Yx.A02(r1)
            X.ChN r0 = X.EBS.A06
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 != 0) goto L_0x007c
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            X.BE7.A14(r1, r0, r2)
        L_0x007c:
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r1.set(r0, r3)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.set(r0, r2)
            X.BUt r0 = r9.A0A
            if (r0 == 0) goto L_0x00af
            r7 = 4
            boolean r0 = r9.A02(r7)
            if (r0 == 0) goto L_0x0212
            X.BUt r1 = r9.A0A
            X.CKJ r0 = X.C25971Cpe.A0D
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            X.C26128Csq.A00(r1, r0, r7)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r7)
        L_0x00af:
            android.hardware.camera2.CaptureRequest$Builder r0 = r9.A02
            if (r0 == 0) goto L_0x0256
            X.BUt r0 = r9.A0A
            if (r0 == 0) goto L_0x0256
            X.CjI r1 = r9.A0E
            if (r1 == 0) goto L_0x00d5
            X.CKI r0 = X.C25632CjI.A0P
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x00d5
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            r1.set(r0, r4)
            X.BUt r7 = r9.A0A
            X.CKJ r1 = X.C25971Cpe.A0X
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.C26128Csq.A00(r7, r1, r0)
        L_0x00d5:
            X.CjI r1 = r9.A0E
            if (r1 == 0) goto L_0x00ef
            X.CKI r0 = X.C25632CjI.A0a
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x00ef
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            r1.set(r0, r2)
            X.BUt r1 = r9.A0A
            X.CKJ r0 = X.C25971Cpe.A0Z
            X.C26128Csq.A00(r1, r0, r3)
        L_0x00ef:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x01f4
            X.CjI r1 = r9.A0E
            if (r1 == 0) goto L_0x01f4
            X.CKI r0 = X.C25632CjI.A0Q
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x01f4
            X.EBS r1 = r9.A0B
            if (r1 == 0) goto L_0x01f4
            X.ChN r0 = X.EBS.A08
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x01f4
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r4 = X.C17880vN.A0i()
        L_0x0115:
            r1.set(r0, r4)
            X.BUt r3 = r9.A0A
            X.CKJ r1 = X.C25971Cpe.A0Y
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.C26128Csq.A00(r3, r1, r0)
        L_0x0123:
            android.hardware.camera2.CaptureRequest$Builder r0 = r9.A02
            if (r0 == 0) goto L_0x024f
            X.CjI r0 = r9.A0E
            if (r0 == 0) goto L_0x024f
            X.BUt r0 = r9.A0A
            if (r0 == 0) goto L_0x024f
            X.EBS r1 = r9.A0B
            X.C28111Yx.A02(r1)
            X.ChN r0 = X.EBS.A0F
            java.lang.Object r3 = r1.BMB(r0)
            X.CUf r3 = (X.C25028CUf) r3
            X.CjI r1 = r9.A0E
            X.CKI r0 = X.C25632CjI.A0x
            java.util.List r0 = X.BE6.A11(r0, r1)
            int[] r3 = r3.A00(r0)
            boolean r0 = A03(r0, r3)
            if (r0 == 0) goto L_0x0168
            X.BUt r1 = r9.A0A
            X.CKJ r0 = X.C25971Cpe.A0n
            X.C26128Csq.A00(r1, r0, r3)
            X.CjI r1 = r9.A0E
            X.CKI r0 = X.C25632CjI.A0l
            boolean r0 = X.BE9.A1T(r0, r1)
            android.util.Range r3 = X.BEB.A0M(r3, r0)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.set(r0, r3)
        L_0x0168:
            android.hardware.camera2.CaptureRequest$Builder r0 = r9.A02
            if (r0 == 0) goto L_0x0248
            X.CjI r1 = r9.A0E
            if (r1 == 0) goto L_0x0248
            X.BUs r0 = r9.A09
            if (r0 == 0) goto L_0x0248
            X.CKI r0 = X.C25632CjI.A0F
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x0183
            X.BUs r1 = r9.A09
            X.CKJ r0 = X.C25971Cpe.A0l
            r1.A04(r0)
        L_0x0183:
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r1.set(r0, r2)
            X.CjI r1 = r9.A0E
            X.C28111Yx.A02(r1)
            X.CKI r0 = X.C25632CjI.A0O
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x019f
            android.hardware.camera2.CaptureRequest$Builder r2 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            r0 = 2
            X.BE7.A14(r2, r1, r0)
        L_0x019f:
            X.BUs r2 = r9.A09
            if (r2 == 0) goto L_0x01bb
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.CKJ r0 = X.C25971Cpe.A0J
            java.lang.Object r0 = r2.A04(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01bb
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            X.C28111Yx.A02(r1)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r1.set(r0, r6)
        L_0x01bb:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r1 < r0) goto L_0x01e2
            X.CjI r1 = r9.A0E
            X.C28111Yx.A02(r1)
            X.CKI r0 = X.C25632CjI.A09
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x01e2
            X.EBS r1 = r9.A0B
            if (r1 == 0) goto L_0x01e2
            X.ChN r0 = X.EBS.A0Q
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x01e2
            android.hardware.camera2.CaptureRequest$Builder r2 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            r0 = 6
            X.BE7.A14(r2, r1, r0)
        L_0x01e2:
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.view.Surface r0 = r9.A04
            r1.addTarget(r0)
            X.DEU r0 = r9.A07
            X.C28111Yx.A02(r0)
            r0.A01 = r11
            r9.A06()
            return
        L_0x01f4:
            X.CjI r1 = r9.A0E
            if (r1 == 0) goto L_0x0123
            X.CKI r0 = X.C25632CjI.A0R
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x0123
            X.EBS r1 = r9.A0B
            if (r1 == 0) goto L_0x0123
            X.ChN r0 = X.EBS.A07
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x0123
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            goto L_0x0115
        L_0x0212:
            boolean r0 = r9.A02(r8)
            if (r0 == 0) goto L_0x0228
            X.BUt r1 = r9.A0A
            X.CKJ r0 = X.C25971Cpe.A0D
            X.C26128Csq.A00(r1, r0, r6)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r6)
            goto L_0x00af
        L_0x0228:
            boolean r0 = r9.A02(r5)
            if (r0 == 0) goto L_0x00af
            X.BUt r1 = r9.A0A
            X.CKJ r0 = X.C25971Cpe.A0D
            X.C26128Csq.A00(r1, r0, r4)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r4)
            goto L_0x00af
        L_0x023e:
            android.hardware.camera2.CaptureRequest$Builder r3 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SETTINGS_OVERRIDE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0053
        L_0x0248:
            java.lang.String r0 = "Cannot initialize custom capture settings, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x024f:
            java.lang.String r0 = "Cannot initialize fps settings, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0256:
            java.lang.String r0 = "Cannot initialize stabilization settings, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26225CvG.A07(android.view.Surface, X.CVA, boolean):void");
    }

    public void A08(boolean z) {
        CaptureRequest.Builder builder;
        this.A0I.A00("Cannot update preview builder for CPU frames.");
        C28628EBb eBb = this.A0C;
        if ((eBb == null || eBb.Bge()) && (builder = this.A02) != null && eBb != null) {
            Surface BZw = eBb.BZw();
            C28111Yx.A02(BZw);
            if (z) {
                builder.addTarget(BZw);
                this.A0S = true;
                return;
            }
            builder.removeTarget(BZw);
            this.A0S = false;
        }
    }

    public void A09(boolean z, String str) {
        CaptureRequest.Builder builder;
        this.A0I.A01("Method updatePreviewView must be invoked in the Optic background thread");
        synchronized (A0T) {
            E9T e9t = this.A08;
            if (e9t != null && (builder = this.A02) != null) {
                e9t.CKN(builder.build(), this.A07);
            } else if (z) {
                if (str == null) {
                    str = "Trying to update preview view while preview is closed";
                }
                throw new C27223Da2(str);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.C5E, java.lang.Object] */
    public void A0A(boolean z, boolean z2) {
        E1E e1e;
        C25158Ca9 ca9 = this.A0I;
        ca9.A01("Method restartPreview() must run on the Optic Background Thread.");
        if (this.A07 != null) {
            ca9.A01("Can only check if the prepared on the Optic thread");
            if (ca9.A00) {
                DEU deu = this.A07;
                if (!deu.A0I || deu.A0G != 1) {
                    if (z2) {
                        e1e = this.A0K;
                    } else {
                        e1e = this.A0J;
                    }
                    this.A08 = A04(e1e, z, false);
                    return;
                }
                List list = this.A0P;
                ? obj = new Object();
                obj.A00 = z;
                obj.A01 = z2;
                list.add(obj);
            }
        }
    }

    public C26225CvG(C25850CnB cnB) {
        this.A0O = cnB;
        this.A0I = new C25158Ca9(cnB);
    }
}
