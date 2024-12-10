package X;

import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;

public final class AXJ implements C33661jB {
    public final /* synthetic */ BrazilAddPixKeyViewModel A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public void C3L(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        StringBuilder A002 = BrazilAddPixKeyViewModel.A00(this.A00);
        A002.append("send BrCustomPaymentMethodTOSv3Iq onSuccess: {");
        A002.append(a7b);
        C17890vO.A19(A002, ".toString()}");
    }

    public void C3X(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        StringBuilder A002 = BrazilAddPixKeyViewModel.A00(this.A00);
        A002.append("send BrCustomPaymentMethodTOSv3Iq onSuccess: {");
        A002.append(a7b);
        C17890vO.A19(A002, ".toString()}");
    }

    public AXJ(BrazilAddPixKeyViewModel brazilAddPixKeyViewModel, String str, String str2, String str3, String str4) {
        this.A00 = brazilAddPixKeyViewModel;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }

    public void C3Y(C186089dd r6) {
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = this.A00;
        BrazilAddPixKeyViewModel.A03(brazilAddPixKeyViewModel);
        BrazilAddPixKeyViewModel.A06(brazilAddPixKeyViewModel, this.A03, this.A04, this.A02, this.A01);
    }
}
