package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: X.77j  reason: invalid class name and case insensitive filesystem */
public final class C1418977j implements TextWatcher {
    public boolean A00 = true;
    public final EditText A01;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A01.isInEditMode();
    }

    public C1418977j(EditText editText) {
        this.A01 = editText;
    }
}
