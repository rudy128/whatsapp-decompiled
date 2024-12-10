package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

public final class D4M implements TextWatcher {
    public EditText A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final ArrayList A04 = AnonymousClass000.A13();

    public D4M(String str) {
        this.A01 = str;
        int length = this.A01.length();
        for (int i = 0; i < length; i++) {
            if (this.A01.charAt(i) != '#') {
                C17890vO.A1D(this.A04, i);
            }
        }
        this.A00 = null;
    }

    public void afterTextChanged(Editable editable) {
        C18070vi.A0d(editable, 0);
        EditText editText = this.A00;
        if (editText != null) {
            int selectionStart = editText.getSelectionStart();
            if (!this.A03 && !this.A02) {
                this.A02 = true;
            } else if (!this.A02) {
                this.A02 = true;
                if (C108965cb.A1Z(this.A04, selectionStart)) {
                    while (true) {
                        if (selectionStart <= 0) {
                            break;
                        }
                        int i = selectionStart - 1;
                        if (this.A01.charAt(i) == '#') {
                            editable.delete(i, selectionStart);
                            selectionStart = i;
                            break;
                        }
                        int i2 = selectionStart - 1;
                        editable.delete(i2, selectionStart);
                        selectionStart = i2;
                    }
                }
            } else {
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            int length = editable.length();
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (Character.isDigit(editable.charAt(i4))) {
                    A10.append(editable.charAt(i4));
                    if (i4 < selectionStart) {
                        i3++;
                    }
                }
            }
            StringBuilder A102 = AnonymousClass000.A10();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < A10.length()) {
                String str = this.A01;
                if (i6 >= str.length()) {
                    break;
                }
                if (str.charAt(i6) == '#') {
                    A102.append(A10.charAt(i5));
                    if (i5 < i3) {
                        i7++;
                    }
                    i5++;
                } else {
                    A102.append(this.A01.charAt(i6));
                    if (i5 <= i3) {
                        i7++;
                    }
                }
                i6++;
            }
            String substring = this.A01.substring(i6);
            int A002 = AnonymousClass8BS.A00(substring);
            if (A002 > 0 && !AnonymousClass1YF.A0Y(substring, "#", false)) {
                A102.append(substring);
                if (i5 <= i3) {
                    i7 += A002;
                }
            }
            editText.setText(A102);
            editText.setSelection(i7);
            this.A02 = false;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A03 = AnonymousClass000.A1U(i3, i2);
    }
}
