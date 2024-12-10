package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass1OS;
import X.AnonymousClass705;
import X.C1418477e;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C34891lF;
import java.security.cert.X509Certificate;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C1418477e $fbId;
    public final /* synthetic */ C1418477e $nonce;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2(AnonymousClass705 r2, C1418477e r3, C1418477e r4, C34891lF r5, X509Certificate x509Certificate, C30391dr r7) {
        super(2, r7);
        this.this$0 = r5;
        this.$nonce = r3;
        this.$encryptionCert = x509Certificate;
        this.$fbId = r4;
        this.$operationRetryState = r2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C34891lF r4 = this.this$0;
        C1418477e r2 = this.$nonce;
        X509Certificate x509Certificate = this.$encryptionCert;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2(this.$operationRetryState, r2, this.$fbId, r4, x509Certificate, r9);
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.2eQ, X.6Od] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r2 = r21
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            r1 = r20
            int r0 = r1.label
            r10 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r10) goto L_0x011b
            X.C30691eM.A01(r2)
        L_0x0010:
            return r2
        L_0x0011:
            X.C30691eM.A01(r2)
            X.1lF r4 = r1.this$0
            X.77e r9 = r1.$nonce
            java.security.cert.X509Certificate r8 = r1.$encryptionCert
            X.77e r3 = r1.$fbId
            X.705 r5 = r1.$operationRetryState
            r1.L$0 = r4
            r1.L$1 = r9
            r1.L$2 = r8
            r1.L$3 = r3
            r1.L$4 = r5
            r1.label = r10
            X.1g7 r6 = X.C72473Md.A0m(r1)
            r2 = 0
            java.security.KeyPair r12 = X.C20059A5i.A02()     // Catch:{ NoSuchAlgorithmException -> 0x0104 }
            java.lang.String r14 = X.C108985cd.A0p(r12)
            org.json.JSONObject r13 = X.C17880vN.A15()     // Catch:{  }
            java.lang.String r0 = "version"
            r13.put(r0, r10)     // Catch:{  }
            java.lang.String r15 = "timestamp"
            X.11P r11 = r4.A00     // Catch:{  }
            long r0 = X.AnonymousClass11P.A01(r11)     // Catch:{  }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r16
            r13.put(r15, r0)     // Catch:{  }
            java.lang.String r1 = "nonce"
            java.lang.Object r0 = r9.A00     // Catch:{  }
            r13.put(r1, r0)     // Catch:{  }
            X.C108985cd.A1J(r14, r13)     // Catch:{  }
            java.lang.String r1 = r13.toString()     // Catch:{  }
            X.00H r0 = r4.A04     // Catch:{ GeneralSecurityException -> 0x010b }
            X.6h6 r13 = X.C108975cc.A0I(r0, r1, r8)     // Catch:{ GeneralSecurityException -> 0x010b }
            long r0 = X.AnonymousClass11P.A01(r11)     // Catch:{ GeneralSecurityException -> 0x010b }
            long r0 = r0 / r16
            X.6Od r11 = new X.6Od     // Catch:{ GeneralSecurityException -> 0x010b }
            r11.<init>(r13, r3, r0)     // Catch:{ GeneralSecurityException -> 0x010b }
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$sendDataResult$1 r0 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$sendDataResult$1
            r0.<init>(r4, r11, r12, r2)
            X.1OR r11 = X.AnonymousClass1OR.A00
            java.lang.Object r1 = X.AnonymousClass4GT.A00(r11, r0)
            X.6U6 r1 = (X.AnonymousClass6U6) r1
            boolean r0 = r1 instanceof X.AnonymousClass6OB
            if (r0 == 0) goto L_0x00a0
            r0 = r1
            X.6OB r0 = (X.AnonymousClass6OB) r0
            java.lang.Exception r12 = r0.A00
            boolean r0 = r12 instanceof X.C122936Sm
            if (r0 == 0) goto L_0x010c
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$1 r12 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$1
            r17 = r1
            r18 = r8
            r19 = r2
            r15 = r3
            r16 = r4
            r13 = r5
            r14 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r11, r12)
            r6.resumeWith(r0)
            goto L_0x0114
        L_0x00a0:
            boolean r0 = r1 instanceof X.AnonymousClass6O9
            if (r0 == 0) goto L_0x00a9
            X.6OB r1 = (X.AnonymousClass6OB) r1
            java.lang.Exception r12 = r1.A00
            goto L_0x010c
        L_0x00a9:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.waffle.coroutine.AwaitResult.Success<kotlin.Pair<org.json.JSONObject?, com.whatsapp.protocol.ProtocolTreeNode>>"
            X.C18070vi.A0z(r1, r0)
            X.6OA r1 = (X.AnonymousClass6OA) r1
            java.lang.Object r0 = r1.A00
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r11 = r0.first
            org.json.JSONObject r11 = (org.json.JSONObject) r11
            X.00H r2 = r4.A05
            r2.get()
            if (r11 == 0) goto L_0x0120
            org.json.JSONObject r1 = X.C108985cd.A0v(r11)
            java.lang.String r0 = "access_token"
            java.lang.String r9 = r1.getString(r0)
            X.C18070vi.A0X(r9)
            java.lang.Object r8 = r3.A00
            X.C17960vV.A07(r8)
            r5 = r8
            java.lang.Number r5 = (java.lang.Number) r5
            long r3 = r5.longValue()
            r2.get()
            org.json.JSONObject r1 = X.C108985cd.A0v(r11)
            java.lang.String r0 = "fbid"
            long r1 = r1.getLong(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "ids do not match"
            java.lang.IllegalStateException r12 = X.AnonymousClass000.A0n(r0)
            goto L_0x010c
        L_0x00f0:
            X.C17960vV.A07(r8)
            long r2 = r5.longValue()
            X.1lW r1 = X.C35021lW.A09
            X.6p7 r0 = new X.6p7
            r0.<init>(r1, r9, r2)
            X.6OA r1 = new X.6OA
            r1.<init>(r0)
            goto L_0x0111
        L_0x0104:
            r0 = move-exception
            X.6OB r1 = new X.6OB
            r1.<init>(r0, r10)
            goto L_0x0111
        L_0x010b:
            r12 = move-exception
        L_0x010c:
            X.6OB r1 = new X.6OB
            r1.<init>(r12, r10)
        L_0x0111:
            r6.resumeWith(r1)
        L_0x0114:
            java.lang.Object r2 = r6.A0C()
            if (r2 != r7) goto L_0x0010
            return r7
        L_0x011b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0120:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
