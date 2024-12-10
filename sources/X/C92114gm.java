package X;

/* renamed from: X.4gm  reason: invalid class name and case insensitive filesystem */
public class C92114gm implements AnonymousClass5YY {
    public final int A00;
    public final Object A01;

    public C92114gm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        r3.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        r4.A03.A08(r3, X.AnonymousClass1LU.A1g(r3, "https://www.whatsapp.com/legal/privacy-policy", (java.lang.String) null, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BEy() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0039;
                case 1: goto L_0x0057;
                case 2: goto L_0x0066;
                case 3: goto L_0x006d;
                case 4: goto L_0x0084;
                case 5: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r13.A01
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r1 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment
            if (r0 == 0) goto L_0x000c
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r1 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r1
            X.00H r0 = r1.A03
            if (r0 == 0) goto L_0x0098
            java.lang.Object r2 = r0.get()
            X.706 r2 = (X.AnonymousClass706) r2
            X.0vl r0 = r1.A05
            X.1BI r1 = X.AnonymousClass3MX.A0m(r0)
            r0 = 2
            java.lang.Integer r6 = X.C72463Mc.A0k(r1, r0)
            r3 = 0
            r12 = 5
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r4 = r3
            X.AnonymousClass706.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0039:
            java.lang.Object r4 = r13.A01
            X.4Ni r4 = (X.C85424Ni) r4
            java.lang.Integer r3 = X.C17880vN.A0k()
            java.lang.Integer r2 = X.C17880vN.A0h()
            r0 = 0
            X.8qu r1 = new X.8qu
            r1.<init>()
            r1.A01 = r3
            r1.A00 = r2
            r1.A02 = r0
            X.18K r0 = r4.A01
            r0.CC7(r1)
            return
        L_0x0057:
            java.lang.Object r3 = r13.A01
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment r3 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment) r3
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "profile_view"
            if (r1 == r0) goto L_0x0080
            android.content.Context r2 = r3.A00
            com.whatsapp.jid.UserJid r1 = r3.A03
            goto L_0x0075
        L_0x0066:
            java.lang.Object r4 = r13.A01
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment r4 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment) r4
            android.content.Context r3 = r4.A00
            goto L_0x008a
        L_0x006d:
            java.lang.Object r3 = r13.A01
            com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment r3 = (com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment) r3
            android.content.Context r2 = r3.A00
            com.whatsapp.jid.UserJid r1 = r3.A03
        L_0x0075:
            r0 = 19
            android.content.Intent r1 = X.C72463Mc.A0F(r2, r1, r0)
            X.1L9 r0 = r3.A03
            r0.A08(r2, r1)
        L_0x0080:
            r3.A28()
            return
        L_0x0084:
            java.lang.Object r4 = r13.A01
            com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment r4 = (com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment) r4
            android.content.Context r3 = r4.A00
        L_0x008a:
            java.lang.String r2 = "https://www.whatsapp.com/legal/privacy-policy"
            r1 = 0
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass1LU.A1g(r3, r2, r1, r0, r0)
            X.1L9 r0 = r4.A03
            r0.A08(r3, r1)
            return
        L_0x0098:
            java.lang.String r0 = "disclosureLoggingUtil"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92114gm.BEy():void");
    }
}
