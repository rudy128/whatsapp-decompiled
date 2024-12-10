package X;

/* renamed from: X.6rr  reason: invalid class name and case insensitive filesystem */
public final class C135226rr {
    public final double A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135226rr) {
                C135226rr r7 = (C135226rr) obj;
                if (!C18070vi.A18(this.A01, r7.A01) || !C18070vi.A18(this.A02, r7.A02) || Double.compare(this.A00, r7.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, C17880vN.A03(this.A01)) + AnonymousClass000.A0I(Double.doubleToLongBits(this.A00));
    }

    public C135226rr(String str, double d, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = d;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaUploadProgressParams(collectionId=");
        A10.append(this.A01);
        A10.append(", mediaJobId=");
        A10.append(this.A02);
        A10.append(", progress=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
