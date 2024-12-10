package X;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.CvD  reason: case insensitive filesystem */
public class C26223CvD {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Rect A04;
    public Rect A05;
    public C22907BUs A06;
    public C22908BUt A07;
    public C25632CjI A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public MeteringRectangle[] A0C;
    public MeteringRectangle[] A0D;
    public final Handler A0E = new Handler(Looper.getMainLooper(), new C26370CyW(this, 1));
    public final C25132CZh A0F = new C25132CZh();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r11 < r10) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r11 == r10) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float A01(float r7, float r8, float r9, float r10, float r11) {
        /*
            r6 = 0
            r5 = 1
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x000b
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L_0x000c
        L_0x000b:
            r3 = 1
        L_0x000c:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0027
            return r11
        L_0x0027:
            float r7 = r7 - r8
            float r9 = r9 - r8
            float r7 = r7 / r9
            float r11 = r11 - r10
            float r7 = r7 * r11
            float r7 = r7 + r10
            return r7
        L_0x002e:
            return r10
        L_0x002f:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0076
            java.lang.String r0 = "invalid range bounds"
        L_0x0039:
            r4.append(r0)
            if (r3 == 0) goto L_0x0074
            if (r2 == 0) goto L_0x0074
            java.lang.String r0 = " & "
        L_0x0042:
            r4.append(r0)
            if (r2 == 0) goto L_0x0049
            java.lang.String r1 = "zero source range"
        L_0x0049:
            r4.append(r1)
            java.lang.String r3 = "Camera2Device"
            java.util.Locale r2 = java.util.Locale.US
            r0 = 6
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.BE6.A1T(r1, r7, r6)
            X.BE6.A1T(r1, r8, r5)
            r0 = 2
            X.BE6.A1T(r1, r9, r0)
            r0 = 3
            X.BE6.A1T(r1, r10, r0)
            r0 = 4
            X.BE6.A1T(r1, r11, r0)
            r0 = 5
            X.BE6.A1H(r4, r1, r0)
            java.lang.String r0 = "Projecting zoom value %.3f from [%.2f, %.2f] to [%.2f, %.2f] failed - %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            X.C26175Cts.A02(r3, r0)
            r7 = 0
            return r7
        L_0x0074:
            r0 = r1
            goto L_0x0042
        L_0x0076:
            r0 = r1
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26223CvD.A01(float, float, float, float, float):float");
    }

    private float A00(float f) {
        float A052;
        Object obj;
        List list = this.A0A;
        List list2 = this.A09;
        if (list == null || list2 == null) {
            return 0.0f;
        }
        float A012 = A01(f, -1.0f, 1.0f, (float) this.A03, (float) this.A02);
        double d = (double) A012;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        if (A012 >= 0.0f) {
            A052 = BE9.A05(list, floor) / 100.0f;
            obj = list.get(ceil);
        } else {
            A052 = BE9.A05(list2, -floor) / 100.0f;
            obj = list2.get(-ceil);
        }
        return A01(A012, (float) floor, (float) ceil, A052, AnonymousClass000.A04(obj) / 100.0f);
    }

    public static void A03(C26809DEr dEr, C26225CvG cvG) {
        CaptureRequest.Builder builder;
        C25632CjI cjI;
        float A062 = dEr.A08.A06();
        C26223CvD cvD = dEr.A08;
        Rect rect = cvD.A04;
        MeteringRectangle[] A042 = A04(cvD, cvD.A0D);
        C26223CvD cvD2 = dEr.A08;
        MeteringRectangle[] A043 = A04(cvD2, cvD2.A0C);
        C25158Ca9 ca9 = cvG.A0I;
        ca9.A01("Can only apply zoom on the Optic thread");
        ca9.A01("Can only check if the prepared on the Optic thread");
        if (ca9.A00 && (builder = cvG.A02) != null && (cjI = cvG.A0E) != null) {
            C26225CvG.A01(rect, builder, cjI, A042, A043, A062);
            if (cvG.A0R) {
                cvG.A05();
            }
        }
    }

    public static MeteringRectangle[] A04(C26223CvD cvD, MeteringRectangle[] meteringRectangleArr) {
        C25632CjI cjI = cvD.A08;
        C22907BUs bUs = cvD.A06;
        Rect rect = cvD.A04;
        if (cjI == null || !cvD.A0B) {
            if (bUs == null || rect == null) {
                throw AnonymousClass000.A0n("Creating Metering Rects for zoom with mCameraSettings or mCropRectangle null.");
            } else if (BEA.A09(C25971Cpe.A11, bUs) != 0) {
                return new MeteringRectangle[]{new MeteringRectangle(new Rect(0, 0, rect.width(), rect.height()), 0)};
            }
        }
        return meteringRectangleArr;
    }

    public float A05() {
        C22907BUs bUs = this.A06;
        if (bUs == null) {
            return -1.0f;
        }
        return AnonymousClass000.A04(BE7.A0b(C25971Cpe.A0t, bUs));
    }

    public int A07() {
        C22907BUs bUs = this.A06;
        if (bUs == null) {
            return 0;
        }
        return BEA.A09(C25971Cpe.A11, bUs);
    }

    public Rect A08(Rect rect) {
        Rect rect2 = this.A05;
        Rect rect3 = this.A04;
        if (rect2 == null || rect3 == null) {
            return rect;
        }
        float A022 = BE6.A02(rect3) / BE6.A02(rect2);
        float height = ((float) rect3.height()) / ((float) rect2.height());
        int width = (rect2.width() - rect3.width()) / 2;
        int height2 = (rect2.height() - rect3.height()) / 2;
        int centerX = (int) ((((float) rect.centerX()) * A022) + ((float) width));
        int centerY = (int) ((((float) rect.centerY()) * height) + ((float) height2));
        Rect rect4 = new Rect(centerX, centerY, centerX, centerY);
        rect4.inset((-rect.width()) / 2, (-rect.height()) / 2);
        return rect4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (r2 >= r1) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(float r10, boolean r11) {
        /*
            r9 = this;
            X.CjI r1 = r9.A08
            X.BUs r0 = r9.A06
            X.BUt r6 = r9.A07
            android.graphics.Rect r5 = r9.A05
            android.graphics.Rect r4 = r9.A04
            java.util.List r3 = r9.A0A
            r2 = 0
            if (r0 == 0) goto L_0x001d
            if (r6 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            if (r3 == 0) goto L_0x001d
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x001e
            java.util.List r0 = r9.A09
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            return r2
        L_0x001e:
            if (r4 == 0) goto L_0x001d
            if (r5 == 0) goto L_0x001d
            float r0 = r9.A05()
            float r1 = X.C108945cZ.A00(r10, r0)
            float r0 = r9.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            float r2 = r9.A05()
            float r1 = r9.A01
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0076
            r8 = 1
        L_0x003f:
            int r0 = r3.size()
            r3 = 1
            int r0 = r0 - r3
            float r7 = (float) r0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            float r0 = A01(r10, r2, r1, r0, r7)
            int r2 = (int) r0
            X.CKJ r1 = X.C25971Cpe.A11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.C26128Csq.A00(r6, r1, r0)
            X.CKJ r1 = X.C25971Cpe.A0t
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            X.C26128Csq.A00(r6, r1, r0)
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x0081
            if (r11 != 0) goto L_0x0075
            android.os.Handler r1 = r9.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            android.os.Message r0 = r1.obtainMessage(r3, r2, r3, r0)
            r1.sendMessage(r0)
        L_0x0075:
            return r3
        L_0x0076:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007f
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r8 = 2
            if (r0 < 0) goto L_0x003f
        L_0x007f:
            r8 = 0
            goto L_0x003f
        L_0x0081:
            float r0 = r9.A00(r10)
            A02(r5, r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26223CvD.A09(float, boolean):boolean");
    }

    public static void A02(Rect rect, Rect rect2, float f) {
        int width = rect.width();
        int height = rect.height();
        double d = ((double) f) * 2.0d;
        int i = (int) (((double) width) / d);
        int i2 = (int) (((double) height) / d);
        int i3 = width / 2;
        int i4 = height / 2;
        rect2.set(i3 - i, i4 - i2, i3 + i, i4 + i2);
    }

    public float A06() {
        return A00(A05()) * 100.0f;
    }
}
