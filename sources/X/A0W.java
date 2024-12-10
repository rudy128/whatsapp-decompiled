package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class A0W {
    public static final Set A00;

    public boolean A01(int i) {
        return !C108965cb.A1b(A00, i);
    }

    static {
        HashSet A12 = C17880vN.A12();
        C17890vO.A1D(A12, 2498049);
        C17890vO.A1D(A12, 2498048);
        C17890vO.A1D(A12, 2498050);
        C17890vO.A1D(A12, 2498051);
        C17890vO.A1D(A12, 2498052);
        C17890vO.A1D(A12, 2498053);
        C17890vO.A1D(A12, 2498056);
        C17890vO.A1D(A12, 2498054);
        C17890vO.A1D(A12, 2498101);
        A00 = Collections.unmodifiableSet(A12);
    }

    public final int A00(int i) {
        if (i == 2498101) {
            return 443;
        }
        switch (i) {
            case 2498048:
                return 451;
            case 2498049:
            case 2498050:
            case 2498051:
            case 2498052:
                return 404;
            case 2498053:
                return 406;
            case 2498054:
                return 421;
            case 2498055:
                return 500;
            case 2498056:
                return 0;
            default:
                return -1;
        }
    }
}
