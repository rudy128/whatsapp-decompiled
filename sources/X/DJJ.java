package X;

public final class DJJ implements C28453E1t {
    public final int A00;
    public final C28454E1u A01;
    public final Object[] A02;

    public DJJ(C28454E1u e1u, Object[] objArr) {
        char charAt;
        this.A01 = e1u;
        this.A02 = objArr;
        char A002 = BE7.A00("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a");
        if (A002 >= 55296) {
            int i = A002 & 8191;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i = BE6.A08(charAt, i3, i);
                i3 += 13;
                i2 = i4;
            }
            A002 = (charAt << i3) | i;
        }
        this.A00 = A002;
    }
}
