package X;

import java.util.List;

/* renamed from: X.8o1  reason: invalid class name */
public class AnonymousClass8o1 extends C189069iS {
    public long A00 = 0;
    public Long A01 = AnonymousClass8BV.A0a();
    public String A02 = "undefined";
    public String A03 = "undefined";
    public List A04 = AnonymousClass000.A13();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        r1 = new X.AnonymousClass8o2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        if (r1.A04(r4) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (r1.equals("template_hsm") != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        r1 = new X.AnonymousClass8o4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        if (r1.A04(r4) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.A04.add(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r7 = "undefined"
            r6 = 0
            org.json.JSONObject r5 = X.C17880vN.A16(r9)     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "start_ts"
            r1 = -1
            long r3 = r5.optLong(r0, r1)     // Catch:{ JSONException -> 0x00c6 }
            r8.A00 = r3     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "conversation_id"
            java.lang.String r0 = r5.optString(r0, r7)     // Catch:{ JSONException -> 0x00c6 }
            r8.A02 = r0     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "business_jid"
            java.lang.String r0 = r5.optString(r0, r7)     // Catch:{ JSONException -> 0x00c6 }
            r8.A03 = r0     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "msgs_skipped_count"
            long r0 = r5.optLong(r0, r1)     // Catch:{ JSONException -> 0x00c6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x00c6 }
            r8.A01 = r0     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "msg_events"
            org.json.JSONArray r3 = r5.optJSONArray(r0)     // Catch:{ JSONException -> 0x00c6 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x00c6 }
            r8.A04 = r0     // Catch:{ JSONException -> 0x00c6 }
            r2 = 0
            if (r3 == 0) goto L_0x00c4
        L_0x003c:
            int r0 = r3.length()     // Catch:{ JSONException -> 0x00c6 }
            if (r2 >= r0) goto L_0x00c4
            java.lang.Object r4 = r3.get(r2)     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x00c6 }
            org.json.JSONObject r5 = X.C17880vN.A16(r4)     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r1 = "message_type"
            java.lang.String r0 = "unknown"
            java.lang.String r1 = r5.optString(r1, r0)     // Catch:{ JSONException -> 0x00b1 }
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x00b1 }
            switch(r0) {
                case -975649923: goto L_0x0098;
                case -537401432: goto L_0x008f;
                case 3556653: goto L_0x007b;
                case 1844104930: goto L_0x0067;
                default: goto L_0x005b;
            }     // Catch:{ JSONException -> 0x00b1 }
        L_0x005b:
            X.8o2 r1 = new X.8o2     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b1 }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x00b7
            goto L_0x00ab
        L_0x0067:
            java.lang.String r0 = "interactive"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x005b
            X.8o5 r1 = new X.8o5     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b1 }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x00b7
            goto L_0x00ab
        L_0x007b:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x005b
            X.8o3 r1 = new X.8o3     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b1 }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x00b7
            goto L_0x00ab
        L_0x008f:
            java.lang.String r0 = "template_hsm_reply"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x005b
            goto L_0x00a0
        L_0x0098:
            java.lang.String r0 = "template_hsm"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x005b
        L_0x00a0:
            X.8o4 r1 = new X.8o4     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b1 }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x00b7
        L_0x00ab:
            java.util.List r0 = r8.A04     // Catch:{ JSONException -> 0x00c6 }
            r0.add(r1)     // Catch:{ JSONException -> 0x00c6 }
            goto L_0x00c0
        L_0x00b1:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchEvent: getEventFromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x00c6 }
        L_0x00b7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r0 = "ConversationSketchConversation: unable to read conversation: "
            X.C17900vP.A0e(r0, r4, r1)     // Catch:{ JSONException -> 0x00c6 }
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x00c4:
            r0 = 1
            return r0
        L_0x00c6:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchConversation: fromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8o1.A04(java.lang.String):boolean");
    }
}
