package X;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* renamed from: X.Cpr  reason: case insensitive filesystem */
public class C25978Cpr {
    public final int A00;
    public final short A01;
    public final String[] A02;

    public static C25978Cpr A01(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            try {
                int length2 = strArr[i].getBytes(C19620yd.A0A).length;
                if (length2 <= 63) {
                    i2 += length2 + 1;
                    i++;
                } else {
                    throw AnonymousClass000.A0n("token may not be longer than 63 bytes");
                }
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return new C25978Cpr(strArr, i2 + 1, 0);
    }

    public static C25978Cpr A00(byte[] bArr, int i) {
        int i2;
        short s;
        if (bArr != null) {
            int length = bArr.length;
            if (length >= 1) {
                ArrayList A13 = AnonymousClass000.A13();
                StringBuilder A10 = AnonymousClass000.A10();
                int i3 = i;
                while (true) {
                    byte b = bArr[i3];
                    if (b == 0) {
                        i2 = i3 + 1;
                        s = 0;
                        break;
                    }
                    byte b2 = (byte) (b & 63);
                    if ((b & 192) != 0) {
                        s = (short) (((b2 << 8) & 65280) | (bArr[i3 + 1] & 255));
                        i2 = i3 + 2;
                        break;
                    }
                    int i4 = i3 + 1;
                    if (length >= i4 + b2 + 1) {
                        A10.setLength(0);
                        for (byte b3 = 0; b3 < b2; b3 = (byte) (b3 + 1)) {
                            A10.append((char) bArr[i4 + b3]);
                        }
                        i3 = i4 + b2;
                        C108955ca.A1U(A10, A13);
                    } else {
                        throw new C22641Cq("bytes is incomplete");
                    }
                }
                return new C25978Cpr(C17890vO.A1b(A13, 0), i2 - i, s);
            }
            throw new C22641Cq("insufficient data");
        }
        throw AnonymousClass000.A0s("bytes may not be null");
    }

    public void A02(OutputStream outputStream) {
        String[] strArr = this.A02;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            byte[] bytes = strArr[i].getBytes(C19620yd.A0A);
            int length2 = bytes.length;
            if (length2 <= 63) {
                outputStream.write(length2);
                outputStream.write(bytes);
                i++;
            } else {
                throw AnonymousClass000.A0n("token may not be longer than 63 bytes");
            }
        }
        short s = this.A01;
        if (s != 0) {
            outputStream.write(((s >>> 8) & 63) | 192);
            outputStream.write(s & 255);
            return;
        }
        outputStream.write(0);
    }

    public C25978Cpr(String[] strArr, int i, short s) {
        this.A02 = strArr;
        this.A01 = s;
        this.A00 = i;
    }
}
