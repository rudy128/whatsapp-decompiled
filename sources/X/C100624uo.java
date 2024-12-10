package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {0, 0}, l = {405, 406}, m = "subgroupAction", n = {"this", "stateOnSuccess"}, s = {"L$0", "I$0"})
/* renamed from: X.4uo  reason: invalid class name and case insensitive filesystem */
public final class C100624uo extends C30421du {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100624uo(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MemberSuggestedGroupsManagementViewModel.A05(this.this$0, (List) null, this, (C22821Di) null, 0);
    }
}
