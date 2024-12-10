package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

public class A2V {
    public static final Map A01 = C17880vN.A11();
    public static final Map A02 = new WeakHashMap();
    public static final Map A03 = new WeakHashMap();
    public A2X A00;

    public synchronized A2X A00() {
        A2X a2x;
        a2x = this.A00;
        if (a2x == null) {
            a2x = new A2X();
            this.A00 = a2x;
        }
        return a2x;
    }

    public synchronized A2X A01(Context context) {
        A2X a2x;
        C18070vi.A0d(context, 0);
        while ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() != null) {
            context = ((ContextWrapper) context).getBaseContext();
            C18070vi.A0X(context);
        }
        Map map = A02;
        a2x = (A2X) map.get(context);
        if (a2x == null) {
            a2x = new A2X();
            map.put(context, a2x);
        }
        return a2x;
    }

    public synchronized A2X A02(String str) {
        A2X a2x;
        Map map = A03;
        a2x = (A2X) map.get(str);
        if (a2x == null) {
            a2x = new A2X();
            map.put(str, a2x);
        }
        return a2x;
    }

    public synchronized void A03(String str) {
        A03.remove(str);
    }
}
