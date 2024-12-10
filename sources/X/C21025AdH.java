package X;

/* renamed from: X.AdH  reason: case insensitive filesystem */
public final class C21025AdH implements C22388B5r {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C21025AdH) && this.A00 == ((C21025AdH) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C21025AdH(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Requesting(showProgress=");
        return C17900vP.A0F(A10, this.A00);
    }
}
