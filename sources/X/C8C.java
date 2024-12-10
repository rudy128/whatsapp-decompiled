package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class C8C {
    public static final String A00(C28573E8e e8e) {
        String Bb4 = e8e.Bb4();
        C18070vi.A0X(Bb4);
        byte[] A1a = AnonymousClass8BX.A1a(DefaultCrypto.UTF_8, Bb4);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(A1a, 0, A1a.length);
            String A0x = AnonymousClass8BT.A0x(instance.digest());
            C18070vi.A0X(A0x);
            return A0x;
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }
}
