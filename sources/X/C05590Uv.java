package X;

/* renamed from: X.0Uv  reason: invalid class name and case insensitive filesystem */
public final class C05590Uv implements C17100tk {
    public final C17100tk A00;
    public final C17100tk A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05590Uv)) {
            return false;
        }
        C05590Uv r4 = (C05590Uv) obj;
        return C18070vi.A18(r4.A00, this.A00) && C18070vi.A18(r4.A01, this.A01);
    }

    public int BNd(C28644ECa eCa) {
        return Math.max(this.A00.BNd(eCa), this.A01.BNd(eCa));
    }

    public int BTy(C28644ECa eCa, C24246By4 by4) {
        return Math.max(this.A00.BTy(eCa, by4), this.A01.BTy(eCa, by4));
    }

    public int BYN(C28644ECa eCa, C24246By4 by4) {
        return Math.max(this.A00.BYN(eCa, by4), this.A01.BYN(eCa, by4));
    }

    public int Bab(C28644ECa eCa) {
        return Math.max(this.A00.Bab(eCa), this.A01.Bab(eCa));
    }

    public int hashCode() {
        return this.A00.hashCode() + AnonymousClass000.A0L(this.A01);
    }

    public C05590Uv(C17100tk r1, C17100tk r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('(');
        A10.append(this.A00);
        A10.append(" ∪ ");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
