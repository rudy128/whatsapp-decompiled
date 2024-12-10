package X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2pR  reason: invalid class name and case insensitive filesystem */
public final class C61292pR {
    public final AnonymousClass2VD A00;

    public C61292pR(AnonymousClass2VD r1) {
        this.A00 = r1;
    }

    public static final Uri A00(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("https://");
        String format = String.format(Locale.ENGLISH, "m.%sfacebook.com", Arrays.copyOf(new Object[]{""}, 1));
        C18070vi.A0X(format);
        A10.append(format);
        String format2 = String.format(AnonymousClass000.A0y("/wa-xf-login/?app_id=%s&etoken=%s", A10), Arrays.copyOf(new Object[]{"3402315746664947", str}, 2));
        C18070vi.A0X(format2);
        return Uri.parse(format2);
    }
}
