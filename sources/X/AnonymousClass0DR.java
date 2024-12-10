package X;

import android.os.LocaleList;

/* renamed from: X.0DR  reason: invalid class name */
public abstract class AnonymousClass0DR {
    public static String A00() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
