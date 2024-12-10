package X;

import java.util.List;
import java.util.ListIterator;

/* renamed from: X.9PH  reason: invalid class name */
public abstract class AnonymousClass9PH {
    public static final String A00(String str) {
        List list;
        List A01 = new C41661wr(",").A01(str, 0);
        if (!A01.isEmpty()) {
            ListIterator A18 = C108955ca.A18(A01);
            while (true) {
                if (A18.hasPrevious()) {
                    if (C108985cd.A08(A18) != 0) {
                        list = C108985cd.A0t(A01, A18);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list = C18460wS.A00;
        String[] A1b = C108955ca.A1b(list);
        String A0c = C17890vO.A0c(AnonymousClass000.A11("CN"), '=');
        for (String str2 : A1b) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A0u = C109005cf.A0u(str2, i2);
                if (z) {
                    if (!A0u) {
                        break;
                    }
                    length--;
                } else if (!A0u) {
                    z = true;
                } else {
                    i++;
                }
            }
            String A0g = C108985cd.A0g(length, i, str2);
            if (AnonymousClass1YE.A0A(A0g, A0c, false)) {
                return C108955ca.A0z(A0g, A0c.length());
            }
        }
        return null;
    }
}
