package X;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.Ccq  reason: case insensitive filesystem */
public abstract class C25288Ccq {
    public static final LocaleSpan A00(DUE due) {
        ArrayList A0D = C29351c6.A0D(due);
        Iterator it = due.iterator();
        while (it.hasNext()) {
            A0D.add(C25756ClR.A00(it.next()));
        }
        Locale[] localeArr = (Locale[]) A0D.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static final void A01(DUE due, BGL bgl) {
        ArrayList A0D = C29351c6.A0D(due);
        Iterator it = due.iterator();
        while (it.hasNext()) {
            A0D.add(C25756ClR.A00(it.next()));
        }
        Locale[] localeArr = (Locale[]) A0D.toArray(new Locale[0]);
        bgl.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
