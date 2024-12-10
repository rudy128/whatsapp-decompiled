package X;

/* renamed from: X.Dwr  reason: case insensitive filesystem */
public class C28283Dwr extends AnonymousClass1By {
    public C28269Dwd A00;

    public AnonymousClass1Bz CP9() {
        return this.A00;
    }

    public String toString() {
        byte b;
        byte[] A0K = this.A00.A0K();
        int length = A0K.length;
        StringBuilder A10 = AnonymousClass000.A10();
        if (length == 1) {
            A10.append("KeyUsage: 0x");
            b = A0K[0] & 255;
        } else {
            A10.append("KeyUsage: 0x");
            b = (A0K[0] & 255) | ((A0K[1] & 255) << 8);
        }
        return AnonymousClass000.A0y(Integer.toHexString(b), A10);
    }
}
