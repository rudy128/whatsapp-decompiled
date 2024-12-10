package X;

import java.util.Random;

/* renamed from: X.2ix  reason: invalid class name and case insensitive filesystem */
public final class C57362ix {
    public Random A00 = new Random();
    public final C18030ve A01;

    public C57362ix(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public final int A00(int i) {
        double nextDouble;
        double A0F = (double) this.A01.A0F(C18040vf.A02, 9963);
        if (A0F < 0.02d) {
            nextDouble = 0.0d;
        } else {
            if (A0F > 10.0d) {
                A0F = 10.0d;
            }
            nextDouble = ((A0F - 0.02d) * this.A00.nextDouble()) + 0.02d;
        }
        return (int) (((double) i) * nextDouble);
    }
}
