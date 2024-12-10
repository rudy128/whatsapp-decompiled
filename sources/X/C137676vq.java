package X;

import java.util.Set;

/* renamed from: X.6vq  reason: invalid class name and case insensitive filesystem */
public abstract class C137676vq {
    public static final Set A00;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1L(numArr, 401);
        AnonymousClass000.A1M(numArr, 406);
        AnonymousClass3Ma.A1S(numArr, 407);
        C17890vO.A1G(numArr, 403);
        AnonymousClass3Ma.A1T(numArr, 412);
        A00 = C200410p.A0S(numArr);
    }

    public static final boolean A00(AnonymousClass206 r4) {
        Integer num;
        AW0 A002;
        AnonymousClass8pG r0;
        if (AnonymousClass25B.A00(r4) == null || !r4.A0v.A02) {
            return false;
        }
        AW0 A003 = AnonymousClass25B.A00(r4);
        if (A003 != null) {
            num = Integer.valueOf(A003.A02);
        } else {
            num = null;
        }
        if (C29431cG.A18(A00, num)) {
            return true;
        }
        if (num == null || num.intValue() != 408 || (A002 = AnonymousClass25B.A00(r4)) == null || (r0 = A002.A0A) == null || r0.A09() != 403) {
            return false;
        }
        return true;
    }
}
