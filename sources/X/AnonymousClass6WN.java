package X;

import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.6WN  reason: invalid class name */
public abstract class AnonymousClass6WN {
    public static final void A00(C18090vk r2) {
        if (Build.VERSION.SDK_INT >= 23) {
            r2.invoke();
        } else {
            Log.e("FlowsLogger/FlowsWebBridgeCallable/checkApi() -- Api check failed");
        }
    }
}
