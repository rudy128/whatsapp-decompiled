package X;

/* renamed from: X.CuT  reason: case insensitive filesystem */
public final class C26198CuT {
    public static final long A01 = AnonymousClass001.A0p(Float.NaN, Float.NaN);
    public final long A00;

    public static final /* synthetic */ C26198CuT A02(long j) {
        return new C26198CuT(j);
    }

    public final /* synthetic */ long A03() {
        return this.A00;
    }

    public static final float A00(long j) {
        if (j != A01) {
            return AnonymousClass001.A02(j);
        }
        throw AnonymousClass000.A0n("DpOffset is unspecified");
    }

    public static final float A01(long j) {
        if (j != A01) {
            return AnonymousClass001.A01(j);
        }
        throw AnonymousClass000.A0n("DpOffset is unspecified");
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C26198CuT) || j != ((C26198CuT) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        long j = this.A00;
        if (j == A01) {
            return "DpOffset.Unspecified";
        }
        StringBuilder A0r = BE9.A0r();
        A0r.append(DSH.A01(A00(j)));
        A0r.append(", ");
        return AnonymousClass001.A1F(DSH.A01(A01(j)), A0r);
    }

    public /* synthetic */ C26198CuT(long j) {
        this.A00 = j;
    }
}
