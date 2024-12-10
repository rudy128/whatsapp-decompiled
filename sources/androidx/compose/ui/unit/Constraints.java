package androidx.compose.ui.unit;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C17900vP;
import X.C25705Cka;

public final class Constraints {
    public static final C25705Cka A01 = new Object();
    public static final int[] A02 = {18, 20, 17, 15};
    public static final int[] A03 = {32767, 8191, 65535, 262143};
    public static final int[] A04 = {65535, 262143, 32767, 8191};
    public final long A00;

    public static final /* synthetic */ Constraints A05(long j) {
        return new Constraints(j);
    }

    public final /* synthetic */ long A0B() {
        return this.A00;
    }

    public static final int A00(long j) {
        int i = (int) (j & 3);
        int i2 = ((int) (j >> (A02[i] + 31))) & A03[i];
        int i3 = i2 - 1;
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public static final int A01(long j) {
        int i = ((int) (j >> 33)) & A04[(int) (j & 3)];
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public static final int A02(long j) {
        int i = (int) (j & 3);
        return ((int) (j >> A02[i])) & A03[i];
    }

    public static final int A03(long j) {
        return ((int) (j >> 2)) & A04[(int) (j & 3)];
    }

    public static /* synthetic */ long A04(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = A03(j);
        }
        if ((i5 & 2) != 0) {
            i2 = A01(j);
        }
        if ((i5 & 4) != 0) {
            i3 = A02(j);
        }
        if ((i5 & 8) != 0) {
            i4 = A00(j);
        }
        if (i3 < 0 || i < 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("minHeight(");
            A10.append(i3);
            A10.append(") and minWidth(");
            A10.append(i);
            throw AnonymousClass001.A12(") must be >= 0", A10);
        } else if (i2 < i) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("maxWidth(");
            A102.append(i2);
            A102.append(") must be >= minWidth(");
            A102.append(i);
            A102.append(')');
            throw AnonymousClass000.A0j(A102);
        } else if (i4 >= i3) {
            return A01.A02(i, i2, i3, i4);
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("maxHeight(");
            A103.append(i4);
            A103.append(") must be >= minHeight(");
            A103.append(i3);
            A103.append(')');
            throw AnonymousClass000.A0j(A103);
        }
    }

    public static final boolean A07(long j) {
        int i = (int) (j & 3);
        return AnonymousClass000.A1O(((int) (j >> (A02[i] + 31))) & A03[i]);
    }

    public static final boolean A08(long j) {
        return AnonymousClass000.A1O(((int) (j >> 33)) & A04[(int) (j & 3)]);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof Constraints) || j != ((Constraints) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        return A06(this.A00);
    }

    public /* synthetic */ Constraints(long j) {
        this.A00 = j;
    }

    public static String A06(long j) {
        String valueOf;
        int A012 = A01(j);
        String str = "Infinity";
        if (A012 == Integer.MAX_VALUE) {
            valueOf = str;
        } else {
            valueOf = String.valueOf(A012);
        }
        int A002 = A00(j);
        if (A002 != Integer.MAX_VALUE) {
            str = String.valueOf(A002);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Constraints(minWidth = ");
        A10.append(A03(j));
        A10.append(", maxWidth = ");
        A10.append(valueOf);
        A10.append(", minHeight = ");
        A10.append(A02(j));
        A10.append(", maxHeight = ");
        return C17900vP.A0B(str, A10);
    }

    public static final boolean A09(long j) {
        return AnonymousClass000.A1T(A00(j), A02(j));
    }

    public static final boolean A0A(long j) {
        return AnonymousClass000.A1T(A01(j), A03(j));
    }
}
