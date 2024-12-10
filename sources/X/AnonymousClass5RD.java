package X;

import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5RD  reason: invalid class name */
public final class AnonymousClass5RD extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5RD(CommunityMembersViewModel communityMembersViewModel) {
        super(1);
        this.this$0 = communityMembersViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid = (UserJid) obj;
        C18070vi.A0d(userJid, 0);
        CommunityMembersViewModel communityMembersViewModel = this.this$0;
        if (communityMembersViewModel.A0A.A09()) {
            CommunityMembersViewModel.A03(communityMembersViewModel, userJid);
        } else {
            AnonymousClass1G4 r3 = communityMembersViewModel.A0N;
            do {
            } while (!r3.BFK(r3.getValue(), new C77083pL(new C101845Ee(communityMembersViewModel))));
        }
        return C27621Wu.A00;
    }
}
