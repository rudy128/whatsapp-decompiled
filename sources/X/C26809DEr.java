package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.DEr  reason: case insensitive filesystem */
public class C26809DEr implements C28614EAk {
    public static final Map A0t;
    public static volatile C26809DEr A0u;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Matrix A04;
    public Matrix A05;
    public Rect A06;
    public CaptureRequest.Builder A07;
    public C26223CvD A08;
    public C22907BUs A09;
    public C22908BUt A0A;
    public EBS A0B;
    public C28628EBb A0C;
    public EB1 A0D;
    public C25632CjI A0E;
    public C26132Csv A0F;
    public C25119CYs A0G;
    public UUID A0H;
    public FutureTask A0I;
    public boolean A0J;
    public boolean A0K;
    public C26132Csv A0L;
    public boolean A0M;
    public final int A0N;
    public final CameraManager A0O;
    public final CKA A0P = new CKA(this);
    public final CKB A0Q = new CKB(this);
    public final C22902BUn A0R = new C25203Caw();
    public final C26221CvA A0S;
    public final C25267Cc8 A0T;
    public final C25816CmT A0U;
    public final C26225CvG A0V;
    public final C25090CXb A0W;
    public final C25132CZh A0X = new C25132CZh();
    public final C25132CZh A0Y = new C25132CZh();
    public final C25132CZh A0Z = new C25132CZh();
    public final C26035Cqv A0a;
    public final C25850CnB A0b;
    public final Object A0c = C17880vN.A0p();
    public final Callable A0d = new C27132DVt(this, 12);
    public final Context A0e;
    public final E1D A0f = new DEO(this, 1);
    public final CVA A0g = new CVA(this);
    public final CKC A0h = new CKC(this);
    public final CVB A0i = new CVB(this);
    public final CKD A0j = new CKD(this);
    public volatile int A0k;
    public volatile CameraDevice A0l;
    public volatile DEU A0m;
    public volatile C25103CXw A0n;
    public volatile EAW A0o;
    public volatile boolean A0p;
    public volatile boolean A0q;
    public volatile boolean A0r;
    public volatile boolean A0s;

    public void BFe(C6E c6e, EBS ebs, C28611EAf eAf, C25119CYs cYs, String str, int i, int i2) {
        C26175Cts.A00 = 9;
        C26175Cts.A01((Object) null, 9, 0);
        if (this.A0J) {
            this.A0H = this.A0a.A03(this.A0b.A00, str);
        }
        this.A0b.A00(c6e, "connect", new C27127DVo(this, ebs, cYs, i, i2, 1));
        C26175Cts.A01((Object) null, 10, 0);
    }

