package X;

import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.94k  reason: invalid class name and case insensitive filesystem */
public final class C1764894k extends C21601Amp {
    public String toString() {
        long timeInMillis = getTimeInMillis();
        int i = (timeInMillis > 0 ? 1 : (timeInMillis == 0 ? 0 : -1));
        C18000vb r1 = this.whatsAppLocale;
        if (i <= 0) {
            String A09 = r1.A09(2131897311);
            C18070vi.A0b(A09);
            return A09;
        }
        C18070vi.A0W(r1);
        String format = new SimpleDateFormat(r1.A08(178), r1.A0N()).format(new Date(timeInMillis));
        C18070vi.A0X(format);
        return format;
    }
}
