package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0Nj  reason: invalid class name and case insensitive filesystem */
public abstract class C04430Nj {
    public static final int A00(float f, int i, long j, boolean z) {
        int i2;
        if ((z || i == 2) && Constraints.A08(j)) {
            i2 = Constraints.A01(j);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        int A03 = Constraints.A03(j);
        if (A03 != i2) {
            return C28851b7.A03(AnonymousClass0E0.A00(f), A03, i2);
        }
        return i2;
    }

    public static final long A01(float f, int i, long j, boolean z) {
        return C26229CvL.A02(A00(f, i, j, z), Constraints.A00(j), 5);
    }

    public static final long A02(C25705Cka cka, int i, int i2) {
        int i3 = 262142;
        int min = Math.min(i, 262142);
        if (min >= 8191) {
            if (min < 32767) {
                i3 = 65534;
            } else {
                i3 = 8190;
                if (min < 65535) {
                    i3 = 32766;
                }
            }
        }
        return cka.A01(min, Math.min(i2, i3));
    }
}
