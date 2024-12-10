package X;

import android.content.SharedPreferences;

/* renamed from: X.1mO  reason: invalid class name and case insensitive filesystem */
public final class C35531mO {
    public final AnonymousClass1CM A00;
    public final AnonymousClass18Y A01;
    public final C35521mN A02;

    public C35531mO(AnonymousClass18Y r2, C35521mN r3, AnonymousClass1CM r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00() {
        /*
            r4 = this;
            X.1mN r3 = r4.A02
            X.00H r0 = r3.A04
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "ab_props:hash_v2"
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)
            if (r1 == 0) goto L_0x0063
            X.00H r0 = r3.A05     // Catch:{ JSONException -> 0x005d }
            r0.get()     // Catch:{ JSONException -> 0x005d }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x005d }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x005d }
            X.9mN r2 = X.C196639vO.A00(r0)     // Catch:{ JSONException -> 0x005d }
            if (r2 == 0) goto L_0x0063
            X.00H r0 = r3.A03     // Catch:{ JSONException -> 0x005d }
            java.lang.Object r1 = r0.get()     // Catch:{ JSONException -> 0x005d }
            X.1Cs r1 = (X.C22661Cs) r1     // Catch:{ JSONException -> 0x005d }
            java.lang.String r0 = X.C197569wu.A00     // Catch:{ JSONException -> 0x005d }
            byte[] r1 = r1.A02(r2, r0)     // Catch:{ JSONException -> 0x005d }
            if (r1 == 0) goto L_0x0063
            java.nio.charset.Charset r0 = X.C35521mN.A08     // Catch:{ JSONException -> 0x005d }
            java.lang.String r2 = new java.lang.String     // Catch:{ JSONException -> 0x005d }
            r2.<init>(r1, r0)     // Catch:{ JSONException -> 0x005d }
            X.00H r0 = r3.A02
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.util.Map r1 = r0.getAll()
            java.util.Set r0 = r1.keySet()
            X.C35521mN.A00(r0)
            X.00H r0 = r3.A06
            r0.get()
            java.lang.String r0 = X.C60602oJ.A00(r1)
            boolean r0 = r2.equals(r0)
            r1 = r0 ^ 1
            goto L_0x0064
        L_0x005d:
            r1 = move-exception
            java.lang.String r0 = "AB Props Hash couldn't be decrypted"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0063:
            r1 = 0
        L_0x0064:
            X.1CM r0 = r4.A00
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "unregistered"
            return r0
        L_0x0070:
            if (r1 == 0) goto L_0x0076
            java.lang.String r0 = "true"
            return r0
        L_0x0076:
            java.lang.String r0 = "false"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35531mO.A00():java.lang.String");
    }

    public final String A01() {
        boolean z;
        AnonymousClass18Y r3 = this.A01;
        String string = ((SharedPreferences) r3.A00.get()).getString("server_props:hash", (String) null);
        if (string != null) {
            r3.A01.get();
            z = !string.equals(C60602oJ.A00(((SharedPreferences) r3.A02.get()).getAll()));
        } else {
            z = false;
        }
        if (!this.A00.A04()) {
            return "unregistered";
        }
        if (z) {
            return "true";
        }
        return "false";
    }
}
