package X;

import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.CpU  reason: case insensitive filesystem */
public class C25962CpU {
    public int A00;
    public List A01;
    public List A02;
    public Map A03;
    public Map A04;
    public Set A05;
    public DZP A06;
    public boolean A07;
    public boolean A08;
    public final PKIXParameters A09;
    public final Date A0A;
    public final Date A0B;

    public static void A00(C25962CpU cpU) {
        cpU.A02 = new ArrayList();
        cpU.A04 = new HashMap();
        cpU.A01 = new ArrayList();
        cpU.A03 = new HashMap();
        cpU.A00 = 0;
        cpU.A08 = false;
    }

    public C25962CpU(DU9 du9) {
        A00(this);
        this.A09 = du9.A01;
        this.A0B = du9.A03;
        this.A0A = du9.A02;
        this.A06 = du9.A09;
        this.A02 = C17880vN.A10(du9.A05);
        this.A04 = BE6.A10(du9.A07);
        this.A01 = C17880vN.A10(du9.A04);
        this.A03 = BE6.A10(du9.A06);
        this.A08 = du9.A0B;
        this.A00 = du9.A00;
        this.A07 = du9.A0A;
        this.A05 = du9.A08;
    }

    public C25962CpU(PKIXParameters pKIXParameters) {
        A00(this);
        this.A09 = (PKIXParameters) pKIXParameters.clone();
        CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
        if (targetCertConstraints != null) {
            this.A06 = new DZP(new CMI(targetCertConstraints).A00);
        }
        Date date = pKIXParameters.getDate();
        this.A0B = date;
        this.A0A = date == null ? new Date() : date;
        this.A07 = pKIXParameters.isRevocationEnabled();
        this.A05 = pKIXParameters.getTrustAnchors();
    }
}
