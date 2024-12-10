package X;

import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.7vm  reason: invalid class name and case insensitive filesystem */
public final class C157087vm extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass863 $updatesViewModelObserversFactory;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157087vm(UpdatesViewModel updatesViewModel, AnonymousClass863 r3) {
        super(0);
        this.$updatesViewModelObserversFactory = r3;
        this.this$0 = updatesViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass863 r0 = this.$updatesViewModelObserversFactory;
        UpdatesViewModel updatesViewModel = this.this$0;
        CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = updatesViewModel.A0W;
        AnonymousClass1OX A00 = C41561wd.A00(updatesViewModel);
        AnonymousClass10E r1 = ((C34751l1) r0).A00.A00;
        C24681Lg A0o = AnonymousClass3MZ.A0o(r1);
        C35751mk r2 = (C35751mk) r1.A2F.get();
        C24671Lf A0S = AnonymousClass3Ma.A0S(r1);
        return new C131026kO(r2, AnonymousClass10E.A4z(r1), A0S, (AnonymousClass1Q1) r1.A2A.get(), A0o, crossPostingUpdatesViewModel, updatesViewModel, AnonymousClass3MZ.A1B(r1), A00);
    }
}
