package com.whatsapp.waffle.accountlinking.clientcache.graphql;

import X.AnonymousClass000;
import X.AnonymousClass163;
import X.AnonymousClass1OS;
import X.AnonymousClass67A;
import X.AnonymousClass67F;
import X.AnonymousClass6O2;
import X.AnonymousClass6TR;
import X.AnonymousClass705;
import X.AnonymousClass7RO;
import X.C146397Oy;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C34981lR;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher$postRequest$2", f = "WaffleCacheDataFetcher.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
public final class WaffleCacheDataFetcher$postRequest$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6O2 $request;
    public final /* synthetic */ AnonymousClass6TR $result;
    public final /* synthetic */ AnonymousClass705 $retryState;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ WaffleCacheDataFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaffleCacheDataFetcher$postRequest$2(AnonymousClass705 r2, AnonymousClass6TR r3, WaffleCacheDataFetcher waffleCacheDataFetcher, AnonymousClass6O2 r5, C30391dr r6) {
        super(2, r6);
        this.this$0 = waffleCacheDataFetcher;
        this.$result = r3;
        this.$retryState = r2;
        this.$request = r5;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        WaffleCacheDataFetcher waffleCacheDataFetcher = this.this$0;
        return new WaffleCacheDataFetcher$postRequest$2(this.$retryState, this.$result, waffleCacheDataFetcher, this.$request, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            WaffleCacheDataFetcher waffleCacheDataFetcher = this.this$0;
            AnonymousClass6TR r0 = this.$result;
            AnonymousClass705 r6 = this.$retryState;
            AnonymousClass6O2 r1 = this.$request;
            this.L$0 = waffleCacheDataFetcher;
            this.L$1 = r0;
            this.L$2 = r6;
            this.L$3 = r1;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            C34981lR r4 = waffleCacheDataFetcher.A02;
            if (r4 != null) {
                AnonymousClass163 r3 = ((AnonymousClass67F) r0).A00.A04;
                C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.waffle.utils.graphql.WaffleGraphqlErrorProcessor");
                AnonymousClass7RO r2 = new AnonymousClass7RO(r1, r6, waffleCacheDataFetcher, 42);
                r4.A00(r6, new C146397Oy(A0m, 0), (AnonymousClass67A) r3, r2);
                obj = A0m.A0C();
                if (obj == r8) {
                    return r8;
                }
            } else {
                C18070vi.A11("waffleGraphqlErrorHandler");
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
        return ((WaffleCacheDataFetcher$postRequest$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
