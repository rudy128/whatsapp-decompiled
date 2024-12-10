package X;

import com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper", f = "GetSubgroupsProtocolHelper.kt", i = {}, l = {80}, m = "sendGetSubgroupsRequest-BWLJW6A", n = {}, s = {})
/* renamed from: X.AnK  reason: case insensitive filesystem */
public final class C21629AnK extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSubgroupsProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21629AnK(GetSubgroupsProtocolHelper getSubgroupsProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = getSubgroupsProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A00((AnonymousClass1EC) null, (AnonymousClass1EC) null, (String) null, this));
    }
}
