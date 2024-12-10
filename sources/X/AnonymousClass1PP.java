package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: X.1PP  reason: invalid class name */
public class AnonymousClass1PP {
    public static final Random A02 = new Random();
    public static volatile SecureRandom A03;
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;

    public AnonymousClass205 A01(AnonymousClass1BI r4, boolean z) {
        return new AnonymousClass205(r4, A00(this.A00, this.A01, false), z);
    }

    public AnonymousClass1PP(AnonymousClass11S r1, AnonymousClass11P r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static String A00(AnonymousClass11S r7, AnonymousClass11P r8, boolean z) {
        r7.A0I();
        PhoneUserJid phoneUserJid = r7.A0E;
        C17960vV.A07(phoneUserJid);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            long A012 = AnonymousClass11P.A01(r8);
            byte[] bArr = new byte[8];
            for (int i = 7; i >= 0; i--) {
                bArr[i] = (byte) ((int) A012);
                A012 >>= 8;
            }
            instance.update(bArr);
            instance.update(phoneUserJid.getRawString().getBytes());
            byte[] bArr2 = new byte[16];
            if (z) {
                if (A03 == null) {
                    synchronized (AnonymousClass1PP.class) {
                        if (A03 == null) {
                            A03 = new SecureRandom();
                        }
                    }
                }
                A03.nextBytes(bArr2);
            } else {
                A02.nextBytes(bArr2);
            }
            instance.update(bArr2);
            return C17970vW.A06(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.w("Unable to provide message id hash due to missing md5 algorithm.", e);
            throw new IllegalStateException("Unable to provide message id hash due to missing md5 algorithm.", e);
        }
    }
}
