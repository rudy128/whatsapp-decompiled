package X;

import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import java.text.DateFormat;

/* renamed from: X.5JM  reason: invalid class name */
public final class AnonymousClass5JM extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ IndiaUpiDobPickerBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5JM(IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet) {
        super(0);
        this.this$0 = indiaUpiDobPickerBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C18000vb r0 = this.this$0.A00;
        if (r0 != null) {
            return DateFormat.getDateInstance(2, r0.A0N());
        }
        AnonymousClass3MW.A1M();
        throw null;
    }
}