    public boolean BcX(int i) {
        try {
            return this.A0S.A07(i) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public void BdT(Matrix matrix, int i, int i2, int i3) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        matrix.mapRect(rectF);
        Rect rect = this.A06;
        if (rect == null) {
            rect = (Rect) C25388Cep.A00(this.A0O, this.A0S.A07(i3)).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        RectF rectF2 = new RectF(rect);
        int A082 = A08();
        if (A082 == 90 || A082 == 270) {
            C28111Yx.A02(rect);
            rectF2.set((float) rect.left, (float) rect.top, (float) rect.bottom, (float) rect.right);
        }
        Matrix A0J2 = C108945cZ.A0J();
        A0J2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = 1.0f;
        if (this.A00 == 1) {
            f = -1.0f;
        }
        A0J2.postScale(f, 1.0f, rectF2.width() / 2.0f, 0.0f);
        int abs = Math.abs(A082 / 90);
        Matrix A0J3 = C108945cZ.A0J();
        for (int i4 = 0; i4 < abs; i4++) {
            Matrix A0J4 = C108945cZ.A0J();
            float width = rectF2.width() / 2.0f;
            A0J4.setRotate(-90.0f, width, width);
            A0J4.mapRect(rectF2);
            A0J3.postConcat(A0J4);
        }
        A0J2.postConcat(A0J3);
        this.A05 = A0J2;
    }

    public boolean Bgf() {
        int i;
        CPY[] cpyArr;
        try {
            C26221CvA cvA = this.A0S;
            if (C26221CvA.A04(cvA)) {
                i = C26221CvA.A06;
            } else {
                if (cvA.A05 != null) {
                    cpyArr = cvA.A05;
                } else {
                    cvA.A01.A06("Number of cameras must be loaded on background thread.");
                    C26221CvA.A02(cvA);
                    cpyArr = cvA.A05;
                    C28111Yx.A02(cpyArr);
                }
                i = cpyArr.length;
            }
            return i > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public void BkU() {
    }

    public void CNU(float f) {
        this.A0b.A00((C6E) null, "smooth_zoom_to", new DVX(this, f, 0));
    }

    public static C26809DEr A00(Context context) {
        if (A0u == null) {
            synchronized (C26809DEr.class) {
                if (A0u == null) {
                    A0u = new C26809DEr(context);
                }
            }
        }
        return A0u;
    }

    public static void A01(C26809DEr dEr) {
        dEr.A0b.A06("Method closeCamera() must run on the Optic Background Thread.");
        C25090CXb cXb = dEr.A0W;
        if (cXb.A0D && (!dEr.A0s || cXb.A0C)) {
            cXb.A00();
        }
        A06(dEr, false);
        C25267Cc8 cc8 = dEr.A0T;
        cc8.A0A.A02(false, "Failed to release PreviewController.");
        cc8.A03 = null;
        cc8.A01 = null;
        cc8.A00 = null;
        cc8.A07 = null;
        cc8.A06 = null;
        cc8.A05 = null;
        cc8.A04 = null;
        cc8.A02 = null;
        C25816CmT cmT = dEr.A0U;
        cmT.A0B.A02(false, "Failed to release PhotoCaptureController.");
        cmT.A00 = null;
        cmT.A07 = null;
        cmT.A05 = null;
        cmT.A03 = null;
        cmT.A04 = null;
        cmT.A02 = null;
        cmT.A01 = null;
        cmT.A06 = null;
        E9U e9u = cmT.A08;
        if (e9u != null) {
            e9u.release();
            cmT.A08 = null;
        }
        E9U e9u2 = cmT.A09;
        if (e9u2 != null) {
            e9u2.release();
            cmT.A09 = null;
        }
        cXb.A09.A02(false, "Failed to release VideoCaptureController.");
        cXb.A0B = null;
        cXb.A05 = null;
        cXb.A03 = null;
        cXb.A04 = null;
        cXb.A02 = null;
        cXb.A01 = null;
        if (dEr.A0l != null) {
            C22902BUn bUn = dEr.A0R;
            bUn.A00 = dEr.A0l.getId();
            bUn.A02(0);
            dEr.A0l.close();
            bUn.A00();
        }
        dEr.A0V.A0P.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C26809DEr r13) {
        /*
            X.CvD r6 = r13.A08
            if (r6 == 0) goto L_0x0092
            X.CjI r4 = r13.A0E
            X.C28111Yx.A02(r4)
            X.BUs r1 = r13.A09
            X.BUt r0 = r13.A0A
            android.graphics.Rect r2 = r13.A06
            X.C28111Yx.A02(r2)
            r6.A08 = r4
            r6.A06 = r1
            r6.A07 = r0
            r6.A05 = r2
            int r5 = r2.width()
            int r3 = r2.height()
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1, r1, r5, r3)
            r6.A04 = r0
            X.CKI r0 = X.C25632CjI.A0N
            boolean r0 = X.BE9.A1T(r0, r4)
            r6.A0B = r0
            X.CKI r0 = X.C25632CjI.A0k
            int r0 = X.BE9.A0B(r0, r4)
            r6.A03 = r0
            X.CKI r0 = X.C25632CjI.A17
            java.util.List r0 = X.BE6.A11(r0, r4)
            r6.A09 = r0
            X.CKI r0 = X.C25632CjI.A18
            java.util.List r0 = X.BE6.A11(r0, r4)
            r6.A0A = r0
            X.CKI r0 = X.C25632CjI.A0i
            int r0 = X.BE9.A0B(r0, r4)
            r6.A02 = r0
            int r1 = r2.width()
            int r0 = r2.height()
            int r0 = java.lang.Math.min(r1, r0)
            float r1 = (float) r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r6.A00 = r0
            int r0 = r6.A03
            float r2 = (float) r0
            int r0 = r6.A02
            float r1 = (float) r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 0
            float r0 = X.C26223CvD.A01(r0, r2, r1, r4, r5)
            r6.A01 = r0
            X.BUt r3 = r6.A07
            if (r3 == 0) goto L_0x0092
            int r0 = r6.A07()
            float r2 = (float) r0
            int r0 = r6.A03
            float r1 = (float) r0
            int r0 = r6.A02
            float r0 = (float) r0
            float r0 = X.C26223CvD.A01(r2, r1, r0, r4, r5)
            X.CKJ r1 = X.C25971Cpe.A0t
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.C26128Csq.A00(r3, r1, r0)
        L_0x0092:
            X.Cc8 r12 = r13.A0T
            X.CK9 r7 = new X.CK9
            r7.<init>(r13)
            android.hardware.camera2.CameraManager r6 = r13.A0O
            android.hardware.camera2.CameraDevice r5 = r13.A0l
            X.CjI r4 = r13.A0E
            X.BUs r3 = r13.A09
            X.CvD r1 = r13.A08
            X.CvG r11 = r13.A0V
            X.Ca9 r2 = r12.A0A
            java.lang.String r0 = "Can only prepare the FocusController on the Optic thread."
            r2.A01(r0)
            r12.A03 = r7
            r12.A01 = r6
            r12.A00 = r5
            r12.A07 = r4
            r12.A06 = r3
            r12.A05 = r1
            r12.A04 = r11
            r0 = 0
            r12.A0E = r0
            r1 = 1
            r12.A0D = r1
            java.lang.String r0 = "Failed to prepare FocusController."
            r2.A02(r1, r0)
            X.CXb r10 = r13.A0W
            android.hardware.camera2.CameraDevice r4 = r13.A0l
            X.CjI r3 = r13.A0E
            X.BUs r2 = r13.A09
            X.EBS r0 = r13.A0B
            X.Ca9 r1 = r10.A09
            java.lang.String r9 = "Can prepare only on the Optic thread"
            r1.A01(r9)
            r10.A0B = r4
            r10.A05 = r3
            r10.A03 = r2
            r10.A04 = r0
            r10.A02 = r11
            r10.A01 = r12
            r3 = 1
            java.lang.String r0 = "Failed to prepare VideoCaptureController."
            r1.A02(r3, r0)
            X.CmT r5 = r13.A0U
            android.hardware.camera2.CameraDevice r8 = r13.A0l
            X.CjI r7 = r13.A0E
            X.BUs r6 = r13.A09
            X.EAW r2 = r13.A0o
            X.CvD r0 = r13.A08
            X.EBS r1 = r13.A0B
            X.Ca9 r4 = r5.A0B
            r4.A01(r9)
            r5.A00 = r8
            r5.A07 = r7
            r5.A05 = r6
            r5.A03 = r10
            r5.A04 = r0
            r5.A02 = r11
            r5.A01 = r12
            r5.A06 = r1
            if (r2 == 0) goto L_0x0116
            X.E9U r0 = r2.BX6()
            r5.A08 = r0
            r0 = 0
            r5.A09 = r0
        L_0x0116:
            r2 = 0
            r5.A0A = r2
            if (r1 == 0) goto L_0x016c
            X.C28111Yx.A02(r7)
            X.CKI r0 = X.C25632CjI.A0c
            boolean r0 = X.BE9.A1T(r0, r7)
            if (r0 == 0) goto L_0x0131
            X.EBS r1 = r5.A06
            X.ChN r0 = X.EBS.A0O
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x0131
            r2 = 1
        L_0x0131:
            r5.A0A = r2
            X.EBS r1 = r5.A06
            X.ChN r0 = X.EBS.A05
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 != 0) goto L_0x0141
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x016c
        L_0x0141:
            r0 = 0
            r5.A08 = r0
        L_0x0144:
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0166
            X.E9U r0 = r5.A09
            if (r0 != 0) goto L_0x0153
            X.DEo r0 = new X.DEo
            r0.<init>()
            r5.A09 = r0
        L_0x0153:
            int r0 = r0.BSm()
            X.Csv r0 = r5.A00(r0)
            if (r0 == 0) goto L_0x0166
            X.E9U r2 = r5.A09
            int r1 = r0.A02
            int r0 = r0.A01
            r2.BdE(r1, r0)
        L_0x0166:
            java.lang.String r0 = "Failed to prepare PhotoCaptureController."
            r4.A02(r3, r0)
            return
        L_0x016c:
            X.E9U r1 = r5.A08
            if (r1 != 0) goto L_0x018d
            X.BUs r0 = r5.A05
            if (r0 == 0) goto L_0x01a1
            X.CKJ r1 = X.C25971Cpe.A0i
            java.lang.Object r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x01a1
            X.BUs r0 = r5.A05
            java.lang.Object r0 = r0.A04(r1)
            int r0 = X.AnonymousClass000.A0M(r0)
        L_0x0186:
            X.DEp r1 = new X.DEp
            r1.<init>(r0)
            r5.A08 = r1
        L_0x018d:
            int r0 = r1.BSm()
            X.Csv r0 = r5.A00(r0)
            if (r0 == 0) goto L_0x01a4
            X.E9U r2 = r5.A08
            int r1 = r0.A02
            int r0 = r0.A01
            r2.BdE(r1, r0)
            goto L_0x0144
        L_0x01a1:
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0186
        L_0x01a4:
            java.lang.String r1 = "Invalid picture size"
            X.Da2 r0 = new X.Da2
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26809DEr.A02(X.DEr):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0125, code lost:
        if (A07(r10) != false) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C26809DEr r22, java.lang.Float r23, java.lang.String r24) {
        /*
            r10 = r22
            X.CnB r0 = r10.A0b
            r17 = r0
            java.lang.String r1 = "Method configureAndStartCameraPreview() must run on the Optic Background Thread."
            r0.A06(r1)
            android.hardware.camera2.CameraDevice r0 = r10.A0l
            if (r0 == 0) goto L_0x033d
            X.CjI r0 = r10.A0E
            if (r0 == 0) goto L_0x033d
            X.CYs r0 = r10.A0G
            if (r0 == 0) goto L_0x033d
            X.EAW r0 = r10.A0o
            if (r0 == 0) goto L_0x0335
            X.EB1 r0 = r10.A0D
            if (r0 == 0) goto L_0x032d
            X.EBS r0 = r10.A0B
            if (r0 == 0) goto L_0x0326
            X.BUs r0 = r10.A09
            java.lang.String r16 = "Camera params need to be configured before invoking configureAndStartCameraPreview()"
            if (r0 == 0) goto L_0x0321
            X.BUt r0 = r10.A0A
            if (r0 == 0) goto L_0x0321
            X.CvG r9 = r10.A0V
            boolean r0 = r9.A0R
            r8 = 0
            if (r0 == 0) goto L_0x0037
            A06(r10, r8)
        L_0x0037:
            X.EAW r2 = r10.A0o
            java.util.List r1 = java.util.Collections.emptyList()
            X.EBb r14 = r10.A0C
            if (r14 == 0) goto L_0x0048
            java.util.List r1 = r14.BU3()
            r14.BEv()
        L_0x0048:
            if (r2 == 0) goto L_0x0052
            X.C9c r0 = X.C28628EBb.A00
            java.lang.Object r14 = r2.BVm(r0)
            X.EBb r14 = (X.C28628EBb) r14
        L_0x0052:
            if (r14 != 0) goto L_0x0059
            X.DEe r14 = new X.DEe
            r14.<init>()
        L_0x0059:
            r14.BEv()
            r14.BBI(r1)
            r10.A0C = r14
            android.hardware.camera2.CameraDevice r15 = r10.A0l
            X.BUs r13 = r10.A09
            X.BUt r12 = r10.A0A
            X.EBS r11 = r10.A0B
            X.CjI r7 = r10.A0E
            android.hardware.camera2.CameraManager r1 = r10.A0O
            r18 = r24
            r0 = r18
            android.hardware.camera2.CameraCharacteristics r6 = X.C25388Cep.A00(r1, r0)
            X.EB1 r5 = r10.A0D
            X.CmT r2 = r10.A0U
            X.Ca9 r1 = r2.A0B
            java.lang.String r0 = "Cannot get picture ImageReader, not prepared"
            r1.A00(r0)
            X.E9U r0 = r2.A08
            if (r0 == 0) goto L_0x030a
            android.view.Surface r4 = r0.BZw()
        L_0x0088:
            java.lang.String r0 = "Cannot get raw picture ImageReader, not prepared"
            r1.A00(r0)
            r3 = 0
            java.lang.String r0 = "Cannot get YUV picture ImageReader, not prepared"
            r1.A00(r0)
            X.E9U r0 = r2.A09
            if (r0 == 0) goto L_0x0307
            android.view.Surface r2 = r0.BZw()
        L_0x009b:
            X.Ca9 r1 = r9.A0I
            java.lang.String r0 = "Can only prepare on the Optic thread"
            r1.A01(r0)
            r9.A01 = r15
            r9.A09 = r13
            r9.A0A = r12
            r9.A0B = r11
            r9.A0E = r7
            r9.A00 = r6
            r9.A0D = r5
            r9.A0C = r14
            r9.A03 = r4
            r9.A06 = r2
            X.DEU r0 = new X.DEU
            r0.<init>()
            r9.A07 = r0
            r2 = 1
            java.lang.String r0 = "Failed to prepare PreviewController."
            r1.A02(r2, r0)
            X.CvA r2 = r10.A0S
            r0 = r18
            r2.A06(r0)
            int r12 = r10.A00
            X.CYs r0 = r10.A0G
            int r4 = r0.A01
            int r2 = r0.A00
            X.Csv r0 = new X.Csv
            r0.<init>(r4, r2)
            r10.A0L = r0
            X.Csv r5 = r10.A0F
            if (r5 != 0) goto L_0x00e2
            X.Csv r5 = new X.Csv
            r5.<init>(r8, r8)
        L_0x00e2:
            X.BUs r4 = r10.A09
            X.EBS r2 = r10.A0B
            X.CjI r0 = r10.A0E
            r18 = r2
            r19 = r0
            r20 = r4
            r21 = r5
            r22 = r17
            r17 = r14
            r17.BdB(r18, r19, r20, r21, r22)
            r10.A09()
            X.Csv r4 = r10.A0F
            if (r4 == 0) goto L_0x031c
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "startCameraPreview "
            r2.append(r0)
            int r0 = r4.A02
            X.BE8.A1C(r2, r0)
            int r0 = r4.A01
            java.lang.String r0 = X.C17880vN.A0t(r2, r0)
            android.os.Trace.beginSection(r0)
            X.EBS r2 = r10.A0B
            X.ChN r0 = X.EBS.A0H
            boolean r0 = X.BE9.A1S(r0, r2)
            r7 = 1
            if (r0 != 0) goto L_0x0127
            boolean r0 = A07(r10)
            r6 = 0
            if (r0 == 0) goto L_0x0128
        L_0x0127:
            r6 = 1
        L_0x0128:
            X.BUs r2 = r10.A09
            X.CKJ r0 = X.C25971Cpe.A0J
            boolean r0 = X.BEA.A1X(r0, r2)
            boolean r13 = X.AnonymousClass000.A1O(r0)
            X.EAW r14 = r10.A0o
            X.Csv r0 = r10.A0F
            int r15 = r0.A02
            int r5 = r0.A01
            X.BUs r2 = r10.A09
            X.CKJ r0 = X.C25971Cpe.A0m
            java.lang.Object r0 = r2.A04(r0)
            X.C28111Yx.A02(r0)
            int r4 = r10.A03
            int r2 = r10.A0k
            int r11 = r10.A02
            if (r11 == r7) goto L_0x0303
            r0 = 2
            if (r11 == r0) goto L_0x02ff
            r0 = 3
            r19 = 270(0x10e, float:3.78E-43)
            if (r11 == r0) goto L_0x0159
            r19 = 0
        L_0x0159:
            r21 = 0
            if (r13 == 0) goto L_0x015f
            r21 = 7
        L_0x015f:
            r16 = r5
            r17 = r4
            r18 = r2
            r20 = r12
            android.graphics.SurfaceTexture r11 = r14.Ba0(r15, r16, r17, r18, r19, r20, r21)
            r10.A0r = r7
            X.Cc8 r4 = r10.A0T
            r4.A0C = r8
            if (r11 == 0) goto L_0x02f0
            X.Csv r0 = r10.A0F
            int r2 = r0.A02
            int r0 = r0.A01
            r11.setDefaultBufferSize(r2, r0)
            X.CVA r5 = r10.A0g
            X.EB1 r0 = r9.A0D
            X.C28111Yx.A02(r0)
            android.view.Surface r2 = new android.view.Surface
            r2.<init>(r11)
            X.EB1 r0 = r9.A0D
            X.C28111Yx.A02(r0)
            r9.A07(r2, r5, r7)
        L_0x0190:
            X.CvD r5 = r10.A08
            if (r5 == 0) goto L_0x020e
            java.lang.String r0 = "Cannot get default AF regions."
            r1.A00(r0)
            android.hardware.camera2.params.MeteringRectangle[] r2 = r9.A0H
            java.lang.String r0 = "Cannot get default AE regions."
            r1.A00(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = r9.A0G
            r5.A0D = r2
            r5.A0C = r0
            if (r23 == 0) goto L_0x020e
            X.CvD r8 = r10.A08
            float r11 = r23.floatValue()
            r15 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 / r15
            java.util.List r13 = r8.A0A
            if (r13 == 0) goto L_0x02ed
            java.util.List r12 = r8.A09
            if (r12 == 0) goto L_0x02ed
            int r5 = r8.A03
            int r2 = r8.A02
            int r0 = X.AnonymousClass3MX.A01(r12)
            float r0 = X.BE9.A05(r12, r0)
            float r0 = r0 / r15
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x02b4
            int r0 = r8.A03
        L_0x01cc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r2)
        L_0x01d5:
            int r13 = X.C108965cb.A01(r0)
            int r12 = X.C108965cb.A00(r0)
            if (r12 <= 0) goto L_0x02a3
            java.util.List r0 = r8.A0A
            float r5 = X.BE9.A05(r0, r12)
            float r5 = r5 / r15
            java.util.List r0 = r8.A0A
            java.lang.Object r0 = r0.get(r13)
        L_0x01ec:
            float r14 = X.AnonymousClass000.A04(r0)
            float r14 = r14 / r15
            float r2 = (float) r13
            float r0 = (float) r12
            float r12 = X.C26223CvD.A01(r11, r14, r5, r2, r0)
            int r0 = r8.A03
            float r11 = (float) r0
            int r0 = r8.A02
            float r5 = (float) r0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.C26223CvD.A01(r12, r11, r5, r2, r0)
        L_0x0205:
            boolean r0 = r8.A09(r0, r7)
            if (r0 == 0) goto L_0x020e
            X.C26223CvD.A03(r10, r9)
        L_0x020e:
            java.lang.String r0 = "Cannot get preview request builder."
            r1.A00(r0)
            android.hardware.camera2.CaptureRequest$Builder r0 = r9.A02
            if (r0 == 0) goto L_0x030d
            r10.A07 = r0
            java.lang.String r0 = "Cannot get camera operations callback."
            r1.A00(r0)
            X.DEU r0 = r9.A07
            r10.A0m = r0
            X.E1E r0 = r9.A0K
            r9.A04(r0, r6, r7)
            X.BUs r1 = r10.A09
            X.CKJ r0 = X.C25971Cpe.A0Q
            boolean r0 = X.BEA.A1X(r0, r1)
            if (r0 == 0) goto L_0x0239
            X.DEU r0 = r10.A0m
            X.C28111Yx.A02(r0)
            r4.A03(r0)
        L_0x0239:
            X.CjI r1 = r10.A0E
            X.CKI r0 = X.C25632CjI.A08
            boolean r0 = X.BE9.A1T(r0, r1)
            r4 = 0
            if (r0 == 0) goto L_0x029d
            X.EBS r1 = r10.A0B
            X.ChN r0 = X.EBS.A0R
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x029d
            X.DEU r0 = r10.A0m
            X.C28111Yx.A02(r0)
            X.EBS r1 = r10.A0B
            X.ChN r0 = X.EBS.A0T
            java.lang.Object r0 = r1.BMB(r0)
            long r5 = X.C17880vN.A05(r0)
            X.EBS r1 = r10.A0B
            X.ChN r0 = X.EBS.A0U
            java.lang.Object r0 = r1.BMB(r0)
            int r2 = X.AnonymousClass000.A0M(r0)
            X.EBS r1 = r10.A0B
            X.ChN r0 = X.EBS.A0S
            java.lang.Object r0 = r1.BMB(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            X.DEU.A0M = r5
            X.DEU.A0L = r2
            X.DEU.A0K = r0
            X.DEU r0 = r10.A0m
            X.C28111Yx.A02(r0)
            X.CVB r3 = r10.A0i
        L_0x0284:
            r0.A02 = r3
            X.CjI r1 = r10.A0E
            X.CKI r0 = X.C25632CjI.A09
            boolean r1 = X.BE9.A1T(r0, r1)
            X.DEU r0 = r10.A0m
            X.C28111Yx.A02(r0)
            if (r1 == 0) goto L_0x0297
            X.CKD r4 = r10.A0j
        L_0x0297:
            r0.A03 = r4
            android.os.Trace.endSection()
            return
        L_0x029d:
            X.DEU r0 = r10.A0m
            X.C28111Yx.A02(r0)
            goto L_0x0284
        L_0x02a3:
            java.util.List r2 = r8.A09
            int r0 = -r12
            float r5 = X.BE9.A05(r2, r0)
            float r5 = r5 / r15
            java.util.List r2 = r8.A09
            int r0 = -r13
            java.lang.Object r0 = r2.get(r0)
            goto L_0x01ec
        L_0x02b4:
            float r0 = X.BE9.A05(r13, r2)
            float r0 = r0 / r15
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02c1
            int r0 = r8.A02
            goto L_0x01cc
        L_0x02c1:
            if (r5 >= r2) goto L_0x02da
            if (r5 > 0) goto L_0x02d1
            int r0 = -r5
            float r0 = X.BE9.A05(r12, r0)
            float r0 = r0 / r15
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02da
            if (r5 < 0) goto L_0x02ea
        L_0x02d1:
            float r0 = X.BE9.A05(r13, r5)
            float r0 = r0 / r15
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ea
        L_0x02da:
            int r0 = r8.A03
            if (r5 <= r0) goto L_0x02e0
            int r0 = r5 + -1
        L_0x02e0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = X.C17890vO.A0E(r0, r5)
            goto L_0x01d5
        L_0x02ea:
            int r5 = r5 + 1
            goto L_0x02c1
        L_0x02ed:
            r0 = 0
            goto L_0x0205
        L_0x02f0:
            X.EAW r0 = r10.A0o
            android.view.Surface r2 = r0.BZz()
            if (r2 == 0) goto L_0x0314
            X.CVA r0 = r10.A0g
            r9.A07(r2, r0, r8)
            goto L_0x0190
        L_0x02ff:
            r19 = 180(0xb4, float:2.52E-43)
            goto L_0x0159
        L_0x0303:
            r19 = 90
            goto L_0x0159
        L_0x0307:
            r2 = 0
            goto L_0x009b
        L_0x030a:
            r4 = 0
            goto L_0x0088
        L_0x030d:
            java.lang.String r0 = "Trying to get mPreviewRequestBuilder before configuring preview."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            throw r1
        L_0x0314:
            java.lang.String r0 = "SurfacePipeCoordinator unable to provide surface texture and surface."
            X.Da2 r1 = new X.Da2
            r1.<init>(r0)
            throw r1
        L_0x031c:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r16)
            throw r1
        L_0x0321:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r16)
            throw r1
        L_0x0326:
            java.lang.String r0 = "StartupSettings must be provided to configure preview."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            throw r1
        L_0x032d:
            java.lang.String r0 = "PreviewSetupDelegate must be provided to configure preview."
            X.Da2 r1 = new X.Da2
            r1.<init>(r0)
            throw r1
        L_0x0335:
            java.lang.String r0 = "SurfacePipeCoordinator must be provided to configure preview."
            X.Da2 r1 = new X.Da2
            r1.<init>(r0)
            throw r1
        L_0x033d:
            java.lang.String r0 = "Camera must be opened to configure preview."
            X.Da2 r1 = new X.Da2
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26809DEr.A03(X.DEr, java.lang.Float, java.lang.String):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void A04(X.C26809DEr r9, java.lang.String r10) {
        /*
            X.CnB r8 = r9.A0b
            java.lang.String r0 = "Method openCamera() must run on the Optic Background Thread."
            r8.A06(r0)
            android.content.Context r7 = r9.A0e
            boolean r0 = X.C25391Ces.A00(r7)
            if (r0 == 0) goto L_0x0126
            android.hardware.camera2.CameraDevice r0 = r9.A0l
            if (r0 == 0) goto L_0x0022
            android.hardware.camera2.CameraDevice r0 = r9.A0l
            java.lang.String r0 = r0.getId()
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0125
            A01(r9)
        L_0x0022:
            X.CvG r0 = r9.A0V
            java.util.List r0 = r0.A0P
            r0.clear()
            android.hardware.camera2.CameraManager r2 = r9.A0O
            android.hardware.camera2.CameraCharacteristics r3 = X.C25388Cep.A00(r2, r10)
            X.EBS r1 = r9.A0B
            if (r1 == 0) goto L_0x005c
            X.ChN r0 = X.EBS.A0R
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 != 0) goto L_0x0045
            X.EBS r1 = r9.A0B
            X.ChN r0 = X.EBS.A00
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x005c
        L_0x0045:
            android.hardware.camera2.CameraExtensionCharacteristics r5 = X.C25389Ceq.A00(r2, r10)
        L_0x0049:
            X.CKA r1 = r9.A0P
            X.CKB r0 = r9.A0Q
            X.BFN r2 = new X.BFN
            r2.<init>(r1, r0)
            r0 = 1
            X.Al3 r6 = new X.Al3
            r6.<init>(r9, r2, r10, r0)
            java.lang.String r4 = "open_camera_on_camera_handler_thread"
            monitor-enter(r8)
            goto L_0x005e
        L_0x005c:
            r5 = 0
            goto L_0x0049
        L_0x005e:
            java.util.UUID r0 = r8.A01     // Catch:{ all -> 0x0122 }
            X.C28111Yx.A02(r0)     // Catch:{ all -> 0x0122 }
            X.DcA r1 = new X.DcA     // Catch:{ all -> 0x0122 }
            r1.<init>(r8, r4, r0, r6)     // Catch:{ all -> 0x0122 }
            android.os.Handler r0 = r8.A02     // Catch:{ all -> 0x0122 }
            r0.post(r1)     // Catch:{ all -> 0x0122 }
            monitor-exit(r8)     // Catch:{ all -> 0x0122 }
            X.CvA r0 = r9.A0S
            int r0 = r0.A06(r10)
            r9.A00 = r0
            X.BUq r1 = new X.BUq
            r1.<init>(r7, r3, r5, r0)
            r9.A0E = r1
            if (r5 == 0) goto L_0x00bd
            X.CKI r0 = X.C25632CjI.A08
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x0094
            X.EBS r1 = r9.A0B
            if (r1 == 0) goto L_0x0094
            X.ChN r0 = X.EBS.A0R
            boolean r0 = X.BE9.A1S(r0, r1)
            r4 = 1
            if (r0 != 0) goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            X.CjI r1 = r9.A0E
            X.C28111Yx.A02(r1)
            X.CKI r0 = X.C25632CjI.A07
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x00af
            X.EBS r1 = r9.A0B
            if (r1 == 0) goto L_0x00af
            X.ChN r0 = X.EBS.A00
            boolean r1 = X.BE9.A1S(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            if (r4 != 0) goto L_0x00b4
            if (r0 == 0) goto L_0x00bd
        L_0x00b4:
            X.CjI r1 = r9.A0E
            X.BUp r0 = new X.BUp
            r0.<init>(r5, r1)
            r9.A0E = r0
        L_0x00bd:
            X.CjI r0 = r9.A0E
            X.BUs r1 = new X.BUs
            r1.<init>(r0)
            r9.A09 = r1
            X.BUt r0 = new X.BUt
            r0.<init>(r1)
            r9.A0A = r0
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.getClass()
            int r0 = r0.intValue()
            r9.A03 = r0
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r0 = r3.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r9.A06 = r0
            r2.BDG()
            java.lang.Boolean r0 = r2.A02
            if (r0 == 0) goto L_0x011b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0118
            android.hardware.camera2.CameraDevice r0 = r2.A00
            X.C28111Yx.A02(r0)
            r9.A0l = r0
            X.CXw r3 = r9.A0n
            if (r3 == 0) goto L_0x0125
            X.Cqv r0 = r9.A0a
            java.lang.String r2 = r0.A02()
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0125
            r1 = 6
            X.AkJ r0 = new X.AkJ
            r0.<init>(r1, r2, r3)
            X.C26078Crs.A00(r0)
            return
        L_0x0118:
            X.Da2 r1 = r2.A01
            throw r1
        L_0x011b:
            java.lang.String r0 = "Open Camera operation hasn't completed yet."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            throw r1
        L_0x0122:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0122 }
            throw r1
        L_0x0125:
            return
        L_0x0126:
            java.lang.String r0 = "Open Camera 2 failed: No camera permissions!"
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26809DEr.A04(X.DEr, java.lang.String):void");
    }

    public static void A05(C26809DEr dEr, String str, int i) {
        List list = dEr.A0X.A00;
        UUID uuid = dEr.A0a.A03;
        C25103CXw cXw = dEr.A0n;
        if (cXw != null && !cXw.A00.isEmpty()) {
            C26078Crs.A00(new C21452AkJ(8, str, cXw));
        }
        dEr.A0b.A05(new C21437Ak4(new C27221Da0(i, str), dEr, list, uuid), uuid);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    public static void A06(X.C26809DEr r7, boolean r8) {
        /*
            X.CnB r5 = r7.A0b
            java.lang.String r0 = "Method stopCameraPreview() must run on the Optic Background Thread."
            r5.A06(r0)
            java.lang.Object r6 = X.C26225CvG.A0T
            monitor-enter(r6)
            X.CvG r2 = r7.A0V     // Catch:{ all -> 0x00e4 }
            X.Ca9 r3 = r2.A0I     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "Failed to release PreviewController."
            r1 = 0
            r3.A02(r1, r0)     // Catch:{ all -> 0x00e4 }
            r2.A0R = r1     // Catch:{ all -> 0x00e4 }
            X.EBb r0 = r2.A0C     // Catch:{ all -> 0x00e4 }
            r4 = 0
            if (r0 == 0) goto L_0x0020
            r0.release()     // Catch:{ all -> 0x00e4 }
            r2.A0C = r4     // Catch:{ all -> 0x00e4 }
        L_0x0020:
            X.DEU r0 = r2.A07     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x0028
            r0.A0I = r1     // Catch:{ all -> 0x00e4 }
            r2.A07 = r4     // Catch:{ all -> 0x00e4 }
        L_0x0028:
            if (r8 == 0) goto L_0x006f
            java.lang.String r0 = "Method closeCameraSession must be called on Optic Thread."
            r3.A01(r0)     // Catch:{ Exception -> 0x006f }
            X.E9T r0 = r2.A08     // Catch:{ Exception -> 0x006f }
            if (r0 == 0) goto L_0x0054
            boolean r0 = r0.Bei()     // Catch:{ Exception -> 0x006f }
            if (r0 == 0) goto L_0x0054
        L_0x0039:
            X.DEy r1 = r2.A0L     // Catch:{ Exception -> 0x006f }
            r0 = 2
            r1.A03 = r0     // Catch:{ Exception -> 0x006f }
            X.Caw r3 = r1.A01     // Catch:{ Exception -> 0x006f }
            r0 = 0
            r3.A02(r0)     // Catch:{ Exception -> 0x006f }
            X.CnB r3 = r2.A0O     // Catch:{ Exception -> 0x006f }
            r0 = 17
            X.DVt r1 = new X.DVt     // Catch:{ Exception -> 0x006f }
            r1.<init>((java.lang.Object) r2, (int) r0)     // Catch:{ Exception -> 0x006f }
            java.lang.String r0 = "camera_session_close_on_camera_handler_thread"
            r3.A04(r0, r1)     // Catch:{ Exception -> 0x006f }
            goto L_0x006f
        L_0x0054:
            X.DEy r1 = r2.A0L     // Catch:{ Exception -> 0x006f }
            r0 = 3
            r1.A03 = r0     // Catch:{ Exception -> 0x006f }
            X.Caw r3 = r1.A01     // Catch:{ Exception -> 0x006f }
            r0 = 0
            r3.A02(r0)     // Catch:{ Exception -> 0x006f }
            X.CnB r3 = r2.A0O     // Catch:{ Exception -> 0x006f }
            r0 = 16
            X.DVt r1 = new X.DVt     // Catch:{ Exception -> 0x006f }
            r1.<init>((java.lang.Object) r2, (int) r0)     // Catch:{ Exception -> 0x006f }
            java.lang.String r0 = "camera_session_abort_capture_on_camera_handler_thread"
            r3.A04(r0, r1)     // Catch:{ Exception -> 0x006f }
            goto L_0x0039
        L_0x006f:
            X.EB1 r0 = r2.A0D     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x0075
            r2.A0D = r4     // Catch:{ all -> 0x00e4 }
        L_0x0075:
            android.view.Surface r1 = r2.A04     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x0082
            boolean r0 = r2.A0F     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x0080
            r1.release()     // Catch:{ all -> 0x00e4 }
        L_0x0080:
            r2.A04 = r4     // Catch:{ all -> 0x00e4 }
        L_0x0082:
            X.E9T r0 = r2.A08     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x008b
            r0.close()     // Catch:{ all -> 0x00e4 }
            r2.A08 = r4     // Catch:{ all -> 0x00e4 }
        L_0x008b:
            r2.A05 = r4     // Catch:{ all -> 0x00e4 }
            r2.A02 = r4     // Catch:{ all -> 0x00e4 }
            r2.A0H = r4     // Catch:{ all -> 0x00e4 }
            r2.A0G = r4     // Catch:{ all -> 0x00e4 }
            r2.A01 = r4     // Catch:{ all -> 0x00e4 }
            r2.A09 = r4     // Catch:{ all -> 0x00e4 }
            r2.A0A = r4     // Catch:{ all -> 0x00e4 }
            r2.A0B = r4     // Catch:{ all -> 0x00e4 }
            r2.A0E = r4     // Catch:{ all -> 0x00e4 }
            r2.A00 = r4     // Catch:{ all -> 0x00e4 }
            java.lang.Object r1 = r7.A0c     // Catch:{ all -> 0x00e4 }
            monitor-enter(r1)     // Catch:{ all -> 0x00e4 }
            java.util.concurrent.FutureTask r0 = r7.A0I     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00ab
            r5.A08(r0)     // Catch:{ all -> 0x00e1 }
            r7.A0I = r4     // Catch:{ all -> 0x00e1 }
        L_0x00ab:
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
            r7.A0m = r4     // Catch:{ all -> 0x00e4 }
            r7.A07 = r4     // Catch:{ all -> 0x00e4 }
            r7.A0L = r4     // Catch:{ all -> 0x00e4 }
            X.CmT r1 = r7.A0U     // Catch:{ all -> 0x00e4 }
            r0 = 0
            r1.A0F = r0     // Catch:{ all -> 0x00e4 }
            monitor-exit(r6)     // Catch:{ all -> 0x00e4 }
            X.CXw r1 = r2.A0Q
            if (r1 == 0) goto L_0x00cd
            java.util.concurrent.CopyOnWriteArraySet r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00cd
            r0 = 28
            X.DTh r0 = X.C27082DTh.A00(r1, r0)
            X.C26078Crs.A00(r0)
        L_0x00cd:
            X.CZh r0 = r2.A0N
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e0
            r0 = 26
            X.DTh r0 = X.C27082DTh.A00(r2, r0)
            X.C26078Crs.A00(r0)
        L_0x00e0:
            return
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00e4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26809DEr.A06(X.DEr, boolean):void");
    }

    public static boolean A07(C26809DEr dEr) {
        C28628EBb eBb = dEr.A0C;
        if (eBb == null || !eBb.Bcg()) {
            return false;
        }
        return true;
    }

    public int A08() {
        Number number = (Number) AnonymousClass000.A0w(A0t, this.A02);
        if (number != null) {
            return ((this.A03 - number.intValue()) + 360) % 360;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Invalid display rotation value: ");
        A10.append(this.A02);
        throw AnonymousClass000.A0j(A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r6 == 180) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r6 == 180) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        r1 = r1 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        if (r6 == 90) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r2 = -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        r2 = (float) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r6 == 270) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r2 = r2 - r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r13 = this;
            X.Csv r1 = r13.A0F
            if (r1 == 0) goto L_0x00c5
            X.Csv r0 = r13.A0L
            if (r0 == 0) goto L_0x00c5
            android.graphics.Rect r0 = r13.A06
            if (r0 == 0) goto L_0x00c5
            int r2 = r1.A02
            int r1 = r1.A01
            int r10 = r0.width()
            android.graphics.Rect r0 = r13.A06
            int r3 = r0.height()
            int r6 = r13.A08()
            X.Csv r0 = r13.A0F
            X.Csv r11 = r13.A0L
            int r9 = r0.A02
            int r7 = r0.A01
            int r8 = r9 - r7
            int r5 = r11.A02
            int r4 = r11.A01
            int r0 = r5 - r4
            int r8 = r8 * r0
            if (r8 >= 0) goto L_0x0036
            X.Csv r11 = new X.Csv
            r11.<init>(r4, r5)
        L_0x0036:
            float r8 = (float) r9
            int r0 = r11.A01
            float r5 = (float) r0
            int r0 = r11.A02
            float r4 = (float) r0
            float r0 = r5 / r4
            float r8 = r8 * r0
            int r0 = (int) r8
            if (r0 > r7) goto L_0x00bb
            X.Csv r4 = new X.Csv
            r4.<init>(r9, r0)
        L_0x0048:
            int r0 = r4.A02
            int r0 = r2 - r0
            int r8 = r0 / 2
            int r0 = r4.A01
            int r0 = r1 - r0
            int r7 = r0 / 2
            int r4 = r13.A00
            r0 = 1
            r9 = 180(0xb4, float:2.52E-43)
            r11 = 270(0x10e, float:3.78E-43)
            r12 = 90
            if (r4 != r0) goto L_0x0088
            if (r6 == r12) goto L_0x00ab
            if (r6 == r11) goto L_0x00ab
            float r5 = (float) r2
            float r0 = (float) r10
            float r5 = r5 / r0
            int r0 = -r1
            float r4 = (float) r0
            float r0 = (float) r3
            float r4 = r4 / r0
            int r2 = r2 - r8
            if (r6 == r9) goto L_0x006e
            int r2 = -r8
        L_0x006e:
            float r3 = (float) r2
            if (r6 != r9) goto L_0x0099
        L_0x0071:
            int r1 = -r7
        L_0x0072:
            float r2 = (float) r1
        L_0x0073:
            android.graphics.Matrix r1 = X.C108945cZ.A0J()
            r13.A04 = r1
            float r0 = (float) r6
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r13.A04
            r0.postScale(r5, r4)
            android.graphics.Matrix r0 = r13.A04
            r0.postTranslate(r3, r2)
            return
        L_0x0088:
            if (r6 == r12) goto L_0x009b
            if (r6 == r11) goto L_0x009b
            float r5 = (float) r2
            float r0 = (float) r10
            float r5 = r5 / r0
            float r4 = (float) r1
            float r0 = (float) r3
            float r4 = r4 / r0
            int r2 = r2 - r8
            if (r6 == r9) goto L_0x0096
            int r2 = -r8
        L_0x0096:
            float r3 = (float) r2
            if (r6 != r9) goto L_0x0071
        L_0x0099:
            int r1 = r1 - r7
            goto L_0x0072
        L_0x009b:
            float r5 = (float) r1
            float r0 = (float) r3
            float r5 = r5 / r0
            float r4 = (float) r2
            float r0 = (float) r10
            float r4 = r4 / r0
            int r1 = r1 - r7
            if (r6 == r12) goto L_0x00a5
            int r1 = -r7
        L_0x00a5:
            float r3 = (float) r1
            if (r6 != r12) goto L_0x00b9
        L_0x00a8:
            int r2 = -r8
        L_0x00a9:
            float r2 = (float) r2
            goto L_0x0073
        L_0x00ab:
            int r0 = -r1
            float r5 = (float) r0
            float r0 = (float) r3
            float r5 = r5 / r0
            float r4 = (float) r2
            float r0 = (float) r10
            float r4 = r4 / r0
            int r1 = r1 - r7
            if (r6 == r11) goto L_0x00b6
            int r1 = -r7
        L_0x00b6:
            float r3 = (float) r1
            if (r6 != r11) goto L_0x00a8
        L_0x00b9:
            int r2 = r2 - r8
            goto L_0x00a9
        L_0x00bb:
            float r0 = (float) r7
            float r4 = r4 / r5
            float r0 = r0 * r4
            int r0 = (int) r0
            X.Csv r4 = new X.Csv
            r4.<init>(r0, r7)
            goto L_0x0048
        L_0x00c5:
            java.lang.String r0 = "Method updateDriverToPreviewMatrix() invoked without proper initialisation."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26809DEr.A09():void");
    }

    public void A0A(E9C e9c, C25729Ckz ckz) {
        int i;
        int i2;
        Integer num;
        EBS ebs = this.A0B;
        if (ebs != null) {
            i = AnonymousClass000.A0M(ebs.BMB(EBS.A0P));
        } else {
            i = 0;
        }
        C25816CmT cmT = this.A0U;
        CameraManager cameraManager = this.A0O;
        int i3 = this.A00;
        int i4 = (((this.A0k + 45) / 90) * 90) % 360;
        int i5 = this.A00;
        boolean z = true;
        int i6 = this.A03;
        if (i5 == 1) {
            i2 = (i6 - i4) + 360;
        } else {
            i2 = i6 + i4;
        }
        int i7 = i2 % 360;
        int A082 = A08();
        if (i != 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        CaptureRequest.Builder builder = this.A07;
        EB1 eb1 = this.A0D;
        boolean A072 = A07(this);
        DEU deu = this.A0m;
        C26225CvG cvG = cmT.A02;
        boolean z2 = false;
        if (cvG == null || !cvG.A0R) {
            z = false;
        }
        EBS ebs2 = cmT.A06;
        if (ebs2 != null) {
            if (z || BE9.A1S(EBS.A0D, ebs2)) {
                z2 = true;
            }
            z = z2;
        }
        E9C e9c2 = e9c;
        if (cmT.A00 == null || !z) {
            cmT.A02(e9c2, new C27223Da2("Camera not ready to take photo."));
        } else if (cmT.A0F) {
            cmT.A02(e9c2, new C27223Da2("Cannot take photo, another capture in progress."));
        } else {
            C25090CXb cXb = cmT.A03;
            C28111Yx.A02(cXb);
            if (cXb.A0D) {
                cmT.A02(e9c2, new C27223Da2("Cannot take photo, video recording in progress."));
                return;
            }
            C22907BUs bUs = cmT.A05;
            C28111Yx.A02(bUs);
            int A092 = BEA.A09(C25971Cpe.A0h, bUs);
            C26175Cts.A00 = 19;
            C26175Cts.A01((Object) null, 19, A092);
            cmT.A0F = true;
            C25267Cc8 cc8 = cmT.A01;
            C28111Yx.A02(cc8);
            cc8.A00();
            cmT.A0E.A00(new C22897BUi(cmT, e9c2, 1), "take_photo", new C27131DVs(cameraManager, builder, cmT, deu, eb1, e9c2, ckz, num, i3, i7, A082, A072));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (X.BE9.A1S(X.EBS.A0J, r2.A0B) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.String r18) {
        /*
            r17 = this;
            if (r18 == 0) goto L_0x0182
            r2 = r17
            X.CYs r0 = r2.A0G
            if (r0 == 0) goto L_0x017b
            X.EBS r1 = r2.A0B
            if (r1 == 0) goto L_0x0174
            X.CjI r0 = r2.A0E
            if (r0 == 0) goto L_0x016d
            X.BUs r0 = r2.A09
            if (r0 == 0) goto L_0x0166
            X.BUt r0 = r2.A0A
            if (r0 == 0) goto L_0x0166
            X.EB1 r0 = r2.A0D
            if (r0 == 0) goto L_0x015f
            X.ChN r0 = X.EBS.A0Z
            java.lang.Object r9 = r1.BMB(r0)
            X.E9B r9 = (X.E9B) r9
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            r8 = 1
            if (r1 < r0) goto L_0x0040
            X.CjI r1 = r2.A0E
            X.CKI r0 = X.C25632CjI.A0X
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x0040
            X.EBS r1 = r2.A0B
            X.ChN r0 = X.EBS.A0J
            boolean r0 = X.BE9.A1S(r0, r1)
            r7 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            X.EBS r1 = r2.A0B
            X.ChN r0 = X.EBS.A0W
            java.lang.Object r10 = r1.BMB(r0)
            X.BzS r10 = (X.C24331BzS) r10
            X.EBS r1 = r2.A0B
            X.ChN r0 = X.EBS.A0b
            java.lang.Object r11 = r1.BMB(r0)
            X.BzS r11 = (X.C24331BzS) r11
            X.CjI r1 = r2.A0E
            X.CKI r0 = X.C25632CjI.A0z
            java.util.List r14 = X.BE6.A11(r0, r1)
            X.CjI r1 = r2.A0E
            if (r7 == 0) goto L_0x014d
            X.CKI r0 = X.C25632CjI.A14
        L_0x0063:
            java.util.List r12 = X.BE6.A11(r0, r1)
            X.CjI r1 = r2.A0E
            X.CKI r0 = X.C25632CjI.A0p
            r1.A02(r0)
            X.CjI r1 = r2.A0E
            X.CKI r0 = X.C25632CjI.A15
            java.util.List r13 = X.BE6.A11(r0, r1)
            X.CYs r0 = r2.A0G
            int r15 = r0.A01
            int r0 = r0.A00
            r2.A08()
            r16 = r0
            X.CPa r6 = r9.BOy(r10, r11, r12, r13, r14, r15, r16)
            X.Csv r5 = r6.A01
            if (r5 == 0) goto L_0x0158
            X.Csv r3 = r6.A00
            if (r3 == 0) goto L_0x0151
            r2.A0F = r5
            X.BUt r4 = r2.A0A
            X.CKJ r1 = X.C25971Cpe.A0q
            X.Csq r0 = r4.A00
            r0.A04(r1, r5)
            X.CKJ r1 = X.C25971Cpe.A0i
            r0 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x00a0
            r0 = 4101(0x1005, float:5.747E-42)
        L_0x00a0:
            X.C26128Csq.A02(r1, r4, r0)
            X.CKJ r1 = X.C25971Cpe.A0k
            X.Csq r0 = r4.A00
            r0.A04(r1, r3)
            X.CKJ r3 = X.C25971Cpe.A0y
            X.Csv r1 = r6.A02
            if (r1 != 0) goto L_0x00b1
            r1 = r5
        L_0x00b1:
            X.Csq r0 = r4.A00
            r0.A04(r3, r1)
            X.CKJ r3 = X.C25971Cpe.A0U
            boolean r0 = r2.A0p
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.Csq r0 = r4.A00
            r0.A04(r3, r1)
            X.CKJ r1 = X.C25971Cpe.A0Q
            java.lang.Boolean r3 = X.AnonymousClass000.A0h()
            X.Csq r0 = r4.A00
            r0.A04(r1, r3)
            X.CKJ r1 = X.C25971Cpe.A0M
            X.Csq r0 = r4.A00
            r0.A04(r1, r3)
            X.CKJ r1 = X.C25971Cpe.A02
            X.CYs r0 = r2.A0G
            java.util.HashMap r0 = r0.A03
            if (r0 != 0) goto L_0x00e1
            java.util.HashMap r0 = X.C17880vN.A11()
        L_0x00e1:
            X.C26128Csq.A00(r4, r1, r0)
            X.CjI r1 = r2.A0E
            X.CKI r0 = X.C25632CjI.A13
            java.util.List r4 = X.BE6.A11(r0, r1)
            r0 = 5
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r0 = r4.contains(r3)
            if (r0 == 0) goto L_0x010d
            X.EBS r1 = r2.A0B
            if (r1 == 0) goto L_0x010d
            X.ChN r0 = X.EBS.A0a
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x010d
            X.BUt r0 = r2.A0A
            X.CKJ r1 = X.C25971Cpe.A0v
            X.Csq r0 = r0.A00
            r0.A04(r1, r3)
        L_0x010d:
            X.BUt r4 = r2.A0A
            X.CKJ r3 = X.C25971Cpe.A0J
            X.CjI r1 = r2.A0E
            if (r1 == 0) goto L_0x014b
            X.CKI r0 = X.C25632CjI.A0J
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x014b
            X.EBS r1 = r2.A0B
            if (r1 == 0) goto L_0x014b
            X.ChN r0 = X.EBS.A0G
            boolean r0 = X.BE9.A1S(r0, r1)
            if (r0 == 0) goto L_0x014b
            boolean r0 = r2.A0q
            if (r0 == 0) goto L_0x014b
        L_0x012d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            X.Csq r0 = r4.A00
            r0.A04(r3, r1)
            X.BUt r2 = r2.A0A
            X.Csq r0 = r2.A00
            X.CXe r1 = r0.A03()
            X.Csq r0 = new X.Csq
            r0.<init>()
            r2.A00 = r0
            X.BUs r0 = r2.A00
            r0.A06(r1)
            return
        L_0x014b:
            r8 = 0
            goto L_0x012d
        L_0x014d:
            X.CKI r0 = X.C25632CjI.A0v
            goto L_0x0063
        L_0x0151:
            java.lang.String r0 = "Invalid picture size: 'null'"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0158:
            java.lang.String r0 = "Invalid preview size: 'null'"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x015f:
            java.lang.String r0 = "Trying to setup camera params without instantiating PreviewSetupDelegate."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0166:
            java.lang.String r0 = "Trying to setup camera params without instantiating CameraSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x016d:
            java.lang.String r0 = "Trying to setup camera params without a Capabilities."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0174:
            java.lang.String r0 = "Trying to setup camera params without a StartupSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x017b:
            java.lang.String r0 = "Trying to setup camera params without a CameraDeviceConfig."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0182:
            java.lang.String r1 = "Camera ID must be provided to setup camera params."
            X.Da2 r0 = new X.Da2
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26809DEr.A0B(java.lang.String):void");
    }

    public void BBB(CJP cjp) {
        this.A0X.A01(cjp);
    }

    public void BBF(BCw bCw) {
        if (this.A0n == null) {
            this.A0n = new C25103CXw();
            this.A0V.A0Q = this.A0n;
        }
        this.A0n.A00.add(bCw);
    }

    public void BBU(E4h e4h) {
        if (e4h != null) {
            C28628EBb eBb = this.A0C;
            if (eBb != null) {
                boolean z = !A07(this);
                boolean BBH = eBb.BBH(e4h);
                if (z && BBH && eBb.Bge()) {
                    this.A0b.A07("restart_preview_to_resume_cpu_frames", new C27132DVt(this, 9));
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k("Cannot add null OnPreviewFrameListener.");
    }

    public void BBV(E4i e4i) {
        if (e4i != null) {
            this.A0V.A0M.A01(e4i);
            return;
        }
        throw AnonymousClass000.A0k("Cannot add null OnPreviewStartedListener.");
    }

    public int BDs(int i, int i2) {
        return this.A0S.A05(i, this.A03, i2);
    }

    public boolean BIp(C6E c6e) {
        C26175Cts.A01((Object) null, 23, 0);
        C26035Cqv cqv = this.A0a;
        UUID uuid = cqv.A03;
        C26225CvG cvG = this.A0V;
        cvG.A0M.A00();
        cvG.A0N.A00();
        C28628EBb eBb = this.A0C;
        this.A0C = null;
        if (eBb != null) {
            eBb.BEv();
        }
        this.A0Y.A00();
        this.A0Z.A00();
        C26223CvD cvD = this.A08;
        if (cvD != null) {
            cvD.A0F.A00();
        }
        this.A0p = false;
        if (this.A0J) {
            cqv.A05(this.A0H);
            this.A0H = null;
        }
        C25850CnB cnB = this.A0b;
        cnB.A00(c6e, "disconnect", new DVY(this, uuid, 11));
        cnB.A07("disconnect_guard", new DVQ(1));
        return true;
    }

    public void BLR(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0N;
        rect.inset(i3, i3);
        this.A0b.A00(new C22901BUm(this, 13), "focus", new DVY(this, rect, 10));
    }

    public int BZ0() {
        return this.A03;
    }

    public boolean Bfx() {
        return !this.A0V.A0R;
    }

    public boolean Bg9() {
        return this.A0W.A0D;
    }

    public boolean Bil(float[] fArr) {
        Matrix matrix = this.A05;
        if (matrix == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    public void Bk3(C6E c6e, C25093CXe cXe) {
        this.A0b.A00(c6e, "modify_settings_on_background_thread", new DVY(this, cXe, 12));
    }

    public void Bzj(int i) {
        if (!this.A0M) {
            this.A0k = i;
            EAW eaw = this.A0o;
            if (eaw != null) {
                eaw.BrQ(this.A0k);
            }
        }
    }

    public void CDk(View view, String str) {
        if (this.A0n != null) {
            C25103CXw cXw = this.A0n;
            if (!cXw.A00.isEmpty()) {
                C26078Crs.A00(new C21459AkQ(cXw, view, str, 3));
            }
        }
    }

    public void CEi(CJP cjp) {
        this.A0X.A02(cjp);
    }

    public void CEl(BCw bCw) {
        if (this.A0n != null) {
            this.A0n.A00.remove(bCw);
            if (!C17880vN.A1X(this.A0n.A00)) {
                this.A0n = null;
                this.A0V.A0Q = null;
            }
        }
    }

    public void CEs(E4h e4h) {
        C28628EBb eBb = this.A0C;
        if (e4h != null && eBb != null && eBb.CEm(e4h) && !A07(this) && eBb.Bge()) {
            synchronized (this.A0c) {
                FutureTask futureTask = this.A0I;
                if (futureTask != null) {
                    this.A0b.A08(futureTask);
                }
                this.A0I = this.A0b.A02("restart_preview_if_to_stop_cpu_frames", this.A0d, 200);
            }
        }
    }

    public void CEt(E4i e4i) {
        if (e4i != null) {
            this.A0V.A0M.A02(e4i);
        }
    }

    public void CIC(Handler handler) {
        this.A0b.A00 = handler;
    }

    public void CIz(C28500E4g e4g) {
        this.A0T.A02 = e4g;
    }

    public void CJQ(boolean z) {
        this.A0M = z;
        if (z) {
            this.A0k = 0;
            EAW eaw = this.A0o;
            if (eaw != null) {
                eaw.BrQ(this.A0k);
            }
        }
    }

    public void CJh(AnonymousClass86M r2) {
        this.A0a.A04(r2);
    }

    public void CK5(C6E c6e, int i) {
        this.A02 = i;
        this.A0b.A00(c6e, "set_rotation", new C27132DVt(this, 8));
    }

    public void CLX(C6E c6e, int i) {
        this.A0b.A00(c6e, "set_zoom_level", new DVV(this, i, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r4 == 180) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean CLb(android.graphics.Matrix r7, int r8, int r9, int r10, int r11, boolean r12) {
        /*
            r6 = this;
            X.Csv r0 = r6.A0F
            if (r0 == 0) goto L_0x007c
            r7.reset()
            float r1 = (float) r8
            float r0 = (float) r9
            r5 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r5, r5, r1, r0)
            int r4 = r6.A03
            if (r4 == 0) goto L_0x0019
            r2 = 180(0xb4, float:2.52E-43)
            float r1 = (float) r11
            float r0 = (float) r10
            if (r4 != r2) goto L_0x001b
        L_0x0019:
            float r1 = (float) r10
            float r0 = (float) r11
        L_0x001b:
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r5, r5, r1, r0)
            float r5 = r3.centerX()
            float r4 = r3.centerY()
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0061
            float r0 = r2.centerX()
            float r1 = r5 - r0
            float r0 = r2.centerY()
            float r0 = r4 - r0
            r2.offset(r1, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL
            r7.setRectToRect(r3, r2, r0)
            int r0 = java.lang.Math.max(r8, r9)
            float r2 = (float) r0
            int r0 = java.lang.Math.max(r10, r11)
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = java.lang.Math.min(r8, r9)
            float r1 = (float) r0
            int r0 = java.lang.Math.min(r10, r11)
            float r0 = (float) r0
            float r1 = r1 / r0
            if (r12 == 0) goto L_0x0077
            float r0 = java.lang.Math.max(r2, r1)
        L_0x005e:
            r7.postScale(r0, r0, r5, r4)
        L_0x0061:
            int r3 = r6.A02
            r2 = 2
            r1 = 1
            if (r3 == r1) goto L_0x0072
            r0 = 3
            if (r3 == r0) goto L_0x0072
            if (r3 != r2) goto L_0x0071
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x006e:
            r7.postRotate(r0, r5, r4)
        L_0x0071:
            return r1
        L_0x0072:
            int r3 = r3 - r2
            int r0 = r3 * 90
            float r0 = (float) r0
            goto L_0x006e
        L_0x0077:
            float r0 = java.lang.Math.min(r2, r1)
            goto L_0x005e
        L_0x007c:
            java.lang.String r0 = "Camera params need to be configured before invoking setupViewTransformMatrix()"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26809DEr.CLb(android.graphics.Matrix, int, int, int, int, boolean):boolean");
    }

    public void CNa(C6E c6e, int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0N;
        rect.inset(i3, i3);
        this.A0b.A00(c6e, "spot_meter", new DVY(this, rect, 9));
    }

    public void COR(C6E c6e, File file) {
        Exception A0n2;
        C25090CXb cXb = this.A0W;
        String absolutePath = file.getAbsolutePath();
        int i = this.A00;
        int i2 = this.A03;
        int i3 = this.A0k;
        EAW eaw = this.A0o;
        E1D e1d = this.A0f;
        CaptureRequest.Builder builder = this.A07;
        boolean A072 = A07(this);
        DEU deu = this.A0m;
        C26225CvG cvG = cXb.A02;
        C6E c6e2 = c6e;
        if (cvG == null || !cvG.A0R || cXb.A03 == null) {
            A0n2 = AnonymousClass000.A0n("Cannot start recording video, camera is not ready or has been closed.");
        } else if (cXb.A0D) {
            A0n2 = AnonymousClass000.A0n("Cannot start recording video, there is a video already being recorded");
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C22907BUs bUs = cXb.A03;
            CKJ ckj = C25971Cpe.A0y;
            Object A042 = bUs.A04(ckj);
            C22907BUs bUs2 = cXb.A03;
            if (A042 == null) {
                ckj = C25971Cpe.A0q;
            }
            C26132Csv csv = (C26132Csv) bUs2.A04(ckj);
            if (absolutePath == null) {
                A0n2 = AnonymousClass000.A0k("Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value");
            } else {
                cXb.A0D = true;
                cXb.A0C = false;
                cXb.A0A.A00(new C22900BUl(builder, c6e2, cXb, deu, A072), "start_video_recording", new C27130DVr(builder, e1d, cXb, deu, csv, eaw, absolutePath, i, i2, i3, elapsedRealtime));
                return;
            }
        }
        c6e2.A00(A0n2);
    }

    public void COc(C6E c6e) {
        C25090CXb cXb = this.A0W;
        CaptureRequest.Builder builder = this.A07;
        A07(this);
        DEU deu = this.A0m;
        if (!cXb.A0D) {
            c6e.A00(AnonymousClass000.A0n("Not recording video."));
            return;
        }
        cXb.A0A.A00(c6e, "stop_video_capture", new C27120DVg(builder, cXb, deu, SystemClock.elapsedRealtime()));
    }

    public void COv(C6E c6e) {
        int i = this.A00;
        C26175Cts.A00 = 14;
        C26175Cts.A01((Object) null, 14, i);
        this.A0b.A00(c6e, "switch_camera", new C27132DVt(this, 11));
    }

    public void CP1(E9C e9c, C25729Ckz ckz) {
        C22907BUs bUs = this.A09;
        if (bUs != null) {
            CKJ ckj = C25971Cpe.A0e;
            Number number = (Number) bUs.A04(ckj);
            if (number != null && number.intValue() == 2) {
                C26128Csq csq = new C26128Csq();
                csq.A04(ckj, C17880vN.A0h());
                Bk3(new C22899BUk(e9c, ckz, this, 1), csq.A03());
                return;
            }
        }
        A0A(e9c, ckz);
    }

    public int getCameraFacing() {
        return this.A00;
    }

    public int getZoomLevel() {
        C26223CvD cvD = this.A08;
        if (cvD == null) {
            return -1;
        }
        return cvD.A07();
    }

    public boolean isConnected() {
        if (this.A0l == null || !this.A0r) {
            return false;
        }
        return true;
    }

    static {
        HashMap A11 = C17880vN.A11();
        A0t = A11;
        Integer A0f2 = AnonymousClass3MY.A0f();
        A11.put(A0f2, A0f2);
        C17890vO.A0z(C17880vN.A0h(), A11, 90);
        C17890vO.A0z(C17880vN.A0i(), A11, 180);
        C17890vO.A0z(C17880vN.A0j(), A11, 270);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.BUn, X.Caw] */
    public C26809DEr(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A0e = applicationContext;
        C25850CnB cnB = new C25850CnB();
        this.A0b = cnB;
        C26035Cqv cqv = new C26035Cqv(cnB);
        this.A0a = cqv;
        CameraManager cameraManager = (CameraManager) applicationContext.getSystemService("camera");
        this.A0O = cameraManager;
        C26221CvA cvA = new C26221CvA(applicationContext.getPackageManager(), cameraManager, cqv, cnB);
        this.A0S = cvA;
        this.A0U = new C25816CmT(cqv, cnB);
        this.A0W = new C25090CXb(cvA, cnB);
        this.A0N = Math.round(TypedValue.applyDimension(1, 30.0f, C108965cb.A08(context)));
        this.A0T = new C25267Cc8(cnB);
        this.A0V = new C26225CvG(cnB);
    }

    public C25632CjI BOK() {
        C25632CjI cjI;
        if (isConnected() && (cjI = this.A0E) != null) {
            return cjI;
        }
        throw new C27206DZg("Cannot get camera capabilities");
    }

    public C25971Cpe BZ5() {
        C22907BUs bUs;
        if (isConnected() && (bUs = this.A09) != null) {
            return bUs;
        }
        throw new C27206DZg("Cannot get camera settings");
    }
}
