package X;

import android.app.Activity;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.7Ea  reason: invalid class name and case insensitive filesystem */
public class C143597Ea implements C22540BBx {
    public final /* synthetic */ DeepLinkActivity A00;
    public final /* synthetic */ WeakReference A01;

    public void C2M() {
    }

    public /* synthetic */ void C8D() {
    }

    public C143597Ea(DeepLinkActivity deepLinkActivity, WeakReference weakReference) {
        this.A00 = deepLinkActivity;
        this.A01 = weakReference;
    }

    public void C8C(C62602rf r3) {
        String str;
        if (r3 != null) {
            int i = r3.A00;
            if (i == 0) {
                str = "Conversation/createSyncContactTaskCallback/onSyncCompleted/NETWORK_UNAVAILABLE/";
            } else if (i == 4) {
                str = "Conversation/createSyncContactTaskCallback/onSyncCompleted/SYNC_REQUEST_FAILED/";
            }
            Log.w(str);
        }
        Activity activity = (Activity) this.A01.get();
        if (activity != null && !AnonymousClass4Yv.A02(activity)) {
            activity.finish();
        }
    }
}
