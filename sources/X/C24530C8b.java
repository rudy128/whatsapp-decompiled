package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.C8b  reason: case insensitive filesystem */
public abstract class C24530C8b {
    public static String A00(List list) {
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A10.append(C17880vN.A0v(it));
            A10.append(";");
        }
        return A10.toString();
    }
}
