package X;

/* renamed from: X.Ct6  reason: case insensitive filesystem */
public final class C26143Ct6 {
    public static final long A01 = AnonymousClass001.A0r(0);
    public final long A00;

    public static final /* synthetic */ C26143Ct6 A00(long j) {
        return new C26143Ct6(j);
    }

    public final /* synthetic */ long A02() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C26143Ct6) || j != ((C26143Ct6) obj).A00) {
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

    public /* synthetic */ C26143Ct6(long j) {
        this.A00 = j;
    }

    public static String A01(long j) {
        StringBuilder A0r = BE9.A0r();
        BE8.A1D(A0r, AnonymousClass000.A0G(j));
        return AnonymousClass001.A1L(A0r, AnonymousClass000.A0H(j));
    }
}
