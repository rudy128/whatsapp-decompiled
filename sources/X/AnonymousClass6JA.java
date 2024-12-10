package X;

/* renamed from: X.6JA  reason: invalid class name */
public final class AnonymousClass6JA extends AnonymousClass6JD {
    public final int A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6JA) {
                AnonymousClass6JA r5 = (AnonymousClass6JA) obj;
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
        switch (intValue) {
            case 1:
                str = "FIRST_DIVIDER";
                break;
            case 2:
                str = "MID_DIVIDER";
                break;
            default:
                str = "DUMMY_TILE";
                break;
        }
        return ((str.hashCode() + intValue) * 31) + this.A00;
    }

    public AnonymousClass6JA(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusEmptyItem(type=");
        switch (this.A01.intValue()) {
            case 1:
                str = "FIRST_DIVIDER";
                break;
            case 2:
                str = "MID_DIVIDER";
                break;
            default:
                str = "DUMMY_TILE";
                break;
        }
        A10.append(str);
        A10.append(", position=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public AnonymousClass6JA() {
        this(0, AnonymousClass00R.A00);
    }
}
