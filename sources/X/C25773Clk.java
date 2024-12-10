package X;

/* renamed from: X.Clk  reason: case insensitive filesystem */
public final class C25773Clk {
    public final C25645CjY A00;
    public final C25785Clw A01;

    public C25773Clk(C25645CjY cjY, C25785Clw clw) {
        C18070vi.A0d(cjY, 2);
        this.A01 = clw;
        this.A00 = cjY;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25773Clk)) {
            return false;
        }
        C25773Clk clk = (C25773Clk) obj;
        return C18070vi.A18(this.A01, clk.A01) && C18070vi.A18(this.A00, clk.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SplitAttributes");
        A10.append(":{splitType=");
        A10.append(this.A01);
        A10.append(", layoutDir=");
        A10.append(this.A00);
        return AnonymousClass000.A0y(" }", A10);
    }

    public C25773Clk() {
        this(C25645CjY.A03, C25785Clw.A02);
    }
}
