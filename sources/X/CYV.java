package X;

public class CYV {
    public static final CYV A02;
    public static final CYV A03;
    public C24304Bz1 A00;
    public Integer A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CYV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.CYV, java.lang.Object] */
    static {
        C24304Bz1 bz1 = C24304Bz1.none;
        ? obj = new Object();
        obj.A00 = bz1;
        obj.A01 = null;
        A03 = obj;
        C24304Bz1 bz12 = C24304Bz1.xMidYMid;
        Integer num = AnonymousClass00R.A00;
        ? obj2 = new Object();
        obj2.A00 = bz12;
        obj2.A01 = num;
        A02 = obj2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CYV cyv = (CYV) obj;
            if (!(this.A00 == cyv.A00 && this.A01 == cyv.A01)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        BE6.A1J(A10);
        Integer num = this.A01;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "meet";
        } else {
            str = "slice";
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
