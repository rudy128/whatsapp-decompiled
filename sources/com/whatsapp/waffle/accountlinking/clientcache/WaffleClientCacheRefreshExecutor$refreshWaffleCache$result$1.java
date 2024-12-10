package com.whatsapp.waffle.accountlinking.clientcache;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7F6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34951lN;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.accountlinking.clientcache.WaffleClientCacheRefreshExecutor$refreshWaffleCache$result$1", f = "WaffleClientCacheRefreshExecutor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class WaffleClientCacheRefreshExecutor$refreshWaffleCache$result$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass7F6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaffleClientCacheRefreshExecutor$refreshWaffleCache$result$1(AnonymousClass7F6 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new WaffleClientCacheRefreshExecutor$refreshWaffleCache$result$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new WaffleClientCacheRefreshExecutor$refreshWaffleCache$result$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34951lN r0 = this.this$0.A00;
            this.label = 1;
            obj = C34951lN.A00(r0);
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
}
