package X;

import org.json.JSONObject;

/* renamed from: X.9mW  reason: invalid class name and case insensitive filesystem */
public class C191389mW {
    public AnonymousClass11C A00;
    public AnonymousClass1QD A01;
    public AnonymousClass1QE A02 = AnonymousClass1QE.A00("NetworkDeviceIdManager", "infra", "COMMON");
    public JSONObject A03;
    public AnonymousClass11P A04;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|31|32|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00bc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(int r11) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            org.json.JSONObject r1 = r10.A03     // Catch:{ all -> 0x00c5 }
            if (r1 != 0) goto L_0x0036
            X.1QD r0 = r10.A01     // Catch:{ JSONException -> 0x0020 }
            android.content.SharedPreferences r1 = r0.A03()     // Catch:{ JSONException -> 0x0020 }
            java.lang.String r0 = "payments_network_id_map"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)     // Catch:{ JSONException -> 0x0020 }
            if (r0 == 0) goto L_0x001b
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0020 }
        L_0x0018:
            r10.A03 = r1     // Catch:{ JSONException -> 0x0020 }
            goto L_0x0036
        L_0x001b:
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0020 }
            goto L_0x0018
        L_0x0020:
            r3 = move-exception
            X.1QE r2 = r10.A02     // Catch:{ all -> 0x00c5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = "JSONObject instantiation "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r3)     // Catch:{ all -> 0x00c5 }
            r2.A05(r0)     // Catch:{ all -> 0x00c5 }
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ all -> 0x00c5 }
            r10.A03 = r1     // Catch:{ all -> 0x00c5 }
        L_0x0036:
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00c5 }
            r0 = 0
            java.lang.String r3 = r1.optString(r7, r0)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x005e
            X.1QE r2 = r10.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "getNetworkId with CARD "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ": from cache: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            r2.A04(r0)
            return r3
        L_0x005e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.11C r0 = r10.A00
            X.11B r0 = r0.A0O()
            java.lang.String r0 = X.C17970vW.A01(r0)
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = X.C17880vN.A0u(r2, r0)
            byte[] r8 = r0.getBytes()
            r0 = 1
            if (r11 == r0) goto L_0x0084
            r0 = 5
            if (r11 == r0) goto L_0x0084
            r3 = 0
        L_0x0082:
            monitor-enter(r9)
            goto L_0x00a5
        L_0x0084:
            r6 = 128(0x80, float:1.794E-43)
            r5 = 150(0x96, float:2.1E-43)
            java.lang.String r4 = "PBKDF2WithHmacSHA1And8BIT"
            int r3 = r8.length
            char[] r2 = new char[r3]
            r1 = 0
        L_0x008e:
            if (r1 >= r3) goto L_0x0098
            byte r0 = r8[r1]
            char r0 = (char) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x008e
        L_0x0098:
            javax.crypto.SecretKey r0 = X.C17970vW.A08(r4, r8, r2, r6, r5)
            byte[] r0 = r0.getEncoded()
            java.lang.String r3 = X.AnonymousClass8BT.A0x(r0)
            goto L_0x0082
        L_0x00a5:
            org.json.JSONObject r0 = r10.A03     // Catch:{ JSONException -> 0x00bc }
            r0.put(r7, r3)     // Catch:{ JSONException -> 0x00bc }
            X.1QD r1 = r10.A01     // Catch:{ JSONException -> 0x00bc }
            org.json.JSONObject r0 = r10.A03     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r2 = r0.toString()     // Catch:{ JSONException -> 0x00bc }
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r1)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r0 = "payments_network_id_map"
            X.C17880vN.A1E(r1, r0, r2)     // Catch:{ JSONException -> 0x00bc }
            goto L_0x00c3
        L_0x00bc:
            X.1QE r1 = r10.A02     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = "setDeviceId :: failed"
            r1.A05(r0)     // Catch:{ all -> 0x00c5 }
        L_0x00c3:
            monitor-exit(r9)
            return r3
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191389mW.A00(int):java.lang.String");
    }

    public C191389mW(AnonymousClass11C r4, AnonymousClass11P r5, AnonymousClass1QD r6) {
        this.A04 = r5;
        this.A00 = r4;
        this.A01 = r6;
    }
}
