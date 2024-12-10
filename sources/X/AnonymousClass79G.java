package X;

import android.webkit.ValueCallback;
import com.whatsapp.util.Log;

/* renamed from: X.79G  reason: invalid class name */
public class AnonymousClass79G implements ValueCallback {
    public final int A00;

    public AnonymousClass79G(int i) {
        this.A00 = i;
    }

    public final void onReceiveValue(Object obj) {
        if (2 - this.A00 != 0) {
            Log.e((String) obj);
        } else if (!AnonymousClass000.A1Y(obj)) {
            Log.e("WebViewWrapperView/configWebView: Safe browsing is not enabled");
        }
    }
}
