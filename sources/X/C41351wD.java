package X;

/* renamed from: X.1wD  reason: invalid class name and case insensitive filesystem */
public final class C41351wD extends C41331wB {
    public final Object A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r2 != androidx.fragment.app.Fragment.A0r) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41351wD(X.C39481t9 r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r4.<init>(r5)
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            androidx.fragment.app.Fragment r3 = r5.A07
            if (r1 != r0) goto L_0x003f
            X.1mt r0 = r3.A0D
            if (r6 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x001b
            java.lang.Object r2 = r0.A08
            java.lang.Object r0 = androidx.fragment.app.Fragment.A0r
            if (r2 != r0) goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            r4.A01 = r2
            if (r7 == 0) goto L_0x0038
            if (r6 == 0) goto L_0x0031
            X.1mt r2 = r3.A0D
            if (r2 == 0) goto L_0x0038
            java.lang.Object r1 = r2.A0B
            java.lang.Object r0 = androidx.fragment.app.Fragment.A0r
            if (r1 != r0) goto L_0x002e
            java.lang.Object r1 = r2.A0A
        L_0x002e:
            r4.A00 = r1
            return
        L_0x0031:
            X.1mt r0 = r3.A0D
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r0.A0A
            goto L_0x002e
        L_0x0038:
            r1 = 0
            goto L_0x002e
        L_0x003a:
            if (r0 == 0) goto L_0x001b
            java.lang.Object r2 = r0.A07
            goto L_0x001c
        L_0x003f:
            if (r6 == 0) goto L_0x001b
            X.1mt r1 = r3.A0D
            if (r1 == 0) goto L_0x001b
            java.lang.Object r2 = r1.A09
            java.lang.Object r0 = androidx.fragment.app.Fragment.A0r
            if (r2 != r0) goto L_0x001c
            java.lang.Object r2 = r1.A07
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41351wD.<init>(X.1t9, boolean, boolean):void");
    }

    private final C25842Cmw A00(Object obj) {
        if (obj == null) {
            return null;
        }
        C25842Cmw cmw = C25431Cfd.A00;
        if (cmw.A08(obj) || ((cmw = C25431Cfd.A01) != null && cmw.A08(obj))) {
            return cmw;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Transition ");
        sb.append(obj);
        sb.append(" for fragment ");
        sb.append(this.A00.A07);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }

    public final C25842Cmw A02() {
        Object obj = this.A01;
        C25842Cmw A002 = A00(obj);
        Object obj2 = this.A00;
        C25842Cmw A003 = A00(obj2);
        if (A002 == null) {
            return A003;
        }
        if (A003 == null || A002 == A003) {
            return A002;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        sb.append(this.A00.A07);
        sb.append(" returned Transition ");
        sb.append(obj);
        sb.append(" which uses a different Transition  type than its shared element transition ");
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }
}
