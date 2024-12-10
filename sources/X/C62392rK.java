package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2rK  reason: invalid class name and case insensitive filesystem */
public class C62392rK {
    public View A00;
    public final ArrayList A01 = AnonymousClass000.A13();
    public final Map A02 = C17880vN.A11();

    public boolean equals(Object obj) {
        if (obj instanceof C62392rK) {
            C62392rK r3 = (C62392rK) obj;
            if (this.A00 != r3.A00 || !this.A02.equals(r3.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + this.A02.hashCode();
    }

    public C62392rK(View view) {
        this.A00 = view;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TransitionValues@");
        A10.append(Integer.toHexString(hashCode()));
        StringBuilder A11 = AnonymousClass000.A11(AnonymousClass000.A0y(":\n", A10));
        A11.append("    view = ");
        A11.append(this.A00);
        String A0y = AnonymousClass000.A0y("    values:", AnonymousClass000.A11(AnonymousClass000.A0y("\n", A11)));
        Map map = this.A02;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            StringBuilder A112 = AnonymousClass000.A11(A0y);
            A112.append("    ");
            A112.append(A0v);
            A112.append(": ");
            A112.append(map.get(A0v));
            A0y = AnonymousClass000.A0y("\n", A112);
        }
        return A0y;
    }

    @Deprecated
    public C62392rK() {
    }
}
