package com.whatsapp.xfamily.accountlinking.ui;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity$handleRedirectUriDeepLink$4$result$1", f = "AccountLinkingWebAuthActivity.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingWebAuthActivity$handleRedirectUriDeepLink$4$result$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $authBlob;
    public int label;
    public final /* synthetic */ AccountLinkingWebAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingWebAuthActivity$handleRedirectUriDeepLink$4$result$1(AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = accountLinkingWebAuthActivity;
        this.$authBlob = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AccountLinkingWebAuthActivity$handleRedirectUriDeepLink$4$result$1(this.this$0, this.$authBlob, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass00H r0 = this.this$0.A03;
            if (r0 != null) {
                WebAuthAccessTokenFetcher webAuthAccessTokenFetcher = (WebAuthAccessTokenFetcher) r0.get();
                AnonymousClass1D6 r02 = this.this$0.A07;
                if (r02 != null) {
                    String str = this.$authBlob;
                    this.label = 1;
                    obj = webAuthAccessTokenFetcher.A00((String) r02.first, str, this);
                    if (obj == r4) {
                        return r4;
                    }
                } else {
                    throw C17880vN.A0g();
                }
            } else {
                C18070vi.A11("webAuthAccessTokenFetcher");
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingWebAuthActivity$handleRedirectUriDeepLink$4$result$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
