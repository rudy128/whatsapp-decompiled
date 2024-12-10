package com.whatsapp.push;

import X.A6C;
import X.AnonymousClass00E;
import X.AnonymousClass10E;
import X.C000100c;
import X.C18150vq;
import X.C25081Mu;
import X.DWJ;
import com.google.firebase.messaging.FirebaseMessagingService;

public class GcmListenerService extends FirebaseMessagingService {
    public C18150vq A00 = C18150vq.A02(new DWJ(this, 5));

    public void A02() {
        A6C a6c = (A6C) this.A00.get();
        synchronized (a6c) {
            a6c.A03((Integer) null, (Integer) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.00O, java.util.Map] */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0173, code lost:
        if ("normal".equals(r2) != false) goto L_0x0175;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C23026Ba2 r31) {
        /*
            r30 = this;
            r1 = r31
            java.util.Map r0 = r1.A01
            if (r0 != 0) goto L_0x0056
            android.os.Bundle r5 = r1.A00
            r2 = 0
            X.00P r0 = new X.00P
            r0.<init>(r2)
            java.util.Set r2 = r5.keySet()
            java.util.Iterator r6 = r2.iterator()
        L_0x0016:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.String r4 = X.C17880vN.A0v(r6)
            java.lang.Object r3 = r5.get(r4)
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = "google."
            boolean r2 = r4.startsWith(r2)
            if (r2 != 0) goto L_0x0016
            java.lang.String r2 = "gcm."
            boolean r2 = r4.startsWith(r2)
            if (r2 != 0) goto L_0x0016
            java.lang.String r2 = "from"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0016
            java.lang.String r2 = "message_type"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0016
            java.lang.String r2 = "collapse_key"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0016
            r0.put(r4, r3)
            goto L_0x0016
        L_0x0054:
            r1.A01 = r0
        L_0x0056:
            java.lang.String r2 = "pim"
            java.lang.String r5 = X.C17880vN.A0s(r2, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            r6 = 0
            if (r2 != 0) goto L_0x007c
            org.json.JSONObject r3 = X.C17880vN.A16(r5)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r2 = "pjid"
            java.lang.String r6 = r3.optString(r2, r6)     // Catch:{ JSONException -> 0x006e }
            goto L_0x007c
        L_0x006e:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "GcmListenerService/onMessageReceived: invalid push_infra_metadata:"
            java.lang.String r2 = X.AnonymousClass001.A1H(r2, r5, r3)
            com.whatsapp.util.Log.w(r2, r4)
        L_0x007c:
            r2 = r30
            X.0vq r2 = r2.A00
            java.lang.Object r7 = r2.get()
            X.A6C r7 = (X.A6C) r7
            java.lang.String r2 = "id"
            java.lang.String r11 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "ip"
            java.lang.String r12 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "cl_sess"
            java.lang.String r13 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "mmsov"
            java.lang.String r14 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "fbips"
            java.lang.String r15 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "er_ri"
            java.lang.String r16 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "notify"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r5 = "1"
            boolean r29 = r5.equals(r2)
            java.lang.String r2 = "push_id"
            java.lang.String r17 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "push_event_id"
            java.lang.String r18 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "push_ts"
            java.lang.String r19 = X.C17880vN.A0s(r2, r0)
            android.os.Bundle r3 = r1.A00
            java.lang.String r2 = "google.original_priority"
            java.lang.String r2 = r3.getString(r2)
            if (r2 != 0) goto L_0x00d8
            java.lang.String r2 = "google.priority"
            java.lang.String r2 = r3.getString(r2)
        L_0x00d8:
            java.lang.String r4 = "high"
            boolean r3 = r4.equals(r2)
            if (r3 == 0) goto L_0x0177
            r2 = 1
        L_0x00e1:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            android.os.Bundle r3 = r1.A00
            java.lang.String r2 = "google.delivered_priority"
            java.lang.String r2 = r3.getString(r2)
            if (r2 != 0) goto L_0x0101
            java.lang.String r2 = "google.priority_reduced"
            java.lang.String r2 = r3.getString(r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0175
            java.lang.String r2 = "google.priority"
            java.lang.String r2 = r3.getString(r2)
        L_0x0101:
            boolean r3 = r4.equals(r2)
            if (r3 == 0) goto L_0x016c
            r3 = 1
        L_0x0108:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = "pn"
            java.lang.String r20 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "registration_code"
            java.lang.String r21 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "enc_p"
            java.lang.String r22 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "enc_iv"
            java.lang.String r23 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "enc_c"
            java.lang.String r24 = X.C17880vN.A0s(r2, r0)
            java.lang.String r2 = "enc_t"
            java.lang.String r25 = X.C17880vN.A0s(r2, r0)
            android.os.Bundle r1 = r1.A00
            java.lang.String r0 = "google.sent_time"
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x014e
            long r0 = X.C17880vN.A05(r0)
        L_0x0140:
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r27 = 0
            r26 = r6
            r28 = r27
            r7.A03(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        L_0x014e:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0169
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x015a }
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x015a }
            goto L_0x0140
        L_0x015a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Invalid sent time: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r0, r1, r2)
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r1)
        L_0x0169:
            r0 = 0
            goto L_0x0140
        L_0x016c:
            java.lang.String r3 = "normal"
            boolean r2 = r3.equals(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0108
        L_0x0175:
            r3 = 2
            goto L_0x0108
        L_0x0177:
            java.lang.String r3 = "normal"
            boolean r2 = r3.equals(r2)
            int r2 = X.AnonymousClass8BU.A00(r2)
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.push.GcmListenerService.A04(X.Ba2):void");
    }

    public void A03() {
        RegistrationIntentService.A01(this, (C25081Mu) ((AnonymousClass10E) ((C000100c) AnonymousClass00E.A00(getApplicationContext(), C000100c.class))).ABa.get());
    }
}
