package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiPayNumberContactPickerViewModel;

/* renamed from: X.AwM  reason: case insensitive filesystem */
public final class C22020AwM extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $upiNumber;
    public final /* synthetic */ IndiaUpiPayNumberContactPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22020AwM(IndiaUpiPayNumberContactPickerViewModel indiaUpiPayNumberContactPickerViewModel, String str) {
        super(0);
        this.this$0 = indiaUpiPayNumberContactPickerViewModel;
        this.$upiNumber = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str = this.$upiNumber;
        C18070vi.A0d(str, 0);
        boolean z = false;
        if (str.length() == 12) {
            C63572tK r0 = C63572tK.A0E;
            if (AnonymousClass1YE.A0A(str, "91", false)) {
                z = true;
            }
        }
        String str2 = this.$upiNumber;
        if (z) {
            str2 = C108955ca.A0z(str2, 2);
        }
        C1418477e A0Y = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str2, "upiAlias");
        IndiaUpiPayNumberContactPickerViewModel indiaUpiPayNumberContactPickerViewModel = this.this$0;
        indiaUpiPayNumberContactPickerViewModel.A00.A01((C1418477e) null, A0Y, new AXX(1, this.$upiNumber, indiaUpiPayNumberContactPickerViewModel));
        return true;
    }
}
