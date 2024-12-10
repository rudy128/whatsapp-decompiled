package X;

import com.whatsapp.community.CommunityFragment;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.3II  reason: invalid class name */
public final class AnonymousClass3II extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CommunityFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3II(CommunityFragment communityFragment) {
        super(1);
        this.this$0 = communityFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GroupJid groupJid = (GroupJid) obj;
        C18070vi.A0d(groupJid, 0);
        AnonymousClass00H r0 = this.this$0.A0I;
        if (r0 != null) {
            CommunityFragment communityFragment = this.this$0;
            ((C32111gf) r0.get()).CAn(communityFragment.A17(), communityFragment, groupJid);
            return C27621Wu.A00;
        }
        C18070vi.A11("communityNavigator");
        throw null;
    }
}
