package X;

/* renamed from: X.1qR  reason: invalid class name and case insensitive filesystem */
public class C37941qR {
    public final C001100p A00 = new C001100p();
    public final AnonymousClass00O A01 = new AnonymousClass00O(0);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.1xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.1xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.1xV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C57072iU r4, X.C42011xT r5) {
        /*
            r3 = this;
            X.00O r2 = r3.A01
            java.lang.Object r1 = r2.get(r5)
            X.1xV r1 = (X.C42031xV) r1
            if (r1 != 0) goto L_0x001c
            X.1bR r0 = X.C42031xV.A03
            java.lang.Object r1 = r0.BAf()
            X.1xV r1 = (X.C42031xV) r1
            if (r1 != 0) goto L_0x0019
            X.1xV r1 = new X.1xV
            r1.<init>()
        L_0x0019:
            r2.put(r5, r1)
        L_0x001c:
            r1.A01 = r4
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37941qR.A00(X.2iU, X.1xT):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.1xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.1xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.1xV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C57072iU r4, X.C42011xT r5) {
        /*
            r3 = this;
            X.00O r2 = r3.A01
            java.lang.Object r1 = r2.get(r5)
            X.1xV r1 = (X.C42031xV) r1
            if (r1 != 0) goto L_0x001c
            X.1bR r0 = X.C42031xV.A03
            java.lang.Object r1 = r0.BAf()
            X.1xV r1 = (X.C42031xV) r1
            if (r1 != 0) goto L_0x0019
            X.1xV r1 = new X.1xV
            r1.<init>()
        L_0x0019:
            r2.put(r5, r1)
        L_0x001c:
            r1.A02 = r4
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37941qR.A01(X.2iU, X.1xT):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.1xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.1xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.1xV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C42011xT r4) {
        /*
            r3 = this;
            X.00O r2 = r3.A01
            java.lang.Object r1 = r2.get(r4)
            X.1xV r1 = (X.C42031xV) r1
            if (r1 != 0) goto L_0x001c
            X.1bR r0 = X.C42031xV.A03
            java.lang.Object r1 = r0.BAf()
            X.1xV r1 = (X.C42031xV) r1
            if (r1 != 0) goto L_0x0019
            X.1xV r1 = new X.1xV
            r1.<init>()
        L_0x0019:
            r2.put(r4, r1)
        L_0x001c:
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37941qR.A02(X.1xT):void");
    }

    public void A03(C42011xT r3) {
        C42031xV r1 = (C42031xV) this.A01.get(r3);
        if (r1 != null) {
            r1.A00 &= -2;
        }
    }

    public void A04(C42011xT r6) {
        C001100p r4 = this.A00;
        int A002 = r4.A00();
        while (true) {
            A002--;
            if (A002 < 0) {
                break;
            } else if (r6 == r4.A04(A002)) {
                Object[] objArr = r4.A03;
                Object obj = objArr[A002];
                Object obj2 = C008103q.A00;
                if (obj != obj2) {
                    objArr[A002] = obj2;
                    r4.A01 = true;
                }
            }
        }
        C42031xV r1 = (C42031xV) this.A01.remove(r6);
        if (r1 != null) {
            r1.A00 = 0;
            r1.A02 = null;
            r1.A01 = null;
            C42031xV.A03.CEF(r1);
        }
    }
}
