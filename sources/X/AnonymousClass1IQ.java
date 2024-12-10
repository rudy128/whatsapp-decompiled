package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.1IQ  reason: invalid class name */
public abstract class AnonymousClass1IQ {
    public static final AnonymousClass1IS A00;
    public static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new AnonymousClass1IT(A00(Looper.getMainLooper()), (String) null, false);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            obj2 = obj;
        }
        A00 = (AnonymousClass1IS) obj2;
    }

    public static final Handler A00(Looper looper) {
        Object newInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            C18070vi.A0z(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            Class cls = Handler.class;
            try {
                newInstance = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, true});
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }

    public static final AnonymousClass1IT A01(Handler handler) {
        return new AnonymousClass1IT(handler, "windowRecomposer cleanup", false);
    }
}
