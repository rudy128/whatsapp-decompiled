package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.9mZ  reason: invalid class name and case insensitive filesystem */
public class C191419mZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FY A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ AnonymousClass96M A03;
    public final /* synthetic */ String A04;

    public C191419mZ(AnonymousClass1FY r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, AnonymousClass96M r3, String str, int i) {
        this.A03 = r3;
        this.A00 = i;
        this.A02 = pinBottomSheetDialogFragment;
        this.A01 = r1;
        this.A04 = str;
    }

    public void A00(A7B a7b) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment;
        Log.i("DyiViewModel/request-report/on-error");
        int i = a7b.A00;
        if (i == 1440 || i == 444 || i == 478 || i == 1441 || i == 445 || i == 1448 || i == 10718) {
            AnonymousClass96M r2 = this.A03;
            String str = this.A04;
            C17960vV.A07(str);
            r2.A0V(a7b, this.A02, str);
            return;
        }
        if (this.A00 == 1 && (pinBottomSheetDialogFragment = this.A02) != null) {
            pinBottomSheetDialogFragment.A2M();
            pinBottomSheetDialogFragment.A28();
        }
        AnonymousClass96M r22 = this.A03;
        AnonymousClass1DT r1 = r22.A02;
        Integer A0f = AnonymousClass3MY.A0f();
        r1.A0E(A0f);
        r22.A03.A0E(AnonymousClass8BR.A0B(A0f, a7b));
    }
}
