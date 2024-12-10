package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Cka  reason: case insensitive filesystem */
public final class C25705Cka {
    public static final int A00(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Can't represent a size of ");
        A10.append(i);
        throw AnonymousClass001.A12(" in Constraints", A10);
    }

    public final long A01(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            return A02(i, i, i2, i2);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("width(");
        A10.append(i);
        A10.append(") and height(");
        A10.append(i2);
        throw AnonymousClass001.A12(") must be >= 0", A10);
    }

    public final long A02(int i, int i2, int i3, int i4) {
        long j;
        int i5 = i4;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        }
        int A00 = A00(i5);
        int i6 = i2;
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        }
        int A002 = A00(i6);
        if (A00 + A002 <= 31) {
            if (A002 == 13) {
                j = 3;
            } else if (A002 == 18) {
                j = 1;
            } else if (A002 == 15) {
                j = 2;
            } else if (A002 == 16) {
                j = 0;
            } else {
                throw AnonymousClass000.A0n("Should only have the provided constants.");
            }
            int i7 = 0;
            int i8 = i2 + 1;
            if (i2 == Integer.MAX_VALUE) {
                i8 = 0;
            }
            if (i4 != Integer.MAX_VALUE) {
                i7 = i4 + 1;
            }
            int i9 = Constraints.A02[(int) j];
            return (((long) i8) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i7) << (i9 + 31));
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Can't represent a width of ");
        A10.append(i6);
        A10.append(" and height of ");
        A10.append(i5);
        throw AnonymousClass001.A12(" in Constraints", A10);
    }
}
