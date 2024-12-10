package X;

import android.widget.TextView;

/* renamed from: X.CdP  reason: case insensitive filesystem */
public abstract class C25319CdP {
    public static final void A01(TextView textView, boolean z) {
        if (textView.getShowSoftInputOnFocus() != z) {
            textView.setShowSoftInputOnFocus(z);
        }
    }

    public static final void A00(TextView textView, float f) {
        textView.setLetterSpacing(f);
    }
}
