package X;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9fD  reason: invalid class name and case insensitive filesystem */
public class C187069fD {
    public final int A00;
    public final IvParameterSpec A01;
    public final SecretKeySpec A02;
    public final SecretKeySpec A03;

    public C187069fD(IvParameterSpec ivParameterSpec, SecretKeySpec secretKeySpec, SecretKeySpec secretKeySpec2, int i) {
        this.A02 = secretKeySpec;
        this.A03 = secretKeySpec2;
        this.A01 = ivParameterSpec;
        this.A00 = i;
    }
}
