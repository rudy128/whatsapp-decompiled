package X;

import com.whatsapp.community.mex.GetSubgroupMemberCountGraphQlHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.mex.GetSubgroupMemberCountGraphQlHandler", f = "GetSubgroupMemberCountGraphQlHandler.kt", i = {0}, l = {39}, m = "fetch", n = {"this"}, s = {"L$0"})
/* renamed from: X.AnY  reason: case insensitive filesystem */
public final class C21643AnY extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSubgroupMemberCountGraphQlHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21643AnY(GetSubgroupMemberCountGraphQlHandler getSubgroupMemberCountGraphQlHandler, C30391dr r2) {
        super(r2);
        this.this$0 = getSubgroupMemberCountGraphQlHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass1EC) null, (AnonymousClass1EC) null, this);
    }
}
