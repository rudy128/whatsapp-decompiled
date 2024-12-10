package X;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

public abstract class A62 {
    public static Set A00 = Collections.singleton("Crypto");
    public static final Set A01;

    public static Object A00(Object obj, String str, String str2) {
        if (Build.VERSION.SDK_INT < 28) {
            Iterator it = A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    A00.contains(str2);
                    break;
                }
                String A0v = C17880vN.A0v(it);
                try {
                    if (!A0v.equals(str2)) {
                        if (obj instanceof SecureRandom) {
                            return SecureRandom.getInstance(str, A0v);
                        }
                        if (obj instanceof Cipher) {
                            return Cipher.getInstance(str, A0v);
                        }
                        if (obj instanceof KeyGenerator) {
                            return KeyGenerator.getInstance(str, A0v);
                        }
                        throw AnonymousClass000.A0k("Unknown instance type");
                    }
                } catch (IllegalArgumentException | NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException e) {
                    e.getMessage();
                }
            }
        }
        return obj;
    }

    public static SecureRandom A01() {
        if (Build.VERSION.SDK_INT >= 26) {
            return SecureRandom.getInstanceStrong();
        }
        SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
        return (SecureRandom) A00(instance, "SHA1PRNG", instance.getProvider().getName());
    }

    static {
        LinkedHashSet A14 = C17880vN.A14();
        A01 = A14;
        A14.add("GmsCore_OpenSSL");
        A14.add("AndroidOpenSSL");
    }

    public static Cipher A02(String str) {
        Cipher instance = Cipher.getInstance(str);
        return (Cipher) A00(instance, str, instance.getProvider().getName());
    }
}
