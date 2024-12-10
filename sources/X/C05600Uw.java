package X;

/* renamed from: X.0Uw  reason: invalid class name and case insensitive filesystem */
public final class C05600Uw implements C17100tk {
    public final C17330uU A00;
    public final String A01;

    public int BNd(C28644ECa eCa) {
        return ((AnonymousClass0K0) this.A00.getValue()).A00;
    }

    public int BTy(C28644ECa eCa, C24246By4 by4) {
        return ((AnonymousClass0K0) this.A00.getValue()).A01;
    }

    public int BYN(C28644ECa eCa, C24246By4 by4) {
        return ((AnonymousClass0K0) this.A00.getValue()).A02;
    }

    public int Bab(C28644ECa eCa) {
        return ((AnonymousClass0K0) this.A00.getValue()).A03;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C05600Uw)) {
            return false;
        }
        return C18070vi.A18(this.A00.getValue(), ((C05600Uw) obj).A00.getValue());
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public C05600Uw(AnonymousClass0K0 r2, String str) {
        this.A01 = str;
        this.A00 = AnonymousClass0Q9.A02(r2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("(left=");
        C17330uU r1 = this.A00;
        A10.append(((AnonymousClass0K0) r1.getValue()).A01);
        A10.append(", top=");
        A10.append(((AnonymousClass0K0) r1.getValue()).A03);
        A10.append(", right=");
        A10.append(((AnonymousClass0K0) r1.getValue()).A02);
        A10.append(", bottom=");
        return AnonymousClass001.A1L(A10, ((AnonymousClass0K0) r1.getValue()).A00);
    }
}
