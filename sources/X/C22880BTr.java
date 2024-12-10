package X;

import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.BTr  reason: case insensitive filesystem */
public final class C22880BTr extends C3J implements C28554E7f {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final E1F A06;
    public final BTM A07;
    public final float[] A08;
    public final E1G A09;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r5 == r4) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r5 == r4) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d7, code lost:
        if (r3 == r1) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BJL(android.graphics.Canvas r9, X.C25741ClB r10) {
        /*
            r8 = this;
            r3 = 1
            X.C18070vi.A0d(r10, r3)
            android.graphics.Paint r2 = r10.A02
            if (r2 != 0) goto L_0x0012
            r0 = 7
            android.graphics.Paint r2 = X.C108945cZ.A0K(r0)
            X.AnonymousClass3MW.A1P(r2)
            r10.A02 = r2
        L_0x0012:
            X.BTM r7 = r8.A07
            X.BTr r0 = r10.A05
            r1 = 0
            if (r0 == 0) goto L_0x0150
            X.BTM r0 = r0.A07
        L_0x001b:
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 != 0) goto L_0x002e
            if (r7 == 0) goto L_0x014b
            float r6 = r7.A02
            float r5 = r7.A00
            float r4 = r7.A01
            int r0 = r7.A03
            r2.setShadowLayer(r6, r5, r4, r0)
        L_0x002e:
            int r4 = r8.A03
            X.BTr r0 = r10.A05
            if (r0 == 0) goto L_0x0038
            int r0 = r0.A03
            if (r4 == r0) goto L_0x003b
        L_0x0038:
            X.C25904CoG.A01(r4, r2)
        L_0x003b:
            X.E1F r5 = r8.A06
            X.BTr r0 = r10.A05
            if (r0 == 0) goto L_0x0148
            X.E1F r0 = r0.A06
        L_0x0043:
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 != 0) goto L_0x0063
            boolean r0 = r5 instanceof X.BU2
            if (r0 == 0) goto L_0x0137
            android.graphics.Shader r0 = r2.getShader()
            if (r0 == 0) goto L_0x0056
            r2.setShader(r1)
        L_0x0056:
            int r4 = r2.getColor()
            X.BU2 r5 = (X.BU2) r5
            int r0 = r5.A00
            if (r4 == r0) goto L_0x0063
            r2.setColor(r0)
        L_0x0063:
            float r5 = r8.A01
            X.BTr r0 = r10.A05
            if (r0 == 0) goto L_0x012a
            float r4 = r0.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            if (r0 == 0) goto L_0x012a
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x012a
        L_0x0075:
            float r5 = r8.A02
            X.BTr r0 = r10.A05
            if (r0 == 0) goto L_0x011d
            float r4 = r0.A02
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            if (r0 == 0) goto L_0x011d
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x011d
        L_0x0087:
            int r4 = r8.A04
            X.BTr r0 = r10.A05
            if (r0 == 0) goto L_0x0091
            int r0 = r0.A04
            if (r4 == r0) goto L_0x009f
        L_0x0091:
            r0 = 0
            if (r4 != r0) goto L_0x0113
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L_0x0096:
            android.graphics.Paint$Cap r0 = r2.getStrokeCap()
            if (r0 == r4) goto L_0x009f
            r2.setStrokeCap(r4)
        L_0x009f:
            int r4 = r8.A05
            X.BTr r0 = r10.A05
            if (r0 == 0) goto L_0x00a9
            int r0 = r0.A05
            if (r4 == r0) goto L_0x00b7
        L_0x00a9:
            r0 = 0
            if (r4 != r0) goto L_0x010b
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.MITER
        L_0x00ae:
            android.graphics.Paint$Join r0 = r2.getStrokeJoin()
            if (r0 == r3) goto L_0x00b7
            r2.setStrokeJoin(r3)
        L_0x00b7:
            float[] r4 = r8.A08
            if (r4 == 0) goto L_0x0101
            X.BTr r0 = r10.A05
            if (r0 == 0) goto L_0x00c1
            float[] r1 = r0.A08
        L_0x00c1:
            boolean r0 = java.util.Arrays.equals(r4, r1)
            if (r0 == 0) goto L_0x00f6
            float r3 = r8.A00
            X.BTr r0 = r10.A05
            if (r0 == 0) goto L_0x00f6
            float r1 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L_0x00f6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00f6
        L_0x00d9:
            r10.A05 = r8
            X.E1G r1 = r8.A09
            boolean r0 = r1 instanceof X.BU3
            if (r0 == 0) goto L_0x00ec
            X.BU3 r1 = (X.BU3) r1
            r0 = 0
            android.graphics.Path r0 = r10.A00(r1, r0)
            r9.drawPath(r0, r2)
        L_0x00eb:
            return
        L_0x00ec:
            boolean r0 = r1 instanceof X.EDM
            if (r0 == 0) goto L_0x00eb
            X.EDM r1 = (X.EDM) r1
            r1.BJK(r9, r2)
            return
        L_0x00f6:
            float r1 = r8.A00
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r4, r1)
            r2.setPathEffect(r0)
            goto L_0x00d9
        L_0x0101:
            android.graphics.PathEffect r0 = r2.getPathEffect()
            if (r0 == 0) goto L_0x00d9
            r2.setPathEffect(r1)
            goto L_0x00d9
        L_0x010b:
            if (r4 != r3) goto L_0x0110
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            goto L_0x00ae
        L_0x0110:
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.BEVEL
            goto L_0x00ae
        L_0x0113:
            if (r4 != r3) goto L_0x0119
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L_0x0096
        L_0x0119:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L_0x0096
        L_0x011d:
            float r0 = r2.getStrokeMiter()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0087
            r2.setStrokeMiter(r5)
            goto L_0x0087
        L_0x012a:
            float r0 = r2.getStrokeWidth()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            r2.setStrokeWidth(r5)
            goto L_0x0075
        L_0x0137:
            boolean r0 = r5 instanceof X.BU1
            if (r0 == 0) goto L_0x0063
            X.BU1 r5 = (X.BU1) r5
            X.E4m r0 = r5.A00
            android.graphics.Shader r0 = r0.CPS()
            r2.setShader(r0)
            goto L_0x0063
        L_0x0148:
            r0 = r1
            goto L_0x0043
        L_0x014b:
            r2.clearShadowLayer()
            goto L_0x002e
        L_0x0150:
            r0 = r1
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22880BTr.BJL(android.graphics.Canvas, X.ClB):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0073
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = X.C108975cc.A0R(r5)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.primitive.canvas.model.CanvasStroke"
            X.C18070vi.A0z(r5, r0)
            X.BTr r5 = (X.C22880BTr) r5
            X.E1G r1 = r4.A09
            X.E1G r0 = r5.A09
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0067
            X.E1F r1 = r4.A06
            X.E1F r0 = r5.A06
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0067
            int r1 = r4.A03
            int r0 = r5.A03
            if (r1 != r0) goto L_0x0067
            X.BTM r1 = r4.A07
            X.BTM r0 = r5.A07
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0067
            float r1 = r4.A01
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L_0x0067
            int r1 = r4.A05
            int r0 = r5.A05
            if (r1 != r0) goto L_0x0067
            float r1 = r4.A02
            float r0 = r5.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            float[] r1 = r4.A08
            float[] r0 = r5.A08
            if (r1 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x0067
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x006b
        L_0x0067:
            return r2
        L_0x0068:
            if (r0 == 0) goto L_0x006b
            return r2
        L_0x006b:
            float r1 = r4.A00
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
        L_0x0073:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22880BTr.equals(java.lang.Object):boolean");
    }

    public boolean BkE() {
        BTM btm = this.A07;
        int i = this.A03;
        C18460wS r2 = C18460wS.A00;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        if (i == 16 || i == 17 || i == 15 || btm != null) {
            return true;
        }
        if (r2.isEmpty()) {
            return false;
        }
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            if (((C28554E7f) it.next()).BkE()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int A0B = AnonymousClass000.A0B((((AnonymousClass000.A0B((((AnonymousClass000.A0N(this.A06, AnonymousClass000.A0L(this.A09)) + this.A03) * 31) + AnonymousClass001.A0l(this.A07)) * 31, this.A01) + this.A04) * 31) + this.A05) * 31, this.A02);
        float[] fArr = this.A08;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return AnonymousClass000.A0C((A0B + i) * 31, this.A00);
    }

    public C22880BTr(E1F e1f, BTM btm, E1G e1g, float[] fArr, float f, float f2, float f3, int i, int i2, int i3) {
        this.A09 = e1g;
        this.A06 = e1f;
        this.A03 = i;
        this.A07 = btm;
        this.A01 = f;
        this.A04 = i2;
        this.A05 = i3;
        this.A02 = f2;
        this.A08 = fArr;
        this.A00 = f3;
    }
}
