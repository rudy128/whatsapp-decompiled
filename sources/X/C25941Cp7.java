package X;

/* renamed from: X.Cp7  reason: case insensitive filesystem */
public class C25941Cp7 {
    public static final C25941Cp7 A01;
    public int A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Cp7] */
    static {
        ? obj = new Object();
        obj.A00 = 33023;
        A01 = obj;
    }

    public C25941Cp7(C28365DyB dyB) {
        byte[] bArr = dyB.A01;
        int min = Math.min(4, bArr.length - 1);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i |= (255 & bArr[i2]) << (i2 * 8);
        }
        if (min >= 0 && min < 4) {
            i |= (((byte) (bArr[min] & (255 << dyB.A00))) & 255) << (min * 8);
        }
        this.A00 = i;
    }

    public C25941Cp7() {
        this.A00 = 0;
    }
}
