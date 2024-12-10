package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AF6 implements TextWatcher {
    public final /* synthetic */ TextInputEditText A00;
    public final /* synthetic */ TextInputLayout A01;
    public final /* synthetic */ C26025Cqj A02;
    public final /* synthetic */ boolean A03;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AF6(TextInputEditText textInputEditText, TextInputLayout textInputLayout, C26025Cqj cqj, boolean z) {
        this.A02 = cqj;
        this.A01 = textInputLayout;
        this.A00 = textInputEditText;
        this.A03 = z;
    }

    public void afterTextChanged(Editable editable) {
        C26025Cqj.A00(this.A00, this.A01, this.A03);
    }
}
