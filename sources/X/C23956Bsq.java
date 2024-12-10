package X;

/* renamed from: X.Bsq  reason: case insensitive filesystem */
public final class C23956Bsq extends C4U {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23956Bsq) && this.A00 == ((C23956Bsq) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public C23956Bsq(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Varint(value=");
        return C17900vP.A0E(A10, this.A00);
    }
}
