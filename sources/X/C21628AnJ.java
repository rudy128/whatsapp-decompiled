package X;

import com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper", f = "GetSubgroupsProtocolHelper.kt", i = {}, l = {64}, m = "sendGetSubgroupsRequest-0E7RQCE", n = {}, s = {})
/* renamed from: X.AnJ  reason: case insensitive filesystem */
public final class C21628AnJ extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSubgroupsProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21628AnJ(GetSubgroupsProtocolHelper getSubgroupsProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = getSubgroupsProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A01((AnonymousClass1EC) null, (AnonymousClass1EC) null, this));
    }
}
