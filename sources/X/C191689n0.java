package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.9n0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C191689n0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FY A01;
    public final /* synthetic */ FingerprintBottomSheet A02;
    public final /* synthetic */ PinBottomSheetDialogFragment A03;
    public final /* synthetic */ C161568Fz A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void A00(A7B a7b, C29621ca r18) {
        C161568Fz r5 = this.A04;
        int i = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A03;
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        String str = this.A05;
        String str2 = this.A06;
        AnonymousClass1FY r3 = this.A01;
        String str3 = this.A07;
        A7B a7b2 = a7b;
        if (a7b != null) {
            if (i == 1 && pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A2M();
            }
            r5.A03.A0E(a7b2);
            return;
        }
        if (i == 0 && fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A29();
        }
        C29621ca r6 = r18;
        if (r5 instanceof AnonymousClass96M) {
            AnonymousClass96M r52 = (AnonymousClass96M) r5;
            Log.i("DyiViewModel/request-report/on-pin-node-ready");
            if (!str2.equals("DYIREPORT")) {
                Log.e("DyiViewModel/request-report/on-pin-node-ready :: no matching actions");
                return;
            }
            if (i == 0) {
                r3.CNA(2131895077);
            }
            r52.A0W(new C191419mZ(r3, pinBottomSheetDialogFragment, r52, str3, i), r6, str);
            return;
        }
        AnonymousClass96L r53 = (AnonymousClass96L) r5;
        if (i == 0) {
            r3.CNA(2131895077);
        }
        r53.A04.CGF(new C21388AjH(r3, pinBottomSheetDialogFragment, r53, r6, str3, str, i));
    }

    public /* synthetic */ C191689n0(AnonymousClass1FY r1, FingerprintBottomSheet fingerprintBottomSheet, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C161568Fz r4, String str, String str2, String str3, int i) {
        this.A04 = r4;
        this.A00 = i;
        this.A03 = pinBottomSheetDialogFragment;
        this.A02 = fingerprintBottomSheet;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = r1;
        this.A07 = str3;
    }
}
