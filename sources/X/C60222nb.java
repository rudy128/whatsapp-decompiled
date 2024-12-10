package X;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: X.2nb  reason: invalid class name and case insensitive filesystem */
public abstract class C60222nb {
    public static void A01(Configuration configuration, AnonymousClass1HD r2) {
        configuration.setLocales((LocaleList) r2.A00.BU6());
    }

    public static LocaleList A00(Configuration configuration) {
        return configuration.getLocales();
    }
}
