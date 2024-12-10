package X;

public abstract class C86 {
    public static boolean A00(C26207Cui cui, int i, boolean z) {
        int i2 = cui.A00 - cui.A01;
        if (i2 < 7) {
            if (!z) {
                throw C24215BxS.A00(AnonymousClass001.A1I("too short header: ", AnonymousClass000.A10(), i2));
            }
        } else if (cui.A04() != i) {
            if (!z) {
                StringBuilder A10 = AnonymousClass000.A10();
                BE9.A1J("expected header type ", A10, i);
                throw C24215BxS.A00(A10.toString());
            }
        } else if (cui.A04() == 118 && cui.A04() == 111 && cui.A04() == 114 && cui.A04() == 98 && cui.A04() == 105 && cui.A04() == 115) {
            return true;
        } else {
            if (!z) {
                throw C24215BxS.A00("expected characters 'vorbis'");
            }
        }
        return false;
    }
}
