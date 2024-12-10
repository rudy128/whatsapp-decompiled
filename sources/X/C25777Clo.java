package X;

/* renamed from: X.Clo  reason: case insensitive filesystem */
public final class C25777Clo {
    public final Integer A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25777Clo) {
                C25777Clo clo = (C25777Clo) obj;
                if (this.A01 != clo.A01 || !C18070vi.A18(this.A00, clo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0E;
        Integer num = this.A01;
        if (num == null) {
            A0E = 0;
        } else {
            A0E = C72453Mb.A0E(num, A00(num));
        }
        return (A0E * 31) + C17880vN.A02(this.A00);
    }

    public C25777Clo(Integer num, Integer num2) {
        this.A01 = num;
        this.A00 = num2;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "NOT_MEMBER";
            case 2:
                return "GROUP_RESTRICTED";
            case 3:
                return "DESCRIPTION_TOO_LONG";
            case 4:
                return "DESCRIPTION_SAME";
            case 5:
                return "NO_NETWORK";
            default:
                return "NONE";
        }
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorUiState(errorUiCase=");
        Integer num = this.A01;
        if (num != null) {
            str = A00(num);
        } else {
            str = "null";
        }
        A10.append(str);
        A10.append(", errorProtocolCode=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
