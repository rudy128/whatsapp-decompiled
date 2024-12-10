package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3vY  reason: invalid class name and case insensitive filesystem */
public class C79513vY extends C95134lk {
    public Integer BXA(int i) {
        if (i == 1 || i == 5 || i == 9 || i == 19) {
            return AnonymousClass00R.A00;
        }
        return super.BXA(i);
    }

    public List A01() {
        List A01 = super.A01();
        Integer[] numArr = new Integer[8];
        AnonymousClass000.A1L(numArr, 35);
        AnonymousClass3MX.A1R(numArr, 1);
        C17880vN.A1T(numArr, 8, 2);
        C17890vO.A1G(numArr, 5);
        AnonymousClass3Ma.A1T(numArr, 9);
        C17880vN.A1T(numArr, 19, 5);
        C17890vO.A1H(numArr, 21);
        List A0O = C18070vi.A0O(39, numArr, 7);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : A01) {
            AnonymousClass3MZ.A1V(next, A13, AnonymousClass3Ma.A1b(A0O, AnonymousClass000.A0M(next)) ? 1 : 0);
        }
        return C29431cG.A0k(A13, A0O);
    }
}
