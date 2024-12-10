package X;

/* renamed from: X.7Fz  reason: invalid class name and case insensitive filesystem */
public final class C144097Fz implements AnonymousClass850 {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C144097Fz) && this.A00 == ((C144097Fz) obj).A00);
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "TM_NETWORK_CONNECTION_ERROR";
                break;
            case 1:
                str = "TM_SERVER_INTERNAL_ERROR";
                break;
            case 2:
                str = "TM_BAD_REQUEST_ERROR";
                break;
            case 3:
                str = "TM_NOT_AUTHORIZED_ERROR";
                break;
            case 4:
                str = "TM_FORBIDDEN_ERROR";
                break;
            case 5:
                str = "TM_PARSING_ERROR";
                break;
            default:
                str = "TM_OTHER_ERROR";
                break;
        }
        return str.hashCode() + intValue;
    }

    public C144097Fz(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        return "Token Mint Error";
    }
}
