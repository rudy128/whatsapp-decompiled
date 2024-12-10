package com.whatsapp.dobverification.common;

import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass1PZ;
import X.C18070vi;

public final class CommonRemediationApi implements AnonymousClass1PZ {
    public final AnonymousClass181 A00;
    public final AnonymousClass1D9 A01;

    public CommonRemediationApi(AnonymousClass181 r2, AnonymousClass1D9 r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Bk1(java.lang.String r13, java.lang.String r14, X.C30391dr r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.AnonymousClass3FH
            if (r0 == 0) goto L_0x017f
            r3 = r15
            X.3FH r3 = (X.AnonymousClass3FH) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x017f
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r4 = r3.result
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x00e1
            if (r0 != r1) goto L_0x01ab
            java.lang.Object r2 = r3.L$0
            com.whatsapp.dobverification.common.CommonRemediationApi r2 = (com.whatsapp.dobverification.common.CommonRemediationApi) r2
            X.C30691eM.A01(r4)
        L_0x0022:
            X.8BJ r4 = (X.AnonymousClass8BJ) r4
            if (r4 != 0) goto L_0x002e
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x0028:
            X.7Fz r3 = new X.7Fz
            r3.<init>(r0)
            return r3
        L_0x002e:
            r0 = r4
            X.AUZ r0 = (X.AUZ) r0
            java.net.HttpURLConnection r5 = r0.A01
            int r1 = r5.getResponseCode()
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0073
            X.181 r3 = r2.A00
            java.lang.String r2 = "Failed to parse response"
            r0 = 5
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x0067 }
            X.9Hb r0 = r4.BMP(r3, r1, r0)     // Catch:{ IOException | JSONException -> 0x0067 }
            java.lang.String r1 = X.AnonymousClass1EY.A00(r0)     // Catch:{ IOException | JSONException -> 0x0067 }
            r0.close()     // Catch:{ IOException | JSONException -> 0x0067 }
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = "for (;;);"
            boolean r0 = r1.startsWith(r0)     // Catch:{ IOException | JSONException -> 0x0067 }
            if (r0 == 0) goto L_0x0060
            r0 = 9
            java.lang.String r1 = X.C29361c9.A0D(r1, r0)     // Catch:{ IOException | JSONException -> 0x0067 }
        L_0x0060:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0067 }
            r3.<init>(r1)     // Catch:{ IOException | JSONException -> 0x0067 }
            goto L_0x0186
        L_0x0067:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
        L_0x006b:
            java.lang.String r0 = "CommonRemediationApi/handleResponse null response"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            goto L_0x0028
        L_0x0073:
            int r1 = r5.getResponseCode()
            r0 = 401(0x191, float:5.62E-43)
            java.lang.String r4 = "CommonRemediationApi/handleResponse error response code="
            if (r1 != r0) goto L_0x0096
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            int r0 = r5.getResponseCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x0028
        L_0x0096:
            int r1 = r5.getResponseCode()
            r0 = 403(0x193, float:5.65E-43)
            if (r1 != r0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            int r0 = r5.getResponseCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            goto L_0x0028
        L_0x00b8:
            int r3 = r5.getResponseCode()
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            int r0 = r5.getResponseCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            if (r3 != r2) goto L_0x00da
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0028
        L_0x00da:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            goto L_0x0028
        L_0x00e1:
            X.C30691eM.A01(r4)
            boolean r0 = X.AnonymousClass1YF.A0T(r13)
            if (r0 == 0) goto L_0x00ee
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0028
        L_0x00ee:
            r3.L$0 = r12
            r3.label = r1
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x0175 }
            r1.<init>()     // Catch:{ IOException -> 0x0175 }
            java.lang.String r0 = "payload"
            r1.put(r0, r13)     // Catch:{ IOException -> 0x0175 }
            java.lang.String r0 = "dob"
            r1.put(r0, r14)     // Catch:{ IOException -> 0x0175 }
            int r0 = r1.size()     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            r5.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ UnsupportedEncodingException -> 0x0156 }
        L_0x0112:
            boolean r0 = r4.hasNext()     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            if (r0 == 0) goto L_0x014c
            java.lang.Object r1 = r4.next()     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.lang.Object r3 = r1.getValue()     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.lang.String r1 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            r0 = 61
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.lang.String r0 = java.net.URLEncoder.encode(r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            r5.add(r0)     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            goto L_0x0112
        L_0x014c:
            java.lang.String r2 = "&"
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r4 = X.C29431cG.A0g(r2, r0, r0, r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x0156 }
            goto L_0x015e
        L_0x0156:
            r1 = move-exception
            java.lang.String r0 = "CommonRemediationApi/getMintTokenPostData error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0175 }
            java.lang.String r4 = ""
        L_0x015e:
            X.1D9 r1 = r12.A01     // Catch:{ IOException -> 0x0175 }
            java.lang.String r3 = "https://www.whatsapp.com/compliance/xfac/mint"
            java.lang.String r6 = "application/x-www-form-urlencoded"
            r0 = 5
            java.lang.Integer r2 = new java.lang.Integer     // Catch:{ IOException -> 0x0175 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0175 }
            r5 = 0
            r9 = 0
            r8 = r5
            r11 = r9
            r7 = r5
            r10 = r9
            X.AUZ r4 = X.AnonymousClass1D9.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x0175 }
            goto L_0x017c
        L_0x0175:
            r1 = move-exception
            java.lang.String r0 = "CommonRemediationApi/doTokenMinting error"
            com.whatsapp.util.Log.e(r0, r1)
            r4 = 0
        L_0x017c:
            r2 = r12
            goto L_0x0022
        L_0x017f:
            X.3FH r3 = new X.3FH
            r3.<init>(r12, r15)
            goto L_0x0012
        L_0x0186:
            java.lang.String r0 = "access_token"
            java.lang.String r2 = r3.getString(r0)     // Catch:{ JSONException -> 0x019d }
            X.C18070vi.A0X(r2)     // Catch:{ JSONException -> 0x019d }
            java.lang.String r1 = "expiry_ts"
            r0 = 0
            int r0 = r3.optInt(r1, r0)     // Catch:{ JSONException -> 0x019d }
            long r0 = (long) r0     // Catch:{ JSONException -> 0x019d }
            X.7G0 r3 = new X.7G0     // Catch:{ JSONException -> 0x019d }
            r3.<init>(r2, r0)     // Catch:{ JSONException -> 0x019d }
            return r3
        L_0x019d:
            r1 = move-exception
            java.lang.String r0 = "CommonRemediationApi/handleResponse error parsing response"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            X.7Fz r3 = new X.7Fz
            r3.<init>(r0)
            return r3
        L_0x01ab:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dobverification.common.CommonRemediationApi.Bk1(java.lang.String, java.lang.String, X.1dr):java.lang.Object");
    }
}
