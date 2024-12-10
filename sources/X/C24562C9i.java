package X;

/* renamed from: X.C9i  reason: case insensitive filesystem */
public abstract class C24562C9i {
    public static final int A00(C24274ByX byX, Integer num, boolean z) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 131073;
        }
        if ((i & 15) == 1) {
            int ordinal = byX.ordinal();
            if (ordinal == 1) {
                i = (i & -32769) | 524288;
            } else if (ordinal == 2) {
                i = (i | 32768) & -524289;
            }
        }
        if (z) {
            return i & -131073;
        }
        return i;
    }
}
