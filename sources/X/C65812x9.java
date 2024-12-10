package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2x9  reason: invalid class name and case insensitive filesystem */
public class C65812x9 implements C22415B6x {
    public final C22415B6x A00;
    public final Set A01;

    public /* bridge */ /* synthetic */ Object BKe(C199029zJ r4, C25681CkC ckC, String str) {
        for (C65802x8 r1 : this.A01) {
            if (r1.A00.contains(str)) {
                return r1.BKe(r4, ckC, str);
            }
        }
        C22415B6x b6x = this.A00;
        if (b6x != null) {
            return b6x.BKe(r4, ckC, str);
        }
        return null;
    }

    public C65812x9(C22415B6x b6x, Set set) {
        HashMap A11 = C17880vN.A11();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C65802x8 r4 = (C65802x8) it.next();
            Iterator it2 = r4.A00.iterator();
            while (it2.hasNext()) {
                String A0v = C17880vN.A0v(it2);
                if (A11.containsKey(A0v)) {
                    String simpleName = getClass().getSimpleName();
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Duplicate support for action=");
                    A10.append(A0v);
                    A10.append(" by ");
                    A10.append(r4);
                    A10.append(" and ");
                    Log.e(simpleName, C17890vO.A0V(A11.get(A0v), A10));
                }
                A11.put(A0v, r4);
            }
        }
        this.A01 = set;
        this.A00 = b6x;
    }
}
