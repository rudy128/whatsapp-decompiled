package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.6xl  reason: invalid class name and case insensitive filesystem */
public final class C138826xl {
    public static final Map A01 = new WeakHashMap();
    public final C18140vp A00;

    public C138826xl(C18140vp r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final synchronized C138816xk A00(Context context) {
        C138816xk r1;
        C18070vi.A0d(context, 0);
        while ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() != null) {
            context = ((ContextWrapper) context).getBaseContext();
            C18070vi.A0X(context);
        }
        Map map = A01;
        r1 = (C138816xk) map.get(context);
        if (r1 == null) {
            r1 = (C138816xk) this.A00.get();
        }
        if (!map.containsKey(context)) {
            map.put(context, r1);
        }
        C18070vi.A0b(r1);
        return r1;
    }
}
