package X;

/* renamed from: X.BsR  reason: case insensitive filesystem */
public final class C23931BsR extends C4Q {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23931BsR) && this.A00 == ((C23931BsR) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C23931BsR(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Boolean(value=");
        return C17900vP.A0F(A10, this.A00);
    }
}
