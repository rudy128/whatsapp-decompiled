package X;

import android.content.Context;

/* renamed from: X.Cfl  reason: case insensitive filesystem */
public class C25438Cfl {
    public static Context A00;
    public static Boolean A01;

    public static synchronized boolean A00(Context context) {
        boolean z;
        Boolean bool;
        Boolean bool2;
        synchronized (C25438Cfl.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = A00;
            if (context2 == null || (bool2 = A01) == null || context2 != applicationContext) {
                A01 = null;
                if (C25333Cde.A00()) {
                    bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                    A01 = bool;
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        bool = AnonymousClass000.A0i();
                        A01 = bool;
                    } catch (ClassNotFoundException unused) {
                        bool = false;
                        A01 = bool;
                    }
                }
                A00 = applicationContext;
                z = bool.booleanValue();
            } else {
                z = bool2.booleanValue();
            }
        }
        return z;
    }
}
