package X;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.DcG  reason: case insensitive filesystem */
public abstract class C27344DcG extends SecretKeyFactorySpi {
    public String A00;
    public AnonymousClass1C0 A01;

    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        if (keySpec instanceof SecretKeySpec) {
            return new SecretKeySpec(((SecretKeySpec) keySpec).getEncoded(), this.A00);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }

    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        } else if (secretKey == null) {
            throw new InvalidKeySpecException("key parameter is null");
        } else if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.A00);
        } else {
            try {
                return (KeySpec) BE6.A0w(cls, byte[].class, new Class[1], 0).newInstance(new Object[]{secretKey.getEncoded()});
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
    }

    public SecretKey engineTranslateKey(SecretKey secretKey) {
        if (secretKey != null) {
            String algorithm = secretKey.getAlgorithm();
            String str = this.A00;
            if (algorithm.equalsIgnoreCase(str)) {
                return new SecretKeySpec(secretKey.getEncoded(), str);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Key not of type ");
            A10.append(str);
            throw new InvalidKeyException(AnonymousClass000.A0y(".", A10));
        }
        throw new InvalidKeyException("key parameter is null");
    }
}
