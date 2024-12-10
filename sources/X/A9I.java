package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.Format;

public final /* synthetic */ class A9I implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ IndiaUpiDobPickerBottomSheet A01;

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = this.A01;
        EditText editText = this.A00;
        boolean A1X = AnonymousClass8BU.A1X(datePicker);
        AnonymousClass8BW.A13(editText, (Format) AnonymousClass3MX.A14(indiaUpiDobPickerBottomSheet.A03), AnonymousClass8BY.A07(datePicker));
        WDSButton wDSButton = indiaUpiDobPickerBottomSheet.A01;
        if (wDSButton != null) {
            wDSButton.setEnabled(A1X);
        }
    }

    public /* synthetic */ A9I(EditText editText, IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet) {
        this.A01 = indiaUpiDobPickerBottomSheet;
        this.A00 = editText;
    }
}
