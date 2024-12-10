package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;

/* renamed from: X.2SP  reason: invalid class name */
public abstract class AnonymousClass2SP {
    public static Display A00(Context context) {
        try {
            return context.getDisplay();
        } catch (UnsupportedOperationException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("The context:");
            A10.append(context);
            Log.w("ContextCompat", AnonymousClass000.A0y(" is not associated with any display. Return a fallback display instead.", A10));
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }
}
