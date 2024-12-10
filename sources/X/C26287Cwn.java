package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.Cwn  reason: case insensitive filesystem */
public abstract class C26287Cwn {
    public static int A00(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return A02(bArr);
    }

    public static int A01(byte[] bArr) {
        return (bArr[2] & 255) | BE7.A09(bArr, 1, 0 | ((bArr[0] & 255) << 16));
    }

    public static boolean A06(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || (length = bArr.length) != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < length; i++) {
            z &= AnonymousClass000.A1T(bArr[i], bArr2[i]);
        }
        return z;
    }

    public static byte[] A0D(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[A02(bArr)];
        byteBuffer.get(bArr2);
        return bArr2;
    }

    public static int A02(byte[] bArr) {
        if (bArr == null || bArr.length != 2) {
            throw BEA.A0X("Invalid argument. Byte array is null or length != 2");
        }
        return (bArr[1] & 255) | 0 | ((bArr[0] & 255) << 8);
    }

    public static long A03(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            return (((long) (bArr[0] & 255)) << 24) | (((long) (bArr[1] & 255)) << 16) | (((long) (bArr[2] & 255)) << 8) | ((long) (bArr[3] & 255));
        }
        throw BEA.A0X("Invalid argument. byte array is null or length != 4");
    }

    public static String A04(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        Formatter formatter = new Formatter();
        for (byte A1S : bArr) {
            Object[] A1a = AnonymousClass3MW.A1a();
            BE6.A1S(A1a, A1S, 0);
            formatter.format("%02x ", A1a);
        }
        return formatter.toString();
    }

    public static byte[] A07(int i) {
        if (i < 0 || i >= 16777216) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid argument. The supplied int value = ");
            A10.append(i);
            throw BEA.A0X(AnonymousClass000.A0y(" does not fit in 3 bytes.", A10));
        }
        return new byte[]{(byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] A08(int i) {
        if (i < 0 || i >= 65536) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid argument. The supplied int value = ");
            A10.append(i);
            throw BEA.A0X(AnonymousClass000.A0y(" does not fit in 2 bytes.", A10));
        }
        return new byte[]{(byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] A09(C25097CXp cXp, C27006DPc dPc, String str, byte[] bArr, byte[] bArr2) {
        return cXp.A01(bArr2, A0B(str, bArr, dPc.A02), dPc.A02);
    }

    public static byte[] A0B(String str, byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            try {
                byte[] bytes = AnonymousClass001.A1H("tls13 ", str, AnonymousClass000.A10()).getBytes(DefaultCrypto.UTF_8);
                int length2 = bytes.length;
                ByteBuffer allocate = ByteBuffer.allocate(length2 + 1 + 2 + length + 1);
                A05(i, allocate);
                short s = (short) length2;
                if (s < 0 || s >= 256) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Invalid argument. Short val = ");
                    A10.append(s);
                    throw BEA.A0X(AnonymousClass000.A0y(" cannot fit in single byte", A10));
                }
                allocate.put((byte) (s & 255));
                allocate.put(bytes);
                allocate.put((byte) length);
                allocate.put(bArr);
                return allocate.array();
            } catch (UnsupportedEncodingException e) {
                throw BE9.A0d(e);
            }
        } else {
            throw BE9.A0b("Context cannot be null when generating info", (byte) 80);
        }
    }

    public static byte[] A0C(String str, byte[] bArr, byte[] bArr2) {
        try {
            String replace = str.replace("-", "");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, C17900vP.A0A("Hmac", replace));
            Mac instance = Mac.getInstance(C17900vP.A0A("Hmac", replace));
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (NoSuchAlgorithmException e) {
            throw BE9.A0c(AnonymousClass000.A0y(" not found", AnonymousClass8BW.A0o("Hmac", str)), e, (byte) 80);
        } catch (InvalidKeyException e2) {
            throw BE9.A0c("Invalid key", e2, (byte) 80);
        }
    }

    public static void A05(int i, ByteBuffer byteBuffer) {
        byteBuffer.put(A08(i));
    }

    public static byte[] A0A(String str, String str2, int i) {
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append("#");
        A11.append(i);
        try {
            return AnonymousClass001.A1H("#", str2, A11).getBytes(DefaultCrypto.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw BEA.A0Y(e);
        }
    }
}
