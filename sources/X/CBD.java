package X;

public abstract class CBD {
    public static byte[] A00(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= r5) {
                break;
            }
            i2 += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }
}
