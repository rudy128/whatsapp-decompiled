package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.8Bt  reason: invalid class name and case insensitive filesystem */
public final class C161108Bt extends BroadcastReceiver {
    public final /* synthetic */ AMF A00;

    public void onReceive(Context context, Intent intent) {
        String A1E;
        C18070vi.A0d(intent, 1);
        AMF amf = this.A00;
        if (!AnonymousClass112.A02()) {
            A1E = "BackgroundRestrictionManager; received event on unsupported OS version.";
        } else if (!C17890vO.A1S(intent, "android.net.conn.RESTRICT_BACKGROUND_CHANGED")) {
            A1E = AnonymousClass001.A1E(intent, "BackgroundRestrictionManager; received unsupported intent: ", AnonymousClass000.A10());
        } else {
            Iterator A0m = AnonymousClass8BX.A0m(amf.A00);
            while (A0m.hasNext()) {
                AQ7 aq7 = (AQ7) A0m.next();
                C21446AkD.A00(aq7.A02, aq7, 39);
            }
            return;
        }
        Log.w(A1E);
    }

    public C161108Bt(AMF amf) {
        this.A00 = amf;
    }
}
