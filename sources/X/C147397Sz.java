package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.7Sz  reason: invalid class name and case insensitive filesystem */
public final class C147397Sz extends GregorianCalendar implements AnonymousClass87A {
    public int bucketCount;
    public final Context context;
    public final int id;
    public final C18000vb whatsAppLocale;

    public String toString() {
        String string;
        C18000vb r2;
        Locale locale;
        int i;
        int i2 = this.id;
        if (i2 != 1) {
            if (i2 == 2) {
                r2 = this.whatsAppLocale;
                C18070vi.A0d(r2, 0);
                locale = r2.A0N();
                C18070vi.A0X(locale);
                i = 233;
            } else if (i2 == 3) {
                r2 = this.whatsAppLocale;
                C18070vi.A0d(r2, 0);
                locale = r2.A0N();
                C18070vi.A0X(locale);
                i = 232;
            } else if (i2 != 4) {
                C18000vb r1 = this.whatsAppLocale;
                long timeInMillis = getTimeInMillis();
                C18070vi.A0d(r1, 0);
                string = new SimpleDateFormat(r1.A08(177), r1.A0N()).format(new Date(timeInMillis));
            } else {
                C18000vb r4 = this.whatsAppLocale;
                long timeInMillis2 = getTimeInMillis();
                C18070vi.A0d(r4, 0);
                Calendar instance = Calendar.getInstance(r4.A0N());
                instance.setTimeInMillis(timeInMillis2);
                String str = C62902sB.A00(r4)[instance.get(2)];
                C18070vi.A0U(str);
                return str;
            }
            String A08 = r2.A08(i);
            C18070vi.A0X(A08);
            return AnonymousClass11Y.A02(locale, A08);
        }
        string = this.context.getString(2131894940);
        C18070vi.A0X(string);
        return string;
    }

    public C147397Sz(Context context2, C18000vb r3, C147397Sz r4) {
        C18070vi.A0j(context2, r3);
        this.id = r4.id;
        this.context = context2;
        this.bucketCount = r4.bucketCount;
        setTime(r4.getTime());
        this.whatsAppLocale = r3;
    }

    public /* bridge */ /* synthetic */ C147397Sz BF2() {
        super.clone();
        return new C147397Sz(this.context, this.whatsAppLocale, this);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        super.clone();
        return new C147397Sz(this.context, this.whatsAppLocale, this);
    }

    public C147397Sz(Context context2, C18000vb r3, Calendar calendar, int i) {
        this.id = i;
        this.context = context2;
        setTime(calendar.getTime());
        this.whatsAppLocale = r3;
    }
}
