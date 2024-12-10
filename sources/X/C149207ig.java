package X;

import com.whatsapp.companionmode.registration.CompanionRegistrationViewModel;

/* renamed from: X.7ig  reason: invalid class name and case insensitive filesystem */
public final class C149207ig extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CompanionRegistrationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149207ig(CompanionRegistrationViewModel companionRegistrationViewModel) {
        super(0);
        this.this$0 = companionRegistrationViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C18030ve r1 = this.this$0.A0A;
        C18040vf r4 = C18040vf.A02;
        boolean A05 = C18020vd.A05(r4, r1, 8981);
        int i = AnonymousClass11Q.A01(this.this$0.A09).getInt("connection_reset_handling_rollout_value", -1);
        if (i <= 0) {
            CompanionRegistrationViewModel companionRegistrationViewModel = this.this$0;
            i = companionRegistrationViewModel.A01;
            C17880vN.A1C(AnonymousClass11Q.A01(companionRegistrationViewModel.A09).edit(), "connection_reset_handling_rollout_value", i);
        }
        boolean z = true;
        boolean A1U = AnonymousClass000.A1U(i, C18020vd.A00(r4, this.this$0.A0A, 8982));
        if (!A05 || !A1U) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
