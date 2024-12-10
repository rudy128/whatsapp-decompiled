package X;

/* renamed from: X.0Ux  reason: invalid class name and case insensitive filesystem */
public final class C05610Ux implements C17100tk {
    public final C17330uU A00 = AnonymousClass0Q9.A02(C33321id.A04);
    public final C17330uU A01 = AnonymousClass0Q9.A04(true);
    public final int A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C05610Ux) && this.A02 == ((C05610Ux) obj).A02;
        }
        return true;
    }

    public final C33321id A00() {
        return (C33321id) this.A00.getValue();
    }

    public final void A01(AnonymousClass1HO r4) {
        int i = this.A02;
        this.A00.setValue(r4.A07(i));
        AnonymousClass000.A1C(this.A01, r4.A0F(i));
    }

    public C05610Ux(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public int BNd(C28644ECa eCa) {
        return A00().A00;
    }

    public int BTy(C28644ECa eCa, C24246By4 by4) {
        return A00().A01;
    }

    public int BYN(C28644ECa eCa, C24246By4 by4) {
        return A00().A02;
    }

    public int Bab(C28644ECa eCa) {
        return A00().A03;
    }

    public int hashCode() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A03);
        A10.append('(');
        A10.append(A00().A01);
        A10.append(", ");
        A10.append(A00().A03);
        A10.append(", ");
        A10.append(A00().A02);
        A10.append(", ");
        return AnonymousClass001.A1L(A10, A00().A00);
    }
}
