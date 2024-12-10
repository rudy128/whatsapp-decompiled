package X;

/* renamed from: X.A1b  reason: case insensitive filesystem */
public final class C19966A1b {
    public final Integer A00;
    public final Integer A01;

    public C19966A1b(Integer num, Integer num2) {
        C18070vi.A0d(num2, 2);
        this.A00 = num;
        this.A01 = num2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19966A1b) {
                C19966A1b a1b = (C19966A1b) obj;
                if (!(this.A00 == a1b.A00 && this.A01 == a1b.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A00;
        Integer num2 = this.A01;
        return (C72453Mb.A0E(num, A00(num)) * 31) + C72453Mb.A0E(num2, C181559Qy.A00(num2));
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ERROR_BEFORE_USER_INTERACTION";
            case 1:
                return "ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION_BUT_BEFORE_SENDING_PASSKEY_TO_SERVER";
            case 2:
                return "ERROR_AFTER_USER_INTERACTION_AFTER_SENDING_PASSKEY_TO_SERVER";
            case 3:
                return "USER_CANCELED";
            default:
                return "INELIGIBLE";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PasskeyCreateError(kind=");
        A10.append(A00(this.A00));
        A10.append(", remedy=");
        return C17900vP.A0B(C181559Qy.A00(this.A01), A10);
    }
}
