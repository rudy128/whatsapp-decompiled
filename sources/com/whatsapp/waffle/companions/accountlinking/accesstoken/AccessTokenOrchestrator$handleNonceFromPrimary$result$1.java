package com.whatsapp.waffle.companions.accountlinking.accesstoken;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6OA;
import X.AnonymousClass6U6;
import X.AnonymousClass705;
import X.C124546Yt;
import X.C1418477e;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C34891lF;
import X.C34901lG;
import com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2;
import java.security.cert.X509Certificate;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.accesstoken.AccessTokenOrchestrator$handleNonceFromPrimary$result$1", f = "AccessTokenOrchestrator.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
public final class AccessTokenOrchestrator$handleNonceFromPrimary$result$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6U6 $certFetchResult;
    public final /* synthetic */ C1418477e $nonce;
    public final /* synthetic */ C1418477e $waEntFbid;
    public int label;
    public final /* synthetic */ C34901lG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessTokenOrchestrator$handleNonceFromPrimary$result$1(C1418477e r2, C1418477e r3, C34901lG r4, AnonymousClass6U6 r5, C30391dr r6) {
        super(2, r6);
        this.this$0 = r4;
        this.$nonce = r2;
        this.$waEntFbid = r3;
        this.$certFetchResult = r5;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new AccessTokenOrchestrator$handleNonceFromPrimary$result$1(this.$nonce, this.$waEntFbid, this.this$0, this.$certFetchResult, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34891lF r7 = this.this$0.A05;
            AnonymousClass705 r4 = C124546Yt.A00;
            this.label = 1;
            obj = C30451dy.A00(this, r7.A08, new AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2(r4, this.$nonce, this.$waEntFbid, r7, (X509Certificate) ((AnonymousClass6OA) this.$certFetchResult).A00, (C30391dr) null));
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
        return ((AccessTokenOrchestrator$handleNonceFromPrimary$result$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
