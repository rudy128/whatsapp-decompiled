package X;

/* renamed from: X.4Sk  reason: invalid class name and case insensitive filesystem */
public final class C86634Sk {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86634Sk) && this.A00 == ((C86634Sk) obj).A00);
    }

    public int hashCode() {
        return this.A00 * 31;
    }

    public C86634Sk(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScrollByState(distancePx=");
        A10.append(this.A00);
        A10.append(", durationMs=");
        return AnonymousClass001.A1L(A10, 0);
    }
}
