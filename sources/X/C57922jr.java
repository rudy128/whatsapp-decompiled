package X;

/* renamed from: X.2jr  reason: invalid class name and case insensitive filesystem */
public final class C57922jr {
    public final C218617r A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass11P A03;
    public final C25951Qg A04;
    public final AnonymousClass166 A05 = ((AnonymousClass166) C221618v.A01(32890));

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x035d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0361, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A00(java.lang.Long r29, java.lang.String r30) {
        /*
            r28 = this;
            r9 = r30
            java.lang.String r27 = "date_time"
            java.lang.String r26 = "phone_number"
            java.lang.String r25 = "flow_id"
            r8 = 0
            X.C18070vi.A0d(r9, r8)
            r7 = r28
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0378 }
            r2 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r0 = r21 - r2
            java.lang.String r4 = "dd-MM-yyyy HH:mm:ss"
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ Exception -> 0x0378 }
            java.text.SimpleDateFormat r24 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0378 }
            r2 = r24
            r2.<init>(r4, r3)     // Catch:{ Exception -> 0x0378 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0378 }
            java.util.LinkedHashMap r5 = X.C17880vN.A13()     // Catch:{ Exception -> 0x0378 }
            X.1Qg r2 = r7.A04     // Catch:{ Exception -> 0x0378 }
            r10 = 1
            boolean r4 = X.AnonymousClass000.A1X(r29)
            X.1Cd r2 = r2.A01     // Catch:{ Exception -> 0x0378 }
            X.1at r11 = r2.get()     // Catch:{ Exception -> 0x0378 }
            r2 = 2
            if (r4 == 0) goto L_0x0044
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x036e }
            r3[r8] = r30     // Catch:{ all -> 0x036e }
            X.C17880vN.A1V(r3, r10, r0)     // Catch:{ all -> 0x036e }
            goto L_0x004e
        L_0x0044:
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x036e }
            r3[r8] = r30     // Catch:{ all -> 0x036e }
            java.lang.String r0 = java.lang.String.valueOf(r29)     // Catch:{ all -> 0x036e }
            r3[r10] = r0     // Catch:{ all -> 0x036e }
        L_0x004e:
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x036e }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x036e }
            java.lang.String r0 = "SELECT message_ui_elements_reply.reply_description, jid.raw_string, available_message_view.timestamp FROM message_ui_elements_reply JOIN available_message_view ON message_ui_elements_reply.message_row_id = available_message_view._id JOIN chat_view ON available_message_view.chat_row_id = chat_view._id JOIN jid ON chat_view.jid_row_id = jid._id WHERE message_ui_elements_reply.flow_id = ? AND message_ui_elements_reply.element_type = 8 AND available_message_view.from_me = 0"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x036e }
            if (r4 == 0) goto L_0x006b
            r1.append(r0)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = " AND available_message_view.timestamp >= ?"
        L_0x0060:
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = "GET_FLOW_RESPONSES_BY_FLOW_ID_AND_TIMESTAMP"
            android.database.Cursor r4 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x036e }
            goto L_0x0071
        L_0x006b:
            r1.append(r0)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = " AND message_ui_elements_reply.message_row_id = ?"
            goto L_0x0060
        L_0x0071:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0362 }
        L_0x0075:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0362 }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "reply_description"
            int r3 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = "raw_string"
            int r2 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = "timestamp"
            int r1 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x0362 }
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A02(r0)     // Catch:{ all -> 0x0362 }
            java.lang.Long r1 = X.C17890vO.A0M(r4, r1)     // Catch:{ all -> 0x0362 }
            X.7PS r0 = new X.7PS     // Catch:{ all -> 0x0362 }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x0362 }
            r10.add(r0)     // Catch:{ all -> 0x0362 }
            goto L_0x0075
        L_0x00a7:
            r4.close()     // Catch:{ all -> 0x036e }
            r11.close()     // Catch:{ Exception -> 0x0378 }
            java.util.Iterator r23 = r10.iterator()     // Catch:{ Exception -> 0x0378 }
            r11 = 0
        L_0x00b2:
            boolean r0 = r23.hasNext()     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x0251
            java.lang.Object r3 = r23.next()     // Catch:{ Exception -> 0x0378 }
            X.7PS r3 = (X.AnonymousClass7PS) r3     // Catch:{ Exception -> 0x0378 }
            java.lang.Object r2 = r3.first     // Catch:{ Exception -> 0x0378 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0378 }
            java.lang.Object r0 = r3.second     // Catch:{ Exception -> 0x0378 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x00cc
            java.lang.String r1 = r0.user     // Catch:{ Exception -> 0x0378 }
            if (r1 != 0) goto L_0x00ce
        L_0x00cc:
            java.lang.String r1 = ""
        L_0x00ce:
            java.lang.Object r0 = r3.third     // Catch:{ Exception -> 0x0378 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0378 }
            if (r0 != 0) goto L_0x00d7
            r3 = 0
            goto L_0x00db
        L_0x00d7:
            long r3 = r0.longValue()     // Catch:{ Exception -> 0x0378 }
        L_0x00db:
            X.166 r0 = r7.A05     // Catch:{ Exception -> 0x0378 }
            X.AEb r2 = r0.A00(r2)     // Catch:{ Exception -> 0x0378 }
            java.util.LinkedHashMap r10 = X.C17880vN.A13()     // Catch:{ Exception -> 0x0378 }
            r0 = r25
            r10.put(r0, r9)     // Catch:{ Exception -> 0x0378 }
            r0 = r26
            r10.put(r0, r1)     // Catch:{ Exception -> 0x0378 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0378 }
            r0 = r24
            java.lang.String r1 = r0.format(r1)     // Catch:{ Exception -> 0x0378 }
            X.C18070vi.A0X(r1)     // Catch:{ Exception -> 0x0378 }
            r0 = r27
            r10.put(r0, r1)     // Catch:{ Exception -> 0x0378 }
            if (r2 == 0) goto L_0x0108
            X.9sj r1 = r2.A00()     // Catch:{ Exception -> 0x0378 }
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            if (r11 == 0) goto L_0x0111
            int r0 = r11.length()     // Catch:{ Exception -> 0x0378 }
            if (r0 != 0) goto L_0x0125
        L_0x0111:
            if (r1 == 0) goto L_0x0116
            java.lang.String r0 = r1.A01     // Catch:{ Exception -> 0x0378 }
            goto L_0x0117
        L_0x0116:
            r0 = 0
        L_0x0117:
            if (r0 == 0) goto L_0x0125
            int r0 = r0.length()     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x0125
            if (r1 == 0) goto L_0x0124
            java.lang.String r11 = r1.A01     // Catch:{ Exception -> 0x0378 }
            goto L_0x0125
        L_0x0124:
            r11 = 0
        L_0x0125:
            if (r1 == 0) goto L_0x024c
            java.lang.String r0 = r1.A02     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x024c
            org.json.JSONObject r12 = X.C17880vN.A16(r0)     // Catch:{ Exception -> 0x0378 }
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x0378 }
            java.lang.String r4 = "name"
            java.lang.String r3 = "components"
            java.lang.String r2 = "id"
            java.lang.String r1 = "::"
            if (r0 == 0) goto L_0x01c5
            java.lang.String r13 = "Flow ID"
            r0 = r25
            r5.put(r0, r13)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r13 = "Phone Number"
            r0 = r26
            r5.put(r0, r13)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r13 = "Date & Time"
            r0 = r27
            r5.put(r0, r13)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = "screens"
            org.json.JSONArray r0 = r12.optJSONArray(r0)     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x01c5
            X.Akx r20 = X.A6n.A04(r0)     // Catch:{ Exception -> 0x0378 }
        L_0x015e:
            boolean r0 = r20.hasNext()     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r13 = r20.next()     // Catch:{ Exception -> 0x0378 }
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ Exception -> 0x0378 }
            java.lang.String r14 = r13.optString(r2)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = "title"
            java.lang.String r19 = r13.optString(r0)     // Catch:{ Exception -> 0x0378 }
            org.json.JSONArray r0 = r13.optJSONArray(r3)     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x015e
            X.Akx r18 = X.A6n.A04(r0)     // Catch:{ Exception -> 0x0378 }
        L_0x017f:
            boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x015e
            java.lang.Object r15 = r18.next()     // Catch:{ Exception -> 0x0378 }
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch:{ Exception -> 0x0378 }
            java.lang.String r13 = r15.optString(r4)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = "label"
            java.lang.String r17 = r15.optString(r0)     // Catch:{ Exception -> 0x0378 }
            int r0 = r17.length()     // Catch:{ Exception -> 0x0378 }
            if (r0 != 0) goto L_0x019d
            r17 = r13
        L_0x019d:
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r14, r1, r13)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0378 }
            boolean r0 = r5.containsKey(r0)     // Catch:{ Exception -> 0x0378 }
            if (r0 != 0) goto L_0x017f
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r14, r1, r13)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r16 = r0.toString()     // Catch:{ Exception -> 0x0378 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A11(r19)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r13 = " - "
            r0 = r17
            java.lang.String r13 = X.AnonymousClass001.A1H(r13, r0, r15)     // Catch:{ Exception -> 0x0378 }
            r0 = r16
            r5.put(r0, r13)     // Catch:{ Exception -> 0x0378 }
            goto L_0x017f
        L_0x01c5:
            java.lang.String r0 = "response"
            org.json.JSONArray r0 = r12.optJSONArray(r0)     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x024c
            X.Akx r19 = X.A6n.A04(r0)     // Catch:{ Exception -> 0x0378 }
        L_0x01d1:
            boolean r0 = r19.hasNext()     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x024c
            java.lang.Object r0 = r19.next()     // Catch:{ Exception -> 0x0378 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x0378 }
            java.lang.String r18 = r0.optString(r2)     // Catch:{ Exception -> 0x0378 }
            org.json.JSONArray r0 = r0.optJSONArray(r3)     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x01d1
            X.Akx r17 = X.A6n.A04(r0)     // Catch:{ Exception -> 0x0378 }
        L_0x01eb:
            boolean r0 = r17.hasNext()     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r13 = r17.next()     // Catch:{ Exception -> 0x0378 }
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ Exception -> 0x0378 }
            java.lang.String r12 = r13.optString(r4)     // Catch:{ Exception -> 0x0378 }
            r0 = r18
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r0, r1, r12)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r16 = r0.toString()     // Catch:{ Exception -> 0x0378 }
            java.lang.String r12 = "value"
            org.json.JSONArray r15 = r13.optJSONArray(r12)     // Catch:{ Exception -> 0x0378 }
            if (r15 == 0) goto L_0x023a
            int r0 = r15.length()     // Catch:{ Exception -> 0x0378 }
            if (r0 <= 0) goto L_0x023a
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0378 }
            int r13 = r15.length()     // Catch:{ Exception -> 0x0378 }
            r12 = 0
        L_0x021d:
            if (r12 >= r13) goto L_0x023f
            java.lang.Object r0 = r15.get(r12)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0378 }
            r14.append(r0)     // Catch:{ Exception -> 0x0378 }
            int r0 = r15.length()     // Catch:{ Exception -> 0x0378 }
            int r0 = r0 + -1
            if (r12 == r0) goto L_0x0237
            java.lang.String r0 = ","
            r14.append(r0)     // Catch:{ Exception -> 0x0378 }
        L_0x0237:
            int r12 = r12 + 1
            goto L_0x021d
        L_0x023a:
            java.lang.String r12 = r13.optString(r12)     // Catch:{ Exception -> 0x0378 }
            goto L_0x0243
        L_0x023f:
            java.lang.String r12 = r14.toString()     // Catch:{ Exception -> 0x0378 }
        L_0x0243:
            X.C18070vi.A0X(r12)     // Catch:{ Exception -> 0x0378 }
            r0 = r16
            r10.put(r0, r12)     // Catch:{ Exception -> 0x0378 }
            goto L_0x01eb
        L_0x024c:
            r6.add(r10)     // Catch:{ Exception -> 0x0378 }
            goto L_0x00b2
        L_0x0251:
            java.lang.String r10 = "\""
            java.lang.String r1 = "yyyy-MM-dd HH_mm_ss"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0378 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0378 }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x0378 }
            if (r11 == 0) goto L_0x0266
            int r0 = r11.length()     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x0266
            r9 = r11
        L_0x0266:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = " - "
            r1.append(r0)     // Catch:{ Exception -> 0x0378 }
            java.lang.Long r0 = java.lang.Long.valueOf(r21)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = r2.format(r0)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = "[\\[\\]{}|\\<>?\\/\"':;()+*#@$%&\\~`^=!\\\\]"
            X.1wr r1 = new X.1wr     // Catch:{ Exception -> 0x0378 }
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = ""
            java.lang.String r9 = r1.A00(r2, r0)     // Catch:{ Exception -> 0x0378 }
            X.17r r0 = r7.A00     // Catch:{ Exception -> 0x0378 }
            java.io.File r2 = r0.A0V(r9)     // Catch:{ Exception -> 0x0378 }
            java.nio.charset.Charset r1 = X.C26571Sq.A05     // Catch:{ Exception -> 0x0378 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0378 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0378 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0378 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0378 }
            boolean r0 = r2 instanceof java.io.BufferedWriter     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x02a1
            java.io.BufferedWriter r2 = (java.io.BufferedWriter) r2     // Catch:{ Exception -> 0x0378 }
            goto L_0x02a9
        L_0x02a1:
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0378 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0378 }
            r2 = r0
        L_0x02a9:
            r6.add(r8, r5)     // Catch:{ all -> 0x035b }
            java.util.Iterator r13 = r6.iterator()     // Catch:{ all -> 0x035b }
        L_0x02b0:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x0316
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x035b }
            java.util.Map r11 = (java.util.Map) r11     // Catch:{ all -> 0x035b }
            java.util.Iterator r12 = X.C17890vO.A0k(r5)     // Catch:{ all -> 0x035b }
        L_0x02c0:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x0312
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x035b }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x035b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x035b }
            java.lang.String r1 = X.C17880vN.A0s(r0, r11)     // Catch:{ all -> 0x035b }
            if (r1 == 0) goto L_0x0301
            int r0 = r1.length()     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x0301
            r2.write(r10)     // Catch:{ all -> 0x035b }
            char[] r6 = r1.toCharArray()     // Catch:{ all -> 0x035b }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x035b }
            int r4 = r6.length     // Catch:{ all -> 0x035b }
            r3 = 0
        L_0x02e7:
            if (r3 >= r4) goto L_0x02fd
            char r1 = r6[r3]     // Catch:{ all -> 0x035b }
            r0 = 34
            if (r1 != r0) goto L_0x02f5
            java.lang.String r0 = "\"\""
        L_0x02f1:
            r2.write(r0)     // Catch:{ all -> 0x035b }
            goto L_0x02fa
        L_0x02f5:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x035b }
            goto L_0x02f1
        L_0x02fa:
            int r3 = r3 + 1
            goto L_0x02e7
        L_0x02fd:
            r2.write(r10)     // Catch:{ all -> 0x035b }
            goto L_0x0306
        L_0x0301:
            java.lang.String r0 = " "
            r2.write(r0)     // Catch:{ all -> 0x035b }
        L_0x0306:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x02c0
            java.lang.String r0 = ","
            r2.write(r0)     // Catch:{ all -> 0x035b }
            goto L_0x02c0
        L_0x0312:
            r2.newLine()     // Catch:{ all -> 0x035b }
            goto L_0x02b0
        L_0x0316:
            android.net.Uri$Builder r1 = X.C19680yj.A00()     // Catch:{ all -> 0x035b }
            java.lang.String r0 = "flows_responses"
            android.net.Uri$Builder r0 = r1.appendPath(r0)     // Catch:{ all -> 0x035b }
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r9)     // Catch:{ all -> 0x035b }
            android.net.Uri r5 = r0.build()     // Catch:{ all -> 0x035b }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x035b }
            r4 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x035b }
            java.lang.String r1 = "android.intent.action.SEND"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x035b }
            r0.<init>(r1)     // Catch:{ all -> 0x035b }
            android.content.Intent r1 = r0.setFlags(r4)     // Catch:{ all -> 0x035b }
            java.lang.String r0 = "text/csv"
            android.content.Intent r1 = r1.setType(r0)     // Catch:{ all -> 0x035b }
            java.lang.String r0 = "android.intent.extra.STREAM"
            android.content.Intent r0 = r1.putExtra(r0, r5)     // Catch:{ all -> 0x035b }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x035b }
            X.2li r1 = new X.2li     // Catch:{ all -> 0x035b }
            r1.<init>(r0, r9)     // Catch:{ all -> 0x035b }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x035b }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x035b }
            if (r2 == 0) goto L_0x035a
            r2.close()     // Catch:{ Exception -> 0x0378 }
        L_0x035a:
            return r0
        L_0x035b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x035d }
        L_0x035d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x0378 }
            throw r0     // Catch:{ Exception -> 0x0378 }
        L_0x0362:
            r1 = move-exception
            if (r4 == 0) goto L_0x036d
            r4.close()     // Catch:{ all -> 0x0369 }
            goto L_0x036d
        L_0x0369:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x036e }
        L_0x036d:
            throw r1     // Catch:{ all -> 0x036e }
        L_0x036e:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0373 }
            goto L_0x0377
        L_0x0373:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0378 }
        L_0x0377:
            throw r1     // Catch:{ Exception -> 0x0378 }
        L_0x0378:
            r3 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r3)
            X.190 r2 = r7.A02
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "FlowsDownloadResponseDataRepository/generateCsvForAllFlowResponses/error while generating csv for flow responses"
            r2.A0E(r0, r1, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            r1 = 0
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57922jr.A00(java.lang.Long, java.lang.String):android.util.Pair");
    }

    public C57922jr(AnonymousClass190 r2, C218617r r3, AnonymousClass11P r4, C25951Qg r5, AnonymousClass00H r6) {
        C18070vi.A0w(r5, r4, r3, r2, r6);
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = r6;
    }
}
