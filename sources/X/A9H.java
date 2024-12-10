package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class A9H implements DatePickerDialog.OnDateSetListener {
    public final int A00;
    public final Object A01;

    public A9H(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (this.A00 != 0) {
            ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = (ConfirmDateOfBirthBottomSheetFragment) this.A01;
            Calendar calendar = confirmDateOfBirthBottomSheetFragment.A0A;
            calendar.set(1, i);
            calendar.set(2, i2);
            calendar.set(5, i3);
            C18000vb r0 = confirmDateOfBirthBottomSheetFragment.A05;
            if (r0 != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", r0.A0N());
                WaEditText waEditText = confirmDateOfBirthBottomSheetFragment.A02;
                if (waEditText != null) {
                    waEditText.setText(simpleDateFormat.format(calendar.getTime()));
                    return;
                }
                str = "dobEditText";
            } else {
                str = "whatsAppLocale";
            }
            C18070vi.A11(str);
            throw null;
        }
        Date A002 = A3L.A00(i, i2, i3);
        ((C190459ky) this.A01).A00(AnonymousClass8BS.A0q("dd/MM/yyyy").format(A002), i4, i5, i6, A002.getTime());
    }
}
