package kotlinx.coroutines.android;

import X.C18560wh;
import X.C18580wj;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class AndroidExceptionPreHandler extends C18580wj implements CoroutineExceptionHandler {
    public volatile Object _preHandler = this;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.A00);
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void handleException(C18560wh r4, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            Method preHandler = preHandler();
            Object obj = null;
            if (preHandler != null) {
                obj = preHandler.invoke((Object) null, new Object[0]);
            }
            if ((obj instanceof Thread.UncaughtExceptionHandler) && (uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj) != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
