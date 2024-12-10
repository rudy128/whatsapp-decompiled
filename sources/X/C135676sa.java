package X;

/* renamed from: X.6sa  reason: invalid class name and case insensitive filesystem */
public final class C135676sa {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C22821Di A03;

    public C135676sa(C22821Di r2, int i, int i2, int i3) {
        C18070vi.A0d(r2, 2);
        this.A02 = i;
        this.A03 = r2;
        this.A00 = i2;
        this.A01 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135676sa) {
                C135676sa r5 = (C135676sa) obj;
                if (!(this.A02 == r5.A02 && C18070vi.A18(this.A03, r5.A03) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A03, this.A02 * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewMoreUiState(textRes=");
        A10.append(this.A02);
        A10.append(", handler=");
        A10.append(this.A03);
        A10.append(", id=");
        A10.append(this.A00);
        A10.append(", style=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
