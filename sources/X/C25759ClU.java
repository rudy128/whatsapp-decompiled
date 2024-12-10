package X;

/* renamed from: X.ClU  reason: case insensitive filesystem */
public final class C25759ClU {
    public final long A00;

    public static String A00(long j) {
        if (j == 0) {
            return "Unspecified";
        }
        if (j == 4294967296L) {
            return "Sp";
        }
        if (j == 8589934592L) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C25759ClU) || j != ((C25759ClU) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ C25759ClU(long j) {
        this.A00 = j;
    }
}
