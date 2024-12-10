package X;

/* renamed from: X.BsD  reason: case insensitive filesystem */
public final class C23917BsD extends C4N {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23917BsD) && this.A00 == ((C23917BsD) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public C23917BsD(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Backreference(index=");
        return C17900vP.A0E(A10, this.A00);
    }
}
