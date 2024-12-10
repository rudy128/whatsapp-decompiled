package X;

/* renamed from: X.8ok  reason: invalid class name and case insensitive filesystem */
public final class C170108ok extends AnonymousClass9MK {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C170108ok) && this.A00 == ((C170108ok) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C170108ok(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(signalType=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
