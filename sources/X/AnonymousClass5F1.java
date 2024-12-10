package X;

import com.whatsapp.community.communityInfo.CAGInfoFragment;

/* renamed from: X.5F1  reason: invalid class name */
public final class AnonymousClass5F1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CAGInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F1(CAGInfoFragment cAGInfoFragment) {
        super(0);
        this.this$0 = cAGInfoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass01C r3 = (AnonymousClass01C) this.this$0.A0E.getValue();
        CAGInfoFragment cAGInfoFragment = this.this$0;
        C106955Xv r2 = cAGInfoFragment.A07;
        if (r2 != null) {
            Object value = cAGInfoFragment.A0D.getValue();
            C18070vi.A0d(value, 1);
            return C91774gE.A00(r3, r2, value, 13).A00(C76803oS.class);
        }
        C18070vi.A11("groupChatInfoViewModelFactory");
        throw null;
    }
}
