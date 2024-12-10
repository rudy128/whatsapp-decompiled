package X;

/* renamed from: X.9QU  reason: invalid class name */
public abstract class AnonymousClass9QU {
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d1 A[Catch:{ JSONException -> 0x038b }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02d3 A[SYNTHETIC, Splitter:B:106:0x02d3] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0310 A[Catch:{ JSONException -> 0x038b }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0388 A[Catch:{ JSONException -> 0x038b }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021c A[SYNTHETIC, Splitter:B:72:0x021c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.json.JSONObject A00(X.C20285AEt r14, boolean r15) {
        /*
            r4 = 0
            X.C18070vi.A0d(r14, r4)
            org.json.JSONObject r2 = X.C17880vN.A15()
            X.AEE r3 = r14.A05     // Catch:{ JSONException -> 0x038b }
            if (r3 == 0) goto L_0x0046
            java.lang.String r1 = "title"
            java.lang.String r0 = r3.A02     // Catch:{ JSONException -> 0x038b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "sub_title"
            java.lang.String r0 = r3.A01     // Catch:{ JSONException -> 0x038b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            byte[] r0 = r3.A03     // Catch:{ JSONException -> 0x038b }
            byte[] r0 = X.AnonymousClass9QV.A00(r0, r15)     // Catch:{ JSONException -> 0x038b }
            if (r0 != 0) goto L_0x0024
            r1 = 0
            goto L_0x0028
        L_0x0024:
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r4)     // Catch:{ JSONException -> 0x038b }
        L_0x0028:
            java.lang.String r0 = "header_thumbnail"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x038b }
            X.AEi r3 = r3.A00     // Catch:{ JSONException -> 0x038b }
            if (r3 == 0) goto L_0x0046
            boolean r1 = r3.A00()     // Catch:{ JSONException -> 0x038b }
            r0 = 1
            if (r1 != r0) goto L_0x0046
            X.Az1 r0 = new X.Az1     // Catch:{ JSONException -> 0x038b }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x038b }
            X.84U r1 = X.AnonymousClass84U.A00(r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = "document_metadata"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x038b }
        L_0x0046:
            java.lang.String r8 = "description"
            java.lang.String r0 = r14.A0B     // Catch:{ JSONException -> 0x038b }
            r2.put(r8, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "templateId"
            java.lang.String r0 = r14.A0E     // Catch:{ JSONException -> 0x038b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "hsmtag"
            java.lang.String r0 = r14.A0D     // Catch:{ JSONException -> 0x038b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "footerText"
            java.lang.String r0 = r14.A0C     // Catch:{ JSONException -> 0x038b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "buttonText"
            java.lang.String r0 = r14.A0A     // Catch:{ JSONException -> 0x038b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "selectListType"
            int r0 = r14.A00     // Catch:{ JSONException -> 0x038b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r11 = "sections"
            org.json.JSONArray r10 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x038b }
            java.util.List r0 = r14.A0F     // Catch:{ JSONException -> 0x038b }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ JSONException -> 0x038b }
        L_0x007c:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r1 = r13.next()     // Catch:{ JSONException -> 0x038b }
            X.AE4 r1 = (X.AE4) r1     // Catch:{ JSONException -> 0x038b }
            org.json.JSONObject r9 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x038b }
            java.lang.String r7 = "title"
            java.lang.String r0 = r1.A01     // Catch:{ JSONException -> 0x038b }
            r9.put(r7, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r6 = "items"
            org.json.JSONArray r5 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x038b }
            java.util.List r0 = r1.A02     // Catch:{ JSONException -> 0x038b }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x038b }
        L_0x009f:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r4 = r12.next()     // Catch:{ JSONException -> 0x038b }
            X.AEF r4 = (X.AEF) r4     // Catch:{ JSONException -> 0x038b }
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "id"
            java.lang.String r0 = r4.A02     // Catch:{ JSONException -> 0x038b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = r4.A03     // Catch:{ JSONException -> 0x038b }
            r3.put(r7, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = r4.A00     // Catch:{ JSONException -> 0x038b }
            r3.put(r8, r0)     // Catch:{ JSONException -> 0x038b }
            r5.put(r3)     // Catch:{ JSONException -> 0x038b }
            goto L_0x009f
        L_0x00c4:
            r9.put(r6, r5)     // Catch:{ JSONException -> 0x038b }
            r10.put(r9)     // Catch:{ JSONException -> 0x038b }
            goto L_0x007c
        L_0x00cb:
            r2.put(r11, r10)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r5 = "product_info"
            X.AER r1 = r14.A07     // Catch:{ JSONException -> 0x038b }
            if (r1 != 0) goto L_0x00d7
            r4 = 0
            goto L_0x0161
        L_0x00d7:
            java.util.List r0 = r1.A02     // Catch:{ JSONException -> 0x038b }
            X.AE3 r6 = r1.A01     // Catch:{ JSONException -> 0x038b }
            com.whatsapp.jid.UserJid r9 = r1.A00     // Catch:{ JSONException -> 0x038b }
            org.json.JSONObject r4 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x038b }
            org.json.JSONArray r10 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x038b }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ JSONException -> 0x038b }
        L_0x00e9:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x012b
            java.lang.Object r0 = r13.next()     // Catch:{ JSONException -> 0x038b }
            X.ADm r0 = (X.C20254ADm) r0     // Catch:{ JSONException -> 0x038b }
            java.lang.String r3 = r0.A00     // Catch:{ JSONException -> 0x038b }
            java.util.List r1 = r0.A01     // Catch:{ JSONException -> 0x038b }
            org.json.JSONObject r11 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = "product_sections_title"
            org.json.JSONArray r7 = X.AnonymousClass8BT.A12(r3, r0, r11)     // Catch:{ JSONException -> 0x038b }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ JSONException -> 0x038b }
        L_0x0107:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x0122
            java.lang.Object r0 = r12.next()     // Catch:{ JSONException -> 0x038b }
            X.ADb r0 = (X.C20243ADb) r0     // Catch:{ JSONException -> 0x038b }
            java.lang.String r3 = r0.A00     // Catch:{ JSONException -> 0x038b }
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = "product_id"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x038b }
            r7.put(r1)     // Catch:{ JSONException -> 0x038b }
            goto L_0x0107
        L_0x0122:
            java.lang.String r0 = "product_section_products"
            r11.put(r0, r7)     // Catch:{ JSONException -> 0x038b }
            r10.put(r11)     // Catch:{ JSONException -> 0x038b }
            goto L_0x00e9
        L_0x012b:
            java.lang.String r0 = "product_sections"
            r4.put(r0, r10)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "business_owner_jid"
            java.lang.String r0 = r9.getRawString()     // Catch:{ JSONException -> 0x038b }
            org.json.JSONObject r3 = X.C108965cb.A0x(r0, r1, r4)     // Catch:{ JSONException -> 0x038b }
            byte[] r0 = r6.A02     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x014e
            byte[] r1 = X.AnonymousClass9QV.A00(r0, r15)     // Catch:{ JSONException -> 0x038b }
            if (r1 == 0) goto L_0x014e
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = "product_header_info_thumb"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x038b }
        L_0x014e:
            java.lang.String r1 = "product_header_info_id"
            java.lang.String r0 = r6.A01     // Catch:{ JSONException -> 0x038b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "product_header_is_rejected"
            boolean r0 = r6.A00     // Catch:{ JSONException -> 0x038b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = "product_header_info"
            r4.put(r0, r3)     // Catch:{ JSONException -> 0x038b }
        L_0x0161:
            r2.put(r5, r4)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r10 = "checkout_info"
            X.AEn r0 = r14.A02     // Catch:{ JSONException -> 0x038b }
            org.json.JSONObject r0 = X.C20122A8h.A05(r0, r15)     // Catch:{ JSONException -> 0x038b }
            r2.put(r10, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r5 = "payment_info"
            X.AEY r6 = r14.A03     // Catch:{ JSONException -> 0x038b }
            if (r6 != 0) goto L_0x0177
            r4 = 0
            goto L_0x01e7
        L_0x0177:
            org.json.JSONObject r4 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x038b }
            X.1KJ r0 = r6.A00     // Catch:{ JSONException -> 0x038b }
            X.C18070vi.A0b(r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = X.AnonymousClass8BS.A0j(r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = "currency"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x038b }
            java.util.List r1 = r6.A03     // Catch:{ JSONException -> 0x038b }
            boolean r0 = X.C137476vW.A00(r1)     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x0193
            r7 = 0
            goto L_0x01d7
        L_0x0193:
            org.json.JSONArray r7 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x038b }
            X.C18070vi.A0b(r1)     // Catch:{ JSONException -> 0x038b }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ JSONException -> 0x038b }
        L_0x019e:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r1 = r12.next()     // Catch:{ JSONException -> 0x038b }
            X.ADj r1 = (X.C20251ADj) r1     // Catch:{ JSONException -> 0x038b }
            org.json.JSONObject r9 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x038b }
            X.C18070vi.A0b(r1)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r11 = r1.A01     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = "type"
            r9.put(r0, r11)     // Catch:{ JSONException -> 0x038b }
            X.BDZ r3 = r1.A00     // Catch:{ JSONException -> 0x038b }
            if (r3 == 0) goto L_0x01d3
            java.lang.String r1 = "pix_static_code"
            boolean r0 = X.C18070vi.A18(r11, r1)     // Catch:{ JSONException -> 0x038b }
            if (r0 != 0) goto L_0x01cc
            java.lang.String r1 = "pix_dynamic_code"
            boolean r0 = X.C18070vi.A18(r11, r1)     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x01d3
        L_0x01cc:
            org.json.JSONObject r0 = r3.CPM()     // Catch:{ JSONException -> 0x038b }
            r9.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
        L_0x01d3:
            r7.put(r9)     // Catch:{ JSONException -> 0x038b }
            goto L_0x019e
        L_0x01d7:
            java.lang.String r0 = "payment_settings"
            if (r7 == 0) goto L_0x01de
            r4.put(r0, r7)     // Catch:{ JSONException -> 0x038b }
        L_0x01de:
            java.lang.String r1 = "logging_id"
            java.lang.String r0 = r6.A01     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x01e7
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
        L_0x01e7:
            r2.put(r5, r4)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r4 = "shops_info"
            X.ADF r5 = r14.A08     // Catch:{ JSONException -> 0x038b }
            r6 = 0
            if (r5 == 0) goto L_0x0211
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x020b }
            java.lang.String r1 = "id"
            java.lang.String r0 = r5.A02     // Catch:{ JSONException -> 0x020b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x020b }
            java.lang.String r1 = "shop_surface"
            int r0 = r5.A00     // Catch:{ JSONException -> 0x020b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x020b }
            java.lang.String r1 = "message_version"
            int r0 = r5.A01     // Catch:{ JSONException -> 0x020b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x020b }
            goto L_0x0212
        L_0x020b:
            r1 = move-exception
            java.lang.String r0 = "ShopInfoContentConverter/toJsonObject error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x038b }
        L_0x0211:
            r3 = r6
        L_0x0212:
            r2.put(r4, r3)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r5 = "native_flow_content"
            X.AEk r3 = r14.A06     // Catch:{ JSONException -> 0x038b }
            r7 = 0
            if (r3 == 0) goto L_0x02c8
            org.json.JSONObject r6 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x02c3 }
            org.json.JSONArray r9 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "content_of_nfm"
            int r0 = r3.A01     // Catch:{ JSONException -> 0x02c3 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "message_params_json"
            java.lang.String r0 = r3.A02     // Catch:{ JSONException -> 0x02c3 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x02c3 }
            java.util.List r0 = r3.A03     // Catch:{ JSONException -> 0x02c3 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ JSONException -> 0x02c3 }
        L_0x0238:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x02c3 }
            if (r0 == 0) goto L_0x026e
            java.lang.Object r12 = r13.next()     // Catch:{ JSONException -> 0x02c3 }
            X.ADl r12 = (X.C20253ADl) r12     // Catch:{ JSONException -> 0x02c3 }
            org.json.JSONObject r4 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "name"
            X.AEe r11 = r12.A01     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r0 = r11.A02     // Catch:{ JSONException -> 0x02c3 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "params"
            java.lang.String r0 = r11.A00     // Catch:{ JSONException -> 0x02c3 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "selected"
            boolean r0 = r12.A00     // Catch:{ JSONException -> 0x02c3 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x02c3 }
            X.AEn r0 = r11.A01     // Catch:{ JSONException -> 0x02c3 }
            if (r0 == 0) goto L_0x026a
            org.json.JSONObject r0 = X.C20122A8h.A05(r0, r15)     // Catch:{ JSONException -> 0x02c3 }
            r4.put(r10, r0)     // Catch:{ JSONException -> 0x02c3 }
        L_0x026a:
            r9.put(r4)     // Catch:{ JSONException -> 0x02c3 }
            goto L_0x0238
        L_0x026e:
            java.lang.String r0 = "buttons"
            r6.put(r0, r9)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r4 = "form_state"
            java.util.List r10 = r3.A04     // Catch:{ JSONException -> 0x02c3 }
            X.ADE r0 = r3.A00     // Catch:{ JSONException -> 0x02c3 }
            if (r0 != 0) goto L_0x027d
            r3 = r7
            goto L_0x02bf
        L_0x027d:
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "is_form_disabled"
            boolean r0 = r0.A00     // Catch:{ JSONException -> 0x02b9 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x02b9 }
            if (r10 == 0) goto L_0x02bf
            java.util.HashMap r9 = X.C17880vN.A11()     // Catch:{ JSONException -> 0x02b9 }
            java.util.Iterator r11 = r10.iterator()     // Catch:{ JSONException -> 0x02b9 }
        L_0x0292:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x02b9 }
            if (r0 == 0) goto L_0x02ae
            java.lang.Object r10 = r11.next()     // Catch:{ JSONException -> 0x02b9 }
            X.4c9 r10 = (X.AnonymousClass4c9) r10     // Catch:{ JSONException -> 0x02b9 }
            boolean r0 = r10 instanceof X.AnonymousClass465     // Catch:{ JSONException -> 0x02b9 }
            if (r0 == 0) goto L_0x0292
            X.465 r10 = (X.AnonymousClass465) r10     // Catch:{ JSONException -> 0x02b9 }
            java.lang.String r1 = r10.A01     // Catch:{ JSONException -> 0x02b9 }
            X.AD7 r0 = r10.A00     // Catch:{ JSONException -> 0x02b9 }
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x02b9 }
            r9.put(r1, r0)     // Catch:{ JSONException -> 0x02b9 }
            goto L_0x0292
        L_0x02ae:
            java.lang.String r1 = "form_elements_values"
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02b9 }
            r0.<init>(r9)     // Catch:{ JSONException -> 0x02b9 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x02b9 }
            goto L_0x02bf
        L_0x02b9:
            r1 = move-exception
            java.lang.String r0 = "NativeFlowMessageConverter/toJSONObject/error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x02c3 }
        L_0x02bf:
            r6.put(r4, r3)     // Catch:{ JSONException -> 0x02c3 }
            goto L_0x02c8
        L_0x02c3:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x038b }
            r6 = r7
        L_0x02c8:
            r2.put(r5, r6)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r5 = "carousel_content"
            X.ADa r0 = r14.A04     // Catch:{ JSONException -> 0x038b }
            if (r0 != 0) goto L_0x02d3
            r4 = r7
            goto L_0x0302
        L_0x02d3:
            org.json.JSONObject r4 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x02fb }
            org.json.JSONArray r3 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x02fb }
            java.util.List r0 = r0.A00     // Catch:{ JSONException -> 0x02fb }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x02fb }
        L_0x02e1:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x02fb }
            if (r0 == 0) goto L_0x02f5
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x02fb }
            X.AEt r0 = (X.C20285AEt) r0     // Catch:{ JSONException -> 0x02fb }
            org.json.JSONObject r0 = A00(r0, r15)     // Catch:{ JSONException -> 0x02fb }
            r3.put(r0)     // Catch:{ JSONException -> 0x02fb }
            goto L_0x02e1
        L_0x02f5:
            java.lang.String r0 = "cards"
            r4.put(r0, r3)     // Catch:{ JSONException -> 0x02fb }
            goto L_0x0302
        L_0x02fb:
            r1 = move-exception
            java.lang.String r0 = "CarouselMessageConverter/toJSONObject/serialization error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x038b }
            r4 = r7
        L_0x0302:
            r2.put(r5, r4)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r3 = "single_product_info"
            X.ADG r5 = r14.A09     // Catch:{ JSONException -> 0x038b }
            r6 = 0
            if (r5 == 0) goto L_0x0388
            com.whatsapp.jid.UserJid r0 = r5.A01     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x0388
            org.json.JSONObject r4 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = r0.getRawString()     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = "business_owner_jid"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "product_id"
            java.lang.String r0 = r5.A06     // Catch:{ JSONException -> 0x038b }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "title"
            java.lang.String r0 = r5.A09     // Catch:{ JSONException -> 0x038b }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r0 = r5.A04     // Catch:{ JSONException -> 0x038b }
            r4.put(r8, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "currency_code"
            java.lang.String r0 = r5.A03     // Catch:{ JSONException -> 0x038b }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.math.BigDecimal r1 = r5.A0A     // Catch:{ JSONException -> 0x038b }
            if (r1 == 0) goto L_0x0347
            java.math.BigDecimal r0 = X.C197309wU.A00     // Catch:{ JSONException -> 0x038b }
            java.math.BigDecimal r0 = r1.multiply(r0)     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x0347
            java.lang.Long r7 = X.AnonymousClass8BT.A0o(r0)     // Catch:{ JSONException -> 0x038b }
        L_0x0347:
            java.lang.String r0 = "price_amount"
            r4.put(r0, r7)     // Catch:{ JSONException -> 0x038b }
            java.math.BigDecimal r1 = r5.A0B     // Catch:{ JSONException -> 0x038b }
            if (r1 == 0) goto L_0x035c
            java.math.BigDecimal r0 = X.C197309wU.A00     // Catch:{ JSONException -> 0x038b }
            java.math.BigDecimal r0 = r1.multiply(r0)     // Catch:{ JSONException -> 0x038b }
            if (r0 == 0) goto L_0x035c
            java.lang.Long r6 = X.AnonymousClass8BT.A0o(r0)     // Catch:{ JSONException -> 0x038b }
        L_0x035c:
            java.lang.String r0 = "sale_price_amount"
            r4.put(r0, r6)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "retailer_id"
            java.lang.String r0 = r5.A08     // Catch:{ JSONException -> 0x038b }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "product_url"
            java.lang.String r0 = r5.A07     // Catch:{ JSONException -> 0x038b }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "product_image_count"
            int r0 = r5.A00     // Catch:{ JSONException -> 0x038b }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "body"
            java.lang.String r0 = r5.A02     // Catch:{ JSONException -> 0x038b }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
            java.lang.String r1 = "footer"
            java.lang.String r0 = r5.A05     // Catch:{ JSONException -> 0x038b }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x038b }
        L_0x0384:
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x038b }
            goto L_0x038a
        L_0x0388:
            r4 = r7
            goto L_0x0384
        L_0x038a:
            return r2
        L_0x038b:
            r1 = move-exception
            java.lang.String r0 = "InteractiveMessageConverter/toJSONObject/serialization error"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9QU.A00(X.AEt, boolean):org.json.JSONObject");
    }
}
