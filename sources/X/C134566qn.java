package X;

/* renamed from: X.6qn  reason: invalid class name and case insensitive filesystem */
public final class C134566qn {
    public final int A00;
    public final C22821Di A01;

    public C134566qn(C22821Di r2, int i) {
        C18070vi.A0d(r2, 2);
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134566qn) {
                C134566qn r5 = (C134566qn) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, 1664253726) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SeeLessUiState(textRes=");
        A10.append(2131895586);
        A10.append(", handler=");
        A10.append(this.A01);
        A10.append(", id=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
