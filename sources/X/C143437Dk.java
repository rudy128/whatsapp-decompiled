package X;

/* renamed from: X.7Dk  reason: invalid class name and case insensitive filesystem */
public final class C143437Dk implements C1594984t {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C143437Dk) && this.A00 == ((C143437Dk) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C143437Dk(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConfirmationDialog(age=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
