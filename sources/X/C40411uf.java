package X;

/* renamed from: X.1uf  reason: invalid class name and case insensitive filesystem */
public abstract class C40411uf {
    public Object A00(Object obj, Object obj2) {
        return null;
    }

    public boolean A01(Object obj, Object obj2) {
        if (this instanceof C40421ug) {
            C58482kl r4 = (C58482kl) obj;
            C58482kl r5 = (C58482kl) obj2;
            if (r4.A00 == r5.A00) {
                Object obj3 = r4.A02;
                if (((!(obj3 instanceof C39611tM) || !C39611tM.A01((C39611tM) obj3, r5.A02)) && !C42171xk.A00(obj3, r5.A02)) || !C42171xk.A00(r4.A01, r5.A01)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(obj2, 1);
        return obj.equals(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C40421ug
            if (r0 == 0) goto L_0x001b
            X.2kl r4 = (X.C58482kl) r4
            X.2kl r5 = (X.C58482kl) r5
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r5.A01
            boolean r0 = X.C42171xk.A00(r1, r0)
            if (r0 != 0) goto L_0x0019
            boolean r0 = r4.equals(r5)
            r2 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r2 = 1
        L_0x001a:
            return r2
        L_0x001b:
            X.1vq r4 = (X.C41121vq) r4
            X.1vq r5 = (X.C41121vq) r5
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r1 = r4.BTW()
            int r0 = r5.BTW()
            r2 = 0
            if (r1 != r0) goto L_0x001a
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40411uf.A02(java.lang.Object, java.lang.Object):boolean");
    }
}
