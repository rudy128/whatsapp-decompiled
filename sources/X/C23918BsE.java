package X;

/* renamed from: X.BsE  reason: case insensitive filesystem */
public final class C23918BsE extends C4N {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23918BsE) && this.A00 == ((C23918BsE) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public C23918BsE(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Length(length=");
        return C17900vP.A0E(A10, this.A00);
    }
}
