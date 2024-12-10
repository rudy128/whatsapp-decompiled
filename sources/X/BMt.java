package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class BMt extends C26639D7m {
    public C26049CrJ A00;
    public final C26049CrJ A01;
    public final C26642D7p A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BMt(X.C38631rd r13, X.C41981xQ r14, X.C26642D7p r15) {
        /*
            r12 = this;
            java.lang.Integer r0 = r14.A05
            int r1 = r0.intValue()
            r2 = 0
            if (r1 == r2) goto L_0x0052
            r0 = 1
            if (r1 == r0) goto L_0x004f
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000e:
            java.lang.Integer r0 = r14.A06
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x004c
            if (r1 == r2) goto L_0x0049
            r0 = 1
            if (r1 == r0) goto L_0x0046
            r4 = 0
        L_0x001d:
            float r11 = r14.A00
            X.1us r8 = r14.A04
            X.1uu r6 = r14.A03
            java.util.List r10 = r14.A08
            X.1uu r7 = r14.A02
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r15
            java.lang.String r0 = r14.A07
            r12.A03 = r0
            boolean r0 = r14.A09
            r12.A04 = r0
            X.1xP r0 = r14.A01
            X.CrJ r0 = r0.BHA()
            r12.A01 = r0
            r0.A0A(r12)
            r15.A0C(r0)
            return
        L_0x0046:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x001d
        L_0x0049:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L_0x001d
        L_0x004c:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x001d
        L_0x004f:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000e
        L_0x0052:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMt.<init>(X.1rd, X.1xQ, X.D7p):void");
    }

    public void BJJ(Canvas canvas, Matrix matrix, int i) {
        if (!this.A04) {
            Paint paint = this.A04;
            AnonymousClass29J r2 = (AnonymousClass29J) this.A01;
            paint.setColor(r2.A0C(r2.A06.BPw(), r2.A03()));
            BEA.A13(paint, this.A00);
            super.BJJ(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.A03;
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        super.BBs(ckt, obj);
        if (obj == EBL.A0c) {
            this.A01.A0B(ckt);
        } else if (obj == EBL.A01) {
            C26049CrJ crJ = this.A00;
            if (crJ != null) {
                this.A02.A0M.remove(crJ);
            }
            if (ckt == null) {
                this.A00 = null;
                return;
            }
            C22732BMv bMv = new C22732BMv(ckt, (Object) null);
            this.A00 = bMv;
            bMv.A0A(this);
            this.A02.A0C(this.A01);
        }
    }
}
