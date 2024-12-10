package X;

import com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService", f = "BaseCoroutineGraphQLRequestService.kt", i = {0, 0, 1, 1}, l = {123, 126, 130}, m = "startSendingProcess", n = {"this", "block", "this", "block"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.Ao7  reason: case insensitive filesystem */
public final class C21678Ao7 extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BaseCoroutineGraphQLRequestService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21678Ao7(BaseCoroutineGraphQLRequestService baseCoroutineGraphQLRequestService, C30391dr r2) {
        super(r2);
        this.this$0 = baseCoroutineGraphQLRequestService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02(this, (C36001nB) null);
    }
}
