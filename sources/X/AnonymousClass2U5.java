package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.2U5  reason: invalid class name */
public abstract class AnonymousClass2U5 {
    public static void A00(Bundle bundle, Jid jid, String str) {
        if (!bundle.containsKey(str)) {
            bundle.putString(str, C22971Dz.A06(jid));
            return;
        }
        throw AnonymousClass001.A12(" already used", AnonymousClass000.A11(str));
    }
}
