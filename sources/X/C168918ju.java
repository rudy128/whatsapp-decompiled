package X;

/* renamed from: X.8ju  reason: invalid class name and case insensitive filesystem */
public class C168918ju extends C65802x8 {
    public final AOX A00;

    public C168918ju(AOX aox) {
        super("wa.action.novi.EncryptLogEventV2", "bk.action.waffle.HasPaymentAccount", "bk.action.waffle.StartPaymentOnboarding", "bk.action.waffle.DeletePaymentAccount", "bk.action.waffle.EligibleToShowPaymentsRow", "bk.action.waffle.ShowPaymentSettings", "wa.action.CheckCpfCnpj", "wa.action.GetProcessedData", "wa.action.CheckCardNumber", "wa.action.CheckPinr");
        this.A00 = aox;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0082, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a4, code lost:
        if (r4.equals("wa.action.CheckCardNumber") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a8, code lost:
        r0 = X.A61.A01(X.AnonymousClass8BT.A0t(r1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b9, code lost:
        if (r4.equals("wa.action.CheckCpfCnpj") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bd, code lost:
        r0 = X.A61.A00(X.AnonymousClass8BT.A0t(r1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ce, code lost:
        if (r4.equals("wa.action.GetProcessedData") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d2, code lost:
        r2 = r1.A00;
        r1 = X.AnonymousClass8BR.A16(r2, 0);
        r3 = X.C17880vN.A0w(r2, 1);
        r2 = X.ALR.A02(r1);
        r1 = (java.lang.String) r2.remove("case");
        r5 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f0, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f8, code lost:
        if ("get_card_network".equals(r1) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fe, code lost:
        return X.AnonymousClass91q.A0c(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0105, code lost:
        if (r4.equals("bk.action.waffle.HasPaymentAccount") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0109, code lost:
        r1 = r2.A00;
        com.whatsapp.util.Log.i("WaBkPaymentsInterpreterExtImpl/hasPaymentAccount");
        r0 = r1.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0112, code lost:
        if (r0 == null) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0114, code lost:
        r1 = r0.A06().Bcl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0154, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0155, code lost:
        if (r1 != false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0157, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015c, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007f, code lost:
        r1.startActivityForResult(r2, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BKe(X.C199029zJ r18, X.C25681CkC r19, java.lang.String r20) {
        /*
            r17 = this;
            r12 = r19
            X.Boh r12 = (X.C23736Boh) r12
            r4 = r20
            int r0 = r4.hashCode()
            r3 = -1
            r2 = r17
            r1 = r18
            switch(r0) {
                case -1123270799: goto L_0x0083;
                case -854340780: goto L_0x0096;
                case 51260781: goto L_0x009e;
                case 268909162: goto L_0x00b3;
                case 764653078: goto L_0x00c8;
                case 1643238473: goto L_0x00ff;
                case 1711378359: goto L_0x011d;
                case 1819198730: goto L_0x0128;
                case 1970461926: goto L_0x0133;
                default: goto L_0x0012;
            }
        L_0x0012:
            r5 = 0
            switch(r3) {
                case 1: goto L_0x0017;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00d2;
                case 5: goto L_0x0109;
                case 6: goto L_0x004d;
                case 7: goto L_0x015d;
                default: goto L_0x0016;
            }
        L_0x0016:
            return r5
        L_0x0017:
            r3 = 0
            java.util.List r0 = r1.A00
            X.E8A r1 = X.AnonymousClass8BT.A07(r0, r3)
            X.AOX r11 = r2.A00
            r0 = 25
            X.AOh r10 = new X.AOh
            r10.<init>(r1, r0)
            android.app.Activity r1 = X.ALS.A05(r12)
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/showPaymentSettings"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QS r0 = r11.A06
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BWb()
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r1, r0)
            r9 = r1
            X.1FY r9 = (X.AnonymousClass1FY) r9
            r13 = 1
            X.AM2 r8 = new X.AM2
            r8.<init>(r9, r10, r11, r12, r13)
            r9.A4P(r8)
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x007f
        L_0x004d:
            r13 = 0
            java.util.List r0 = r1.A00
            X.E8A r1 = X.AnonymousClass8BT.A07(r0, r13)
            X.AOX r11 = r2.A00
            r0 = 22
            X.AOh r10 = new X.AOh
            r10.<init>(r1, r0)
            android.app.Activity r1 = X.ALS.A05(r12)
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/startPaymentOnboarding"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QS r0 = r11.A06
            X.BD1 r0 = r0.A06()
            android.content.Intent r2 = r0.BMN(r1)
            if (r2 == 0) goto L_0x0016
            r9 = r1
            X.1FY r9 = (X.AnonymousClass1FY) r9
            X.AM2 r8 = new X.AM2
            r8.<init>(r9, r10, r11, r12, r13)
            r9.A4P(r8)
            r0 = 1001(0x3e9, float:1.403E-42)
        L_0x007f:
            r1.startActivityForResult(r2, r0)
            return r5
        L_0x0083:
            java.lang.String r0 = "wa.action.CheckPinr"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 0
            java.lang.String r0 = X.AnonymousClass8BT.A0t(r1, r0)
            boolean r0 = X.A61.A02(r0)
            goto L_0x0158
        L_0x0096:
            java.lang.String r0 = "bk.action.waffle.ShowPaymentSettings"
            short r3 = X.AnonymousClass8BV.A10(r0, r4)
            goto L_0x0012
        L_0x009e:
            java.lang.String r0 = "wa.action.CheckCardNumber"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a8
            goto L_0x0012
        L_0x00a8:
            r0 = 0
            java.lang.String r0 = X.AnonymousClass8BT.A0t(r1, r0)
            boolean r0 = X.A61.A01(r0)
            goto L_0x0158
        L_0x00b3:
            java.lang.String r0 = "wa.action.CheckCpfCnpj"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x0012
        L_0x00bd:
            r0 = 0
            java.lang.String r0 = X.AnonymousClass8BT.A0t(r1, r0)
            boolean r0 = X.A61.A00(r0)
            goto L_0x0158
        L_0x00c8:
            java.lang.String r0 = "wa.action.GetProcessedData"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00d2
            goto L_0x0012
        L_0x00d2:
            r0 = 0
            java.util.List r2 = r1.A00
            java.util.Map r1 = X.AnonymousClass8BR.A16(r2, r0)
            r0 = 1
            java.lang.String r3 = X.C17880vN.A0w(r2, r0)
            java.util.HashMap r2 = X.ALR.A02(r1)
            java.lang.String r0 = "case"
            java.lang.Object r1 = r2.remove(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r5 = ""
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "get_card_network"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0016
            java.lang.String r5 = X.AnonymousClass91q.A0c(r3, r2)
            return r5
        L_0x00ff:
            java.lang.String r0 = "bk.action.waffle.HasPaymentAccount"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0109
            goto L_0x0012
        L_0x0109:
            X.AOX r1 = r2.A00
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/hasPaymentAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QS r0 = r1.A06
            if (r0 == 0) goto L_0x0157
            X.BD1 r0 = r0.A06()
            boolean r1 = r0.Bcl()
            goto L_0x0154
        L_0x011d:
            java.lang.String r0 = "bk.action.waffle.StartPaymentOnboarding"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0012
            r3 = 6
            goto L_0x0012
        L_0x0128:
            java.lang.String r0 = "bk.action.waffle.DeletePaymentAccount"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0012
            r3 = 7
            goto L_0x0012
        L_0x0133:
            java.lang.String r0 = "bk.action.waffle.EligibleToShowPaymentsRow"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.AOX r1 = r2.A00
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/isEligibleToShowPaymentsRow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QO r0 = r1.A04
            if (r0 == 0) goto L_0x0157
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0157
            X.1K3 r1 = r1.A08
            java.lang.String r0 = "BR"
            boolean r1 = r1.A05(r0)
        L_0x0154:
            r0 = 1
            if (r1 != 0) goto L_0x0158
        L_0x0157:
            r0 = 0
        L_0x0158:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x015d:
            r0 = 0
            java.util.List r3 = r1.A00
            X.E8A r1 = X.AnonymousClass8BT.A07(r3, r0)
            r0 = 1
            X.E8A r3 = X.AnonymousClass8BT.A07(r3, r0)
            X.AOX r4 = r2.A00
            r0 = 23
            X.AOh r2 = new X.AOh
            r2.<init>(r1, r0)
            r0 = 24
            X.AOh r1 = new X.AOh
            r1.<init>(r3, r0)
            android.app.Activity r7 = X.ALS.A05(r12)
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/deletePaymentAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13 = 1
            X.AXH r3 = new X.AXH
            r8 = r3
            r9 = r1
            r10 = r2
            r11 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            X.1KB r8 = r4.A00
            X.10I r2 = r4.A09
            X.1ek r1 = r4.A07
            X.1QS r14 = r4.A06
            X.122 r9 = r4.A01
            X.1QD r11 = r4.A02
            X.1ex r12 = r4.A03
            X.1jF r13 = r4.A05
            X.00H r0 = r4.A0A
            X.1jG r10 = X.AnonymousClass8BR.A0a(r0)
            X.9p4 r6 = new X.9p4
            r15 = r1
            r16 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r6.A00(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168918ju.BKe(X.9zJ, X.CkC, java.lang.String):java.lang.Object");
    }
}
