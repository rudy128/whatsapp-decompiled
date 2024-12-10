package X;

/* renamed from: X.7Cz  reason: invalid class name and case insensitive filesystem */
public final class C143337Cz implements C1594184l {
    public final Object A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143337Cz) {
                C143337Cz r5 = (C143337Cz) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
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

    public C143337Cz(boolean z, Object obj) {
        this.A01 = z;
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loading(isFirstLoad=");
        A10.append(this.A01);
        A10.append(", data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
