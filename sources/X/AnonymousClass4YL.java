package X;

/* renamed from: X.4YL  reason: invalid class name */
public final class AnonymousClass4YL {
    public Integer A00;
    public Integer A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YL) {
                AnonymousClass4YL r5 = (AnonymousClass4YL) obj;
                if (this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A02;
        return (((C72453Mb.A0E(num, A00(num)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public AnonymousClass4YL(Integer num, Integer num2, Integer num3) {
        this.A02 = num;
        this.A00 = num2;
        this.A01 = num3;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "SUCCESS";
            case 1:
                return "ERROR";
            case 2:
                return "ERROR_AUTH_NOT_SETUP";
            case 3:
                return "CANCELED";
            default:
                return "FAILURE";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AuthResultData(authResult=");
        A10.append(A00(this.A02));
        A10.append(", actionEntryPoint=");
        A10.append(this.A00);
        A10.append(", authType=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
