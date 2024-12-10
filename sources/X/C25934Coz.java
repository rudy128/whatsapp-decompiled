package X;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.Coz  reason: case insensitive filesystem */
public class C25934Coz {
    public final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public static CYG A00(Object obj, String str) {
        C18210vx.A02(obj, "Listener must not be null");
        C18210vx.A05(str, "Listener type must not be empty");
        return new CYG(obj, str);
    }

    public static CWD A01(Looper looper, Object obj, String str) {
        C18210vx.A02(obj, "Listener must not be null");
        C18210vx.A02(looper, "Looper must not be null");
        C18210vx.A02(str, "Listener type must not be null");
        return new CWD(looper, obj, str);
    }
}
