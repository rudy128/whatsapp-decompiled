package X;

/* renamed from: X.6oF  reason: invalid class name and case insensitive filesystem */
public final class C133146oF {
    public AnonymousClass6MQ A00;
    public AnonymousClass8AN A01;
    public final AnonymousClass1LA A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass11E A05;
    public final AnonymousClass1M9 A06;
    public final C678831f A07;
    public final C18030ve A08;
    public final AnonymousClass00H A09;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        if (r3 != null) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass8AN r11, java.lang.String r12) {
        /*
            r10 = this;
            r4 = 1
            r8 = 0
            if (r12 == 0) goto L_0x0011
            java.lang.String r0 = "[\\s()+.#-]"
            java.lang.String r9 = X.C108985cd.A0o(r12, r0)
            boolean r0 = android.text.TextUtils.isDigitsOnly(r9)
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            return
        L_0x0011:
            r9 = r8
        L_0x0012:
            X.11S r0 = r10.A03
            r0.A0I()
            X.1E8 r0 = r0.A0D
            if (r0 == 0) goto L_0x0093
            X.1BI r0 = r0.A0J
            if (r0 == 0) goto L_0x0093
            java.lang.String r1 = X.AnonymousClass17K.A04(r0)
            if (r1 == 0) goto L_0x0010
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0010
            java.lang.String r3 = X.C20056A5f.A02(r1)
            if (r3 == 0) goto L_0x0037
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0081
        L_0x0037:
            if (r12 == 0) goto L_0x0051
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "\\D"
            java.lang.String r2 = X.C108985cd.A0o(r12, r0)
            int r1 = r2.length()
            r0 = 5
            if (r1 >= r0) goto L_0x005b
            java.lang.String r0 = "contactpicker/isvalidnumber/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0051:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contactpicker/fetchContactUsingPhoneNumber/invalidnumber "
            X.C17900vP.A0f(r0, r12, r1)
            return
        L_0x005b:
            java.lang.String r0 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0051
            java.lang.String r5 = r1.group(r4)
            int r0 = r5.length()
            java.lang.String r1 = X.C108955ca.A0z(r2, r0)
            X.1LA r0 = r10.A02
            int r0 = X.C63942tw.A01(r0, r5, r1)
            if (r0 != r4) goto L_0x0051
            if (r3 == 0) goto L_0x0093
        L_0x0081:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0093
            int r1 = java.lang.Integer.parseInt(r3)
            X.1yi r0 = X.C42771yi.A00()
            java.lang.String r9 = X.C63942tw.A02(r0, r12, r1)
        L_0x0093:
            if (r9 == 0) goto L_0x0010
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0010
            X.6MQ r1 = r10.A00
            if (r1 == 0) goto L_0x00a9
            X.8AN r0 = r10.A01
            if (r0 == 0) goto L_0x00a6
            r0.BuF()
        L_0x00a6:
            r1.A0B(r4)
        L_0x00a9:
            r5 = r11
            r10.A01 = r11
            X.00H r0 = r10.A09
            java.lang.Object r7 = X.C18070vi.A0E(r0)
            X.1OZ r7 = (X.AnonymousClass1OZ) r7
            X.31f r6 = r10.A07
            X.1M9 r4 = r10.A06
            X.11E r3 = r10.A05
            X.6MQ r2 = new X.6MQ
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.10I r1 = r10.A04
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.CGM(r2, r0)
            r10.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133146oF.A00(X.8AN, java.lang.String):void");
    }

    public C133146oF(AnonymousClass1LA r1, AnonymousClass11S r2, AnonymousClass11E r3, AnonymousClass1M9 r4, C678831f r5, C18030ve r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        C18070vi.A0w(r6, r2, r7, r8, r4);
        C18070vi.A0q(r1, r5, r3);
        this.A08 = r6;
        this.A03 = r2;
        this.A04 = r7;
        this.A09 = r8;
        this.A06 = r4;
        this.A02 = r1;
        this.A07 = r5;
        this.A05 = r3;
    }
}
