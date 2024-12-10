package X;

/* renamed from: X.BuE  reason: case insensitive filesystem */
public final class C24027BuE extends C24489C6h {
    public final C441822l A00;
    public final boolean A01;
    public final boolean A02;

    public C24027BuE(C441822l r2, boolean z, boolean z2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = z;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24027BuE) {
                C24027BuE buE = (C24027BuE) obj;
                if (!(C18070vi.A18(this.A00, buE.A00) && this.A01 == buE.A01 && this.A02 == buE.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A01), this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Transcribe(message=");
        A10.append(this.A00);
        A10.append(", isExplicitUserRequest=");
        A10.append(this.A01);
        A10.append(", isMigrationRequest=");
        return C17900vP.A0F(A10, this.A02);
    }
}
