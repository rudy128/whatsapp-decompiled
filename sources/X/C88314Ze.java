package X;

/* renamed from: X.4Ze  reason: invalid class name and case insensitive filesystem */
public final class C88314Ze {
    public final Integer A00;
    public final Long A01;
    public final Object A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88314Ze) {
                C88314Ze r5 = (C88314Ze) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C88314Ze A00(long j) {
        return new C88314Ze(AnonymousClass00R.A00, new Long(j), (Object) null);
    }

    public int hashCode() {
        Integer num = this.A00;
        return (((C72453Mb.A0E(num, A01(num)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public C88314Ze(Integer num, Long l, Object obj) {
        this.A00 = num;
        this.A02 = obj;
        this.A01 = l;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ERROR";
            case 1:
                return "LOADING";
            case 2:
                return "PENDING";
            case 3:
                return "FINISH";
            default:
                return "SUCCESS";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ResultStatus(type=");
        A10.append(A01(this.A00));
        A10.append(", data=");
        A10.append(this.A02);
        A10.append(", errorCode=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
