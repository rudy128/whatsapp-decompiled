package X;

import com.whatsapp.community.mex.GetSubgroupsGraphQlHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.mex.GetSubgroupsGraphQlHandler", f = "GetSubgroupsGraphQlHandler.kt", i = {}, l = {46}, m = "fetch", n = {}, s = {})
/* renamed from: X.AnZ  reason: case insensitive filesystem */
public final class C21644AnZ extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSubgroupsGraphQlHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21644AnZ(GetSubgroupsGraphQlHandler getSubgroupsGraphQlHandler, C30391dr r2) {
        super(r2);
        this.this$0 = getSubgroupsGraphQlHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass1EC) null, (AnonymousClass1EC) null, this);
    }
}
