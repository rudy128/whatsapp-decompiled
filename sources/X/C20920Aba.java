package X;

/* renamed from: X.Aba  reason: case insensitive filesystem */
public final class C20920Aba implements C22522BBf {
    public final AnonymousClass118 A00;
    public final AnonymousClass1QD A01;
    public final AnonymousClass1QJ A02;
    public final A56 A03;

    /* JADX WARNING: type inference failed for: r3v2, types: [X.2r3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r0 == 2) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0153, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object CFt(java.lang.Enum r7, java.lang.Object r8, java.util.Map r9) {
        /*
            r6 = this;
            X.AEs r8 = (X.C20284AEs) r8
            X.9Ko r7 = (X.C179959Ko) r7
            r5 = 0
            boolean r4 = X.C18070vi.A17(r8, r7)
            int r0 = r7.ordinal()
            r2 = 0
            r1 = 1
            r3 = 2
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x013b;
                case 2: goto L_0x0134;
                case 3: goto L_0x0071;
                case 4: goto L_0x00f8;
                case 5: goto L_0x0131;
                case 6: goto L_0x006a;
                case 7: goto L_0x0063;
                case 8: goto L_0x0059;
                case 9: goto L_0x0056;
                case 10: goto L_0x0053;
                case 11: goto L_0x0050;
                case 12: goto L_0x00b7;
                case 13: goto L_0x00aa;
                case 14: goto L_0x001b;
                case 15: goto L_0x0077;
                case 16: goto L_0x0018;
                default: goto L_0x0013;
            }
        L_0x0013:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0018:
            X.8pb r2 = r8.A08
            return r2
        L_0x001b:
            byte[] r0 = r8.A0D
            if (r0 == 0) goto L_0x0024
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r3)
            return r2
        L_0x0024:
            boolean r0 = r8 instanceof X.AnonymousClass8pK
            if (r0 == 0) goto L_0x003a
            X.118 r0 = r6.A00
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131231039(0x7f08013f, float:1.8078148E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            java.lang.String r2 = X.AnonymousClass204.A0E(r0)
            return r2
        L_0x003a:
            boolean r0 = r8 instanceof X.AnonymousClass8pN
            if (r0 == 0) goto L_0x0153
            X.118 r0 = r6.A00
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131231037(0x7f08013d, float:1.8078144E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            java.lang.String r2 = X.AnonymousClass204.A0E(r0)
            return r2
        L_0x0050:
            int r0 = r8.A02
            goto L_0x005b
        L_0x0053:
            int r0 = r8.A03
            goto L_0x005b
        L_0x0056:
            int r0 = r8.A00
            goto L_0x005b
        L_0x0059:
            int r0 = r8.A01
        L_0x005b:
            if (r0 == r3) goto L_0x005e
            r1 = 0
        L_0x005e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L_0x0063:
            long r0 = r8.A06
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L_0x006a:
            long r0 = r8.A05
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L_0x0071:
            java.lang.String r2 = r8.A0B
            return r2
        L_0x0074:
            java.lang.String r2 = r8.A0A
            return r2
        L_0x0077:
            X.1QD r0 = r6.A01
            java.lang.String r5 = r8.A0A
            android.content.SharedPreferences r2 = r0.A03()
            java.lang.String r1 = "payments_sent_payment_with_account"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.getString(r1, r0)
            java.lang.String r0 = ";"
            java.lang.String[] r4 = r1.split(r0)
            int r3 = r4.length
            r2 = 0
        L_0x008f:
            if (r2 >= r3) goto L_0x00a8
            r1 = r4[r2]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r1.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x00a5
            r0 = 1
        L_0x00a0:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x00a5:
            int r2 = r2 + 1
            goto L_0x008f
        L_0x00a8:
            r0 = 0
            goto L_0x00a0
        L_0x00aa:
            boolean r0 = r8 instanceof X.AnonymousClass8pP
            if (r0 == 0) goto L_0x0153
            X.8pP r8 = (X.AnonymousClass8pP) r8
            long r0 = r8.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L_0x00b7:
            boolean r0 = r8 instanceof X.AnonymousClass8pP
            if (r0 == 0) goto L_0x0153
            X.1QJ r0 = r6.A02
            X.2tK r0 = r0.A02()
            if (r0 == 0) goto L_0x0153
            X.1KJ r1 = r0.A02
            if (r1 == 0) goto L_0x0153
            X.2r3 r3 = new X.2r3
            r3.<init>()
            r3.A02 = r1
            X.8pP r8 = (X.AnonymousClass8pP) r8
            X.1KN r0 = r8.A0C()
            java.math.BigDecimal r0 = r0.A00
            X.1KK r1 = (X.AnonymousClass1KK) r1
            int r2 = r1.A01
            java.math.BigDecimal r0 = r0.scaleByPowerOfTen(r2)
            long r0 = r0.longValue()
            r3.A01 = r0
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r4)
            java.math.BigDecimal r0 = r0.scaleByPowerOfTen(r2)
            int r0 = r0.intValue()
            r3.A00 = r0
            X.ARR r2 = r3.A00()
            return r2
        L_0x00f8:
            int r1 = r8.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0131
            if (r1 != r4) goto L_0x0107
            java.lang.String r2 = "DEBIT"
            return r2
        L_0x0107:
            if (r1 != r3) goto L_0x010c
            java.lang.String r2 = "BANK"
            return r2
        L_0x010c:
            r0 = 3
            if (r1 != r0) goto L_0x0112
            java.lang.String r2 = "WALLET"
            return r2
        L_0x0112:
            r0 = 4
            if (r1 != r0) goto L_0x0118
            java.lang.String r2 = "CREDIT"
            return r2
        L_0x0118:
            r0 = 5
            if (r1 != r0) goto L_0x011e
            java.lang.String r2 = "MERCHANT"
            return r2
        L_0x011e:
            r0 = 6
            if (r1 != r0) goto L_0x0124
            java.lang.String r2 = "COMBO"
            return r2
        L_0x0124:
            r0 = 7
            if (r1 != r0) goto L_0x012a
            java.lang.String r2 = "CARD_UNSET"
            return r2
        L_0x012a:
            r0 = 8
            if (r1 != r0) goto L_0x0131
            java.lang.String r2 = "PREPAID"
            return r2
        L_0x0131:
            java.lang.String r2 = "UNKNOWN"
            return r2
        L_0x0134:
            X.A56 r0 = r6.A03
            java.lang.String r2 = r0.A03(r8, r5)
            return r2
        L_0x013b:
            java.lang.String r3 = "UNSET"
            X.2tK r0 = r8.A07
            java.lang.String r1 = r0.A03
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0148
            return r1
        L_0x0148:
            X.1QJ r0 = r6.A02
            X.2tK r0 = r0.A02()
            if (r0 == 0) goto L_0x0153
            java.lang.String r2 = r0.A03
            return r2
        L_0x0153:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20920Aba.CFt(java.lang.Enum, java.lang.Object, java.util.Map):java.lang.Object");
    }

    public C20920Aba(AnonymousClass118 r1, AnonymousClass1QD r2, AnonymousClass1QJ r3, A56 a56) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = a56;
        this.A02 = r3;
    }

    public Class BL8() {
        return C179959Ko.class;
    }
}
