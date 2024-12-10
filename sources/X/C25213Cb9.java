package X;

/* renamed from: X.Cb9  reason: case insensitive filesystem */
public final class C25213Cb9 {
    public final int A00;
    public final int A01;
    public final C24693CGf A02;
    public final DSF A03;
    public final Object A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25213Cb9) {
                C25213Cb9 cb9 = (C25213Cb9) obj;
                if (!C18070vi.A18(this.A02, cb9.A02) || !C18070vi.A18(this.A03, cb9.A03) || this.A00 != cb9.A00 || this.A01 != cb9.A01 || !C18070vi.A18(this.A04, cb9.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0N(this.A03, AnonymousClass001.A0k(this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + C17880vN.A02(this.A04);
    }

    public C25213Cb9(C24693CGf cGf, DSF dsf, Object obj, int i, int i2) {
        this.A02 = cGf;
        this.A03 = dsf;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = obj;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TypefaceRequest(fontFamily=");
        A10.append(this.A02);
        A10.append(", fontWeight=");
        A10.append(this.A03);
        A10.append(", fontStyle=");
        int i = this.A00;
        if (i == 0) {
            str = "Normal";
        } else if (i == 1) {
            str = "Italic";
        } else {
            str = "Invalid";
        }
        A10.append(str);
        A10.append(", fontSynthesis=");
        int i2 = this.A01;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "All";
        } else if (i2 == 2) {
            str2 = "Weight";
        } else if (i2 == 3) {
            str2 = "Style";
        } else {
            str2 = "Invalid";
        }
        A10.append(str2);
        A10.append(", resourceLoaderCacheKey=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
