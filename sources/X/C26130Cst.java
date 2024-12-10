package X;

/* renamed from: X.Cst  reason: case insensitive filesystem */
public final class C26130Cst {
    public static final long A01 = C26054CrP.A01(Float.NaN, 0);
    public static final C25759ClU[] A02 = {new C25759ClU(0), new C25759ClU(4294967296L), new C25759ClU(8589934592L)};
    public final long A00;

    public static final long A00(long j) {
        return A02[AnonymousClass8BR.A02(j & 1095216660480L)].A00;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C26130Cst) || j != ((C26130Cst) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        return A01(this.A00);
    }

    public /* synthetic */ C26130Cst(long j) {
        this.A00 = j;
    }

    public static String A01(long j) {
        StringBuilder A10;
        String str;
        long A002 = A00(j);
        if (A002 == 0) {
            return "Unspecified";
        }
        if (A002 == 4294967296L) {
            A10 = AnonymousClass000.A10();
            A10.append(AnonymousClass001.A01(j));
            str = ".sp";
        } else if (A002 != 8589934592L) {
            return "Invalid";
        } else {
            A10 = AnonymousClass000.A10();
            A10.append(AnonymousClass001.A01(j));
            str = ".em";
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
