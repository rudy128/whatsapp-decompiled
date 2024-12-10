package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.CvL  reason: case insensitive filesystem */
public abstract class C26229CvL {
    public static /* synthetic */ long A02(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return A03(0, i, 0, i2);
    }

    public static final long A03(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("maxWidth(");
            A10.append(i2);
            A10.append(") must be >= than minWidth(");
            A10.append(i);
            A10.append(')');
            throw AnonymousClass000.A0j(A10);
        } else if (i4 < i3) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("maxHeight(");
            A102.append(i4);
            A102.append(") must be >= than minHeight(");
            A102.append(i3);
            A102.append(')');
            throw AnonymousClass000.A0j(A102);
        } else if (i >= 0 && i3 >= 0) {
            return Constraints.A01.A02(i, i2, i3, i4);
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("minWidth(");
            A103.append(i);
            A103.append(") and minHeight(");
            A103.append(i3);
            throw AnonymousClass001.A12(") must be >= 0", A103);
        }
    }

    public static /* synthetic */ long A04(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return A05(i, i2, j);
    }

    public static final int A00(long j, int i) {
        return C28851b7.A03(i, Constraints.A02(j), Constraints.A00(j));
    }

    public static final int A01(long j, int i) {
        return C28851b7.A03(i, Constraints.A03(j), Constraints.A01(j));
    }

    public static final long A05(int i, int i2, long j) {
        int A03 = Constraints.A03(j) + i;
        if (A03 < 0) {
            A03 = 0;
        }
        int A01 = Constraints.A01(j);
        if (A01 != Integer.MAX_VALUE && (A01 = A01 + i) < 0) {
            A01 = 0;
        }
        int A02 = Constraints.A02(j) + i2;
        if (A02 < 0) {
            A02 = 0;
        }
        int A00 = Constraints.A00(j);
        if (A00 != Integer.MAX_VALUE && (A00 = A00 + i2) < 0) {
            A00 = 0;
        }
        return A03(A03, A01, A02, A00);
    }

    public static final long A06(long j, long j2) {
        return C25293Ccv.A00(C28851b7.A03(AnonymousClass000.A0G(j2), Constraints.A03(j), Constraints.A01(j)), C28851b7.A03(AnonymousClass000.A0H(j2), Constraints.A02(j), Constraints.A00(j)));
    }
}
