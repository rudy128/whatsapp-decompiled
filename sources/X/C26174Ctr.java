package X;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ctr  reason: case insensitive filesystem */
public abstract class C26174Ctr {
    public static final byte[] A00 = {112, 114, 111, 0};
    public static final byte[] A01 = {112, 114, 109, 0};

    public static String A00(String str, String str2, byte[] bArr) {
        String str3;
        byte[] bArr2 = CIF.A02;
        String str4 = ":";
        if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, CIF.A03)) {
            str3 = str4;
        } else {
            str3 = "!";
        }
        if (str.length() > 0) {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(str4)) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                StringBuilder A11 = AnonymousClass000.A11(str);
                if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, CIF.A03)) {
                    str4 = "!";
                }
                return AnonymousClass001.A1H(str4, str2, A11);
            }
        }
        if ("!".equals(str3)) {
            return str2.replace(str4, "!");
        }
        if (str4.equals(str3)) {
            return str2.replace("!", str4);
        }
        return str2;
    }

    public static void A01(C25005CTf cTf, OutputStream outputStream) {
        int i = cTf.A04;
        byte[] bArr = new byte[(((((i * 2) + 8) - 1) & -8) / 8)];
        Iterator A0i = C17890vO.A0i(cTf.A08);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            int A04 = AnonymousClass8BV.A04(A16);
            int A0J = BE9.A0J(A16);
            if ((A0J & 2) != 0) {
                int i2 = A04 / 8;
                BE6.A1N(bArr, 1 << (A04 % 8), bArr[i2], i2);
            }
            if ((A0J & 4) != 0) {
                int i3 = A04 + i;
                int i4 = i3 / 8;
                BE6.A1N(bArr, 1 << (i3 % 8), bArr[i4], i4);
            }
        }
        outputStream.write(bArr);
    }

    public static void A02(C25005CTf cTf, OutputStream outputStream) {
        Iterator A0i = C17890vO.A0i(cTf.A08);
        int i = 0;
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            int A04 = AnonymousClass8BV.A04(A16);
            if ((BE9.A0J(A16) & 1) != 0) {
                C25299Cd3.A01(outputStream, 2, (long) (A04 - i));
                C25299Cd3.A01(outputStream, 2, 0);
                i = A04;
            }
        }
    }

    public static void A03(C25005CTf cTf, OutputStream outputStream, String str) {
        Charset charset = StandardCharsets.UTF_8;
        C25299Cd3.A00(outputStream, str.getBytes(charset).length);
        C25299Cd3.A00(outputStream, cTf.A00);
        C25299Cd3.A01(outputStream, 4, (long) cTf.A03);
        C25299Cd3.A01(outputStream, 4, cTf.A05);
        C25299Cd3.A01(outputStream, 4, (long) cTf.A04);
        outputStream.write(str.getBytes(charset));
    }
}
