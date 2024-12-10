package X;

import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;

public class DZA implements E8M {
    public final PKIXCertPathChecker A00;

    public DZA(PKIXCertPathChecker pKIXCertPathChecker) {
        this.A00 = pKIXCertPathChecker;
    }

    public void BdV(C25597Cic cic) {
        this.A00.init(false);
    }

    public void check(Certificate certificate) {
        this.A00.check(certificate);
    }
}
