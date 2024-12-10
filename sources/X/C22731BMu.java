package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.BMu  reason: case insensitive filesystem */
public class C22731BMu extends C26639D7m {
    public C22732BMv A00;
    public final C001100p A01;
    public final C001100p A02;
    public final C26049CrJ A03;
    public final C26049CrJ A04;
    public final C26049CrJ A05;
    public final int A06;
    public final RectF A07;
    public final Integer A08;
    public final String A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22731BMu(X.C38631rd r13, X.C26648D7x r14, X.C26642D7p r15) {
        /*
            r12 = this;
            java.lang.Integer r0 = r14.A07
            int r1 = r0.intValue()
            r2 = 0
            if (r1 == r2) goto L_0x0091
            r0 = 1
            if (r1 == r0) goto L_0x008d
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000e:
            java.lang.Integer r0 = r14.A09
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x008a
            if (r1 == r2) goto L_0x0087
            r0 = 1
            if (r1 == r0) goto L_0x0084
            r4 = 0
        L_0x001d:
            float r11 = r14.A00
            X.1us r8 = r14.A04
            X.1uu r6 = r14.A02
            java.util.List r10 = r14.A0B
            X.1uu r7 = r14.A01
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.00p r0 = new X.00p
            r0.<init>()
            r12.A01 = r0
            X.00p r0 = new X.00p
            r0.<init>()
            r12.A02 = r0
            android.graphics.RectF r0 = X.AnonymousClass3MW.A08()
            r12.A07 = r0
            java.lang.String r0 = r14.A0A
            r12.A09 = r0
            java.lang.Integer r0 = r14.A08
            r12.A08 = r0
            boolean r0 = r14.A0C
            r12.A0A = r0
            X.1tf r0 = r13.A0G
            float r1 = r0.A00()
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            r12.A06 = r0
            X.1vS r0 = r14.A03
            X.CrJ r0 = r0.BHA()
            r12.A03 = r0
            r0.A0A(r12)
            r15.A0C(r0)
            X.1vU r0 = r14.A06
            X.CrJ r0 = r0.BHA()
            r12.A05 = r0
            r0.A0A(r12)
            r15.A0C(r0)
            X.1vU r0 = r14.A05
            X.CrJ r0 = r0.BHA()
            r12.A04 = r0
            r0.A0A(r12)
            r15.A0C(r0)
            return
        L_0x0084:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x001d
        L_0x0087:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L_0x001d
        L_0x008a:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x001d
        L_0x008d:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000e
        L_0x0091:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22731BMu.<init>(X.1rd, X.D7x, X.D7p):void");
    }

    private int A00() {
        float f = this.A05.A02;
        float f2 = (float) this.A06;
        int A042 = BE6.A04(f, f2);
        int A043 = BE6.A04(this.A04.A02, f2);
        int A044 = BE6.A04(this.A03.A02, f2);
        int i = 17;
        if (A042 != 0) {
            i = 527 * A042;
        }
        if (A043 != 0) {
            i = i * 31 * A043;
        }
        if (A044 != 0) {
            return i * 31 * A044;
        }
        return i;
    }

    private int[] A01(int[] iArr) {
        C22732BMv bMv = this.A00;
        if (bMv != null) {
            Integer[] numArr = (Integer[]) bMv.A05();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i < length2) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (i < length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public void BJJ(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.A0A) {
            Matrix matrix2 = matrix;
            BNg(matrix2, this.A07, false);
            Integer num = this.A08;
            Integer num2 = AnonymousClass00R.A00;
            int A002 = A00();
            if (num == num2) {
                C001100p r5 = this.A01;
                long j = (long) A002;
                shader = (Shader) r5.A05(j);
                if (shader == null) {
                    PointF A022 = C26049CrJ.A02(this.A05);
                    PointF A023 = C26049CrJ.A02(this.A04);
                    C40871vQ r4 = (C40871vQ) this.A03.A05();
                    shader = new LinearGradient(A022.x, A022.y, A023.x, A023.y, A01(r4.A01), r4.A00, Shader.TileMode.CLAMP);
                    r5.A0A(j, shader);
                }
            } else {
                C001100p r7 = this.A02;
                long j2 = (long) A002;
                shader = (Shader) r7.A05(j2);
                if (shader == null) {
                    PointF A024 = C26049CrJ.A02(this.A05);
                    PointF A025 = C26049CrJ.A02(this.A04);
                    C40871vQ r2 = (C40871vQ) this.A03.A05();
                    int[] A012 = A01(r2.A01);
                    float[] fArr = r2.A00;
                    float f = A024.x;
                    float f2 = A024.y;
                    shader = new RadialGradient(f, f2, (float) Math.hypot((double) (A025.x - f), (double) (A025.y - f2)), A012, fArr, Shader.TileMode.CLAMP);
                    r7.A0A(j2, shader);
                }
            }
            shader.setLocalMatrix(matrix2);
            this.A04.setShader(shader);
            super.BJJ(canvas, matrix2, i);
        }
    }

    public String getName() {
        return this.A09;
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        super.BBs(ckt, obj);
        if (obj == EBL.A0e) {
            C22732BMv bMv = this.A00;
            if (bMv != null) {
                this.A0G.A0M.remove(bMv);
            }
            if (ckt == null) {
                this.A00 = null;
                return;
            }
            C22732BMv bMv2 = new C22732BMv(ckt, (Object) null);
            this.A00 = bMv2;
            bMv2.A0A(this);
            this.A0G.A0C(this.A00);
        }
    }
}
