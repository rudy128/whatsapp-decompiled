package X;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.CoF  reason: case insensitive filesystem */
public abstract class C25903CoF {
    public static final C71213Ej A00;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Collection, java.util.ArrayList, X.3Ej] */
    static {
        Integer[] numArr = new Integer[4];
        AnonymousClass000.A1L(numArr, 2);
        AnonymousClass000.A1M(numArr, 7);
        C17880vN.A1T(numArr, 4, 2);
        C17890vO.A1G(numArr, 5);
        ? arrayList = new ArrayList(4);
        Collections.addAll(arrayList, numArr);
        A00 = arrayList;
    }

    public static final int A01(C25786Clx clx, DRJ drj) {
        if (clx.A00 != -2) {
            DRJ.A03(drj);
            int i = drj.A02;
            if (i == 90 || i == 180 || i == 270) {
                DRJ.A03(drj);
                return drj.A02;
            }
        }
        return 0;
    }

    public static final int A00(C25786Clx clx, DRJ drj) {
        DRJ.A03(drj);
        int i = drj.A00;
        C71213Ej r3 = A00;
        int indexOf = r3.indexOf(Integer.valueOf(i));
        if (indexOf >= 0) {
            int i2 = clx.A00;
            if (i2 == -1) {
                i2 = 0;
            }
            return AnonymousClass8BU.A03(r3.get((indexOf + (i2 / 90)) % r3.size()));
        }
        throw AnonymousClass000.A0k("Only accepts inverted exif orientations");
    }
}
