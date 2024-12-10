package X;

import android.widget.EditText;

/* renamed from: X.4W1  reason: invalid class name */
public abstract class AnonymousClass4W1 {
    public static int A00(EditText editText) {
        if (!editText.isFocused()) {
            return -1;
        }
        String A12 = AnonymousClass3Ma.A12(editText);
        int i = 0;
        int i2 = 0;
        while (i < editText.getSelectionEnd() && i <= A12.length()) {
            if (A12.charAt(i) <= '9' && A12.charAt(i) >= '0') {
                i2++;
            }
            i++;
        }
        return i2;
    }

    public static void A01(EditText editText, int i) {
        int A03 = AnonymousClass3Ma.A03(editText);
        if (i <= -1 || i > A03) {
            if (i > A03) {
                editText.requestFocus();
            }
            editText.setSelection(A03);
            return;
        }
        editText.requestFocus();
        String A12 = AnonymousClass3Ma.A12(editText);
        int i2 = 0;
        for (int i3 = 0; i3 < A12.length() && i > 0; i3++) {
            if (A12.charAt(i3) <= '9' && A12.charAt(i3) >= '0') {
                i--;
            }
            i2++;
        }
        editText.setSelection(i2);
    }
}
