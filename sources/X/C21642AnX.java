package X;

import com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService", f = "CoroutineGetSingleCollectionGraphQLService.kt", i = {0}, l = {70}, m = "sendOnWorker", n = {"this"}, s = {"L$0"})
/* renamed from: X.AnX  reason: case insensitive filesystem */
public final class C21642AnX extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoroutineGetSingleCollectionGraphQLService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21642AnX(CoroutineGetSingleCollectionGraphQLService coroutineGetSingleCollectionGraphQLService, C30391dr r2) {
        super(r2);
        this.this$0 = coroutineGetSingleCollectionGraphQLService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this);
    }
}
