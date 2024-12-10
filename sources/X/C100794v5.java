package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager", f = "MemberSuggestedGroupsManager.kt", i = {0, 0, 0}, l = {100, 101}, m = "fetchSuggestedGroupsSuspended", n = {"this", "parentGroupJid", "hintGroupJid"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.4v5  reason: invalid class name and case insensitive filesystem */
public final class C100794v5 extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemberSuggestedGroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100794v5(MemberSuggestedGroupsManager memberSuggestedGroupsManager, C30391dr r2) {
        super(r2);
        this.this$0 = memberSuggestedGroupsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MemberSuggestedGroupsManager.A00(this.this$0, (AnonymousClass1EC) null, (AnonymousClass1EC) null, this);
    }
}
