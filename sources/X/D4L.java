package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.IndiaUpiAddressFormActivity;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public abstract class D4L implements TextWatcher {
    public C24440C4a A00;
    public final WaEditText A01;
    public final C28477E2s A02;
    public final C28535E6j A03;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        this.A00 = this.A03.Bgv(charSequence);
        IndiaUpiAddressFormActivity indiaUpiAddressFormActivity = (IndiaUpiAddressFormActivity) this.A02;
        List<D4L> list = indiaUpiAddressFormActivity.A0J;
        if (list == null) {
            str = "textWatcherList";
        } else {
            boolean z = true;
            for (D4L d4l : list) {
                if (!C18070vi.A18(C24079Bv7.A00, d4l.A00)) {
                    if (!C18070vi.A18(C24078Bv6.A00, d4l.A00)) {
                        C24440C4a c4a = d4l.A00;
                        C18070vi.A0z(c4a, "null cannot be cast to non-null type com.whatsapp.payments.ui.helper.ValidationResult.Error");
                        d4l.A01.setError(((C24077Bv5) c4a).A00);
                    }
                    z = false;
                }
            }
            WDSButton wDSButton = indiaUpiAddressFormActivity.A0I;
            if (wDSButton == null) {
                str = "confirmButton";
            } else {
                wDSButton.setEnabled(z);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public D4L(WaEditText waEditText, C28477E2s e2s, C28535E6j e6j, boolean z) {
        C24440C4a c4a;
        this.A01 = waEditText;
        this.A03 = e6j;
        this.A02 = e2s;
        if (z) {
            c4a = C24079Bv7.A00;
        } else {
            c4a = C24078Bv6.A00;
        }
        this.A00 = c4a;
    }
}
