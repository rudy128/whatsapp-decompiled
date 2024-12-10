package X;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.6zM  reason: invalid class name and case insensitive filesystem */
public class C139736zM {
    public final C19830z4 A00;

    public static String A00(C140056zs r3, String str) {
        return String.format("%s-%s-%s-%s-%s-%s", new Object[]{"smb_soft_enforcement_banner", r3.A02, r3.A05, r3.A04, r3.A07, str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r7.A00 == -1) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A01(java.lang.String r11) {
        /*
            r10 = this;
            X.0z4 r3 = r10.A00
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            r1 = 0
            java.lang.String r0 = "smb_soft_enforcement_banner"
            r2[r1] = r0
            r0 = 1
            r2[r0] = r11
            java.lang.String r0 = "%s-all-json-%s"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r3)
            java.lang.String r6 = X.C17880vN.A0r(r0, r1)
            if (r6 == 0) goto L_0x0079
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0079
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x006e }
            r9.<init>(r6)     // Catch:{ JSONException -> 0x006e }
            r8 = 0
        L_0x002e:
            int r0 = r9.length()     // Catch:{ JSONException -> 0x006e }
            if (r8 >= r0) goto L_0x007d
            org.json.JSONObject r0 = r9.getJSONObject(r8)     // Catch:{ JSONException -> 0x006e }
            if (r0 == 0) goto L_0x006b
            X.6zs r7 = new X.6zs     // Catch:{ JSONException -> 0x006e }
            r7.<init>(r0)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r0 = r7.A05     // Catch:{ JSONException -> 0x006e }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r7.A04     // Catch:{ JSONException -> 0x006e }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r7.A07     // Catch:{ JSONException -> 0x006e }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r7.A02     // Catch:{ JSONException -> 0x006e }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r7.A03     // Catch:{ JSONException -> 0x006e }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r7.A06     // Catch:{ JSONException -> 0x006e }
            if (r0 == 0) goto L_0x0065
            long r3 = r7.A01     // Catch:{ JSONException -> 0x006e }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            int r2 = r7.A00     // Catch:{ JSONException -> 0x006e }
            r1 = -1
            r0 = 1
            if (r2 != r1) goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x006b
            r5.add(r7)     // Catch:{ JSONException -> 0x006e }
        L_0x006b:
            int r8 = r8 + 1
            goto L_0x002e
        L_0x006e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error while deserializing SMBSoftEnforcementNotification from string: "
            X.C17900vP.A0h(r0, r6, r1, r2)
            return r5
        L_0x0079:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
        L_0x007d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139736zM.A01(java.lang.String):java.util.ArrayList");
    }

    public void A02(C140056zs r4) {
        C19830z4 r2 = this.A00;
        C17880vN.A1B(C19830z4.A00(r2), A00(r4, "total_days"));
        C17880vN.A1B(C19830z4.A00(r2), A00(r4, "click_count"));
        C17880vN.A1B(C19830z4.A00(r2), A00(r4, "dismiss_count"));
        A03(r4, true);
    }

    public void A03(C140056zs r7, boolean z) {
        String str = r7.A02;
        ArrayList A01 = A01(str);
        if (z) {
            int i = 0;
            while (true) {
                if (i >= A01.size()) {
                    break;
                }
                C140056zs r2 = (C140056zs) A01.get(i);
                if (!r2.A05.equals(r7.A05) || !r2.A02.equals(str) || !r2.A07.equals(r7.A07)) {
                    i++;
                } else if (i >= 0) {
                    A01.remove(i);
                }
            }
        } else {
            A01.add(r7);
        }
        C19830z4 r4 = this.A00;
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = "smb_soft_enforcement_banner";
        A1b[1] = str;
        String format = String.format("%s-all-json-%s", A1b);
        JSONArray jSONArray = new JSONArray();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((C140056zs) it.next()).A00());
            } catch (JSONException e) {
                C17890vO.A0w(e);
            }
        }
        C17880vN.A1E(C19830z4.A00(r4), format, jSONArray.toString());
    }

    public C139736zM(C19830z4 r1) {
        this.A00 = r1;
    }
}
