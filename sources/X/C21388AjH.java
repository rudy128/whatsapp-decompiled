package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.AjH  reason: case insensitive filesystem */
public final /* synthetic */ class C21388AjH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FY A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ AnonymousClass96L A03;
    public final /* synthetic */ C29621ca A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public final void run() {
        AnonymousClass96L r7 = this.A03;
        int i = this.A00;
        AnonymousClass1FY r5 = this.A01;
        String str = this.A05;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        C29621ca r3 = this.A04;
        String str2 = this.A06;
        r7.A02.A0E(new AXK(r5, pinBottomSheetDialogFragment, r7, str, i), r3, r7.A00.A0A, str2);
    }

    public /* synthetic */ C21388AjH(AnonymousClass1FY r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, AnonymousClass96L r3, C29621ca r4, String str, String str2, int i) {
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A05 = str;
        this.A02 = pinBottomSheetDialogFragment;
        this.A04 = r4;
        this.A06 = str2;
    }
}
