package X;

/* renamed from: X.CuU  reason: case insensitive filesystem */
public final class C26199CuU {
    public static final long A01 = AnonymousClass001.A0p(0.0f, 0.0f);
    public final long A00;

    public static final /* synthetic */ C26199CuU A01(long j) {
        return new C26199CuU(j);
    }

    public final /* synthetic */ long A03() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C26199CuU) || j != ((C26199CuU) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        return A02(this.A00);
    }

    public /* synthetic */ C26199CuU(long j) {
        this.A00 = j;
    }

    public static final long A00(long j, long j2) {
        return AnonymousClass001.A0p(AnonymousClass000.A03(j) - AnonymousClass000.A03(j2), AnonymousClass001.A01(j) - AnonymousClass001.A01(j2));
    }

    public static String A02(long j) {
        StringBuilder A0r = BE9.A0r();
        A0r.append(AnonymousClass001.A02(j));
        A0r.append(", ");
        A0r.append(AnonymousClass001.A01(j));
        return AnonymousClass000.A0y(") px/sec", A0r);
    }
}
