package X;

import com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher", f = "WaffleCacheDataFetcher.kt", i = {0, 0, 0}, l = {61, 68}, m = "postRequest", n = {"this", "request", "retryState"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.3FU  reason: invalid class name */
public final class AnonymousClass3FU extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WaffleCacheDataFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FU(WaffleCacheDataFetcher waffleCacheDataFetcher, C30391dr r2) {
        super(r2);
        this.this$0 = waffleCacheDataFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WaffleCacheDataFetcher.A00((AnonymousClass705) null, this.this$0, (AnonymousClass6O2) null, this);
    }
}
