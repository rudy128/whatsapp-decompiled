package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Xe  reason: invalid class name and case insensitive filesystem */
public abstract class C124136Xe {
    public static final ArrayList A00(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1418377d A0x = C108945cZ.A0x(it);
            String str = A0x.A0B;
            String str2 = A0x.A0F;
            if (str == null || str2 == null || !C108975cc.A1M(str)) {
                A13.add(A0x);
            }
        }
        return A13;
    }
}
