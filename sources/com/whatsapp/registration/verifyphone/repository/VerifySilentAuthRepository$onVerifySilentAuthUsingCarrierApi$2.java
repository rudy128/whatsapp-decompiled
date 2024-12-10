package com.whatsapp.registration.verifyphone.repository;

import X.AnonymousClass1OS;
import X.C188139gw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.net.Network;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.verifyphone.repository.VerifySilentAuthRepository$onVerifySilentAuthUsingCarrierApi$2", f = "VerifySilentAuthRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VerifySilentAuthRepository$onVerifySilentAuthUsingCarrierApi$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Network $network;
    public final /* synthetic */ String $screenType;
    public final /* synthetic */ String $uri;
    public int label;
    public final /* synthetic */ C188139gw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerifySilentAuthRepository$onVerifySilentAuthUsingCarrierApi$2(Network network, C188139gw r3, String str, String str2, C30391dr r6) {
        super(2, r6);
        this.$network = network;
        this.this$0 = r3;
        this.$uri = str;
        this.$screenType = str2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new VerifySilentAuthRepository$onVerifySilentAuthUsingCarrierApi$2(this.$network, this.this$0, this.$uri, this.$screenType, r8);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r5 = "silent_auth_redirect_url_failed"
            int r0 = r12.label
            if (r0 != 0) goto L_0x00bb
            X.C30691eM.A01(r13)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x009b }
            java.lang.String r0 = "SilentAuthRepository/onVerifySilentAuthUsingCarrierApi/network is null : "
            r1.append(r0)     // Catch:{ IOException -> 0x009b }
            android.net.Network r0 = r12.$network     // Catch:{ IOException -> 0x009b }
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.C17900vP.A0r(r1, r0)     // Catch:{ IOException -> 0x009b }
            X.9gw r0 = r12.this$0     // Catch:{ IOException -> 0x009b }
            X.1D9 r11 = r0.A04     // Catch:{ IOException -> 0x009b }
            java.lang.String r0 = r12.$uri     // Catch:{ IOException -> 0x009b }
            java.lang.String r10 = X.C197569wu.A0A     // Catch:{ IOException -> 0x009b }
            android.net.Network r9 = r12.$network     // Catch:{ IOException -> 0x009b }
            java.net.HttpURLConnection r8 = X.AnonymousClass1D9.A01(r9, r11, r0)     // Catch:{ IOException -> 0x009b }
            int r0 = r8.getResponseCode()     // Catch:{ IOException -> 0x009b }
            r7 = 0
        L_0x002e:
            int r1 = r0 / 100
            r0 = 3
            if (r1 != r0) goto L_0x006c
            r0 = 10
            if (r7 >= r0) goto L_0x006c
            java.lang.String r0 = "Location"
            java.lang.String r6 = r8.getHeaderField(r0)     // Catch:{ IOException -> 0x009b }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x009b }
            if (r0 != 0) goto L_0x006c
            boolean r0 = r6.matches(r10)     // Catch:{ IOException -> 0x009b }
            if (r0 != 0) goto L_0x006c
            X.181 r4 = r11.A00     // Catch:{ IOException -> 0x005e }
            r0 = 23
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x005e }
            r2 = 0
            java.io.InputStream r1 = r8.getInputStream()     // Catch:{ IOException -> 0x005e }
            X.9Hb r0 = new X.9Hb     // Catch:{ IOException -> 0x005e }
            r0.<init>(r4, r1, r2, r3)     // Catch:{ IOException -> 0x005e }
            X.AnonymousClass1EY.A02(r0)     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            r8.disconnect()     // Catch:{ IOException -> 0x009b }
            java.net.HttpURLConnection r8 = X.AnonymousClass1D9.A01(r9, r11, r6)     // Catch:{ IOException -> 0x009b }
            int r0 = r8.getResponseCode()     // Catch:{ IOException -> 0x009b }
            int r7 = r7 + 1
            goto L_0x002e
        L_0x006c:
            r0 = 0
            X.AUZ r2 = new X.AUZ     // Catch:{ IOException -> 0x009b }
            r2.<init>(r0, r8)     // Catch:{ IOException -> 0x009b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x009b }
            java.lang.String r0 = "SilentAuthRepository/onVerifySilentAuthUsingCarrierApi/returned code : "
            r1.append(r0)     // Catch:{ IOException -> 0x009b }
            java.net.HttpURLConnection r2 = r2.A01     // Catch:{ IOException -> 0x009b }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x009b }
            X.C17900vP.A0o(r1, r0)     // Catch:{ IOException -> 0x009b }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x009b }
            int r1 = r0 / 100
            r0 = 3
            if (r1 != r0) goto L_0x00ac
            X.9gw r0 = r12.this$0     // Catch:{ IOException -> 0x009b }
            X.0z4 r0 = r0.A02     // Catch:{ IOException -> 0x009b }
            r0.A1g(r5)     // Catch:{ IOException -> 0x009b }
            java.lang.String r0 = "Location"
            java.lang.String r0 = r2.getHeaderField(r0)     // Catch:{ IOException -> 0x009b }
            return r0
        L_0x009b:
            r2 = move-exception
            X.9gw r0 = r12.this$0
            X.0z4 r0 = r0.A02
            r0.A1g(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SilentAuthRepository/onVerifySilentAuthUsingCarrierApi/IOException : "
            X.C17900vP.A0X(r2, r0, r1)
        L_0x00ac:
            X.9gw r0 = r12.this$0
            X.A8V r3 = r0.A05
            java.lang.String r2 = r12.$screenType
            java.lang.String r1 = "ipification_auth_failure"
            java.lang.String r0 = "http_response_failure"
            r3.A0K(r2, r1, r0)
            r0 = 0
            return r0
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.repository.VerifySilentAuthRepository$onVerifySilentAuthUsingCarrierApi$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VerifySilentAuthRepository$onVerifySilentAuthUsingCarrierApi$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
