package X;

public class ARS implements C22499BAg {
    public final AnonymousClass181 A00;
    public final AnonymousClass118 A01;
    public final AXS A02;
    public final AnonymousClass1QS A03;
    public final AnonymousClass1QL A04;
    public final C31051ew A05;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0101, code lost:
        if (r0 != null) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BCx(X.C20284AEs r8) {
        /*
            r7 = this;
            r1 = 5
            int r0 = r8.A05()
            X.8pb r2 = r8.A08
            if (r1 != r0) goto L_0x006c
            X.8pa r2 = (X.C170268pa) r2
            if (r2 == 0) goto L_0x006b
            X.1QS r0 = r7.A03
            X.1KH r1 = X.AnonymousClass8BR.A0R(r0)
            java.lang.String r0 = r8.A0A
            X.AEs r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x003f
            X.8pb r1 = r0.A08
            if (r1 == 0) goto L_0x003f
            X.8pa r1 = (X.C170268pa) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.77e r0 = r2.A00
            boolean r0 = X.C20061A5k.A02(r0)
            if (r0 == 0) goto L_0x0031
            X.77e r0 = r1.A00
            r2.A00 = r0
        L_0x0031:
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x003b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003f
        L_0x003b:
            java.lang.String r0 = r1.A02
            r2.A02 = r0
        L_0x003f:
            X.77e r0 = r2.A00
            boolean r0 = X.C20061A5k.A02(r0)
            if (r0 == 0) goto L_0x0055
            X.AXS r0 = r7.A02
            X.77e r1 = r0.A0D()
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0055
            r2.A00 = r1
        L_0x0055:
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006b
            X.AXS r0 = r7.A02
            java.lang.String r1 = r0.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x006b
            r2.A02 = r1
        L_0x006b:
            return
        L_0x006c:
            X.8pS r2 = (X.AnonymousClass8pS) r2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: beforeMethodAdded got methodData: "
            r3.append(r0)
            if (r2 == 0) goto L_0x0187
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "vpa: "
            r1.append(r0)
            X.77e r0 = r2.A08
            r1.append(r0)
            java.lang.String r0 = " image: "
            r1.append(r0)
            java.lang.String r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = " supportPhoneNumber: "
            r1.append(r0)
            java.lang.String r0 = r2.A0C
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x009c:
            X.C17890vO.A1A(r3, r0)
            if (r2 == 0) goto L_0x006b
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0105
            java.lang.String r1 = "BankLogos"
            java.lang.String r4 = r2.A03
            X.118 r0 = r7.A01
            android.content.Context r6 = r0.A00
            java.io.File r0 = r6.getCacheDir()
            java.io.File r3 = X.C17880vN.A0e(r0, r1)
            boolean r0 = r3.mkdirs()
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "PAY: IndiaUpiStorageObserver/imageUrlToByteArray unable to create bank logos cache directory"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00ca:
            r0 = 1048576(0x100000, double:5.180654E-318)
            X.A5O r5 = new X.A5O
            r5.<init>(r3, r0)
            java.lang.String r4 = X.C17970vW.A04(r4)
            X.C17960vV.A07(r4)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168182(0x7f070bb6, float:1.7950659E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r1 = X.AnonymousClass3MZ.A01(r6, r0)
            r0 = 0
            android.graphics.Bitmap r4 = r5.A02(r4, r3, r1, r0)
            r5.A05(r0)
            if (r4 == 0) goto L_0x017d
            java.io.ByteArrayOutputStream r3 = X.C108945cZ.A15()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 100
            r4.compress(r1, r0, r3)
            byte[] r0 = r3.toByteArray()
            if (r0 == 0) goto L_0x017d
        L_0x0103:
            r8.A0D = r0
        L_0x0105:
            X.1QS r0 = r7.A03
            X.1KH r1 = X.AnonymousClass8BR.A0R(r0)
            java.lang.String r0 = r8.A0A
            X.AEs r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0145
            X.8pb r1 = r0.A08
            if (r1 == 0) goto L_0x0145
            X.8pS r1 = (X.AnonymousClass8pS) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.77e r0 = r2.A08
            boolean r0 = X.C20061A5k.A02(r0)
            if (r0 == 0) goto L_0x0129
            X.77e r0 = r1.A08
            r2.A08 = r0
        L_0x0129:
            java.lang.String r0 = r2.A0E
            if (r0 == 0) goto L_0x0137
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0137
            java.lang.String r0 = r1.A0E
            r2.A0E = r0
        L_0x0137:
            X.77e r0 = r2.A02
            boolean r0 = X.C20061A5k.A02(r0)
            if (r0 == 0) goto L_0x0145
            X.77e r0 = r1.A09()
            r2.A02 = r0
        L_0x0145:
            X.77e r0 = r2.A08
            boolean r0 = X.C20061A5k.A02(r0)
            if (r0 == 0) goto L_0x015b
            X.AXS r0 = r7.A02
            X.77e r1 = r0.A0D()
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x015b
            r2.A08 = r1
        L_0x015b:
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0171
            X.AXS r0 = r7.A02
            java.lang.String r1 = r0.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0171
            r2.A0E = r1
        L_0x0171:
            X.AXS r6 = r7.A02
            X.77e r1 = r2.A08
            java.lang.String r0 = r2.A0E
            java.lang.String r5 = r2.A09
            java.lang.String r4 = r2.A0D
            monitor-enter(r6)
            goto L_0x018b
        L_0x017d:
            java.lang.String r1 = r2.A03
            X.181 r0 = r7.A00
            byte[] r0 = X.A8e.A09(r0, r1)
            goto L_0x0103
        L_0x0187:
            java.lang.String r0 = "null"
            goto L_0x009c
        L_0x018b:
            X.1QD r3 = r6.A01     // Catch:{ JSONException -> 0x01b8 }
            org.json.JSONObject r2 = X.AnonymousClass8BY.A0c(r3)     // Catch:{ JSONException -> 0x01b8 }
            X.AXS.A04(r1, r6, r0, r2)     // Catch:{ JSONException -> 0x01b8 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x01b8 }
            if (r0 != 0) goto L_0x01b4
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x01b8 }
            if (r0 != 0) goto L_0x01b4
            X.AXS.A06(r6, r5, r4, r2)     // Catch:{ JSONException -> 0x01b8 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x01b8 }
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs updated psp: "
            r1.append(r0)     // Catch:{ JSONException -> 0x01b8 }
            r1.append(r5)     // Catch:{ JSONException -> 0x01b8 }
            java.lang.String r0 = " transactionPrefix: "
            X.C17900vP.A0f(r0, r4, r1)     // Catch:{ JSONException -> 0x01b8 }
        L_0x01b4:
            X.AnonymousClass8BT.A1G(r3, r2)     // Catch:{ JSONException -> 0x01b8 }
            goto L_0x01be
        L_0x01b8:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs updateHandleDeviceBinding threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01c0 }
        L_0x01be:
            monitor-exit(r6)
            return
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARS.BCx(X.AEs):void");
    }

    public ARS(AnonymousClass181 r1, AnonymousClass118 r2, AXS axs, AnonymousClass1QL r4, C31051ew r5, AnonymousClass1QS r6) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r6;
        this.A04 = r4;
        this.A02 = axs;
        this.A05 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r1 = (X.C170268pa) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r2 = X.C63572tK.A0F.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BBx(java.lang.String r5, java.util.List r6) {
        /*
            r4 = this;
            java.util.Iterator r3 = r6.iterator()
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0051
            X.AEs r0 = X.AnonymousClass8BR.A0P(r3)
            X.8pb r1 = r0.A08
            boolean r0 = r1 instanceof X.AnonymousClass8pS
            if (r0 == 0) goto L_0x0028
            X.8pS r1 = (X.AnonymousClass8pS) r1
            boolean r0 = X.C170278pb.A03(r1)
            if (r0 == 0) goto L_0x0004
            X.1QS r0 = r4.A03
            X.1QK r1 = r0.A02(r5)
            java.lang.String r0 = "2fa"
            r1.A0B(r0)
            goto L_0x0004
        L_0x0028:
            boolean r0 = r1 instanceof X.C170268pa
            if (r0 == 0) goto L_0x0004
            X.8pa r1 = (X.C170268pa) r1
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0004
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0004
            X.77e r0 = r1.A00
            boolean r0 = X.C20061A5k.A02(r0)
            if (r0 != 0) goto L_0x0004
            X.2tK r0 = X.C63572tK.A0F
            X.1QM[] r2 = r0.A0C
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0004
            X.1ew r1 = r4.A05
            int r0 = r0 + -1
            r0 = r2[r0]
            r1.A0A(r0)
            goto L_0x0004
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARS.BBx(java.lang.String, java.util.List):void");
    }
}
