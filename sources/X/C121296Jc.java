package X;

/* renamed from: X.6Jc  reason: invalid class name and case insensitive filesystem */
public final class C121296Jc extends AnonymousClass6U0 {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C121296Jc) && this.A00 == ((C121296Jc) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C121296Jc(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SpacerItem(isDummy=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C121296Jc() {
        this(false);
    }
}
