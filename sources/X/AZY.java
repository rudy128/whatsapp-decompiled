package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class AZY implements BBP {
    public final /* synthetic */ AnonymousClass1FY A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;
    public final /* synthetic */ C161568Fz A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public AZY(AnonymousClass1FY r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C161568Fz r3, String str, String str2, String str3) {
        this.A02 = r3;
        this.A01 = pinBottomSheetDialogFragment;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = r1;
    }

    public void BpL(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        pinBottomSheetDialogFragment.A2N();
        C161568Fz r5 = this.A02;
        A4K a4k = r5.A05;
        String str2 = this.A03;
        String str3 = this.A05;
        C191689n0 r1 = new C191689n0(this.A00, (FingerprintBottomSheet) null, pinBottomSheetDialogFragment, r5, this.A04, str2, str3, 1);
        A4K.A00(new AZT(r1, a4k, str, str2, 1), new AZU(r1, 1), a4k, str3);
    }

    public void Buu() {
        C72463Mc.A1B(this.A02.A00);
    }
}
