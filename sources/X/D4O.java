package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.primitive.textinput.TextInputView;

public final class D4O implements TextWatcher {
    public int A00;
    public final TextInputView A01;
    public final AnonymousClass1OS A02;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void A00(D4O d4o) {
        TextInputView textInputView = d4o.A01;
        int lineCount = textInputView.getLineCount();
        int i = d4o.A00;
        if (lineCount != i) {
            d4o.A02.invoke(Integer.valueOf(i), Integer.valueOf(textInputView.getLineCount()));
            d4o.A00 = textInputView.getLineCount();
        }
    }

    public void afterTextChanged(Editable editable) {
        TextInputView textInputView = this.A01;
        if (textInputView.getLayout() == null) {
            textInputView.addOnLayoutChangeListener(new C26581D4v(this, 1));
        } else {
            A00(this);
        }
    }

    public D4O(TextInputView textInputView, AnonymousClass1OS r3) {
        this.A01 = textInputView;
        this.A02 = r3;
        this.A00 = textInputView.getLineCount();
    }
}
