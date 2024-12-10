package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9Oi  reason: invalid class name and case insensitive filesystem */
public abstract class C180889Oi {
    public static void A00(Intent intent, BA8 ba8) {
        Bundle extras;
        if (intent.getExtras() != null && (extras = intent.getExtras()) != null) {
            Set<String> keySet = extras.keySet();
            ArrayList A13 = AnonymousClass000.A13();
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                Object obj = extras.get(A0v);
                if (obj != null && AnonymousClass8Qk.class.getClassLoader().equals(obj.getClass().getClassLoader())) {
                    A13.add(A0v);
                }
            }
            Iterator it2 = A13.iterator();
            while (it2.hasNext()) {
                String A0v2 = C17880vN.A0v(it2);
                intent.removeExtra(A0v2);
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A10("Removed an internal class in a different-key intent: ", A0v2, " => ", A10);
                ba8.CFI("ExternalIntentSanitization", C17890vO.A0V(extras.get(A0v2), A10), (Throwable) null);
            }
        }
    }
}
