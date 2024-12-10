package X;

/* renamed from: X.4Za  reason: invalid class name and case insensitive filesystem */
public final class C88274Za {
    public final AnonymousClass4CR A00;
    public final Integer A01;

    public C88274Za(AnonymousClass4CR r2, Integer num) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88274Za) {
                C88274Za r5 = (C88274Za) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A01(AnonymousClass1DS r1, AnonymousClass4CR r2, Integer num) {
        r1.A0E(new C88274Za(r2, num));
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A00);
        Integer num = this.A01;
        return A0L + C72453Mb.A0E(num, A00(num));
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "IDLE";
            case 1:
                return "REQUESTING";
            case 2:
                return "SUCCESS";
            default:
                return "FAILED";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AllowNonAdminSubgroupCreationUiState(permission=");
        A10.append(this.A00);
        A10.append(", requestStatus=");
        return C17900vP.A0B(A00(this.A01), A10);
    }
}
