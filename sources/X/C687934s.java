package X;

/* renamed from: X.34s  reason: invalid class name and case insensitive filesystem */
public final class C687934s implements B5K {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C687934s) && this.A00 == ((C687934s) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C687934s(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingLiveLocationValues(duration=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
