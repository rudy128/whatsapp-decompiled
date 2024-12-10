package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

public class D4H implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public D4H(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A00 != 0) {
            TextInputLayout textInputLayout = (TextInputLayout) this.A01;
            TextInputLayout.A0A(textInputLayout, !textInputLayout.A0S, false);
            if (textInputLayout.A0M) {
                textInputLayout.A0H(editable);
            }
            if (textInputLayout.A0R) {
                TextInputLayout.A08(editable, textInputLayout);
                return;
            }
            return;
        }
        ((C18090vk) this.A01).invoke();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
