package X;

/* renamed from: X.7Mj  reason: invalid class name and case insensitive filesystem */
public final class C145727Mj implements C1598185z {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C145727Mj) && this.A00 == ((C145727Mj) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C145727Mj(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RefreshAdapter(deltaMediaCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
