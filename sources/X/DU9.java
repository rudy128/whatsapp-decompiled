package X;

import java.security.cert.CertPathParameters;
import java.security.cert.PKIXParameters;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DU9 implements CertPathParameters {
    public final int A00;
    public final PKIXParameters A01;
    public final Date A02;
    public final Date A03;
    public final List A04;
    public final List A05;
    public final Map A06;
    public final Map A07;
    public final Set A08;
    public final DZP A09;
    public final boolean A0A;
    public final boolean A0B;

    public Object clone() {
        return this;
    }

    public DU9(C25962CpU cpU) {
        this.A01 = cpU.A09;
        this.A03 = cpU.A0B;
        this.A02 = cpU.A0A;
        this.A05 = Collections.unmodifiableList(cpU.A02);
        this.A07 = Collections.unmodifiableMap(BE6.A10(cpU.A04));
        this.A04 = Collections.unmodifiableList(cpU.A01);
        this.A06 = Collections.unmodifiableMap(BE6.A10(cpU.A03));
        this.A09 = cpU.A06;
        this.A0A = cpU.A07;
        this.A0B = cpU.A08;
        this.A00 = cpU.A00;
        this.A08 = Collections.unmodifiableSet(cpU.A05);
    }
}
