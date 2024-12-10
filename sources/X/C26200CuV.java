package X;

/* renamed from: X.CuV  reason: case insensitive filesystem */
public final class C26200CuV {
    public static final long A01 = AnonymousClass001.A0p(Float.NaN, Float.NaN);
    public static final long A02 = AnonymousClass001.A0p(0.0f, 0.0f);
    public final long A00;

    public static final /* synthetic */ C26200CuV A02(long j) {
        return new C26200CuV(j);
    }

    public final /* synthetic */ long A03() {
        return this.A00;
    }

    public static final float A00(long j) {
        if (j != A01) {
            return AnonymousClass001.A01(j);
        }
        throw AnonymousClass000.A0n("DpSize is unspecified");
    }

    public static final float A01(long j) {
        if (j != A01) {
            return AnonymousClass001.A02(j);
        }
        throw AnonymousClass000.A0n("DpSize is unspecified");
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C26200CuV) || j != ((C26200CuV) obj).A00) {
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
            return "DpSize.Unspecified";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(DSH.A01(A01(j)));
        A10.append(" x ");
        return C17890vO.A0V(DSH.A01(A00(j)), A10);
    }

    public /* synthetic */ C26200CuV(long j) {
        this.A00 = j;
    }
}
