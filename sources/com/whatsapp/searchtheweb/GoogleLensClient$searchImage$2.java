package com.whatsapp.searchtheweb;

import X.AnonymousClass1OS;
import X.C1776399u;
import X.C187809gP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.searchtheweb.GoogleLensClient$searchImage$2", f = "GoogleLensClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GoogleLensClient$searchImage$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1776399u $input;
    public int label;
    public final /* synthetic */ C187809gP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleLensClient$searchImage$2(C187809gP r2, C1776399u r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$input = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GoogleLensClient$searchImage$2(this.this$0, this.$input, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0169, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x016d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0170, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0174, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0180, code lost:
        if (r3 != null) goto L_0x0182;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r7 = "--"
            int r0 = r11.label
            if (r0 != 0) goto L_0x0186
            X.C30691eM.A01(r12)
            X.99u r3 = r11.$input
            r5 = 0
            X.C18070vi.A0d(r3, r5)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r0 = r1.scheme(r0)
            java.lang.String r4 = "lens.google.com"
            android.net.Uri$Builder r1 = r0.authority(r4)
            java.lang.String r0 = "upload"
            android.net.Uri$Builder r2 = r1.path(r0)
            java.lang.String r1 = "re"
            java.lang.String r0 = "mf"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            java.lang.String r1 = "ep"
            java.lang.String r0 = "wil"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            java.lang.String r1 = "ctx"
            java.lang.String r0 = "wa1"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            int r0 = r3.A01
            r1.append(r0)
            r0 = 44
            r1.append(r0)
            int r0 = r3.A00
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
            java.lang.String r0 = "processed_image_dimensions"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)
            android.net.Uri r3 = r0.build()
            java.lang.StringBuilder r2 = X.C108955ca.A15(r3)
            java.lang.String r0 = "----WebKitFormBoundary"
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = X.C17880vN.A0u(r2, r0)
            X.99u r0 = r11.$input
            java.io.File r8 = r0.A02
            r10 = 0
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            java.net.URLConnection r3 = X.AnonymousClass8BV.A0v(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            X.9gP r9 = r11.this$0     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            r3.setInstanceFollowRedirects(r5)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            java.lang.String r0 = "POST"
            r3.setRequestMethod(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            r5 = 1
            r3.setDoInput(r5)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            r3.setDoOutput(r5)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            java.lang.String r2 = "Content-Type"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r1)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            r3.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            X.1KX r1 = r9.A02     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            boolean r0 = r1.A02()     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            if (r0 == 0) goto L_0x00c5
            X.18j r0 = r9.A03     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            X.DcK r2 = r0.A01(r5)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            boolean r0 = r1.A01()     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            if (r0 == 0) goto L_0x00c1
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            X.AlR r0 = new X.AlR     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            r3.setHostnameVerifier(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
        L_0x00c1:
            r3.setSSLSocketFactory(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            goto L_0x00cc
        L_0x00c5:
            X.18j r0 = r9.A03     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            X.9A9 r2 = r0.A02()     // Catch:{ Exception -> 0x017f, all -> 0x0178 }
            goto L_0x00c1
        L_0x00cc:
            X.9gP r0 = r11.this$0     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            X.181 r5 = r0.A00     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            r0 = 6
            java.lang.Integer r4 = X.AnonymousClass3MW.A0v(r0)     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            r0 = 39
            java.lang.Integer r2 = X.AnonymousClass3MW.A0v(r0)     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            java.io.OutputStream r1 = r3.getOutputStream()     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            X.9He r0 = new X.9He     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            r0.<init>(r5, r1, r4, r2)     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0o(r7, r6)     // Catch:{ all -> 0x016e }
            java.lang.String r5 = "\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0y(r5, r0)     // Catch:{ all -> 0x016e }
            r4.writeBytes(r0)     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x016e }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"encoded_image\"; filename=\""
            X.AnonymousClass8BV.A1J(r8, r0, r1)     // Catch:{ all -> 0x016e }
            r0 = 34
            java.lang.String r0 = X.C17890vO.A0Z(r5, r1, r0)     // Catch:{ all -> 0x016e }
            r4.writeBytes(r0)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x016e }
            java.lang.String r2 = java.net.URLConnection.guessContentTypeFromName(r0)     // Catch:{ all -> 0x016e }
            if (r2 != 0) goto L_0x0114
            java.lang.String r2 = "application/octet-stream"
        L_0x0114:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x016e }
            java.lang.String r0 = "Content-Type: "
            X.C17890vO.A10(r0, r2, r5, r1)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x016e }
            r4.writeBytes(r0)     // Catch:{ all -> 0x016e }
            r4.writeBytes(r5)     // Catch:{ all -> 0x016e }
            java.io.FileInputStream r2 = X.C108945cZ.A18(r8)     // Catch:{ all -> 0x016e }
            X.C196989vy.A00(r2, r4)     // Catch:{ all -> 0x0167 }
            r2.close()     // Catch:{ all -> 0x016e }
            r4.writeBytes(r5)     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r7)     // Catch:{ all -> 0x016e }
            X.C17890vO.A10(r6, r7, r5, r0)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x016e }
            r4.writeBytes(r0)     // Catch:{ all -> 0x016e }
            r4.flush()     // Catch:{ all -> 0x016e }
            r4.close()     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            int r1 = r3.getResponseCode()     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 != r0) goto L_0x0161
            java.lang.String r0 = "Location"
            java.lang.String r1 = r3.getHeaderField(r0)     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
        L_0x0156:
            boolean r0 = android.webkit.URLUtil.isValidUrl(r1)     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            if (r0 == 0) goto L_0x0182
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            goto L_0x0163
        L_0x0161:
            r1 = r10
            goto L_0x0156
        L_0x0163:
            r3.disconnect()
            return r0
        L_0x0167:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0170 }
        L_0x0170:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
            throw r0     // Catch:{ Exception -> 0x0180, all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            r10 = r3
            goto L_0x0179
        L_0x0178:
            r0 = move-exception
        L_0x0179:
            if (r10 == 0) goto L_0x017e
            r10.disconnect()
        L_0x017e:
            throw r0
        L_0x017f:
            r3 = r10
        L_0x0180:
            if (r3 == 0) goto L_0x0185
        L_0x0182:
            r3.disconnect()
        L_0x0185:
            return r10
        L_0x0186:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.searchtheweb.GoogleLensClient$searchImage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GoogleLensClient$searchImage$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
