package X;

/* renamed from: X.1hM  reason: invalid class name and case insensitive filesystem */
public final class C32541hM {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass1DL A01;

    public C32541hM(AnonymousClass1DL r2, AnonymousClass1Cd r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0151, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0154, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0155, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0158, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59512mQ A00(long r15) {
        /*
            r14 = this;
            X.1Cd r0 = r14.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0152 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = "SELECT target_id, message_state, invoker_jid_row_id, model_type, message_disclaimer, keyword_json FROM bot_message_info WHERE message_row_id= ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0152 }
            r8 = 0
            r1[r8] = r0     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = "GET_BOT_MESSAGE_INFO_BY_ROW_ID"
            android.database.Cursor r3 = r4.A0A(r3, r0, r1)     // Catch:{ all -> 0x0152 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x014b }
            r7 = 0
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = "target_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = "message_state"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014b }
            int r6 = r3.getInt(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = "invoker_jid_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014b }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x014b }
            X.1DL r5 = r14.A01     // Catch:{ all -> 0x014b }
            com.whatsapp.jid.Jid r5 = r5.A0B(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = "model_type"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014b }
            int r9 = X.AnonymousClass1Eu.A00(r3, r0, r8)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = "message_disclaimer"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014b }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x0061
            r8 = r7
            goto L_0x0065
        L_0x0061:
            java.lang.String r8 = r3.getString(r1)     // Catch:{ all -> 0x014b }
        L_0x0065:
            java.lang.String r0 = "keyword_json"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014b }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0075
            java.lang.String r7 = r3.getString(r1)     // Catch:{ all -> 0x014b }
        L_0x0075:
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x014b }
            X.2Qn[] r0 = X.C49452Qn.values()     // Catch:{ all -> 0x014b }
            r1 = r0[r6]     // Catch:{ all -> 0x014b }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x014b }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r5)     // Catch:{ all -> 0x014b }
            X.36h r6 = new X.36h     // Catch:{ all -> 0x014b }
            r6.<init>(r0, r1, r4)     // Catch:{ all -> 0x014b }
            r5 = 0
            if (r9 == 0) goto L_0x00b8
            X.0z2 r0 = X.AnonymousClass9IU.A00     // Catch:{ NoSuchElementException -> 0x00b0 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ NoSuchElementException -> 0x00b0 }
        L_0x0092:
            boolean r0 = r4.hasNext()     // Catch:{ NoSuchElementException -> 0x00b0 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r1 = r4.next()     // Catch:{ NoSuchElementException -> 0x00b0 }
            X.9IU r1 = (X.AnonymousClass9IU) r1     // Catch:{ NoSuchElementException -> 0x00b0 }
            int r0 = r1.value     // Catch:{ NoSuchElementException -> 0x00b0 }
            if (r0 != r9) goto L_0x0092
            X.Aby r0 = new X.Aby     // Catch:{ NoSuchElementException -> 0x00b0 }
            r0.<init>(r1, r5)     // Catch:{ NoSuchElementException -> 0x00b0 }
            goto L_0x00b7
        L_0x00a8:
            java.lang.String r1 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ NoSuchElementException -> 0x00b0 }
            r0.<init>(r1)     // Catch:{ NoSuchElementException -> 0x00b0 }
            throw r0     // Catch:{ NoSuchElementException -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            java.lang.String r0 = "BotMessageInfoStoreImpl/createBotModelMetadata/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x014b }
            goto L_0x00b8
        L_0x00b7:
            r5 = r0
        L_0x00b8:
            r4 = 0
            if (r8 == 0) goto L_0x00c9
            X.36e r0 = new X.36e     // Catch:{ NoSuchElementException -> 0x00c1 }
            r0.<init>(r8)     // Catch:{ NoSuchElementException -> 0x00c1 }
            goto L_0x00c8
        L_0x00c1:
            r1 = move-exception
            java.lang.String r0 = "BotMessageInfoStoreImpl/createBotMessageDisclaimer/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x014b }
            goto L_0x00c9
        L_0x00c8:
            r4 = r0
        L_0x00c9:
            if (r7 != 0) goto L_0x00d3
            X.0wS r0 = X.C18460wS.A00     // Catch:{ all -> 0x014b }
            X.36f r1 = new X.36f     // Catch:{ all -> 0x014b }
            r1.<init>(r0)     // Catch:{ all -> 0x014b }
            goto L_0x0133
        L_0x00d3:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0126 }
            r12.<init>(r7)     // Catch:{ JSONException -> 0x0126 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0126 }
            r11.<init>()     // Catch:{ JSONException -> 0x0126 }
            java.util.Iterator r13 = r12.keys()     // Catch:{ JSONException -> 0x0126 }
            X.C18070vi.A0X(r13)     // Catch:{ JSONException -> 0x0126 }
        L_0x00e4:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x0126 }
            if (r0 == 0) goto L_0x0120
            java.lang.Object r10 = r13.next()     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ JSONException -> 0x0126 }
            org.json.JSONArray r9 = r12.getJSONArray(r10)     // Catch:{ JSONException -> 0x0126 }
            X.C18070vi.A0b(r9)     // Catch:{ JSONException -> 0x0126 }
            int r8 = r9.length()     // Catch:{ JSONException -> 0x0126 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0126 }
            r7.<init>(r8)     // Catch:{ JSONException -> 0x0126 }
            r1 = 0
        L_0x0101:
            if (r1 >= r8) goto L_0x010f
            java.lang.Object r0 = r9.get(r1)     // Catch:{ JSONException -> 0x0126 }
            if (r0 == 0) goto L_0x0118
            r7.add(r0)     // Catch:{ JSONException -> 0x0126 }
            int r1 = r1 + 1
            goto L_0x0101
        L_0x010f:
            X.1D6 r0 = new X.1D6     // Catch:{ JSONException -> 0x0126 }
            r0.<init>(r10, r7)     // Catch:{ JSONException -> 0x0126 }
            r11.add(r0)     // Catch:{ JSONException -> 0x0126 }
            goto L_0x00e4
        L_0x0118:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ JSONException -> 0x0126 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0126 }
            throw r0     // Catch:{ JSONException -> 0x0126 }
        L_0x0120:
            X.36f r1 = new X.36f     // Catch:{ JSONException -> 0x0126 }
            r1.<init>(r11)     // Catch:{ JSONException -> 0x0126 }
            goto L_0x0133
        L_0x0126:
            r1 = move-exception
            java.lang.String r0 = "BotMessageInfoStoreImpl/createMessageKeywordData/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x014b }
            X.0wS r0 = X.C18460wS.A00     // Catch:{ all -> 0x014b }
            X.36f r1 = new X.36f     // Catch:{ all -> 0x014b }
            r1.<init>(r0)     // Catch:{ all -> 0x014b }
        L_0x0133:
            X.2mQ r0 = new X.2mQ     // Catch:{ all -> 0x014b }
            r0.<init>(r4, r1, r5, r6)     // Catch:{ all -> 0x014b }
            r3.close()     // Catch:{ all -> 0x0152 }
            r2.close()
            return r0
        L_0x013f:
            r3.close()     // Catch:{ all -> 0x0152 }
            r2.close()
            X.2mQ r0 = new X.2mQ
            r0.<init>(r7, r7, r7, r7)
            return r0
        L_0x014b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0152 }
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32541hM.A00(long):X.2mQ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        X.CDX.A00(r6, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(long r8) {
        /*
            r7 = this;
            X.1Cd r0 = r7.A00
            X.1au r6 = r0.A05()
            java.lang.String r5 = "message_row_id = ?"
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0022 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = "bot_message_info"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0022 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = "DELETE_BOT_MESSAGE_INFO"
            r4.A04(r3, r5, r0, r2)     // Catch:{ all -> 0x0022 }
            r6.close()
            return
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32541hM.A01(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C691736e r9, X.C691836f r10, X.C20944Aby r11, X.C692036h r12, long r13) {
        /*
            r8 = this;
            X.1Cd r0 = r8.A00
            X.1au r4 = r0.A05()
            r0 = 3
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x009e }
            r5.<init>(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x009e }
            r5.put(r1, r0)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "target_id"
            java.lang.String r0 = r12.A02     // Catch:{ all -> 0x009e }
            r5.put(r1, r0)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "message_state"
            X.2Qn r0 = r12.A01     // Catch:{ all -> 0x009e }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x009e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009e }
            r5.put(r1, r0)     // Catch:{ all -> 0x009e }
            com.whatsapp.jid.UserJid r1 = r12.A00     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x003f
            X.1DL r0 = r8.A01     // Catch:{ all -> 0x009e }
            long r2 = r0.A09(r1)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "invoker_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x009e }
            r5.put(r1, r0)     // Catch:{ all -> 0x009e }
        L_0x003f:
            if (r11 == 0) goto L_0x004e
            java.lang.String r1 = "model_type"
            X.9IU r0 = r11.A00     // Catch:{ all -> 0x009e }
            int r0 = r0.value     // Catch:{ all -> 0x009e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009e }
            r5.put(r1, r0)     // Catch:{ all -> 0x009e }
        L_0x004e:
            if (r9 == 0) goto L_0x0057
            java.lang.String r1 = "message_disclaimer"
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x009e }
            r5.put(r1, r0)     // Catch:{ all -> 0x009e }
        L_0x0057:
            if (r10 == 0) goto L_0x008d
            java.lang.String r7 = "keyword_json"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x009e }
            r6.<init>()     // Catch:{ all -> 0x009e }
            java.util.List r0 = r10.A00     // Catch:{ all -> 0x009e }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x009e }
        L_0x0066:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x009e }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ all -> 0x009e }
            java.lang.Object r2 = r0.first     // Catch:{ all -> 0x009e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x009e }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x009e }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x009e }
            r0.<init>(r1)     // Catch:{ all -> 0x009e }
            r6.put(r2, r0)     // Catch:{ all -> 0x009e }
            goto L_0x0066
        L_0x0083:
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x009e }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x009e }
            r5.put(r7, r0)     // Catch:{ all -> 0x009e }
        L_0x008d:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x009e }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x009e }
            java.lang.String r2 = "bot_message_info"
            java.lang.String r1 = "INSERT_OR_UPDATE_BOT_MESSAGE_INFO"
            r0 = 5
            r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x009e }
            r4.close()
            return
        L_0x009e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32541hM.A02(X.36e, X.36f, X.Aby, X.36h, long):void");
    }
}
