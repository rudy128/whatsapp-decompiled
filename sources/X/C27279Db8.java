package X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Db8  reason: case insensitive filesystem */
public abstract class C27279Db8 extends X509CRL {
    public String A00;
    public C28305DxD A01;
    public E3R A02;
    public boolean A03;
    public byte[] A04;

    public C27279Db8(String str, C28305DxD dxD, E3R e3r, byte[] bArr, boolean z) {
        this.A02 = e3r;
        this.A01 = dxD;
        this.A00 = str;
        this.A04 = bArr;
        this.A03 = z;
    }

    public Set getCriticalExtensionOIDs() {
        return A00(true);
    }

    public byte[] getEncoded() {
        try {
            return this.A01.A0C("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        return A00(false);
    }

    public String getSigAlgName() {
        return this.A00;
    }

    public byte[] getSigAlgParams() {
        return AnonymousClass1C2.A02(this.A04);
    }

    public void verify(PublicKey publicKey) {
        A02(publicKey, new DZD(this));
    }

    public void verify(PublicKey publicKey, String str) {
        A02(publicKey, new DZE(str, this));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.OutputStream, X.Bxd] */
    private void A01(PublicKey publicKey, Signature signature, AnonymousClass1Bx r6, byte[] bArr) {
        if (r6 != null) {
            C26178Ctw.A03(signature, r6);
        }
        signature.initVerify(publicKey);
        try {
            ? outputStream = new OutputStream();
            outputStream.A00 = signature;
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 512);
            this.A01.A03.A0A(bufferedOutputStream, "DER");
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private void A02(PublicKey publicKey, E76 e76) {
        C28305DxD dxD = this.A01;
        C28292Dx0 dx0 = dxD.A02;
        if (dx0.equals(dxD.A03.A03)) {
            Map map = C26178Ctw.A00;
            if (EBK.A0C.A0J(dx0.A01)) {
                C28339Dxl A05 = C28339Dxl.A05(dx0.A00);
                C28339Dxl A052 = C28339Dxl.A05(C28269Dwd.A02(dxD.A01).A0K());
                boolean z = false;
                for (int i = 0; i != A052.A0K(); i++) {
                    C28292Dx0 A012 = C28292Dx0.A01(A05.A0M(i));
                    try {
                        A01(publicKey, e76.BHr(C26178Ctw.A01(A012)), A012.A00, C28269Dwd.A02(A052.A0M(i)).A0K());
                        z = true;
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                    } catch (SignatureException e) {
                        throw e;
                    }
                }
                if (!z) {
                    throw new InvalidKeyException("no matching key found");
                }
                return;
            }
            Signature BHr = e76.BHr(this.A00);
            byte[] bArr = this.A04;
            if (bArr == null) {
                A01(publicKey, BHr, (AnonymousClass1Bx) null, getSignature());
                return;
            }
            try {
                A01(publicKey, BHr, AnonymousClass1Bz.A01(bArr), getSignature());
            } catch (IOException e2) {
                throw new SignatureException(C17900vP.A0C("cannot decode signature parameters: ", AnonymousClass000.A10(), e2));
            }
        } else {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
    }

    public byte[] getExtensionValue(String str) {
        C28342Dxo dxo;
        C28314DxM A012;
        C28309DxH dxH = this.A01.A03.A04;
        if (dxH == null || (A012 = C28309DxH.A01(BE6.A19(str), dxH)) == null) {
            dxo = null;
        } else {
            dxo = A012.A01;
        }
        if (dxo == null) {
            return null;
        }
        try {
            return dxo.A0B();
        } catch (Exception e) {
            throw AnonymousClass000.A0n(BEA.A0j(e, "error parsing ", AnonymousClass000.A10()));
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.security.Principal, X.DxQ] */
    public Principal getIssuerDN() {
        AnonymousClass1C0 r0 = C28318DxQ.A0C;
        return new C28318DxQ(C28324DxW.A01(this.A01.A03.A02.A00).A00);
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.A01.A03.A02.A0B());
        } catch (IOException unused) {
            throw AnonymousClass000.A0n("can't encode issuer DN");
        }
    }

    public Date getNextUpdate() {
        C28323DxV dxV = this.A01.A03.A05;
        if (dxV == null) {
            return null;
        }
        return dxV.A0E();
    }

    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Enumeration dUe;
        C28314DxM A012;
        C28280Dwo dwo = this.A01.A03;
        C28339Dxl dxl = dwo.A01;
        if (dxl == null) {
            dUe = new C27098DUc(dwo);
        } else {
            dUe = new C27100DUe(dxl.A0L(), dwo);
        }
        C28324DxW dxW = null;
        while (dUe.hasMoreElements()) {
            C28303DxB dxB = (C28303DxB) dUe.nextElement();
            if (C28337Dxj.A02(C28339Dxl.A03(dxB.A00)).A0L(bigInteger)) {
                return new C27280Db9(dxW, dxB, this.A03);
            }
            if (this.A03 && dxB.A00.A0K() == 3 && (A012 = C28309DxH.A01(C28314DxM.A0A, dxB.A0D())) != null) {
                dxW = C28324DxW.A01(C28317DxP.A01(C28314DxM.A01(A012))[0].A01);
            }
        }
        return null;
    }

    public String getSigAlgOID() {
        return this.A01.A02.A01.A01;
    }

    public byte[] getSignature() {
        C28269Dwd dwd = this.A01.A01;
        if (dwd.A00 == 0) {
            return AnonymousClass1C2.A02(dwd.A01);
        }
        throw AnonymousClass000.A0n("attempt to get non-octet aligned data from BIT STRING");
    }

    public byte[] getTBSCertList() {
        try {
            return this.A01.A03.A0C("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Date getThisUpdate() {
        return this.A01.A03.A06.A0E();
    }

    public int getVersion() {
        C28337Dxj dxj = this.A01.A03.A00;
        if (dxj == null) {
            return 1;
        }
        return dxj.A0K() + 1;
    }

    /* JADX WARNING: type inference failed for: r0v43, types: [X.Dwq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v49, types: [X.Dwq, java.lang.Object] */
    public String toString() {
        Object obj;
        StringBuffer A0s = BE6.A0s();
        String str = AnonymousClass1Bo.A00;
        A0s.append("              Version: ");
        A0s.append(getVersion());
        A0s.append(str);
        A0s.append("             IssuerDN: ");
        A0s.append(getIssuerDN());
        A0s.append(str);
        A0s.append("          This update: ");
        A0s.append(getThisUpdate());
        A0s.append(str);
        A0s.append("          Next update: ");
        A0s.append(getNextUpdate());
        A0s.append(str);
        A0s.append("  Signature Algorithm: ");
        A0s.append(this.A00);
        A0s.append(str);
        C26178Ctw.A02(str, A0s, getSignature());
        C28309DxH dxH = this.A01.A03.A04;
        if (dxH != null) {
            Enumeration elements = dxH.A01.elements();
            if (elements.hasMoreElements()) {
                A0s.append("           Extensions: ");
                A0s.append(str);
            }
            while (true) {
                if (!elements.hasMoreElements()) {
                    break;
                }
                AnonymousClass1C0 r5 = (AnonymousClass1C0) elements.nextElement();
                C28314DxM A012 = C28309DxH.A01(r5, dxH);
                C28342Dxo dxo = A012.A01;
                if (dxo == null) {
                    break;
                }
                C24178Bwo A022 = C28342Dxo.A02(A0s, dxo, A012);
                C24178Bwo A0222 = C28342Dxo.A02(A0s, dxo, A012);
                try {
                } catch (Exception unused) {
                    A0s.append(r5.A01);
                    A0s.append(" value = ");
                    A0s.append("*****");
                }
                if (r5.A0J(C28314DxM.A09)) {
                    BigInteger bigInteger = new BigInteger(1, C28337Dxj.A02(A0222.A05()).A00);
                    ? obj2 = new Object();
                    obj2.A00 = bigInteger;
                    obj = obj2;
                } else {
                    if (r5.A0J(C28314DxM.A0C)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Base CRL: ");
                        BigInteger bigInteger2 = new BigInteger(1, C28337Dxj.A02(A0222.A05()).A00);
                        ? obj3 = new Object();
                        obj3.A00 = bigInteger2;
                        A0s.append(C17890vO.A0V(obj3, A10));
                    } else if (r5.A0J(C28314DxM.A0K)) {
                        obj = C28306DxE.A01(A0222.A05());
                    } else if (r5.A0J(C28314DxM.A08)) {
                        obj = C28308DxG.A01(A0222.A05());
                    } else if (r5.A0J(C28314DxM.A0F)) {
                        obj = C28308DxG.A01(A0222.A05());
                    } else {
                        C25895Co6.A02(A0s, A0222, r5);
                    }
                    A0s.append(str);
                }
                A0s.append(obj);
                A0s.append(str);
                break;
                break;
            }
        }
        Set<? extends X509CRLEntry> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object append : revokedCertificates) {
                A0s.append(append);
                A0s.append(str);
            }
        }
        return A0s.toString();
    }

    public void verify(PublicKey publicKey, Provider provider) {
        try {
            A02(publicKey, new DZF(provider, this));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException(C17900vP.A0C("provider issue: ", AnonymousClass000.A10(), e));
        }
    }

    private HashSet A00(boolean z) {
        C28309DxH dxH;
        if (getVersion() != 2 || (dxH = this.A01.A03.A04) == null) {
            return null;
        }
        HashSet A12 = C17880vN.A12();
        Enumeration elements = dxH.A01.elements();
        while (elements.hasMoreElements()) {
            AnonymousClass1C0 r1 = (AnonymousClass1C0) elements.nextElement();
            if (z == C28309DxH.A01(r1, dxH).A02) {
                A12.add(r1.A01);
            }
        }
        return A12;
    }

    public Set getRevokedCertificates() {
        Enumeration dUe;
        C28314DxM A012;
        HashSet A12 = C17880vN.A12();
        C28280Dwo dwo = this.A01.A03;
        C28339Dxl dxl = dwo.A01;
        if (dxl == null) {
            dUe = new C27098DUc(dwo);
        } else {
            dUe = new C27100DUe(dxl.A0L(), dwo);
        }
        C28324DxW dxW = null;
        while (dUe.hasMoreElements()) {
            C28303DxB dxB = (C28303DxB) dUe.nextElement();
            boolean z = this.A03;
            A12.add(new C27280Db9(dxW, dxB, z));
            if (z && dxB.A00.A0K() == 3 && (A012 = C28309DxH.A01(C28314DxM.A0A, dxB.A0D())) != null) {
                dxW = C28324DxW.A01(C28317DxP.A01(C28314DxM.A01(A012))[0].A01);
            }
        }
        if (!A12.isEmpty()) {
            return Collections.unmodifiableSet(A12);
        }
        return null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(C28314DxM.A0K.A01);
        criticalExtensionOIDs.remove(C28314DxM.A0C.A01);
        return C108945cZ.A1U(criticalExtensionOIDs);
    }

    public boolean isRevoked(Certificate certificate) {
        Enumeration dUe;
        C28324DxW dxW;
        C28314DxM A012;
        if (certificate.getType().equals("X.509")) {
            C28305DxD dxD = this.A01;
            C28280Dwo dwo = dxD.A03;
            C28339Dxl dxl = dwo.A01;
            if (dxl == null) {
                dUe = new C27098DUc(dwo);
            } else {
                dUe = new C27100DUe(dxl.A0L(), dwo);
            }
            C28324DxW dxW2 = dxD.A03.A02;
            if (dUe.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (true) {
                    if (!dUe.hasMoreElements()) {
                        break;
                    }
                    C28303DxB A013 = C28303DxB.A01(dUe.nextElement());
                    if (this.A03 && A013.A00.A0K() == 3 && (A012 = C28309DxH.A01(C28314DxM.A0A, A013.A0D())) != null) {
                        dxW2 = C28324DxW.A01(C28317DxP.A01(C28314DxM.A01(A012))[0].A01);
                    }
                    if (C28337Dxj.A02(A013.A00.A0M(0)).A0L(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            dxW = C28324DxW.A01(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                dxW = C28298Dx6.A01(certificate.getEncoded()).A03.A05;
                            } catch (CertificateEncodingException e) {
                                throw AnonymousClass000.A0k(C17900vP.A0C("Cannot process certificate: ", AnonymousClass000.A10(), e));
                            }
                        }
                        if (dxW2.equals(dxW)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw AnonymousClass000.A0k("X.509 CRL used with non X.509 Cert");
    }
}
