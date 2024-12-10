package X;

public final class A1l {
    public final C194549ru A00;
    public final C20270AEd A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A1l) {
                A1l a1l = (A1l) obj;
                if (this.A02 != a1l.A02 || !C18070vi.A18(this.A00, a1l.A00) || !C18070vi.A18(this.A01, a1l.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass3MX.A03(this.A02) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public A1l(C194549ru r1, C20270AEd aEd, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = aEd;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(isLoading=");
        A10.append(this.A02);
        A10.append(", errorMessage=");
        A10.append(this.A00);
        A10.append(", methodDetailsState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public A1l() {
        this((C194549ru) null, (C20270AEd) null, false);
    }
}
