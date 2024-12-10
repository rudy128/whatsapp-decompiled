package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0QO  reason: invalid class name */
public abstract class AnonymousClass0QO {
    public static C05220Qz A00;
    public static final Object A01 = new Object();
    public static final Map A02 = new HashMap(4);
    public static final WeakHashMap A03 = new WeakHashMap();
    public static final ThreadLocal A04 = new ThreadLocal();
    public static final WeakHashMap A05 = new WeakHashMap();

    public static final AnonymousClass0K6 A01(Context context, C17110tl r7, AnonymousClass0ME r8) {
        Map map;
        C07120aP r4 = null;
        synchronized (A01) {
            Map map2 = A02;
            AnonymousClass0IH r1 = (AnonymousClass0IH) map2.get(context);
            if (r1 == null) {
                Context A002 = A00(context);
                if (A05.containsKey(A002)) {
                    return null;
                }
                A04(A002);
                r1 = new AnonymousClass0IH();
                map2.put(context, r1);
            }
            if (r8.equals(AnonymousClass0ME.A00)) {
                map = r1.A01;
            } else {
                Map map3 = r1.A00;
                Object obj = map3.get(r8);
                if (obj == null) {
                    obj = new HashMap();
                    map3.put(r8, obj);
                }
                map = (Map) obj;
            }
            Class BXG = r7.BXG();
            AnonymousClass0K6 r2 = (AnonymousClass0K6) map.get(BXG);
            if (r2 == null) {
                r2 = new AnonymousClass0K6(r7.getClass());
                C22821Di BVg = r7.BVg();
                if (BVg != null) {
                    r4 = new C07120aP(BVg);
                }
                r2.A00 = r4;
            }
            map.put(BXG, r2);
            return r2;
        }
    }

    public static final void A02(Context context) {
        C18070vi.A0d(context, 0);
        synchronized (A01) {
            if (!(!A02.containsKey(context))) {
                throw AnonymousClass000.A0n("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    public static final void A03(Context context) {
        C18070vi.A0d(context, 0);
        synchronized (A01) {
            Map map = A02;
            AnonymousClass0IH r0 = (AnonymousClass0IH) map.remove(context);
            if (r0 != null) {
                r0.A00();
            }
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                AnonymousClass0IH r1 = (AnonymousClass0IH) A16.getValue();
                if (A06((Context) A16.getKey(), context)) {
                    A15.remove();
                    r1.A00();
                }
            }
            A05.put(A00(context), AnonymousClass000.A0i());
        }
    }

    public static final Context A00(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
            C18070vi.A0X(context);
        }
        return context;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.0Qz] */
    public static final void A04(Context context) {
        if (context instanceof AnonymousClass1F9) {
            synchronized (A01) {
                WeakHashMap weakHashMap = A03;
                if (!weakHashMap.containsKey(context)) {
                    weakHashMap.put(context, AnonymousClass000.A0i());
                    C26176Ctu.A01(new AnonymousClass0Z8(context));
                }
            }
        } else if (A00 == null) {
            A00 = new Object();
            Context applicationContext = context.getApplicationContext();
            C18070vi.A0z(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(A00);
        }
    }

    public static final boolean A06(Context context, Context context2) {
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            C18070vi.A0X(context2);
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            C18070vi.A0X(context);
        }
        return AnonymousClass000.A1Z(context, context2);
    }

    public static final void A05(Context context, C17110tl r2, AnonymousClass0ME r3, Object obj) {
        C22821Di BVg;
        AnonymousClass0K6 A012;
        if ((!r2.BXH().A01 || (A012 = A01(context, r2, r3)) == null || !A012.A02(obj)) && (BVg = r2.BVg()) != null) {
            BVg.invoke(obj);
        }
    }
}
