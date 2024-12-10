package X;

import android.content.Context;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel$setDescriptionNewValue$1;

/* renamed from: X.Bpg  reason: case insensitive filesystem */
public final class C23797Bpg extends TextEmojiLabel {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final C28527E6b A02;
    public final C107445Zs A03;
    public final C85944Pm A04;
    public final AnonymousClass1EC A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new C27739DkL(this));

    public static final void A0F(C23797Bpg bpg) {
        C18070vi.A0d(bpg, 0);
        GroupDescriptionAddUpsellViewModel viewModel = bpg.getViewModel();
        viewModel.A04.CGF(new C98834rn((Object) viewModel, 2));
    }

    private final GroupDescriptionAddUpsellViewModel getViewModel() {
        return (GroupDescriptionAddUpsellViewModel) this.A06.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23797Bpg(Context context, AnonymousClass1KB r6, C28527E6b e6b, C107445Zs r8, C85944Pm r9, AnonymousClass1EC r10) {
        super(context);
        C18070vi.A0w(r6, r9, r8, e6b, context);
        C18070vi.A0d(r10, 6);
        this.A01 = r6;
        this.A04 = r9;
        this.A03 = r8;
        this.A02 = e6b;
        this.A00 = context;
        this.A05 = r10;
        C29261bv.A08(this, 2132083155);
        setTextColor(AnonymousClass3Ma.A01(context, getResources(), 2130971977, 2131103150));
        setText(2131888925);
        setLineHeight(getResources().getDimensionPixelSize(2131166124));
        setGravity(17);
        setVisibility(8);
        AnonymousClass1FB r3 = (AnonymousClass1FB) AnonymousClass1L9.A01(context, AnonymousClass1FY.class);
        C26623D6r.A00(r3, getViewModel().A00, new C27999Dpa(this), 3);
        C26623D6r.A00(r3, getViewModel().A01, new C28000Dpb(this), 3);
        setOnClickListener(new C89914dE(this, 15));
    }

    /* access modifiers changed from: private */
    public final void setNewDescription(String str) {
        GroupDescriptionAddUpsellViewModel viewModel = getViewModel();
        if (str == null) {
            str = "";
        }
        AnonymousClass3MW.A1X(viewModel.A05, new GroupDescriptionAddUpsellViewModel$setDescriptionNewValue$1(viewModel, str, (C30391dr) null), C41561wd.A00(viewModel));
    }
}
