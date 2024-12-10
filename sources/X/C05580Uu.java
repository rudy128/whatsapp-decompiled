package X;

/* renamed from: X.0Uu  reason: invalid class name and case insensitive filesystem */
public final class C05580Uu implements C17100tk {
    public final C17100tk A00;
    public final C17100tk A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05580Uu)) {
            return false;
        }
        C05580Uu r4 = (C05580Uu) obj;
        return C18070vi.A18(r4.A01, this.A01) && C18070vi.A18(r4.A00, this.A00);
    }

    public int BNd(C28644ECa eCa) {
        int BNd = this.A01.BNd(eCa) - this.A00.BNd(eCa);
        if (BNd < 0) {
            return 0;
        }
        return BNd;
    }

    public int BTy(C28644ECa eCa, C24246By4 by4) {
        int BTy = this.A01.BTy(eCa, by4) - this.A00.BTy(eCa, by4);
        if (BTy < 0) {
            return 0;
        }
        return BTy;
    }

    public int BYN(C28644ECa eCa, C24246By4 by4) {
        int BYN = this.A01.BYN(eCa, by4) - this.A00.BYN(eCa, by4);
        if (BYN < 0) {
            return 0;
        }
        return BYN;
    }

    public int Bab(C28644ECa eCa) {
        int Bab = this.A01.Bab(eCa) - this.A00.Bab(eCa);
        if (Bab < 0) {
            return 0;
        }
        return Bab;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C05580Uu(C17100tk r1, C17100tk r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('(');
        A10.append(this.A01);
        A10.append(" - ");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
