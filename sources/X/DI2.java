package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class DI2 implements C28622EAu {
    public static final DI2 A01;
    public final Bundle A00;

    public /* synthetic */ DI2(Bundle bundle) {
        this.A00 = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof DI2) {
                Bundle bundle = new Bundle(this.A00);
                Bundle bundle2 = new Bundle(((DI2) obj).A00);
                if (bundle.size() == bundle2.size()) {
                    Iterator<String> it = bundle.keySet().iterator();
                    while (it.hasNext()) {
                        String A0v = C17880vN.A0v(it);
                        if (bundle2.containsKey(A0v)) {
                            if (!C25332Cdd.A01(bundle.get(A0v), bundle2.get(A0v))) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundle = new Bundle(this.A00);
        int size = bundle.size();
        ArrayList A0z = C17880vN.A0z(size + size);
        ArrayList A10 = C17880vN.A10(bundle.keySet());
        Collections.sort(A10);
        int size2 = A10.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) A10.get(i);
            A0z.add(str);
            A0z.add(bundle.get(str));
        }
        return AnonymousClass000.A0P(A0z, AnonymousClass3MW.A1a(), 0);
    }

    static {
        Bundle A0D = C17880vN.A0D();
        if (!A0D.containsKey("accountTypes")) {
            A0D.putStringArrayList("accountTypes", C17880vN.A0z(0));
        }
        A01 = new DI2(A0D);
    }
}
