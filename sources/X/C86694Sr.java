package X;

/* renamed from: X.4Sr  reason: invalid class name and case insensitive filesystem */
public final class C86694Sr {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86694Sr) && this.A00 == ((C86694Sr) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C86694Sr(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PhotoViewState(hasProfilePhoto=");
        return C17900vP.A0F(A10, this.A00);
    }
}
