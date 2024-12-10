package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.D7f  reason: case insensitive filesystem */
public class C26632D7f implements C28645ECd, E3k, C28646ECe, E3j, C28647ECf {
    public C26636D7j A00;
    public final Matrix A01 = C108945cZ.A0J();
    public final Path A02 = C108945cZ.A0L();
    public final C38631rd A03;
    public final C26049CrJ A04;
    public final C26049CrJ A05;
    public final C25266Cc7 A06;
    public final C26642D7p A07;
    public final String A08;
    public final boolean A09;

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BAN(java.util.ListIterator r8) {
        /*
            r7 = this;
            X.D7j r0 = r7.A00
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r8.previous()
            if (r0 == r7) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
        L_0x0016:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r8.previous()
            r5.add(r0)
            r8.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r5)
            X.1rd r1 = r7.A03
            X.D7p r3 = r7.A07
            boolean r6 = r7.A09
            r2 = 0
            java.lang.String r4 = "Repeater"
            X.D7j r0 = new X.D7j
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26632D7f.BAN(java.util.ListIterator):void");
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        C26049CrJ crJ;
        if (!this.A06.A04(ckt, obj)) {
            if (obj == EBL.A0M) {
                crJ = this.A04;
            } else if (obj == EBL.A0N) {
                crJ = this.A05;
            } else {
                return;
            }
            crJ.A0B(ckt);
        }
    }

    public void BJJ(Canvas canvas, Matrix matrix, int i) {
        float A012 = C26049CrJ.A01(this.A04);
        float A013 = C26049CrJ.A01(this.A05);
        C25266Cc7 cc7 = this.A06;
        float A014 = C26049CrJ.A01(cc7.A06) / 100.0f;
        float A015 = C26049CrJ.A01(cc7.A01) / 100.0f;
        int i2 = (int) A012;
        while (true) {
            i2--;
            if (i2 >= 0) {
                Matrix matrix2 = this.A01;
                matrix2.set(matrix);
                float f = (float) i2;
                matrix2.preConcat(cc7.A01(f + A013));
                PointF pointF = C40761vE.A00;
                this.A00.BJJ(canvas, matrix2, (int) (((float) i) * C17880vN.A00(A015, A014, f / A012)));
            } else {
                return;
            }
        }
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        this.A00.BNg(matrix, rectF, z);
    }

    public Path BWP() {
        Path BWP = this.A00.BWP();
        Path path = this.A02;
        path.reset();
        float A012 = C26049CrJ.A01(this.A04);
        float A013 = C26049CrJ.A01(this.A05);
        int i = (int) A012;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.A01;
            matrix.set(this.A06.A01(((float) i) + A013));
            path.addPath(BWP, matrix);
        }
    }

    public void C9s() {
        this.A03.invalidateSelf();
    }

    public void CIY(List list, List list2) {
        this.A00.CIY(list, list2);
    }

    public String getName() {
        return this.A08;
    }

    public C26632D7f(C38631rd r3, D7v d7v, C26642D7p d7p) {
        this.A03 = r3;
        this.A07 = d7p;
        this.A08 = d7v.A03;
        this.A09 = d7v.A04;
        C26049CrJ BHA = d7v.A00.BHA();
        this.A04 = BHA;
        d7p.A0C(BHA);
        BHA.A0A(this);
        C26049CrJ BHA2 = d7v.A01.BHA();
        this.A05 = BHA2;
        d7p.A0C(BHA2);
        BHA2.A0A(this);
        C25266Cc7 cc7 = new C25266Cc7(d7v.A02);
        this.A06 = cc7;
        cc7.A03(d7p);
        cc7.A02(this);
    }

    public void CFv(C26046CrD crD, C26046CrD crD2, List list, int i) {
        C40761vE.A01(this, crD, crD2, list, i);
        for (int i2 = 0; i2 < this.A00.A04.size(); i2++) {
            E7G e7g = (E7G) this.A00.A04.get(i2);
            if (e7g instanceof C28647ECf) {
                C40761vE.A01((C28647ECf) e7g, crD, crD2, list, i);
            }
        }
    }
}
