package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6p7;
import X.AnonymousClass705;
import X.AnonymousClass9MQ;
import X.C122936Sm;
import X.C173538vF;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C34891lF;
import java.security.cert.X509Certificate;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ AnonymousClass9MQ $iqResponseResult;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ AnonymousClass6p7 $userEntity;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$1(AnonymousClass6p7 r2, AnonymousClass705 r3, AnonymousClass9MQ r4, C34891lF r5, String str, X509Certificate x509Certificate, C30391dr r8) {
        super(2, r8);
        this.this$0 = r5;
        this.$iqId = str;
        this.$iqResponseResult = r4;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$operationRetryState = r3;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        C34891lF r4 = this.this$0;
        String str = this.$iqId;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$1(this.$userEntity, this.$operationRetryState, this.$iqResponseResult, r4, str, this.$encryptionCert, r10);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34891lF r8 = this.this$0;
            C122936Sm r7 = new C122936Sm(((C173538vF) this.$iqResponseResult).A00, this.$iqId);
            X509Certificate x509Certificate = this.$encryptionCert;
            AnonymousClass6p7 r5 = this.$userEntity;
            AnonymousClass705 r6 = this.$operationRetryState;
            this.label = 1;
            obj = C30451dy.A00(this, r8.A08, new AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2(r5, r6, r7, r8, x509Certificate, (C30391dr) null));
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
