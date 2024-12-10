package X;

import com.whatsapp.jid.Jid;

public final class A0M {
    public final C18030ve A00;
    public final C37711q0 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass18K A07;
    public final C189399jB A08;
    public final AnonymousClass10I A09;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r1 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C194419rh r16, X.A0M r17, com.whatsapp.jid.Jid r18, X.AnonymousClass206 r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, org.json.JSONObject r24, int r25) {
        /*
            r5 = 0
            r7 = 0
            r3 = r17
            r1 = r19
            if (r19 == 0) goto L_0x0038
            X.00H r0 = r3.A06
            java.lang.Object r2 = r0.get()
            X.2qT r2 = (X.C61902qT) r2
            long r0 = r1.A0x
            android.database.Cursor r4 = X.C61902qT.A00(r2, r0)
            java.lang.String r0 = "message_template_id"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = "message_hsm_tag"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x003a
            r4.getString(r2)     // Catch:{ all -> 0x0031 }
            java.lang.String r5 = r4.getString(r1)     // Catch:{ all -> 0x0031 }
            r1 = 1
            goto L_0x003b
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0038:
            r1 = 0
            goto L_0x0041
        L_0x003a:
            r1 = 0
        L_0x003b:
            r4.close()
            r0 = 1
            if (r1 != 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            java.lang.String r6 = "is_template"
            r4 = r24
            r4.put(r6, r0)
            if (r1 == 0) goto L_0x004c
            r7 = r5
        L_0x004c:
            java.lang.String r5 = "hsm_tag"
            r4.put(r5, r7)
            r0 = 1
            r7 = r25
            if (r7 == r0) goto L_0x0115
            r0 = 2
            if (r7 == r0) goto L_0x0115
            r0 = 3
            if (r7 == r0) goto L_0x0115
        L_0x005c:
            r11 = 0
            r12 = r16
            if (r16 == 0) goto L_0x007a
            java.lang.Integer r8 = r12.A01
            if (r8 == 0) goto L_0x007a
            X.0ve r2 = r3.A00
            r1 = 6551(0x1997, float:9.18E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = "click_sequence_number"
            int r0 = r8.intValue()
            r4.put(r1, r0)
        L_0x007a:
            X.8rv r9 = new X.8rv
            r9.<init>()
            java.lang.Integer r0 = X.C17880vN.A0k()
            r9.A03 = r0
            java.lang.Integer r0 = X.C17880vN.A0h()
            r9.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r9.A04 = r0
            java.lang.String r0 = r4.toString()
            r9.A0A = r0
            if (r20 == 0) goto L_0x00a3
            int r0 = r20.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A00 = r0
        L_0x00a3:
            r13 = r18
            if (r18 == 0) goto L_0x00af
            X.9jB r0 = r3.A08
            java.lang.String r0 = r0.A00(r13)
            r9.A07 = r0
        L_0x00af:
            X.0ve r10 = r3.A00
            r0 = 6381(0x18ed, float:8.942E-42)
            X.0vf r8 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r8, r10, r0)
            r2 = r22
            r1 = r23
            if (r0 == 0) goto L_0x00c7
            r9.A09 = r2
            r9.A08 = r1
            r0 = r21
            r9.A01 = r0
        L_0x00c7:
            r0 = 6551(0x1997, float:9.18E-42)
            boolean r0 = X.C18020vd.A05(r8, r10, r0)
            if (r0 == 0) goto L_0x00df
            if (r16 == 0) goto L_0x0113
            java.lang.String r0 = r12.A02
        L_0x00d3:
            r9.A06 = r0
            if (r16 == 0) goto L_0x00dd
            int r0 = r12.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x00dd:
            r9.A02 = r11
        L_0x00df:
            r0 = 8492(0x212c, float:1.19E-41)
            boolean r0 = X.C18020vd.A05(r8, r10, r0)
            if (r0 == 0) goto L_0x00f5
            if (r18 == 0) goto L_0x00f5
            X.1q0 r8 = r3.A01
            java.lang.String r0 = r13.getRawString()
            java.lang.String r0 = r8.A05(r0)
            r9.A0B = r0
        L_0x00f5:
            X.18K r0 = r3.A07
            r0.CC4(r9)
            if (r25 == 0) goto L_0x0145
            r0 = 2
            if (r7 == r0) goto L_0x0135
            r0 = 3
            if (r7 == r0) goto L_0x0126
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot initialize screen progress reporter. Interaction type unknown ("
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass001.A1L(r1, r7)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0113:
            r0 = r11
            goto L_0x00d3
        L_0x0115:
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.A2M r0 = (X.A2M) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "last_screen_id"
            r4.put(r0, r1)
            goto L_0x005c
        L_0x0126:
            X.00H r0 = r3.A05
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.A2M r2 = (X.A2M) r2
            java.lang.String r1 = "flow_error"
            r0 = 0
            r2.A03(r1, r0, r0)
            return
        L_0x0135:
            X.00H r0 = r3.A05
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.A2M r3 = (X.A2M) r3
            java.lang.String r2 = "flow_success"
            r1 = 1
            r0 = 0
            r3.A03(r2, r1, r0)
            return
        L_0x0145:
            if (r20 == 0) goto L_0x01c2
            if (r18 == 0) goto L_0x01c2
            java.lang.String r0 = "flow_id"
            java.lang.String r14 = r4.optString(r0)     // Catch:{ JSONException -> 0x01bb }
            java.lang.String r0 = "session_id"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ JSONException -> 0x01bb }
            java.lang.String r7 = "extensions_message_id"
            java.lang.String r15 = X.C108955ca.A11(r7, r4)     // Catch:{ JSONException -> 0x01bb }
            int r7 = r4.optInt(r6)     // Catch:{ JSONException -> 0x01bb }
            java.lang.String r18 = X.C108955ca.A11(r5, r4)     // Catch:{ JSONException -> 0x01bb }
            java.lang.String r6 = "extension_restored_from_cache"
            r5 = 0
            int r5 = r4.optInt(r6, r5)     // Catch:{ JSONException -> 0x01bb }
            java.lang.String r6 = "categories"
            org.json.JSONArray r6 = r4.optJSONArray(r6)     // Catch:{ JSONException -> 0x01bb }
            if (r6 == 0) goto L_0x0185
            java.lang.String r17 = r6.toString()     // Catch:{ JSONException -> 0x01bb }
        L_0x0176:
            java.lang.String r6 = "extension_status"
            java.lang.String r19 = r4.optString(r6)     // Catch:{ JSONException -> 0x01bb }
            X.00H r3 = r3.A05     // Catch:{ JSONException -> 0x01bb }
            java.lang.Object r3 = r3.get()     // Catch:{ JSONException -> 0x01bb }
            X.A2M r3 = (X.A2M) r3     // Catch:{ JSONException -> 0x01bb }
            goto L_0x0188
        L_0x0185:
            r17 = 0
            goto L_0x0176
        L_0x0188:
            r4 = 1
            boolean r23 = X.AnonymousClass000.A1O(r7)
            boolean r24 = X.AnonymousClass000.A1T(r5, r4)
            int r22 = r20.intValue()     // Catch:{ JSONException -> 0x01bb }
            X.C18070vi.A0b(r14)     // Catch:{ JSONException -> 0x01bb }
            X.C18070vi.A0b(r0)     // Catch:{ JSONException -> 0x01bb }
            r4 = 2
            X.C18070vi.A0f(r14, r4, r0)     // Catch:{ JSONException -> 0x01bb }
            X.9tz r4 = r3.A01     // Catch:{ JSONException -> 0x01bb }
            if (r4 == 0) goto L_0x01a8
            java.lang.String r4 = "Initializing new flows session but previous metadata has not been reset. Most likely `reportFlowExit()` has not been called."
            com.whatsapp.util.Log.w((java.lang.String) r4)     // Catch:{ JSONException -> 0x01bb }
        L_0x01a8:
            r4 = 0
            r3.A05 = r4     // Catch:{ JSONException -> 0x01bb }
            r3.A03 = r4     // Catch:{ JSONException -> 0x01bb }
            X.9tz r11 = new X.9tz     // Catch:{ JSONException -> 0x01bb }
            r21 = r1
            r20 = r2
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x01bb }
            r3.A01 = r11     // Catch:{ JSONException -> 0x01bb }
            return
        L_0x01bb:
            r1 = move-exception
            java.lang.String r0 = "Failed to initialize screen progress reporter"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x01c2:
            java.lang.String r0 = "Cannot log flows screen progress without metadata."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0M.A00(X.9rh, X.A0M, com.whatsapp.jid.Jid, X.206, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, org.json.JSONObject, int):void");
    }

    public final void A01(Jid jid, AnonymousClass206 r13, Integer num, String str, String str2, String str3, String str4, int i) {
        String str5 = str4;
        C18070vi.A0d(str5, 7);
        this.A09.CGF(new C21406AjZ(this, jid, r13, num, str, str5, str2, str3, i));
    }

    public A0M(C18030ve r1, C37711q0 r2, AnonymousClass18K r3, C189399jB r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r5, r3, r4, r6, r7);
        C18070vi.A0x(r8, r9, r1, r10, r2);
        this.A09 = r5;
        this.A07 = r3;
        this.A08 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r8;
        this.A02 = r9;
        this.A00 = r1;
        this.A03 = r10;
        this.A01 = r2;
    }
}
