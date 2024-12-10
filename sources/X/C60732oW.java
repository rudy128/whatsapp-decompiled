package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.2oW  reason: invalid class name and case insensitive filesystem */
public abstract class C60732oW {
    public static final List A00 = C17880vN.A10(Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'}));

    public static String A00(byte[] bArr) {
        int length = bArr.length;
        if (length != 5) {
            C17900vP.A0i("CompanionRegWithLinkCodeUtil/convertByteArrayToBase32String invalid byteArray length=", AnonymousClass000.A10(), length);
            return null;
        }
        int i = 0;
        long j = 0;
        int i2 = 32;
        int i3 = 0;
        do {
            j |= ((long) (bArr[i3] & 255)) << i2;
            i2 -= 8;
            i3++;
        } while (i3 < 5);
        String str = "";
        do {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(A00.get((int) (31 & j)));
            str = AnonymousClass000.A0y(str, A10);
            j >>= 5;
            i++;
        } while (i < 8);
        return str;
    }
}
