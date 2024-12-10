package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cpa  reason: case insensitive filesystem */
public final class C25968Cpa {
    public static final String A00(Integer num, String str, List list, int i) {
        String str2;
        C18070vi.A0d(str, 1);
        if (list != null) {
            str2 = C25339Cdy.A00(num, list.subList(0, i));
        } else {
            str2 = null;
        }
        String A01 = C25339Cdy.A01(str, str2);
        C18070vi.A0X(A01);
        return A01;
    }

    public final Object A02(C23736Boh boh, String str, int i) {
        C18070vi.A0d(str, 1);
        List list = boh.A06;
        if (list == null) {
            throw AnonymousClass000.A0k("Keypath must be set on environment if trying to getVariableWithScope on a depth larger than 0.");
        } else if (i <= list.size()) {
            Object A02 = C25881Cns.A02(boh, A00(AnonymousClass00R.A00, str, list, i));
            if (A02 == null) {
                return C25881Cns.A02(boh, str);
            }
            return A02;
        } else {
            throw AnonymousClass000.A0k("Depth supplied should never exceed the size of the key path.");
        }
    }

    public static final Map A01(C23736Boh boh) {
        Map map = boh.A09;
        if (map == null) {
            DOZ doz = boh.A00;
            if (doz != null) {
                C26962DNk A01 = C26272CwJ.A01(doz);
                C18070vi.A0X(A01);
                if (C26176Ctu.A03()) {
                    C25011CTl cTl = A01.A05;
                    if (cTl != null) {
                        map = cTl.A07;
                    } else {
                        map = Collections.emptyMap();
                    }
                    C18070vi.A0X(map);
                } else {
                    throw AnonymousClass8BR.A0w("Expanded Variables can only be read from the UI Thread");
                }
            } else {
                throw AnonymousClass000.A0n("no BloksContext or variables override");
            }
        }
        return map;
    }
}
