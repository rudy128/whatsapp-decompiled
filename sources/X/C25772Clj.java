package X;

/* renamed from: X.Clj  reason: case insensitive filesystem */
public final class C25772Clj {
    public final C26131Csu A00;
    public final C25706Ckc A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25772Clj) {
                C25772Clj clj = (C25772Clj) obj;
                if (!C18070vi.A18(this.A00, clj.A00) || !C18070vi.A18(this.A01, clj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0l = AnonymousClass001.A0l(this.A01) * 31;
        C26131Csu csu = this.A00;
        if (csu != null) {
            i = csu.hashCode();
        }
        return A0l + i;
    }

    public C25772Clj(C26131Csu csu, C25706Ckc ckc) {
        this.A01 = ckc;
        this.A00 = csu;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PlatformTextStyle(spanStyle=");
        A10.append(this.A01);
        A10.append(", paragraphSyle=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C25772Clj() {
        this(new C26131Csu(true), (C25706Ckc) null);
    }
}
