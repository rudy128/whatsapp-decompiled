package X;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.C8u  reason: case insensitive filesystem */
public abstract class C24549C8u {
    public static Context A00(Context context, Class cls) {
        Context baseContext;
        while (!cls.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return context;
    }
}
