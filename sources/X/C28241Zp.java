package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: X.1Zp  reason: invalid class name and case insensitive filesystem */
public final class C28241Zp implements InputFilter {
    public final TextView A00;

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.A00.isInEditMode()) {
            return charSequence;
        }
        C60692oS.A00();
        throw null;
    }

    public C28241Zp(TextView textView) {
        this.A00 = textView;
    }
}
