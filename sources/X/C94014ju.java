package X;

/* renamed from: X.4ju  reason: invalid class name and case insensitive filesystem */
public final class C94014ju implements AnonymousClass5XE {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C94014ju) && this.A00 == ((C94014ju) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C94014ju(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Header(title=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
