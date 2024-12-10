package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.SecretKey;

/* renamed from: X.9Np  reason: invalid class name and case insensitive filesystem */
public class C180709Np {
    public static List A04;
    public C199009zH A00;
    public C197719x9 A01;
    public B4E A02;
    public String A03;

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.AiN] */
    /* JADX WARNING: type inference failed for: r0v19, types: [X.AiM, java.lang.Object] */
    public C21336AiM A00(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        String str6;
        byte[] bArr;
        SecretKey secretKey;
        byte[] bArr2;
        if (str == null || !str.isEmpty()) {
            ArrayList A13 = AnonymousClass000.A13();
            for (C186349e3 r1 : A04) {
                if (r1.A01.equals(str)) {
                    A13.add(r1);
                }
            }
            if (A13.size() != 0) {
                C186349e3 r4 = (C186349e3) A13.get(new SecureRandom().nextInt(A13.size()));
                this.A03 = r4.A02;
                StringBuilder sb = new StringBuilder(500);
                try {
                    byte[] A1b = AnonymousClass8BX.A1b("AES/CBC/PKCS5Padding", new SecureRandom());
                    String A002 = C196979vx.A00(A1b, 2);
                    byte[] A003 = C197719x9.A00(str4, A002);
                    String str7 = str5;
                    int length = str7.length() / 2;
                    byte[] bArr3 = new byte[length];
                    for (int i = 0; i < length; i++) {
                        AnonymousClass8BY.A1L(str7, bArr3, i);
                    }
                    String A004 = C196979vx.A00(AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(bArr3), AnonymousClass8BT.A11(A1b), AnonymousClass8BR.A18(), A003, 1), 2);
                    C17890vO.A10(str3, "|", str2, sb);
                    sb.append("|");
                    C17890vO.A10(A004, "|", A002, sb);
                    String obj = sb.toString();
                    if (bool.booleanValue()) {
                        try {
                            secretKey = AnonymousClass8BX.A0r();
                        } catch (NoSuchAlgorithmException unused) {
                            secretKey = null;
                        }
                        byte[] encoded = secretKey.getEncoded();
                        byte[] A1b2 = AnonymousClass8BX.A1b("AES/CBC/PKCS5Padding", new SecureRandom());
                        String A005 = C196979vx.A00(A1b2, 2);
                        byte[] bytes = obj.getBytes();
                        byte[] A1Q = AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(encoded), AnonymousClass8BT.A11(A1b2), AnonymousClass8BR.A18(), bytes, 1);
                        try {
                            bArr2 = AnonymousClass8BY.A1Y(AnonymousClass8BX.A0h(C196979vx.A01(this.A03.getBytes("utf-8"))), C196979vx.A00(encoded, 0).getBytes());
                        } catch (Exception unused2) {
                            bArr2 = null;
                        }
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("eyJhbGciOiJSU0EtT0FFUCIsImVuYyI6IkEyNTZHQ00ifQ.");
                        A10.append(C196979vx.A00(bArr2, 2));
                        A10.append(".");
                        A10.append(A005);
                        A10.append(".");
                        str6 = AnonymousClass000.A0y(C196979vx.A00(A1Q, 2), A10).replace("+", "-").replace("/", "_");
                    } else {
                        try {
                            bArr = AnonymousClass8BY.A1Y(AnonymousClass8BX.A0h(C196979vx.A01(this.A03.getBytes("utf-8"))), obj.getBytes());
                        } catch (Exception unused3) {
                            bArr = null;
                        }
                        str6 = C196979vx.A00(bArr, 2);
                    }
                    String str8 = r4.A00;
                    String str9 = r4.A01;
                    ? obj2 = new Object();
                    obj2.ki = str8;
                    obj2.code = str9;
                    obj2.encryptedBase64String = str6;
                    ? obj3 = new Object();
                    obj3.type = "";
                    obj3.subType = "";
                    obj3.data = obj2;
                    return obj3;
                } catch (Exception unused4) {
                    throw new AnonymousClass9LU(AnonymousClass9Hf.UNKNOWN_ERROR);
                }
            } else {
                throw new AnonymousClass9LU(AnonymousClass9Hf.KEY_CODE_INVALID);
            }
        } else {
            throw new AnonymousClass9LU(AnonymousClass9Hf.KEY_CODE_EMPTY);
        }
    }
}
