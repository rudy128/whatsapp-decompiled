package X;

import android.app.Application;
import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.114  reason: invalid class name */
public abstract class AnonymousClass114 implements AnonymousClass113 {
    public static ThreadLocal A00 = new AnonymousClass117();
    public static final AnonymousClass116 A01 = new AnonymousClass116(new C65262w6(1));
    public static volatile Context A02;

    public static Context A00() {
        if (A02 == null) {
            int i = 0;
            while (A02 == null) {
                try {
                    Thread.sleep(1);
                    i++;
                    if (i >= 5 && A02 == null) {
                        throw new IllegalStateException("Application is Null, was FbInjector.setApplication() called?");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return A02;
    }

    public static void A01(Application application) {
        if (application != null) {
            A02 = application;
            return;
        }
        throw new IllegalStateException("SetApplication called with a null application");
    }

    public static void A02(Context context) {
        A00.set(context);
    }

    public static AnonymousClass114 get(Context context) {
        Object Bha;
        AnonymousClass116 r3 = A01;
        WeakHashMap weakHashMap = r3.A01;
        Reference reference = (Reference) weakHashMap.get(context);
        if (reference == null || (Bha = reference.get()) == null) {
            Bha = r3.A00.Bha(context);
            synchronized (r3) {
                weakHashMap.put(context, new WeakReference(Bha));
            }
        }
        return (AnonymousClass114) Bha;
    }
}
