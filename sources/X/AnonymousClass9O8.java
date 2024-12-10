package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.9O8  reason: invalid class name */
public abstract class AnonymousClass9O8 {
    public static Handler A00(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass9O7.A00(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            Constructor<Handler> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
            Object[] objArr = new Object[3];
            objArr[0] = looper;
            objArr[1] = null;
            AnonymousClass8BR.A1L(objArr, 2, true);
            return declaredConstructor.newInstance(objArr);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw AnonymousClass8BR.A0x(cause);
        }
    }
}
