package X;

/* renamed from: X.6zS  reason: invalid class name and case insensitive filesystem */
public final class C139796zS {
    public final AnonymousClass6RC A00;
    public final Integer A01;

    public C139796zS(AnonymousClass6RC r2, Integer num) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139796zS) {
                C139796zS r5 = (C139796zS) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A00);
        Integer num = this.A01;
        return A0L + C72453Mb.A0E(num, A00(num));
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "WILL_SHOW";
            case 1:
                return "SHOWING";
            case 2:
                return "DISMISSED";
            default:
                return "DID_NOT_SHOW";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallTooltipState(useCase=");
        A10.append(this.A00);
        A10.append(", stage=");
        return C17900vP.A0B(A00(this.A01), A10);
    }
}
