package X;

/* renamed from: X.Bm2  reason: case insensitive filesystem */
public final class C23574Bm2 extends C4C {
    public final long A00;
    public final Integer A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C4C)) {
                return false;
            }
            String str = this.A02;
            C23574Bm2 bm2 = (C23574Bm2) ((C4C) obj);
            String str2 = bm2.A02;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.A00 != bm2.A00) {
                return false;
            }
            Integer num = this.A01;
            Integer num2 = bm2.A01;
            return num == null ? num2 == null : num.equals(num2);
        }
    }

    public C23574Bm2(Integer num, String str, long j) {
        this.A02 = str;
        this.A00 = j;
        this.A01 = num;
    }

    public int hashCode() {
        String str;
        int i = 0;
        int A002 = (((1000003 ^ C17900vP.A00(this.A02)) * 1000003) ^ AnonymousClass000.A0I(this.A00)) * 1000003;
        Integer num = this.A01;
        if (num != null) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "BAD_CONFIG";
                    break;
                case 2:
                    str = "AUTH_ERROR";
                    break;
                default:
                    str = "OK";
                    break;
            }
            i = str.hashCode() + intValue;
        }
        return A002 ^ i;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TokenResult{token=");
        A10.append(this.A02);
        A10.append(", tokenExpirationTimestamp=");
        A10.append(this.A00);
        A10.append(", responseCode=");
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "BAD_CONFIG";
                    break;
                case 2:
                    str = "AUTH_ERROR";
                    break;
                default:
                    str = "OK";
                    break;
            }
        } else {
            str = "null";
        }
        return BEA.A0n(str, A10);
    }
}
