package X;

/* renamed from: X.36R  reason: invalid class name */
public final class AnonymousClass36R implements C437420t {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass118 A02;
    public final C18000vb A03;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r0 == null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3KT BXT(X.AnonymousClass206 r4) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.22n r4 = (X.C442022n) r4
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.util.Iterator r1 = r0.iterator()
        L_0x0012:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.next()
            X.2dU r0 = (X.C54032dU) r0
            X.73C r0 = r0.A01
            java.lang.String r0 = r0.A02()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            goto L_0x0012
        L_0x002d:
            java.lang.String r0 = r2.toString()
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r0 = ""
        L_0x0035:
            X.35q r0 = X.C690335q.A01(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36R.BXT(X.206):X.3KT");
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        String A002 = C124306Xv.A00(this.A02, (C442022n) r4);
        C18070vi.A0X(A002);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("👤");
        return C690335q.A01(C17890vO.A0Z(A002, A10, ' '));
    }

    public AnonymousClass36R(AnonymousClass1M9 r1, AnonymousClass11C r2, AnonymousClass118 r3, C18000vb r4) {
        C18070vi.A0s(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }
}
