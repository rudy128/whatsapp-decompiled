package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6vK  reason: invalid class name and case insensitive filesystem */
public final class C137356vK {
    public static final C1418377d A00(Integer num, String str, List list) {
        Object obj;
        C18070vi.A0d(list, 0);
        if (str != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (str.equals(((C1418377d) obj).A07)) {
                    break;
                }
            }
            C1418377d r2 = (C1418377d) obj;
            if (r2 != null) {
                return r2;
            }
        }
        int size = list.size();
        int intValue = num.intValue();
        if (size > intValue) {
            return (C1418377d) list.get(intValue);
        }
        return null;
    }
}
