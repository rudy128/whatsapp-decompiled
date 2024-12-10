package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass1OS;
import X.AnonymousClass6p7;
import X.AnonymousClass705;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C34891lF;
import java.security.cert.X509Certificate;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ AnonymousClass6p7 $userEntity;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2(AnonymousClass6p7 r2, AnonymousClass705 r3, C34891lF r4, X509Certificate x509Certificate, C30391dr r6) {
        super(2, r6);
        this.this$0 = r4;
        this.$userEntity = r2;
        this.$encryptionCert = x509Certificate;
        this.$operationRetryState = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C34891lF r3 = this.this$0;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2(this.$userEntity, this.$operationRetryState, r3, this.$encryptionCert, r8);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.2eQ, X.6Od] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r2 = r16
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r15.label
            r1 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r1) goto L_0x00fa
            X.C30691eM.A01(r2)
        L_0x000e:
            return r2
        L_0x000f:
            X.C30691eM.A01(r2)
            X.1lF r11 = r15.this$0
            X.6p7 r8 = r15.$userEntity
            java.security.cert.X509Certificate r13 = r15.$encryptionCert
            X.705 r9 = r15.$operationRetryState
            r15.L$0 = r11
            r15.L$1 = r8
            r15.L$2 = r13
            r15.L$3 = r9
            r15.label = r1
            X.1g7 r2 = X.C72473Md.A0m(r15)
            r14 = 0
            X.77e r0 = r8.A01     // Catch:{ JSONException -> 0x00ca }
            java.lang.Object r7 = r0.A00     // Catch:{ JSONException -> 0x00ca }
            X.C17960vV.A07(r7)     // Catch:{ JSONException -> 0x00ca }
            org.json.JSONObject r6 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x00ca }
            java.lang.String r0 = "version"
            r6.put(r0, r1)     // Catch:{ JSONException -> 0x00ca }
            java.lang.String r5 = "timestamp"
            X.11P r4 = r11.A00     // Catch:{ JSONException -> 0x00ca }
            long r0 = X.AnonymousClass11P.A00(r4)     // Catch:{ JSONException -> 0x00ca }
            r6.put(r5, r0)     // Catch:{ JSONException -> 0x00ca }
            java.lang.String r0 = "access_token"
            r6.put(r0, r7)     // Catch:{ JSONException -> 0x00ca }
            java.lang.String r1 = r6.toString()     // Catch:{ JSONException -> 0x00ca }
            X.00H r0 = r11.A04     // Catch:{  }
            X.6h6 r6 = X.C108975cc.A0I(r0, r1, r13)     // Catch:{  }
            long r0 = X.AnonymousClass11P.A00(r4)     // Catch:{  }
            X.77e r5 = r8.A02     // Catch:{  }
            X.6Od r4 = new X.6Od     // Catch:{  }
            r4.<init>(r6, r5, r0)     // Catch:{  }
            X.00H r0 = r11.A07
            java.lang.String r12 = X.C17890vO.A0T(r0)
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$iqResponseResult$1 r0 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$iqResponseResult$1
            r0.<init>(r11, r4, r12, r14)
            X.1OR r1 = X.AnonymousClass1OR.A00
            java.lang.Object r10 = X.AnonymousClass4GT.A00(r1, r0)
            X.9MQ r10 = (X.AnonymousClass9MQ) r10
            boolean r0 = r10 instanceof X.C173548vG
            if (r0 == 0) goto L_0x00d3
            X.8vG r10 = (X.C173548vG) r10     // Catch:{ IllegalStateException -> 0x00ae }
            X.1ca r1 = r10.A00     // Catch:{ IllegalStateException -> 0x00ae }
            java.lang.String r0 = "ping_interval"
            X.1ca r5 = r1.A0K(r0)     // Catch:{ IllegalStateException -> 0x00ae }
            r4 = -1
            int r1 = r1.A0A(r0, r4)     // Catch:{ IllegalStateException -> 0x00ae }
            if (r5 == 0) goto L_0x009c
            java.lang.String r0 = r5.A0M()     // Catch:{ IllegalStateException -> 0x00ae }
            if (r0 == 0) goto L_0x009c
            X.1lD r4 = r11.A03     // Catch:{ IllegalStateException -> 0x00ae }
            java.lang.String r0 = r5.A0M()     // Catch:{ IllegalStateException -> 0x00ae }
            if (r0 == 0) goto L_0x00a2
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ IllegalStateException -> 0x00ae }
        L_0x0098:
            r4.A00(r0)     // Catch:{ IllegalStateException -> 0x00ae }
            goto L_0x00b6
        L_0x009c:
            if (r1 == r4) goto L_0x00a7
            X.1lD r4 = r11.A03     // Catch:{ IllegalStateException -> 0x00ae }
            long r0 = (long) r1     // Catch:{ IllegalStateException -> 0x00ae }
            goto L_0x0098
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ IllegalStateException -> 0x00ae }
            goto L_0x00ad
        L_0x00a7:
            java.lang.String r0 = "ping interval not present"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ IllegalStateException -> 0x00ae }
        L_0x00ad:
            throw r0     // Catch:{ IllegalStateException -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.6OB r0 = X.AnonymousClass6OB.A00(r0)
            r2.resumeWith(r0)
        L_0x00b6:
            X.1lD r0 = r11.A03
            r4 = 0
            X.0vl r0 = r0.A02
            android.content.SharedPreferences$Editor r1 = X.C108995ce.A0E(r0)
            java.lang.String r0 = "pref_ping_one_time_delay_for_server_error"
            X.C17880vN.A1F(r1, r0, r4)
            X.6OA r4 = new X.6OA
            r4.<init>(r8)
            goto L_0x00e0
        L_0x00ca:
            r0 = move-exception
            X.6OB r0 = X.AnonymousClass6OB.A00(r0)
            r2.resumeWith(r0)
            goto L_0x00e3
        L_0x00d3:
            boolean r0 = r10 instanceof X.C173538vF
            if (r0 == 0) goto L_0x00ea
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$1 r7 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r4 = X.AnonymousClass4GT.A00(r1, r7)
        L_0x00e0:
            r2.resumeWith(r4)
        L_0x00e3:
            java.lang.Object r2 = r2.A0C()
            if (r2 != r3) goto L_0x000e
            return r3
        L_0x00ea:
            boolean r0 = r10 instanceof X.C173558vH
            if (r0 == 0) goto L_0x00ff
            java.io.IOException r1 = new java.io.IOException
            r1.<init>()
            r0 = 1
            X.6O9 r4 = new X.6O9
            r4.<init>(r1, r0)
            goto L_0x00e0
        L_0x00fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00ff:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
