package X;

/* renamed from: X.A1a  reason: case insensitive filesystem */
public final class C19965A1a {
    public final Integer A00;
    public final Throwable A01;

    public C19965A1a(Integer num, Throwable th) {
        C18070vi.A0d(th, 2);
        this.A00 = num;
        this.A01 = th;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19965A1a) {
                C19965A1a a1a = (C19965A1a) obj;
                if (this.A00 != a1a.A00 || !C18070vi.A18(this.A01, a1a.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A00;
        return AnonymousClass000.A0O(this.A01, C72453Mb.A0E(num, A00(num)) * 31);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "INELIGIBLE";
            case 1:
                return "CANCELED";
            case 2:
                return "NO_PASSKEY_AVAILABLE";
            case 3:
                return "ERROR_BEFORE_USER_INTERACTION";
            default:
                return "ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoginWithPasskeyError(kind=");
        A10.append(A00(this.A00));
        A10.append(", throwable=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
