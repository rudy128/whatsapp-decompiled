package X;

/* renamed from: X.A1k  reason: case insensitive filesystem */
public final class C19975A1k {
    public final Integer A00;
    public final Integer A01;
    public final Throwable A02;

    public C19975A1k(Integer num, Integer num2, Throwable th) {
        C18070vi.A0d(th, 2);
        this.A00 = num;
        this.A02 = th;
        this.A01 = num2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19975A1k) {
                C19975A1k a1k = (C19975A1k) obj;
                if (!(this.A00 == a1k.A00 && C18070vi.A18(this.A02, a1k.A02) && this.A01 == a1k.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A00;
        int A0N = AnonymousClass000.A0N(this.A02, C72453Mb.A0E(num, A00(num)) * 31);
        Integer num2 = this.A01;
        return A0N + C72453Mb.A0E(num2, C181559Qy.A00(num2));
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "INELIGIBLE";
            case 1:
                return "CANCELED";
            case 2:
                return "ERROR_BEFORE_USER_INTERACTION";
            default:
                return "ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CreatePasskeyClientError(kind=");
        A10.append(A00(this.A00));
        A10.append(", throwable=");
        A10.append(this.A02);
        A10.append(", suggestedRemedy=");
        return C17900vP.A0B(C181559Qy.A00(this.A01), A10);
    }
}
