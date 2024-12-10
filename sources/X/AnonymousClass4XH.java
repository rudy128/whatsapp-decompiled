package X;

/* renamed from: X.4XH  reason: invalid class name */
public final class AnonymousClass4XH {
    public AnonymousClass4OM A00;
    public final C24921Me A01;
    public final AnonymousClass1MZ A02;

    public static final C93274ii A00(AnonymousClass4OM r4, AnonymousClass4XH r5) {
        String A0I;
        if (r4 == null) {
            return new C93274ii(C72453Mb.A0q(2131898595), (Integer) null, 0.0f);
        }
        C24921Me r3 = r5.A01;
        AnonymousClass4ZN r2 = r4.A01;
        if (r2 == null) {
            C134216qE r1 = r4.A02;
            if (r1.A0M) {
                r2 = C72453Mb.A0q(2131898595);
            } else {
                AnonymousClass1E7 A0H = ((AnonymousClass1M9) r3.A05.get()).A0H(r1.A0A);
                if (A0H.A0B() || !C24921Me.A06(A0H)) {
                    A0I = r3.A0I(A0H);
                } else {
                    A0I = AnonymousClass3MX.A17(r3, A0H);
                }
                if (A0I == null) {
                    A0I = "";
                }
                r2 = new AnonymousClass482(A0I);
            }
            r4.A01 = r2;
        }
        return new C93274ii(r2, (Integer) r4.A04.getValue(), r4.A00);
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C93274ii A01(X.C86534Sa r9) {
        /*
            r8 = this;
            X.10w r0 = r9.A06
            java.util.Collection r0 = r0.values()
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            r5 = 0
            if (r0 != 0) goto L_0x0040
            r6 = r5
        L_0x0012:
            X.6qE r6 = (X.C134216qE) r6
            if (r6 == 0) goto L_0x001c
            int r1 = r6.A04
            r0 = 1
            if (r1 != r0) goto L_0x001c
            r5 = r6
        L_0x001c:
            r1 = 0
            if (r5 == 0) goto L_0x0031
            X.4OM r0 = r8.A00
            if (r0 == 0) goto L_0x0027
            X.6qE r0 = r0.A02
            com.whatsapp.jid.UserJid r1 = r0.A0A
        L_0x0027:
            com.whatsapp.jid.UserJid r0 = r5.A0A
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0038
            X.4OM r1 = r8.A00
        L_0x0031:
            r8.A00 = r1
            X.4ii r0 = A00(r1, r8)
            return r0
        L_0x0038:
            X.1EC r0 = r9.A08
            X.4OM r1 = new X.4OM
            r1.<init>(r5, r0)
            goto L_0x0031
        L_0x0040:
            java.lang.Object r6 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0012
            r1 = r6
            X.6qE r1 = (X.C134216qE) r1
            int r0 = r1.A04
            r4 = 1
            if (r0 != r4) goto L_0x006c
            int r3 = r1.A00
        L_0x0054:
            java.lang.Object r2 = r7.next()
            r1 = r2
            X.6qE r1 = (X.C134216qE) r1
            int r0 = r1.A04
            if (r0 != r4) goto L_0x0065
            int r0 = r1.A00
            if (r3 >= r0) goto L_0x0065
            r6 = r2
            r3 = r0
        L_0x0065:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0054
            goto L_0x0012
        L_0x006c:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XH.A01(X.4Sa):X.4ii");
    }

    public AnonymousClass4XH(C24921Me r1, AnonymousClass1MZ r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
    }
}
