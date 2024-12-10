package X;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.DbC  reason: case insensitive filesystem */
public abstract class C27283DbC extends X509Certificate implements E3Q {
    public C28301Dx9 basicConstraints;
    public E3R bcHelper;
    public C28298Dx6 c;
    public boolean[] keyUsage;
    public String sigAlgName;
    public byte[] sigAlgParams;

    public C27283DbC(String str, C28301Dx9 dx9, C28298Dx6 dx6, E3R e3r, byte[] bArr, boolean[] zArr) {
        this.bcHelper = e3r;
        this.c = dx6;
        this.basicConstraints = dx9;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    public void checkValidity() {
        checkValidity(new Date());
    }

    public byte[] getEncoded() {
        try {
            return this.c.A0C("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public String getSigAlgName() {
        return this.sigAlgName;
    }

    public byte[] getSigAlgParams() {
        return AnonymousClass1C2.A02(this.sigAlgParams);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.OutputStream, X.Bxd] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r2.A00 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r0 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r1 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r1.equals(X.C28273Dwh.A00) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(java.security.PublicKey r5, java.security.Signature r6, X.AnonymousClass1Bx r7, byte[] r8) {
        /*
            r4 = this;
            X.Dx6 r0 = r4.c
            X.Dx0 r3 = r0.A02
            X.Dx8 r0 = r0.A03
            X.Dx0 r2 = r0.A07
            X.1C0 r1 = r3.A01
            X.1C0 r0 = r2.A01
            boolean r0 = r1.A0J(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "org.spongycastle.x509.allow_absent_equiv_NULL"
            boolean r0 = X.C25917Cob.A01(r0)
            if (r0 == 0) goto L_0x0037
            X.1Bx r1 = r3.A00
            if (r1 != 0) goto L_0x0032
            X.1Bx r1 = r2.A00
            if (r1 == 0) goto L_0x0043
        L_0x0022:
            X.Dwh r0 = X.C28273Dwh.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0043
        L_0x002a:
            java.lang.String r0 = "signature algorithm in TBS cert not same as outer cert"
            java.security.cert.CertificateException r1 = new java.security.cert.CertificateException
            r1.<init>(r0)
            throw r1
        L_0x0032:
            X.1Bx r0 = r2.A00
            if (r0 != 0) goto L_0x0037
            goto L_0x0022
        L_0x0037:
            X.1Bx r1 = r3.A00
            X.1Bx r0 = r2.A00
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.equals(r0)
        L_0x0041:
            if (r0 == 0) goto L_0x002a
        L_0x0043:
            X.C26178Ctw.A03(r6, r7)
            r6.initVerify(r5)
            goto L_0x0051
        L_0x004a:
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.equals(r1)
            goto L_0x0041
        L_0x0051:
            X.Bxd r1 = new X.Bxd     // Catch:{ IOException -> 0x007a }
            r1.<init>()     // Catch:{ IOException -> 0x007a }
            r1.A00 = r6     // Catch:{ IOException -> 0x007a }
            r0 = 512(0x200, float:7.175E-43)
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x007a }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x007a }
            X.Dx6 r0 = r4.c     // Catch:{ IOException -> 0x007a }
            X.Dx8 r1 = r0.A03     // Catch:{ IOException -> 0x007a }
            java.lang.String r0 = "DER"
            r1.A0A(r2, r0)     // Catch:{ IOException -> 0x007a }
            r2.close()     // Catch:{ IOException -> 0x007a }
            boolean r0 = r6.verify(r8)
            if (r0 == 0) goto L_0x0072
            return
        L_0x0072:
            java.lang.String r0 = "certificate does not verify with supplied key"
            java.security.SignatureException r1 = new java.security.SignatureException
            r1.<init>(r0)
            throw r1
        L_0x007a:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.security.cert.CertificateEncodingException r0 = new java.security.cert.CertificateEncodingException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27283DbC.A01(java.security.PublicKey, java.security.Signature, X.1Bx, byte[]):void");
    }

    public static byte[] A02(String str, C28298Dx6 dx6) {
        C28314DxM A01;
        C28342Dxo dxo;
        C28309DxH dxH = dx6.A03.A08;
        if (dxH == null || (A01 = C28309DxH.A01(BE6.A19(str), dxH)) == null || (dxo = A01.A01) == null) {
            return null;
        }
        return dxo.A00;
    }

    public int getBasicConstraints() {
        C28336Dxi dxi;
        BigInteger bigInteger;
        C28301Dx9 dx9 = this.basicConstraints;
        if (dx9 == null || (dxi = dx9.A00) == null || dxi.A00 == 0) {
            return -1;
        }
        C28337Dxj dxj = dx9.A01;
        if (dxj == null) {
            return Integer.MAX_VALUE;
        }
        new BigInteger(dxj.A00);
        C28337Dxj dxj2 = this.basicConstraints.A01;
        if (dxj2 != null) {
            bigInteger = new BigInteger(dxj2.A00);
        } else {
            bigInteger = null;
        }
        return bigInteger.intValue();
    }

    public List getExtendedKeyUsage() {
        byte[] A02 = A02("2.5.29.37", this.c);
        if (A02 == null) {
            return null;
        }
        try {
            C28339Dxl A05 = C28339Dxl.A05(AnonymousClass1Bz.A01(A02));
            ArrayList A13 = AnonymousClass000.A13();
            for (int i = 0; i != A05.A0K(); i++) {
                A13.add(((AnonymousClass1C0) A05.A0M(i)).A01);
            }
            return Collections.unmodifiableList(A13);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    public byte[] getExtensionValue(String str) {
        C28342Dxo dxo;
        C28314DxM A01;
        C28309DxH dxH = this.c.A03.A08;
        if (dxH == null || (A01 = C28309DxH.A01(BE6.A19(str), dxH)) == null) {
            dxo = null;
        } else {
            dxo = A01.A01;
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

    public Collection getIssuerAlternativeNames() {
        return A00(C28314DxM.A0J.A01, this.c);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.security.Principal, X.DxQ] */
    public Principal getIssuerDN() {
        return new C28318DxQ(this.c.A03.A05.A00);
    }

    public boolean[] getIssuerUniqueID() {
        C28269Dwd dwd = this.c.A03.A03;
        if (dwd == null) {
            return null;
        }
        byte[] A0K = dwd.A0K();
        int length = (A0K.length * 8) - dwd.A00;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = AnonymousClass000.A1O(A0K[i / 8] & (128 >>> (i % 8)));
        }
        return zArr;
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.A03.A05.A0C("DER"));
        } catch (IOException unused) {
            throw AnonymousClass000.A0n("can't encode issuer DN");
        }
    }

    public boolean[] getKeyUsage() {
        boolean[] zArr = this.keyUsage;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public Date getNotAfter() {
        return this.c.A03.A0A.A0E();
    }

    public Date getNotBefore() {
        return this.c.A03.A0B.A0E();
    }

    public PublicKey getPublicKey() {
        try {
            C28294Dx2 dx2 = this.c.A03.A09;
            Map map = AnonymousClass1Bl.A00;
            AnonymousClass1C0 r0 = dx2.A01.A01;
            Map map2 = AnonymousClass1Bl.A00;
            synchronized (map2) {
                map2.get(r0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(this.c.A03.A00.A00);
    }

    public String getSigAlgOID() {
        return this.c.A02.A01.A01;
    }

    public byte[] getSignature() {
        C28269Dwd dwd = this.c.A01;
        if (dwd.A00 == 0) {
            return AnonymousClass1C2.A02(dwd.A01);
        }
        throw AnonymousClass000.A0n("attempt to get non-octet aligned data from BIT STRING");
    }

    public Collection getSubjectAlternativeNames() {
        return A00(C28314DxM.A0U.A01, this.c);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.security.Principal, X.DxQ] */
    public Principal getSubjectDN() {
        return new C28318DxQ(this.c.A03.A06.A00);
    }

    public boolean[] getSubjectUniqueID() {
        C28269Dwd dwd = this.c.A03.A04;
        if (dwd == null) {
            return null;
        }
        byte[] A0K = dwd.A0K();
        int length = (A0K.length * 8) - dwd.A00;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = AnonymousClass000.A1O(A0K[i / 8] & (128 >>> (i % 8)));
        }
        return zArr;
    }

    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.c.A03.A06.A0C("DER"));
        } catch (IOException unused) {
            throw AnonymousClass000.A0n("can't encode subject DN");
        }
    }

    public byte[] getTBSCertificate() {
        try {
            return this.c.A03.A0C("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public int getVersion() {
        return this.c.A03.A01.A0K() + 1;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [X.Dwr, java.lang.Object] */
    public String toString() {
        Object obj;
        StringBuffer A0s = BE6.A0s();
        String str = AnonymousClass1Bo.A00;
        A0s.append("  [0]         Version: ");
        A0s.append(getVersion());
        A0s.append(str);
        A0s.append("         SerialNumber: ");
        A0s.append(getSerialNumber());
        A0s.append(str);
        A0s.append("             IssuerDN: ");
        A0s.append(getIssuerDN());
        A0s.append(str);
        A0s.append("           Start Date: ");
        A0s.append(getNotBefore());
        A0s.append(str);
        A0s.append("           Final Date: ");
        A0s.append(getNotAfter());
        A0s.append(str);
        A0s.append("            SubjectDN: ");
        A0s.append(getSubjectDN());
        A0s.append(str);
        A0s.append("           Public Key: ");
        A0s.append(getPublicKey());
        A0s.append(str);
        A0s.append("  Signature Algorithm: ");
        A0s.append(this.sigAlgName);
        A0s.append(str);
        C26178Ctw.A02(str, A0s, getSignature());
        C28309DxH dxH = this.c.A03.A08;
        if (dxH != null) {
            Enumeration elements = dxH.A01.elements();
            if (elements.hasMoreElements()) {
                A0s.append("       Extensions: \n");
            }
            while (elements.hasMoreElements()) {
                AnonymousClass1C0 r5 = (AnonymousClass1C0) elements.nextElement();
                C28314DxM A01 = C28309DxH.A01(r5, dxH);
                C28342Dxo dxo = A01.A01;
                if (dxo != null) {
                    C24178Bwo A02 = C28342Dxo.A02(A0s, dxo, A01);
                    try {
                        if (r5.A0J(C28314DxM.A06)) {
                            obj = C28301Dx9.A01(A02.A05());
                        } else if (r5.A0J(C28314DxM.A0L)) {
                            AnonymousClass1Bz A05 = A02.A05();
                            if (A05 != null) {
                                C28269Dwd A022 = C28269Dwd.A02(A05);
                                ? obj2 = new Object();
                                obj2.A00 = A022;
                                obj = obj2;
                            } else {
                                obj = null;
                            }
                        } else if (r5.A0J(EBK.A0R)) {
                            C28269Dwd A023 = C28269Dwd.A02(A02.A05());
                            obj = new C28367DyD(A023.A0K(), A023.A00);
                        } else if (r5.A0J(EBK.A0T)) {
                            obj = new C28353Dxz(AnonymousClass1Bo.A02(C28353Dxz.A03(A02.A05()).A00));
                        } else if (r5.A0J(EBK.A0Z)) {
                            obj = new C28353Dxz(AnonymousClass1Bo.A02(C28353Dxz.A03(A02.A05()).A00));
                        } else {
                            C25895Co6.A02(A0s, A02, r5);
                            A0s.append(str);
                        }
                        A0s.append(obj);
                        A0s.append(str);
                    } catch (Exception unused) {
                        A0s.append(r5.A01);
                        A0s.append(" value = ");
                        A0s.append("*****");
                        A0s.append(str);
                    }
                } else {
                    A0s.append(str);
                }
            }
        }
        return A0s.toString();
    }

    public final void verify(PublicKey publicKey, Provider provider) {
        Signature instance;
        Signature signature;
        try {
            C28292Dx0 dx0 = this.c.A02;
            Map map = C26178Ctw.A00;
            boolean A0J = EBK.A0C.A0J(dx0.A01);
            C28292Dx0 dx02 = this.c.A02;
            if (A0J) {
                C28339Dxl A05 = C28339Dxl.A05(dx02.A00);
                C28339Dxl A052 = C28339Dxl.A05(C28269Dwd.A02(this.c.A01).A0K());
                boolean z = false;
                for (int i = 0; i != A052.A0K(); i++) {
                    C28292Dx0 A01 = C28292Dx0.A01(A05.A0M(i));
                    String A012 = C26178Ctw.A01(A01);
                    if (provider != null) {
                        signature = Signature.getInstance(A012, provider);
                    } else {
                        signature = Signature.getInstance(A012);
                    }
                    A01(publicKey, signature, A01.A00, C28269Dwd.A02(A052.A0M(i)).A0K());
                    z = true;
                }
                if (!z) {
                    throw new InvalidKeyException("no matching key found");
                }
                return;
            }
            String A013 = C26178Ctw.A01(dx02);
            if (provider != null) {
                instance = Signature.getInstance(A013, provider);
            } else {
                instance = Signature.getInstance(A013);
            }
            A01(publicKey, instance, this.c.A02.A00, getSignature());
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
        } catch (SignatureException e) {
            throw e;
        } catch (NoSuchProviderException e2) {
            throw new NoSuchAlgorithmException(C17900vP.A0C("provider issue: ", AnonymousClass000.A10(), e2));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Collection A00(java.lang.String r5, X.C28298Dx6 r6) {
        /*
            byte[] r0 = A02(r5, r6)
            r6 = 0
            if (r0 == 0) goto L_0x0080
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0075 }
            X.Dxl r0 = X.C28339Dxl.A05(r0)     // Catch:{ Exception -> 0x0075 }
            java.util.Enumeration r5 = r0.A0L()     // Catch:{ Exception -> 0x0075 }
        L_0x0013:
            boolean r0 = r5.hasMoreElements()     // Catch:{ Exception -> 0x0075 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r5.nextElement()     // Catch:{ Exception -> 0x0075 }
            X.DxU r3 = X.C28322DxU.A01(r0)     // Catch:{ Exception -> 0x0075 }
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0075 }
            int r0 = r3.A00     // Catch:{ Exception -> 0x0075 }
            X.C17890vO.A1D(r2, r0)     // Catch:{ Exception -> 0x0075 }
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x002d;
                case 2: goto L_0x002d;
                case 3: goto L_0x0043;
                case 4: goto L_0x0036;
                case 5: goto L_0x0043;
                case 6: goto L_0x002d;
                case 7: goto L_0x0048;
                case 8: goto L_0x0057;
                default: goto L_0x002d;
            }     // Catch:{ Exception -> 0x0075 }
        L_0x002d:
            X.1Bx r0 = r3.A01     // Catch:{ Exception -> 0x0075 }
            X.E74 r0 = (X.E74) r0     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = r0.BZl()     // Catch:{ Exception -> 0x0075 }
            goto L_0x005f
        L_0x0036:
            X.CZY r1 = X.C28372DyI.A0j     // Catch:{ Exception -> 0x0075 }
            X.1Bx r0 = r3.A01     // Catch:{ Exception -> 0x0075 }
            X.DxW r0 = X.C28324DxW.A02(r0, r1)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0075 }
            goto L_0x005f
        L_0x0043:
            byte[] r0 = r3.A0B()     // Catch:{ Exception -> 0x0075 }
            goto L_0x005f
        L_0x0048:
            X.1Bx r0 = r3.A01     // Catch:{ Exception -> 0x0075 }
            byte[] r0 = X.C28342Dxo.A05(r0)     // Catch:{ Exception -> 0x0075 }
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r0)     // Catch:{ UnknownHostException -> 0x0013 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x0013 }
            goto L_0x005f
        L_0x0057:
            X.1Bx r0 = r3.A01     // Catch:{ Exception -> 0x0075 }
            X.1C0 r0 = X.AnonymousClass1C0.A02(r0)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x0075 }
        L_0x005f:
            r2.add(r0)     // Catch:{ Exception -> 0x0075 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)     // Catch:{ Exception -> 0x0075 }
            r4.add(r0)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0013
        L_0x006a:
            int r0 = r4.size()     // Catch:{ Exception -> 0x0075 }
            if (r0 == 0) goto L_0x0080
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r4)     // Catch:{ Exception -> 0x0075 }
            return r0
        L_0x0075:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.security.cert.CertificateParsingException r0 = new java.security.cert.CertificateParsingException
            r0.<init>(r1)
            throw r0
        L_0x0080:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27283DbC.A00(java.lang.String, X.Dx6):java.util.Collection");
    }

    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("certificate expired on ");
            throw new CertificateExpiredException(AnonymousClass000.A0y(this.c.A03.A0A.A0D(), A10));
        } else if (date.getTime() < getNotBefore().getTime()) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("certificate not valid till ");
            throw new CertificateNotYetValidException(AnonymousClass000.A0y(this.c.A03.A0B.A0D(), A102));
        }
    }

    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet A12 = C17880vN.A12();
            C28309DxH dxH = this.c.A03.A08;
            if (dxH != null) {
                Enumeration elements = dxH.A01.elements();
                while (elements.hasMoreElements()) {
                    AnonymousClass1C0 r1 = (AnonymousClass1C0) elements.nextElement();
                    if (C28309DxH.A01(r1, dxH).A02) {
                        A12.add(r1.A01);
                    }
                }
                return A12;
            }
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet A12 = C17880vN.A12();
            C28309DxH dxH = this.c.A03.A08;
            if (dxH != null) {
                Enumeration elements = dxH.A01.elements();
                while (elements.hasMoreElements()) {
                    AnonymousClass1C0 r1 = (AnonymousClass1C0) elements.nextElement();
                    if (!C28309DxH.A01(r1, dxH).A02) {
                        A12.add(r1.A01);
                    }
                }
                return A12;
            }
        }
        return null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        C28309DxH dxH;
        if (getVersion() != 3 || (dxH = this.c.A03.A08) == null) {
            return false;
        }
        Enumeration elements = dxH.A01.elements();
        while (elements.hasMoreElements()) {
            AnonymousClass1Bz r2 = (AnonymousClass1Bz) elements.nextElement();
            if (!r2.A0J(C28314DxM.A0L) && !r2.A0J(C28314DxM.A0B) && !r2.A0J(C28314DxM.A0Q) && !r2.A0J(C28314DxM.A0G) && !r2.A0J(C28314DxM.A08) && !r2.A0J(C28314DxM.A0K) && !r2.A0J(C28314DxM.A0C) && !r2.A0J(C28314DxM.A0P) && !r2.A0J(C28314DxM.A06) && !r2.A0J(C28314DxM.A0U) && !r2.A0J(C28314DxM.A0N) && C28309DxH.A01(r2, dxH).A02) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:8:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void verify(java.security.PublicKey r10) {
        /*
            r9 = this;
            java.lang.String r6 = "no matching key found"
            r7 = 0
            X.Dx6 r0 = r9.c
            X.Dx0 r2 = r0.A02
            java.util.Map r0 = X.C26178Ctw.A00
            X.1C0 r1 = X.EBK.A0C
            X.1C0 r0 = r2.A01
            boolean r1 = r1.A0J(r0)
            X.Dx6 r0 = r9.c
            X.Dx0 r0 = r0.A02
            if (r1 == 0) goto L_0x006e
            X.1Bx r0 = r0.A00
            X.Dxl r5 = X.C28339Dxl.A05(r0)
            X.Dx6 r0 = r9.c
            X.Dwd r0 = r0.A01
            X.Dwd r0 = X.C28269Dwd.A02(r0)
            byte[] r0 = r0.A0K()
            X.Dxl r4 = X.C28339Dxl.A05(r0)
            r8 = 0
        L_0x002e:
            int r0 = r4.A0K()
            if (r7 == r0) goto L_0x0066
            X.1Bx r0 = r5.A0M(r7)
            X.Dx0 r3 = X.C28292Dx0.A01(r0)
            java.lang.String r1 = X.C26178Ctw.A01(r3)
            X.E3R r0 = r9.bcHelper     // Catch:{ Exception -> 0x004b }
            X.DZI r0 = (X.DZI) r0     // Catch:{ Exception -> 0x004b }
            java.security.Provider r0 = r0.A00     // Catch:{ Exception -> 0x004b }
            java.security.Signature r2 = java.security.Signature.getInstance(r1, r0)     // Catch:{ Exception -> 0x004b }
            goto L_0x004f
        L_0x004b:
            java.security.Signature r2 = java.security.Signature.getInstance(r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0061, InvalidKeyException | NoSuchAlgorithmException -> 0x0061, SignatureException -> 0x0064 }
        L_0x004f:
            X.1Bx r1 = r3.A00     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0061, InvalidKeyException | NoSuchAlgorithmException -> 0x0061, SignatureException -> 0x0064 }
            X.1Bx r0 = r4.A0M(r7)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0061, InvalidKeyException | NoSuchAlgorithmException -> 0x0061, SignatureException -> 0x0064 }
            X.Dwd r0 = X.C28269Dwd.A02(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0061, InvalidKeyException | NoSuchAlgorithmException -> 0x0061, SignatureException -> 0x0064 }
            byte[] r0 = r0.A0K()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0061, InvalidKeyException | NoSuchAlgorithmException -> 0x0061, SignatureException -> 0x0064 }
            r9.A01(r10, r2, r1, r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0061, InvalidKeyException | NoSuchAlgorithmException -> 0x0061, SignatureException -> 0x0064 }
            r8 = 1
        L_0x0061:
            int r7 = r7 + 1
            goto L_0x002e
        L_0x0064:
            r0 = move-exception
            throw r0
        L_0x0066:
            if (r8 != 0) goto L_0x008e
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r6)
            throw r0
        L_0x006e:
            java.lang.String r1 = X.C26178Ctw.A01(r0)
            X.E3R r0 = r9.bcHelper     // Catch:{ Exception -> 0x007d }
            X.DZI r0 = (X.DZI) r0     // Catch:{ Exception -> 0x007d }
            java.security.Provider r0 = r0.A00     // Catch:{ Exception -> 0x007d }
            java.security.Signature r2 = java.security.Signature.getInstance(r1, r0)     // Catch:{ Exception -> 0x007d }
            goto L_0x0081
        L_0x007d:
            java.security.Signature r2 = java.security.Signature.getInstance(r1)
        L_0x0081:
            X.Dx6 r0 = r9.c
            X.Dx0 r0 = r0.A02
            X.1Bx r1 = r0.A00
            byte[] r0 = r9.getSignature()
            r9.A01(r10, r2, r1, r0)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27283DbC.verify(java.security.PublicKey):void");
    }

    public final void verify(PublicKey publicKey, String str) {
        Signature signature;
        C28292Dx0 dx0 = this.c.A02;
        Map map = C26178Ctw.A00;
        boolean A0J = EBK.A0C.A0J(dx0.A01);
        C28292Dx0 dx02 = this.c.A02;
        if (A0J) {
            C28339Dxl A05 = C28339Dxl.A05(dx02.A00);
            C28339Dxl A052 = C28339Dxl.A05(C28269Dwd.A02(this.c.A01).A0K());
            boolean z = false;
            for (int i = 0; i != A052.A0K(); i++) {
                C28292Dx0 A01 = C28292Dx0.A01(A05.A0M(i));
                String A012 = C26178Ctw.A01(A01);
                if (str != null) {
                    signature = Signature.getInstance(A012, str);
                } else {
                    try {
                        signature = Signature.getInstance(A012);
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                    } catch (SignatureException e) {
                        throw e;
                    }
                }
                A01(publicKey, signature, A01.A00, C28269Dwd.A02(A052.A0M(i)).A0K());
                z = true;
            }
            if (!z) {
                throw new InvalidKeyException("no matching key found");
            }
            return;
        }
        String A013 = C26178Ctw.A01(dx02);
        A01(publicKey, str != null ? Signature.getInstance(A013, str) : Signature.getInstance(A013), this.c.A02.A00, getSignature());
    }
}
