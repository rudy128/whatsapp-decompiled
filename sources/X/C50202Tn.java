package X;

import android.util.Base64;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2Tn  reason: invalid class name and case insensitive filesystem */
public abstract class C50202Tn {
    public static final String A00(AnonymousClass11S r3, AnonymousClass1BI r4) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            C18070vi.A0X(instance);
            PhoneUserJid A00 = AnonymousClass11S.A00(r3);
            if (A00 == null) {
                Log.e("IntegrityFunnelLogger/myPhoneUserJid is null");
                return "";
            }
            String rawString = A00.getRawString();
            Charset charset = C26571Sq.A05;
            instance.update(C18070vi.A1A(rawString, charset));
            instance.update(C18070vi.A1A(r4.getRawString(), charset));
            String encodeToString = Base64.encodeToString(instance.digest(), 2);
            C18070vi.A0X(encodeToString);
            return encodeToString;
        } catch (NoSuchAlgorithmException unused) {
            Log.e("IntegrityFunnelLogger/no SHA1 algorithm available");
            return "";
        }
    }
}
