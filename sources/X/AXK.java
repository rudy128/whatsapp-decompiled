package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class AXK implements C33661jB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FY A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ AnonymousClass96L A03;
    public final /* synthetic */ String A04;

    public AXK(AnonymousClass1FY r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, AnonymousClass96L r3, String str, int i) {
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = pinBottomSheetDialogFragment;
        this.A04 = str;
    }

    public void C3Y(C186089dd r7) {
        AnonymousClass96L r4 = this.A03;
        int i = this.A00;
        AnonymousClass1FY r1 = this.A01;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        if (i != 1) {
            r1.CEx();
        } else if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A29();
        }
        if (this.A04.equals("FB") && AnonymousClass8BR.A0R(r4.A03).A0A().size() < 1) {
            AnonymousClass1QL r12 = r4.A01;
            r12.A09(r12.A04("add_card"));
        }
        AnonymousClass3MX.A1K(r4.A02, 0);
    }

    public void C3L(A7B a7b) {
        C17900vP.A0Y(a7b, "PAY: BrazilPaymentCardDetailsViewModel/createCallbackForRemovePaymentMethod/onRequestError. paymentNetworkError: ", AnonymousClass000.A10());
        this.A03.A01.A0E(AnonymousClass8BV.A08(a7b, 0));
    }

    public void C3X(A7B a7b) {
        C17900vP.A0Y(a7b, "PAY: BrazilPaymentCardDetailsViewModel/createCallbackForRemovePaymentMethod/onResponseError. paymentNetworkError: ", AnonymousClass000.A10());
        AnonymousClass96L r4 = this.A03;
        String str = this.A04;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        if (!r4.A0V(a7b, pinBottomSheetDialogFragment, str)) {
            int i = this.A00;
            AnonymousClass1FY r1 = this.A01;
            if (i != 1) {
                r1.CEx();
            } else if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A2M();
                pinBottomSheetDialogFragment.A29();
            }
            r4.A01.A0E(AnonymousClass8BV.A08(a7b, 0));
        }
    }
}
