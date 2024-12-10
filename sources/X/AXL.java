package X;

import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;

public final class AXL implements C33661jB {
    public final /* synthetic */ BrazilAddPixKeyViewModel A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public void C3L(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        StringBuilder A002 = BrazilAddPixKeyViewModel.A00(this.A00);
        A002.append("updatePixKey/send BrCustomPaymentMethodTOSv3Iq onSuccess: {");
        A002.append(a7b);
        C17890vO.A19(A002, ".toString()}");
    }

    public void C3X(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        StringBuilder A002 = BrazilAddPixKeyViewModel.A00(this.A00);
        A002.append("updatePixKey/send BrCustomPaymentMethodTOSv3Iq onSuccess: {");
        A002.append(a7b);
        C17890vO.A19(A002, ".toString()}");
    }

    public AXL(BrazilAddPixKeyViewModel brazilAddPixKeyViewModel, String str, String str2, String str3, String str4, String str5) {
        this.A00 = brazilAddPixKeyViewModel;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = str4;
        this.A02 = str5;
    }

    public void C3Y(C186089dd r7) {
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = this.A00;
        BrazilAddPixKeyViewModel.A03(brazilAddPixKeyViewModel);
        String str = this.A04;
        AnonymousClass8BR.A1I(str);
        brazilAddPixKeyViewModel.A0T(new C194929sW(str, this.A05, this.A03, this.A01), this.A02);
    }
}
