package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

public final /* synthetic */ class A9S implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ IndiaUpiDobPickerBottomSheet A01;

    public final void onClick(DialogInterface dialogInterface, int i) {
        B96 b96;
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = this.A01;
        long j = this.A00;
        AnonymousClass1FL A1D = indiaUpiDobPickerBottomSheet.A1D();
        if ((A1D instanceof B96) && (b96 = (B96) A1D) != null) {
            b96.Bqs(j, indiaUpiDobPickerBottomSheet.A15().getString("BUNDLE_KEY_CREDENTIAL", (String) null));
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    public /* synthetic */ A9S(IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet, long j) {
        this.A01 = indiaUpiDobPickerBottomSheet;
        this.A00 = j;
    }
}
