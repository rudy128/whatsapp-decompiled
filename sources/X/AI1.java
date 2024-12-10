package X;

public final class AI1 implements C22403B6g {
    public final Object A00;
    public final int A01;
    public final C22403B6g A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AI1) {
                AI1 ai1 = (AI1) obj;
                if (!C18070vi.A18(this.A02, ai1.A02) || !C18070vi.A18(this.A00, ai1.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A02) + AnonymousClass001.A0k(this.A00);
    }

    public AI1(C22403B6g b6g, Object obj) {
        this.A02 = b6g;
        this.A00 = obj;
        this.A01 = b6g.BYg();
    }

    public int BYg() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConfigWithLayoutData(config=");
        A10.append(this.A02);
        A10.append(", layoutData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
