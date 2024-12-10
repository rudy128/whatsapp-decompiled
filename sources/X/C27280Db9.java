package X;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Db9  reason: case insensitive filesystem */
public class C27280Db9 extends X509CRLEntry {
    public C28303DxB A00;
    public C28324DxW A01;
    public volatile int A02;
    public volatile boolean A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C27280Db9)) {
            return super.equals(this);
        }
        C27280Db9 db9 = (C27280Db9) obj;
        if (!this.A03 || !db9.A03 || this.A02 == db9.A02) {
            return this.A00.equals(db9.A00);
        }
        return false;
    }

    public X500Principal getCertificateIssuer() {
        C28324DxW dxW = this.A01;
        if (dxW == null) {
            return null;
        }
        try {
            return new X500Principal(dxW.A0B());
        } catch (IOException unused) {
            return null;
        }
    }

    public Set getCriticalExtensionOIDs() {
        return A00(true);
    }

    public byte[] getEncoded() {
        try {
            return this.A00.A0C("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        return A00(false);
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        if (!this.A03) {
            this.A02 = super.hashCode();
            this.A03 = true;
        }
        return this.A02;
    }

    private HashSet A00(boolean z) {
        C28309DxH A0D = this.A00.A0D();
        if (A0D == null) {
            return null;
        }
        HashSet A12 = C17880vN.A12();
        Enumeration elements = A0D.A01.elements();
        while (elements.hasMoreElements()) {
            AnonymousClass1C0 r1 = (AnonymousClass1C0) elements.nextElement();
            if (z == C28309DxH.A01(r1, A0D).A02) {
                A12.add(r1.A01);
            }
        }
        return A12;
    }

    public Date getRevocationDate() {
        return C28323DxV.A01(C28339Dxl.A04(this.A00.A00)).A0E();
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(C28337Dxj.A02(C28339Dxl.A03(this.A00.A00)).A00);
    }

    public boolean hasExtensions() {
        return AnonymousClass000.A1W(this.A00.A0D());
    }

    public String toString() {
        Object obj;
        StringBuffer A0s = BE6.A0s();
        String str = AnonymousClass1Bo.A00;
        A0s.append("      userCertificate: ");
        A0s.append(getSerialNumber());
        A0s.append(str);
        A0s.append("       revocationDate: ");
        A0s.append(getRevocationDate());
        A0s.append(str);
        A0s.append("       certificateIssuer: ");
        A0s.append(getCertificateIssuer());
        A0s.append(str);
        C28309DxH A0D = this.A00.A0D();
        if (A0D != null) {
            Enumeration elements = A0D.A01.elements();
            if (elements.hasMoreElements()) {
                A0s.append("   crlEntryExtensions:");
                loop0:
                while (true) {
                    A0s.append(str);
                    while (elements.hasMoreElements()) {
                        AnonymousClass1C0 r6 = (AnonymousClass1C0) elements.nextElement();
                        C28314DxM A012 = C28309DxH.A01(r6, A0D);
                        C28342Dxo dxo = A012.A01;
                        if (dxo != null) {
                            C24178Bwo A022 = C28342Dxo.A02(A0s, dxo, A012);
                            try {
                                if (r6.A0J(C28314DxM.A0T)) {
                                    obj = C28312DxK.A01(C28335Dxh.A02(A022.A05()));
                                } else if (r6.A0J(C28314DxM.A0A)) {
                                    A0s.append("Certificate issuer: ");
                                    AnonymousClass1Bz A05 = A022.A05();
                                    if (A05 != null) {
                                        obj = new C28317DxP(C28339Dxl.A05(A05));
                                    } else {
                                        obj = null;
                                    }
                                } else {
                                    C25895Co6.A02(A0s, A022, r6);
                                    A0s.append(str);
                                }
                                A0s.append(obj);
                                A0s.append(str);
                            } catch (Exception unused) {
                                A0s.append(r6.A01);
                                A0s.append(" value = ");
                                A0s.append("*****");
                            }
                        }
                    }
                    break loop0;
                }
            }
        }
        return A0s.toString();
    }

    public C27280Db9(C28324DxW dxW, C28303DxB dxB, boolean z) {
        C28314DxM A012;
        this.A00 = dxB;
        C28324DxW dxW2 = null;
        if (z) {
            AnonymousClass1C0 r1 = C28314DxM.A0A;
            C28309DxH A0D = dxB.A0D();
            if (A0D == null || (A012 = C28309DxH.A01(r1, A0D)) == null) {
                dxW2 = dxW;
            } else {
                try {
                    C28322DxU[] A013 = C28317DxP.A01(C28314DxM.A01(A012));
                    int i = 0;
                    while (true) {
                        if (i >= A013.length) {
                            break;
                        } else if (A013[i].A00 == 4) {
                            dxW2 = C28324DxW.A01(A013[i].A01);
                            break;
                        } else {
                            i++;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        this.A01 = dxW2;
    }

    public byte[] getExtensionValue(String str) {
        C28314DxM dxM;
        AnonymousClass1C0 A19 = BE6.A19(str);
        C28309DxH A0D = this.A00.A0D();
        if (A0D != null) {
            dxM = C28309DxH.A01(A19, A0D);
        } else {
            dxM = null;
        }
        if (dxM == null) {
            return null;
        }
        try {
            return dxM.A01.A0B();
        } catch (Exception e) {
            throw AnonymousClass000.A0n(BEA.A0j(e, "Exception encoding: ", AnonymousClass000.A10()));
        }
    }
}
