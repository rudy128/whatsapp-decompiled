package X;

/* renamed from: X.8R8  reason: invalid class name */
public final class AnonymousClass8R8 extends C180249Ls {
    public final long A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C180249Ls)) {
                return false;
            }
            AnonymousClass8R8 r7 = (AnonymousClass8R8) ((C180249Ls) obj);
            if (!this.A01.equals(r7.A01) || this.A00 != r7.A00) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass8R8(Integer num, long j) {
        this.A01 = num;
        this.A00 = j;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "TRANSIENT_ERROR";
            case 2:
                return "FATAL_ERROR";
            case 3:
                return "INVALID_PAYLOAD";
            default:
                return "OK";
        }
    }

    public int hashCode() {
        Integer num = this.A01;
        return ((1000003 ^ C72453Mb.A0E(num, A00(num))) * 1000003) ^ AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackendResponse{status=");
        Integer num = this.A01;
        if (num != null) {
            str = A00(num);
        } else {
            str = "null";
        }
        A10.append(str);
        A10.append(", nextRequestWaitMillis=");
        A10.append(this.A00);
        return AnonymousClass000.A0y("}", A10);
    }
}
