package X;

/* renamed from: X.31i  reason: invalid class name and case insensitive filesystem */
public class C679131i implements C1606689l {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C679131i(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A04 = obj;
        this.A01 = obj4;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public void BrA() {
        switch (this.A00) {
            case 0:
                C61442ph.A00((C61442ph) this.A04, (AnonymousClass86X) this.A02, this.A01);
                return;
            case 1:
                Object obj = this.A01;
                Object obj2 = this.A02;
                AnonymousClass1KB r2 = ((C52912bg) this.A04).A00;
                if (r2 != null) {
                    r2.CGP(new AnonymousClass3C0(obj, obj2, 36));
                    return;
                } else {
                    C18070vi.A11("globalUI");
                    throw null;
                }
            default:
                ((BCH) this.A02).C3j((C187029f9) this.A03);
                return;
        }
    }

    public void Bsw(Exception exc) {
        switch (this.A00) {
            case 0:
                C61442ph.A00((C61442ph) this.A04, (AnonymousClass86X) this.A02, this.A01);
                return;
            case 1:
                Object obj = this.A01;
                Object obj2 = this.A02;
                AnonymousClass1KB r2 = ((C52912bg) this.A04).A00;
                if (r2 != null) {
                    r2.CGP(new AnonymousClass3C0(obj, obj2, 36));
                    return;
                } else {
                    C18070vi.A11("globalUI");
                    throw null;
                }
            default:
                ((BCH) this.A02).C3j((C187029f9) this.A03);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2.CGP(new X.AnonymousClass3C0(r4, r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        X.C18070vi.A11("globalUI");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7I(X.AnonymousClass732 r6) {
        /*
            r5 = this;
            int r1 = r5.A00
            java.lang.Object r0 = r5.A04
            switch(r1) {
                case 0: goto L_0x001a;
                case 1: goto L_0x000d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x000d:
            X.2bg r0 = (X.C52912bg) r0
            java.lang.Object r4 = r5.A01
            java.lang.Object r3 = r5.A03
            X.1KB r2 = r0.A00
            if (r2 == 0) goto L_0x002f
            r1 = 37
            goto L_0x0026
        L_0x001a:
            X.2ph r0 = (X.C61442ph) r0
            java.lang.Object r4 = r5.A01
            java.lang.Object r3 = r5.A03
            X.1KB r2 = r0.A00
            if (r2 == 0) goto L_0x002f
            r1 = 34
        L_0x0026:
            X.3C0 r0 = new X.3C0
            r0.<init>(r4, r3, r1)
            r2.CGP(r0)
            return
        L_0x002f:
            java.lang.String r0 = "globalUI"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C679131i.C7I(X.732):void");
    }
}
