package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.CoE  reason: case insensitive filesystem */
public final class C25902CoE {
    public static final C25902CoE A00 = new Object();

    public static final Activity A00(Context context, C25902CoE coE) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C18070vi.A0X(baseContext);
        return A00(baseContext, coE);
    }
}
