package X;

import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.Ahd  reason: case insensitive filesystem */
public final class C21292Ahd implements BCI {
    public final /* synthetic */ C194929sW A00;
    public final /* synthetic */ BrazilAddPixKeyViewModel A01;

    public C21292Ahd(C194929sW r1, BrazilAddPixKeyViewModel brazilAddPixKeyViewModel) {
        this.A01 = brazilAddPixKeyViewModel;
        this.A00 = r1;
    }

    public void Bc4(AnonymousClass9FQ r3) {
        StringBuilder A002 = BrazilAddPixKeyViewModel.A00(this.A01);
        A002.append("sendUpdateCustomPaymentMethodActionIq handler error iqResponse: {");
        Log.e(AnonymousClass8BX.A0c(r3, A002));
    }

    public void Bc6(AnonymousClass9F9 r7) {
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = this.A01;
        C31071ey r4 = brazilAddPixKeyViewModel.A08;
        String str = this.A00.A00;
        C21132Af0 af0 = new C21132Af0();
        C21467AkY.A00(r4.A08, r4, af0, str, 49);
        af0.A09(new C21117Ael(r7, brazilAddPixKeyViewModel, this, 4));
    }

    public void BcC(String str) {
        StringBuilder A002 = BrazilAddPixKeyViewModel.A00(this.A01);
        A002.append("sendUpdateCustomPaymentMethodActionIq handle delivery failure iqId: {");
        A002.append(str);
        Log.e(C17890vO.A0b(A002));
    }
}
