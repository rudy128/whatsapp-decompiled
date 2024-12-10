package X;

/* renamed from: X.BsU  reason: case insensitive filesystem */
public final class C23934BsU extends C4Q {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23934BsU) && this.A00 == ((C23934BsU) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public C23934BsU(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Int(value=");
        return C17900vP.A0E(A10, this.A00);
    }
}
