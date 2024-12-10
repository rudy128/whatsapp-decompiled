package X;

import android.text.SpannableString;
import com.whatsapp.util.Log;

/* renamed from: X.6WL  reason: invalid class name */
public abstract class AnonymousClass6WL {
    public static final SpannableString A00(String str, int i) {
        C18070vi.A0d(str, 0);
        int i2 = i - 3;
        if (AnonymousClass1YF.A0C(str, 8206, 0, false) >= 0) {
            i2++;
        }
        if (str.length() <= 0 || i2 <= 0) {
            Log.e("FlowsUtil/truncateTextWithEllipsis -- actual string is empty or truncatedLength is invalid");
            return new SpannableString(str);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C108955ca.A0q(0, i2, str));
        return new SpannableString(AnonymousClass000.A0y("...", A10));
    }
}
