package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6lT  reason: invalid class name and case insensitive filesystem */
public final class C131666lT {
    public final C24661Le A00;

    public C131666lT(C24661Le r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C127866f4 A00(Map map) {
        Map A0C = this.A00.A0C();
        C18070vi.A0X(A0C);
        Set keySet = map.keySet();
        LinkedHashSet A14 = C17880vN.A14();
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : keySet) {
            AnonymousClass3MZ.A1V(next, A13, A0C.containsKey(next) ? 1 : 0);
        }
        A14.addAll(A13);
        A14.addAll(A0C.keySet());
        return new C127866f4(A0C, A14);
    }
}
