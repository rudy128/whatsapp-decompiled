package X;

import com.whatsapp.community.communityInfo.CAGInfoViewModel;

/* renamed from: X.5RR  reason: invalid class name */
public final class AnonymousClass5RR extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CAGInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5RR(CAGInfoViewModel cAGInfoViewModel) {
        super(1);
        this.this$0 = cAGInfoViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass4NO r6 = (AnonymousClass4NO) obj;
        C18070vi.A0d(r6, 0);
        CAGInfoViewModel cAGInfoViewModel = this.this$0;
        C25841Pv r3 = cAGInfoViewModel.A0I;
        AnonymousClass1E7 r2 = cAGInfoViewModel.A00;
        if (r2 == null) {
            str = "cagChat";
        } else {
            AnonymousClass1EC r1 = cAGInfoViewModel.A03;
            if (r1 == null) {
                str = "cagJid";
            } else {
                cAGInfoViewModel.A04 = r3.A02(r2, r1, r6.A02);
                CAGInfoViewModel.A03(cAGInfoViewModel);
                return C27621Wu.A00;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
