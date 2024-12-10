package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel;

public final class AXM implements C33661jB {
    public final /* synthetic */ ARR A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ BrazilHostedPaymentPageViewModel A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass1OS A07;

    public void C3L(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        AnonymousClass3MX.A1K(this.A02.A00, 2);
    }

    public void C3X(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        AnonymousClass3MX.A1K(this.A02.A00, 2);
    }

    public void C3Y(C186089dd r11) {
        C18070vi.A0d(r11, 0);
        BrazilHostedPaymentPageViewModel brazilHostedPaymentPageViewModel = this.A02;
        brazilHostedPaymentPageViewModel.A04.A00.A00(true);
        UserJid userJid = this.A01;
        ARR arr = this.A00;
        String str = this.A05;
        String str2 = this.A04;
        String str3 = this.A06;
        AnonymousClass1OS r9 = this.A07;
        brazilHostedPaymentPageViewModel.A06.A01(new C20786AYp(arr, userJid, brazilHostedPaymentPageViewModel, this.A03, str, str2, str3, r9));
    }

    public AXM(ARR arr, UserJid userJid, BrazilHostedPaymentPageViewModel brazilHostedPaymentPageViewModel, Long l, String str, String str2, String str3, AnonymousClass1OS r8) {
        this.A02 = brazilHostedPaymentPageViewModel;
        this.A01 = userJid;
        this.A00 = arr;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A07 = r8;
        this.A03 = l;
    }
}
