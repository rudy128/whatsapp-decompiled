package X;

/* renamed from: X.3hl  reason: invalid class name and case insensitive filesystem */
public final class C75583hl extends AnonymousClass4E5 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75583hl) && this.A00 == ((C75583hl) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C75583hl(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Local(stringRes=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
