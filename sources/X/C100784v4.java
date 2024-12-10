package X;

import com.whatsapp.community.CommunityMembersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel", f = "CommunityMembersViewModel.kt", i = {0, 0, 0}, l = {377}, m = "updateCommunityParticipants", n = {"this", "participantsToUpdate", "isPhotoUpdate"}, s = {"L$0", "L$1", "Z$0"})
/* renamed from: X.4v4  reason: invalid class name and case insensitive filesystem */
public final class C100784v4 extends C30421du {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100784v4(CommunityMembersViewModel communityMembersViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = communityMembersViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CommunityMembersViewModel.A00(this.this$0, this, (AnonymousClass1JQ) null, false);
    }
}
