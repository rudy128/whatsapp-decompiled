package X;

/* renamed from: X.6s9  reason: invalid class name and case insensitive filesystem */
public final class C135406s9 {
    public final Integer A00;
    public final Object A01;
    public final Exception A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135406s9) {
                C135406s9 r5 = (C135406s9) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "ERROR";
                break;
            default:
                str = "LOADING";
                break;
        }
        return ((((str.hashCode() + intValue) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A02);
    }

    public C135406s9(Exception exc, Integer num, Object obj) {
        this.A00 = num;
        this.A01 = obj;
        this.A02 = exc;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Resource(status=");
        switch (this.A00.intValue()) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "ERROR";
                break;
            default:
                str = "LOADING";
                break;
        }
        A10.append(str);
        A10.append(", data=");
        A10.append(this.A01);
        A10.append(", error=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
