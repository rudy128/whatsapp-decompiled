package X;

import com.whatsapp.wamsys.JniBridge;
import java.math.BigInteger;

/* renamed from: X.9x4  reason: invalid class name and case insensitive filesystem */
public class C197669x4 {
    public final JniBridge A00;

    public static String A00(BigInteger bigInteger) {
        if (bigInteger != null) {
            try {
                byte[] byteArray = bigInteger.toByteArray();
                int length = byteArray.length;
                if (length >= 4) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    for (int i = length - 1; i >= length - 4; i--) {
                        A10.append(AnonymousClass8BS.A0l(Byte.valueOf(byteArray[i]), "%02X", new Object[1], 0));
                    }
                    return A10.toString();
                }
            } catch (Exception e) {
                C17900vP.A0X(e, "PAY: JweCompactSerializer/getCertID: ", AnonymousClass000.A10());
                return null;
            }
        }
        return null;
    }

    public C197669x4(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }
}
