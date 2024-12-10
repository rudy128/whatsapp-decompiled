package X;

/* renamed from: X.4ik  reason: invalid class name and case insensitive filesystem */
public final class C93294ik implements C106715Wx {
    public final boolean A00;

    public C93294ik() {
        this(false);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93294ik) && this.A00 == ((C93294ik) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Hidden(animate=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C93294ik(boolean z) {
        this.A00 = z;
    }
}
