package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.82d  reason: invalid class name and case insensitive filesystem */
public final class C1588182d extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C46162Dk $newsletter;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1588182d(C46162Dk r2, UpdatesViewModel updatesViewModel) {
        super(1);
        this.this$0 = updatesViewModel;
        this.$newsletter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6TY r7 = (AnonymousClass6TY) obj;
        C18070vi.A0d(r7, 0);
        UpdatesViewModel updatesViewModel = this.this$0;
        if (updatesViewModel.A06) {
            AnonymousClass3MW.A11(updatesViewModel.A0q).remove(this.$newsletter.A0M());
            if (r7 instanceof C120056Bf) {
                this.this$0.A0T().A04(C46162Dk.A00((C29691ci) null, ((C120056Bf) r7).A00, this.$newsletter, -16385, 0));
            } else if (r7 instanceof AnonymousClass6Bg) {
                UpdatesViewModel updatesViewModel2 = this.this$0;
                AnonymousClass1BI A08 = this.$newsletter.A08();
                C18070vi.A0X(A08);
                UpdatesViewModel.A08(A08, (AnonymousClass6Bg) r7, updatesViewModel2);
            }
        }
        return C27621Wu.A00;
    }
}
