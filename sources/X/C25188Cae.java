package X;

/* renamed from: X.Cae  reason: case insensitive filesystem */
public final class C25188Cae {
    public final C26235CvV A00;
    public final E6I A01;
    public final C24477C5s A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25188Cae) {
                C25188Cae cae = (C25188Cae) obj;
                if (!C18070vi.A18(this.A01, cae.A01) || !C18070vi.A18(this.A02, cae.A02) || !C18070vi.A18(this.A00, cae.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01)));
    }

    public C25188Cae(C26235CvV cvV, E6I e6i, C24477C5s c5s) {
        C18070vi.A0j(e6i, c5s);
        this.A01 = e6i;
        this.A02 = c5s;
        this.A00 = cvV;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksTreeManagerModification(target=");
        A10.append(this.A01);
        A10.append(", updateOperation=");
        A10.append(this.A02);
        A10.append(", parseResult=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
