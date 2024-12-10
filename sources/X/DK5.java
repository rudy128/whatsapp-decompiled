package X;

public final class DK5 implements E29 {
    public final int A00;
    public final C28663EDa A01;
    public final String A02;
    public final Object[] A03;

    public DK5(C28663EDa eDa, String str, Object[] objArr) {
        char charAt;
        this.A01 = eDa;
        this.A02 = str;
        this.A03 = objArr;
        int i = 1;
        char A002 = BE7.A00(str);
        if (A002 >= 55296) {
            int i2 = A002 & 8191;
            int i3 = 13;
            while (true) {
                int i4 = i + 1;
                charAt = str.charAt(i);
                if (charAt < 55296) {
                    break;
                }
                i2 = BE6.A08(charAt, i3, i2);
                i3 += 13;
                i = i4;
            }
            A002 = (charAt << i3) | i2;
        }
        this.A00 = A002;
    }
}
