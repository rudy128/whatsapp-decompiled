package X;

import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$3", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {0, 0}, l = {422}, m = "emit", n = {"this", "updates"}, s = {"L$0", "L$1"})
/* renamed from: X.4up  reason: invalid class name and case insensitive filesystem */
public final class C100634up extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C99564t6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100634up(C99564t6 r1, C30391dr r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((Map) null, this);
    }
}
