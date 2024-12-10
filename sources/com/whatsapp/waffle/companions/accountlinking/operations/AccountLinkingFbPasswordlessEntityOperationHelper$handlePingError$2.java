package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass1OS;
import X.AnonymousClass6p7;
import X.AnonymousClass705;
import X.C122936Sm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C34891lF;
import java.security.cert.X509Certificate;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122936Sm $e;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ AnonymousClass6p7 $user;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2(AnonymousClass6p7 r2, AnonymousClass705 r3, C122936Sm r4, C34891lF r5, X509Certificate x509Certificate, C30391dr r7) {
        super(2, r7);
        this.$e = r4;
        this.this$0 = r5;
        this.$user = r2;
        this.$operationRetryState = r3;
        this.$encryptionCert = x509Certificate;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2(this.$user, this.$operationRetryState, this.$e, this.this$0, this.$encryptionCert, r9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        if (r0 != false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r2 = r21
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            r1 = r20
            int r0 = r1.label
            r9 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r9) goto L_0x00d5
            X.C30691eM.A01(r2)
        L_0x0010:
            return r2
        L_0x0011:
            X.C30691eM.A01(r2)
            X.6Sm r7 = r1.$e
            X.1lF r10 = r1.this$0
            X.6p7 r6 = r1.$user
            X.705 r5 = r1.$operationRetryState
            java.security.cert.X509Certificate r4 = r1.$encryptionCert
            r1.L$0 = r7
            r1.L$1 = r10
            r1.L$2 = r6
            r1.L$3 = r5
            r1.L$4 = r4
            r1.label = r9
            X.1g7 r3 = X.C72473Md.A0m(r1)
            int r2 = X.C122936Sm.A00(r7)
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 != r0) goto L_0x0076
            X.1lD r13 = r10.A03
            X.0vl r12 = r13.A02
            android.content.SharedPreferences r0 = X.C18070vi.A03(r12)
            java.lang.String r11 = "pref_ping_one_time_delay_for_server_error"
            boolean r0 = X.C17880vN.A1W(r0, r11)
            if (r0 != 0) goto L_0x0076
            X.0ve r14 = r10.A01
            r1 = 2042(0x7fa, float:2.861E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r14, r1)
            long r0 = (long) r0
            r15 = 0
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x0076
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            long r0 = r2.toSeconds(r0)
            r13.A00(r0)
            android.content.SharedPreferences$Editor r0 = X.C108995ce.A0E(r12)
            X.C17880vN.A1F(r0, r11, r9)
            X.6OA r1 = new X.6OA
            r1.<init>(r6)
        L_0x006c:
            r3.resumeWith(r1)
            java.lang.Object r2 = r3.A0C()
            if (r2 != r8) goto L_0x0010
            return r8
        L_0x0076:
            r18 = 0
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$errorHandlerResult$1 r12 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$errorHandlerResult$1
            r19 = r2
            r17 = r4
            r16 = r10
            r15 = r7
            r14 = r5
            r13 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.1OR r11 = X.AnonymousClass1OR.A00
            java.lang.Object r1 = X.AnonymousClass4GT.A00(r11, r12)
            X.6U6 r1 = (X.AnonymousClass6U6) r1
            boolean r0 = r1 instanceof X.AnonymousClass6OA
            if (r0 != 0) goto L_0x006c
            boolean r0 = r1 instanceof X.AnonymousClass6OB
            if (r0 == 0) goto L_0x009e
            r0 = r1
            X.6OB r0 = (X.AnonymousClass6OB) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x009e
            goto L_0x006c
        L_0x009e:
            r0 = 401(0x191, float:5.62E-43)
            r1 = 2
            if (r2 == r0) goto L_0x00c4
            r0 = 480(0x1e0, float:6.73E-43)
            if (r2 == r0) goto L_0x00b4
            r0 = 484(0x1e4, float:6.78E-43)
            if (r2 == r0) goto L_0x00ca
            X.C109005cf.A0H(r2)
            X.6OB r1 = new X.6OB
            r1.<init>(r7, r9)
            goto L_0x006c
        L_0x00b4:
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$1 r0 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$1
            r12 = r0
            r15 = r10
            r16 = r4
            r17 = r18
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Object r1 = X.AnonymousClass4GT.A00(r11, r0)
            goto L_0x006c
        L_0x00c4:
            X.6OS r0 = new X.6OS
            r0.<init>(r7)
            goto L_0x00cf
        L_0x00ca:
            X.6OR r0 = new X.6OR
            r0.<init>(r1, r7)
        L_0x00cf:
            X.6OB r1 = new X.6OB
            r1.<init>(r0, r9)
            goto L_0x006c
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
