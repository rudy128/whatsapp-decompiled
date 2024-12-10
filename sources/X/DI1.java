package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

public final class DI1 implements C28622EAu {
    public static final DI1 A01 = new DI1(C17880vN.A0D());
    public final Bundle A00;

    public /* synthetic */ DI1(Bundle bundle) {
        this.A00 = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DI1)) {
            return false;
        }
        Bundle bundle = this.A00;
        Bundle bundle2 = ((DI1) obj).A00;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (!C25332Cdd.A01(bundle.get(A0v), bundle2.get(A0v))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass000.A0P(this.A00, AnonymousClass3MW.A1a(), 0);
    }
}
