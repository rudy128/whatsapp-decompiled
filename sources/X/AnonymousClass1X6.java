package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.1X6  reason: invalid class name */
public abstract class AnonymousClass1X6 implements AnonymousClass1X5 {
    public final AnonymousClass1X8 A00;

    public boolean BgG(CharSequence charSequence, int i) {
        if (i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        AnonymousClass1X8 r0 = this.A00;
        if (r0 != null) {
            int BEk = r0.BEk(charSequence, i);
            if (BEk == 0) {
                return true;
            }
            if (BEk == 1) {
                return false;
            }
        }
        if (this instanceof AnonymousClass1X7) {
            return ((AnonymousClass1X7) this).A00;
        }
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    public AnonymousClass1X6(AnonymousClass1X8 r1) {
        this.A00 = r1;
    }
}
