package X;

import java.security.InvalidParameterException;
import java.security.Permission;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.DcE  reason: case insensitive filesystem */
public abstract class C27342DcE extends KeyGeneratorSpi {
    public int A00;
    public String A01;
    public CYU A02;
    public boolean A03 = true;

    public C27342DcE(String str, CYU cyu, int i) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = cyu;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.C5M, java.lang.Object] */
    public SecretKey engineGenerateKey() {
        if (this.A03) {
            CYU cyu = this.A02;
            SecureRandom A002 = C26181Cu4.A00();
            int i = this.A00;
            ? obj = new Object();
            if (A002 == null) {
                A002 = C26181Cu4.A00();
            }
            obj.A01 = A002;
            obj.A00 = i;
            cyu.A00(obj);
            this.A03 = false;
        }
        return new SecretKeySpec(this.A02.A01(), this.A01);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.C5M, java.lang.Object] */
    public void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = C26181Cu4.A00();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        CYU cyu = this.A02;
        ? obj = new Object();
        Permission permission = C26181Cu4.A03;
        if (secureRandom == null) {
            secureRandom = C26181Cu4.A00();
        }
        obj.A01 = secureRandom;
        obj.A00 = i;
        cyu.A00(obj);
        this.A03 = false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.C5M, java.lang.Object] */
    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            CYU cyu = this.A02;
            int i = this.A00;
            ? obj = new Object();
            Permission permission = C26181Cu4.A03;
            obj.A01 = secureRandom;
            obj.A00 = i;
            cyu.A00(obj);
            this.A03 = false;
        }
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw BE6.A0y("Not Implemented");
    }
}
