package X;

import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.Ahe  reason: case insensitive filesystem */
public final class C21293Ahe implements BCI {
    public final /* synthetic */ BrazilAddPixKeyViewModel A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C21293Ahe(BrazilAddPixKeyViewModel brazilAddPixKeyViewModel, String str, String str2, String str3) {
        this.A00 = brazilAddPixKeyViewModel;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
    }

    public void Bc4(AnonymousClass9FQ r3) {
        StringBuilder A002 = BrazilAddPixKeyViewModel.A00(this.A00);
        A002.append("CreateCustomPaymentMethod handler error iqResponse: {");
        Log.e(AnonymousClass8BX.A0c(r3, A002));
    }

    public void Bc6(AnonymousClass9F9 r5) {
        BrazilAddPixKeyViewModel.A04(this.A00, r5, this.A02, this.A03, this.A01);
    }

    public void BcC(String str) {
        StringBuilder A002 = BrazilAddPixKeyViewModel.A00(this.A00);
        A002.append("CreateCustomPaymentMethod handle delivery failure iqId: {");
        A002.append(str);
        Log.e(C17890vO.A0b(A002));
    }
}
