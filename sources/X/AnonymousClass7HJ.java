package X;

/* renamed from: X.7HJ  reason: invalid class name */
public final class AnonymousClass7HJ implements AnonymousClass857 {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7HJ) && this.A00 == ((AnonymousClass7HJ) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public AnonymousClass7HJ(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GoogleGalleryActivityCheckResult(isSuccess=");
        return C17900vP.A0F(A10, this.A00);
    }
}
