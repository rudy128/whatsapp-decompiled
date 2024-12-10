package X;

public final class A1Y {
    public final C185899dK A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A1Y) {
                A1Y a1y = (A1Y) obj;
                if (this.A01 != a1y.A01 || !C18070vi.A18(this.A00, a1y.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return (C72453Mb.A0E(num, A00(num)) * 31) + AnonymousClass001.A0k(this.A00);
    }

    public A1Y(C185899dK r1, Integer num) {
        this.A01 = num;
        this.A00 = r1;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "EXPIRED";
            case 1:
                return "NOT_PRESENT";
            case 2:
                return "SUCCESS";
            default:
                return "PARSE_ERROR";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetadataCacheReadResult(status=");
        A10.append(A00(this.A01));
        A10.append(", metadata=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
