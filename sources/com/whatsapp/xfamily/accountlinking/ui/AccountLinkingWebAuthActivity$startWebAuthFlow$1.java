package com.whatsapp.xfamily.accountlinking.ui;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass6O9;
import X.AnonymousClass6OA;
import X.AnonymousClass6OB;
import X.AnonymousClass6U6;
import X.AnonymousClass6YJ;
import X.C122946Sn;
import X.C133616p4;
import X.C18070vi;
import X.C21357Aim;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthT1T2TokensFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity$startWebAuthFlow$1", f = "AccountLinkingWebAuthActivity.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingWebAuthActivity$startWebAuthFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C133616p4 $delayedProgressSpinner;
    public int label;
    public final /* synthetic */ AccountLinkingWebAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingWebAuthActivity$startWebAuthFlow$1(AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, C133616p4 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = accountLinkingWebAuthActivity;
        this.$delayedProgressSpinner = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AccountLinkingWebAuthActivity$startWebAuthFlow$1(this.this$0, this.$delayedProgressSpinner, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass00H r0 = this.this$0.A05;
            if (r0 != null) {
                this.label = 1;
                obj = ((WebAuthT1T2TokensFetcher) r0.get()).A00(this);
                if (obj == r2) {
                    return r2;
                }
            } else {
                C18070vi.A11("webAuthT1T2TokensFetcher");
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass6U6 r6 = (AnonymousClass6U6) obj;
        if (r6 instanceof AnonymousClass6OA) {
            AnonymousClass1D6 r02 = (AnonymousClass1D6) ((AnonymousClass6OA) r6).A00;
            Object obj2 = r02.first;
            Object obj3 = r02.second;
            this.this$0.A07 = AnonymousClass1D6.A01(obj2, obj3);
            this.$delayedProgressSpinner.A00();
            AccountLinkingWebAuthActivity accountLinkingWebAuthActivity = this.this$0;
            accountLinkingWebAuthActivity.A05.CGP(new C21357Aim(this.$delayedProgressSpinner, accountLinkingWebAuthActivity, 0));
        } else if ((r6 instanceof AnonymousClass6OB) || (r6 instanceof AnonymousClass6O9)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AccountLinkingWebAuthActivity/onCreate/WebAuthTokenFetcher onError: ");
            C18070vi.A0z(r6, "null cannot be cast to non-null type com.whatsapp.waffle.coroutine.AwaitResult.Error<kotlin.Pair<kotlin.String, kotlin.String>>");
            AnonymousClass6YJ.A00(AnonymousClass000.A0y(((AnonymousClass6OB) r6).A00.getMessage(), A10), (Throwable) null);
            this.$delayedProgressSpinner.A00();
            AccountLinkingWebAuthActivity.A03((C122946Sn) null, this.this$0, (C133616p4) null, (Integer) null, (Integer) null);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingWebAuthActivity$startWebAuthFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
