package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.OutputStream;

/* renamed from: X.Cr0  reason: case insensitive filesystem */
public class C26039Cr0 {
    public OutputStream A00;

    public static void A02(C26039Cr0 cr0, byte[] bArr, int i) {
        cr0.A00.write(bArr, 0, i);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cr0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.Cr0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.Cr0, java.lang.Object] */
    public static C26039Cr0 A00(OutputStream outputStream, String str) {
        if (str.equals("DER")) {
            ? obj = new Object();
            obj.A00 = outputStream;
            return obj;
        } else if (str.equals("DL")) {
            ? obj2 = new Object();
            obj2.A00 = outputStream;
            return obj2;
        } else {
            ? obj3 = new Object();
            obj3.A00 = outputStream;
            return obj3;
        }
    }

    public static void A01(C26039Cr0 cr0, int i) {
        cr0.A00.write(i);
    }

    public final void A03(int i) {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            A01(this, (byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                A01(this, (byte) (i >> i4));
            }
            return;
        }
        A01(this, (byte) i);
    }

    public final void A04(int i, int i2, boolean z) {
        if (!z) {
            return;
        }
        if (i2 < 31) {
            A01(this, i | i2);
            return;
        }
        A01(this, 31 | i);
        if (i2 < 128) {
            A01(this, i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & StringTreeSet.OFFSET_BASE_ENCODING);
        do {
            i2 >>= 7;
            i3--;
            BE6.A1N(bArr, i2 & StringTreeSet.OFFSET_BASE_ENCODING, 128, i3);
        } while (i2 > 127);
        this.A00.write(bArr, i3, 5 - i3);
    }

    public void A05(AnonymousClass1Bz r2, boolean z) {
        AnonymousClass1Bz A0E;
        if (this instanceof C28330Dxc) {
            A0E = r2.A0F();
        } else if (this instanceof C28329Dxb) {
            A0E = r2.A0E();
        } else {
            r2.A0G(this, z);
            return;
        }
        A0E.A0G(this, z);
    }

    public final void A06(byte[] bArr, int i, boolean z) {
        if (z) {
            A01(this, i);
        }
        int length = bArr.length;
        A03(length);
        A02(this, bArr, length);
    }

    public final void A07(AnonymousClass1Bx[] r5, int i, boolean z) {
        if (z) {
            A01(this, i);
        }
        A01(this, 128);
        for (AnonymousClass1Bx CP9 : r5) {
            A05(CP9.CP9(), true);
        }
        A01(this, 0);
        A01(this, 0);
    }
}
