package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.81k  reason: invalid class name and case insensitive filesystem */
public final class C1586281k extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1586281k(UpdatesViewModel updatesViewModel) {
        super(1);
        this.this$0 = updatesViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean isEmpty = UpdatesViewModel.A05(this.this$0).isEmpty();
        UpdatesViewModel updatesViewModel = this.this$0;
        boolean z = updatesViewModel.A0I;
        boolean A1S = AnonymousClass000.A1S(z ? 1 : 0, isEmpty ? 1 : 0);
        if (isEmpty && updatesViewModel.A0J) {
            updatesViewModel.A0J = false;
        }
        if (A1S && (isEmpty || !updatesViewModel.A0J)) {
            UpdatesViewModel.A0G(updatesViewModel);
        }
        return C27621Wu.A00;
    }
}
