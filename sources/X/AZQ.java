package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class AZQ implements BBO {
    public final /* synthetic */ AnonymousClass1FY A00;
    public final /* synthetic */ FingerprintBottomSheet A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C161568Fz A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public AZQ(AnonymousClass1FY r1, FingerprintBottomSheet fingerprintBottomSheet, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C161568Fz r4, String str, String str2, String str3) {
        this.A03 = r4;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A06 = str3;
        this.A02 = pinBottomSheetDialogFragment;
        this.A01 = fingerprintBottomSheet;
    }

    public void C5b() {
        C161568Fz r3 = this.A03;
        String str = this.A05;
        String str2 = this.A04;
        AnonymousClass1FY r1 = this.A00;
        String str3 = this.A06;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        pinBottomSheetDialogFragment.A09 = new AZY(r1, pinBottomSheetDialogFragment, r3, str2, str3, str);
        r1.CMl(pinBottomSheetDialogFragment);
    }

    public void C7X(byte[] bArr) {
        C161568Fz r7 = this.A03;
        A4K a4k = r7.A05;
        String str = this.A06;
        C191689n0 r3 = new C191689n0(this.A00, this.A01, (PinBottomSheetDialogFragment) null, r7, this.A05, this.A04, str, 0);
        A4K.A00(new AZR(r3, bArr), new AZU(r3, 0), a4k, str);
    }
}
