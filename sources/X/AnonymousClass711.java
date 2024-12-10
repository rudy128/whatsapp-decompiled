package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.711  reason: invalid class name */
public abstract class AnonymousClass711 {
    public static AnonymousClass8B0[] A00 = {new AnonymousClass7JC(0), new AnonymousClass7JC(1), new AnonymousClass7JC(2), new AnonymousClass7JC(3), new AnonymousClass7JC(4), new AnonymousClass7JC(5)};
    public static AnonymousClass8B0[] A01;

    public static AnonymousClass8B0[] A01(C18030ve r8) {
        AnonymousClass7JC r0;
        AnonymousClass8B0[] r02 = A01;
        if (r02 != null) {
            return r02;
        }
        ArrayList A13 = AnonymousClass000.A13();
        C18040vf r1 = C18040vf.A02;
        boolean A05 = C18020vd.A05(r1, r8, 11490);
        boolean A052 = C18020vd.A05(r1, r8, 11973);
        if (A05) {
            A13.add(new AnonymousClass7JC(9));
        }
        if (A05 || !A052) {
            A13.add(new AnonymousClass7JC(6));
            A13.add(new AnonymousClass7JC(7));
            r0 = new AnonymousClass7JC(8);
        } else {
            A13.add(new AnonymousClass7JC(8));
            A13.add(new AnonymousClass7JC(6));
            r0 = new AnonymousClass7JC(7);
        }
        A13.add(r0);
        AnonymousClass8B0[] r03 = (AnonymousClass8B0[]) A13.toArray(new AnonymousClass8B0[0]);
        A01 = r03;
        return r03;
    }

    public static ArrayList A00(C18030ve r6) {
        AnonymousClass8B0[] A012;
        ArrayList A13 = AnonymousClass000.A13();
        for (Integer intValue : AnonymousClass00R.A00(2)) {
            if (intValue.intValue() != 0) {
                A012 = A00;
            } else {
                A012 = A01(r6);
            }
            A13.addAll(Arrays.asList(A012));
        }
        return A13;
    }
}
