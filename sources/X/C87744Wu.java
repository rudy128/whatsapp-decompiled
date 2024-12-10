package X;

/* renamed from: X.4Wu  reason: invalid class name and case insensitive filesystem */
public class C87744Wu {
    public final AnonymousClass4NY A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bb, code lost:
        if (r6 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C87744Wu A00(android.content.Context r9, X.C36391no r10, X.C32011gU r11, X.AnonymousClass206 r12, int r13) {
        /*
            boolean r0 = r12 instanceof X.AnonymousClass23N
            java.lang.String r6 = ""
            r2 = 0
            if (r0 == 0) goto L_0x0073
            boolean r1 = r12.A0w()
            X.205 r0 = r12.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x006a
            r0 = 2131895353(0x7f122439, float:1.9425537E38)
            if (r1 == 0) goto L_0x0019
            r0 = 2131895354(0x7f12243a, float:1.9425539E38)
        L_0x0019:
            java.lang.String r8 = r9.getString(r0)
            r1 = r2
            r7 = r2
            r4 = r2
            r3 = r2
        L_0x0021:
            boolean r0 = r6.equals(r4)
            if (r0 == 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0034
            r6 = r2
        L_0x0034:
            boolean r0 = android.text.TextUtils.equals(r4, r1)
            r9 = 1
            if (r0 == 0) goto L_0x0047
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0054
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0054
        L_0x0047:
            int r0 = r12.A0u
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.AnonymousClass25A.A0p(r12)
            if (r0 != 0) goto L_0x0068
        L_0x0051:
            r3 = r1
            r7 = r1
            r8 = r2
        L_0x0054:
            com.whatsapp.jid.UserJid r0 = r12.A0I()
            java.util.Set r4 = r10.BX2(r0, r12, r1)
            if (r4 == 0) goto L_0x0060
            r8 = r2
            r9 = 0
        L_0x0060:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0110
            goto L_0x0107
        L_0x0068:
            r9 = 0
            goto L_0x0051
        L_0x006a:
            r0 = 2131895351(0x7f122437, float:1.9425533E38)
            if (r1 == 0) goto L_0x0019
            r0 = 2131895352(0x7f122438, float:1.9425535E38)
            goto L_0x0019
        L_0x0073:
            boolean r3 = r12 instanceof X.AnonymousClass21K
            if (r3 != 0) goto L_0x00e5
            boolean r0 = X.C20097A7a.A05(r12)
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r12 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x00c7
            r5 = r12
            X.210 r5 = (X.AnonymousClass210) r5
            java.lang.String r7 = r5.A06
            java.lang.String r6 = r5.A0P()
            java.lang.String r4 = r11.A02(r6)
            java.lang.String r0 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00c4
            r3 = r4
        L_0x0097:
            boolean r0 = X.C87504Vv.A01(r3)
            if (r0 == 0) goto L_0x00c1
            int r0 = r5.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r5.A05
            java.lang.String r8 = X.C29551cT.A01(r9, r1, r0)
        L_0x00a9:
            java.util.ArrayList r1 = r11.A03(r6)
            if (r1 == 0) goto L_0x00bf
            int r0 = r1.size()
            if (r0 <= r13) goto L_0x00bf
            java.lang.Object r1 = r1.get(r13)
            java.lang.String r1 = (java.lang.String) r1
        L_0x00bb:
            if (r6 == 0) goto L_0x0034
            goto L_0x0021
        L_0x00bf:
            r1 = r4
            goto L_0x00bb
        L_0x00c1:
            java.lang.String r8 = r5.A05
            goto L_0x00a9
        L_0x00c4:
            java.lang.String r3 = r5.A07
            goto L_0x0097
        L_0x00c7:
            boolean r0 = r12 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x00e0
            r0 = r12
            X.21V r0 = (X.AnonymousClass21V) r0
            java.lang.String r7 = r0.A18()
            java.lang.String r8 = r0.A19()
            java.lang.String r6 = r0.A18()
            java.lang.String r4 = r11.A02(r6)
            r3 = r4
            goto L_0x00a9
        L_0x00e0:
            r8 = r2
            r7 = r2
            r4 = r2
            r3 = r2
            goto L_0x00a9
        L_0x00e5:
            r1 = 0
            if (r3 == 0) goto L_0x00fc
            r0 = r12
            X.21K r0 = (X.AnonymousClass21K) r0
            X.AEt r0 = r0.BPK()
            if (r0 == 0) goto L_0x00f3
            java.lang.String r1 = r0.A0B
        L_0x00f3:
            java.lang.String r8 = r11.A02(r1)
            r7 = r8
            r4 = r8
            r3 = r8
            r6 = r2
            goto L_0x00a9
        L_0x00fc:
            boolean r0 = X.C20097A7a.A05(r12)
            if (r0 == 0) goto L_0x00f3
            java.lang.String r1 = X.C20097A7a.A02(r12)
            goto L_0x00f3
        L_0x0107:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0110 }
            r0.<init>(r3)     // Catch:{ MalformedURLException -> 0x0110 }
            java.lang.String r2 = r0.getHost()     // Catch:{ MalformedURLException -> 0x0110 }
        L_0x0110:
            X.4NY r5 = new X.4NY
            r5.<init>(r1, r2, r4)
            X.4Wu r4 = new X.4Wu
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87744Wu.A00(android.content.Context, X.1no, X.1gU, X.206, int):X.4Wu");
    }

    public C87744Wu(AnonymousClass4NY r2, String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = Boolean.valueOf(z);
        this.A00 = r2;
    }
}
