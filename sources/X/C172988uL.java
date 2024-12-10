package X;

/* renamed from: X.8uL  reason: invalid class name and case insensitive filesystem */
public final class C172988uL extends C180759Nu {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C172988uL) && this.A00 == ((C172988uL) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C172988uL(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Boolean(value=");
        return C17900vP.A0F(A10, this.A00);
    }
}
