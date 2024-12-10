package X;

import com.whatsapp.util.Log;

/* renamed from: X.2p7  reason: invalid class name and case insensitive filesystem */
public class C61092p7 {
    public static long A00 = -1;
    public static boolean A01;

    public static synchronized void A00(AnonymousClass194 r4, C19830z4 r5) {
        synchronized (C61092p7.class) {
            A01 = true;
            if (r4.A02()) {
                Log.w("profilephotoreminder/savelastremindertimestamp/clock is wrong, not saving last profile photo reminder time");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                A00 = currentTimeMillis;
                r5.A1q("wa_last_reminder_timestamp", currentTimeMillis);
            }
        }
    }
}
