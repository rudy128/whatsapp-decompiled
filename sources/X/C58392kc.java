package X;

/* renamed from: X.2kc  reason: invalid class name and case insensitive filesystem */
public final class C58392kc {
    public final C19830z4 A00;
    public final C18030ve A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A01, 3698) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r3 = this;
            X.0z4 r0 = r3.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "companion_reg_with_link_code_enabled_for_wearos"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x001c
            X.0ve r2 = r3.A01
            r1 = 3698(0xe72, float:5.182E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            r1 = 1
        L_0x001b:
            return r1
        L_0x001c:
            X.0ve r2 = r3.A01
            r0 = 2734(0xaae, float:3.831E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x001a
            r0 = 3693(0xe6d, float:5.175E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58392kc.A00():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A01, 3698) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r7 = this;
            X.0z4 r0 = r7.A00
            X.00H r6 = r0.A00
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r6)
            java.lang.String r0 = "companion_reg_with_link_code_enabled_for_wearos"
            r5 = 0
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x001e
            X.0ve r2 = r7.A01
            r1 = 3698(0xe72, float:5.182E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r4 = 1
            if (r0 != 0) goto L_0x0042
            X.0ve r3 = r7.A01
            r0 = 3693(0xe6d, float:5.175E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x0042
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r6)
            java.lang.String r0 = "did_receive_companion_hello"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x0043
            r0 = 2734(0xaae, float:3.831E-42)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            return r4
        L_0x0043:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58392kc.A01():boolean");
    }

    public C58392kc(C19830z4 r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
