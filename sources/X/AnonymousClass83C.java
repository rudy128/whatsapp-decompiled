package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.83C  reason: invalid class name */
public final class AnonymousClass83C extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C46162Dk $newsletter;
    public final /* synthetic */ C18090vk $successCallback;
    public final /* synthetic */ C135386s7 $targetedNewsletter;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83C(C46162Dk r2, C135386s7 r3, UpdatesViewModel updatesViewModel, C18090vk r5) {
        super(1);
        this.$targetedNewsletter = r3;
        this.this$0 = updatesViewModel;
        this.$newsletter = r2;
        this.$successCallback = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6TY r3 = (AnonymousClass6TY) obj;
        C18070vi.A0d(r3, 0);
        C135386s7 r1 = this.$targetedNewsletter;
        r1.A01 = false;
        if (r3 instanceof C120056Bf) {
            C46162Dk r0 = r1.A02;
            C179509Ig r12 = ((C120056Bf) r3).A00;
            r0.A02 = r12;
            if (r12 == C179509Ig.GUEST) {
                AnonymousClass3MW.A11(this.this$0.A0q).remove(this.$newsletter.A08());
            }
            C18090vk r02 = this.$successCallback;
            if (r02 != null) {
                r02.invoke();
            }
            UpdatesViewModel.A0E(this.this$0);
        } else if (r3 instanceof AnonymousClass6Bg) {
            UpdatesViewModel updatesViewModel = this.this$0;
            AnonymousClass1BI A08 = this.$newsletter.A08();
            C18070vi.A0X(A08);
            UpdatesViewModel.A08(A08, (AnonymousClass6Bg) r3, updatesViewModel);
        }
        C137196v4.A00(this.this$0.A0R);
        return C27621Wu.A00;
    }
}
