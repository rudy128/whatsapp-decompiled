package X;

import java.util.Random;

/* renamed from: X.2pi  reason: invalid class name and case insensitive filesystem */
public class C61452pi {
    public final AnonymousClass18O A00;
    public final Random A01;
    public final C18030ve A02;

    public static long A00(C61452pi r3, int i, int i2) {
        int nextInt;
        C18030ve r2 = r3.A02;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, i)) {
            int A002 = C18020vd.A00(r1, r2, i2);
            if (A002 <= 0) {
                return 0;
            }
            nextInt = r3.A01.nextInt(A002);
        } else {
            AnonymousClass18O r22 = r3.A00;
            Random random = r3.A01;
            int A04 = r22.A04(AnonymousClass18O.A1A);
            if (A04 <= 0) {
                return 0;
            }
            nextInt = random.nextInt(A04 * 2);
        }
        return C17890vO.A03(nextInt);
    }

    public C61452pi(AnonymousClass18O r1, C18030ve r2, Random random) {
        this.A01 = random;
        this.A00 = r1;
        this.A02 = r2;
    }
}
