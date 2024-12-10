package X;

import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;

/* renamed from: X.AYs  reason: case insensitive filesystem */
public final class C20789AYs implements BBJ {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ C22375B5e A01;
    public final /* synthetic */ C190239kb A02;

    public void Bss(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        C190699lN r0 = this.A02.A00;
        AnonymousClass1FU r2 = this.A00;
        if (r0.A00(r2, a7b)) {
            return;
        }
        if (a7b.A00 == 10755) {
            C20098A7b.A01(PaymentsUnavailableDialogFragment.A00(), r2.getSupportFragmentManager());
            return;
        }
        AnonymousClass91T r3 = (AnonymousClass91T) ((C20840AaI) this.A01).A01;
        C73203Rj A0E = AnonymousClass8BW.A0E(r3);
        A0E.A0D(2131896261);
        C20153A9p.A00(A0E, r3, r3, 20, 2131899286);
        AnonymousClass3MY.A1G(A0E);
    }

    public C20789AYs(AnonymousClass1FU r1, C22375B5e b5e, C190239kb r3) {
        this.A01 = b5e;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void Bs2() {
        C20840AaI aaI = (C20840AaI) this.A01;
        if (aaI.A00 != 0) {
            IndiaUpiDeviceBindStepActivity.A0w((IndiaUpiDeviceBindStepActivity) aaI.A01);
        } else {
            IndiaUpiBankAccountPickerActivity.A0Q((IndiaUpiBankAccountPickerActivity) aaI.A01);
        }
    }
}
