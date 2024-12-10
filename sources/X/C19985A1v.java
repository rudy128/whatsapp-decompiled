package X;

/* renamed from: X.A1v  reason: case insensitive filesystem */
public abstract class C19985A1v {
    public String A00;
    public boolean A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1KI A03;

    public static final String A00(C166398cp r1) {
        if ((r1.bitField0_ & 4) == 0) {
            return null;
        }
        C164028Xg r0 = r1.footer_;
        if (r0 == null) {
            r0 = C164028Xg.DEFAULT_INSTANCE;
        }
        return r0.text_;
    }

    /* JADX WARNING: type inference failed for: r0v61, types: [X.ADG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v72, types: [X.ADF, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x043b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x043c, code lost:
        r0.A00.A0G("JsonPayloadForNativeFlowMPMIsMalformed", X.AnonymousClass001.A1E(r4, "Malformed params_json payload detected. error: ", X.AnonymousClass000.A10()), true);
        r1 = X.AnonymousClass000.A10();
        r1.append("MPMNativeFlowContentFactory/parseE2EProductListInfo/invalid or missing fields in button_params_json=");
        X.C108985cd.A1M(r12.buttonParamsJson_, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x045d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x043b A[ExcHandler: JSONException (r4v5 'e' org.json.JSONException A[CUSTOM_DECLARE]), Splitter:B:137:0x0328] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C20285AEt A01(X.C166398cp r28) {
        /*
            r27 = this;
            r0 = r27
            boolean r2 = r0 instanceof X.C1773098b
            r1 = r28
            if (r2 == 0) goto L_0x0060
            r3 = 0
            X.9iZ r6 = X.C20285AEt.A0G
            java.lang.String r2 = r0.A00
            X.AEE r5 = r0.A02(r1, r2)
            java.lang.String r7 = r0.A03(r1, r3)
            int r2 = r1.interactiveMessageCase_
            r0 = 4
            if (r2 != r0) goto L_0x005d
            java.lang.Object r4 = r1.interactiveMessage_
            X.8a8 r4 = (X.C164828a8) r4
        L_0x001e:
            if (r4 == 0) goto L_0x005b
            java.lang.String r3 = r4.id_
            int r1 = r4.surface_
            if (r1 == 0) goto L_0x0058
            r0 = 1
            if (r1 == r0) goto L_0x0055
            r0 = 2
            if (r1 == r0) goto L_0x0052
            r0 = 3
            if (r1 != r0) goto L_0x0058
            X.9KB r0 = X.AnonymousClass9KB.WA
        L_0x0031:
            int r0 = r0.ordinal()
            r2 = 1
            if (r0 == r2) goto L_0x003f
            r2 = 2
            if (r0 == r2) goto L_0x003f
            r2 = 3
            if (r0 == r2) goto L_0x003f
            r2 = 0
        L_0x003f:
            int r0 = r4.messageVersion_
            X.ADF r1 = new X.ADF
            r1.<init>()
            r1.A02 = r3
            r1.A00 = r2
            r1.A01 = r0
        L_0x004c:
            r0 = 4
            X.AEt r1 = r6.A00(r5, r1, r7, r0)
            return r1
        L_0x0052:
            X.9KB r0 = X.AnonymousClass9KB.IG
            goto L_0x0031
        L_0x0055:
            X.9KB r0 = X.AnonymousClass9KB.FB
            goto L_0x0031
        L_0x0058:
            X.9KB r0 = X.AnonymousClass9KB.UNKNOWN_SURFACE
            goto L_0x0031
        L_0x005b:
            r1 = 0
            goto L_0x004c
        L_0x005d:
            X.8a8 r4 = X.C164828a8.DEFAULT_INSTANCE
            goto L_0x001e
        L_0x0060:
            boolean r2 = r0 instanceof X.C1773398e
            if (r2 == 0) goto L_0x0187
            X.98e r0 = (X.C1773398e) r0
            X.8a7 r2 = r1.A0S()
            java.lang.String r2 = r2.messageParamsJson_
            int r6 = r2.length()
            X.0ve r5 = r0.A01
            r4 = 11171(0x2ba3, float:1.5654E-41)
            X.0vf r3 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r3, r5, r4)
            if (r6 > r2) goto L_0x015d
            java.lang.String r3 = r0.A00
            java.lang.String r2 = "catalog_message"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00c7
            r26 = 1
        L_0x0088:
            X.AEE r14 = r0.A02(r1, r3)
            boolean r2 = r0.A00
            java.lang.String r19 = r0.A03(r1, r2)
            java.lang.String r20 = A00(r1)
            X.8bW r3 = r1.header_
            if (r3 != 0) goto L_0x009c
            X.8bW r3 = X.C165638bW.DEFAULT_INSTANCE
        L_0x009c:
            int r2 = r3.mediaCase_
            r0 = 9
            if (r2 != r0) goto L_0x00c4
            java.lang.Object r7 = r3.media_
            X.8bb r7 = (X.C165688bb) r7
        L_0x00a6:
            r0 = 0
            if (r7 == 0) goto L_0x012a
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r2 = r7.businessOwnerJid_
            com.whatsapp.jid.UserJid r6 = r3.A04(r2)
            if (r6 == 0) goto L_0x00ed
            X.8cF r8 = r7.product_
            if (r8 != 0) goto L_0x00b9
            X.8cF r8 = X.C166038cF.DEFAULT_INSTANCE
        L_0x00b9:
            java.lang.String r5 = r8.currencyCode_
            if (r5 == 0) goto L_0x00f2
            int r2 = r5.length()
            if (r2 == 0) goto L_0x00f2
            goto L_0x00d2
        L_0x00c4:
            X.8bb r7 = X.C165688bb.DEFAULT_INSTANCE
            goto L_0x00a6
        L_0x00c7:
            java.lang.String r2 = "form_message"
            boolean r2 = r2.equals(r3)
            int r26 = X.AnonymousClass8BU.A00(r2)
            goto L_0x0088
        L_0x00d2:
            X.A6S r4 = new X.A6S     // Catch:{ IllegalArgumentException -> 0x00e9 }
            r4.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x00e9 }
            long r2 = r8.priceAmount1000_     // Catch:{ IllegalArgumentException -> 0x00e9 }
            java.math.BigDecimal r13 = X.C197309wU.A00(r4, r2)     // Catch:{ IllegalArgumentException -> 0x00e9 }
            X.A6S r4 = new X.A6S     // Catch:{ IllegalArgumentException -> 0x00ea }
            r4.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x00ea }
            long r2 = r8.salePriceAmount1000_     // Catch:{ IllegalArgumentException -> 0x00ea }
            java.math.BigDecimal r12 = X.C197309wU.A00(r4, r2)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x00f4
        L_0x00e9:
            r13 = r0
        L_0x00ea:
            r5 = r0
            r12 = r0
            goto L_0x00f4
        L_0x00ed:
            X.1hd r0 = X.AnonymousClass8BT.A0b()
            throw r0
        L_0x00f2:
            r13 = r0
            r12 = r0
        L_0x00f4:
            java.lang.String r11 = r8.productId_
            java.lang.String r10 = r8.title_
            java.lang.String r9 = r8.description_
            java.lang.String r4 = r8.retailerId_
            java.lang.String r3 = r8.url_
            int r8 = r8.productImageCount_
            java.lang.String r2 = r7.body_
            java.lang.String r7 = r7.footer_
            X.C18070vi.A0b(r11)
            X.C18070vi.A0b(r10)
            X.C18070vi.A0k(r11, r10)
            X.ADG r0 = new X.ADG
            r0.<init>()
            r0.A01 = r6
            r0.A06 = r11
            r0.A09 = r10
            r0.A04 = r9
            r0.A03 = r5
            r0.A0A = r13
            r0.A0B = r12
            r0.A08 = r4
            r0.A07 = r3
            r0.A00 = r8
            r0.A02 = r2
            r0.A05 = r7
        L_0x012a:
            X.8a7 r2 = r1.A0S()
            java.util.ArrayList r24 = X.C20093A6v.A00(r2)
            X.8a7 r1 = r1.A0S()
            java.lang.String r1 = r1.messageParamsJson_
            r10 = 0
            X.AEk r15 = new X.AEk
            r25 = r10
            r21 = r15
            r22 = r10
            r23 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r25 = 9
            X.0wS r24 = X.C18460wS.A00
            X.AEt r9 = new X.AEt
            r12 = r10
            r13 = r10
            r16 = r10
            r17 = r10
            r21 = r10
            r23 = r10
            r11 = r10
            r18 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r9
        L_0x015d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageParamsJson over allowed size. Size was "
            r2.append(r0)
            X.8a7 r0 = r1.A0S()
            java.lang.String r0 = r0.messageParamsJson_
            int r0 = r0.length()
            r2.append(r0)
            java.lang.String r0 = ", allowed size is "
            r2.append(r0)
            int r0 = X.C18020vd.A00(r3, r5, r4)
            java.lang.String r1 = X.C17880vN.A0t(r2, r0)
            r0 = 21
            X.1hd r0 = X.AnonymousClass8BR.A0p(r1, r0)
            throw r0
        L_0x0187:
            boolean r2 = r0 instanceof X.C1772998a
            if (r2 == 0) goto L_0x01eb
            r10 = 0
            java.lang.String r5 = X.AnonymousClass8BX.A0b(r1, r10)
            X.1KI r3 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r6 = 0
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = "PaymentInfoContentParser/parseE2EPaymentInfoContent/invalid native flow message does not have parameters json"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x019e:
            r1 = 26
            java.lang.String r0 = "Invalid payment information"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x01a7:
            org.json.JSONObject r2 = X.C17880vN.A16(r5)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "title"
            java.lang.String r4 = r2.optString(r0)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "currency"
            java.lang.String r0 = r2.optString(r0)     // Catch:{ JSONException -> 0x01cb }
            X.1KJ r3 = r3.A01(r0)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "payment_settings"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch:{ JSONException -> 0x01cb }
            java.util.ArrayList r0 = X.C181629Rf.A00(r0)     // Catch:{ JSONException -> 0x01cb }
            X.AEY r2 = new X.AEY     // Catch:{ JSONException -> 0x01cb }
            r2.<init>(r3, r4, r6, r0)     // Catch:{ JSONException -> 0x01cb }
            goto L_0x01d5
        L_0x01cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PaymentInfoContentParser/parseE2EPaymentInfoContent/invalid paramsJson="
            X.C17900vP.A0e(r0, r5, r1)
            goto L_0x019e
        L_0x01d5:
            X.8a7 r0 = r1.A0S()
            java.util.ArrayList r8 = X.C20093A6v.A00(r0)
            java.lang.String r7 = "{}"
            X.AEk r5 = new X.AEk
            r9 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            X.AEt r1 = new X.AEt
            r1.<init>(r2, r5)
            return r1
        L_0x01eb:
            boolean r2 = r0 instanceof X.C1773498f
            if (r2 == 0) goto L_0x02ef
            X.98f r0 = (X.C1773498f) r0
            int r3 = r1.interactiveMessageCase_
            r2 = 6
            if (r3 != r2) goto L_0x0240
            X.8a7 r2 = r1.A0S()
            int r2 = r2.bitField0_
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0240
            X.8a7 r2 = r1.A0S()
            java.lang.String r2 = r2.messageParamsJson_
            int r6 = r2.length()
            X.0ve r5 = r0.A01
            r4 = 11171(0x2ba3, float:1.5654E-41)
            X.0vf r3 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r3, r5, r4)
            if (r6 <= r2) goto L_0x0240
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageParamsJson over allowed size. Size was "
            r2.append(r0)
            X.8a7 r0 = r1.A0S()
            java.lang.String r0 = r0.messageParamsJson_
            int r0 = r0.length()
            r2.append(r0)
            java.lang.String r0 = ", allowed size is "
            r2.append(r0)
            int r0 = X.C18020vd.A00(r3, r5, r4)
            java.lang.String r1 = X.C17880vN.A0t(r2, r0)
            r0 = 21
            X.1hd r0 = X.AnonymousClass8BR.A0p(r1, r0)
            throw r0
        L_0x0240:
            java.lang.String r4 = r0.A00
            java.lang.String r2 = "catalog_message"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02b7
            r3 = 1
        L_0x024b:
            X.AEE r8 = r0.A02(r1, r4)
            boolean r2 = r0.A00
            java.lang.String r10 = r0.A03(r1, r2)
            java.lang.String r11 = A00(r1)
            X.8a7 r2 = r1.A0S()
            X.EE9 r2 = r2.buttons_
            java.util.Iterator r6 = X.AnonymousClass8BS.A0r(r2)
        L_0x0263:
            boolean r2 = r6.hasNext()
            r7 = 0
            if (r2 == 0) goto L_0x02b5
            java.lang.Object r5 = r6.next()
            r2 = r5
            X.8Z3 r2 = (X.AnonymousClass8Z3) r2
            java.lang.String r4 = "review_and_pay_v2"
            java.lang.String r2 = r2.name_
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0263
        L_0x027b:
            X.8Z3 r5 = (X.AnonymousClass8Z3) r5
            if (r5 == 0) goto L_0x0292
            java.lang.String r6 = r5.buttonParamsJson_
            X.1KI r5 = r0.A03
            X.11P r4 = r0.A02
            r2 = 0
            X.AEn r7 = X.A8o.A04(r4, r5, r6, r7, r2)
            if (r7 == 0) goto L_0x02e6
            int r2 = X.C20089A6r.A00(r7)
            if (r2 == 0) goto L_0x02e6
        L_0x0292:
            X.8a7 r2 = r1.A0S()
            java.util.ArrayList r15 = X.C20093A6v.A00(r2)
            X.8a7 r2 = r1.A0S()
            java.lang.String r14 = r2.messageParamsJson_
            r2 = 2
            if (r2 != r3) goto L_0x02d3
            X.00H r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.9kI r2 = (X.C190049kI) r2
            X.8a7 r0 = r1.A0S()
            java.lang.String r0 = r0.messageParamsJson_
            X.C18070vi.A0X(r0)
            goto L_0x02c2
        L_0x02b5:
            r5 = r7
            goto L_0x027b
        L_0x02b7:
            java.lang.String r2 = "form_message"
            boolean r2 = r2.equals(r4)
            int r3 = X.AnonymousClass8BU.A00(r2)
            goto L_0x024b
        L_0x02c2:
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x02cc }
            r0 = 0
            X.DcQ r16 = r2.A00(r1, r0)     // Catch:{ JSONException -> 0x02cc }
            goto L_0x02d5
        L_0x02cc:
            r1 = move-exception
            X.1hd r0 = new X.1hd
            r0.<init>((java.lang.Exception) r1)
            throw r0
        L_0x02d3:
            r16 = 0
        L_0x02d5:
            r13 = 0
            X.AEk r9 = new X.AEk
            r12 = r9
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.String r12 = ""
            X.AEt r6 = new X.AEt
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x02e6:
            r1 = 26
            java.lang.String r0 = "Order status: unknown status"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x02ef:
            boolean r2 = r0 instanceof X.C1773198c
            if (r2 == 0) goto L_0x0482
            X.98c r0 = (X.C1773198c) r0
            r11 = 0
            java.lang.String r2 = r0.A00
            X.AEE r6 = r0.A02(r1, r2)
            java.lang.String r20 = r0.A03(r1, r11)
            if (r20 != 0) goto L_0x0304
            java.lang.String r20 = ""
        L_0x0304:
            java.lang.String r21 = A00(r1)
            X.8a7 r1 = r1.A0S()
            X.EE9 r2 = r1.buttons_
            r17 = 0
            if (r2 == 0) goto L_0x0467
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0467
            if (r6 == 0) goto L_0x0325
            byte[] r8 = r6.A03
        L_0x031c:
            java.lang.Object r12 = r2.get(r11)
            X.8Z3 r12 = (X.AnonymousClass8Z3) r12
            java.lang.String r10 = ""
            goto L_0x0328
        L_0x0325:
            r8 = r17
            goto L_0x031c
        L_0x0328:
            java.lang.String r1 = r12.buttonParamsJson_     // Catch:{ JSONException -> 0x043b, 11T -> 0x045d }
            org.json.JSONObject r4 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x043b, 11T -> 0x045d }
            java.lang.String r1 = "thumbnail_product_id"
            java.lang.String r7 = r4.optString(r1)     // Catch:{ JSONException -> 0x043b, 11T -> 0x045d }
            java.lang.String r1 = "business_owner_jid"
            java.lang.String r16 = X.C108955ca.A11(r1, r4)     // Catch:{ JSONException -> 0x043b, 11T -> 0x045d }
            int r1 = r16.length()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r1 != 0) goto L_0x034a
            X.190 r5 = r0.A00     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.lang.String r3 = "businessOwnerJID is empty when businessOwnerJID is a required field"
            r2 = 1
            java.lang.String r1 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            r5.A0G(r1, r3, r2)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
        L_0x034a:
            X.C18070vi.A0b(r7)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            X.AE3 r9 = new X.AE3     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            r9.<init>(r8, r7, r11)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            byte[] r1 = r9.A02     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            r5 = 1
            if (r1 == 0) goto L_0x035a
            int r1 = r1.length     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r1 != 0) goto L_0x0363
        L_0x035a:
            X.190 r3 = r0.A00     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.lang.String r2 = "NativeFlowMPMIsMissingThumbnailJpegData"
            java.lang.String r1 = "Error: thumbnail jpeg data is null or an empty byte array, so valid thumbnail jpeg is missing from payload"
            r3.A0G(r2, r1, r5)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
        L_0x0363:
            java.lang.String r1 = r9.A01     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            int r1 = r1.length()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r1 != 0) goto L_0x0374
            X.190 r3 = r0.A00     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.lang.String r2 = "NativeFlowMPMIsMissingThumbnailProductId"
            java.lang.String r1 = "Error: thumbnail product id is empty string, so valid thumbnail product id is missing from payload"
            r3.A0G(r2, r1, r5)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
        L_0x0374:
            java.lang.String r1 = "sections"
            org.json.JSONArray r8 = r4.optJSONArray(r1)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r8 != 0) goto L_0x03d9
            X.0wS r5 = X.C18460wS.A00     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
        L_0x037e:
            boolean r1 = r5.isEmpty()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r1 == 0) goto L_0x0399
            X.190 r4 = r0.A00     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.lang.String r3 = "Error: parsedProductListInfo is an empty list"
            r2 = 1
            java.lang.String r1 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            r4.A0G(r1, r3, r2)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
        L_0x038e:
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass8BR.A0X(r16)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            X.AER r1 = new X.AER     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            r1.<init>(r2, r9, r5)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            goto L_0x0434
        L_0x0399:
            java.util.Iterator r4 = r5.iterator()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            r2 = 0
        L_0x039e:
            boolean r1 = r4.hasNext()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r1 == 0) goto L_0x03c0
            int r3 = r2 + 1
            java.lang.Object r1 = r4.next()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            X.ADm r1 = (X.C20254ADm) r1     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.util.List r1 = r1.A01     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r1 == 0) goto L_0x03be
            java.lang.StringBuilder r2 = X.AnonymousClass8BW.A0n(r2, r10)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.lang.String r1 = ", "
            java.lang.String r10 = X.AnonymousClass000.A0y(r1, r2)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
        L_0x03be:
            r2 = r3
            goto L_0x039e
        L_0x03c0:
            int r1 = r10.length()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r1 == 0) goto L_0x038e
            X.190 r4 = r0.A00     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.lang.String r1 = "Error: parsedProductListInfo has empty product sections at indices: "
            java.lang.String r3 = X.AnonymousClass001.A1H(r1, r10, r2)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.lang.String r2 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            r1 = 1
            r4.A0G(r2, r3, r1)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            goto L_0x038e
        L_0x03d9:
            X.DcQ r15 = X.AnonymousClass1ZT.A01()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            int r14 = r8.length()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
        L_0x03e1:
            if (r11 >= r14) goto L_0x042e
            org.json.JSONObject r2 = r8.optJSONObject(r11)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r2 == 0) goto L_0x042b
            java.lang.String r1 = "title"
            java.lang.String r13 = r2.optString(r1)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            java.lang.String r1 = "product_items"
            org.json.JSONArray r7 = r2.optJSONArray(r1)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r7 == 0) goto L_0x042b
            X.DcQ r5 = X.AnonymousClass1ZT.A01()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            int r4 = r7.length()     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            r3 = 0
        L_0x0400:
            if (r3 >= r4) goto L_0x041f
            org.json.JSONObject r2 = r7.optJSONObject(r3)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r2 == 0) goto L_0x041c
            java.lang.String r1 = "product_retailer_id"
            java.lang.String r2 = r2.optString(r1)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            int r1 = X.C108955ca.A05(r2)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            if (r1 <= 0) goto L_0x041c
            X.ADb r1 = new X.ADb     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            r5.add(r1)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
        L_0x041c:
            int r3 = r3 + 1
            goto L_0x0400
        L_0x041f:
            X.DcQ r2 = X.AnonymousClass1ZT.A02(r5)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            X.ADm r1 = new X.ADm     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            r1.<init>(r13, r2)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            r15.add(r1)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
        L_0x042b:
            int r11 = r11 + 1
            goto L_0x03e1
        L_0x042e:
            X.DcQ r5 = X.AnonymousClass1ZT.A02(r15)     // Catch:{ JSONException -> 0x043b, 11T -> 0x0437 }
            goto L_0x037e
        L_0x0434:
            r17 = r1
            goto L_0x0467
        L_0x0437:
            r2 = move-exception
            r10 = r16
            goto L_0x045e
        L_0x043b:
            r4 = move-exception
            X.190 r3 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Malformed params_json payload detected. error: "
            java.lang.String r2 = X.AnonymousClass001.A1E(r4, r0, r1)
            r1 = 1
            java.lang.String r0 = "JsonPayloadForNativeFlowMPMIsMalformed"
            r3.A0G(r0, r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MPMNativeFlowContentFactory/parseE2EProductListInfo/invalid or missing fields in button_params_json="
            r1.append(r0)
            java.lang.String r0 = r12.buttonParamsJson_
            X.C108985cd.A1M(r0, r1, r4)
            goto L_0x0467
        L_0x045d:
            r2 = move-exception
        L_0x045e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MPMNativeFlowContentFactory/parseE2EProductListInfo/invalid JID="
            X.C17900vP.A0h(r0, r10, r1, r2)
        L_0x0467:
            r11 = 0
            java.lang.String r22 = ""
            r26 = 6
            X.0wS r25 = X.C18460wS.A00
            X.AEt r10 = new X.AEt
            r13 = r11
            r14 = r11
            r16 = r11
            r18 = r11
            r19 = r11
            r23 = r11
            r24 = r11
            r12 = r11
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r10
        L_0x0482:
            boolean r2 = r0 instanceof X.AnonymousClass98Z
            if (r2 == 0) goto L_0x04db
            r3 = 0
            java.lang.String r2 = r0.A00
            X.AEE r6 = r0.A02(r1, r2)
            java.lang.String r8 = r0.A03(r1, r3)
            java.lang.String r9 = A00(r1)
            java.lang.String r5 = X.AnonymousClass8BX.A0b(r1, r3)
            r4 = 0
            if (r6 == 0) goto L_0x049e
            byte[] r4 = r6.A03
        L_0x049e:
            X.1KI r3 = r0.A03
            X.11P r2 = r0.A02
            r0 = 1
            X.AEn r5 = X.A8o.A04(r2, r3, r5, r4, r0)
            if (r5 == 0) goto L_0x04d2
            X.AEU r2 = r5.A0D
            java.lang.String r0 = r2.A01
            int r0 = X.C20089A6r.A01(r0)
            if (r0 == 0) goto L_0x04d2
            java.lang.String r2 = r2.A08
            java.lang.String r0 = "UNKNOWN"
            if (r2 == 0) goto L_0x04bf
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x04d2
        L_0x04bf:
            X.8a7 r0 = r1.A0S()
            java.util.ArrayList r0 = X.C20093A6v.A00(r0)
            X.AEk r7 = new X.AEk
            r7.<init>(r0)
            X.AEt r4 = new X.AEt
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x04d2:
            r1 = 26
            java.lang.String r0 = "Order status or type: unknown"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x04db:
            X.98d r0 = (X.C1773298d) r0
            r7 = 0
            r2 = 0
            X.AEE r6 = r0.A02(r1, r2)
            java.lang.String r5 = r0.A03(r1, r7)
            java.lang.String r4 = A00(r1)
            X.8Z2 r1 = r1.A0R()
            X.EE9 r9 = r1.cards_
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            X.C18070vi.A0b(r9)
            boolean r1 = r9 instanceof java.util.Collection
            if (r1 == 0) goto L_0x053c
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x053c
        L_0x0502:
            java.util.Iterator r9 = r9.iterator()
        L_0x0506:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0558
            java.lang.Object r3 = r9.next()
            X.8cp r3 = (X.C166398cp) r3
            X.C18070vi.A0b(r3)
            X.C18070vi.A0d(r3, r7)
            int r2 = r3.interactiveMessageCase_
            r1 = 6
            if (r2 != r1) goto L_0x0539
            int r1 = r3.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0539
            X.8bW r1 = r3.header_
            if (r1 != 0) goto L_0x0529
            X.8bW r1 = X.C165638bW.DEFAULT_INSTANCE
        L_0x0529:
            int r2 = r1.mediaCase_
            r1 = 9
            if (r2 != r1) goto L_0x0539
            X.98e r1 = r0.A01
        L_0x0531:
            X.AEt r1 = r1.A01(r3)
            r8.add(r1)
            goto L_0x0506
        L_0x0539:
            X.98f r1 = r0.A00
            goto L_0x0531
        L_0x053c:
            java.util.Iterator r3 = r9.iterator()
        L_0x0540:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0502
            java.lang.Object r1 = r3.next()
            X.8cp r1 = (X.C166398cp) r1
            int r2 = r1.interactiveMessageCase_
            r1 = 6
            if (r2 == r1) goto L_0x0540
            java.lang.String r0 = "Some of the cards of the carousel msg are not native flow message"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r7)
            throw r0
        L_0x0558:
            X.ADa r0 = new X.ADa
            r0.<init>(r8)
            X.AEt r1 = new X.AEt
            r1.<init>(r0, r6, r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19985A1v.A01(X.8cp):X.AEt");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.AEi} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AEE A02(X.C166398cp r18, java.lang.String r19) {
        /*
            r17 = this;
            r2 = r18
            int r0 = r2.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0136
            X.8bW r4 = r2.header_
            if (r4 != 0) goto L_0x000e
            X.8bW r4 = X.C165638bW.DEFAULT_INSTANCE
        L_0x000e:
            int r5 = r4.mediaCase_
            if (r5 == 0) goto L_0x003f
            r0 = 3
            if (r5 == r0) goto L_0x003c
            r0 = 4
            if (r5 == r0) goto L_0x0039
            switch(r5) {
                case 6: goto L_0x002d;
                case 7: goto L_0x0030;
                case 8: goto L_0x0033;
                case 9: goto L_0x0036;
                default: goto L_0x001b;
            }
        L_0x001b:
            r1 = 0
        L_0x001c:
            boolean r0 = r4.hasMediaAttachment_
            if (r0 == 0) goto L_0x0042
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            if (r1 != r0) goto L_0x0042
            r1 = 26
            java.lang.String r0 = "media not set"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x002d:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x001c
        L_0x0030:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x001c
        L_0x0033:
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            goto L_0x001c
        L_0x0036:
            java.lang.Integer r1 = X.AnonymousClass00R.A0j
            goto L_0x001c
        L_0x0039:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x001c
        L_0x003c:
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x001c
        L_0x003f:
            java.lang.Integer r1 = X.AnonymousClass00R.A0u
            goto L_0x001c
        L_0x0042:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x005f
            java.lang.String r3 = r4.title_
            java.lang.String r2 = r4.subtitle_
            r0 = 6
            if (r5 != r0) goto L_0x005c
            java.lang.Object r0 = r4.media_
            X.DSQ r0 = (X.DSQ) r0
        L_0x0051:
            byte[] r1 = r0.A06()
            r0 = 0
            X.AEE r4 = new X.AEE
            r4.<init>(r0, r3, r2, r1)
            return r4
        L_0x005c:
            X.DSQ r0 = X.DSQ.A00
            goto L_0x0051
        L_0x005f:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0086
            boolean r0 = X.C20093A6v.A01(r2)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "catalog_message"
            r2 = r19
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0086
        L_0x0073:
            java.lang.String r3 = r4.title_
            java.lang.String r2 = r4.subtitle_
            int r1 = r4.mediaCase_
            r0 = 4
            if (r1 != r0) goto L_0x0083
            java.lang.Object r0 = r4.media_
            X.8cc r0 = (X.C166268cc) r0
        L_0x0080:
            X.DSQ r0 = r0.jpegThumbnail_
            goto L_0x0051
        L_0x0083:
            X.8cc r0 = X.C166268cc.DEFAULT_INSTANCE
            goto L_0x0080
        L_0x0086:
            r0 = r17
            boolean r0 = r0 instanceof X.AnonymousClass98Z
            if (r0 == 0) goto L_0x012b
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x012b
            int r1 = r4.mediaCase_
            r0 = 3
            if (r1 != r0) goto L_0x012b
            java.lang.String r3 = r4.title_
            java.lang.String r2 = r4.subtitle_
            java.lang.Object r6 = r4.media_
            X.8cW r6 = (X.C166208cW) r6
            int r1 = r6.bitField0_
            r0 = r1 & 512(0x200, float:7.175E-43)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r7 = 0
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "InteractiveMessageContentFactory/parseHeaderDocumentMessage document message without direct path received"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00ad:
            r0 = 0
            X.AEE r4 = new X.AEE
            r4.<init>(r7, r3, r2, r0)
            return r4
        L_0x00b4:
            r0 = r1 & 8
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r5 = 2
            r1 = 32
            if (r0 == 0) goto L_0x00d7
            X.DSQ r0 = r6.fileSha256_
            byte[] r0 = X.AnonymousClass8BS.A1P(r0)
            int r4 = r0.length
            if (r4 == r1) goto L_0x00d2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "InteractiveMessageContentFactory/parseHeaderDocumentMessage invalid file sha-256 hash received: "
            X.C17900vP.A0i(r0, r1, r4)
            goto L_0x00ad
        L_0x00d2:
            java.lang.String r11 = android.util.Base64.encodeToString(r0, r5)
            goto L_0x00d8
        L_0x00d7:
            r11 = r7
        L_0x00d8:
            int r0 = r6.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00f6
            X.DSQ r0 = r6.fileEncSha256_
            byte[] r0 = r0.A06()
            int r4 = r0.length
            if (r4 == r1) goto L_0x00f1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "InteractiveMessageContentFactory/parseHeaderDocumentMessage invalid enc file sha-256 hash received: "
            X.C17900vP.A0i(r0, r1, r4)
            goto L_0x00ad
        L_0x00f1:
            java.lang.String r12 = android.util.Base64.encodeToString(r0, r5)
            goto L_0x00f7
        L_0x00f6:
            r12 = r7
        L_0x00f7:
            int r0 = r6.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0128
            X.DSQ r0 = r6.mediaKey_
            byte[] r16 = r0.A06()
        L_0x0103:
            int r0 = r6.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0112
            long r0 = r6.mediaKeyTimestamp_
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x0112:
            java.lang.String r9 = r6.url_
            java.lang.String r10 = r6.directPath_
            java.lang.String r14 = r6.fileName_
            long r0 = r6.fileLength_
            java.lang.String r13 = r6.mimetype_
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r15 = 0
            X.AEi r6 = new X.AEi
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = r6
            goto L_0x00ad
        L_0x0128:
            r16 = r7
            goto L_0x0103
        L_0x012b:
            java.lang.String r2 = r4.title_
            java.lang.String r1 = r4.subtitle_
            r0 = 0
            X.AEE r4 = new X.AEE
            r4.<init>(r0, r2, r1, r0)
            return r4
        L_0x0136:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19985A1v.A02(X.8cp, java.lang.String):X.AEE");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if ("form_message".equals(r1) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r2 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A03(X.C166398cp r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r6.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x008f
            X.8Xf r0 = r6.body_
            if (r0 != 0) goto L_0x000c
            X.8Xf r0 = X.C164018Xf.DEFAULT_INSTANCE
        L_0x000c:
            java.lang.String r2 = r0.text_
            if (r2 != 0) goto L_0x002b
        L_0x0010:
            java.lang.Integer r1 = r6.A0T()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x002b
            boolean r0 = X.C20093A6v.A01(r6)
            if (r0 != 0) goto L_0x002b
            int r0 = r6.interactiveMessageCase_
            r3 = 6
            if (r0 != r3) goto L_0x002c
            java.lang.String r0 = "payment_info"
            boolean r0 = X.C20093A6v.A02(r6, r0)
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            return r2
        L_0x002c:
            int r0 = r6.interactiveMessageCase_
            if (r0 != r3) goto L_0x0054
            X.8a7 r4 = r6.A0S()
            if (r4 == 0) goto L_0x0079
            X.EE9 r0 = r4.buttons_
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x0079
            r1 = 0
            X.EE9 r0 = r4.buttons_
            java.lang.Object r0 = r0.get(r1)
            X.8Z3 r0 = (X.AnonymousClass8Z3) r0
            if (r0 == 0) goto L_0x0079
            java.lang.String r1 = r0.name_
        L_0x004c:
            java.lang.String r0 = "form_message"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002b
        L_0x0054:
            java.lang.String r0 = "review_order"
            boolean r0 = X.C20093A6v.A02(r6, r0)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "payment_method"
            boolean r0 = X.C20093A6v.A02(r6, r0)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "payment_status"
            boolean r0 = X.C20093A6v.A02(r6, r0)
            if (r0 != 0) goto L_0x002b
            int r0 = r6.interactiveMessageCase_
            if (r0 != r3) goto L_0x007b
            java.lang.String r0 = "call_permission_request"
            boolean r0 = X.C20093A6v.A02(r6, r0)
            if (r0 == 0) goto L_0x007b
            return r2
        L_0x0079:
            r1 = 0
            goto L_0x004c
        L_0x007b:
            int r1 = r6.interactiveMessageCase_
            r0 = 7
            if (r1 == r0) goto L_0x002b
            if (r7 != 0) goto L_0x002b
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x002b
            r1 = 26
            java.lang.String r0 = "missing body"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x008f:
            r2 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19985A1v.A03(X.8cp, boolean):java.lang.String");
    }

    public C19985A1v(AnonymousClass11P r1, AnonymousClass1KI r2) {
        this.A02 = r1;
        this.A03 = r2;
    }
}
