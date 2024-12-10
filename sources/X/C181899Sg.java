package X;

/* renamed from: X.9Sg  reason: invalid class name and case insensitive filesystem */
public abstract class C181899Sg {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.AiO] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C21338AiO A00(java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x0075
            int r0 = r6.length()     // Catch:{ JSONException -> 0x00b2 }
            if (r0 == 0) goto L_0x0075
            org.json.JSONObject r3 = X.C17880vN.A16(r6)     // Catch:{ JSONException -> 0x00b2 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r0 = "timestamp"
            long r0 = r3.optLong(r0, r4)     // Catch:{ JSONException -> 0x00b2 }
            long r4 = r4 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ JSONException -> 0x00b2 }
            r0 = 45
            long r1 = r2.toMillis(r0)     // Catch:{ JSONException -> 0x00b2 }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0071
            java.lang.String r0 = "sso_eligibility"
            org.json.JSONObject r2 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b2 }
            if (r2 == 0) goto L_0x006d
            java.lang.String r1 = "3"
            java.lang.Integer r5 = X.AnonymousClass00R.A0C     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r0 = "2"
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x00b2 }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.Integer r6 = X.C181889Sf.A00(r0)     // Catch:{ JSONException -> 0x00b2 }
        L_0x003c:
            java.lang.String r0 = "nta_eligibility"
            org.json.JSONObject r2 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b2 }
            if (r2 == 0) goto L_0x006b
            java.lang.String r1 = "3"
            java.lang.String r0 = "2"
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x00b2 }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.Integer r4 = X.C181889Sf.A00(r0)     // Catch:{ JSONException -> 0x00b2 }
        L_0x0053:
            java.lang.String r0 = "nta_super_eligibility"
            org.json.JSONObject r2 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b2 }
            if (r2 == 0) goto L_0x0079
            java.lang.String r1 = "3"
            java.lang.String r0 = "2"
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x00b2 }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.Integer r5 = X.C181889Sf.A00(r0)     // Catch:{ JSONException -> 0x00b2 }
            goto L_0x0079
        L_0x006b:
            r4 = r5
            goto L_0x0053
        L_0x006d:
            java.lang.Integer r6 = X.AnonymousClass00R.A0C     // Catch:{ JSONException -> 0x00b2 }
            r5 = r6
            goto L_0x003c
        L_0x0071:
            java.lang.Integer r6 = X.AnonymousClass00R.A0C     // Catch:{ JSONException -> 0x00b2 }
            r5 = r6
            goto L_0x003c
        L_0x0075:
            java.lang.Integer r6 = X.AnonymousClass00R.A0C     // Catch:{ JSONException -> 0x00b2 }
            r4 = r6
            r5 = r6
        L_0x0079:
            int r0 = r6.intValue()
            switch(r0) {
                case 0: goto L_0x00af;
                case 1: goto L_0x00ac;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.lang.String r3 = "2"
        L_0x0082:
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x00a6;
                default: goto L_0x0089;
            }
        L_0x0089:
            java.lang.String r2 = "2"
        L_0x008b:
            int r0 = r5.intValue()
            switch(r0) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x00a0;
                default: goto L_0x0092;
            }
        L_0x0092:
            java.lang.String r1 = "2"
        L_0x0094:
            X.AiO r0 = new X.AiO
            r0.<init>()
            r0.ssoEligibility = r3
            r0.ntaEligibility = r2
            r0.ntaSuperEligibility = r1
            return r0
        L_0x00a0:
            java.lang.String r1 = "1"
            goto L_0x0094
        L_0x00a3:
            java.lang.String r1 = "0"
            goto L_0x0094
        L_0x00a6:
            java.lang.String r2 = "1"
            goto L_0x008b
        L_0x00a9:
            java.lang.String r2 = "0"
            goto L_0x008b
        L_0x00ac:
            java.lang.String r3 = "1"
            goto L_0x0082
        L_0x00af:
            java.lang.String r3 = "0"
            goto L_0x0082
        L_0x00b2:
            r1 = move-exception
            X.AmW r0 = new X.AmW
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181899Sg.A00(java.lang.String):X.AiO");
    }
}
