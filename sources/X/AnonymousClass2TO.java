package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2TO  reason: invalid class name */
public abstract class AnonymousClass2TO {
    public static String[] A00(Collection collection) {
        String[] strArr = new String[(collection.size() * 3)];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C60002nE r3 = (C60002nE) it.next();
            int i2 = i * 3;
            strArr[i2] = r3.A03;
            C17880vN.A1S(strArr, r3.A01, i2 + 1);
            C17880vN.A1S(strArr, r3.A00, i2 + 2);
            i++;
        }
        return strArr;
    }
}
