package X;

/* renamed from: X.8uK  reason: invalid class name and case insensitive filesystem */
public final class C172978uK extends AnonymousClass9MO {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C172978uK) && this.A00 == ((C172978uK) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public C172978uK(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ListIndex(value=");
        return C17900vP.A0E(A10, this.A00);
    }
}
