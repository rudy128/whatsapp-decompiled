package X;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: X.Cc7  reason: case insensitive filesystem */
public class C25266Cc7 {
    public C26049CrJ A00;
    public C26049CrJ A01;
    public C26049CrJ A02;
    public C26049CrJ A03;
    public C26049CrJ A04;
    public C26049CrJ A05;
    public C26049CrJ A06;
    public C22735BMy A07;
    public C22735BMy A08;
    public final float[] A09;
    public final Matrix A0A = C108945cZ.A0J();
    public final Matrix A0B;
    public final Matrix A0C;
    public final Matrix A0D;
    public final boolean A0E;

    public Matrix A00() {
        float A0C2;
        PointF A022;
        C40651v3 r2;
        float cos;
        float sin;
        float[] fArr;
        PointF A023;
        Matrix matrix = this.A0A;
        matrix.reset();
        C26049CrJ crJ = this.A03;
        if (!(crJ == null || (A023 = C26049CrJ.A02(crJ)) == null)) {
            float f = A023.x;
            if (!(f == 0.0f && A023.y == 0.0f)) {
                matrix.preTranslate(f, A023.y);
            }
        }
        if (!this.A0E) {
            C26049CrJ crJ2 = this.A04;
            if (crJ2 != null) {
                if (crJ2 instanceof C22732BMv) {
                    A0C2 = C26049CrJ.A01(crJ2);
                } else {
                    A0C2 = ((C22735BMy) crJ2).A0C();
                }
                if (A0C2 != 0.0f) {
                    matrix.preRotate(A0C2);
                }
            }
        } else if (crJ != null) {
            float f2 = crJ.A02;
            PointF A024 = C26049CrJ.A02(crJ);
            float f3 = A024.x;
            float f4 = A024.y;
            crJ.A09(1.0E-4f + f2);
            PointF A025 = C26049CrJ.A02(crJ);
            crJ.A09(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2((double) (A025.y - f4), (double) (A025.x - f3))));
        }
        C22735BMy bMy = this.A07;
        if (bMy != null) {
            C22735BMy bMy2 = this.A08;
            if (bMy2 == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((double) ((-bMy2.A0C()) + 90.0f)));
            }
            C22735BMy bMy3 = this.A08;
            if (bMy3 == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((double) ((-bMy3.A0C()) + 90.0f)));
            }
            float tan = (float) Math.tan(Math.toRadians((double) bMy.A0C()));
            int i = 0;
            do {
                fArr = this.A09;
                fArr[i] = 0.0f;
                i++;
            } while (i < 9);
            fArr[0] = cos;
            fArr[1] = sin;
            float f5 = -sin;
            fArr[3] = f5;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.A0B;
            matrix2.setValues(fArr);
            int i2 = 0;
            do {
                fArr[i2] = 0.0f;
                i2++;
            } while (i2 < 9);
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.A0C;
            matrix3.setValues(fArr);
            int i3 = 0;
            do {
                fArr[i3] = 0.0f;
                i3++;
            } while (i3 < 9);
            fArr[0] = cos;
            fArr[1] = f5;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.A0D;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        C26049CrJ crJ3 = this.A05;
        if (!(crJ3 == null || (r2 = (C40651v3) crJ3.A05()) == null)) {
            float f6 = r2.A00;
            if (!(f6 == 1.0f && r2.A01 == 1.0f)) {
                matrix.preScale(f6, r2.A01);
            }
        }
        C26049CrJ crJ4 = this.A00;
        if (!(crJ4 == null || (A022 = C26049CrJ.A02(crJ4)) == null)) {
            float f7 = A022.x;
            if (!(f7 == 0.0f && A022.y == 0.0f)) {
                matrix.preTranslate(-f7, -A022.y);
            }
        }
        return matrix;
    }

    public Matrix A01(float f) {
        PointF A022;
        C40651v3 r0;
        float f2;
        C26049CrJ crJ = this.A03;
        PointF pointF = null;
        if (crJ == null) {
            A022 = null;
        } else {
            A022 = C26049CrJ.A02(crJ);
        }
        C26049CrJ crJ2 = this.A05;
        if (crJ2 == null) {
            r0 = null;
        } else {
            r0 = (C40651v3) crJ2.A05();
        }
        Matrix matrix = this.A0A;
        matrix.reset();
        if (A022 != null) {
            matrix.preTranslate(A022.x * f, A022.y * f);
        }
        if (r0 != null) {
            double d = (double) f;
            matrix.preScale((float) Math.pow((double) r0.A00, d), (float) Math.pow((double) r0.A01, d));
        }
        C26049CrJ crJ3 = this.A04;
        if (crJ3 != null) {
            float A012 = C26049CrJ.A01(crJ3);
            C26049CrJ crJ4 = this.A00;
            if (crJ4 != null) {
                pointF = C26049CrJ.A02(crJ4);
            }
            float f3 = A012 * f;
            float f4 = 0.0f;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return matrix;
    }

    public void A02(E3k e3k) {
        C26049CrJ crJ = this.A02;
        if (crJ != null) {
            crJ.A0A(e3k);
        }
        C26049CrJ crJ2 = this.A06;
        if (crJ2 != null) {
            crJ2.A0A(e3k);
        }
        C26049CrJ crJ3 = this.A01;
        if (crJ3 != null) {
            crJ3.A0A(e3k);
        }
        C26049CrJ crJ4 = this.A00;
        if (crJ4 != null) {
            crJ4.A0A(e3k);
        }
        C26049CrJ crJ5 = this.A03;
        if (crJ5 != null) {
            crJ5.A0A(e3k);
        }
        C26049CrJ crJ6 = this.A05;
        if (crJ6 != null) {
            crJ6.A0A(e3k);
        }
        C26049CrJ crJ7 = this.A04;
        if (crJ7 != null) {
            crJ7.A0A(e3k);
        }
        C22735BMy bMy = this.A07;
        if (bMy != null) {
            bMy.A0A(e3k);
        }
        C22735BMy bMy2 = this.A08;
        if (bMy2 != null) {
            bMy2.A0A(e3k);
        }
    }

    public void A03(C26642D7p d7p) {
        d7p.A0C(this.A02);
        d7p.A0C(this.A06);
        d7p.A0C(this.A01);
        d7p.A0C(this.A00);
        d7p.A0C(this.A03);
        d7p.A0C(this.A05);
        d7p.A0C(this.A04);
        d7p.A0C(this.A07);
        d7p.A0C(this.A08);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.BMy, X.CrJ] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.BMy, X.CrJ] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C25723Ckt r4, java.lang.Object r5) {
        /*
            r3 = this;
            android.graphics.PointF r0 = X.EBL.A05
            if (r5 != r0) goto L_0x0016
            X.CrJ r0 = r3.A00
            if (r0 != 0) goto L_0x00c8
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.BMv r0 = new X.BMv
            r0.<init>(r4, r1)
            r3.A00 = r0
        L_0x0014:
            r0 = 1
            return r0
        L_0x0016:
            android.graphics.PointF r0 = X.EBL.A06
            if (r5 != r0) goto L_0x002b
            X.CrJ r0 = r3.A03
            if (r0 != 0) goto L_0x00c8
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.BMv r0 = new X.BMv
            r0.<init>(r4, r1)
            r3.A03 = r0
            goto L_0x0014
        L_0x002b:
            java.lang.Float r0 = X.EBL.A0T
            if (r5 != r0) goto L_0x0045
            X.CrJ r2 = r3.A03
            boolean r0 = r2 instanceof X.C22733BMw
            if (r0 == 0) goto L_0x0045
            X.BMw r2 = (X.C22733BMw) r2
            X.Ckt r1 = r2.A00
            if (r1 == 0) goto L_0x003e
            r0 = 0
            r1.A00 = r0
        L_0x003e:
            r2.A00 = r4
        L_0x0040:
            if (r4 == 0) goto L_0x0014
            r4.A00 = r2
            goto L_0x0014
        L_0x0045:
            java.lang.Float r0 = X.EBL.A0U
            if (r5 != r0) goto L_0x005b
            X.CrJ r2 = r3.A03
            boolean r0 = r2 instanceof X.C22733BMw
            if (r0 == 0) goto L_0x005b
            X.BMw r2 = (X.C22733BMw) r2
            X.Ckt r1 = r2.A01
            if (r1 == 0) goto L_0x0058
            r0 = 0
            r1.A00 = r0
        L_0x0058:
            r2.A01 = r4
            goto L_0x0040
        L_0x005b:
            X.1v3 r0 = X.EBL.A08
            if (r5 != r0) goto L_0x0070
            X.CrJ r0 = r3.A05
            if (r0 != 0) goto L_0x00c8
            X.1v3 r1 = new X.1v3
            r1.<init>()
            X.BMv r0 = new X.BMv
            r0.<init>(r4, r1)
            r3.A05 = r0
            goto L_0x0014
        L_0x0070:
            java.lang.Float r0 = X.EBL.A0V
            r2 = 0
            if (r5 != r0) goto L_0x0085
            X.CrJ r0 = r3.A04
            if (r0 != 0) goto L_0x00c8
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            X.BMv r0 = new X.BMv
            r0.<init>(r4, r1)
            r3.A04 = r0
            goto L_0x0014
        L_0x0085:
            java.lang.Integer r0 = X.EBL.A0d
            if (r5 != r0) goto L_0x009c
            X.CrJ r0 = r3.A02
            if (r0 != 0) goto L_0x00c8
            r0 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.BMv r0 = new X.BMv
            r0.<init>(r4, r1)
            r3.A02 = r0
            goto L_0x0014
        L_0x009c:
            java.lang.Float r0 = X.EBL.A0Y
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r5 != r0) goto L_0x00b3
            X.CrJ r0 = r3.A06
            if (r0 != 0) goto L_0x00c8
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.BMv r0 = new X.BMv
            r0.<init>(r4, r1)
            r3.A06 = r0
            goto L_0x0014
        L_0x00b3:
            java.lang.Float r0 = X.EBL.A0S
            if (r5 != r0) goto L_0x00cd
            X.CrJ r0 = r3.A01
            if (r0 != 0) goto L_0x00c8
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.BMv r0 = new X.BMv
            r0.<init>(r4, r1)
            r3.A01 = r0
            goto L_0x0014
        L_0x00c8:
            r0.A0B(r4)
            goto L_0x0014
        L_0x00cd:
            java.lang.Float r0 = X.EBL.A0W
            if (r5 != r0) goto L_0x00ee
            X.BMy r1 = r3.A07
            if (r1 != 0) goto L_0x00e9
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            X.1up r0 = new X.1up
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.BMy r1 = new X.BMy
            r1.<init>(r0)
            r3.A07 = r1
        L_0x00e9:
            r1.A0B(r4)
            goto L_0x0014
        L_0x00ee:
            java.lang.Float r0 = X.EBL.A0X
            if (r5 != r0) goto L_0x010b
            X.BMy r1 = r3.A08
            if (r1 != 0) goto L_0x00e9
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            X.1up r0 = new X.1up
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.BMy r1 = new X.BMy
            r1.<init>(r0)
            r3.A08 = r1
            goto L_0x00e9
        L_0x010b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25266Cc7.A04(X.Ckt, java.lang.Object):boolean");
    }

    public C25266Cc7(C40691v7 r4) {
        C26049CrJ BHA;
        C26049CrJ BHA2;
        C26049CrJ BHA3;
        C26049CrJ BHA4;
        C22735BMy bMy;
        C22735BMy bMy2;
        C40601uy r0 = r4.A07;
        if (r0 == null) {
            BHA = null;
        } else {
            BHA = r0.BHA();
        }
        this.A00 = BHA;
        C40521uq r02 = r4.A09;
        if (r02 == null) {
            BHA2 = null;
        } else {
            BHA2 = r02.BHA();
        }
        this.A03 = BHA2;
        C40661v4 r03 = r4.A08;
        if (r03 == null) {
            BHA3 = null;
        } else {
            BHA3 = r03.BHA();
        }
        this.A05 = BHA3;
        C40561uu r04 = r4.A02;
        if (r04 == null) {
            BHA4 = null;
        } else {
            BHA4 = r04.BHA();
        }
        this.A04 = BHA4;
        C40561uu r05 = r4.A03;
        if (r05 == null) {
            bMy = null;
        } else {
            bMy = (C22735BMy) r05.BHA();
        }
        this.A07 = bMy;
        this.A0E = r4.A00;
        if (bMy != null) {
            this.A0B = C108945cZ.A0J();
            this.A0C = C108945cZ.A0J();
            this.A0D = C108945cZ.A0J();
            this.A09 = new float[9];
        }
        C40561uu r06 = r4.A04;
        if (r06 == null) {
            bMy2 = null;
        } else {
            bMy2 = (C22735BMy) r06.BHA();
        }
        this.A08 = bMy2;
        C40541us r07 = r4.A06;
        if (r07 != null) {
            this.A02 = r07.BHA();
        }
        C40561uu r08 = r4.A05;
        if (r08 != null) {
            this.A06 = r08.BHA();
        } else {
            this.A06 = null;
        }
        C40561uu r09 = r4.A01;
        if (r09 != null) {
            this.A01 = r09.BHA();
        } else {
            this.A01 = null;
        }
    }
}
