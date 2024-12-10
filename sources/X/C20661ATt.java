package X;

/* renamed from: X.ATt  reason: case insensitive filesystem */
public final class C20661ATt implements B86 {
    public final B86 A00;
    public final AnonymousClass00H A01;

    public C20661ATt(B86 b86, AnonymousClass00H r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = b86;
        this.A01 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.AN6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.AN6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.AN6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.AN6} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.AN6] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object, X.B7B, X.AN6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BFs(org.json.JSONObject r8, long r9) {
        /*
            r7 = this;
            java.lang.String r3 = "products"
            r5 = 0
            r1 = 8521854914602861(0x1e4694f703276d, double:4.2103557521486634E-308)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000f
            java.lang.String r2 = "xfb_whatsapp_catalog_product_list"
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = "xwa_product_catalog_get_product_list"
        L_0x0011:
            r1 = 1
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ Exception -> 0x009b }
            boolean r0 = X.A3Q.A01(r2, r8, r0, r5)     // Catch:{ Exception -> 0x009b }
            if (r0 == 0) goto L_0x007b
            org.json.JSONObject r2 = r8.optJSONObject(r2)     // Catch:{ Exception -> 0x009b }
            if (r2 == 0) goto L_0x007b
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ Exception -> 0x009b }
            java.lang.String r1 = "product_list"
            boolean r0 = X.A3Q.A01(r1, r2, r0, r5)     // Catch:{ Exception -> 0x009b }
            if (r0 == 0) goto L_0x007b
            org.json.JSONObject r4 = r2.optJSONObject(r1)     // Catch:{ Exception -> 0x009b }
            if (r4 == 0) goto L_0x007b
            java.lang.String[] r0 = X.C17880vN.A1Y()     // Catch:{ Exception -> 0x009b }
            boolean r0 = X.A3Q.A01(r3, r4, r0, r5)     // Catch:{ Exception -> 0x009b }
            if (r0 == 0) goto L_0x007b
            org.json.JSONArray r6 = r4.optJSONArray(r3)     // Catch:{ Exception -> 0x009b }
            if (r6 != 0) goto L_0x0049
            r0 = 4
            X.AN6 r2 = new X.AN6     // Catch:{ Exception -> 0x009b }
            r2.<init>()     // Catch:{ Exception -> 0x009b }
        L_0x0046:
            r2.A00 = r0     // Catch:{ Exception -> 0x009b }
            goto L_0x0082
        L_0x0049:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x009b }
            int r3 = r6.length()     // Catch:{ Exception -> 0x009b }
            r2 = 0
        L_0x0052:
            if (r2 >= r3) goto L_0x0062
            org.json.JSONObject r1 = r6.optJSONObject(r2)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x005f
            X.B86 r0 = r7.A00     // Catch:{ Exception -> 0x009b }
            X.AnonymousClass8BW.A1A(r0, r5, r1, r9)     // Catch:{ Exception -> 0x009b }
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0052
        L_0x0062:
            java.lang.String r0 = "cart_enabled"
            java.lang.String r1 = X.A3Q.A00(r0, r4)     // Catch:{ Exception -> 0x009b }
            java.lang.String r0 = "CARTENABLED_TRUE"
            boolean r1 = X.C18070vi.A18(r1, r0)     // Catch:{ Exception -> 0x009b }
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x009b }
            if (r0 == 0) goto L_0x0083
            r0 = 4
            X.AN6 r2 = new X.AN6     // Catch:{ Exception -> 0x009b }
            r2.<init>()     // Catch:{ Exception -> 0x009b }
            goto L_0x0046
        L_0x007b:
            r0 = 4
            X.AN6 r2 = new X.AN6     // Catch:{ Exception -> 0x009b }
            r2.<init>()     // Catch:{ Exception -> 0x009b }
            goto L_0x0046
        L_0x0082:
            return r2
        L_0x0083:
            r0 = 1
            X.AN6 r2 = new X.AN6     // Catch:{ Exception -> 0x009b }
            r2.<init>()     // Catch:{ Exception -> 0x009b }
            r2.A00 = r0     // Catch:{ Exception -> 0x009b }
            r2.A01 = r5     // Catch:{ Exception -> 0x009b }
            r2.A02 = r1     // Catch:{ Exception -> 0x009b }
            X.00H r0 = r7.A01     // Catch:{ Exception -> 0x009b }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x009b }
            X.9k3 r0 = (X.C189909k3) r0     // Catch:{ Exception -> 0x009b }
            r0.A00(r2, r4)     // Catch:{ Exception -> 0x009b }
            return r2
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = "CatalogPageGraphQLResponseConverter/convert/Could not create CatalogPage from GetProductList GraphQL response"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 2
            X.AN6 r2 = new X.AN6
            r2.<init>()
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20661ATt.BFs(org.json.JSONObject, long):java.lang.Object");
    }
}
