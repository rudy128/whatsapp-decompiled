package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;

/* renamed from: X.CrJ  reason: case insensitive filesystem */
public abstract class C26049CrJ {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = 0.0f;
    public C25723Ckt A03;
    public boolean A04 = false;
    public Object A05 = null;
    public final C28587E9b A06;
    public final List A07 = C17880vN.A0z(1);

    public void A08() {
        int i = 0;
        while (true) {
            List list = this.A07;
            if (i < list.size()) {
                ((E3k) list.get(i)).C9s();
                i++;
            } else {
                return;
            }
        }
    }

    public float A03() {
        C40511up BPw = this.A06.BPw();
        if (BPw == null || BPw.A02()) {
            return 0.0f;
        }
        return BPw.A0B.getInterpolation(A04());
    }

    public float A04() {
        if (this.A04) {
            return 0.0f;
        }
        C40511up BPw = this.A06.BPw();
        if (!BPw.A02()) {
            return (this.A02 - BPw.A01()) / (BPw.A00() - BPw.A01());
        }
        return 0.0f;
    }

    public Object A05() {
        Object A062;
        Interpolator interpolator;
        if (this instanceof C22732BMv) {
            C22732BMv bMv = (C22732BMv) this;
            C25723Ckt ckt = bMv.A03;
            Object obj = bMv.A00;
            float f = bMv.A02;
            return ckt.A01(obj, obj, 0.0f, 0.0f, f, f, f);
        } else if (this instanceof C22733BMw) {
            return ((C22733BMw) this).A0C(0.0f);
        } else {
            float A042 = A04();
            if (this.A03 == null && this.A06.BeC(A042)) {
                return this.A05;
            }
            C40511up BPw = this.A06.BPw();
            Interpolator interpolator2 = BPw.A0C;
            if (interpolator2 == null || (interpolator = BPw.A0D) == null) {
                A062 = A06(BPw, A03());
            } else {
                A062 = A07(BPw, A042, interpolator2.getInterpolation(A042), interpolator.getInterpolation(A042));
            }
            this.A05 = A062;
            return A062;
        }
    }

    public Object A06(C40511up r2, float f) {
        if (this instanceof C22732BMv) {
            return A05();
        }
        return ((C22733BMw) this).A0C(f);
    }

    public Object A07(C40511up r2, float f, float f2, float f3) {
        throw BE6.A0v("This animation does not support split dimensions!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(float r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C22732BMv
            if (r0 == 0) goto L_0x0007
            r4.A02 = r5
        L_0x0006:
            return
        L_0x0007:
            boolean r0 = r4 instanceof X.C22733BMw
            if (r0 == 0) goto L_0x003a
            r3 = r4
            X.BMw r3 = (X.C22733BMw) r3
            X.CrJ r1 = r3.A03
            r1.A09(r5)
            X.CrJ r0 = r3.A04
            r0.A09(r5)
            android.graphics.PointF r2 = r3.A02
            float r1 = A01(r1)
            float r0 = A01(r0)
            r2.set(r1, r0)
            r2 = 0
        L_0x0026:
            java.util.List r1 = r3.A07
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0006
            java.lang.Object r0 = r1.get(r2)
            X.E3k r0 = (X.E3k) r0
            r0.C9s()
            int r2 = r2 + 1
            goto L_0x0026
        L_0x003a:
            X.E9b r3 = r4.A06
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0006
            float r2 = r4.A01
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0050
            float r2 = r3.BZY()
            r4.A01 = r2
        L_0x0050:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            float r2 = r3.BZY()
            r4.A01 = r2
        L_0x005e:
            r5 = r2
        L_0x005f:
            float r0 = r4.A02
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0006
            r4.A02 = r5
            boolean r0 = r3.Bh2(r5)
            if (r0 == 0) goto L_0x0006
            r4.A08()
            return
        L_0x0071:
            float r2 = r4.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007d
            float r2 = r3.BRI()
            r4.A00 = r2
        L_0x007d:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x005f
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            float r2 = r3.BRI()
            r4.A00 = r2
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26049CrJ.A09(float):void");
    }

    public void A0A(E3k e3k) {
        this.A07.add(e3k);
    }

    public void A0B(C25723Ckt ckt) {
        C25723Ckt ckt2 = this.A03;
        if (ckt2 != null) {
            ckt2.A00 = null;
        }
        this.A03 = ckt;
        if (ckt != null) {
            ckt.A00 = this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.E9b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.E9b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.E9b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.E9b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26049CrJ(java.util.List r3) {
        /*
            r2 = this;
            r2.<init>()
            r1 = 1
            java.util.ArrayList r0 = X.C17880vN.A0z(r1)
            r2.A07 = r0
            r0 = 0
            r2.A04 = r0
            r0 = 0
            r2.A02 = r0
            r0 = 0
            r2.A05 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.A01 = r0
            r2.A00 = r0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0027
            X.D7q r0 = new X.D7q
            r0.<init>()
        L_0x0024:
            r2.A06 = r0
            return
        L_0x0027:
            int r0 = r3.size()
            if (r0 != r1) goto L_0x0033
            X.D7r r0 = new X.D7r
            r0.<init>(r3)
            goto L_0x0024
        L_0x0033:
            X.D7s r0 = new X.D7s
            r0.<init>(r3)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26049CrJ.<init>(java.util.List):void");
    }

    public static float A01(C26049CrJ crJ) {
        return ((Number) crJ.A05()).floatValue();
    }

    public static PointF A02(C26049CrJ crJ) {
        return (PointF) crJ.A05();
    }
}
