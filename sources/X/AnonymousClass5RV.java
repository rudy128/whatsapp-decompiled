package X;

import com.whatsapp.community.communityInfo.CommunityHomeFragment;

/* renamed from: X.5RV  reason: invalid class name */
public final class AnonymousClass5RV extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CommunityHomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5RV(CommunityHomeFragment communityHomeFragment) {
        super(1);
        this.this$0 = communityHomeFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CommunityHomeFragment communityHomeFragment = this.this$0;
        if (AnonymousClass3MX.A1a((Boolean) obj)) {
            AnonymousClass4P5 r3 = communityHomeFragment.A01;
            if (r3 == null) {
                C18070vi.A11("subgroupsComponent");
                throw null;
            }
            r3.A05.CDq(new AnonymousClass28K(r3, 3));
        }
        return C27621Wu.A00;
    }
}
