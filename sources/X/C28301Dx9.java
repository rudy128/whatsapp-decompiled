package X;

/* renamed from: X.Dx9  reason: case insensitive filesystem */
public class C28301Dx9 extends AnonymousClass1By {
    public C28336Dxi A00;
    public C28337Dxj A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Dx9, java.lang.Object] */
    public static C28301Dx9 A01(Object obj) {
        if (obj instanceof C28301Dx9) {
            return (C28301Dx9) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A00 = C28336Dxi.A01;
        if (A05.A0K() == 0) {
            obj2.A00 = null;
        } else {
            if (A05.A0M(0) instanceof C28336Dxi) {
                obj2.A00 = C28336Dxi.A02(A05.A0M(0));
            } else {
                obj2.A00 = null;
                obj2.A01 = C28337Dxj.A02(A05.A0M(0));
            }
            if (A05.A0K() > 1) {
                if (obj2.A00 != null) {
                    obj2.A01 = C28337Dxj.A02(A05.A0M(1));
                    return obj2;
                }
                throw AnonymousClass000.A0k("wrong sequence in constructor");
            }
        }
        return obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            X.Dxj r3 = r4.A01
            java.lang.String r0 = "BasicConstraints: isCa("
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r0)
            X.Dxi r0 = r4.A00
            if (r0 == 0) goto L_0x0011
            byte r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r3 != 0) goto L_0x0021
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
        L_0x001c:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0021:
            r2.append(r0)
            java.lang.String r0 = "), pathLenConstraint = "
            r2.append(r0)
            byte[] r1 = r3.A00
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r2.append(r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28301Dx9.toString():java.lang.String");
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        C28336Dxi dxi = this.A00;
        if (dxi != null) {
            A0t.A02(dxi);
        }
        C28337Dxj dxj = this.A01;
        if (dxj != null) {
            A0t.A02(dxj);
        }
        return new C28357Dy3(A0t);
    }
}
