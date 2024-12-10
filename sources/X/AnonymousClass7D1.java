package X;

/* renamed from: X.7D1  reason: invalid class name */
public final class AnonymousClass7D1 implements C1594184l {
    public final Integer A00;
    public final Object A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7D1) {
                AnonymousClass7D1 r5 = (AnonymousClass7D1) obj;
                if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && C18070vi.A18(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A03 = AnonymousClass3MX.A03(this.A02);
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "UNKNOWN";
        } else {
            str = "NETWORK";
        }
        return ((A03 + str.hashCode() + intValue) * 31) + AnonymousClass001.A0k(this.A01);
    }

    public AnonymousClass7D1(Integer num, Object obj, boolean z) {
        this.A02 = z;
        this.A00 = num;
        this.A01 = obj;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(isFirstLoad=");
        A10.append(this.A02);
        A10.append(", type=");
        if (this.A00.intValue() != 0) {
            str = "UNKNOWN";
        } else {
            str = "NETWORK";
        }
        A10.append(str);
        A10.append(", data=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
