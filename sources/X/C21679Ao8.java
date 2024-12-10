package X;

import com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService", f = "DCVerifyPostcodeGraphQLService.kt", i = {0, 0, 1}, l = {67, 74}, m = "sendOnWorker", n = {"this", "translatedRequest", "this"}, s = {"L$0", "L$1", "L$0"})
/* renamed from: X.Ao8  reason: case insensitive filesystem */
public final class C21679Ao8 extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DCVerifyPostcodeGraphQLService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21679Ao8(DCVerifyPostcodeGraphQLService dCVerifyPostcodeGraphQLService, C30391dr r2) {
        super(r2);
        this.this$0 = dCVerifyPostcodeGraphQLService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this);
    }
}
