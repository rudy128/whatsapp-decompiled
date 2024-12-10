package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {0, 2}, l = {158, 159, 161, 162}, m = "onLoadingStates", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: X.4uO  reason: invalid class name and case insensitive filesystem */
public final class C100364uO extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100364uO(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MemberSuggestedGroupsManagementViewModel.A03(this.this$0, (Map) null, this);
    }
}
