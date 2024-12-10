package X;

/* renamed from: X.6ry  reason: invalid class name and case insensitive filesystem */
public final class C135296ry {
    public final int A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135296ry) {
                C135296ry r5 = (C135296ry) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && C18070vi.A18(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + C17900vP.A00(this.A02);
    }

    public C135296ry(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageFilter(id=");
        A10.append(this.A00);
        A10.append(", stringResourceId=");
        A10.append(this.A01);
        A10.append(", fileName=");
        return C17900vP.A0B(this.A02, A10);
    }
}
