package X;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: X.0Km  reason: invalid class name and case insensitive filesystem */
public abstract class C03750Km {
    public static LocaleList A00(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void A01(LocaleList localeList, TextView textView) {
        textView.setTextLocales(localeList);
    }
}
