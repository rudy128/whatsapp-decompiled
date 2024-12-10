package X;

/* renamed from: X.A1q  reason: case insensitive filesystem */
public final class C19980A1q {
    public static final C19980A1q A03 = new C19980A1q((Integer) null, "NOT_CATCHABLE_ERROR", (String) null);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public C19980A1q(Integer num, String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A00 = num;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19980A1q) {
                C19980A1q a1q = (C19980A1q) obj;
                if (!C18070vi.A18(this.A02, a1q.A02) || !C18070vi.A18(this.A00, a1q.A00) || !C18070vi.A18(this.A01, a1q.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A02) + AnonymousClass001.A0k(this.A00)) * 31) + C108955ca.A06(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A02);
        A10.append(" (");
        A10.append(this.A00);
        A10.append("): ");
        return AnonymousClass000.A0y(this.A01, A10);
    }
}
