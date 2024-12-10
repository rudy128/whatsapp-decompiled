package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Pr  reason: invalid class name and case insensitive filesystem */
public abstract class C181239Pr {
    public static final List A00(List list) {
        C18070vi.A0d(list, 0);
        HashSet A12 = C17880vN.A12();
        HashMap A11 = C17880vN.A11();
        Map A02 = C200510q.A02(C17880vN.A11(), B22.A00);
        for (Object next : list) {
            if (A12.add(next)) {
                C17890vO.A0z(next, A11, A12.size());
            }
            C17880vN.A1P(next, A02, AnonymousClass000.A0M(AnonymousClass8BV.A0m(next, A02)) + 1);
        }
        return C29431cG.A0y(C17880vN.A10(A12), new C21481Akm(A11, new C21479Akk(A02, 5), 0));
    }
}
