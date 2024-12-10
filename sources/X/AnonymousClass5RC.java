package X;

import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5RC  reason: invalid class name */
public final class AnonymousClass5RC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5RC(CommunityMembersViewModel communityMembersViewModel) {
        super(1);
        this.this$0 = communityMembersViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid = (UserJid) obj;
        C18070vi.A0d(userJid, 0);
        CommunityMembersViewModel.A03(this.this$0, userJid);
        return C27621Wu.A00;
    }
}
