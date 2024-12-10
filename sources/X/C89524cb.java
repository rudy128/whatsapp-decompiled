package X;

import android.text.InputFilter;
import android.text.Spanned;
import java.lang.ref.WeakReference;

/* renamed from: X.4cb  reason: invalid class name and case insensitive filesystem */
public class C89524cb implements InputFilter {
    public final WeakReference A00;

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        AnonymousClass74M r0 = (AnonymousClass74M) this.A00.get();
        if (r0 == null || r0.A0J == null) {
            return null;
        }
        return "";
    }

    public C89524cb(AnonymousClass74M r2) {
        this.A00 = AnonymousClass3MW.A0z(r2);
    }
}
