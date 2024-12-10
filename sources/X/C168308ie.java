package X;

/* renamed from: X.8ie  reason: invalid class name and case insensitive filesystem */
public final class C168308ie extends C20662ATu {
    public final C51462Yj A00;
    public final B86 A01;
    public final B86 A02;
    public final B86 A03;
    public final AnonymousClass00H A04 = C201811d.A00(49466);
    public final AnonymousClass00H A05;
    public final C51472Yk A06;
    public final C51482Yl A07;

    public C168308ie(C51462Yj r2, C51472Yk r3, C51482Yl r4, B86 b86, B86 b862, B86 b863, AnonymousClass00H r8) {
        C18070vi.A0g(r2, 4, r3);
        C18070vi.A0l(r4, r8);
        this.A02 = b86;
        this.A01 = b862;
        this.A03 = b863;
        this.A00 = r2;
        this.A06 = r3;
        this.A07 = r4;
        this.A05 = r8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.ADn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.ADn} */
    /* JADX WARNING: type inference failed for: r1v29, types: [X.B86, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.B86, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v44, types: [X.ADn] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b9, code lost:
        if ("COUNTRY_ORIGIN_EXEMPT".equalsIgnoreCase(r4) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A02(org.json.JSONObject r41, long r42) {
        /*
            r40 = this;
            r0 = 0
            java.lang.String[] r2 = X.AnonymousClass8BR.A1b()
            java.lang.String r5 = "id"
            r2[r0] = r5
            r0 = 1
            java.lang.String r4 = "name"
            r2[r0] = r4
            r1 = 2
            java.lang.String r3 = "media"
            r0 = r41
            boolean r1 = X.A3Q.A01(r3, r0, r2, r1)
            r2 = 0
            if (r1 == 0) goto L_0x023b
            java.lang.String r18 = X.A3Q.A00(r5, r0)
            X.C17960vV.A07(r18)
            X.C18070vi.A0X(r18)
            java.lang.String r19 = X.A3Q.A00(r4, r0)
            X.C17960vV.A07(r19)
            X.C18070vi.A0X(r19)
            java.lang.String r1 = "description"
            java.lang.String r20 = X.A3Q.A00(r1, r0)
            java.lang.String r4 = "currency"
            boolean r1 = r0.has(r4)
            if (r1 == 0) goto L_0x00d6
            java.lang.String r5 = X.A3Q.A00(r4, r0)
            if (r5 == 0) goto L_0x00d6
            int r4 = r5.length()
            r1 = 3
            if (r4 != r1) goto L_0x00d6
            X.A6S r10 = new X.A6S
            r10.<init>(r5)
        L_0x004e:
            java.lang.String r4 = "price"
            boolean r1 = r0.has(r4)
            if (r1 == 0) goto L_0x00d4
            java.lang.String r1 = X.A3Q.A00(r4, r0)
            if (r1 == 0) goto L_0x00d4
            java.lang.String r1 = X.A3Q.A00(r4, r0)
        L_0x0060:
            r9 = r40
            java.math.BigDecimal r25 = r9.A03(r10, r1)
            java.lang.String r1 = "sale_price"
            org.json.JSONObject r5 = r0.optJSONObject(r1)
            r11 = r42
            if (r10 == 0) goto L_0x00d2
            if (r5 == 0) goto L_0x00d2
            java.text.DateFormat r4 = X.C21324Ai9.A00()
            X.8ib r1 = new X.8ib
            r1.<init>(r10, r4)
            java.lang.Object r13 = r1.BFs(r5, r11)
            X.AE5 r13 = (X.AE5) r13
        L_0x0081:
            java.lang.String r1 = "url"
            java.lang.String r21 = X.A3Q.A00(r1, r0)
            java.lang.String r1 = "shimmed_url"
            java.lang.String r22 = X.A3Q.A00(r1, r0)
            java.lang.String r1 = "retailer_id"
            java.lang.String r23 = X.A3Q.A00(r1, r0)
            org.json.JSONObject r6 = r0.optJSONObject(r3)
            java.lang.String r1 = "status_info"
            org.json.JSONObject r5 = r0.optJSONObject(r1)
            java.lang.String r1 = "max_available"
            r3 = 99
            long r29 = r0.optLong(r1, r3)
            java.util.ArrayList r15 = X.AnonymousClass000.A13()
            if (r6 == 0) goto L_0x0104
            java.lang.String[] r3 = X.C17880vN.A1Y()
            r4 = 0
            java.lang.String r1 = "images"
            boolean r3 = X.A3Q.A01(r1, r6, r3, r4)
            if (r3 == 0) goto L_0x00d9
            org.json.JSONArray r3 = r6.optJSONArray(r1)
            if (r3 == 0) goto L_0x00d9
            int r8 = r3.length()
        L_0x00c2:
            if (r4 >= r8) goto L_0x00d9
            org.json.JSONObject r1 = r3.optJSONObject(r4)
            if (r1 == 0) goto L_0x00cf
            X.B86 r7 = r9.A01
            X.AnonymousClass8BW.A1A(r7, r15, r1, r11)
        L_0x00cf:
            int r4 = r4 + 1
            goto L_0x00c2
        L_0x00d2:
            r13 = 0
            goto L_0x0081
        L_0x00d4:
            r1 = 0
            goto L_0x0060
        L_0x00d6:
            r10 = 0
            goto L_0x004e
        L_0x00d9:
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
            java.lang.String[] r3 = X.C17880vN.A1Y()
            r4 = 0
            java.lang.String r1 = "videos"
            boolean r3 = X.A3Q.A01(r1, r6, r3, r4)
            if (r3 == 0) goto L_0x0108
            org.json.JSONArray r6 = r6.optJSONArray(r1)
            if (r6 == 0) goto L_0x0108
            int r7 = r6.length()
        L_0x00f4:
            if (r4 >= r7) goto L_0x0108
            org.json.JSONObject r3 = r6.optJSONObject(r4)
            if (r3 == 0) goto L_0x0101
            X.B86 r1 = r9.A03
            X.AnonymousClass8BW.A1A(r1, r14, r3, r11)
        L_0x0101:
            int r4 = r4 + 1
            goto L_0x00f4
        L_0x0104:
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
        L_0x0108:
            if (r5 == 0) goto L_0x0112
            X.B86 r1 = r9.A02
            java.lang.Object r2 = r1.BFs(r5, r11)
            X.AEJ r2 = (X.AEJ) r2
        L_0x0112:
            java.lang.String r1 = "image_fetch_status"
            java.lang.String r24 = X.A3Q.A00(r1, r0)
            X.00H r8 = r9.A04
            r8.get()
            java.lang.String r1 = "product_availability"
            java.lang.String r3 = X.A3Q.A00(r1, r0)
            java.lang.String r1 = "OUT_OF_STOCK"
            r28 = 1
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto L_0x0137
            java.lang.String r1 = "AVAILABLE_FOR_ANOTHER_POSTCODE"
            boolean r1 = r1.equalsIgnoreCase(r3)
            int r28 = X.AnonymousClass8BU.A00(r1)
        L_0x0137:
            r8.get()
            java.lang.String r1 = "is_hidden"
            java.lang.String r3 = X.A3Q.A00(r1, r0)
            java.lang.String r1 = "ISHIDDEN_TRUE"
            r32 = 1
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto L_0x0154
            java.lang.String r1 = "TRUE"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto L_0x0154
            r32 = 0
        L_0x0154:
            java.lang.String r1 = "compliance_category"
            java.lang.String r4 = X.A3Q.A00(r1, r0)
            java.lang.String r1 = "compliance_info"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            r6 = 0
            if (r1 == 0) goto L_0x01a8
            java.lang.String r3 = "country_code_origin"
            java.lang.String r7 = X.A3Q.A00(r3, r1)
            java.lang.String r3 = "importer_name"
            java.lang.String r5 = X.A3Q.A00(r3, r1)
            java.lang.String r3 = "importer_address"
            org.json.JSONObject r1 = r1.optJSONObject(r3)
            if (r1 == 0) goto L_0x01a2
            java.lang.String r3 = "street1"
            java.lang.String r34 = X.A3Q.A00(r3, r1)
            java.lang.String r3 = "street2"
            java.lang.String r35 = X.A3Q.A00(r3, r1)
            java.lang.String r3 = "postal_code"
            java.lang.String r36 = X.A3Q.A00(r3, r1)
            java.lang.String r3 = "city"
            java.lang.String r37 = X.A3Q.A00(r3, r1)
            java.lang.String r3 = "region"
            java.lang.String r38 = X.A3Q.A00(r3, r1)
            java.lang.String r3 = "country_code"
            java.lang.String r39 = X.A3Q.A00(r3, r1)
            X.AEM r6 = new X.AEM
            r33 = r6
            r33.<init>(r34, r35, r36, r37, r38, r39)
        L_0x01a2:
            X.ADn r1 = new X.ADn
            r1.<init>(r6, r7, r5)
            r6 = r1
        L_0x01a8:
            r8.get()
            java.lang.String r1 = "COMPLIANCECATEGORY_COUNTRYORIGINEXEMPT"
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 != 0) goto L_0x01bb
            java.lang.String r1 = "COUNTRY_ORIGIN_EXEMPT"
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L_0x01c3
        L_0x01bb:
            r1 = 0
            java.lang.String r3 = "N/A"
            X.ADn r6 = new X.ADn
            r6.<init>(r1, r3, r1)
        L_0x01c3:
            java.lang.String r1 = "variant_info"
            org.json.JSONObject r5 = r0.optJSONObject(r1)
            X.8iW r4 = new X.8iW
            r4.<init>(r10)
            X.2Yj r1 = r9.A00
            X.10F r1 = r1.A00
            X.10E r1 = r1.A00
            X.0ve r8 = X.AnonymousClass10E.A8r(r1)
            X.2C6 r1 = new X.2C6
            r1.<init>()
            X.8iX r3 = new X.8iX
            r3.<init>(r1)
            X.8iS r7 = new X.8iS
            r7.<init>()
            X.8id r1 = new X.8id
            r1.<init>(r8, r3, r7, r4)
            if (r5 == 0) goto L_0x022d
            java.lang.Object r3 = r1.BFs(r5, r11)
            X.AE6 r3 = (X.AE6) r3
        L_0x01f4:
            java.lang.String r1 = "boost_again_eligibility_settings"
            org.json.JSONObject r4 = r0.optJSONObject(r1)
            r1 = 0
            if (r4 == 0) goto L_0x0208
            java.lang.String r5 = "deep_link_action"
            java.lang.String r4 = X.C20064A5n.A01(r5, r1, r4)
            X.ADH r1 = new X.ADH
            r1.<init>(r4)
        L_0x0208:
            r31 = 1
            X.AEv r11 = new X.AEv
            r26 = r15
            r27 = r14
            r14 = r2
            r15 = r13
            r16 = r3
            r17 = r10
            r12 = r1
            r13 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32)
            java.lang.String r1 = "belongs_to"
            java.lang.String r1 = X.A3Q.A00(r1, r0)
            if (r1 == 0) goto L_0x022f
            boolean r0 = java.lang.Boolean.parseBoolean(r1)
            X.8iN r2 = new X.8iN
            r2.<init>(r11, r0)
            return r2
        L_0x022d:
            r3 = 0
            goto L_0x01f4
        L_0x022f:
            X.00H r1 = r9.A05
            java.lang.Object r1 = r1.get()
            X.9k3 r1 = (X.C189909k3) r1
            r1.A00(r11, r0)
            return r11
        L_0x023b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168308ie.A02(org.json.JSONObject, long):java.lang.Object");
    }
}
