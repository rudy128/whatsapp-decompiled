package X;

import android.content.Context;

public abstract class CEQ {
    public static E92 A00;

    public static void A00(Context context) {
        if (A00 == null) {
            try {
                A00 = (E92) Class.forName("DefaultLocationProvider").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            } catch (Exception e) {
                throw new DZY(e);
            }
        }
    }
}
