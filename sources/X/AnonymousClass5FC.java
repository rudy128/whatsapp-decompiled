package X;

import com.whatsapp.community.communitymedia.CommunityMediaActivity;

/* renamed from: X.5FC  reason: invalid class name */
public final class AnonymousClass5FC extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CommunityMediaActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FC(CommunityMediaActivity communityMediaActivity) {
        super(0);
        this.this$0 = communityMediaActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CommunityMediaActivity communityMediaActivity = this.this$0;
        AnonymousClass5XF r5 = communityMediaActivity.A0A;
        if (r5 != null) {
            AnonymousClass1EC A0p = AnonymousClass3MX.A0p(communityMediaActivity.A0O);
            boolean A1W = AnonymousClass000.A1W(this.this$0.A0P.getValue());
            C18070vi.A0d(A0p, 1);
            return AnonymousClass4WS.A00(new AnonymousClass4WS(), C73373Vg.class, new AnonymousClass5VM(r5, A0p, A1W));
        }
        C18070vi.A11("communityViewModelFactory");
        throw null;
    }
}
