package X;

/* renamed from: X.2mI  reason: invalid class name and case insensitive filesystem */
public final class C59432mI {
    public final String A00;
    public final String A01;
    public final String A02;

    public C59432mI(String str, String str2, String str3) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C59432mI r4 = (C59432mI) obj;
            if (!C18070vi.A18(this.A02, r4.A02) || !C42171xk.A00(this.A01, r4.A01) || !C42171xk.A00(this.A00, r4.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A02;
        objArr[1] = this.A01;
        return AnonymousClass000.A0P(this.A00, objArr, 2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Bullet{text='");
        A10.append(this.A02);
        A10.append("', iconLightUrl='");
        A10.append(this.A01);
        A10.append("', iconDarkUrl='");
        A10.append(this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }
}
