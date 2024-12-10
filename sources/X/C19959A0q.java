package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import javax.crypto.Cipher;

/* renamed from: X.A0q  reason: case insensitive filesystem */
public class C19959A0q {
    public final C20047A4q A00;
    public final AnonymousClass1TN A01;
    public final AnonymousClass1M9 A02;

    public static AnonymousClass1E7 A00(C19959A0q a0q, String str) {
        try {
            C22931Dv r0 = AnonymousClass1BI.A00;
            AnonymousClass1E7 A0E = a0q.A02.A0E(C22931Dv.A01(str));
            if (A0E != null) {
                return A0E;
            }
            throw new SecurityException("Invalid contact ID");
        } catch (AnonymousClass11T e) {
            throw new SecurityException(e);
        }
    }

    public AnonymousClass1E7 A01(C60012nF r7, String str) {
        String A13;
        AnonymousClass1TN r2 = this.A01;
        boolean A1Z = C72453Mb.A1Z(str);
        if (r7.A03) {
            byte[] A012 = r2.A01();
            if (A012 != null) {
                byte[] decode = Base64.decode(str, 11);
                int length = decode.length;
                if (length < 28) {
                    Log.e("InstrumentationShareableEncryptionManager/decrypt: SECI is too short");
                    A13 = "";
                } else {
                    byte[] A0W = C200410p.A0W(C28851b7.A08(A1Z ? 1 : 0, 12), decode);
                    byte[] A0W2 = C200410p.A0W(C28851b7.A08(12, length), decode);
                    try {
                        Cipher A022 = A62.A02("AES/GCM/NoPadding");
                        C18070vi.A0X(A022);
                        byte[] A1Q = AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(A012), AnonymousClass8BT.A11(A0W), A022, A0W2, 2);
                        C72453Mb.A1R(A1Q);
                        A13 = C108955ca.A13(A1Q);
                    } catch (Exception e) {
                        Log.e("InstrumentationShareableEncryptionManager/runDecipher: failed to decrypt", e);
                        throw new SecurityException(e);
                    }
                }
                return A00(this, A13);
            }
            throw AnonymousClass000.A0n("InstrumentationShareableEncryptionManager/decrypt is called but SCIEK does not exist or AB prop is disabled");
        }
        throw new SecurityException("Caller isn't trusted");
    }

    public String A02(AnonymousClass1BI r3, C60012nF r4) {
        return this.A00.A03(r4, r3.getRawString());
    }

    public C19959A0q(AnonymousClass1M9 r1, C20047A4q a4q, AnonymousClass1TN r3) {
        this.A02 = r1;
        this.A00 = a4q;
        this.A01 = r3;
    }
}
