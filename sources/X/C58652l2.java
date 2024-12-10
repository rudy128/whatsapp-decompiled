package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2l2  reason: invalid class name and case insensitive filesystem */
public final class C58652l2 {
    public final AnonymousClass1M4 A00;
    public final C24751Ln A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass00H A03;

    public final Integer A00(UserJid userJid) {
        C29691ci A002;
        C49502Qs r1;
        int ordinal;
        if (userJid == null || (A002 = AnonymousClass1CJ.A00(((C55282fW) this.A03.get()).A01, userJid)) == null || (r1 = A002.A0b) == null || (ordinal = r1.ordinal()) == -1 || ordinal == 2) {
            return null;
        }
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new AnonymousClass3EW();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if ((!X.AnonymousClass1YF.A0T(r0)) != true) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A01(com.whatsapp.jid.UserJid r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            X.1M9 r0 = r3.A02
            X.1E7 r1 = r0.A0D(r4)
            if (r1 != 0) goto L_0x0012
            r2 = 6
        L_0x000d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x0012:
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x005d
            boolean r0 = r1.A0o
            if (r0 != 0) goto L_0x005d
            X.1E7 r0 = r1.A0I
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = r1.A0L()
            if (r0 == 0) goto L_0x0031
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x0031
            r2 = 5
            goto L_0x000d
        L_0x0031:
            boolean r0 = r4 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 != 0) goto L_0x005b
            X.1Ln r0 = r3.A01
            com.whatsapp.jid.UserJid r0 = r0.A0F(r4)
            boolean r0 = r0 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 != 0) goto L_0x005b
            boolean r0 = r4 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x0059
            X.1E1 r4 = (X.AnonymousClass1E1) r4
            if (r4 == 0) goto L_0x0059
            X.1M4 r0 = r3.A00
            java.lang.String r0 = r0.BMn(r4)
            if (r0 == 0) goto L_0x0059
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            r1 = 1
            r0 = r0 ^ 1
            r2 = 3
            if (r0 == r1) goto L_0x000d
        L_0x0059:
            r2 = 4
            goto L_0x000d
        L_0x005b:
            r2 = 1
            goto L_0x000d
        L_0x005d:
            r2 = 2
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58652l2.A01(com.whatsapp.jid.UserJid):java.lang.Integer");
    }

    public C58652l2(AnonymousClass1M9 r1, AnonymousClass1M4 r2, C24751Ln r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r4, r1, r3);
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = r1;
        this.A01 = r3;
    }
}
