package X;

/* renamed from: X.0QG  reason: invalid class name */
public final class AnonymousClass0QG {
    public static final long A01 = AnonymousClass001.A0p(Float.NaN, Float.NaN);
    public static final long A02 = AnonymousClass001.A0p(0.0f, 0.0f);
    public final long A00;

    public static final float A00(long j) {
        if (j != A01) {
            return AnonymousClass001.A01(j);
        }
        throw AnonymousClass000.A0n("Size is unspecified");
    }

    public static final float A02(long j) {
        if (j != A01) {
            return AnonymousClass001.A02(j);
        }
        throw AnonymousClass000.A0n("Size is unspecified");
    }

    public static String A03(long j) {
        if (j == A01) {
            return "Size.Unspecified";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Size(");
        C02460Ec.A00(A10, A02(j));
        A10.append(", ");
        C02460Ec.A00(A10, A00(j));
        return AnonymousClass001.A1J(A10);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass0QG) || j != ((AnonymousClass0QG) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        return A03(this.A00);
    }

    public /* synthetic */ AnonymousClass0QG(long j) {
        this.A00 = j;
    }

    public static final float A01(long j) {
        return Math.min(Math.abs(A02(j)), Math.abs(A00(j)));
    }

    public static final boolean A04(long j) {
        if (A02(j) <= 0.0f || A00(j) <= 0.0f) {
            return true;
        }
        return false;
    }
}
