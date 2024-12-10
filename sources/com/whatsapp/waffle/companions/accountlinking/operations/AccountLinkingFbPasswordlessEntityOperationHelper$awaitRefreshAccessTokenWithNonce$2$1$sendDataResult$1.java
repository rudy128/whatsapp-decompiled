package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass878;
import X.C122206Od;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C34891lF;
import java.security.KeyPair;
import java.security.PrivateKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$sendDataResult$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$sendDataResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122206Od $data;
    public final /* synthetic */ KeyPair $keyPair;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$sendDataResult$1(C34891lF r2, C122206Od r3, KeyPair keyPair, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$keyPair = keyPair;
        this.$data = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$sendDataResult$1(this.this$0, this.$data, this.$keyPair, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34891lF r5 = this.this$0;
            PrivateKey privateKey = this.$keyPair.getPrivate();
            C122206Od r6 = this.$data;
            this.label = 1;
            obj = C30451dy.A00(this, r5.A08, new AccountLinkingFbPasswordlessEntityOperationHelper$sendData$2((AnonymousClass878) C18070vi.A0E(r5.A06), r5, r6, privateKey, (C30391dr) null, 46));
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$sendDataResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
