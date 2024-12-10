package X;

import java.util.HashSet;

public abstract class CGK {
    public static final HashSet A00;

    static {
        Byte[] bArr = new Byte[12];
        bArr[0] = (byte) 1;
        bArr[1] = (byte) 2;
        bArr[2] = (byte) 2;
        bArr[3] = (byte) 4;
        BE6.A1S(bArr, (byte) 5, 4);
        BE6.A1S(bArr, (byte) 8, 5);
        bArr[6] = (byte) 11;
        bArr[7] = (byte) 13;
        BE6.A1S(bArr, (byte) 15, 8);
        bArr[9] = (byte) 20;
        bArr[10] = (byte) 24;
        A00 = C17900vP.A0I((byte) -2, bArr, 11);
    }
}
