package X;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: X.01q  reason: invalid class name and case insensitive filesystem */
public abstract class C003701q {
    public static AnonymousClass1HD A00(Configuration configuration) {
        return AnonymousClass1HD.A02(configuration.getLocales().toLanguageTags());
    }

    public static void A01(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static void A02(Configuration configuration, AnonymousClass1HD r2) {
        configuration.setLocales(LocaleList.forLanguageTags(r2.A05()));
    }

    public static void A03(AnonymousClass1HD r0) {
        LocaleList.setDefault(LocaleList.forLanguageTags(r0.A05()));
    }
}
