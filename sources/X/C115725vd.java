package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5vd  reason: invalid class name and case insensitive filesystem */
public final class C115725vd extends AnonymousClass17I {
    public String A03(C187029f9 r4, Map map) {
        int i;
        boolean A16 = C18070vi.A16(map, r4);
        Iterator A0l = C17890vO.A0l(map);
        if (A0l.hasNext()) {
            switch (((C1404571m) A0l.next()).A01) {
                case 3489014:
                    i = 10;
                    break;
                case 3489016:
                    r4.A00 = A16 ? 1 : 0;
                    break;
                case 3489017:
                    i = 8;
                    break;
                case 3489018:
                    i = 9;
                    break;
            }
            r4.A00 = i;
        }
        return super.A03(r4, map);
    }
}
