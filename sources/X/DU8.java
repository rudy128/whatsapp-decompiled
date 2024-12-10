package X;

import java.security.cert.CertPathParameters;
import java.util.Collections;
import java.util.Set;

public class DU8 implements CertPathParameters {
    public final int A00;
    public final Set A01;
    public final DU9 A02;

    public Object clone() {
        return this;
    }

    public DU8(C25564Ci2 ci2) {
        this.A02 = ci2.A02;
        this.A01 = Collections.unmodifiableSet(ci2.A01);
        this.A00 = ci2.A00;
    }
}
