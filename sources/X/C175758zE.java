package X;

import org.json.JSONObject;

/* renamed from: X.8zE  reason: invalid class name and case insensitive filesystem */
public class C175758zE extends C197889xR {
    public JSONObject A00;
    public JSONObject A01;
    public JSONObject A02;
    public JSONObject A03;
    public final AnonymousClass1OZ A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;

    public C175758zE(AnonymousClass11P r2, C18030ve r3, AnonymousClass1OZ r4, A7U a7u, C31061ex r6) {
        super(a7u.A04, r6);
        this.A05 = r2;
        this.A06 = r3;
        this.A04 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f6, code lost:
        if (r5.A03.equals(r0.A01.getString(r11)) == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        r3 = "Matches";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        r7.put(r10, X.AnonymousClass000.A0y(" in salt and request params", X.AnonymousClass000.A11(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0108, code lost:
        r3 = "Mismatches";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.String r25, java.util.List r26) {
        /*
            r24 = this;
            r0 = r24
            X.0ve r3 = r0.A06
            r2 = 635(0x27b, float:8.9E-43)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x0017
            r2 = r25
            int r1 = r2.hashCode()
            switch(r1) {
                case -120834421: goto L_0x0018;
                case 83413: goto L_0x0039;
                case 1282366491: goto L_0x0046;
                default: goto L_0x0017;
            }
        L_0x0017:
            return
        L_0x0018:
            java.lang.String r3 = "SKIPPED_DEVICE_BINDING"
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x0017
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r2 = "action"
            java.lang.String r1 = "upi-log-event"
            X.C17890vO.A11(r2, r1, r5)
            java.lang.String r1 = "event-id"
            X.C17890vO.A11(r1, r3, r5)
            long r3 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r2 = r0.A00
            if (r2 == 0) goto L_0x008e
            goto L_0x006e
        L_0x0039:
            java.lang.String r13 = "U66"
            boolean r1 = r2.equals(r13)
            if (r1 == 0) goto L_0x0017
            org.json.JSONObject r1 = r0.A01
            if (r1 == 0) goto L_0x0017
            goto L_0x0097
        L_0x0046:
            java.lang.String r3 = "SIM_SWAP"
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x0017
            java.lang.String r6 = "event-ts"
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r2 = "action"
            java.lang.String r1 = "upi-log-event"
            X.C17890vO.A11(r2, r1, r5)
            java.lang.String r1 = "event-id"
            X.C17890vO.A11(r1, r3, r5)
            long r3 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r2 = r0.A03
            if (r2 == 0) goto L_0x01f7
            org.json.JSONObject r1 = r0.A02
            if (r1 == 0) goto L_0x01f7
            goto L_0x01d4
        L_0x006e:
            java.lang.String r1 = "event-ts"
            r2.put(r1, r3)     // Catch:{ JSONException -> 0x0074 }
            goto L_0x0078
        L_0x0074:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0078:
            org.json.JSONObject r1 = r0.A00
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-info"
            X.C17890vO.A11(r1, r2, r5)
            org.json.JSONObject r1 = r0.A00
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-dl-info"
            X.C17890vO.A11(r1, r2, r5)
        L_0x008e:
            X.1ex r6 = r0.A01
            X.1ca r8 = X.AnonymousClass8BX.A0P(r5)
            r1 = 1
            goto L_0x01fe
        L_0x0097:
            X.1OZ r6 = r0.A04     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r4 = r6.A0B()     // Catch:{ JSONException -> 0x01ce }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x01ce }
            org.json.JSONObject r8 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r9 = "event-ts"
            r8.put(r9, r1)     // Catch:{ JSONException -> 0x01ce }
            if (r26 == 0) goto L_0x0110
            org.json.JSONObject r7 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x01ce }
            java.util.Iterator r12 = r26.iterator()     // Catch:{ JSONException -> 0x01ce }
        L_0x00b4:
            boolean r3 = r12.hasNext()     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x010b
            java.lang.Object r5 = r12.next()     // Catch:{ JSONException -> 0x01ce }
            X.1MD r5 = (X.AnonymousClass1MD) r5     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r10 = r5.A02     // Catch:{ JSONException -> 0x01ce }
            int r3 = r10.hashCode()     // Catch:{ JSONException -> 0x01ce }
            switch(r3) {
                case -1413853096: goto L_0x00ca;
                case -756180983: goto L_0x00d5;
                case 996422991: goto L_0x00e0;
                default: goto L_0x00c9;
            }     // Catch:{ JSONException -> 0x01ce }
        L_0x00c9:
            goto L_0x00b4
        L_0x00ca:
            java.lang.String r3 = "amount"
            boolean r3 = r10.equals(r3)     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x00b4
            java.lang.String r11 = "txnAmount"
            goto L_0x00ea
        L_0x00d5:
            java.lang.String r3 = "receiver-vpa"
            boolean r3 = r10.equals(r3)     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x00b4
            java.lang.String r11 = "payeeAddr"
            goto L_0x00ea
        L_0x00e0:
            java.lang.String r3 = "sender-vpa"
            boolean r3 = r10.equals(r3)     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x00b4
            java.lang.String r11 = "payerAddr"
        L_0x00ea:
            java.lang.String r5 = r5.A03     // Catch:{ JSONException -> 0x01ce }
            org.json.JSONObject r3 = r0.A01     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r3 = r3.getString(r11)     // Catch:{ JSONException -> 0x01ce }
            boolean r3 = r5.equals(r3)     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x0108
            java.lang.String r3 = "Matches"
        L_0x00fa:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r3)     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r3 = " in salt and request params"
            java.lang.String r3 = X.AnonymousClass000.A0y(r3, r5)     // Catch:{ JSONException -> 0x01ce }
            r7.put(r10, r3)     // Catch:{ JSONException -> 0x01ce }
            goto L_0x00b4
        L_0x0108:
            java.lang.String r3 = "Mismatches"
            goto L_0x00fa
        L_0x010b:
            java.lang.String r3 = "request-params"
            r8.put(r3, r7)     // Catch:{ JSONException -> 0x01ce }
        L_0x0110:
            org.json.JSONObject r7 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x01ce }
            r7.put(r9, r1)     // Catch:{ JSONException -> 0x01ce }
            org.json.JSONObject r1 = r0.A01     // Catch:{ JSONException -> 0x01ce }
            if (r1 == 0) goto L_0x013e
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x01ce }
            org.json.JSONObject r1 = r0.A01     // Catch:{ JSONException -> 0x01ce }
            java.util.Iterator r3 = r1.keys()     // Catch:{ JSONException -> 0x01ce }
        L_0x0125:
            boolean r1 = r3.hasNext()     // Catch:{ JSONException -> 0x01ce }
            if (r1 == 0) goto L_0x0139
            java.lang.String r2 = X.C17880vN.A0v(r3)     // Catch:{ JSONException -> 0x01ce }
            org.json.JSONObject r1 = r0.A01     // Catch:{ JSONException -> 0x01ce }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ JSONException -> 0x01ce }
            X.AnonymousClass8BS.A1C(r1, r2, r5)     // Catch:{ JSONException -> 0x01ce }
            goto L_0x0125
        L_0x0139:
            java.lang.String r1 = "salt-params"
            r7.put(r1, r5)     // Catch:{ JSONException -> 0x01ce }
        L_0x013e:
            if (r26 == 0) goto L_0x0161
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x01ce }
            java.util.Iterator r3 = r26.iterator()     // Catch:{ JSONException -> 0x01ce }
        L_0x0148:
            boolean r1 = r3.hasNext()     // Catch:{ JSONException -> 0x01ce }
            if (r1 == 0) goto L_0x015c
            java.lang.Object r1 = r3.next()     // Catch:{ JSONException -> 0x01ce }
            X.1MD r1 = (X.AnonymousClass1MD) r1     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r2 = r1.A02     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r1 = r1.A03     // Catch:{ JSONException -> 0x01ce }
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x01ce }
            goto L_0x0148
        L_0x015c:
            java.lang.String r1 = "request-params"
            r7.put(r1, r5)     // Catch:{ JSONException -> 0x01ce }
        L_0x0161:
            java.lang.String r5 = r8.toString()     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r3 = r7.toString()     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r8 = "id"
            X.C108985cd.A1D(r5, r3)     // Catch:{ JSONException -> 0x01ce }
            X.1cX r2 = X.AnonymousClass8BY.A0O()     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r7 = "xmlns"
            java.lang.String r1 = "w:pay"
            X.C29591cX.A01(r2, r7, r1)     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r7 = "type"
            java.lang.String r1 = "set"
            X.AnonymousClass8BY.A1A(r2, r7, r1, r4, r8)     // Catch:{ JSONException -> 0x01ce }
            X.1cX r1 = X.AnonymousClass8BS.A0R()     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r8 = "action"
            java.lang.String r7 = "upi-log-event"
            X.C29591cX.A01(r1, r8, r7)     // Catch:{ JSONException -> 0x01ce }
            r14 = 1
            r16 = 100
            r18 = 0
            boolean r7 = X.C29601cY.A04(r13, r14, r16, r18)     // Catch:{ JSONException -> 0x01ce }
            if (r7 == 0) goto L_0x019c
            java.lang.String r7 = "event-id"
            X.C29591cX.A01(r1, r7, r13)     // Catch:{ JSONException -> 0x01ce }
        L_0x019c:
            r10 = 10000(0x2710, double:4.9407E-320)
            r19 = 1
            r7 = r5
            r8 = r14
            r12 = r18
            boolean r7 = X.C29601cY.A04(r7, r8, r10, r12)     // Catch:{ JSONException -> 0x01ce }
            if (r7 == 0) goto L_0x01af
            java.lang.String r7 = "event-info"
            X.C29591cX.A01(r1, r7, r5)     // Catch:{ JSONException -> 0x01ce }
        L_0x01af:
            r21 = 10000(0x2710, double:4.9407E-320)
            r23 = r12
            r18 = r3
            boolean r5 = X.C29601cY.A04(r18, r19, r21, r23)     // Catch:{ JSONException -> 0x01ce }
            if (r5 == 0) goto L_0x01c0
            java.lang.String r5 = "event-dl-info"
            X.C29591cX.A01(r1, r5, r3)     // Catch:{ JSONException -> 0x01ce }
        L_0x01c0:
            X.1ca r3 = X.C29591cX.A00(r1, r2)     // Catch:{ JSONException -> 0x01ce }
            r2 = 5
            X.Ach r1 = new X.Ach     // Catch:{ JSONException -> 0x01ce }
            r1.<init>(r0, r2)     // Catch:{ JSONException -> 0x01ce }
            X.AnonymousClass8BW.A1B(r6, r1, r3, r4)     // Catch:{ JSONException -> 0x01ce }
            return
        L_0x01ce:
            java.lang.String r0 = "PAY: IndiaUpiLogEventAction: exception while creating collecting U66 event info"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x01d4:
            r2.put(r6, r3)     // Catch:{ JSONException -> 0x01dd }
            org.json.JSONObject r1 = r0.A02     // Catch:{ JSONException -> 0x01dd }
            r1.put(r6, r3)     // Catch:{ JSONException -> 0x01dd }
            goto L_0x01e1
        L_0x01dd:
            r1 = move-exception
            r1.printStackTrace()
        L_0x01e1:
            org.json.JSONObject r1 = r0.A03
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-info"
            X.C17890vO.A11(r1, r2, r5)
            org.json.JSONObject r1 = r0.A02
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-dl-info"
            X.C17890vO.A11(r1, r2, r5)
        L_0x01f7:
            X.1ex r6 = r0.A01
            r1 = 0
            X.1ca r8 = X.AnonymousClass8BX.A0P(r5)
        L_0x01fe:
            X.9Zi r5 = new X.9Zi
            r5.<init>(r0, r1)
            java.lang.String r9 = "set"
            r11 = 30000(0x7530, double:1.4822E-319)
            X.118 r0 = r6.A02
            android.content.Context r2 = r0.A00
            X.1KB r4 = r6.A00
            X.00H r0 = r6.A0I
            X.1jG r3 = X.AnonymousClass8BR.A0a(r0)
            r7 = 4
            X.8yh r1 = new X.8yh
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.String r10 = "w:pay"
            r7 = r1
            r6.A0J(r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175758zE.A00(java.lang.String, java.util.List):void");
    }
}
