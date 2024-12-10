package X;

/* renamed from: X.8kp  reason: invalid class name and case insensitive filesystem */
public final class C169308kp extends C180589Nd {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169308kp) && this.A00 == ((C169308kp) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C169308kp(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DistanceChip(isSelected=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C169308kp() {
        this(false);
    }
}
