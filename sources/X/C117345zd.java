package X;

/* renamed from: X.5zd  reason: invalid class name and case insensitive filesystem */
public final class C117345zd extends AnonymousClass6T7 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C117345zd) && this.A00 == ((C117345zd) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C117345zd(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loading(amount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
