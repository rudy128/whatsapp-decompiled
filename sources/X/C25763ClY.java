package X;

/* renamed from: X.ClY  reason: case insensitive filesystem */
public final class C25763ClY {
    public final long A00;

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C25763ClY) || j != ((C25763ClY) obj).A00) {
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
        A10.append("Size(packedValue=");
        return C17900vP.A0E(A10, j);
    }

    public /* synthetic */ C25763ClY(long j) {
        this.A00 = j;
    }

    public static final float A00(long j) {
        return AnonymousClass001.A01(j);
    }
}
