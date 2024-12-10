package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.8Cv  reason: invalid class name and case insensitive filesystem */
public class C161348Cv extends InputFilter.AllCaps {
    public final /* synthetic */ C166478cx A00;

    public C161348Cv(C166478cx r1) {
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return String.valueOf(charSequence).toLowerCase(this.A00.A00.A04.A0N());
    }
}
