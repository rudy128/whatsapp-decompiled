package X;

/* renamed from: X.1wp  reason: invalid class name and case insensitive filesystem */
public final class C41641wp extends C41581wh {
    public final ThreadLocal A00;
    public volatile boolean threadLocalIsSet;

    public final void A14(Object obj, C18560wh r4) {
        this.threadLocalIsSet = true;
        this.A00.set(new AnonymousClass1D6(r4, obj));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41641wp(X.C30391dr r3, X.C18560wh r4) {
        /*
            r2 = this;
            X.1wq r1 = X.C41651wq.A00
            X.0wi r0 = r4.get(r1)
            if (r0 != 0) goto L_0x0030
            X.0wh r0 = r4.plus(r1)
        L_0x000c:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.A00 = r0
            X.0wh r1 = r3.getContext()
            X.1Hu r0 = X.C18590wk.A00
            X.0wi r0 = r1.get(r0)
            boolean r0 = r0 instanceof X.C18600wl
            if (r0 != 0) goto L_0x002f
            r0 = 0
            java.lang.Object r0 = X.C30631eG.A00(r0, r4)
            X.C30631eG.A02(r0, r4)
            r2.A14(r0, r4)
        L_0x002f:
            return
        L_0x0030:
            r0 = r4
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41641wp.<init>(X.1dr, X.0wh):void");
    }

    public void A12(Object obj) {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.A00;
            AnonymousClass1D6 r0 = (AnonymousClass1D6) threadLocal.get();
            if (r0 != null) {
                C30631eG.A02(r0.second, (C18560wh) r0.first);
            }
            threadLocal.remove();
        }
        C30391dr r1 = this.A00;
        if (obj instanceof C30681eL) {
            obj = C30691eM.A00(((C30681eL) obj).A00);
        }
        C18560wh context = r1.getContext();
        C41641wp r3 = null;
        Object A002 = C30631eG.A00(r3, context);
        if (A002 != C30631eG.A00) {
            r3 = C30471e0.A03(A002, r1, context);
        }
        try {
            r1.resumeWith(obj);
        } finally {
            if (r3 == null || r3.A15()) {
                C30631eG.A02(A002, context);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2.A00.get() != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A15() {
        /*
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            if (r0 == 0) goto L_0x000d
            java.lang.ThreadLocal r0 = r2.A00
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.ThreadLocal r0 = r2.A00
            r0.remove()
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41641wp.A15():boolean");
    }
}
