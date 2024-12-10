package X;

/* renamed from: X.4Y1  reason: invalid class name */
public final class AnonymousClass4Y1 {
    public final boolean A00;

    public AnonymousClass4Y1() {
        this(false);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4Y1) && this.A00 == ((AnonymousClass4Y1) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(isEditing=");
        return C17900vP.A0F(A10, this.A00);
    }

    public AnonymousClass4Y1(boolean z) {
        this.A00 = z;
    }
}
