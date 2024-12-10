package X;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

/* renamed from: X.Daq  reason: case insensitive filesystem */
public abstract class C27264Daq extends AlgorithmParameterGeneratorSpi {
    public SecureRandom A00;
    public final E3R A01 = new DZI();

    public void engineInit(int i, SecureRandom secureRandom) {
        this.A00 = secureRandom;
    }
}
