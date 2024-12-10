package X;

import java.util.GregorianCalendar;

/* renamed from: X.Amp  reason: case insensitive filesystem */
public class C21601Amp extends GregorianCalendar {
    public int count;
    public int id;
    public C18000vb whatsAppLocale;

    public String toString() {
        long timeInMillis = getTimeInMillis();
        int i = (timeInMillis > 0 ? 1 : (timeInMillis == 0 ? 0 : -1));
        C18000vb r1 = this.whatsAppLocale;
        if (i <= 0) {
            return r1.A09(2131897311);
        }
        return AnonymousClass11X.A00.A0A(r1, timeInMillis);
    }
}
