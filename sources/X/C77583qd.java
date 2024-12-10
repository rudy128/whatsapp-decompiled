package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;

/* renamed from: X.3qd  reason: invalid class name and case insensitive filesystem */
public final class C77583qd extends AnonymousClass70Q {
    public EditText A00;
    public LinearLayout A01;
    public TextInputLayout A02;
    public WaEditText A03;

    public void A09(boolean z) {
    }

    public void A07(String str) {
        if (str.length() != 0) {
            TextWatcher textWatcher = this.A00;
            if (textWatcher != null) {
                this.A03.removeTextChangedListener(textWatcher);
            }
            try {
                AnonymousClass9AJ r1 = new AnonymousClass9AJ(1, str, this);
                this.A00 = r1;
                this.A03.addTextChangedListener(r1);
            } catch (NullPointerException unused) {
                Log.e("PhoneNumberEntry/formatter exception");
            }
            WaEditText waEditText = this.A03;
            Editable text = waEditText.getText();
            String str2 = "";
            if (text != null) {
                str2 = new C41661wr("\\D").A00(text, str2);
            }
            waEditText.setText(str2);
        }
    }
}
