package X;

/* renamed from: X.7Fh  reason: invalid class name and case insensitive filesystem */
public final class C143917Fh implements C1595584z {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C143917Fh) && this.A00 == ((C143917Fh) obj).A00);
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "NETWORK_CONNECTION_ERROR";
                break;
            case 1:
                str = "SERVER_INTERNAL_ERROR";
                break;
            case 2:
                str = "BAD_REQUEST_ERROR";
                break;
            default:
                str = "OTHER_ERROR";
                break;
        }
        return str.hashCode() + intValue;
    }

    public C143917Fh(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        return "Dob Verification Error";
    }
}
