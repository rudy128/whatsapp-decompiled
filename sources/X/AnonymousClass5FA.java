package X;

import com.whatsapp.community.communitymedia.CommunityMediaActivity;

/* renamed from: X.5FA  reason: invalid class name */
public final class AnonymousClass5FA extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CommunityMediaActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FA(CommunityMediaActivity communityMediaActivity) {
        super(0);
        this.this$0 = communityMediaActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CommunityMediaActivity communityMediaActivity = this.this$0;
        C27201Vd r1 = communityMediaActivity.A0C;
        if (r1 != null) {
            return new AnonymousClass3XB(r1.A06(communityMediaActivity, "community-media"));
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }
}
