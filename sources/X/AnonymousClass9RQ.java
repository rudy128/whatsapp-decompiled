package X;

import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.security.MessageDigest;

/* renamed from: X.9RQ  reason: invalid class name */
public abstract class AnonymousClass9RQ {
    public static final byte[] A00(String str, String str2) {
        C18070vi.A0d(str, 0);
        try {
            byte[] decode = Base64.decode(str2, 2);
            C18070vi.A0X(decode);
            MessageDigest A1I = C108945cZ.A1I();
            C18070vi.A0X(A1I);
            A1I.update(decode);
            return A1I.digest(AnonymousClass8BX.A1a(DefaultCrypto.UTF_8, str));
        } catch (Exception unused) {
            Log.e("Exception generating hash at sha256Bytes");
            return null;
        }
    }
}
