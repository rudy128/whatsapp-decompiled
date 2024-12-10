package X;

import android.app.ActivityThread;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

public abstract class CGH {
    public static C26374Cya A00;

    public static C26374Cya A00() {
        C26374Cya cya = A00;
        if (cya != null) {
            return cya;
        }
        try {
            ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
            Method declaredMethod = ActivityThread.class.getDeclaredMethod("getHandler", new Class[0]);
            declaredMethod.setAccessible(true);
            Handler handler = (Handler) declaredMethod.invoke(currentActivityThread, new Object[0]);
            if (handler == null) {
                Log.w("Fixie ActivityThread main handler unexpectedly null");
                return null;
            }
            C26374Cya cya2 = new C26374Cya(handler);
            A00 = cya2;
            return cya2;
        } catch (Exception unused) {
        }
    }
}
