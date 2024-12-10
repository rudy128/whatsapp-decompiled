package X;

public abstract class CYD {
    public final int A00;
    public final CYD A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: X.Bm4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: X.Bm4} */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.Bm4] */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object, X.Bm4] */
    /* JADX WARNING: type inference failed for: r1v27, types: [java.lang.Object, X.Bm4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C23575Bm4 A00(X.C23575Bm4 r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.BS9
            if (r0 == 0) goto L_0x0031
            int r2 = r5.A00
            r0 = 1
            if (r2 == r0) goto L_0x001f
            r0 = 2
            X.Bm4 r1 = new X.Bm4
            if (r2 == r0) goto L_0x0027
            r1.<init>()
            r0 = 6
            X.Bm4 r1 = X.C25719Ckp.A01(r1, r6, r0)
        L_0x0016:
            X.CYD r0 = r5.A01
        L_0x0018:
            if (r0 == 0) goto L_0x001e
            X.Bm4 r1 = r0.A01(r1)
        L_0x001e:
            return r1
        L_0x001f:
            X.Bm4 r1 = new X.Bm4
            r1.<init>()
            r0 = 10
            goto L_0x002c
        L_0x0027:
            r1.<init>()
            r0 = 8
        L_0x002c:
            X.Bm4 r1 = X.C25719Ckp.A01(r1, r6, r0)
            goto L_0x0016
        L_0x0031:
            boolean r0 = r5 instanceof X.BS8
            if (r0 == 0) goto L_0x0061
            int r2 = r5.A00
            if (r2 == 0) goto L_0x0059
            r0 = 1
            if (r2 == r0) goto L_0x0051
            r0 = 2
            X.Bm4 r1 = new X.Bm4
            if (r2 == r0) goto L_0x004b
            r1.<init>()
            r0 = 26
        L_0x0046:
            X.Bm4 r1 = X.C25719Ckp.A01(r1, r6, r0)
            goto L_0x0016
        L_0x004b:
            r1.<init>()
            r0 = 28
            goto L_0x0046
        L_0x0051:
            X.Bm4 r1 = new X.Bm4
            r1.<init>()
            r0 = 30
            goto L_0x0046
        L_0x0059:
            X.Bm4 r1 = new X.Bm4
            r1.<init>()
            r0 = 32
            goto L_0x0046
        L_0x0061:
            boolean r0 = r5 instanceof X.BSA
            if (r0 == 0) goto L_0x00c6
            r4 = r5
            X.BSA r4 = (X.BSA) r4
            int r0 = r4.A00
            r3 = 1
            if (r0 != r3) goto L_0x0082
            X.Bm4 r1 = new X.Bm4
            r1.<init>()
            r0 = 18
            X.Bm4 r1 = X.C25719Ckp.A01(r1, r6, r0)
            X.CYD r0 = r4.A01
            if (r0 == 0) goto L_0x0080
            X.Bm4 r1 = r0.A01(r1)
        L_0x0080:
            if (r1 != 0) goto L_0x001e
        L_0x0082:
            int r2 = r4.A00
            if (r2 == 0) goto L_0x00be
            if (r2 == r3) goto L_0x00b6
            r0 = 2
            if (r2 == r0) goto L_0x00ae
            r0 = 3
            if (r2 == r0) goto L_0x00a6
            r0 = 4
            X.Bm4 r1 = new X.Bm4
            if (r2 == r0) goto L_0x00a0
            r1.<init>()
            r0 = 12
        L_0x0098:
            X.Bm4 r1 = X.C25719Ckp.A01(r1, r6, r0)
            X.CYD r0 = r4.A01
            goto L_0x0018
        L_0x00a0:
            r1.<init>()
            r0 = 24
            goto L_0x0098
        L_0x00a6:
            X.Bm4 r1 = new X.Bm4
            r1.<init>()
            r0 = 22
            goto L_0x0098
        L_0x00ae:
            X.Bm4 r1 = new X.Bm4
            r1.<init>()
            r0 = 20
            goto L_0x0098
        L_0x00b6:
            X.Bm4 r1 = new X.Bm4
            r1.<init>()
            r0 = 16
            goto L_0x0098
        L_0x00be:
            X.Bm4 r1 = new X.Bm4
            r1.<init>()
            r0 = 14
            goto L_0x0098
        L_0x00c6:
            int r2 = r5.A00
            r0 = 1
            if (r2 == r0) goto L_0x00da
            r0 = 2
            X.Bm4 r1 = new X.Bm4
            if (r2 == r0) goto L_0x00e2
            r1.<init>()
            r0 = 6
            X.Bm4 r1 = X.C25719Ckp.A01(r1, r6, r0)
            goto L_0x0016
        L_0x00da:
            X.Bm4 r1 = new X.Bm4
            r1.<init>()
            r0 = 8
            goto L_0x00e7
        L_0x00e2:
            r1.<init>()
            r0 = 10
        L_0x00e7:
            X.Bm4 r1 = X.C25719Ckp.A01(r1, r6, r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYD.A00(X.Bm4):X.Bm4");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.Bm4] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.Bm4] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.Bm4] */
    public final C23575Bm4 A01(C23575Bm4 bm4) {
        boolean A1T;
        ? obj;
        C23575Bm4 A012;
        if (bm4 == null) {
            return null;
        }
        C23575Bm4 A002 = A00(bm4);
        if (A002 != null) {
            return A002;
        }
        boolean z = this instanceof BS9;
        if (z) {
            A1T = AnonymousClass000.A1P(this.A00);
        } else if (this instanceof BS8) {
            A1T = AnonymousClass000.A1T(this.A00, 3);
        } else {
            boolean z2 = this instanceof BSA;
            int i = this.A00;
            if (z2) {
                A1T = AnonymousClass000.A1T(i, 5);
            } else {
                A1T = AnonymousClass000.A1T(i, 3);
            }
        }
        if (A1T) {
            return A002;
        }
        if (z) {
            A012 = C25719Ckp.A01(new Object(), bm4, 6);
        } else if (this instanceof BS8) {
            A012 = C25719Ckp.A01(new Object(), bm4, 26);
        } else if (this instanceof BSA) {
            A012 = C25719Ckp.A01(obj, bm4, 12);
        } else {
            obj = new Object();
            A012 = C25719Ckp.A01(obj, bm4, 6);
        }
        CYD cyd = this.A01;
        if (cyd != null) {
            return cyd.A01(A012);
        }
        return A012;
    }

    public CYD(CYD cyd, int i) {
        this.A00 = i;
        this.A01 = cyd;
    }
}
