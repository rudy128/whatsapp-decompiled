package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {0}, l = {439}, m = "notifyActionSuccess", n = {"this"}, s = {"L$0"})
/* renamed from: X.4un  reason: invalid class name and case insensitive filesystem */
public final class C100614un extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100614un(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MemberSuggestedGroupsManagementViewModel.A00(this.this$0, (Map) null, this);
    }
}
