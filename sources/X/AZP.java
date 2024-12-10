package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class AZP implements BBO {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ A5V A01;

    public AZP(FingerprintBottomSheet fingerprintBottomSheet, A5V a5v) {
        this.A01 = a5v;
        this.A00 = fingerprintBottomSheet;
    }

    public void C5b() {
        A5V a5v = this.A01;
        PinBottomSheetDialogFragment A002 = C196779vd.A00();
        A002.A09 = new AZW(A002, a5v, 1);
        a5v.A05.CMk(A002, (String) null);
    }

    public void C7X(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A00;
        fingerprintBottomSheet.A29();
        A5V a5v = this.A01;
        AnonymousClass1FY r6 = a5v.A05;
        AnonymousClass1KB r7 = a5v.A04;
        C31061ex r9 = a5v.A09;
        C33711jG r8 = a5v.A07;
        A54 a54 = a5v.A0A;
        C191619mt r5 = new C191619mt(r6, r7, r8, r9, a54, "PIN");
        AZ2 A012 = a54.A01("FB", "PIN");
        if (A012 != null) {
            C29621ca A013 = new C198959zC(A012).A01(bArr);
            fingerprintBottomSheet.A29();
            a5v.A06((PinBottomSheetDialogFragment) null, A013);
            return;
        }
        r5.A00(new C20774AYd(this, bArr, 1), "FB");
    }
}
