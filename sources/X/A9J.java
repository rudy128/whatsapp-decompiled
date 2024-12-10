package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.DateFormat;
import java.text.Format;
import java.util.Calendar;

public class A9J implements DatePickerDialog.OnDateSetListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public A9J(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str;
        boolean z;
        String str2;
        if (this.A00 != 0) {
            IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity = (IndiaUpiInternationalActivationActivity) this.A01;
            C18070vi.A0d(datePicker, 3);
            AnonymousClass8BW.A13((TextView) this.A02, (Format) this.A03, IndiaUpiInternationalActivationActivity.A03(datePicker));
            WDSButton wDSButton = indiaUpiInternationalActivationActivity.A09;
            if (wDSButton == null) {
                str2 = "buttonView";
            } else {
                TextInputLayout textInputLayout = indiaUpiInternationalActivationActivity.A03;
                if (textInputLayout != null) {
                    long j = indiaUpiInternationalActivationActivity.A00;
                    DatePicker datePicker2 = indiaUpiInternationalActivationActivity.A01;
                    if (datePicker2 == null) {
                        str2 = "endDatePicker";
                    } else {
                        long A032 = IndiaUpiInternationalActivationActivity.A03(datePicker2);
                        if (A87.A00(1, A032, j) <= 0) {
                            str = indiaUpiInternationalActivationActivity.getString(2131897601);
                        } else if (A87.A00(89, A032, j) > 89) {
                            Calendar instance = Calendar.getInstance();
                            instance.setTimeInMillis(j);
                            DateFormat dateInstance = DateFormat.getDateInstance(2, indiaUpiInternationalActivationActivity.A00.A0N());
                            instance.add(5, 90);
                            str = C108975cc.A0b(indiaUpiInternationalActivationActivity, dateInstance.format(Long.valueOf(instance.getTimeInMillis())), new Object[1], 2131897600);
                        } else {
                            str = null;
                        }
                        textInputLayout.setError(str);
                        TextInputLayout textInputLayout2 = indiaUpiInternationalActivationActivity.A04;
                        if (textInputLayout2 == null) {
                            str2 = "startDateInputLayout";
                        } else {
                            CharSequence error = textInputLayout2.getError();
                            if (error == null || error.length() == 0) {
                                TextInputLayout textInputLayout3 = indiaUpiInternationalActivationActivity.A03;
                                if (textInputLayout3 != null) {
                                    CharSequence error2 = textInputLayout3.getError();
                                    if (error2 == null || error2.length() == 0) {
                                        z = true;
                                        wDSButton.setEnabled(z);
                                        return;
                                    }
                                }
                            }
                            z = false;
                            wDSButton.setEnabled(z);
                            return;
                        }
                    }
                }
                C18070vi.A11("endDateInputLayout");
                throw null;
            }
            C18070vi.A11(str2);
            throw null;
        }
        AnonymousClass8BW.A13((TextView) this.A02, (Format) this.A03, AnonymousClass8BY.A07(datePicker));
        IndiaUpiPauseMandateActivity.A0Q((IndiaUpiPauseMandateActivity) this.A01);
    }
}
