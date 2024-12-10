package X;

/* renamed from: X.A1d  reason: case insensitive filesystem */
public final class C19968A1d {
    public final C194559rv A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19968A1d) {
                C19968A1d a1d = (C19968A1d) obj;
                if (this.A01 != a1d.A01 || !C18070vi.A18(this.A00, a1d.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C19968A1d(C194559rv r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(isLoading=");
        A10.append(this.A01);
        A10.append(", errorMessage=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C19968A1d() {
        this((C194559rv) null, false);
    }
}
