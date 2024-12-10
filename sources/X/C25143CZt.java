package X;

/* renamed from: X.CZt  reason: case insensitive filesystem */
public final class C25143CZt {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25143CZt) && this.A00 == ((C25143CZt) obj).A00);
    }

    public int hashCode() {
        String str;
        Integer num = this.A00;
        switch (num.intValue()) {
            case 0:
                str = "VALID";
                break;
            case 1:
                str = "INVALID_NOT_GROUP_MEMBER";
                break;
            default:
                str = "INVALID_NOT_GROUP_ADMIN";
                break;
        }
        return C72453Mb.A0E(num, str);
    }

    public C25143CZt(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorUiState(validity=");
        switch (this.A00.intValue()) {
            case 0:
                str = "VALID";
                break;
            case 1:
                str = "INVALID_NOT_GROUP_MEMBER";
                break;
            default:
                str = "INVALID_NOT_GROUP_ADMIN";
                break;
        }
        return C17900vP.A0B(str, A10);
    }
}
