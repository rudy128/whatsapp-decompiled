package X;

/* renamed from: X.Cw5  reason: case insensitive filesystem */
public final class C26260Cw5 {
    public static final long A01 = AnonymousClass001.A0r(0);
    public final long A00;

    public static final /* synthetic */ C26260Cw5 A03(long j) {
        return new C26260Cw5(j);
    }

    public final /* synthetic */ long A06() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C26260Cw5) || j != ((C26260Cw5) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        long j = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextRange(");
        BE8.A1D(A10, AnonymousClass000.A0G(j));
        return AnonymousClass001.A1L(A10, AnonymousClass000.A0H(j));
    }

    public /* synthetic */ C26260Cw5(long j) {
        this.A00 = j;
    }

    public static final int A00(long j) {
        return A01(j) - A02(j);
    }

    public static final int A01(long j) {
        int A0G = AnonymousClass000.A0G(j);
        int A0H = AnonymousClass000.A0H(j);
        if (A0G > A0H) {
            return A0G;
        }
        return A0H;
    }

    public static final int A02(long j) {
        int A0G = AnonymousClass000.A0G(j);
        int A0H = AnonymousClass000.A0H(j);
        if (A0G > A0H) {
            return A0H;
        }
        return A0G;
    }

    public static final boolean A04(long j) {
        return AnonymousClass000.A1T(AnonymousClass000.A0G(j), AnonymousClass000.A0H(j));
    }

    public static final boolean A05(long j) {
        return C108975cc.A1D(AnonymousClass000.A0G(j), AnonymousClass000.A0H(j));
    }
}
