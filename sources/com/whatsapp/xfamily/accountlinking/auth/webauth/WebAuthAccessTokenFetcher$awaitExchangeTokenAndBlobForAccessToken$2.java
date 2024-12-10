package com.whatsapp.xfamily.accountlinking.auth.webauth;

import X.AnonymousClass000;
import X.AnonymousClass163;
import X.AnonymousClass1OS;
import X.AnonymousClass6OB;
import X.AnonymousClass705;
import X.C108995ce;
import X.C122846Sd;
import X.C137916wE;
import X.C138506xC;
import X.C146737Qk;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher$awaitExchangeTokenAndBlobForAccessToken$2", f = "WebAuthAccessTokenFetcher.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class WebAuthAccessTokenFetcher$awaitExchangeTokenAndBlobForAccessToken$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C138506xC $response;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ WebAuthAccessTokenFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebAuthAccessTokenFetcher$awaitExchangeTokenAndBlobForAccessToken$2(C138506xC r2, WebAuthAccessTokenFetcher webAuthAccessTokenFetcher, C30391dr r4) {
        super(2, r4);
        this.this$0 = webAuthAccessTokenFetcher;
        this.$response = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new WebAuthAccessTokenFetcher$awaitExchangeTokenAndBlobForAccessToken$2(this.$response, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Long A01;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            WebAuthAccessTokenFetcher webAuthAccessTokenFetcher = this.this$0;
            C138506xC r1 = this.$response;
            this.L$0 = webAuthAccessTokenFetcher;
            this.L$1 = r1;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            C137916wE r8 = (C137916wE) webAuthAccessTokenFetcher.A00.get();
            AnonymousClass163 r7 = r1.A04;
            C18070vi.A0z(r7, "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor");
            AnonymousClass705 r12 = new AnonymousClass705(0, 0);
            C146737Qk r3 = C146737Qk.A00;
            C18070vi.A0e(r7, 0, r3);
            int A05 = C108995ce.A05(r7);
            if (A05 != 3489014 || (A01 = r12.A01()) == null) {
                A0m.resumeWith(new AnonymousClass6OB(new C122846Sd(A05), true));
            } else {
                r8.A00.CGv(r3, A01.longValue());
            }
            obj = A0m.A0C();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WebAuthAccessTokenFetcher$awaitExchangeTokenAndBlobForAccessToken$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
