package X;

/* renamed from: X.6rH  reason: invalid class name and case insensitive filesystem */
public final class C134866rH {
    public final int A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134866rH) {
                C134866rH r5 = (C134866rH) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "BULLET";
        } else {
            str = "HEAD";
        }
        return ((str.hashCode() + intValue) * 31) + this.A00;
    }

    public C134866rH(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetaData(position=");
        if (this.A01.intValue() != 0) {
            str = "BULLET";
        } else {
            str = "HEAD";
        }
        A10.append(str);
        A10.append(", index=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
