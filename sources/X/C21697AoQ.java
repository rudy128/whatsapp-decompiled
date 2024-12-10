package X;

import com.whatsapp.group.GetSubgroupsManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.GetSubgroupsManager", f = "GetSubgroupsManager.kt", i = {0, 0, 0}, l = {228}, m = "enhanceSubgroupDataWithMemberCountFromMex", n = {"this", "parentGroupJid", "subgroupsToBeUpdated"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.AoQ  reason: case insensitive filesystem */
public final class C21697AoQ extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSubgroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21697AoQ(GetSubgroupsManager getSubgroupsManager, C30391dr r2) {
        super(r2);
        this.this$0 = getSubgroupsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GetSubgroupsManager.A01(this.this$0, (AnonymousClass1EC) null, (AnonymousClass1EC) null, (List) null, this);
    }
}
