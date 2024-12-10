package X;

import com.whatsapp.community.communityInfo.CAGInfoViewModel;

/* renamed from: X.5F5  reason: invalid class name */
public final class AnonymousClass5F5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CAGInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F5(CAGInfoViewModel cAGInfoViewModel) {
        super(0);
        this.this$0 = cAGInfoViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CAGInfoViewModel cAGInfoViewModel = this.this$0;
        AnonymousClass1EC r2 = cAGInfoViewModel.A03;
        if (r2 != null) {
            return new C95494mK(new C96204nT(cAGInfoViewModel, 0), r2);
        }
        C18070vi.A11("cagJid");
        throw null;
    }
}
