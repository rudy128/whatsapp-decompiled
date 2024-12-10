package X;

/* renamed from: X.34q  reason: invalid class name and case insensitive filesystem */
public final class C687734q implements B5K {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C687734q) && this.A00 == ((C687734q) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C687734q(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingCapiValues(isCapiGroupMessage=");
        return C17900vP.A0F(A10, this.A00);
    }
}
