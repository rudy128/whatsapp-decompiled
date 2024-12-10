package X;

import com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService", f = "BaseCoroutineGraphQLRequestService.kt", i = {0}, l = {77}, m = "awaitResponseFor", n = {"this"}, s = {"L$0"})
/* renamed from: X.AnW  reason: case insensitive filesystem */
public final class C21641AnW extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BaseCoroutineGraphQLRequestService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21641AnW(BaseCoroutineGraphQLRequestService baseCoroutineGraphQLRequestService, C30391dr r2) {
        super(r2);
        this.this$0 = baseCoroutineGraphQLRequestService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseCoroutineGraphQLRequestService.A00(this.this$0, (AnonymousClass8AB) null, this);
    }
}
