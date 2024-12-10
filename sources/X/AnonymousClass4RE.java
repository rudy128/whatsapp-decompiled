package X;

/* renamed from: X.4RE  reason: invalid class name */
public final class AnonymousClass4RE {
    public final C19830z4 A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final C25241Nl A03;
    public final AnonymousClass4aW A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass1Nb A06;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r5 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if (r6 != null) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C85594Nz A00(X.AnonymousClass1BI r10, X.AnonymousClass4SC r11) {
        /*
            r9 = this;
            r8 = 1
            X.1Nb r3 = r9.A06
            if (r10 != 0) goto L_0x00d8
            java.lang.String r0 = "individual_chat_defaults"
            X.1yM r0 = X.AnonymousClass1Nb.A01(r3, r0)
        L_0x000b:
            java.lang.String r7 = r0.A0O
            r6 = 0
            java.lang.String r1 = "individual_chat_defaults"
            X.1yM r0 = X.AnonymousClass1Nb.A01(r3, r1)
            java.lang.String r4 = r0.A0O
            if (r10 != 0) goto L_0x00d2
            X.1yM r0 = X.AnonymousClass1Nb.A01(r3, r1)
        L_0x001c:
            java.lang.String r2 = r0.A0H
            X.1yM r0 = X.AnonymousClass1Nb.A01(r3, r1)
            java.lang.String r5 = r0.A0H
            r3 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            if (r7 != 0) goto L_0x00c8
            if (r4 != 0) goto L_0x00c2
            java.lang.String r0 = "doodle@whatsapp-green#tonal"
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r1)
        L_0x0033:
            java.lang.Object r4 = r0.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r0.second
            boolean r7 = X.AnonymousClass000.A1Y(r0)
            if (r2 != 0) goto L_0x0042
            r2 = r5
            if (r5 == 0) goto L_0x00c0
        L_0x0042:
            X.3x3 r0 = X.C80383x3.A00
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x0080
            java.lang.String r6 = "whatsapp-green#tonal"
        L_0x004e:
            if (r4 == 0) goto L_0x0056
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r6, r3)
            if (r0 != 0) goto L_0x00c0
        L_0x0056:
            r5 = 1
        L_0x0057:
            java.lang.String r0 = r11.A02
            java.lang.String r2 = X.AnonymousClass4GP.A00(r11, r0)
            if (r4 == 0) goto L_0x0065
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r2, r3)
            if (r0 != 0) goto L_0x0066
        L_0x0065:
            r3 = 1
        L_0x0066:
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass3MW.A0f(r10)
            if (r7 == 0) goto L_0x007b
            r1 = 3
        L_0x006d:
            X.4Nz r0 = new X.4Nz
            r0.<init>(r4, r1)
            if (r5 == 0) goto L_0x0076
            r0.A00 = r6
        L_0x0076:
            if (r3 == 0) goto L_0x007a
            r0.A01 = r2
        L_0x007a:
            return r0
        L_0x007b:
            r1 = 1
            if (r0 == 0) goto L_0x006d
            r1 = 2
            goto L_0x006d
        L_0x0080:
            X.3ws r0 = X.C80273ws.A00
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x008d
            java.lang.String r6 = "whatsapp-green#vibrant"
            goto L_0x004e
        L_0x008d:
            java.lang.String r0 = "Tonal"
            boolean r0 = X.AnonymousClass1YF.A0Y(r2, r0, r3)
            if (r0 == 0) goto L_0x00a9
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "tonal"
            java.lang.String r0 = "#tonal"
            java.lang.String r6 = X.AnonymousClass1YE.A07(r2, r1, r0, r3)
        L_0x00a6:
            if (r6 == 0) goto L_0x00c0
            goto L_0x004e
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r2.toLowerCase(r0)
            X.C18070vi.A0X(r0)
            r1.append(r0)
            java.lang.String r0 = "#vibrant"
            java.lang.String r6 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x00a6
        L_0x00c0:
            r5 = 0
            goto L_0x0057
        L_0x00c2:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r4, r1)
            goto L_0x0033
        L_0x00c8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r7, r0)
            goto L_0x0033
        L_0x00d2:
            X.1yM r0 = r3.A0a(r10)
            goto L_0x001c
        L_0x00d8:
            X.1yM r0 = r3.A0a(r10)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RE.A00(X.1BI, X.4SC):X.4Nz");
    }

    public AnonymousClass4RE(AnonymousClass11P r1, C19830z4 r2, C18030ve r3, AnonymousClass18K r4, C25241Nl r5, AnonymousClass1Nb r6, AnonymousClass4aW r7) {
        C18070vi.A0w(r1, r3, r4, r7, r2);
        C18070vi.A0l(r5, r6);
        this.A05 = r1;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r7;
        this.A00 = r2;
        this.A03 = r5;
        this.A06 = r6;
    }
}
