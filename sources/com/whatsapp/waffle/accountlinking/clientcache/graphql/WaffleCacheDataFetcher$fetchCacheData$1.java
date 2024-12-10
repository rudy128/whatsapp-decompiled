package com.whatsapp.waffle.accountlinking.clientcache.graphql;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6O2;
import X.AnonymousClass705;
import X.C20113A7w;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher$fetchCacheData$1", f = "WaffleCacheDataFetcher.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class WaffleCacheDataFetcher$fetchCacheData$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6O2 $request;
    public int label;
    public final /* synthetic */ WaffleCacheDataFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaffleCacheDataFetcher$fetchCacheData$1(WaffleCacheDataFetcher waffleCacheDataFetcher, AnonymousClass6O2 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = waffleCacheDataFetcher;
        this.$request = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new WaffleCacheDataFetcher$fetchCacheData$1(this.this$0, this.$request, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            WaffleCacheDataFetcher waffleCacheDataFetcher = this.this$0;
            AnonymousClass6O2 r4 = this.$request;
            AnonymousClass705 r0 = new AnonymousClass705(3, C20113A7w.A0L);
            this.label = 1;
            obj = WaffleCacheDataFetcher.A00(r0, waffleCacheDataFetcher, r4, this);
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaffleCacheDataFetcher$fetchCacheData$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
