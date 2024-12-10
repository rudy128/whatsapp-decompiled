package X;

/* renamed from: X.2mN  reason: invalid class name and case insensitive filesystem */
public class C59482mN {
    public final int A00;
    public final Integer A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C59482mN)) {
            return false;
        }
        C59482mN r4 = (C59482mN) obj;
        return this.A02.equals(r4.A02) && this.A00 == r4.A00 && this.A01 == r4.A01;
    }

    public int hashCode() {
        String str;
        int hashCode = this.A02.hashCode() ^ this.A00;
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "REGULAR";
        } else {
            str = "ADVANCED";
        }
        return hashCode ^ (str.hashCode() + intValue);
    }

    public C59482mN(Integer num, String str, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = num;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        String str2 = this.A02;
        int length = str2.length();
        if (length > 4) {
            str2 = str2.substring(length - 4);
        }
        A10.append(str2);
        A10.append(":");
        A10.append(this.A00);
        A10.append(":");
        Integer num = this.A01;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "REGULAR";
        } else {
            str = "ADVANCED";
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
