package com.whatsapp.registration.task;

import X.AnonymousClass1OS;
import X.AnonymousClass99E;
import X.C165038aU;
import X.C191459md;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.task.VerifyCodeRepository$verify$2", f = "VerifyCodeRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VerifyCodeRepository$verify$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $authChallenge;
    public final /* synthetic */ String $authCodeContext;
    public final /* synthetic */ AnonymousClass99E $clientMetrics;
    public final /* synthetic */ String $code;
    public final /* synthetic */ int $codeEntryMethod;
    public final /* synthetic */ int $codeVerificationMode;
    public final /* synthetic */ String $countryCode;
    public final /* synthetic */ String $method;
    public final /* synthetic */ String $phoneNumber;
    public final /* synthetic */ C165038aU $verifiedNameCertificate;
    public int label;
    public final /* synthetic */ C191459md this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerifyCodeRepository$verify$2(C165038aU r2, AnonymousClass99E r3, C191459md r4, String str, String str2, String str3, String str4, String str5, String str6, C30391dr r11, int i, int i2) {
        super(2, r11);
        this.this$0 = r4;
        this.$code = str;
        this.$codeVerificationMode = i;
        this.$method = str2;
        this.$codeEntryMethod = i2;
        this.$countryCode = str3;
        this.$phoneNumber = str4;
        this.$authCodeContext = str5;
        this.$authChallenge = str6;
        this.$clientMetrics = r3;
        this.$verifiedNameCertificate = r2;
    }

    public final C30391dr create(Object obj, C30391dr r15) {
        C191459md r3 = this.this$0;
        String str = this.$code;
        int i = this.$codeVerificationMode;
        String str2 = this.$method;
        int i2 = this.$codeEntryMethod;
        String str3 = this.$countryCode;
        String str4 = this.$phoneNumber;
        String str5 = this.$authCodeContext;
        String str6 = this.$authChallenge;
        return new VerifyCodeRepository$verify$2(this.$verifiedNameCertificate, this.$clientMetrics, r3, str, str2, str3, str4, str5, str6, r15, i, i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r6 != 5) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d3, code lost:
        if (r0.equals("send_sms") != false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d5, code lost:
        r24 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062 A[SYNTHETIC, Splitter:B:11:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0210 A[Catch:{ Exception -> 0x033e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            r31 = this;
            r1 = r31
            int r0 = r1.label
            if (r0 != 0) goto L_0x03b9
            X.C30691eM.A01(r32)
            X.9md r10 = r1.this$0
            java.lang.String r13 = r1.$code
            int r6 = r1.$codeVerificationMode
            java.lang.String r0 = r1.$method
            int r9 = r1.$codeEntryMethod
            java.lang.String r2 = r1.$countryCode
            java.lang.String r3 = r1.$phoneNumber
            java.lang.String r4 = r1.$authCodeContext
            java.lang.String r5 = r1.$authChallenge
            X.99E r8 = r1.$clientMetrics
            X.8aU r7 = r1.$verifiedNameCertificate
            r1 = 3
            r12 = 1
            r11 = 1
            if (r6 == r1) goto L_0x0060
            r11 = 0
            r1 = 4
            if (r6 == r1) goto L_0x002b
            r1 = 5
            if (r6 != r1) goto L_0x0060
        L_0x002b:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r1 = "VerifyCodeRepository/method="
            r6.append(r1)
            r6.append(r0)
            java.lang.String r1 = "/useStandaloneVerification="
            r6.append(r1)
            r6.append(r11)
            java.lang.String r1 = "/useEmailPNOtpIq="
            r6.append(r1)
            r6.append(r12)
            java.lang.String r1 = "/authCodeContext="
            X.C17900vP.A0f(r1, r4, r6)
            X.0z4 r15 = r10.A00
            X.00H r1 = r15.A00
            r30 = r1
            android.content.SharedPreferences r14 = X.C17880vN.A0B(r30)
            java.lang.String r6 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            r1 = 0
            java.lang.String r6 = r14.getString(r6, r1)
            if (r12 == 0) goto L_0x0210
            goto L_0x0062
        L_0x0060:
            r12 = 0
            goto L_0x002b
        L_0x0062:
            X.9uY r4 = r10.A01     // Catch:{ Exception -> 0x039f }
            r9 = 0
            boolean r8 = X.C18070vi.A17(r2, r3)     // Catch:{ Exception -> 0x039f }
            r7 = 2
            X.C18070vi.A0d(r13, r7)     // Catch:{ Exception -> 0x039f }
            X.00H r14 = r4.A05     // Catch:{ Exception -> 0x039f }
            java.lang.String r5 = X.C17890vO.A0T(r14)     // Catch:{ Exception -> 0x039f }
            java.lang.String r10 = "id"
            java.lang.String r11 = "iq"
            X.1cX r6 = X.C108945cZ.A0t(r11)     // Catch:{ Exception -> 0x039f }
            X.C108995ce.A1E(r6)     // Catch:{ Exception -> 0x039f }
            java.lang.String r12 = "xmlns"
            java.lang.String r4 = "urn:xmpp:whatsapp:account"
            X.C29591cX.A01(r6, r12, r4)     // Catch:{ Exception -> 0x039f }
            java.lang.String r4 = "type"
            java.lang.String r12 = "get"
            X.C29591cX.A01(r6, r4, r12)     // Catch:{ Exception -> 0x039f }
            r18 = 0
            r20 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r17 = r5
            r22 = r9
            boolean r12 = X.C29601cY.A04(r17, r18, r20, r22)     // Catch:{ Exception -> 0x039f }
            if (r12 == 0) goto L_0x00a0
            X.C29591cX.A01(r6, r10, r5)     // Catch:{ Exception -> 0x039f }
        L_0x00a0:
            java.lang.String r17 = "verify_pn"
            X.1cX r12 = X.C108945cZ.A0t(r17)     // Catch:{ Exception -> 0x039f }
            java.lang.String r10 = "code"
            X.1cX r10 = X.C108945cZ.A0t(r10)     // Catch:{ Exception -> 0x039f }
            r23 = 6
            r22 = r13
            r25 = r23
            r27 = r9
            boolean r16 = X.C29601cY.A04(r22, r23, r25, r27)     // Catch:{ Exception -> 0x039f }
            if (r16 == 0) goto L_0x00bd
            r10.A07(r13)     // Catch:{ Exception -> 0x039f }
        L_0x00bd:
            X.AnonymousClass8BX.A1I(r10, r12, r6)     // Catch:{ Exception -> 0x039f }
            X.1ca r10 = r6.A03()     // Catch:{ Exception -> 0x039f }
            X.1OZ r12 = X.C17880vN.A0U(r14)     // Catch:{ Exception -> 0x039f }
            r6 = 445(0x1bd, float:6.24E-43)
            X.1Ug r5 = r12.A09(r10, r5, r6)     // Catch:{ Exception -> 0x039f }
            java.lang.Object r6 = r5.get()     // Catch:{ Exception -> 0x033e }
            X.C18070vi.A0X(r6)     // Catch:{ Exception -> 0x033e }
            X.1ca r6 = (X.C29621ca) r6     // Catch:{ Exception -> 0x033e }
            java.lang.String r5 = r6.A0Q(r4, r1)     // Catch:{ Exception -> 0x033e }
            java.lang.String r4 = "result"
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x033e }
            if (r4 == 0) goto L_0x0167
            X.C29621ca.A04(r6, r11)     // Catch:{ Exception -> 0x033e }
            X.2rm r12 = X.AnonymousClass8BR.A0s()     // Catch:{ Exception -> 0x033e }
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Exception -> 0x033e }
            java.lang.String r5 = "false"
            r4[r9] = r5     // Catch:{ Exception -> 0x033e }
            java.lang.String r11 = "true"
            java.util.List r14 = X.C18070vi.A0O(r11, r4, r8)     // Catch:{ Exception -> 0x033e }
            r4 = 3
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ Exception -> 0x033e }
            r5[r9] = r17     // Catch:{ Exception -> 0x033e }
            java.lang.String r16 = "code_match"
            r5[r8] = r16     // Catch:{ Exception -> 0x033e }
            java.lang.String r16 = "#elementValue"
            r5[r7] = r16     // Catch:{ Exception -> 0x033e }
            java.lang.String r5 = r12.A07(r6, r14, r5)     // Catch:{ Exception -> 0x033e }
            if (r5 == 0) goto L_0x0161
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x033e }
            r4[r9] = r17     // Catch:{ Exception -> 0x033e }
            java.lang.String r9 = "guess_wait_time"
            r4[r8] = r9     // Catch:{ Exception -> 0x033e }
            r4[r7] = r16     // Catch:{ Exception -> 0x033e }
            java.lang.Class r18 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x033e }
            java.lang.Long r19 = X.AnonymousClass8BV.A0a()     // Catch:{ Exception -> 0x033e }
            java.lang.Long r20 = java.lang.Long.valueOf(r20)     // Catch:{ Exception -> 0x033e }
            r16 = r12
            r17 = r6
            r21 = r1
            r22 = r4
            java.lang.Object r1 = r16.A04(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x033e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x033e }
            if (r1 == 0) goto L_0x015b
            long r7 = r1.longValue()     // Catch:{ Exception -> 0x033e }
            X.A5w r4 = X.C20071A5w.A00     // Catch:{ Exception -> 0x033e }
            r1 = 10
            java.lang.Object r1 = X.C21290Ahb.A02(r6, r12, r10, r4, r1)     // Catch:{ Exception -> 0x033e }
            X.9DG r1 = (X.AnonymousClass9DG) r1     // Catch:{ Exception -> 0x033e }
            if (r1 == 0) goto L_0x020b
            boolean r1 = r5.equals(r11)     // Catch:{ Exception -> 0x033e }
            if (r1 == 0) goto L_0x0158
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ Exception -> 0x033e }
        L_0x0145:
            X.9hy r4 = new X.9hy     // Catch:{ Exception -> 0x033e }
            r4.<init>(r1)     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = X.C17900vP.A0A(r2, r3)     // Catch:{ Exception -> 0x033e }
            r4.A08 = r1     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x033e }
            r4.A0C = r1     // Catch:{ Exception -> 0x033e }
            goto L_0x034b
        L_0x0158:
            java.lang.Integer r1 = X.AnonymousClass00R.A0j     // Catch:{ Exception -> 0x033e }
            goto L_0x0145
        L_0x015b:
            X.1UI r1 = X.AnonymousClass1O9.A00(r12)     // Catch:{ Exception -> 0x033e }
            goto L_0x020f
        L_0x0161:
            X.1UI r1 = X.AnonymousClass1O9.A00(r12)     // Catch:{ Exception -> 0x033e }
            goto L_0x020f
        L_0x0167:
            X.C29621ca.A04(r6, r11)     // Catch:{ Exception -> 0x033e }
            X.2rm r4 = X.AnonymousClass8BR.A0s()     // Catch:{ Exception -> 0x033e }
            X.A5w r5 = X.C20071A5w.A00     // Catch:{ Exception -> 0x033e }
            r1 = 9
            X.Ahb r1 = X.C21290Ahb.A00(r10, r5, r1)     // Catch:{ Exception -> 0x033e }
            java.lang.Object r1 = r1.BCF(r6, r4)     // Catch:{ Exception -> 0x033e }
            X.9DG r1 = (X.AnonymousClass9DG) r1     // Catch:{ Exception -> 0x033e }
            if (r1 == 0) goto L_0x0206
            r1 = 4
            X.B9c[] r3 = new X.C22470B9c[r1]     // Catch:{ Exception -> 0x033e }
            r1 = 15
            X.C21282AhT.A00(r3, r1, r9, r5)     // Catch:{ Exception -> 0x033e }
            r1 = 16
            X.C21282AhT.A00(r3, r1, r8, r5)     // Catch:{ Exception -> 0x033e }
            r1 = 17
            X.C21282AhT.A00(r3, r1, r7, r5)     // Catch:{ Exception -> 0x033e }
            r1 = 18
            X.AhT r2 = new X.AhT     // Catch:{ Exception -> 0x033e }
            r2.<init>(r5, r1)     // Catch:{ Exception -> 0x033e }
            r1 = 3
            java.util.List r3 = X.C18070vi.A0O(r2, r3, r1)     // Catch:{ Exception -> 0x033e }
            java.lang.String[] r2 = X.AnonymousClass8BS.A1b(r8, r9)     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = "IQErrorPNOTPStale|IQErrorPNOTPGuessTooRecent|IQErrorInternalServerError|IQErrorForbidden"
            java.lang.Object r3 = r4.A06(r6, r1, r3, r2)     // Catch:{ Exception -> 0x033e }
            if (r3 == 0) goto L_0x0201
            X.B6A r3 = (X.B6A) r3     // Catch:{ Exception -> 0x033e }
            java.lang.Integer r1 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x033e }
            X.9hy r4 = new X.9hy     // Catch:{ Exception -> 0x033e }
            r4.<init>(r1)     // Catch:{ Exception -> 0x033e }
            boolean r1 = r3 instanceof X.AnonymousClass9DU     // Catch:{ Exception -> 0x033e }
            if (r1 == 0) goto L_0x01e6
            r2 = r3
            X.9DU r2 = (X.AnonymousClass9DU) r2     // Catch:{ Exception -> 0x033e }
            int r1 = r2.A00     // Catch:{ Exception -> 0x033e }
            if (r1 != r8) goto L_0x01d1
            java.lang.Integer r1 = X.AnonymousClass00R.A19     // Catch:{ Exception -> 0x033e }
            r4.A07 = r1     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorPNOTPStaleMixin"
            X.C18070vi.A0z(r3, r1)     // Catch:{ Exception -> 0x033e }
            java.lang.Object r1 = r2.A01     // Catch:{ Exception -> 0x033e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x033e }
            r4.A0C = r1     // Catch:{ Exception -> 0x033e }
            goto L_0x034b
        L_0x01d1:
            java.lang.Integer r1 = X.AnonymousClass00R.A15     // Catch:{ Exception -> 0x033e }
            r4.A07 = r1     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorPNOTPGuessTooRecentMixin"
            X.C18070vi.A0z(r3, r1)     // Catch:{ Exception -> 0x033e }
            java.lang.Object r1 = r2.A01     // Catch:{ Exception -> 0x033e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x033e }
            r4.A0C = r1     // Catch:{ Exception -> 0x033e }
            goto L_0x034b
        L_0x01e6:
            boolean r1 = r3 instanceof X.AnonymousClass9DR     // Catch:{ Exception -> 0x033e }
            if (r1 == 0) goto L_0x01fc
            X.9DR r3 = (X.AnonymousClass9DR) r3     // Catch:{ Exception -> 0x033e }
            int r1 = r3.A00     // Catch:{ Exception -> 0x033e }
            if (r1 != r9) goto L_0x01f6
            java.lang.Integer r1 = X.AnonymousClass00R.A03     // Catch:{ Exception -> 0x033e }
            r4.A07 = r1     // Catch:{ Exception -> 0x033e }
            goto L_0x034b
        L_0x01f6:
            java.lang.Integer r1 = X.AnonymousClass00R.A02     // Catch:{ Exception -> 0x033e }
            r4.A07 = r1     // Catch:{ Exception -> 0x033e }
            goto L_0x034b
        L_0x01fc:
            X.3EW r1 = X.AnonymousClass3MW.A14()     // Catch:{ Exception -> 0x033e }
            goto L_0x020f
        L_0x0201:
            X.1UI r1 = X.AnonymousClass1O9.A00(r4)     // Catch:{ Exception -> 0x033e }
            goto L_0x020f
        L_0x0206:
            X.1UI r1 = X.AnonymousClass1O9.A00(r4)     // Catch:{ Exception -> 0x033e }
            goto L_0x020f
        L_0x020b:
            X.1UI r1 = X.AnonymousClass1O9.A00(r12)     // Catch:{ Exception -> 0x033e }
        L_0x020f:
            throw r1     // Catch:{ Exception -> 0x033e }
        L_0x0210:
            if (r11 == 0) goto L_0x0266
            X.A98 r1 = r10.A02     // Catch:{ Exception -> 0x039f }
            if (r4 == 0) goto L_0x0261
            boolean r10 = X.AnonymousClass8BX.A1U(r2, r3, r13)     // Catch:{ Exception -> 0x039f }
            r5 = 7
            X.C18070vi.A0d(r8, r5)     // Catch:{ Exception -> 0x039f }
            boolean r5 = r1.A0T()     // Catch:{ Exception -> 0x039f }
            if (r5 != 0) goto L_0x022d
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ Exception -> 0x039f }
            X.9hy r4 = new X.9hy     // Catch:{ Exception -> 0x039f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x039f }
            goto L_0x034b
        L_0x022d:
            r1.A0S(r10)     // Catch:{ Exception -> 0x039f }
            byte[] r25 = r1.A0V(r2, r3)     // Catch:{ Exception -> 0x039f }
            java.lang.String r5 = "verifyCodeForStandaloneVerification"
            byte[] r26 = r1.A0U(r5)     // Catch:{ Exception -> 0x039f }
            java.util.LinkedHashMap r24 = X.A98.A01(r7, r1, r8, r6, r9)     // Catch:{ Exception -> 0x039f }
            X.A7d r18 = X.A98.A00(r1)     // Catch:{ Exception -> 0x039f }
            java.util.List r23 = X.A98.A04(r1)     // Catch:{ Exception -> 0x039f }
            X.2bP r1 = r1.A09     // Catch:{ Exception -> 0x039f }
            r27 = 2
            X.9CJ r16 = new X.9CJ     // Catch:{ Exception -> 0x039f }
            r17 = r1
            r19 = r13
            r20 = r2
            r21 = r3
            r22 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x039f }
            java.lang.Object r4 = X.C19951A0i.A00(r16)     // Catch:{ Exception -> 0x039f }
            X.9hy r4 = (X.C188779hy) r4     // Catch:{ Exception -> 0x039f }
            goto L_0x032f
        L_0x0261:
            java.lang.IllegalStateException r1 = X.C17880vN.A0g()     // Catch:{ Exception -> 0x039f }
            throw r1     // Catch:{ Exception -> 0x039f }
        L_0x0266:
            java.lang.String r11 = "autoconf"
            boolean r11 = X.C18070vi.A18(r0, r11)     // Catch:{ Exception -> 0x039f }
            r24 = 0
            if (r11 == 0) goto L_0x0288
            X.Ct9 r1 = r10.A03     // Catch:{ Exception -> 0x039f }
            byte[] r1 = r1.A04(r5)     // Catch:{ Exception -> 0x039f }
            if (r1 == 0) goto L_0x027b
            int r5 = r1.length     // Catch:{ Exception -> 0x039f }
            if (r5 != 0) goto L_0x0288
        L_0x027b:
            java.lang.String r1 = "VerifyCodeTask/doInBackground/no valid authResponse, skip sending autoconf verification request"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x039f }
            java.lang.Integer r1 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x039f }
            X.9hy r4 = new X.9hy     // Catch:{ Exception -> 0x039f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x039f }
            return r4
        L_0x0288:
            X.A98 r5 = r10.A02     // Catch:{ Exception -> 0x039f }
            int r10 = r0.hashCode()     // Catch:{ Exception -> 0x039f }
            switch(r10) {
                case -1423466756: goto L_0x02a9;
                case -792038226: goto L_0x02b2;
                case 431173620: goto L_0x02bb;
                case 601452370: goto L_0x02c4;
                case 1247787042: goto L_0x02cd;
                default: goto L_0x0291;
            }     // Catch:{ Exception -> 0x039f }
        L_0x0291:
            boolean r11 = X.AnonymousClass8BX.A1U(r2, r3, r13)     // Catch:{ Exception -> 0x039f }
            r10 = 9
            X.C18070vi.A0d(r8, r10)     // Catch:{ Exception -> 0x039f }
            boolean r10 = r5.A0T()     // Catch:{ Exception -> 0x039f }
            if (r10 != 0) goto L_0x02d8
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ Exception -> 0x039f }
            X.9hy r4 = new X.9hy     // Catch:{ Exception -> 0x039f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x039f }
            goto L_0x034b
        L_0x02a9:
            java.lang.String r10 = "acc_tr"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x039f }
            if (r10 != 0) goto L_0x02d5
            goto L_0x0291
        L_0x02b2:
            java.lang.String r10 = "passkey"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x039f }
            if (r10 != 0) goto L_0x02d5
            goto L_0x0291
        L_0x02bb:
            java.lang.String r10 = "oauth_email"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x039f }
            if (r10 != 0) goto L_0x02d5
            goto L_0x0291
        L_0x02c4:
            java.lang.String r10 = "silent_auth"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x039f }
            if (r10 != 0) goto L_0x02d5
            goto L_0x0291
        L_0x02cd:
            java.lang.String r10 = "send_sms"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x039f }
            if (r10 == 0) goto L_0x0291
        L_0x02d5:
            r24 = r0
            goto L_0x0291
        L_0x02d8:
            r5.A0S(r11)     // Catch:{ Exception -> 0x039f }
            byte[] r27 = r5.A0V(r2, r3)     // Catch:{ Exception -> 0x039f }
            java.lang.String r10 = "verifyCode"
            byte[] r28 = r5.A0U(r10)     // Catch:{ Exception -> 0x039f }
            java.util.LinkedHashMap r6 = X.A98.A01(r7, r5, r8, r6, r9)     // Catch:{ Exception -> 0x039f }
            X.A98.A0B(r5, r6)     // Catch:{ Exception -> 0x039f }
            X.A98.A08(r5, r6)     // Catch:{ Exception -> 0x039f }
            X.A98.A0A(r5, r6)     // Catch:{ Exception -> 0x039f }
            X.A98.A07(r5, r6)     // Catch:{ Exception -> 0x039f }
            r5.A0R(r6)     // Catch:{ Exception -> 0x039f }
            X.A98.A0C(r5, r6)     // Catch:{ Exception -> 0x039f }
            X.00H r7 = r5.A0B     // Catch:{ Exception -> 0x039f }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x039f }
            X.2jJ r7 = (X.C57582jJ) r7     // Catch:{ Exception -> 0x039f }
            r7.A00()     // Catch:{ Exception -> 0x039f }
            X.A7d r18 = X.A98.A00(r5)     // Catch:{ Exception -> 0x039f }
            java.lang.String r7 = "register_entrypoint"
            java.lang.String r22 = r5.A0P(r2, r7)     // Catch:{ Exception -> 0x039f }
            java.util.List r25 = X.A98.A04(r5)     // Catch:{ Exception -> 0x039f }
            X.2bP r5 = r5.A09     // Catch:{ Exception -> 0x039f }
            X.9CN r16 = new X.9CN     // Catch:{ Exception -> 0x039f }
            r20 = r2
            r21 = r3
            r23 = r4
            r26 = r6
            r29 = r1
            r17 = r5
            r19 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x039f }
            java.lang.Object r4 = X.C19951A0i.A00(r16)     // Catch:{ Exception -> 0x039f }
            X.9hy r4 = (X.C188779hy) r4     // Catch:{ Exception -> 0x039f }
        L_0x032f:
            if (r4 != 0) goto L_0x034b
            java.lang.String r1 = "VerifyCodeRepository/doInBackground/null verifyCodeResult"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x039f }
            java.lang.Integer r1 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x039f }
            X.9hy r4 = new X.9hy     // Catch:{ Exception -> 0x039f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x039f }
            return r4
        L_0x033e:
            r2 = move-exception
            java.lang.String r1 = "EmailVerificationXmppMethods failed sending verify IQ"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ Exception -> 0x039f }
            java.lang.Integer r1 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x039f }
            X.9hy r4 = new X.9hy     // Catch:{ Exception -> 0x039f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x039f }
        L_0x034b:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x039f }
            java.lang.String r1 = "VerifyCodeRepository/register entrypoint response/autoconfType="
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            int r1 = r4.A00     // Catch:{ Exception -> 0x039f }
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            java.lang.String r1 = "/secureVerifier="
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            boolean r1 = r4.A0I     // Catch:{ Exception -> 0x039f }
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            java.lang.String r1 = "/resetMethod="
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            java.lang.String r1 = r4.A0B     // Catch:{ Exception -> 0x039f }
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            java.lang.String r1 = "/wipeWait="
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            long r1 = r4.A03     // Catch:{ Exception -> 0x039f }
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            java.lang.String r1 = "/smsWait="
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            long r1 = r4.A01     // Catch:{ Exception -> 0x039f }
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            java.lang.String r1 = ";voiceWait="
            r3.append(r1)     // Catch:{ Exception -> 0x039f }
            long r1 = r4.A02     // Catch:{ Exception -> 0x039f }
            X.C17890vO.A16(r3, r1)     // Catch:{ Exception -> 0x039f }
            r15.A1c(r13)     // Catch:{ Exception -> 0x039f }
            int r1 = r4.A00     // Catch:{ Exception -> 0x039f }
            r15.A18(r1)     // Catch:{ Exception -> 0x039f }
            boolean r3 = r4.A0I     // Catch:{ Exception -> 0x039f }
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass8BV.A06(r30)     // Catch:{ Exception -> 0x039f }
            java.lang.String r1 = "pref_autoconf_secure_verifier"
            X.C17880vN.A1F(r2, r1, r3)     // Catch:{ Exception -> 0x039f }
            return r4
        L_0x039f:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "VerifyCodeRepository/"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "/error "
            X.C108985cd.A1M(r0, r2, r3)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.9hy r4 = new X.9hy
            r4.<init>(r0)
            return r4
        L_0x03b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.task.VerifyCodeRepository$verify$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VerifyCodeRepository$verify$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
