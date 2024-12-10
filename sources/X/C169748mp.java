package X;

import java.util.List;

/* renamed from: X.8mp  reason: invalid class name and case insensitive filesystem */
public final class C169748mp extends C60192nY {
    public final C24661Le A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0090, code lost:
        if (r0 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C20126A8l A0C(X.A6U r17, java.lang.String r18, boolean r19) {
        /*
            r16 = this;
            r5 = 2
            r2 = r17
            X.C18070vi.A0d(r2, r5)
            r3 = 1
            java.lang.String[] r1 = r2.A06
            int r0 = r1.length
            r8 = 0
            if (r0 != r3) goto L_0x00b4
            java.lang.String r0 = "status_privacy"
            boolean r0 = X.AnonymousClass8BU.A1a(r0, r1)
            if (r0 == 0) goto L_0x00b4
            X.2rJ r4 = r2.A01
            X.8cn r3 = r2.A03
            if (r3 == 0) goto L_0x00b4
            int r0 = r3.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            if (r0 == 0) goto L_0x00b4
            int r0 = r3.bitField1_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00b4
            X.8ZZ r0 = r3.statusPrivacy_
            r7 = r0
            if (r0 != 0) goto L_0x0030
            X.8ZZ r0 = X.AnonymousClass8ZZ.DEFAULT_INSTANCE
        L_0x0030:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00b4
            r0 = r7
            if (r7 != 0) goto L_0x003b
            X.8ZZ r0 = X.AnonymousClass8ZZ.DEFAULT_INSTANCE
        L_0x003b:
            if (r0 == 0) goto L_0x00b4
            int r1 = r0.mode_
            if (r1 == 0) goto L_0x0096
            r0 = 1
            if (r1 == r0) goto L_0x0093
            if (r1 != r5) goto L_0x0096
            X.9K4 r0 = X.AnonymousClass9K4.CONTACTS
        L_0x0048:
            int r6 = r0.ordinal()
            r5 = 1
            r1 = 0
            if (r6 == r1) goto L_0x008c
            r5 = 2
            r0 = 1
            if (r6 == r0) goto L_0x008c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0058:
            int r13 = r0.intValue()
            java.util.HashSet r12 = X.C17880vN.A12()
            if (r7 != 0) goto L_0x0064
            X.8ZZ r7 = X.AnonymousClass8ZZ.DEFAULT_INSTANCE
        L_0x0064:
            X.EE9 r0 = r7.userJid_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0099
            X.8ZZ r0 = r3.statusPrivacy_
            if (r0 != 0) goto L_0x0072
            X.8ZZ r0 = X.AnonymousClass8ZZ.DEFAULT_INSTANCE
        L_0x0072:
            X.EE9 r0 = r0.userJid_
            java.util.Iterator r1 = r0.iterator()
        L_0x0078:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = X.C17880vN.A0v(r1)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            if (r0 == 0) goto L_0x0078
            r12.add(r0)
            goto L_0x0078
        L_0x008c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L_0x00b4
            goto L_0x0058
        L_0x0093:
            X.9K4 r0 = X.AnonymousClass9K4.DENY_LIST
            goto L_0x0048
        L_0x0096:
            X.9K4 r0 = X.AnonymousClass9K4.ALLOW_LIST
            goto L_0x0048
        L_0x0099:
            X.2rJ r9 = X.C62382rJ.A02
            boolean r0 = r9.equals(r4)
            if (r0 == 0) goto L_0x00ad
            X.A2n r10 = r2.A02
            r14 = 0
        L_0x00a5:
            X.8q3 r8 = new X.8q3
            r11 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x00ad:
            long r14 = r3.timestamp_
            X.A2n r10 = r2.A02
            X.2rJ r9 = X.C62382rJ.A03
            goto L_0x00a5
        L_0x00b4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169748mp.A0C(X.A6U, java.lang.String, boolean):X.A8l");
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        AnonymousClass8q3 r6 = (AnonymousClass8q3) a8l;
        C18070vi.A0d(r6, 0);
        if (a8l2 == null || a8l2.A04 < r6.A04) {
            int i = r6.A00;
            this.A00.A0G(r6.A01, i);
            A0B(r6, a8l2);
            return;
        }
        A09(r6);
    }

    public boolean A0J() {
        return C18020vd.A05(C18040vf.A02, this.A02, 4905);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass8q3 A0K() {
        /*
            r8 = this;
            X.1Le r3 = r8.A00
            int r2 = r3.A05()
            java.util.HashSet r1 = X.C17880vN.A12()
            r0 = 1
            if (r2 == r0) goto L_0x0033
            r0 = 2
            if (r2 != r0) goto L_0x0017
            java.util.ArrayList r0 = r3.A0B()
        L_0x0014:
            r1.addAll(r0)
        L_0x0017:
            java.util.HashSet r4 = X.C17880vN.A12()
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r1)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r0)
            if (r0 == 0) goto L_0x001f
            r4.add(r0)
            goto L_0x001f
        L_0x0033:
            java.util.ArrayList r0 = r3.A0A()
            goto L_0x0014
        L_0x0038:
            X.11P r0 = r8.A01
            long r6 = X.AnonymousClass11P.A01(r0)
            X.2rJ r1 = X.C62382rJ.A03
            int r5 = r3.A05()
            r2 = 0
            X.8q3 r0 = new X.8q3
            r3 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169748mp.A0K():X.8q3");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169748mp(AnonymousClass11P r1, C24661Le r2, C26331Rs r3, C18030ve r4) {
        super(r3);
        C18070vi.A0s(r1, r4, r2, r3);
        this.A01 = r1;
        this.A02 = r4;
        this.A00 = r2;
    }

    public String A0D() {
        return "regular_high";
    }

    public String A0E() {
        return "status_privacy";
    }

    public List A0F(boolean z) {
        return C18070vi.A0M(A0K());
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8BU.A1B(this, a8l);
    }
}
