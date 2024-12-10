package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3vX  reason: invalid class name and case insensitive filesystem */
public final class C79503vX extends C95134lk {
    public Integer BXA(int i) {
        if (i == 8 || i == 21) {
            return AnonymousClass00R.A01;
        }
        if (i == 32 || i == 33) {
            return AnonymousClass00R.A00;
        }
        return super.BXA(i);
    }

    public List A01() {
        List A01 = super.A01();
        Integer[] numArr = new Integer[6];
        AnonymousClass000.A1L(numArr, 1);
        C17880vN.A1T(numArr, 33, 1);
        AnonymousClass3Ma.A1S(numArr, 32);
        C17890vO.A1G(numArr, 21);
        AnonymousClass3Ma.A1T(numArr, 5);
        List A0O = C18070vi.A0O(AnonymousClass3MY.A0g(), numArr, 5);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : A01) {
            AnonymousClass3MZ.A1V(next, A13, AnonymousClass3Ma.A1b(A0O, AnonymousClass000.A0M(next)) ? 1 : 0);
        }
        return C29431cG.A0k(A13, A0O);
    }
}
