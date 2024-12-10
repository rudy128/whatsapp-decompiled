package X;

/* renamed from: X.Ct5  reason: case insensitive filesystem */
public final class C26142Ct5 {
    public final long A00;

    public static final /* synthetic */ C26142Ct5 A00(long j) {
        return new C26142Ct5(j);
    }

    public final /* synthetic */ long A03() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        return A02(obj, this.A00);
    }

    public static boolean A02(Object obj, long j) {
        if (!(obj instanceof C26142Ct5) || j != ((C26142Ct5) obj).A00) {
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

    public /* synthetic */ C26142Ct5(long j) {
        this.A00 = j;
    }

    public static String A01(long j) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(AnonymousClass000.A0G(j));
        A10.append(" x ");
        return C17880vN.A0t(A10, AnonymousClass000.A0H(j));
    }
}
