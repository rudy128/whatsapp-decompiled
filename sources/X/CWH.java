package X;

import java.lang.reflect.Array;

public final class CWH {
    public final int A00;
    public final int A01;
    public final byte[][] A02;

    public String toString() {
        String str;
        int i = this.A01;
        int i2 = this.A00;
        StringBuilder A0t = BE6.A0t((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.A02[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b == 0) {
                    str = " 0";
                } else if (b != 1) {
                    str = "  ";
                } else {
                    str = " 1";
                }
                A0t.append(str);
            }
            A0t.append(10);
        }
        return A0t.toString();
    }

    public CWH(int i, int i2) {
        int[] A1W = C108945cZ.A1W();
        A1W[1] = i;
        A1W[0] = i2;
        this.A02 = (byte[][]) Array.newInstance(Byte.TYPE, A1W);
        this.A01 = i;
        this.A00 = i2;
    }
}
