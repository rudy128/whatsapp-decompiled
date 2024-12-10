package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;

/* renamed from: X.3NX  reason: invalid class name */
public class AnonymousClass3NX extends Editable.Factory {
    public Editable newEditable(CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence);
    }
}
