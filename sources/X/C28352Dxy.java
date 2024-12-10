package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.Dxy  reason: case insensitive filesystem */
public class C28352Dxy extends AnonymousClass1Bz implements E74 {
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] A00;

    public void A0G(C26039Cr0 cr0, boolean z) {
        cr0.A06(this.A00, 28, z);
    }

    public boolean A0H() {
        return false;
    }

    public String BZl() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] A0B = A0B();
            for (int i = 0; i != A0B.length; i++) {
                char[] cArr = A01;
                stringBuffer.append(cArr[(A0B[i] >>> 4) & 15]);
                stringBuffer.append(cArr[A0B[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new C24415C2o("internal error encoding UniversalString");
        }
    }

    public int hashCode() {
        return AnonymousClass1C2.A00(this.A00);
    }

    public String toString() {
        return BZl();
    }

    public int A0D() {
        return BE9.A0K(this.A00);
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        if (!(r3 instanceof C28352Dxy)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28352Dxy) r3).A00);
    }

    public C28352Dxy(byte[] bArr) {
        this.A00 = AnonymousClass1C2.A02(bArr);
    }
}
