package X;

import com.whatsapp.community.CommunityMembersDirectory;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.5Uj  reason: invalid class name and case insensitive filesystem */
public final class C106055Uj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UserJid $selectedUserJid;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106055Uj(CommunityMembersViewModel communityMembersViewModel, UserJid userJid) {
        super(1);
        this.this$0 = communityMembersViewModel;
        this.$selectedUserJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C180449Mp r8 = (C180449Mp) obj;
        C18070vi.A0d(r8, 0);
        if (!(r8 instanceof AnonymousClass9HL) || !((A21) ((AnonymousClass9HL) r8).A00).A04.isEmpty()) {
            CommunityMembersViewModel communityMembersViewModel = this.this$0;
            UserJid userJid = this.$selectedUserJid;
            AnonymousClass1G4 r4 = communityMembersViewModel.A0N;
            do {
            } while (!r4.BFK(r4.getValue(), new C77093pM(userJid, new C101855Ef(communityMembersViewModel), new AnonymousClass5RD(communityMembersViewModel))));
        } else {
            CommunityMembersViewModel communityMembersViewModel2 = this.this$0;
            C32101gd r1 = communityMembersViewModel2.A08;
            AnonymousClass1EC r3 = communityMembersViewModel2.A0I;
            UserJid userJid2 = this.$selectedUserJid;
            C18070vi.A0d(userJid2, 1);
            AnonymousClass1MY r12 = ((CommunityMembersDirectory) r1).A07;
            synchronized (r12) {
                r12.A01(r3, Collections.singletonList(userJid2));
            }
            AnonymousClass1G4 r2 = this.this$0.A0N;
            do {
            } while (!r2.BFK(r2.getValue(), C77113pO.A00));
        }
        return C27621Wu.A00;
    }
}
