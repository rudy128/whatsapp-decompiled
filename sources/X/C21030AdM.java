package X;

/* renamed from: X.AdM  reason: case insensitive filesystem */
public final class C21030AdM implements C22389B5s {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C21030AdM) && this.A00 == ((C21030AdM) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C21030AdM(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Requesting(showProgress=");
        return C17900vP.A0F(A10, this.A00);
    }
}
