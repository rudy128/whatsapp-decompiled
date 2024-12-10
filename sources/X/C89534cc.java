package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.4cc  reason: invalid class name and case insensitive filesystem */
public final class C89534cc implements InputFilter {
    public final int A00;
    public final int A01;

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        AnonymousClass3Ma.A1O(charSequence, 0, spanned);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(spanned.subSequence(0, i3));
        A10.append(charSequence.subSequence(i, i2));
        String A0V = C17890vO.A0V(spanned.subSequence(i4, spanned.length()), A10);
        Integer A03 = AnonymousClass1YD.A03(A0V);
        int i5 = this.A01;
        C25411Oc r3 = new C25411Oc(i5, this.A00);
        if (A03 != null) {
            int intValue = A03.intValue();
            if (r3.A00 > intValue || intValue > r3.A01) {
                return "";
            }
            return null;
        } else if (A0V.length() == 1 && i5 < 0 && A0V.charAt(0) == '-') {
            return null;
        } else {
            return "";
        }
    }

    public C89534cc(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public C89534cc() {
        this(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
