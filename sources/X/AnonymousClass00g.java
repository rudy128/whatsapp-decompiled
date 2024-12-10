package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.00g  reason: invalid class name */
public abstract class AnonymousClass00g {
    public static Application A00(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find an Application in the given context: ");
        sb.append(context);
        throw new IllegalStateException(sb.toString());
    }
}
