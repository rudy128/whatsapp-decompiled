package X;

import com.whatsapp.group.GetSubgroupsManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.GetSubgroupsManager", f = "GetSubgroupsManager.kt", i = {0, 0, 0, 1, 1, 1}, l = {102, 106}, m = "getSubgroupsWithMex", n = {"this", "parentGroupJid", "participatingSubgroupJid", "this", "parentGroupJid", "fetchedSubgroupsWithMetadata"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* renamed from: X.AoR  reason: case insensitive filesystem */
public final class C21698AoR extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSubgroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21698AoR(GetSubgroupsManager getSubgroupsManager, C30391dr r2) {
        super(r2);
        this.this$0 = getSubgroupsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GetSubgroupsManager.A02(this.this$0, (AnonymousClass1EC) null, (AnonymousClass1EC) null, this);
    }
}
