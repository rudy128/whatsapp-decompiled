package X;

/* renamed from: X.0Ur  reason: invalid class name and case insensitive filesystem */
public final class C05550Ur implements AnonymousClass0tB {
    public final C17100tk A00;
    public final C28644ECa A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05550Ur)) {
            return false;
        }
        C05550Ur r4 = (C05550Ur) obj;
        return C18070vi.A18(this.A00, r4.A00) && C18070vi.A18(this.A01, r4.A01);
    }

    public float BDk() {
        C28644ECa eCa = this.A01;
        return eCa.CPG(this.A00.BNd(eCa));
    }

    public float BDp(C24246By4 by4) {
        C28644ECa eCa = this.A01;
        return eCa.CPG(this.A00.BTy(eCa, by4));
    }

    public float BDx(C24246By4 by4) {
        C28644ECa eCa = this.A01;
        return eCa.CPG(this.A00.BYN(eCa, by4));
    }

    public float BE0() {
        C28644ECa eCa = this.A01;
        return eCa.CPG(this.A00.Bab(eCa));
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C05550Ur(C17100tk r1, C28644ECa eCa) {
        this.A00 = r1;
        this.A01 = eCa;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InsetsPaddingValues(insets=");
        A10.append(this.A00);
        A10.append(", density=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
