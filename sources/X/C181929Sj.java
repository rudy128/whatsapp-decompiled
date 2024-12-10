package X;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* renamed from: X.9Sj  reason: invalid class name and case insensitive filesystem */
public abstract class C181929Sj {
    public static Context A00(Context context, String str) {
        String[] split = str.split("_");
        Locale locale = new Locale(str);
        if (split.length == 2) {
            locale = new Locale(split[0], split[1]);
        }
        Locale.setDefault(locale);
        Configuration A03 = C108965cb.A03(context);
        A03.setLocale(locale);
        A03.setLayoutDirection(locale);
        return context.createConfigurationContext(A03);
    }
}
