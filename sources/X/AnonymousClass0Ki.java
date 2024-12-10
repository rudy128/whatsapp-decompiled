package X;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: X.0Ki  reason: invalid class name */
public abstract class AnonymousClass0Ki {
    public static LocaleList A00(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void A01(LocaleList localeList, Object obj) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
