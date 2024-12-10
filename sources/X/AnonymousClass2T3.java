package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2T3  reason: invalid class name */
public abstract class AnonymousClass2T3 {
    public static final C42741yf A00(Cursor cursor) {
        UserJid A04 = UserJid.Companion.A04(cursor.getString(1));
        if (A04 == null) {
            return null;
        }
        boolean A01 = C42701yb.A01(A04);
        long j = cursor.getLong(2);
        String string = cursor.getString(3);
        String string2 = cursor.getString(5);
        int i = cursor.getInt(9);
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 0;
                }
            }
        }
        return new C42741yf(A04, new C42691ya(C42681yZ.A01(cursor.getString(12)), cursor.getLong(14), C42681yZ.A00(cursor.getString(13))), string, string2, i2, cursor.getInt(11), j, A01);
    }
}
