package X;

/* renamed from: X.C7q  reason: case insensitive filesystem */
public abstract class C24522C7q {
    public static final boolean A00(DFL dfl) {
        DFL A09;
        C18070vi.A0d(dfl, 0);
        DFL A0P = BE7.A0P(dfl);
        if (A0P == null || A0P.A05 != 13366 || (A09 = A0P.A09(54)) == null) {
            return false;
        }
        boolean A0I = A09.A0I(35, false);
        String A0e = BE7.A0e(A09);
        if (A0e == null) {
            A0e = "start";
        }
        if (!A0I || !A0e.equals("start")) {
            return false;
        }
        return true;
    }
}
