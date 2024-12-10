package X;

/* renamed from: X.8kr  reason: invalid class name and case insensitive filesystem */
public final class C169328kr extends C180589Nd {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169328kr) && this.A00 == ((C169328kr) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C169328kr(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OpenNowChip(isSelected=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C169328kr() {
        this(false);
    }
}
