package X;

import java.security.MessageDigest;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DZC implements E8M {
    public static final Map A05;
    public String A00;
    public C25597Cic A01;
    public boolean A02;
    public final E3R A03;
    public final C27278Db7 A04;

    public DZC(E3R e3r, C27278Db7 db7) {
        this.A04 = db7;
        this.A03 = e3r;
    }

    public void BdV(C25597Cic cic) {
        this.A01 = cic;
        this.A02 = C25917Cob.A01("ocsp.enable");
        this.A00 = C25917Cob.A00("ocsp.responderURL");
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.Dwm] */
    private C28278Dwm A00(C28337Dxj dxj, C28292Dx0 dx0, C28298Dx6 dx6) {
        try {
            E3R e3r = this.A03;
            AnonymousClass1C0 r2 = dx0.A01;
            String A0s = C17880vN.A0s(r2, CGV.A00);
            if (A0s == null) {
                A0s = r2.A01;
            }
            MessageDigest instance = MessageDigest.getInstance(A0s, ((DZI) e3r).A00);
            C28327DxZ dxZ = new C28327DxZ(instance.digest(dx6.A03.A06.A0C("DER")));
            C28327DxZ dxZ2 = new C28327DxZ(instance.digest(dx6.A03.A09.A00.A0K()));
            ? obj = new Object();
            obj.A03 = dx0;
            obj.A02 = dxZ;
            obj.A01 = dxZ2;
            obj.A00 = dxj;
            return obj;
        } catch (Exception e) {
            throw new CertPathValidatorException(AnonymousClass001.A1E(e, "problem creating ID: ", AnonymousClass000.A10()), e);
        }
    }

    private C28298Dx6 A01() {
        try {
            return C28298Dx6.A01(this.A01.A03.getEncoded());
        } catch (Exception e) {
            throw C25597Cic.A00(C17900vP.A0C("cannot process signing cert: ", AnonymousClass000.A10(), e), e, this.A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        if (r0 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9 A[Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0 A[Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa A[Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0193 A[Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0196 A[Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.security.cert.X509Certificate r9, X.C28297Dx5 r10, X.C25597Cic r11, X.E3R r12, byte[] r13) {
        /*
            java.lang.String r2 = "OCSP response failure: "
            X.Dxl r6 = r10.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.Dx0 r4 = r10.A03     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1Bx r3 = r4.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r3 == 0) goto L_0x008c
            X.Dwh r1 = X.C28273Dwh.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r1 == r3) goto L_0x008c
            X.1Bz r0 = r3.CP9()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = r1.A0I(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r0 != 0) goto L_0x008c
            X.1C0 r1 = r4.A01     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1C0 r0 = X.AnonymousClass1Bw.A0I     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = r1.A0J(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r0 == 0) goto L_0x008c
            X.DxO r0 = X.C28316DxO.A01(r3)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.Dx0 r0 = r0.A02     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1C0 r1 = r0.A01     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.util.Map r0 = X.CGV.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.lang.String r5 = X.C17880vN.A0s(r1, r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r5 != 0) goto L_0x0038
            java.lang.String r5 = r1.A01     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x0038:
            r0 = 45
            int r3 = r5.indexOf(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r3 <= 0) goto L_0x005b
            java.lang.String r0 = "SHA3"
            boolean r0 = r5.startsWith(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r0 != 0) goto L_0x005b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.lang.String r0 = X.AnonymousClass8BS.A0o(r5, r3)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            r1.append(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.lang.String r0 = X.BE6.A0p(r3, r5)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.lang.String r5 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x005b:
            r4.append(r5)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.lang.String r0 = "WITHRSAANDMGF1"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r4)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x0064:
            X.DZI r12 = (X.DZI) r12     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.security.Provider r7 = r12.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.security.Signature r5 = java.security.Signature.getInstance(r0, r7)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.security.cert.X509Certificate r8 = r11.A03     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.DxJ r0 = r10.A02     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.DxR r0 = r0.A03     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1Bx r4 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r1 = r4 instanceof X.C28342Dxo     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r1 == 0) goto L_0x009e
            r0 = r4
            X.Dxo r0 = (X.C28342Dxo) r0     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            byte[] r3 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r3 == 0) goto L_0x009e
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0, r7)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r9 == 0) goto L_0x00e1
            boolean r0 = A02(r1, r9, r3)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            goto L_0x00da
        L_0x008c:
            java.util.Map r3 = A05     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1C0 r1 = r4.A01     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = r3.containsKey(r1)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = X.C17880vN.A0s(r1, r3)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            goto L_0x0064
        L_0x009b:
            java.lang.String r0 = r1.A01     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            goto L_0x0064
        L_0x009e:
            X.CZY r3 = X.C28373DyJ.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r1 == 0) goto L_0x00a4
            r0 = 0
            goto L_0x00a8
        L_0x00a4:
            X.DxW r0 = X.C28324DxW.A01(r4)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x00a8:
            X.DxW r1 = X.C28324DxW.A02(r0, r3)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r9 == 0) goto L_0x00c1
            javax.security.auth.x500.X500Principal r0 = r9.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.DxW r0 = X.C28324DxW.A02(r0, r3)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = r1.equals(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r0 == 0) goto L_0x00c1
            goto L_0x00dc
        L_0x00c1:
            if (r8 == 0) goto L_0x00d6
            javax.security.auth.x500.X500Principal r0 = r8.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.DxW r0 = X.C28324DxW.A02(r0, r3)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = r1.equals(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x00d3:
            r9 = r8
            if (r0 != 0) goto L_0x00dc
        L_0x00d6:
            r9 = 0
            if (r6 != 0) goto L_0x00dc
            goto L_0x00e8
        L_0x00da:
            if (r0 == 0) goto L_0x00e1
        L_0x00dc:
            r4 = 0
            r3 = 0
            if (r9 == 0) goto L_0x00fa
            goto L_0x00f1
        L_0x00e1:
            if (r8 == 0) goto L_0x00d6
            boolean r0 = A02(r1, r8, r3)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            goto L_0x00d3
        L_0x00e8:
            java.lang.String r0 = "OCSP responder certificate not found"
            java.security.cert.CertPathValidatorException r1 = new java.security.cert.CertPathValidatorException     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            r1.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            goto L_0x01bd
        L_0x00f1:
            java.security.PublicKey r0 = r9.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            r5.initVerify(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            goto L_0x017c
        L_0x00fa:
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r0, r7)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1Bx r0 = r6.A0M(r4)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1Bz r0 = r0.CP9()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            byte[] r0 = r0.A0B()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.io.ByteArrayInputStream r0 = X.BE6.A0h(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.security.cert.Certificate r6 = r1.generateCertificate(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.security.PublicKey r0 = r8.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            r6.verify(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.util.Date r0 = r11.A04     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            long r0 = r0.getTime()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.util.Date r8 = new java.util.Date     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            r8.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            r6.checkValidity(r8)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.DxJ r0 = r10.A02     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.DxR r0 = r0.A03     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1Bx r9 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r8 = r9 instanceof X.C28342Dxo     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r8 == 0) goto L_0x0147
            r0 = r9
            X.Dxo r0 = (X.C28342Dxo) r0     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            byte[] r1 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r1 == 0) goto L_0x0147
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0, r7)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = A02(r0, r6, r1)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            goto L_0x0165
        L_0x0147:
            X.CZY r7 = X.C28373DyJ.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r8 == 0) goto L_0x014d
            r0 = 0
            goto L_0x0151
        L_0x014d:
            X.DxW r0 = X.C28324DxW.A01(r9)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x0151:
            X.DxW r1 = X.C28324DxW.A02(r0, r7)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            javax.security.auth.x500.X500Principal r0 = r6.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.DxW r0 = X.C28324DxW.A02(r0, r7)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = r1.equals(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x0165:
            if (r0 == 0) goto L_0x019e
            java.util.List r1 = r6.getExtendedKeyUsage()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r1 == 0) goto L_0x0197
            X.DxL r0 = X.C28313DxL.A02     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1C0 r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.lang.String r0 = r0.A01     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = r1.contains(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r0 == 0) goto L_0x0197
            r5.initVerify(r6)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x017c:
            X.DxJ r1 = r10.A02     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            java.lang.String r0 = "DER"
            byte[] r0 = r1.A0C(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            r5.update(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.Dwd r0 = r10.A01     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            byte[] r0 = r0.A0K()     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = r5.verify(r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r0 == 0) goto L_0x0196
            if (r13 == 0) goto L_0x01be
            goto L_0x01a5
        L_0x0196:
            return r4
        L_0x0197:
            java.lang.String r0 = "responder certificate not valid for signing OCSP responses"
            java.security.cert.CertPathValidatorException r1 = X.C25597Cic.A00(r0, r3, r11)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            goto L_0x01bd
        L_0x019e:
            java.lang.String r0 = "responder certificate does not match responderID"
            java.security.cert.CertPathValidatorException r1 = X.C25597Cic.A00(r0, r3, r11)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            goto L_0x01bd
        L_0x01a5:
            X.DxH r1 = r1.A04     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.1C0 r0 = X.EB8.A06     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.DxM r0 = X.C28309DxH.A01(r0, r1)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            X.Dxo r0 = r0.A01     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            byte[] r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
            if (r0 != 0) goto L_0x01be
            java.lang.String r0 = "nonce mismatch in OCSP response"
            java.security.cert.CertPathValidatorException r1 = X.C25597Cic.A00(r0, r3, r11)     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x01bd:
            throw r1     // Catch:{ CertPathValidatorException -> 0x01dc, GeneralSecurityException -> 0x01ce, IOException -> 0x01c0 }
        L_0x01be:
            r0 = 1
            return r0
        L_0x01c0:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17900vP.A0C(r2, r0, r1)
            java.security.cert.CertPathValidatorException r0 = X.C25597Cic.A00(r0, r1, r11)
            throw r0
        L_0x01ce:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17900vP.A0C(r2, r0, r1)
            java.security.cert.CertPathValidatorException r0 = X.C25597Cic.A00(r0, r1, r11)
            throw r0
        L_0x01dc:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DZC.A03(java.security.cert.X509Certificate, X.Dx5, X.Cic, X.E3R, byte[]):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.DxC[]} */
    /* JADX WARNING: type inference failed for: r9v10, types: [X.Dx0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v8, types: [X.Dwp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v6, types: [X.DxC, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void check(java.security.cert.Certificate r19) {
        /*
            r18 = this;
            r6 = r19
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            r3 = r18
            X.Db7 r1 = r3.A04
            java.util.Map r8 = r1.getOcspResponses()
            java.net.URI r12 = r1.getOcspResponder()
            if (r12 != 0) goto L_0x00df
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L_0x002f
            java.net.URI r12 = new java.net.URI     // Catch:{ URISyntaxException -> 0x001d }
            r12.<init>(r0)     // Catch:{ URISyntaxException -> 0x001d }
            goto L_0x00df
        L_0x001d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "configuration error: "
            java.lang.String r1 = X.C17900vP.A0C(r0, r1, r2)
            X.Cic r0 = r3.A01
            java.security.cert.CertPathValidatorException r3 = X.C25597Cic.A00(r1, r2, r0)
            throw r3
        L_0x002f:
            X.1C0 r0 = X.C28314DxM.A04
            java.lang.String r0 = r0.A01
            byte[] r0 = r6.getExtensionValue(r0)
            r12 = 0
            if (r0 == 0) goto L_0x00df
            byte[] r10 = X.C28342Dxo.A05(r0)
            boolean r0 = r10 instanceof X.C28281Dwp
            if (r0 == 0) goto L_0x0075
            X.Dwp r10 = (X.C28281Dwp) r10
        L_0x0044:
            X.DxC[] r4 = r10.A00
            int r2 = r4.length
            X.DxC[] r7 = new X.C28304DxC[r2]
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r7, r0, r2)
            r5 = 0
        L_0x004e:
            int r0 = r7.length
            if (r5 == r0) goto L_0x00df
            r4 = r7[r5]
            X.1C0 r2 = X.C28304DxC.A03
            X.1C0 r0 = r4.A00
            boolean r0 = r2.A0J(r0)
            if (r0 == 0) goto L_0x0072
            X.DxU r4 = r4.A01
            int r2 = r4.A00
            r0 = 6
            if (r2 != r0) goto L_0x0072
            X.1Bx r0 = r4.A01     // Catch:{ URISyntaxException -> 0x0072 }
            X.E74 r0 = (X.E74) r0     // Catch:{ URISyntaxException -> 0x0072 }
            java.lang.String r2 = r0.BZl()     // Catch:{ URISyntaxException -> 0x0072 }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0072 }
            r0.<init>(r2)     // Catch:{ URISyntaxException -> 0x0072 }
            goto L_0x00de
        L_0x0072:
            int r5 = r5 + 1
            goto L_0x004e
        L_0x0075:
            if (r10 == 0) goto L_0x00cd
            X.Dxl r9 = X.C28339Dxl.A05(r10)
            X.Dwp r10 = new X.Dwp
            r10.<init>()
            int r2 = r9.A0K()
            r0 = 1
            if (r2 < r0) goto L_0x00d7
            int r0 = r9.A0K()
            X.DxC[] r0 = new X.C28304DxC[r0]
            r10.A00 = r0
            r7 = 0
        L_0x0090:
            int r0 = r9.A0K()
            if (r7 == r0) goto L_0x0044
            X.DxC[] r5 = r10.A00
            X.1Bx r4 = r9.A0M(r7)
            boolean r0 = r4 instanceof X.C28304DxC
            if (r0 != 0) goto L_0x00c6
            if (r4 == 0) goto L_0x00cb
            X.Dxl r11 = X.C28339Dxl.A05(r4)
            X.DxC r4 = new X.DxC
            r4.<init>()
            int r2 = r11.A0K()
            r0 = 2
            if (r2 != r0) goto L_0x00d0
            X.1Bx r0 = X.C28339Dxl.A03(r11)
            X.1C0 r0 = X.AnonymousClass1C0.A02(r0)
            r4.A00 = r0
            X.1Bx r0 = X.C28339Dxl.A04(r11)
            X.DxU r0 = X.C28322DxU.A01(r0)
            r4.A01 = r0
        L_0x00c6:
            r5[r7] = r4
            int r7 = r7 + 1
            goto L_0x0090
        L_0x00cb:
            r4 = 0
            goto L_0x00c6
        L_0x00cd:
            r10 = 0
            goto L_0x0044
        L_0x00d0:
            java.lang.String r0 = "wrong number of elements in sequence"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)
            throw r3
        L_0x00d7:
            java.lang.String r0 = "sequence may not be empty"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)
            throw r3
        L_0x00de:
            r12 = r0
        L_0x00df:
            java.lang.Object r0 = r8.get(r6)
            r5 = 0
            r2 = 1
            r4 = 0
            if (r0 != 0) goto L_0x014b
            if (r12 == 0) goto L_0x014b
            java.lang.String r0 = r3.A00
            if (r0 != 0) goto L_0x0106
            java.net.URI r0 = r1.getOcspResponder()
            if (r0 != 0) goto L_0x0106
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0106
            X.Cic r0 = r3.A01
            java.security.cert.CertPath r2 = r0.A02
            int r1 = r0.A00
            java.lang.String r0 = "OCSP disabled by \"ocsp.enable\" setting"
            X.Db1 r3 = new X.Db1
            r3.<init>(r0, r2, r1)
            throw r3
        L_0x0106:
            X.Dx6 r10 = r3.A01()
            X.1C0 r0 = X.AnonymousClass1C6.A07
            X.Dx0 r9 = new X.Dx0
            r9.<init>()
            r9.A01 = r0
            java.math.BigInteger r7 = r6.getSerialNumber()
            X.Dxj r0 = new X.Dxj
            r0.<init>((java.math.BigInteger) r7)
            X.Dwm r15 = r3.A00(r0, r9, r10)
            X.Cic r7 = r3.A01
            java.security.cert.X509Certificate r13 = r1.getOcspResponderCert()
            java.util.List r14 = r1.getOcspExtensions()
            X.E3R r0 = r3.A03
            r17 = r0
            r16 = r7
            X.Dww r0 = X.C25427CfZ.A00(r12, r13, r14, r15, r16, r17)
            byte[] r0 = r0.A0B()     // Catch:{ IOException -> 0x013c }
            r8.put(r6, r0)     // Catch:{ IOException -> 0x013c }
            goto L_0x0173
        L_0x013c:
            r4 = move-exception
            X.Cic r0 = r3.A01
            java.security.cert.CertPath r2 = r0.A02
            int r1 = r0.A00
            java.lang.String r0 = "unable to encode OCSP response"
            java.security.cert.CertPathValidatorException r3 = new java.security.cert.CertPathValidatorException
            r3.<init>(r0, r4, r2, r1)
            throw r3
        L_0x014b:
            java.util.List r12 = r1.getOcspExtensions()
            r9 = r4
            r11 = 0
        L_0x0151:
            int r0 = r12.size()
            if (r11 == r0) goto L_0x0171
            java.lang.Object r0 = r12.get(r11)
            java.security.cert.Extension r0 = (java.security.cert.Extension) r0
            byte[] r10 = r0.getValue()
            java.lang.String r7 = "1.3.6.1.5.5.7.48.1.2"
            java.lang.String r0 = r0.getId()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x016e
            r9 = r10
        L_0x016e:
            int r11 = r11 + 1
            goto L_0x0151
        L_0x0171:
            r10 = 0
            goto L_0x0175
        L_0x0173:
            r9 = r4
            r10 = 1
        L_0x0175:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x02a0
            java.lang.Object r0 = r8.get(r6)
            X.Dww r7 = X.C28288Dww.A01(r0)
            java.math.BigInteger r0 = r6.getSerialNumber()
            X.Dxj r8 = new X.Dxj
            r8.<init>((java.math.BigInteger) r0)
            if (r7 == 0) goto L_0x0292
            X.Dwj r6 = r7.A00
            X.Dxh r0 = r6.A00
            int r0 = r0.A0K()
            if (r0 != 0) goto L_0x0275
            X.Dwx r0 = r7.A01
            X.Dwx r7 = X.C28289Dwx.A01(r0)
            X.1C0 r6 = r7.A00
            X.1C0 r0 = X.EB8.A02
            boolean r0 = r6.A0J(r0)
            if (r0 == 0) goto L_0x0274
            X.Dxo r0 = r7.A01     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            byte[] r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dx5 r7 = X.C28297Dx5.A01(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            if (r10 != 0) goto L_0x01c0
            X.Cic r6 = r3.A01     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.security.cert.X509Certificate r1 = r1.getOcspResponderCert()     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.E3R r0 = r3.A03     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            boolean r0 = A03(r1, r7, r6, r0, r9)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0274
        L_0x01c0:
            X.DxJ r0 = r7.A02     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.DxJ r0 = X.C28311DxJ.A01(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dxl r7 = r0.A02     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            r9 = r4
        L_0x01c9:
            int r0 = r7.A0K()     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            if (r5 == r0) goto L_0x0274
            X.1Bx r0 = r7.A0M(r5)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dx7 r6 = X.C28299Dx7.A01(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dwm r0 = r6.A02     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dxj r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            boolean r0 = r8.A0J(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            if (r0 == 0) goto L_0x025f
            X.Dxk r11 = r6.A00     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            if (r11 == 0) goto L_0x0202
            X.Cic r0 = r3.A01     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.util.Date r0 = r0.A04     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            long r0 = r0.getTime()     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.util.Date r10 = new java.util.Date     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            r10.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.util.Date r0 = r11.A0L()     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            boolean r0 = r10.after(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0202
            X.Db2 r0 = new X.Db2     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            r0.<init>()     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
        L_0x0201:
            throw r0     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
        L_0x0202:
            if (r9 == 0) goto L_0x0210
            X.Dx0 r1 = r9.A03     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dwm r0 = r6.A02     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dx0 r0 = r0.A03     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            boolean r0 = r1.equals(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            if (r0 != 0) goto L_0x021c
        L_0x0210:
            X.Dx6 r1 = r3.A01()     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dwm r0 = r6.A02     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dx0 r0 = r0.A03     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dwm r9 = r3.A00(r8, r0, r1)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
        L_0x021c:
            X.Dwm r0 = r6.A02     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            boolean r0 = r9.equals(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            if (r0 == 0) goto L_0x025f
            X.DxS r1 = r6.A03     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            int r0 = r1.A00     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0274
            if (r0 != r2) goto L_0x0256
            X.1Bx r0 = r1.A01     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dwy r5 = X.C28290Dwy.A01(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.DxK r2 = r5.A01     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.lang.String r0 = "certificate revoked, reason=("
            r1.append(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            r1.append(r2)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.lang.String r0 = "), date="
            r1.append(r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Dxk r0 = r5.A00     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.util.Date r0 = r0.A0L()     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.lang.String r1 = X.C17890vO.A0V(r0, r1)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            X.Cic r0 = r3.A01     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.security.cert.CertPathValidatorException r0 = X.C25597Cic.A00(r1, r4, r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            goto L_0x0201
        L_0x0256:
            java.lang.String r1 = "certificate revoked, details unknown"
            X.Cic r0 = r3.A01     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            java.security.cert.CertPathValidatorException r0 = X.C25597Cic.A00(r1, r4, r0)     // Catch:{ CertPathValidatorException -> 0x0272, Exception -> 0x0263 }
            goto L_0x0201
        L_0x025f:
            int r5 = r5 + 1
            goto L_0x01c9
        L_0x0263:
            r4 = move-exception
            X.Cic r0 = r3.A01
            java.security.cert.CertPath r2 = r0.A02
            int r1 = r0.A00
            java.lang.String r0 = "unable to process OCSP response"
            java.security.cert.CertPathValidatorException r3 = new java.security.cert.CertPathValidatorException
            r3.<init>(r0, r4, r2, r1)
            throw r3
        L_0x0272:
            r3 = move-exception
            throw r3
        L_0x0274:
            return
        L_0x0275:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OCSP response failed: "
            r2.append(r0)
            X.Dxh r0 = r6.A00
            byte[] r1 = r0.A00
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            java.lang.String r1 = X.C17890vO.A0V(r0, r2)
            X.Cic r0 = r3.A01
            java.security.cert.CertPathValidatorException r3 = X.C25597Cic.A00(r1, r4, r0)
            throw r3
        L_0x0292:
            X.Cic r0 = r3.A01
            java.security.cert.CertPath r2 = r0.A02
            int r1 = r0.A00
            java.lang.String r0 = "no OCSP response found for certificate"
            X.Db1 r3 = new X.Db1
            r3.<init>(r0, r2, r1)
            throw r3
        L_0x02a0:
            X.Cic r0 = r3.A01
            java.security.cert.CertPath r2 = r0.A02
            int r1 = r0.A00
            java.lang.String r0 = "no OCSP response found for any certificate"
            X.Db1 r3 = new X.Db1
            r3.<init>(r0, r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DZC.check(java.security.cert.Certificate):void");
    }

    static {
        HashMap A11 = C17880vN.A11();
        A05 = A11;
        A11.put(BE6.A19("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        A11.put(AnonymousClass1Bw.A2D, "SHA224WITHRSA");
        A11.put(AnonymousClass1Bw.A2E, "SHA256WITHRSA");
        BEB.A1K(AnonymousClass1Bw.A2F, A11);
        BEB.A1J(EBF.A0G, A11);
    }

    public static boolean A02(MessageDigest messageDigest, Certificate certificate, byte[] bArr) {
        return Arrays.equals(bArr, messageDigest.digest(C28294Dx2.A01(certificate.getPublicKey().getEncoded()).A00.A0K()));
    }
}
