package X;

import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.util.Set;

/* renamed from: X.Ci2  reason: case insensitive filesystem */
public class C25564Ci2 {
    public int A00 = 5;
    public Set A01 = C17880vN.A12();
    public final DU9 A02;

    public C25564Ci2(PKIXBuilderParameters pKIXBuilderParameters) {
        this.A02 = new DU9(new C25962CpU((PKIXParameters) pKIXBuilderParameters));
        this.A00 = pKIXBuilderParameters.getMaxPathLength();
    }

    public C25564Ci2(DU9 du9) {
        this.A02 = du9;
    }
}
