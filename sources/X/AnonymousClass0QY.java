package X;

/* renamed from: X.0QY  reason: invalid class name */
public final class AnonymousClass0QY {
    public static final long A01 = AnonymousClass001.A0p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long A02 = AnonymousClass001.A0p(Float.NaN, Float.NaN);
    public static final long A03 = AnonymousClass001.A0p(0.0f, 0.0f);
    public final long A00;

    public static final float A01(long j) {
        if (j != A02) {
            return AnonymousClass001.A02(j);
        }
        throw AnonymousClass000.A0n("Offset is unspecified");
    }

    public static final float A02(long j) {
        if (j != A02) {
            return AnonymousClass001.A01(j);
        }
        throw AnonymousClass000.A0n("Offset is unspecified");
    }

    public static String A06(long j) {
        if (j == A02) {
            return "Offset.Unspecified";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Offset(");
        C02460Ec.A00(A10, A01(j));
        A10.append(", ");
        C02460Ec.A00(A10, A02(j));
        return AnonymousClass001.A1J(A10);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass0QY) || j != ((AnonymousClass0QY) obj).A00) {
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

    public /* synthetic */ AnonymousClass0QY(long j) {
        this.A00 = j;
    }

    public static final float A00(long j) {
        return (float) Math.sqrt((double) ((A01(j) * A01(j)) + (A02(j) * A02(j))));
    }

    public static final long A03(float f, long j) {
        return AnonymousClass001.A0p(A01(j) * f, A02(j) * f);
    }

    public static final long A04(long j, long j2) {
        return AnonymousClass001.A0p(A01(j) - A01(j2), A02(j) - A02(j2));
    }

    public static final long A05(long j, long j2) {
        return AnonymousClass001.A0p(A01(j) + A01(j2), A02(j) + A02(j2));
    }
}
