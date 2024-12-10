package X;

import com.whatsapp.community.communitymedia.CommunityMediaActivity;

/* renamed from: X.5F9  reason: invalid class name */
public final class AnonymousClass5F9 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CommunityMediaActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F9(CommunityMediaActivity communityMediaActivity) {
        super(0);
        this.this$0 = communityMediaActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        CommunityMediaActivity communityMediaActivity = this.this$0;
        C18030ve r7 = communityMediaActivity.A0E;
        AnonymousClass1KW r6 = communityMediaActivity.A0D;
        C18000vb r5 = communityMediaActivity.A00;
        AnonymousClass4J5 r0 = communityMediaActivity.A05;
        if (r0 != null) {
            AnonymousClass1K2 r2 = r0.A00;
            C79413vO r22 = new C79413vO((C56472hW) r2.A00.A2M.get(), communityMediaActivity, (C79623vl) r2.A01.A00.A0w.get());
            C95134lk r4 = new C95134lk();
            CommunityMediaActivity communityMediaActivity2 = this.this$0;
            C79623vl r3 = communityMediaActivity2.A0B;
            if (r3 != null) {
                return new C79573vg(communityMediaActivity2, r22, r3, r4, r5, r6, r7);
            }
            str = "mediaGalleryMessageSelectionActionRepository";
        } else {
            str = "mediaGalleryMessageSelectionActionExecutorFactory";
        }
        C18070vi.A11(str);
        throw null;
    }
}
