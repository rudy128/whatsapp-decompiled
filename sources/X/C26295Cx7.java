package X;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRLSelector;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Cx7  reason: case insensitive filesystem */
public class C26295Cx7 {
    public static final Class A00 = AnonymousClass1Br.A00("java.security.cert.PKIXRevocationChecker", C26295Cx7.class);
    public static final String A01 = C28314DxM.A05.A01;
    public static final String A02 = C28314DxM.A06.A01;
    public static final String A03 = C28314DxM.A0B.A01;
    public static final String A04 = C28314DxM.A08.A01;
    public static final String A05 = C28314DxM.A0C.A01;
    public static final String A06 = C28314DxM.A0G.A01;
    public static final String A07 = C28314DxM.A0K.A01;
    public static final String A08 = C28314DxM.A0L.A01;
    public static final String A09 = C28314DxM.A0N.A01;
    public static final String A0A = C28314DxM.A0P.A01;
    public static final String A0B = C28314DxM.A0Q.A01;
    public static final String A0C = C28314DxM.A0U.A01;
    public static final String[] A0D;

    public static void A0A(PublicKey publicKey, CertPath certPath, X509Certificate x509Certificate, Date date, C28324DxW dxW, E8M e8m, DU9 du9, int i, boolean z) {
        C2W c2w;
        C28338Dxk A062;
        Date date2 = date;
        CertPath certPath2 = certPath;
        int i2 = i;
        X509Certificate A0x = BE9.A0x(certPath2, i2);
        PublicKey publicKey2 = publicKey;
        DU9 du92 = du9;
        if (!z) {
            try {
                String sigProvider = du92.A01.getSigProvider();
                String str = C26284Cwf.A01;
                if (sigProvider == null) {
                    A0x.verify(publicKey2);
                } else {
                    A0x.verify(publicKey2, sigProvider);
                }
            } catch (GeneralSecurityException e) {
                throw C27275Db2.A00("Could not validate certificate signature.", e, certPath2, i2);
            }
        }
        try {
            int i3 = du92.A00;
            String str2 = C26284Cwf.A01;
            if (1 == i3 && i > 0) {
                int i4 = i - 1;
                X509Certificate A0z = BE6.A0z(certPath2.getCertificates(), i4);
                if (i4 == 0) {
                    try {
                        byte[] extensionValue = BE6.A0z(certPath2.getCertificates(), i - 1).getExtensionValue(EBB.A07.A01);
                        if (!(extensionValue == null || (A062 = C28338Dxk.A06(AnonymousClass1Bz.A01(extensionValue))) == null)) {
                            try {
                                date2 = A062.A0L();
                            } catch (ParseException e2) {
                                c2w = C2W.A01("Date from date of cert gen extension could not be parsed.", e2);
                                throw c2w;
                            }
                        }
                    } catch (IOException unused) {
                        c2w = C2W.A00("Date of cert gen extension could not be read.");
                        throw c2w;
                    } catch (IllegalArgumentException unused2) {
                        c2w = C2W.A00("Date of cert gen extension could not be read.");
                        throw c2w;
                    }
                }
                date2 = A0z.getNotBefore();
            }
            try {
                A0x.checkValidity(date2);
                E8M e8m2 = e8m;
                if (e8m != null) {
                    e8m2.BdV(new C25597Cic(publicKey2, certPath2, x509Certificate, date2, du92, i2));
                    e8m2.check(A0x);
                }
                C28324DxW A012 = C26068Cri.A01(A0x);
                if (!A012.equals(dxW)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("IssuerName(");
                    A10.append(A012);
                    A10.append(") does not match SubjectName(");
                    A10.append(dxW);
                    throw C27275Db2.A00(AnonymousClass000.A0y(") of signing certificate.", A10), (Throwable) null, certPath2, i2);
                }
            } catch (CertificateExpiredException e3) {
                throw C27275Db2.A00(C17900vP.A0C("Could not validate certificate: ", AnonymousClass000.A10(), e3), e3, certPath2, i2);
            } catch (CertificateNotYetValidException e4) {
                throw C27275Db2.A00(C17900vP.A0C("Could not validate certificate: ", AnonymousClass000.A10(), e4), e4, certPath2, i2);
            }
        } catch (C2W e5) {
            throw C27275Db2.A00("Could not validate time of certificate.", e5, certPath2, i2);
        }
    }

    static {
        String[] strArr = new String[11];
        BEB.A1X(strArr);
        A0D = strArr;
    }

    public static DUA A07(CertPath certPath, Set set, DUA dua, List[] listArr, int i, int i2, boolean z) {
        List[] listArr2;
        String str;
        CertPath certPath2 = certPath;
        DUA dua2 = dua;
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int i3 = i;
        X509Certificate A0z = BE6.A0z(certificates, i3);
        int size = certificates.size();
        int i4 = size - i;
        try {
            String str2 = A03;
            C28339Dxl A052 = C28339Dxl.A05(C26284Cwf.A05(str2, A0z));
            if (A052 == null || dua == null) {
                return null;
            }
            Enumeration A0L = A052.A0L();
            HashSet A12 = C17880vN.A12();
            while (true) {
                listArr2 = listArr;
                if (!A0L.hasMoreElements()) {
                    break;
                }
                C28302DxA A012 = C28302DxA.A01(A0L.nextElement());
                AnonymousClass1C0 r10 = A012.A00;
                String str3 = r10.A01;
                A12.add(str3);
                if (!"2.5.29.32.0".equals(str3)) {
                    try {
                        HashSet A022 = C26284Cwf.A02(A012.A01);
                        int i5 = i4 - 1;
                        List list = listArr[i5];
                        int i6 = 0;
                        while (true) {
                            if (i6 >= list.size()) {
                                List list2 = listArr[i5];
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= list2.size()) {
                                        break;
                                    }
                                    DUA dua3 = (DUA) list2.get(i7);
                                    if ("2.5.29.32.0".equals(dua3.getValidPolicy())) {
                                        HashSet A122 = C17880vN.A12();
                                        String str4 = r10.A01;
                                        DUA dua4 = new DUA(str4, dua3, BE8.A0n(str4, A122), A122, A022, i4, false);
                                        dua3.A01.add(dua4);
                                        dua4.A00 = dua3;
                                        listArr[i4].add(dua4);
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                DUA dua5 = (DUA) list.get(i6);
                                Set expectedPolicies = dua5.getExpectedPolicies();
                                String str5 = r10.A01;
                                if (expectedPolicies.contains(str5)) {
                                    HashSet A123 = C17880vN.A12();
                                    DUA dua6 = new DUA(str5, dua5, BE8.A0n(str5, A123), A123, A022, i4, false);
                                    dua5.A01.add(dua6);
                                    dua6.A00 = dua5;
                                    listArr[i4].add(dua6);
                                    break;
                                }
                                i6++;
                            }
                        }
                    } catch (CertPathValidatorException e) {
                        throw C27275Db2.A00("Policy qualifier info set could not be build.", e, certPath2, i3);
                    }
                }
            }
            Set set2 = set;
            if (set2.isEmpty() || set2.contains("2.5.29.32.0")) {
                set2.clear();
                set2.addAll(A12);
            } else {
                HashSet A124 = C17880vN.A12();
                for (Object next : set2) {
                    if (A12.contains(next)) {
                        A124.add(next);
                    }
                }
                set2.clear();
                set2.addAll(A124);
            }
            if (i2 > 0 || ((i4 < size || z) && BE9.A1W(A0z))) {
                Enumeration A0L2 = A052.A0L();
                while (true) {
                    if (!A0L2.hasMoreElements()) {
                        break;
                    }
                    C28302DxA A013 = C28302DxA.A01(A0L2.nextElement());
                    if ("2.5.29.32.0".equals(A013.A00.A01)) {
                        HashSet A023 = C26284Cwf.A02(A013.A01);
                        List list3 = listArr[i4 - 1];
                        for (int i8 = 0; i8 < list3.size(); i8++) {
                            DUA dua7 = (DUA) list3.get(i8);
                            for (Object next2 : dua7.getExpectedPolicies()) {
                                if (next2 instanceof String) {
                                    str = (String) next2;
                                } else if (next2 instanceof AnonymousClass1C0) {
                                    str = ((AnonymousClass1C0) next2).A01;
                                }
                                Iterator children = dua7.getChildren();
                                boolean z2 = false;
                                while (children.hasNext()) {
                                    if (str.equals(((DUA) children.next()).getValidPolicy())) {
                                        z2 = true;
                                    }
                                }
                                if (!z2) {
                                    HashSet A125 = C17880vN.A12();
                                    DUA dua8 = new DUA(str, dua7, BE8.A0n(str, A125), A125, A023, i4, false);
                                    dua7.A01.add(dua8);
                                    dua8.A00 = dua7;
                                    listArr[i4].add(dua8);
                                }
                            }
                        }
                    }
                }
            }
            for (int i9 = i4 - 1; i9 >= 0; i9--) {
                List list4 = listArr[i9];
                for (int i10 = 0; i10 < list4.size(); i10++) {
                    DUA dua9 = (DUA) list4.get(i10);
                    if (!AnonymousClass000.A1a(dua9.A01) && (dua2 = C26284Cwf.A06(dua2, dua9, listArr2)) == null) {
                        break;
                    }
                }
            }
            Set<String> criticalExtensionOIDs = A0z.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs == null) {
                return dua2;
            }
            boolean contains = criticalExtensionOIDs.contains(str2);
            List list5 = listArr[i4];
            for (int i11 = 0; i11 < list5.size(); i11++) {
                ((DUA) list5.get(i11)).A03 = contains;
            }
            return dua2;
        } catch (C2W e2) {
            throw C27275Db2.A00("Could not read certificate policies extension from certificate.", e2, certPath2, i3);
        }
    }

    public static DUA A09(CertPath certPath, DUA dua, List[] listArr, int i, int i2) {
        HashSet hashSet;
        boolean z;
        CertPath certPath2 = certPath;
        DUA dua2 = dua;
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int i3 = i;
        X509Certificate A0z = BE6.A0z(certificates, i3);
        int A022 = AnonymousClass3MX.A02(certificates, i3);
        try {
            C28339Dxl A052 = C28339Dxl.A05(C26284Cwf.A05(A0B, A0z));
            if (A052 != null) {
                HashMap A11 = C17880vN.A11();
                HashSet A12 = C17880vN.A12();
                for (int i4 = 0; i4 < A052.A0K(); i4++) {
                    C28339Dxl dxl = (C28339Dxl) A052.A0M(i4);
                    String str = ((AnonymousClass1C0) dxl.A0M(0)).A01;
                    String str2 = ((AnonymousClass1C0) C28339Dxl.A04(dxl)).A01;
                    if (!A11.containsKey(str)) {
                        HashSet A122 = C17880vN.A12();
                        A122.add(str2);
                        A11.put(str, A122);
                        A12.add(str);
                    } else {
                        ((Set) A11.get(str)).add(str2);
                    }
                }
                Iterator it = A12.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    List[] listArr2 = listArr;
                    Iterator it2 = listArr[A022].iterator();
                    if (i2 > 0) {
                        while (true) {
                            if (!it2.hasNext()) {
                                Iterator it3 = listArr[A022].iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    DUA dua3 = (DUA) it3.next();
                                    if ("2.5.29.32.0".equals(dua3.getValidPolicy())) {
                                        try {
                                            String str3 = A03;
                                            Enumeration A0L = ((C28339Dxl) C26284Cwf.A05(str3, A0z)).A0L();
                                            while (true) {
                                                if (!A0L.hasMoreElements()) {
                                                    hashSet = null;
                                                    break;
                                                }
                                                try {
                                                    C28302DxA A012 = C28302DxA.A01(A0L.nextElement());
                                                    if ("2.5.29.32.0".equals(A012.A00.A01)) {
                                                        try {
                                                            hashSet = C26284Cwf.A02(A012.A01);
                                                            break;
                                                        } catch (CertPathValidatorException e) {
                                                            throw C27275Db2.A00("Policy qualifier info set could not be decoded.", e, certPath2, i3);
                                                        }
                                                    }
                                                } catch (Exception e2) {
                                                    throw new CertPathValidatorException("Policy information could not be decoded.", e2, certPath2, i3);
                                                }
                                            }
                                            if (A0z.getCriticalExtensionOIDs() != null) {
                                                z = A0z.getCriticalExtensionOIDs().contains(str3);
                                            } else {
                                                z = false;
                                            }
                                            DUA dua4 = (DUA) dua3.getParent();
                                            if ("2.5.29.32.0".equals(dua4.getValidPolicy())) {
                                                DUA dua5 = new DUA(A0v, dua4, AnonymousClass000.A13(), (Set) A11.get(A0v), hashSet, A022, z);
                                                dua4.A01.add(dua5);
                                                dua5.A00 = dua4;
                                                listArr[A022].add(dua5);
                                            }
                                        } catch (C2W e3) {
                                            throw C27275Db2.A00("Certificate policies extension could not be decoded.", e3, certPath2, i3);
                                        }
                                    }
                                }
                            } else {
                                DUA dua6 = (DUA) it2.next();
                                if (dua6.getValidPolicy().equals(A0v)) {
                                    dua6.A02 = (Set) A11.get(A0v);
                                    break;
                                }
                            }
                        }
                    } else {
                        while (it2.hasNext()) {
                            DUA dua7 = (DUA) it2.next();
                            if (dua7.getValidPolicy().equals(A0v)) {
                                ((DUA) dua7.getParent()).A01.remove(dua7);
                                it2.remove();
                                for (int i5 = A022 - 1; i5 >= 0; i5--) {
                                    List list = listArr[i5];
                                    for (int i6 = 0; i6 < list.size(); i6++) {
                                        DUA dua8 = (DUA) list.get(i6);
                                        if (!AnonymousClass000.A1a(dua8.A01) && (dua2 = C26284Cwf.A06(dua2, dua8, listArr2)) == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return dua2;
        } catch (C2W e4) {
            throw C27275Db2.A00("Policy mappings extension could not be decoded.", e4, certPath2, i3);
        }
    }

    public static int A00(CertPath certPath, int i, int i2) {
        try {
            C28339Dxl A052 = C28339Dxl.A05(C26284Cwf.A05(A0A, BE9.A0x(certPath, i)));
            if (A052 != null) {
                Enumeration A0L = A052.A0L();
                while (true) {
                    if (!A0L.hasMoreElements()) {
                        break;
                    }
                    try {
                        C28341Dxn A032 = C28341Dxn.A03(A0L.nextElement());
                        if (A032.A00 == 0) {
                            int A0K = C28337Dxj.A03(A032).A0K();
                            if (A0K < i2) {
                                return A0K;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw C27275Db2.A00("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw C27275Db2.A00("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static int A01(CertPath certPath, int i, int i2) {
        try {
            C28339Dxl A052 = C28339Dxl.A05(C26284Cwf.A05(A0A, BE9.A0x(certPath, i)));
            if (A052 != null) {
                Enumeration A0L = A052.A0L();
                while (true) {
                    if (!A0L.hasMoreElements()) {
                        break;
                    }
                    try {
                        C28341Dxn A032 = C28341Dxn.A03(A0L.nextElement());
                        if (A032.A00 == 1) {
                            int A0K = C28337Dxj.A03(A032).A0K();
                            if (A0K < i2) {
                                return A0K;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw C27275Db2.A00("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw C27275Db2.A00("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static int A02(CertPath certPath, int i, int i2) {
        int A0K;
        try {
            C28337Dxj A022 = C28337Dxj.A02(C26284Cwf.A05(A06, BE9.A0x(certPath, i)));
            if (A022 == null || (A0K = A022.A0K()) >= i2) {
                return i2;
            }
            return A0K;
        } catch (Exception e) {
            throw C27275Db2.A00("Inhibit any-policy extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int A03(CertPath certPath, int i, int i2) {
        C28337Dxj dxj;
        int intValue;
        try {
            C28301Dx9 A012 = C28301Dx9.A01(C26284Cwf.A05(A02, BE9.A0x(certPath, i)));
            if (A012 == null || (dxj = A012.A01) == null || (intValue = new BigInteger(dxj.A00).intValue()) >= i2) {
                return i2;
            }
            return intValue;
        } catch (Exception e) {
            throw C27275Db2.A00("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int A04(CertPath certPath, int i, int i2) {
        try {
            C28339Dxl A052 = C28339Dxl.A05(C26284Cwf.A05(A0A, BE9.A0x(certPath, i)));
            if (A052 != null) {
                Enumeration A0L = A052.A0L();
                while (A0L.hasMoreElements()) {
                    C28341Dxn dxn = (C28341Dxn) A0L.nextElement();
                    if (dxn.A00 == 0) {
                        try {
                            if (C28337Dxj.A03(dxn).A0K() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            throw C27275Db2.A00("Policy constraints requireExplicitPolicy field could not be decoded.", e, certPath, i);
                        }
                    }
                }
            }
            return i2;
        } catch (C2W e2) {
            throw C27275Db2.A00("Policy constraints could not be decoded.", e2, certPath, i);
        }
    }

    public static HashSet A05(Date date, List list, List list2, DZQ dzq) {
        X509Certificate x509Certificate;
        HashSet A12 = C17880vN.A12();
        try {
            A0J(A12, list2, dzq);
            A0J(A12, list, dzq);
            HashSet A122 = C17880vN.A12();
            Iterator it = A12.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                if (x509crl.getNextUpdate().after(date)) {
                    CRLSelector cRLSelector = dzq.A00;
                    if (cRLSelector instanceof X509CRLSelector) {
                        x509Certificate = ((X509CRLSelector) cRLSelector).getCertificateChecking();
                    } else {
                        x509Certificate = null;
                    }
                    if (x509Certificate == null || x509crl.getThisUpdate().before(x509Certificate.getNotAfter())) {
                        A122.add(x509crl);
                    }
                }
            }
            return A122;
        } catch (C2W e) {
            throw C2W.A01("Exception obtaining complete CRLs.", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r10.isEmpty() != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0119, code lost:
        if (r13 != null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011b, code lost:
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011d, code lost:
        if (r8 < 0) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011f, code lost:
        r3 = r14[r8];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0126, code lost:
        if (r2 >= r3.size()) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0128, code lost:
        r1 = (X.DUA) r3.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0134, code lost:
        if (X.AnonymousClass000.A1a(r1.A01) != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0136, code lost:
        r13 = X.C26284Cwf.A06(r13, r1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013a, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.DUA A06(java.security.cert.CertPath r9, java.util.Set r10, java.util.Set r11, X.DU9 r12, X.DUA r13, java.util.List[] r14, int r15) {
        /*
            java.util.List r0 = r9.getCertificates()
            int r8 = r0.size()
            java.lang.String r4 = "Explicit policy requested but none available."
            r2 = 0
            if (r13 != 0) goto L_0x001b
            java.security.cert.PKIXParameters r0 = r12.A01
            boolean r0 = r0.isExplicitPolicyRequired()
            if (r0 == 0) goto L_0x001a
            X.Db2 r0 = X.C27275Db2.A00(r4, r2, r9, r15)
            throw r0
        L_0x001a:
            return r2
        L_0x001b:
            java.lang.String r0 = X.C26284Cwf.A01
            if (r10 == 0) goto L_0x002e
            java.lang.String r0 = "2.5.29.32.0"
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x002e
            boolean r1 = r10.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            java.lang.String r3 = "2.5.29.32.0"
            if (r0 == 0) goto L_0x00b5
            java.security.cert.PKIXParameters r0 = r12.A01
            boolean r0 = r0.isExplicitPolicyRequired()
            if (r0 == 0) goto L_0x013d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00b0
            java.util.HashSet r6 = X.C17880vN.A12()
            r5 = 0
        L_0x0046:
            int r0 = r14.length
            if (r5 >= r0) goto L_0x0076
            r4 = r14[r5]
            r2 = 0
        L_0x004c:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0073
            java.lang.Object r1 = r4.get(r2)
            X.DUA r1 = (X.DUA) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0070
            java.util.Iterator r1 = r1.getChildren()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            X.BE7.A1R(r6, r1)
            goto L_0x0066
        L_0x0070:
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0073:
            int r5 = r5 + 1
            goto L_0x0046
        L_0x0076:
            java.util.Iterator r1 = r6.iterator()
        L_0x007a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r1.next()
            X.DUA r0 = (X.DUA) r0
            java.lang.String r0 = r0.getValidPolicy()
            r11.contains(r0)
            goto L_0x007a
        L_0x008e:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x013d
            r3 = r14[r8]
            r2 = 0
        L_0x0095:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x008e
            java.lang.Object r1 = r3.get(r2)
            X.DUA r1 = (X.DUA) r1
            java.util.List r0 = r1.A01
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x00ad
            X.DUA r13 = X.C26284Cwf.A06(r13, r1, r14)
        L_0x00ad:
            int r2 = r2 + 1
            goto L_0x0095
        L_0x00b0:
            X.Db2 r0 = X.C27275Db2.A00(r4, r2, r9, r15)
            throw r0
        L_0x00b5:
            java.util.HashSet r7 = X.C17880vN.A12()
            r6 = 0
        L_0x00ba:
            int r0 = r14.length
            if (r6 >= r0) goto L_0x00fa
            r5 = r14[r6]
            r4 = 0
        L_0x00c0:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x00f7
            java.lang.Object r1 = r5.get(r4)
            X.DUA r1 = (X.DUA) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00f4
            java.util.Iterator r2 = r1.getChildren()
        L_0x00da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r1 = r2.next()
            X.DUA r1 = (X.DUA) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00da
            r7.add(r1)
            goto L_0x00da
        L_0x00f4:
            int r4 = r4 + 1
            goto L_0x00c0
        L_0x00f7:
            int r6 = r6 + 1
            goto L_0x00ba
        L_0x00fa:
            java.util.Iterator r2 = r7.iterator()
        L_0x00fe:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r1 = r2.next()
            X.DUA r1 = (X.DUA) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x00fe
            X.DUA r13 = X.C26284Cwf.A06(r13, r1, r14)
            goto L_0x00fe
        L_0x0119:
            if (r13 == 0) goto L_0x013d
        L_0x011b:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x013d
            r3 = r14[r8]
            r2 = 0
        L_0x0122:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x011b
            java.lang.Object r1 = r3.get(r2)
            X.DUA r1 = (X.DUA) r1
            java.util.List r0 = r1.A01
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x013a
            X.DUA r13 = X.C26284Cwf.A06(r13, r1, r14)
        L_0x013a:
            int r2 = r2 + 1
            goto L_0x0122
        L_0x013d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26295Cx7.A06(java.security.cert.CertPath, java.util.Set, java.util.Set, X.DU9, X.DUA, java.util.List[], int):X.DUA");
    }

    public static DUA A08(CertPath certPath, DUA dua, int i) {
        try {
            if (C28339Dxl.A05(C26284Cwf.A05(A03, BE9.A0x(certPath, i))) == null) {
                return null;
            }
            return dua;
        } catch (C2W e) {
            throw C27275Db2.A00("Could not read certificate policies extension from certificate.", e, certPath, i);
        }
    }

    public static void A0C(CertPath certPath, int i) {
        try {
            C28339Dxl A052 = C28339Dxl.A05(C26284Cwf.A05(A0B, BE9.A0x(certPath, i)));
            if (A052 != null) {
                int i2 = 0;
                while (i2 < A052.A0K()) {
                    try {
                        C28339Dxl A053 = C28339Dxl.A05(A052.A0M(i2));
                        AnonymousClass1C0 A022 = AnonymousClass1C0.A02(A053.A0M(0));
                        AnonymousClass1C0 A023 = AnonymousClass1C0.A02(C28339Dxl.A04(A053));
                        if ("2.5.29.32.0".equals(A022.A01)) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", (Throwable) null, certPath, i);
                        } else if (!"2.5.29.32.0".equals(A023.A01)) {
                            i2++;
                        } else {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", (Throwable) null, certPath, i);
                        }
                    } catch (Exception e) {
                        throw C27275Db2.A00("Policy mappings extension contents could not be decoded.", e, certPath, i);
                    }
                }
            }
        } catch (C2W e2) {
            throw C27275Db2.A00("Policy mappings extension could not be decoded.", e2, certPath, i);
        }
    }

    public static void A0D(CertPath certPath, int i) {
        try {
            C28301Dx9 A012 = C28301Dx9.A01(C26284Cwf.A05(A02, BE9.A0x(certPath, i)));
            if (A012 != null) {
                C28336Dxi dxi = A012.A00;
                if (dxi == null || dxi.A00 == 0) {
                    throw new CertPathValidatorException("Not a CA certificate", (Throwable) null, certPath, i);
                }
                return;
            }
            throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", (Throwable) null, certPath, i);
        } catch (Exception e) {
            throw C27275Db2.A00("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static void A0E(CertPath certPath, int i) {
        boolean[] keyUsage = BE9.A0x(certPath, i).getKeyUsage();
        if (keyUsage == null) {
            return;
        }
        if (keyUsage.length <= 5 || !keyUsage[5]) {
            throw C27275Db2.A00("Issuer certificate keyusage extension is critical and does not permit key signing.", (Throwable) null, certPath, i);
        }
    }

    public static void A0F(CertPath certPath, List list, Set set, int i) {
        Certificate certificate = (Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw C27275Db2.A00(AnonymousClass001.A1E(set, "Certificate has unsupported critical extension: ", AnonymousClass000.A10()), (Throwable) null, certPath, i);
        }
    }

    public static void A0G(CertPath certPath, List list, Set set, int i) {
        Certificate certificate = (Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(certificate, set);
            } catch (CertPathValidatorException e) {
                throw C27275Db2.A00(e.getMessage(), e, certPath, i);
            } catch (Exception e2) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e2, certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw C27275Db2.A00(AnonymousClass001.A1E(set, "Certificate has unsupported critical extension: ", AnonymousClass000.A10()), (Throwable) null, certPath, i);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Dx1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bb, code lost:
        if (java.util.Arrays.equals(r12, r7) != false) goto L_0x01bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0288 A[Catch:{ Exception -> 0x045e }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03e1 A[Catch:{ Exception -> 0x045e }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x056b A[Catch:{ Exception -> 0x06c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0695 A[Catch:{ Exception -> 0x06c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0227 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0380 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(java.security.cert.CertPath r26, X.C25261Cc2 r27, int r28) {
        /*
            java.util.List r0 = r26.getCertificates()
            r3 = r28
            java.security.cert.X509Certificate r1 = X.BE6.A0z(r0, r3)
            java.lang.String r0 = A09     // Catch:{ Exception -> 0x06cf }
            X.1Bz r0 = X.C26284Cwf.A05(r0, r1)     // Catch:{ Exception -> 0x06cf }
            X.Dxl r0 = X.C28339Dxl.A05(r0)     // Catch:{ Exception -> 0x06cf }
            if (r0 == 0) goto L_0x06ce
            X.Dxl r0 = X.C28339Dxl.A05(r0)     // Catch:{ Exception -> 0x06cf }
            X.Dx1 r4 = new X.Dx1     // Catch:{ Exception -> 0x06cf }
            r4.<init>()     // Catch:{ Exception -> 0x06cf }
            java.util.Enumeration r6 = r0.A0L()     // Catch:{ Exception -> 0x06cf }
        L_0x0023:
            boolean r0 = r6.hasMoreElements()     // Catch:{ Exception -> 0x06cf }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r6.nextElement()     // Catch:{ Exception -> 0x06cf }
            X.Dxn r5 = X.C28341Dxn.A03(r0)     // Catch:{ Exception -> 0x06cf }
            int r2 = r5.A00     // Catch:{ Exception -> 0x06cf }
            r1 = 0
            if (r2 == 0) goto L_0x0044
            r0 = 1
            if (r2 != r0) goto L_0x004f
            X.Dxl r0 = X.C28339Dxl.A06(r5, r1)     // Catch:{ Exception -> 0x06cf }
            X.Dx4[] r0 = X.C28293Dx1.A01(r0)     // Catch:{ Exception -> 0x06cf }
            r4.A00 = r0     // Catch:{ Exception -> 0x06cf }
            goto L_0x0023
        L_0x0044:
            X.Dxl r0 = X.C28339Dxl.A06(r5, r1)     // Catch:{ Exception -> 0x06cf }
            X.Dx4[] r0 = X.C28293Dx1.A01(r0)     // Catch:{ Exception -> 0x06cf }
            r4.A01 = r0     // Catch:{ Exception -> 0x06cf }
            goto L_0x0023
        L_0x004f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x06cf }
            java.lang.String r0 = "Unknown tag encountered: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)     // Catch:{ Exception -> 0x06cf }
            throw r0     // Catch:{ Exception -> 0x06cf }
        L_0x005a:
            X.Dx4[] r2 = r4.A01
            r25 = r27
            if (r2 == 0) goto L_0x0468
            int r1 = r2.length
            X.Dx4[] r8 = new X.C28296Dx4[r1]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r8, r0, r1)
            r0 = r25
            X.Cwa r5 = r0.A00     // Catch:{ Exception -> 0x045e }
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ Exception -> 0x045e }
            r6 = 0
        L_0x0070:
            int r0 = r8.length     // Catch:{ Exception -> 0x045e }
            if (r6 == r0) goto L_0x0096
            r2 = r8[r6]     // Catch:{ Exception -> 0x045e }
            X.DxU r0 = r2.A02     // Catch:{ Exception -> 0x045e }
            int r0 = r0.A00     // Catch:{ Exception -> 0x045e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x045e }
            java.lang.Object r0 = r7.get(r1)     // Catch:{ Exception -> 0x045e }
            if (r0 != 0) goto L_0x008a
            java.util.HashSet r0 = X.C17880vN.A12()     // Catch:{ Exception -> 0x045e }
            r7.put(r1, r0)     // Catch:{ Exception -> 0x045e }
        L_0x008a:
            java.lang.Object r0 = r7.get(r1)     // Catch:{ Exception -> 0x045e }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x045e }
            r0.add(r2)     // Catch:{ Exception -> 0x045e }
            int r6 = r6 + 1
            goto L_0x0070
        L_0x0096:
            java.util.Iterator r24 = X.C17890vO.A0i(r7)     // Catch:{ Exception -> 0x045e }
        L_0x009a:
            boolean r0 = r24.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0468
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r24)     // Catch:{ Exception -> 0x045e }
            java.lang.Object r0 = r1.getKey()     // Catch:{ Exception -> 0x045e }
            int r2 = X.BE6.A0F(r0)     // Catch:{ Exception -> 0x045e }
            if (r2 == 0) goto L_0x0407
            r0 = 1
            if (r2 == r0) goto L_0x0354
            r0 = 2
            if (r2 == r0) goto L_0x0306
            r0 = 4
            if (r2 == r0) goto L_0x02ae
            r0 = 6
            if (r2 == r0) goto L_0x01fb
            r0 = 7
            if (r2 != r0) goto L_0x0453
            java.util.Set r0 = r5.A09     // Catch:{ Exception -> 0x045e }
            r23 = r0
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x045e }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x045e }
            java.util.HashSet r11 = X.C17880vN.A12()     // Catch:{ Exception -> 0x045e }
            java.util.Iterator r22 = r0.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x00cf:
            boolean r0 = r22.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x01f7
            java.lang.Object r0 = r22.next()     // Catch:{ Exception -> 0x045e }
            X.Dx4 r0 = (X.C28296Dx4) r0     // Catch:{ Exception -> 0x045e }
            X.DxU r0 = r0.A02     // Catch:{ Exception -> 0x045e }
            X.1Bx r0 = r0.A01     // Catch:{ Exception -> 0x045e }
            byte[] r10 = X.C28342Dxo.A05(r0)     // Catch:{ Exception -> 0x045e }
            if (r23 != 0) goto L_0x00eb
            if (r10 == 0) goto L_0x00cf
            r11.add(r10)     // Catch:{ Exception -> 0x045e }
            goto L_0x00cf
        L_0x00eb:
            java.util.Iterator r21 = r23.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x00ef:
            boolean r0 = r21.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r2 = r21.next()     // Catch:{ Exception -> 0x045e }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x045e }
            int r1 = r2.length     // Catch:{ Exception -> 0x045e }
            int r0 = r10.length     // Catch:{ Exception -> 0x045e }
            if (r1 != r0) goto L_0x01bd
            r12 = 2
            int r1 = r1 / r12
            byte[] r9 = new byte[r1]     // Catch:{ Exception -> 0x045e }
            byte[] r8 = new byte[r1]     // Catch:{ Exception -> 0x045e }
            r7 = 0
            java.lang.System.arraycopy(r2, r7, r9, r7, r1)     // Catch:{ Exception -> 0x045e }
            java.lang.System.arraycopy(r2, r1, r8, r7, r1)     // Catch:{ Exception -> 0x045e }
            byte[] r6 = new byte[r1]     // Catch:{ Exception -> 0x045e }
            byte[] r2 = new byte[r1]     // Catch:{ Exception -> 0x045e }
            java.lang.System.arraycopy(r10, r7, r6, r7, r1)     // Catch:{ Exception -> 0x045e }
            java.lang.System.arraycopy(r10, r1, r2, r7, r1)     // Catch:{ Exception -> 0x045e }
            r0 = 4
            byte[][] r1 = new byte[r0][]     // Catch:{ Exception -> 0x045e }
            X.AnonymousClass8BS.A1B(r9, r8, r1)     // Catch:{ Exception -> 0x045e }
            r1[r12] = r6     // Catch:{ Exception -> 0x045e }
            r0 = 3
            r1[r0] = r2     // Catch:{ Exception -> 0x045e }
            r9 = 0
            r14 = r1[r7]     // Catch:{ Exception -> 0x045e }
            r20 = 1
            r13 = r1[r20]     // Catch:{ Exception -> 0x045e }
            r19 = 2
            r18 = r1[r12]     // Catch:{ Exception -> 0x045e }
            r17 = 3
            r16 = r1[r0]     // Catch:{ Exception -> 0x045e }
            int r8 = r14.length     // Catch:{ Exception -> 0x045e }
            byte[] r12 = new byte[r8]     // Catch:{ Exception -> 0x045e }
            byte[] r7 = new byte[r8]     // Catch:{ Exception -> 0x045e }
            byte[] r6 = new byte[r8]     // Catch:{ Exception -> 0x045e }
            byte[] r2 = new byte[r8]     // Catch:{ Exception -> 0x045e }
            r1 = 0
        L_0x013a:
            if (r1 >= r8) goto L_0x0163
            byte r15 = r14[r1]     // Catch:{ Exception -> 0x045e }
            byte r0 = r13[r1]     // Catch:{ Exception -> 0x045e }
            r15 = r15 & r0
            byte r0 = (byte) r15     // Catch:{ Exception -> 0x045e }
            r12[r1] = r0     // Catch:{ Exception -> 0x045e }
            byte r15 = r14[r1]     // Catch:{ Exception -> 0x045e }
            byte r0 = r13[r1]     // Catch:{ Exception -> 0x045e }
            r15 = r15 & r0
            r0 = r0 ^ -1
            X.BE6.A1N(r7, r15, r0, r1)     // Catch:{ Exception -> 0x045e }
            byte r15 = r18[r1]     // Catch:{ Exception -> 0x045e }
            byte r0 = r16[r1]     // Catch:{ Exception -> 0x045e }
            r15 = r15 & r0
            byte r0 = (byte) r15     // Catch:{ Exception -> 0x045e }
            r6[r1] = r0     // Catch:{ Exception -> 0x045e }
            byte r15 = r18[r1]     // Catch:{ Exception -> 0x045e }
            byte r0 = r16[r1]     // Catch:{ Exception -> 0x045e }
            r15 = r15 & r0
            r0 = r0 ^ -1
            X.BE6.A1N(r2, r15, r0, r1)     // Catch:{ Exception -> 0x045e }
            int r1 = r1 + 1
            goto L_0x013a
        L_0x0163:
            r0 = 4
            byte[][] r8 = new byte[r0][]     // Catch:{ Exception -> 0x045e }
            r8[r9] = r12     // Catch:{ Exception -> 0x045e }
            r8[r20] = r7     // Catch:{ Exception -> 0x045e }
            r8[r19] = r6     // Catch:{ Exception -> 0x045e }
            r8[r17] = r2     // Catch:{ Exception -> 0x045e }
            r12 = r8[r20]     // Catch:{ Exception -> 0x045e }
            r7 = r8[r17]     // Catch:{ Exception -> 0x045e }
            r6 = 0
        L_0x0173:
            int r0 = r12.length     // Catch:{ Exception -> 0x045e }
            if (r6 >= r0) goto L_0x0184
            byte r2 = r12[r6]     // Catch:{ Exception -> 0x045e }
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            byte r0 = r7[r6]     // Catch:{ Exception -> 0x045e }
            r1 = r1 & r0
            if (r2 < r1) goto L_0x0185
            int r6 = r6 + 1
            goto L_0x0173
        L_0x0184:
            r12 = r7
        L_0x0185:
            r14 = r8[r9]     // Catch:{ Exception -> 0x045e }
            r7 = r8[r19]     // Catch:{ Exception -> 0x045e }
            r6 = 0
        L_0x018a:
            int r0 = r14.length     // Catch:{ Exception -> 0x045e }
            if (r6 >= r0) goto L_0x019d
            byte r2 = r14[r6]     // Catch:{ Exception -> 0x045e }
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            byte r0 = r7[r6]     // Catch:{ Exception -> 0x045e }
            r1 = r1 & r0
            if (r2 <= r1) goto L_0x0199
            goto L_0x019c
        L_0x0199:
            int r6 = r6 + 1
            goto L_0x018a
        L_0x019c:
            r7 = r14
        L_0x019d:
            boolean r0 = java.util.Arrays.equals(r7, r12)     // Catch:{ Exception -> 0x045e }
            if (r0 != 0) goto L_0x01c4
            r6 = 0
        L_0x01a4:
            int r0 = r7.length     // Catch:{ Exception -> 0x045e }
            if (r6 >= r0) goto L_0x01b7
            byte r2 = r7[r6]     // Catch:{ Exception -> 0x045e }
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            byte r0 = r12[r6]     // Catch:{ Exception -> 0x045e }
            r1 = r1 & r0
            if (r2 <= r1) goto L_0x01b3
            goto L_0x01b6
        L_0x01b3:
            int r6 = r6 + 1
            goto L_0x01a4
        L_0x01b6:
            r12 = r7
        L_0x01b7:
            boolean r0 = java.util.Arrays.equals(r12, r7)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x01c4
        L_0x01bd:
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch:{ Exception -> 0x045e }
        L_0x01bf:
            r11.addAll(r0)     // Catch:{ Exception -> 0x045e }
            goto L_0x00ef
        L_0x01c4:
            r7 = r8[r9]     // Catch:{ Exception -> 0x045e }
            r6 = r8[r19]     // Catch:{ Exception -> 0x045e }
            int r12 = r7.length     // Catch:{ Exception -> 0x045e }
            byte[] r8 = new byte[r12]     // Catch:{ Exception -> 0x045e }
            r2 = 0
        L_0x01cc:
            if (r2 >= r12) goto L_0x01d8
            byte r1 = r7[r2]     // Catch:{ Exception -> 0x045e }
            byte r0 = r6[r2]     // Catch:{ Exception -> 0x045e }
            X.BE6.A1N(r8, r1, r0, r2)     // Catch:{ Exception -> 0x045e }
            int r2 = r2 + 1
            goto L_0x01cc
        L_0x01d8:
            int r7 = r13.length     // Catch:{ Exception -> 0x045e }
            byte[] r6 = new byte[r7]     // Catch:{ Exception -> 0x045e }
            r2 = 0
        L_0x01dc:
            if (r2 >= r7) goto L_0x01e8
            byte r1 = r13[r2]     // Catch:{ Exception -> 0x045e }
            byte r0 = r16[r2]     // Catch:{ Exception -> 0x045e }
            X.BE6.A1N(r6, r1, r0, r2)     // Catch:{ Exception -> 0x045e }
            int r2 = r2 + 1
            goto L_0x01dc
        L_0x01e8:
            int r0 = r12 * 2
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x045e }
            java.lang.System.arraycopy(r8, r9, r0, r9, r12)     // Catch:{ Exception -> 0x045e }
            java.lang.System.arraycopy(r6, r9, r0, r12, r12)     // Catch:{ Exception -> 0x045e }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ Exception -> 0x045e }
            goto L_0x01bf
        L_0x01f7:
            r5.A09 = r11     // Catch:{ Exception -> 0x045e }
            goto L_0x009a
        L_0x01fb:
            java.util.Set r7 = r5.A0B     // Catch:{ Exception -> 0x045e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x045e }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x045e }
            java.util.HashSet r6 = X.C17880vN.A12()     // Catch:{ Exception -> 0x045e }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x020b:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x02aa
            java.lang.Object r0 = r13.next()     // Catch:{ Exception -> 0x045e }
            X.Dx4 r0 = (X.C28296Dx4) r0     // Catch:{ Exception -> 0x045e }
            X.DxU r0 = r0.A02     // Catch:{ Exception -> 0x045e }
            java.lang.String r2 = X.C28353Dxz.A02(r0)     // Catch:{ Exception -> 0x045e }
            if (r7 != 0) goto L_0x0223
            r6.add(r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x020b
        L_0x0223:
            java.util.Iterator r12 = r7.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x0227:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x020b
            java.lang.String r8 = X.C17880vN.A0v(r12)     // Catch:{ Exception -> 0x045e }
            r11 = 64
            int r0 = r8.indexOf(r11)     // Catch:{ Exception -> 0x045e }
            java.lang.String r10 = "."
            r9 = -1
            if (r0 == r9) goto L_0x0256
            java.lang.String r1 = X.BE6.A0p(r0, r8)     // Catch:{ Exception -> 0x045e }
            int r0 = r2.indexOf(r11)     // Catch:{ Exception -> 0x045e }
            if (r0 != r9) goto L_0x0282
            boolean r0 = r2.startsWith(r10)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0251
            boolean r0 = X.C26279Cwa.A06(r1, r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x0286
        L_0x0251:
            boolean r0 = r1.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x0286
        L_0x0256:
            boolean r1 = r8.startsWith(r10)     // Catch:{ Exception -> 0x045e }
            int r0 = r2.indexOf(r11)     // Catch:{ Exception -> 0x045e }
            if (r1 == 0) goto L_0x026c
            if (r0 == r9) goto L_0x0289
            r0 = 0
            java.lang.String r0 = r2.substring(r0)     // Catch:{ Exception -> 0x045e }
            boolean r0 = X.C26279Cwa.A06(r0, r8)     // Catch:{ Exception -> 0x045e }
            goto L_0x02a3
        L_0x026c:
            if (r0 == r9) goto L_0x0277
            java.lang.String r0 = X.BE6.A0p(r0, r2)     // Catch:{ Exception -> 0x045e }
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ Exception -> 0x045e }
            goto L_0x02a3
        L_0x0277:
            boolean r0 = r2.startsWith(r10)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0282
            boolean r0 = X.C26279Cwa.A06(r8, r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x0286
        L_0x0282:
            boolean r0 = r8.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x045e }
        L_0x0286:
            if (r0 == 0) goto L_0x0227
            goto L_0x029b
        L_0x0289:
            boolean r0 = r2.startsWith(r10)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x029f
            boolean r0 = X.C26279Cwa.A06(r8, r2)     // Catch:{ Exception -> 0x045e }
            if (r0 != 0) goto L_0x029b
            boolean r0 = r8.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x029f
        L_0x029b:
            r6.add(r8)     // Catch:{ Exception -> 0x045e }
            goto L_0x0227
        L_0x029f:
            boolean r0 = X.C26279Cwa.A06(r2, r8)     // Catch:{ Exception -> 0x045e }
        L_0x02a3:
            if (r0 == 0) goto L_0x0227
            r6.add(r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x0227
        L_0x02aa:
            r5.A0B = r6     // Catch:{ Exception -> 0x045e }
            goto L_0x009a
        L_0x02ae:
            java.util.Set r8 = r5.A06     // Catch:{ Exception -> 0x045e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x045e }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x045e }
            java.util.HashSet r7 = X.C17880vN.A12()     // Catch:{ Exception -> 0x045e }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x02be:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0302
            java.lang.Object r0 = r9.next()     // Catch:{ Exception -> 0x045e }
            X.Dx4 r0 = (X.C28296Dx4) r0     // Catch:{ Exception -> 0x045e }
            X.DxU r0 = r0.A02     // Catch:{ Exception -> 0x045e }
            X.1Bx r0 = r0.A01     // Catch:{ Exception -> 0x045e }
            X.1Bz r0 = r0.CP9()     // Catch:{ Exception -> 0x045e }
            X.Dxl r6 = X.C28339Dxl.A05(r0)     // Catch:{ Exception -> 0x045e }
            if (r8 != 0) goto L_0x02de
            if (r6 == 0) goto L_0x02be
            r7.add(r6)     // Catch:{ Exception -> 0x045e }
            goto L_0x02be
        L_0x02de:
            java.util.Iterator r2 = r8.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x02e2:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x02be
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x045e }
            X.Dxl r1 = (X.C28339Dxl) r1     // Catch:{ Exception -> 0x045e }
            boolean r0 = X.C26279Cwa.A08(r6, r1)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x02f8
            r7.add(r6)     // Catch:{ Exception -> 0x045e }
            goto L_0x02e2
        L_0x02f8:
            boolean r0 = X.C26279Cwa.A08(r1, r6)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x02e2
            r7.add(r1)     // Catch:{ Exception -> 0x045e }
            goto L_0x02e2
        L_0x0302:
            r5.A06 = r7     // Catch:{ Exception -> 0x045e }
            goto L_0x009a
        L_0x0306:
            java.util.Set r9 = r5.A07     // Catch:{ Exception -> 0x045e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x045e }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x045e }
            java.util.HashSet r8 = X.C17880vN.A12()     // Catch:{ Exception -> 0x045e }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x0316:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0350
            java.lang.Object r0 = r7.next()     // Catch:{ Exception -> 0x045e }
            X.Dx4 r0 = (X.C28296Dx4) r0     // Catch:{ Exception -> 0x045e }
            X.DxU r0 = r0.A02     // Catch:{ Exception -> 0x045e }
            java.lang.String r6 = X.C28353Dxz.A02(r0)     // Catch:{ Exception -> 0x045e }
            if (r9 != 0) goto L_0x032e
            r8.add(r6)     // Catch:{ Exception -> 0x045e }
            goto L_0x0316
        L_0x032e:
            java.util.Iterator r2 = r9.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x0332:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0316
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ Exception -> 0x045e }
            boolean r0 = X.C26279Cwa.A06(r1, r6)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0346
            r8.add(r1)     // Catch:{ Exception -> 0x045e }
            goto L_0x0332
        L_0x0346:
            boolean r0 = X.C26279Cwa.A06(r6, r1)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0332
            r8.add(r6)     // Catch:{ Exception -> 0x045e }
            goto L_0x0332
        L_0x0350:
            r5.A07 = r8     // Catch:{ Exception -> 0x045e }
            goto L_0x009a
        L_0x0354:
            java.util.Set r7 = r5.A08     // Catch:{ Exception -> 0x045e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x045e }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x045e }
            java.util.HashSet r6 = X.C17880vN.A12()     // Catch:{ Exception -> 0x045e }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x0364:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0403
            java.lang.Object r0 = r13.next()     // Catch:{ Exception -> 0x045e }
            X.Dx4 r0 = (X.C28296Dx4) r0     // Catch:{ Exception -> 0x045e }
            X.DxU r0 = r0.A02     // Catch:{ Exception -> 0x045e }
            java.lang.String r2 = X.C28353Dxz.A02(r0)     // Catch:{ Exception -> 0x045e }
            if (r7 != 0) goto L_0x037c
            r6.add(r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x0364
        L_0x037c:
            java.util.Iterator r12 = r7.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x0380:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0364
            java.lang.String r1 = X.C17880vN.A0v(r12)     // Catch:{ Exception -> 0x045e }
            r11 = 64
            int r0 = r2.indexOf(r11)     // Catch:{ Exception -> 0x045e }
            java.lang.String r10 = "."
            r9 = -1
            if (r0 == r9) goto L_0x03af
            java.lang.String r8 = X.BE6.A0p(r0, r2)     // Catch:{ Exception -> 0x045e }
            int r0 = r1.indexOf(r11)     // Catch:{ Exception -> 0x045e }
            if (r0 != r9) goto L_0x03db
            boolean r0 = r1.startsWith(r10)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x03aa
            boolean r0 = X.C26279Cwa.A06(r8, r1)     // Catch:{ Exception -> 0x045e }
            goto L_0x03df
        L_0x03aa:
            boolean r0 = r8.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x045e }
            goto L_0x03df
        L_0x03af:
            boolean r8 = r2.startsWith(r10)     // Catch:{ Exception -> 0x045e }
            int r0 = r1.indexOf(r11)     // Catch:{ Exception -> 0x045e }
            if (r8 == 0) goto L_0x03c5
            if (r0 == r9) goto L_0x03e2
            r0 = 0
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x045e }
            boolean r0 = X.C26279Cwa.A06(r0, r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x03fc
        L_0x03c5:
            if (r0 == r9) goto L_0x03d0
            java.lang.String r0 = X.BE6.A0p(r0, r1)     // Catch:{ Exception -> 0x045e }
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x03fc
        L_0x03d0:
            boolean r0 = r1.startsWith(r10)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x03db
            boolean r0 = X.C26279Cwa.A06(r2, r1)     // Catch:{ Exception -> 0x045e }
            goto L_0x03df
        L_0x03db:
            boolean r0 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x045e }
        L_0x03df:
            if (r0 == 0) goto L_0x0380
            goto L_0x03f4
        L_0x03e2:
            boolean r0 = r1.startsWith(r10)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x03f8
            boolean r0 = X.C26279Cwa.A06(r2, r1)     // Catch:{ Exception -> 0x045e }
            if (r0 != 0) goto L_0x03f4
            boolean r0 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x03f8
        L_0x03f4:
            r6.add(r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x0380
        L_0x03f8:
            boolean r0 = X.C26279Cwa.A06(r1, r2)     // Catch:{ Exception -> 0x045e }
        L_0x03fc:
            if (r0 == 0) goto L_0x0380
            r6.add(r1)     // Catch:{ Exception -> 0x045e }
            goto L_0x0380
        L_0x0403:
            r5.A08 = r6     // Catch:{ Exception -> 0x045e }
            goto L_0x009a
        L_0x0407:
            java.util.Set r8 = r5.A0A     // Catch:{ Exception -> 0x045e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x045e }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x045e }
            java.util.HashSet r7 = X.C17880vN.A12()     // Catch:{ Exception -> 0x045e }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x0417:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x044f
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x045e }
            X.Dx4 r0 = (X.C28296Dx4) r0     // Catch:{ Exception -> 0x045e }
            X.DxU r0 = r0.A02     // Catch:{ Exception -> 0x045e }
            X.1Bx r0 = r0.A01     // Catch:{ Exception -> 0x045e }
            X.DxI r2 = X.C28310DxI.A01(r0)     // Catch:{ Exception -> 0x045e }
            if (r8 != 0) goto L_0x0433
            if (r2 == 0) goto L_0x0417
            r7.add(r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x0417
        L_0x0433:
            java.util.Iterator r1 = r8.iterator()     // Catch:{ Exception -> 0x045e }
        L_0x0437:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0417
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x045e }
            X.DxI r0 = X.C28310DxI.A01(r0)     // Catch:{ Exception -> 0x045e }
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x045e }
            if (r0 == 0) goto L_0x0437
            r7.add(r2)     // Catch:{ Exception -> 0x045e }
            goto L_0x0437
        L_0x044f:
            r5.A0A = r7     // Catch:{ Exception -> 0x045e }
            goto L_0x009a
        L_0x0453:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x045e }
            java.lang.String r0 = "Unknown tag encountered: "
            java.lang.IllegalStateException r0 = X.AnonymousClass8BX.A0W(r0, r1, r2)     // Catch:{ Exception -> 0x045e }
            throw r0     // Catch:{ Exception -> 0x045e }
        L_0x045e:
            r2 = move-exception
            java.lang.String r1 = "Permitted subtrees cannot be build from name constraints extension."
            r0 = r26
            X.Db2 r0 = X.C27275Db2.A00(r1, r2, r0, r3)
            throw r0
        L_0x0468:
            X.Dx4[] r2 = r4.A00
            if (r2 == 0) goto L_0x06ce
            int r1 = r2.length
            X.Dx4[] r5 = new X.C28296Dx4[r1]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r5, r0, r1)
            r4 = 0
        L_0x0474:
            int r0 = r5.length
            if (r4 == r0) goto L_0x06ce
            r1 = r5[r4]     // Catch:{ Exception -> 0x06c4 }
            r0 = r25
            X.Cwa r6 = r0.A00     // Catch:{ Exception -> 0x06c4 }
            X.DxU r7 = r1.A02     // Catch:{ Exception -> 0x06c4 }
            int r2 = r7.A00     // Catch:{ Exception -> 0x06c4 }
            if (r2 == 0) goto L_0x06a4
            r0 = 1
            if (r2 == r0) goto L_0x05fe
            r0 = 2
            if (r2 == r0) goto L_0x05c3
            r0 = 4
            if (r2 == r0) goto L_0x057a
            r0 = 6
            if (r2 == r0) goto L_0x04d4
            r0 = 7
            if (r2 != r0) goto L_0x06b9
            java.util.Set r1 = r6.A03     // Catch:{ Exception -> 0x06c4 }
            X.1Bx r0 = r7.A01     // Catch:{ Exception -> 0x06c4 }
            byte[] r9 = X.C28342Dxo.A05(r0)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x04a3
            if (r9 == 0) goto L_0x04d0
            goto L_0x04cd
        L_0x04a3:
            java.util.HashSet r8 = X.C17880vN.A12()     // Catch:{ Exception -> 0x06c4 }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ Exception -> 0x06c4 }
        L_0x04ab:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x04cb
            java.lang.Object r2 = r7.next()     // Catch:{ Exception -> 0x06c4 }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x06c4 }
            java.util.HashSet r1 = X.C17880vN.A12()     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = java.util.Arrays.equals(r2, r9)     // Catch:{ Exception -> 0x06c4 }
            r1.add(r2)     // Catch:{ Exception -> 0x06c4 }
            if (r0 != 0) goto L_0x04c7
            r1.add(r9)     // Catch:{ Exception -> 0x06c4 }
        L_0x04c7:
            r8.addAll(r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x04ab
        L_0x04cb:
            r1 = r8
            goto L_0x04d0
        L_0x04cd:
            r1.add(r9)     // Catch:{ Exception -> 0x06c4 }
        L_0x04d0:
            r6.A03 = r1     // Catch:{ Exception -> 0x06c4 }
            goto L_0x06b5
        L_0x04d4:
            java.util.Set r1 = r6.A05     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r7 = X.C28353Dxz.A02(r7)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x04e7
            r1.add(r7)     // Catch:{ Exception -> 0x06c4 }
        L_0x04e3:
            r6.A05 = r1     // Catch:{ Exception -> 0x06c4 }
            goto L_0x06b5
        L_0x04e7:
            java.util.HashSet r2 = X.C17880vN.A12()     // Catch:{ Exception -> 0x06c4 }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ Exception -> 0x06c4 }
        L_0x04ef:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x0577
            java.lang.String r1 = X.C17880vN.A0v(r12)     // Catch:{ Exception -> 0x06c4 }
            r11 = 64
            int r0 = r1.indexOf(r11)     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r10 = "."
            r9 = -1
            if (r0 == r9) goto L_0x051e
            java.lang.String r8 = X.BE6.A0p(r0, r1)     // Catch:{ Exception -> 0x06c4 }
            int r0 = r7.indexOf(r11)     // Catch:{ Exception -> 0x06c4 }
            if (r0 != r9) goto L_0x0565
            boolean r0 = r7.startsWith(r10)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x0519
            boolean r0 = X.C26279Cwa.A06(r8, r7)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0562
        L_0x0519:
            boolean r0 = r8.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0562
        L_0x051e:
            boolean r8 = r1.startsWith(r10)     // Catch:{ Exception -> 0x06c4 }
            int r0 = r7.indexOf(r11)     // Catch:{ Exception -> 0x06c4 }
            if (r8 == 0) goto L_0x054c
            if (r0 == r9) goto L_0x0534
            r0 = 0
            java.lang.String r0 = r7.substring(r0)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = X.C26279Cwa.A06(r0, r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0569
        L_0x0534:
            boolean r0 = r7.startsWith(r10)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x0547
            boolean r0 = X.C26279Cwa.A06(r1, r7)     // Catch:{ Exception -> 0x06c4 }
            if (r0 != 0) goto L_0x0572
            boolean r0 = r1.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x0547
            goto L_0x0572
        L_0x0547:
            boolean r0 = X.C26279Cwa.A06(r7, r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0569
        L_0x054c:
            if (r0 == r9) goto L_0x0558
            r0 = 0
            java.lang.String r0 = r7.substring(r0)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0569
        L_0x0558:
            boolean r0 = r7.startsWith(r10)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x0565
            boolean r0 = X.C26279Cwa.A06(r1, r7)     // Catch:{ Exception -> 0x06c4 }
        L_0x0562:
            if (r0 == 0) goto L_0x056f
            goto L_0x0572
        L_0x0565:
            boolean r0 = r1.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x06c4 }
        L_0x0569:
            if (r0 == 0) goto L_0x056f
            r2.add(r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x04ef
        L_0x056f:
            r2.add(r1)     // Catch:{ Exception -> 0x06c4 }
        L_0x0572:
            r2.add(r7)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x04ef
        L_0x0577:
            r1 = r2
            goto L_0x04e3
        L_0x057a:
            java.util.Set r1 = r6.A00     // Catch:{ Exception -> 0x06c4 }
            X.1Bx r0 = r7.A01     // Catch:{ Exception -> 0x06c4 }
            X.1Bz r8 = r0.CP9()     // Catch:{ Exception -> 0x06c4 }
            X.Dxl r8 = (X.C28339Dxl) r8     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x058d
            if (r8 == 0) goto L_0x05bf
            goto L_0x05bc
        L_0x058d:
            java.util.HashSet r7 = X.C17880vN.A12()     // Catch:{ Exception -> 0x06c4 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x06c4 }
        L_0x0595:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x05ba
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x06c4 }
            X.Dxl r1 = X.C28339Dxl.A05(r0)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = X.C26279Cwa.A08(r8, r1)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x05ad
            r7.add(r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0595
        L_0x05ad:
            boolean r0 = X.C26279Cwa.A08(r1, r8)     // Catch:{ Exception -> 0x06c4 }
            if (r0 != 0) goto L_0x05b6
            r7.add(r1)     // Catch:{ Exception -> 0x06c4 }
        L_0x05b6:
            r7.add(r8)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0595
        L_0x05ba:
            r1 = r7
            goto L_0x05bf
        L_0x05bc:
            r1.add(r8)     // Catch:{ Exception -> 0x06c4 }
        L_0x05bf:
            r6.A00 = r1     // Catch:{ Exception -> 0x06c4 }
            goto L_0x06b5
        L_0x05c3:
            java.util.Set r1 = r6.A01     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r8 = X.C28353Dxz.A02(r7)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x05d6
            r1.add(r8)     // Catch:{ Exception -> 0x06c4 }
        L_0x05d2:
            r6.A01 = r1     // Catch:{ Exception -> 0x06c4 }
            goto L_0x06b5
        L_0x05d6:
            java.util.HashSet r7 = X.C17880vN.A12()     // Catch:{ Exception -> 0x06c4 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x06c4 }
        L_0x05de:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x05fc
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = X.C26279Cwa.A06(r1, r8)     // Catch:{ Exception -> 0x06c4 }
            if (r0 != 0) goto L_0x05f8
            boolean r0 = X.C26279Cwa.A06(r8, r1)     // Catch:{ Exception -> 0x06c4 }
            r7.add(r1)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x05f8
            goto L_0x05de
        L_0x05f8:
            r7.add(r8)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x05de
        L_0x05fc:
            r1 = r7
            goto L_0x05d2
        L_0x05fe:
            java.util.Set r1 = r6.A02     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r7 = X.C28353Dxz.A02(r7)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x0611
            r1.add(r7)     // Catch:{ Exception -> 0x06c4 }
        L_0x060d:
            r6.A02 = r1     // Catch:{ Exception -> 0x06c4 }
            goto L_0x06b5
        L_0x0611:
            java.util.HashSet r2 = X.C17880vN.A12()     // Catch:{ Exception -> 0x06c4 }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ Exception -> 0x06c4 }
        L_0x0619:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x06a1
            java.lang.String r1 = X.C17880vN.A0v(r12)     // Catch:{ Exception -> 0x06c4 }
            r11 = 64
            int r0 = r1.indexOf(r11)     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r10 = "."
            r9 = -1
            if (r0 == r9) goto L_0x0648
            java.lang.String r8 = X.BE6.A0p(r0, r1)     // Catch:{ Exception -> 0x06c4 }
            int r0 = r7.indexOf(r11)     // Catch:{ Exception -> 0x06c4 }
            if (r0 != r9) goto L_0x068f
            boolean r0 = r7.startsWith(r10)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x0643
            boolean r0 = X.C26279Cwa.A06(r8, r7)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x068c
        L_0x0643:
            boolean r0 = r8.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x068c
        L_0x0648:
            boolean r8 = r1.startsWith(r10)     // Catch:{ Exception -> 0x06c4 }
            int r0 = r7.indexOf(r11)     // Catch:{ Exception -> 0x06c4 }
            if (r8 == 0) goto L_0x0676
            if (r0 == r9) goto L_0x065e
            r0 = 0
            java.lang.String r0 = r7.substring(r0)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = X.C26279Cwa.A06(r0, r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0693
        L_0x065e:
            boolean r0 = r7.startsWith(r10)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x0671
            boolean r0 = X.C26279Cwa.A06(r1, r7)     // Catch:{ Exception -> 0x06c4 }
            if (r0 != 0) goto L_0x069c
            boolean r0 = r1.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x0671
            goto L_0x069c
        L_0x0671:
            boolean r0 = X.C26279Cwa.A06(r7, r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0693
        L_0x0676:
            if (r0 == r9) goto L_0x0682
            r0 = 0
            java.lang.String r0 = r7.substring(r0)     // Catch:{ Exception -> 0x06c4 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0693
        L_0x0682:
            boolean r0 = r7.startsWith(r10)     // Catch:{ Exception -> 0x06c4 }
            if (r0 == 0) goto L_0x068f
            boolean r0 = X.C26279Cwa.A06(r1, r7)     // Catch:{ Exception -> 0x06c4 }
        L_0x068c:
            if (r0 == 0) goto L_0x0699
            goto L_0x069c
        L_0x068f:
            boolean r0 = r1.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x06c4 }
        L_0x0693:
            if (r0 == 0) goto L_0x0699
            r2.add(r1)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0619
        L_0x0699:
            r2.add(r1)     // Catch:{ Exception -> 0x06c4 }
        L_0x069c:
            r2.add(r7)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x0619
        L_0x06a1:
            r1 = r2
            goto L_0x060d
        L_0x06a4:
            java.util.Set r2 = r6.A04     // Catch:{ Exception -> 0x06c4 }
            X.1Bx r0 = r7.A01     // Catch:{ Exception -> 0x06c4 }
            X.DxI r1 = X.C28310DxI.A01(r0)     // Catch:{ Exception -> 0x06c4 }
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r2)     // Catch:{ Exception -> 0x06c4 }
            r0.add(r1)     // Catch:{ Exception -> 0x06c4 }
            r6.A04 = r0     // Catch:{ Exception -> 0x06c4 }
        L_0x06b5:
            int r4 = r4 + 1
            goto L_0x0474
        L_0x06b9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r0 = "Unknown tag encountered: "
            java.lang.IllegalStateException r0 = X.AnonymousClass8BX.A0W(r0, r1, r2)     // Catch:{ Exception -> 0x06c4 }
            throw r0     // Catch:{ Exception -> 0x06c4 }
        L_0x06c4:
            r2 = move-exception
            java.lang.String r1 = "Excluded subtrees cannot be build from name constraints extension."
            r0 = r26
            X.Db2 r0 = X.C27275Db2.A00(r1, r2, r0, r3)
            throw r0
        L_0x06ce:
            return
        L_0x06cf:
            r2 = move-exception
            java.lang.String r1 = "Name constraints extension could not be decoded."
            r0 = r26
            X.Db2 r0 = X.C27275Db2.A00(r1, r2, r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26295Cx7.A0H(java.security.cert.CertPath, X.Cc2, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [X.DxU, java.lang.Object] */
    public static void A0I(CertPath certPath, C25261Cc2 cc2, int i, boolean z) {
        C29 c29;
        C28317DxP dxP;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate A0z = BE6.A0z(certificates, i);
        int size = certificates.size();
        int i2 = size - i;
        String str = C26284Cwf.A01;
        if (!BE9.A1W(A0z) || (i2 >= size && !z)) {
            try {
                C28339Dxl A052 = C28339Dxl.A05(C26068Cri.A02(A0z));
                try {
                    C26279Cwa cwa = cc2.A00;
                    cwa.A0B(C28324DxW.A01(A052));
                    try {
                        cwa.A0A(C28324DxW.A01(A052));
                        try {
                            AnonymousClass1Bz A053 = C26284Cwf.A05(A0C, A0z);
                            if (A053 != null) {
                                dxP = new C28317DxP(C28339Dxl.A05(A053));
                            } else {
                                dxP = null;
                            }
                            C28324DxW A012 = C28324DxW.A01(A052);
                            AnonymousClass1C0 r11 = C28374DyK.A0D;
                            C28307DxF[] dxFArr = A012.A02;
                            int length = dxFArr.length;
                            C28307DxF[] dxFArr2 = new C28307DxF[length];
                            int i3 = 0;
                            for (int i4 = 0; i4 != length; i4++) {
                                C28307DxF dxF = dxFArr[i4];
                                C28340Dxm dxm = dxF.A00;
                                int length2 = dxm.A00.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length2) {
                                        break;
                                    } else if (C28291Dwz.A01(dxm.A00[i5]).A01.A0J(r11)) {
                                        dxFArr2[i3] = dxF;
                                        i3++;
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (i3 < length) {
                                C28307DxF[] dxFArr3 = new C28307DxF[i3];
                                System.arraycopy(dxFArr2, 0, dxFArr3, 0, i3);
                                dxFArr2 = dxFArr3;
                            }
                            int i6 = 0;
                            int i7 = 0;
                            while (i7 != dxFArr2.length) {
                                String BZl = ((E74) dxFArr2[i7].A0D().A00).BZl();
                                ? obj = new Object();
                                obj.A00 = 1;
                                obj.A01 = new C28353Dxz(BZl);
                                try {
                                    cc2.A01(obj);
                                    cc2.A00(obj);
                                    i7++;
                                } catch (C29 e) {
                                    throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                                }
                            }
                            if (dxP != null) {
                                try {
                                    C28322DxU[] dxUArr = dxP.A00;
                                    int length3 = dxUArr.length;
                                    C28322DxU[] dxUArr2 = new C28322DxU[length3];
                                    System.arraycopy(dxUArr, 0, dxUArr2, 0, length3);
                                    while (i6 < length3) {
                                        try {
                                            cc2.A01(dxUArr2[i6]);
                                            cc2.A00(dxUArr2[i6]);
                                            i6++;
                                        } catch (C29 e2) {
                                            throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                        }
                                    }
                                } catch (Exception e3) {
                                    throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                                }
                            }
                        } catch (Exception e4) {
                            throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                        }
                    } catch (C1m e5) {
                        c29 = new C29(e5.getMessage(), e5);
                        throw c29;
                    }
                } catch (C1m e6) {
                    try {
                        c29 = new C29(e6.getMessage(), e6);
                        throw c29;
                    } catch (C29 e7) {
                        throw new CertPathValidatorException("Subtree check for certificate subject failed.", e7, certPath, i);
                    }
                }
            } catch (Exception e8) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e8, certPath, i);
            }
        }
    }

    public static void A0J(HashSet hashSet, List list, DZQ dzq) {
        C2W c2w = null;
        boolean z = false;
        for (Object next : list) {
            if (next instanceof DSI) {
                DSI dsi = (DSI) next;
                try {
                    ArrayList A13 = AnonymousClass000.A13();
                    for (Object next2 : dsi.A00) {
                        if (dzq.Bj5(next2)) {
                            A13.add(next2);
                        }
                    }
                    hashSet.addAll(A13);
                } catch (DZW e) {
                    c2w = C2W.A01("Exception searching in X.509 CRL store.", e);
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) next).getCRLs(new C27281DbA(dzq)));
                } catch (CertStoreException e2) {
                    c2w = C2W.A01("Exception searching in X.509 CRL store.", e2);
                }
            }
            z = true;
        }
        if (!z && c2w != null) {
            throw c2w;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.DxU[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: X.DxU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.DxU[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.DxU[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.DxU[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.DxU[]} */
    /* JADX WARNING: type inference failed for: r0v151, types: [X.DxU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v46, types: [X.DxU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v16, types: [X.DxU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, X.Cp7] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r0 = r12.A0B;
        r22 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x027c, code lost:
        if (r0 == false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x027e, code lost:
        r2 = r25.getCertStores();
        r4 = new java.security.cert.X509CRLSelector();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r4.addIssuerName(X.C26068Cri.A03(r9.getIssuerX500Principal()).A0B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r0 = X.C26284Cwf.A05(X.C26284Cwf.A00, r9);
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029d, code lost:
        if (r0 == null) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x029f, code lost:
        r1 = new java.math.BigInteger(1, X.C28337Dxj.A02(r0).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02ac, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r21 = r9.getExtensionValue(X.C26284Cwf.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02b3, code lost:
        if (r1 == null) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r5 = r1.add(java.math.BigInteger.valueOf(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02bf, code lost:
        r4.setMinCRLNumber(r5);
        r0 = new X.C24981CSg(r4);
        r0.A03 = X.AnonymousClass1C2.A02(r21);
        r0.A02 = true;
        r0.A00 = r1;
        r7 = new X.DZQ(r0);
        r17 = A05(r14, r2, r24, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02e1, code lost:
        if (r17.isEmpty() == false) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e9, code lost:
        if (X.C25917Cob.A01("org.spongycastle.x509.enableCRLDP") == false) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r16 = java.security.cert.CertificateFactory.getInstance("X.509", ((X.DZI) r35).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r5 = X.C28308DxG.A01(r21).A0D();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0301, code lost:
        if (r4 >= r5.length) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0303, code lost:
        r1 = r5[r4].A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0307, code lost:
        if (r1 == null) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x030b, code lost:
        if (r1.A00 != 0) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x030d, code lost:
        r3 = X.C28317DxP.A01(r1.A01);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0315, code lost:
        if (r2 >= r3.length) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0317, code lost:
        r1 = r3[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031c, code lost:
        if (r1.A00 != 6) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        r17 = A05(r14, java.util.Collections.EMPTY_LIST, java.util.Collections.singletonList(X.C26085Cs2.A01(new java.net.URI(((X.E74) r1.A01).BZl()), r16, r14)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x033f, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0342, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r0 = X.C2W.A01(X.C17900vP.A0C("cannot create certificate factory: ", X.AnonymousClass000.A10(), r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0353, code lost:
        r2 = X.C17880vN.A12();
        r4 = r17.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x035f, code lost:
        if (r4.hasNext() == false) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0361, code lost:
        r1 = (java.security.cert.X509CRL) r4.next();
        r3 = r1.getCriticalExtensionOIDs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x036b, code lost:
        if (r3 == null) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0373, code lost:
        if (r3.contains(A05) == false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0375, code lost:
        r2.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0379, code lost:
        r3 = r2.iterator();
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0391, code lost:
        if (r1 != null) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0393, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        r0 = X.C2W.A01("Cannot verify delta CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x039d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x039e, code lost:
        r0 = X.C2W.A01("Issuing distribution point extension value could not be read.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03a7, code lost:
        r0 = X.C2W.A01("CRL number extension could not be extracted from CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03af, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03b0, code lost:
        r0 = X.C2W.A01("Cannot extract issuer from CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03b8, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03bc, code lost:
        if (r12.A00 == 1) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03d0, code lost:
        if (r20.getNotAfter().getTime() >= r9.getThisUpdate().getTime()) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03d2, code lost:
        r4 = X.C2W.A00("No valid CRL for current time found.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03d9, code lost:
        r0 = X.C26284Cwf.A05(r8, r9);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03de, code lost:
        if (r0 == null) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03e0, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03e7, code lost:
        if (X.C28306DxE.A01(r0).A03 != false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03e9, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r2 = X.C26068Cri.A03(r9.getIssuerX500Principal()).A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        r0 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03f8, code lost:
        if (r0 == null) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03fa, code lost:
        r4 = r0.A00;
        r0 = r4.length;
        r1 = new X.C28322DxU[r0];
        java.lang.System.arraycopy(r4, 0, r1, 0, r0);
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0404, code lost:
        if (r3 >= r1.length) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x040b, code lost:
        if (r1[r3].A00 != 4) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x041d, code lost:
        if (java.util.Arrays.equals(r1[r3].A01.CP9().A0B(), r2) == false) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x041f, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0420, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0423, code lost:
        if (r5 == false) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0425, code lost:
        if (r6 != false) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0439, code lost:
        if (X.C26068Cri.A03(r9.getIssuerX500Principal()).equals(X.C26068Cri.A00(r20)) != false) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x043b, code lost:
        r0 = X.C2W.A00("Cannot find matching CRL issuer for certificate.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        r6 = X.C28306DxE.A01(X.C26284Cwf.A05(r8, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x044b, code lost:
        if (r6 == null) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x044f, code lost:
        if (r6.A01 == null) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0451, code lost:
        r3 = X.C28306DxE.A01(r6).A01;
        r5 = X.AnonymousClass000.A13();
        r2 = r3.A00;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x045e, code lost:
        if (r2 != 0) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0460, code lost:
        r1 = X.C28317DxP.A01(r3.A01);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0468, code lost:
        if (r0 >= r1.length) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x046a, code lost:
        r5.add(r1[r0]);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0473, code lost:
        if (r2 != 1) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0475, code lost:
        r2 = new X.C26135Csy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        r15 = X.C28339Dxl.A05(X.C26068Cri.A03(r9.getIssuerX500Principal())).A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x048e, code lost:
        if (r15.hasMoreElements() == false) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0490, code lost:
        r2.A02((X.AnonymousClass1Bx) r15.nextElement());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        r1 = X.C28324DxW.A01(X.C28339Dxl.A07(r3.A01, r2));
        r2 = new java.lang.Object();
        r2.A01 = r1;
        r2.A00 = 4;
        r5.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04b1, code lost:
        r3 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04b5, code lost:
        if (r3 == null) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04b7, code lost:
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04b9, code lost:
        if (r1 != 0) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04bb, code lost:
        r2 = X.C28317DxP.A01(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04c2, code lost:
        if (r4 >= r2.length) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04ca, code lost:
        if (r5.contains(r2[r4]) != false) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04cc, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04cf, code lost:
        if (r1 != 1) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04d1, code lost:
        r1 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04d3, code lost:
        if (r1 == null) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04d5, code lost:
        r1 = r1.A00;
        r0 = r1.length;
        r2 = new X.C28322DxU[r0];
        java.lang.System.arraycopy(r1, 0, r2, 0, r0);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04de, code lost:
        r2 = new X.C28322DxU[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        r0 = X.C26068Cri.A00(r20);
        r1 = new java.lang.Object();
        r1.A01 = r0;
        r1.A00 = 4;
        r2[0] = r1;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04f0, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:?, code lost:
        r0 = r2.length;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04f2, code lost:
        if (r1 >= r0) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x04f4, code lost:
        r16 = X.C28339Dxl.A05(r2[r1].A01.CP9()).A0L();
        r15 = new X.C26135Csy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x050d, code lost:
        if (r16.hasMoreElements() == false) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x050f, code lost:
        r15.A02((X.AnonymousClass1Bx) r16.nextElement());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0519, code lost:
        r15 = X.C28324DxW.A01(X.C28339Dxl.A07(r3.A01, r15));
        r0 = new java.lang.Object();
        r0.A01 = r15;
        r0.A00 = 4;
        r2[r1] = r0;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0532, code lost:
        r4 = X.C2W.A01("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x053b, code lost:
        r0 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x053d, code lost:
        if (r0 == null) goto L_0x0689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x053f, code lost:
        r2 = r0.A00;
        r0 = r2.length;
        r1 = new X.C28322DxU[r0];
        java.lang.System.arraycopy(r2, 0, r1, 0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0548, code lost:
        if (r4 >= r1.length) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0550, code lost:
        if (r5.contains(r1[r4]) != false) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0552, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0555, code lost:
        r4 = X.C2W.A01("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:?, code lost:
        r1 = X.C28301Dx9.A01(X.C26284Cwf.A05(A02, r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x056a, code lost:
        if (r27 == null) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x056e, code lost:
        if (r6.A06 == false) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0570, code lost:
        if (r1 == null) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0572, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0574, code lost:
        if (r0 == null) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0578, code lost:
        if (r0.A00 == 0) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x057a, code lost:
        r0 = X.C2W.A00("CA Cert CRL only contains user certificates.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0584, code lost:
        if (r6.A05 == false) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0586, code lost:
        if (r1 == null) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0588, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x058a, code lost:
        if (r0 == null) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x058e, code lost:
        if (r0.A00 == 0) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0592, code lost:
        if (r6.A04 == false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0594, code lost:
        r0 = X.C2W.A00("onlyContainsAttributeCerts boolean is asserted.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x059c, code lost:
        if (r7 == null) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05a2, code lost:
        if (r7.hasUnsupportedCriticalExtension() != false) goto L_0x06e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:?, code lost:
        r2 = X.C28306DxE.A01(X.C26284Cwf.A05(r8, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05ac, code lost:
        if (r22 == false) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05c2, code lost:
        if (X.C26068Cri.A03(r7.getIssuerX500Principal()).equals(X.C26068Cri.A03(r9.getIssuerX500Principal())) == false) goto L_0x06d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        r0 = X.C28306DxE.A01(X.C26284Cwf.A05(r8, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05cc, code lost:
        if (r2 != null) goto L_0x05d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05ce, code lost:
        if (r0 != null) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05d5, code lost:
        if (r2.equals(r0) == false) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        r0 = A01;
        r1 = X.C26284Cwf.A05(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        r0 = X.C26284Cwf.A05(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x05e1, code lost:
        if (r1 == null) goto L_0x06aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05e3, code lost:
        if (r0 == null) goto L_0x06a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05e9, code lost:
        if (r1.A0J(r0) == false) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x05eb, code lost:
        X.C26284Cwf.A07(r20, r7, r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x05f4, code lost:
        if (r11.A00 != 11) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x05f6, code lost:
        X.C26284Cwf.A07(r20, r9, r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05ff, code lost:
        if (r11.A00 != 8) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0601, code lost:
        r11.A00 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0605, code lost:
        r37.A00 = r10.A00 | r37.A00;
        r0 = r9.getCriticalExtensionOIDs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0614, code lost:
        if (r0 == null) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0616, code lost:
        r1 = X.AnonymousClass8BR.A12(r0);
        r1.remove(X.C28314DxM.A0K.A01);
        r1.remove(X.C28314DxM.A0C.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x062c, code lost:
        if (r1.isEmpty() != false) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x062e, code lost:
        r4 = X.C2W.A00("CRL contains unsupported critical extensions.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0636, code lost:
        if (r7 == null) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0638, code lost:
        r0 = r7.getCriticalExtensionOIDs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x063c, code lost:
        if (r0 == null) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x063e, code lost:
        r1 = X.AnonymousClass8BR.A12(r0);
        r1.remove(X.C28314DxM.A0K.A01);
        r1.remove(X.C28314DxM.A0C.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0654, code lost:
        if (r1.isEmpty() != false) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0656, code lost:
        r4 = X.C2W.A00("Delta CRL contains unsupported critical extension.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x065e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x065f, code lost:
        r0 = X.C2W.A01("CRL issuer information from distribution point cannot be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0667, code lost:
        r0 = X.C2W.A00("Distribution point contains cRLIssuer field but CRL is not indirect.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x066f, code lost:
        r0 = X.C2W.A00("CRL issuer of CRL does not match CRL issuer of distribution point.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0677, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0678, code lost:
        r0 = X.C2W.A01("Could not read CRL issuer.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0680, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0681, code lost:
        r0 = X.C2W.A01("Could not read certificate issuer.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0689, code lost:
        r0 = X.C2W.A00("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0691, code lost:
        r0 = X.C2W.A00("End CRL only contains CA certificates.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0699, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x069a, code lost:
        r0 = X.C2W.A01("Basic constraints extension could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06a2, code lost:
        r0 = X.C2W.A00("Delta CRL authority key identifier is null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06aa, code lost:
        r0 = X.C2W.A00("CRL authority key identifier is null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x06b2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06b3, code lost:
        r0 = X.C2W.A01("Authority key identifier extension could not be extracted from delta CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06ba, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06bb, code lost:
        r0 = X.C2W.A01("Authority key identifier extension could not be extracted from complete CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x06c2, code lost:
        r0 = X.C2W.A00("Issuing distribution point extension from delta CRL and complete CRL does not match.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06c9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06ca, code lost:
        r0 = X.C2W.A01("Issuing distribution point extension from delta CRL could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x06d1, code lost:
        r0 = X.C2W.A00("Complete CRL issuer does not match delta CRL issuer.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x06d8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x06d9, code lost:
        r0 = X.C2W.A01("Issuing distribution point extension could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x06e0, code lost:
        r0 = X.C2W.A00("delta CRL has unsupported critical extensions");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x06e7, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x06eb, code lost:
        r0 = X.C2W.A00("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06f2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06f3, code lost:
        r0 = X.C2W.A01("Issuing distribution point extension could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x06fa, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x06fb, code lost:
        r0 = X.C2W.A01(X.C17900vP.A0C("Exception encoding CRL issuer: ", X.AnonymousClass000.A10(), r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0736, code lost:
        r23 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x00dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f A[Catch:{ C2W -> 0x0736 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(java.security.PublicKey r26, java.security.cert.X509Certificate r27, java.security.cert.X509Certificate r28, java.util.Date r29, java.util.Date r30, java.util.List r31, X.C28285Dwt r32, X.C25597Cic r33, X.DU9 r34, X.E3R r35, X.COn r36, X.C25941Cp7 r37) {
        /*
            r14 = r30
            long r3 = r14.getTime()
            long r1 = r29.getTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0753
            java.lang.String r0 = X.C26284Cwf.A01
            java.security.cert.X509CRLSelector r2 = new java.security.cert.X509CRLSelector
            r2.<init>()
            java.util.HashSet r1 = X.C17880vN.A12()     // Catch:{ C2W -> 0x074b }
            r20 = r27
            X.DxW r0 = X.C26068Cri.A00(r20)     // Catch:{ C2W -> 0x074b }
            java.util.ArrayList r3 = X.BE8.A0n(r0, r1)     // Catch:{ C2W -> 0x074b }
            r13 = r32
            X.DxP r0 = r13.A01     // Catch:{ C2W -> 0x074b }
            if (r0 == 0) goto L_0x0053
            X.DxU[] r4 = r0.A00     // Catch:{ C2W -> 0x074b }
            int r1 = r4.length     // Catch:{ C2W -> 0x074b }
            X.DxU[] r5 = new X.C28322DxU[r1]     // Catch:{ C2W -> 0x074b }
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r5, r0, r1)     // Catch:{ C2W -> 0x074b }
            r4 = 0
        L_0x0033:
            int r0 = r5.length     // Catch:{ C2W -> 0x074b }
            if (r4 >= r0) goto L_0x0065
            r0 = r5[r4]     // Catch:{ C2W -> 0x074b }
            int r1 = r0.A00     // Catch:{ C2W -> 0x074b }
            r0 = 4
            if (r1 != r0) goto L_0x0050
            r0 = r5[r4]     // Catch:{ IOException -> 0x0743 }
            X.1Bx r0 = r0.A01     // Catch:{ IOException -> 0x0743 }
            X.1Bz r0 = r0.CP9()     // Catch:{ IOException -> 0x0743 }
            byte[] r0 = r0.A0B()     // Catch:{ IOException -> 0x0743 }
            X.DxW r0 = X.C28324DxW.A01(r0)     // Catch:{ IOException -> 0x0743 }
            r3.add(r0)     // Catch:{ IOException -> 0x0743 }
        L_0x0050:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0053:
            X.DxT r0 = r13.A00     // Catch:{ C2W -> 0x074b }
            if (r0 == 0) goto L_0x073c
            java.util.Iterator r1 = r1.iterator()     // Catch:{ C2W -> 0x074b }
        L_0x005b:
            boolean r0 = r1.hasNext()     // Catch:{ C2W -> 0x074b }
            if (r0 == 0) goto L_0x0065
            X.BE7.A1R(r3, r1)     // Catch:{ C2W -> 0x074b }
            goto L_0x005b
        L_0x0065:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ C2W -> 0x074b }
        L_0x0069:
            boolean r0 = r1.hasNext()     // Catch:{ C2W -> 0x074b }
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x007d }
            X.1By r0 = (X.AnonymousClass1By) r0     // Catch:{ IOException -> 0x007d }
            byte[] r0 = r0.A0B()     // Catch:{ IOException -> 0x007d }
            r2.addIssuerName(r0)     // Catch:{ IOException -> 0x007d }
            goto L_0x0069
        L_0x007d:
            r1 = move-exception
            java.lang.String r0 = "Cannot decode CRL issuer information."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x074b }
            goto L_0x074a
        L_0x0086:
            if (r27 == 0) goto L_0x008d
            r0 = r20
            r2.setCertificateChecking(r0)
        L_0x008d:
            X.CSg r1 = new X.CSg
            r1.<init>(r2)
            r0 = 1
            r1.A01 = r0
            X.DZQ r2 = new X.DZQ
            r2.<init>(r1)
            r12 = r34
            java.security.cert.PKIXParameters r0 = r12.A01
            r25 = r0
            java.util.List r1 = r25.getCertStores()
            java.util.List r0 = r12.A04
            r24 = r0
            java.util.HashSet r1 = A05(r14, r1, r0, r2)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00d4
            java.lang.String r3 = "\""
            java.lang.String r0 = "No CRLs found for issuer \""
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r0)
            X.CZY r1 = X.C28372DyI.A0j
            X.DxW r0 = X.C26068Cri.A01(r20)
            java.lang.String r0 = r1.A01(r0)
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r3, r2)
            r0 = r33
            java.security.cert.CertPath r2 = r0.A02
            int r1 = r0.A00
            X.Db1 r0 = new X.Db1
            r0.<init>(r3, r2, r1)
            throw r0
        L_0x00d4:
            java.util.Iterator r19 = r1.iterator()
            r23 = 0
            r18 = 0
        L_0x00dc:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0739
            r11 = r36
            int r1 = r11.A00
            r0 = 11
            if (r1 != r0) goto L_0x0739
            r0 = r37
            int r1 = r0.A00
            X.Cp7 r10 = X.C25941Cp7.A01
            int r0 = r10.A00
            if (r1 == r0) goto L_0x0739
            java.lang.Object r9 = r19.next()     // Catch:{ C2W -> 0x0736 }
            java.security.cert.X509CRL r9 = (java.security.cert.X509CRL) r9     // Catch:{ C2W -> 0x0736 }
            java.lang.String r8 = A07     // Catch:{ Exception -> 0x0726 }
            X.1Bz r0 = X.C26284Cwf.A05(r8, r9)     // Catch:{ Exception -> 0x0726 }
            X.DxE r2 = X.C28306DxE.A01(r0)     // Catch:{ Exception -> 0x0726 }
            if (r2 == 0) goto L_0x0107
            goto L_0x0114
        L_0x0107:
            X.DyB r0 = r13.A02     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0135
            X.Cp7 r1 = new X.Cp7     // Catch:{ C2W -> 0x0736 }
            r1.<init>(r0)     // Catch:{ C2W -> 0x0736 }
            if (r2 != 0) goto L_0x0146
            r2 = r10
            goto L_0x0126
        L_0x0114:
            X.DyB r3 = r2.A02     // Catch:{ C2W -> 0x0736 }
            if (r3 == 0) goto L_0x0107
            X.DyB r0 = r13.A02     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0145
            X.Cp7 r1 = new X.Cp7     // Catch:{ C2W -> 0x0736 }
            r1.<init>(r0)     // Catch:{ C2W -> 0x0736 }
        L_0x0121:
            X.Cp7 r2 = new X.Cp7     // Catch:{ C2W -> 0x0736 }
            r2.<init>(r3)     // Catch:{ C2W -> 0x0736 }
        L_0x0126:
            r0 = 0
            X.Cp7 r10 = new X.Cp7     // Catch:{ C2W -> 0x0736 }
            r10.<init>()     // Catch:{ C2W -> 0x0736 }
            r10.A00 = r0     // Catch:{ C2W -> 0x0736 }
            int r1 = r1.A00     // Catch:{ C2W -> 0x0736 }
            int r0 = r2.A00     // Catch:{ C2W -> 0x0736 }
            r0 = r0 & r1
            r10.A00 = r0     // Catch:{ C2W -> 0x0736 }
        L_0x0135:
            int r1 = r10.A00     // Catch:{ C2W -> 0x0736 }
            r0 = r37
            int r0 = r0.A00     // Catch:{ C2W -> 0x0736 }
            r0 = r0 ^ r1
            r0 = r0 | r1
            if (r0 == 0) goto L_0x00dc
            java.security.cert.X509CertSelector r1 = new java.security.cert.X509CertSelector     // Catch:{ C2W -> 0x0736 }
            r1.<init>()     // Catch:{ C2W -> 0x0736 }
            goto L_0x0149
        L_0x0145:
            r1 = r10
        L_0x0146:
            X.DyB r3 = r2.A02     // Catch:{ C2W -> 0x0736 }
            goto L_0x0121
        L_0x0149:
            if (r9 == 0) goto L_0x0719
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ IOException -> 0x071e }
            X.DxW r0 = X.C26068Cri.A03(r0)     // Catch:{ IOException -> 0x071e }
            byte[] r0 = r0.A0B()     // Catch:{ IOException -> 0x071e }
            r1.setSubject(r0)     // Catch:{ IOException -> 0x071e }
            X.CMI r0 = new X.CMI     // Catch:{ C2W -> 0x0736 }
            r0.<init>(r1)     // Catch:{ C2W -> 0x0736 }
            java.security.cert.CertSelector r0 = r0.A00     // Catch:{ C2W -> 0x0736 }
            X.DZP r2 = new X.DZP     // Catch:{ C2W -> 0x0736 }
            r2.<init>(r0)     // Catch:{ C2W -> 0x0736 }
            java.util.LinkedHashSet r1 = X.C17880vN.A14()     // Catch:{ C2W -> 0x0736 }
            java.util.List r0 = r12.A05     // Catch:{ C2W -> 0x0711 }
            X.C26284Cwf.A09(r1, r0, r2)     // Catch:{ C2W -> 0x0711 }
            java.util.List r0 = r25.getCertStores()     // Catch:{ C2W -> 0x0711 }
            X.C26284Cwf.A09(r1, r0, r2)     // Catch:{ C2W -> 0x0711 }
            r0 = r28
            r1.add(r0)     // Catch:{ C2W -> 0x0736 }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ C2W -> 0x0736 }
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ C2W -> 0x0736 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ C2W -> 0x0736 }
        L_0x0187:
            boolean r0 = r16.hasNext()     // Catch:{ C2W -> 0x0736 }
            r5 = 0
            if (r0 == 0) goto L_0x0219
            java.lang.Object r4 = r16.next()     // Catch:{ C2W -> 0x0736 }
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch:{ C2W -> 0x0736 }
            r0 = r28
            boolean r0 = r4.equals(r0)     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x01a5
            r7.add(r4)     // Catch:{ C2W -> 0x0736 }
            r0 = r26
            r6.add(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0187
        L_0x01a5:
            java.lang.Class r0 = A00     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r3 = 1
            if (r0 == 0) goto L_0x01ff
            X.Db0 r2 = new X.Db0     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r2.<init>(r3)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
        L_0x01af:
            java.security.cert.X509CertSelector r15 = new java.security.cert.X509CertSelector     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r15.<init>()     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r15.setCertificate(r4)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            X.CpU r1 = new X.CpU     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r1.<init>((X.DU9) r12)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            X.CMI r0 = new X.CMI     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r0.<init>(r15)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            java.security.cert.CertSelector r15 = r0.A00     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            X.DZP r0 = new X.DZP     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r0.<init>(r15)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r1.A06 = r0     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r0 = r31
            boolean r0 = r0.contains(r4)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            if (r0 == 0) goto L_0x01fc
            r1.A07 = r5     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
        L_0x01d4:
            X.DU9 r0 = new X.DU9     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r0.<init>(r1)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            X.Ci2 r1 = new X.Ci2     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r1.<init>((X.DU9) r0)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            X.DU8 r0 = new X.DU8     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r0.<init>(r1)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            java.security.cert.CertPathBuilderResult r0 = r2.engineBuild(r0)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            java.security.cert.CertPath r0 = r0.getCertPath()     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            java.util.List r0 = r0.getCertificates()     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r7.add(r4)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r1 = r35
            java.security.PublicKey r0 = X.C26284Cwf.A00(r0, r1, r5)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r6.add(r0)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            goto L_0x0187
        L_0x01fc:
            r1.A07 = r3     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            goto L_0x01d4
        L_0x01ff:
            X.Daz r2 = new X.Daz     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            r2.<init>(r3)     // Catch:{ CertPathBuilderException -> 0x0210, CertPathValidatorException -> 0x072e, Exception -> 0x0205 }
            goto L_0x01af
        L_0x0205:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ C2W -> 0x0736 }
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0210:
            r1 = move-exception
            java.lang.String r0 = "CertPath for CRL signer failed to validate."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0219:
            java.util.HashSet r3 = X.C17880vN.A12()     // Catch:{ C2W -> 0x0736 }
            r4 = 0
        L_0x021e:
            int r0 = r7.size()     // Catch:{ C2W -> 0x0736 }
            if (r5 >= r0) goto L_0x0249
            java.lang.Object r0 = r7.get(r5)     // Catch:{ C2W -> 0x0736 }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ C2W -> 0x0736 }
            boolean[] r2 = r0.getKeyUsage()     // Catch:{ C2W -> 0x0736 }
            if (r2 == 0) goto L_0x023f
            int r1 = r2.length     // Catch:{ C2W -> 0x0736 }
            r0 = 6
            if (r1 <= r0) goto L_0x0238
            boolean r0 = r2[r0]     // Catch:{ C2W -> 0x0736 }
            if (r0 != 0) goto L_0x023f
        L_0x0238:
            java.lang.String r0 = "Issuer certificate key usage extension does not permit CRL signing."
            X.C2W r4 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0246
        L_0x023f:
            java.lang.Object r0 = r6.get(r5)     // Catch:{ C2W -> 0x0736 }
            r3.add(r0)     // Catch:{ C2W -> 0x0736 }
        L_0x0246:
            int r5 = r5 + 1
            goto L_0x021e
        L_0x0249:
            boolean r0 = r3.isEmpty()     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0259
            if (r4 != 0) goto L_0x0259
            java.lang.String r0 = "Cannot find a valid issuer certificate."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0259:
            boolean r0 = r3.isEmpty()     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0261
            if (r4 != 0) goto L_0x03d8
        L_0x0261:
            java.util.Iterator r2 = r3.iterator()     // Catch:{ C2W -> 0x0736 }
            r1 = 0
        L_0x0266:
            boolean r0 = r2.hasNext()     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x070a
            java.lang.Object r6 = r2.next()     // Catch:{ C2W -> 0x0736 }
            java.security.PublicKey r6 = (java.security.PublicKey) r6     // Catch:{ C2W -> 0x0736 }
            r9.verify(r6)     // Catch:{ Exception -> 0x0276 }
            goto L_0x0278
        L_0x0276:
            r1 = move-exception
            goto L_0x0266
        L_0x0278:
            boolean r0 = r12.A0B     // Catch:{ C2W -> 0x0736 }
            r22 = r0
            if (r0 == 0) goto L_0x03b8
            java.util.List r2 = r25.getCertStores()     // Catch:{ C2W -> 0x0736 }
            java.security.cert.X509CRLSelector r4 = new java.security.cert.X509CRLSelector     // Catch:{ C2W -> 0x0736 }
            r4.<init>()     // Catch:{ C2W -> 0x0736 }
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ IOException -> 0x03af }
            X.DxW r0 = X.C26068Cri.A03(r0)     // Catch:{ IOException -> 0x03af }
            byte[] r0 = r0.A0B()     // Catch:{ IOException -> 0x03af }
            r4.addIssuerName(r0)     // Catch:{ IOException -> 0x03af }
            java.lang.String r0 = X.C26284Cwf.A00     // Catch:{ Exception -> 0x03a6 }
            X.1Bz r0 = X.C26284Cwf.A05(r0, r9)     // Catch:{ Exception -> 0x03a6 }
            r5 = 0
            if (r0 == 0) goto L_0x02ac
            X.Dxj r0 = X.C28337Dxj.A02(r0)     // Catch:{ Exception -> 0x03a6 }
            r3 = 1
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x03a6 }
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ Exception -> 0x03a6 }
            r1.<init>(r3, r0)     // Catch:{ Exception -> 0x03a6 }
            goto L_0x02ad
        L_0x02ac:
            r1 = r5
        L_0x02ad:
            java.lang.String r0 = X.C26284Cwf.A01     // Catch:{ Exception -> 0x039d }
            byte[] r21 = r9.getExtensionValue(r0)     // Catch:{ Exception -> 0x039d }
            if (r1 == 0) goto L_0x02bf
            r15 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r15)     // Catch:{ C2W -> 0x0736 }
            java.math.BigInteger r5 = r1.add(r0)     // Catch:{ C2W -> 0x0736 }
        L_0x02bf:
            r4.setMinCRLNumber(r5)     // Catch:{ C2W -> 0x0736 }
            X.CSg r0 = new X.CSg     // Catch:{ C2W -> 0x0736 }
            r0.<init>(r4)     // Catch:{ C2W -> 0x0736 }
            byte[] r3 = X.AnonymousClass1C2.A02(r21)     // Catch:{ C2W -> 0x0736 }
            r0.A03 = r3     // Catch:{ C2W -> 0x0736 }
            r3 = 1
            r0.A02 = r3     // Catch:{ C2W -> 0x0736 }
            r0.A00 = r1     // Catch:{ C2W -> 0x0736 }
            X.DZQ r7 = new X.DZQ     // Catch:{ C2W -> 0x0736 }
            r7.<init>(r0)     // Catch:{ C2W -> 0x0736 }
            r0 = r24
            java.util.HashSet r17 = A05(r14, r2, r0, r7)     // Catch:{ C2W -> 0x0736 }
            boolean r0 = r17.isEmpty()     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0353
            java.lang.String r0 = "org.spongycastle.x509.enableCRLDP"
            boolean r0 = X.C25917Cob.A01(r0)     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0353
            java.lang.String r1 = "X.509"
            r0 = r35
            X.DZI r0 = (X.DZI) r0     // Catch:{ Exception -> 0x0342 }
            java.security.Provider r0 = r0.A00     // Catch:{ Exception -> 0x0342 }
            java.security.cert.CertificateFactory r16 = java.security.cert.CertificateFactory.getInstance(r1, r0)     // Catch:{ Exception -> 0x0342 }
            X.DxG r0 = X.C28308DxG.A01(r21)     // Catch:{ C2W -> 0x0736 }
            X.Dwt[] r5 = r0.A0D()     // Catch:{ C2W -> 0x0736 }
            r4 = 0
        L_0x0300:
            int r0 = r5.length     // Catch:{ C2W -> 0x0736 }
            if (r4 >= r0) goto L_0x0353
            r0 = r5[r4]     // Catch:{ C2W -> 0x0736 }
            X.DxT r1 = r0.A00     // Catch:{ C2W -> 0x0736 }
            if (r1 == 0) goto L_0x033f
            int r0 = r1.A00     // Catch:{ C2W -> 0x0736 }
            if (r0 != 0) goto L_0x033f
            X.1Bx r0 = r1.A01     // Catch:{ C2W -> 0x0736 }
            X.DxU[] r3 = X.C28317DxP.A01(r0)     // Catch:{ C2W -> 0x0736 }
            r2 = 0
        L_0x0314:
            int r0 = r3.length     // Catch:{ C2W -> 0x0736 }
            if (r2 >= r0) goto L_0x033f
            r1 = r3[r4]     // Catch:{ C2W -> 0x0736 }
            int r15 = r1.A00     // Catch:{ C2W -> 0x0736 }
            r0 = 6
            if (r15 != r0) goto L_0x033c
            X.1Bx r0 = r1.A01     // Catch:{ Exception -> 0x033c }
            X.E74 r0 = (X.E74) r0     // Catch:{ Exception -> 0x033c }
            java.lang.String r0 = r0.BZl()     // Catch:{ Exception -> 0x033c }
            java.net.URI r1 = new java.net.URI     // Catch:{ Exception -> 0x033c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x033c }
            r0 = r16
            X.DSI r0 = X.C26085Cs2.A01(r1, r0, r14)     // Catch:{ Exception -> 0x033c }
            java.util.List r1 = java.util.Collections.EMPTY_LIST     // Catch:{ Exception -> 0x033c }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ Exception -> 0x033c }
            java.util.HashSet r17 = A05(r14, r1, r0, r7)     // Catch:{ Exception -> 0x033c }
            goto L_0x033f
        L_0x033c:
            int r2 = r2 + 1
            goto L_0x0314
        L_0x033f:
            int r4 = r4 + 1
            goto L_0x0300
        L_0x0342:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C2W -> 0x0736 }
            java.lang.String r0 = "cannot create certificate factory: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)     // Catch:{ C2W -> 0x0736 }
            X.C2W r0 = X.C2W.A01(r0, r2)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0353:
            java.util.HashSet r2 = X.C17880vN.A12()     // Catch:{ C2W -> 0x0736 }
            java.util.Iterator r4 = r17.iterator()     // Catch:{ C2W -> 0x0736 }
        L_0x035b:
            boolean r0 = r4.hasNext()     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0379
            java.lang.Object r1 = r4.next()     // Catch:{ C2W -> 0x0736 }
            java.security.cert.X509CRL r1 = (java.security.cert.X509CRL) r1     // Catch:{ C2W -> 0x0736 }
            java.util.Set r3 = r1.getCriticalExtensionOIDs()     // Catch:{ C2W -> 0x0736 }
            if (r3 == 0) goto L_0x035b
            java.lang.String r0 = A05     // Catch:{ C2W -> 0x0736 }
            boolean r0 = r3.contains(r0)     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x035b
            r2.add(r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x035b
        L_0x0379:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ C2W -> 0x0736 }
            r2 = 0
            r1 = r2
        L_0x037f:
            boolean r0 = r3.hasNext()     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0391
            java.lang.Object r7 = r3.next()     // Catch:{ C2W -> 0x0736 }
            java.security.cert.X509CRL r7 = (java.security.cert.X509CRL) r7     // Catch:{ C2W -> 0x0736 }
            r7.verify(r6)     // Catch:{ Exception -> 0x038f }
            goto L_0x03b9
        L_0x038f:
            r1 = move-exception
            goto L_0x037f
        L_0x0391:
            if (r1 != 0) goto L_0x0395
            r7 = r2
            goto L_0x03b9
        L_0x0395:
            java.lang.String r0 = "Cannot verify delta CRL."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x039d:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension value could not be read."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x03a6:
            r1 = move-exception
            java.lang.String r0 = "CRL number extension could not be extracted from CRL."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x03af:
            r1 = move-exception
            java.lang.String r0 = "Cannot extract issuer from CRL."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x03b8:
            r7 = 0
        L_0x03b9:
            int r1 = r12.A00     // Catch:{ C2W -> 0x0736 }
            r0 = 1
            if (r1 == r0) goto L_0x03d9
            java.util.Date r0 = r20.getNotAfter()     // Catch:{ C2W -> 0x0736 }
            long r3 = r0.getTime()     // Catch:{ C2W -> 0x0736 }
            java.util.Date r0 = r9.getThisUpdate()     // Catch:{ C2W -> 0x0736 }
            long r1 = r0.getTime()     // Catch:{ C2W -> 0x0736 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03d9
            java.lang.String r0 = "No valid CRL for current time found."
            X.C2W r4 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
        L_0x03d8:
            throw r4     // Catch:{ C2W -> 0x0736 }
        L_0x03d9:
            X.1Bz r0 = X.C26284Cwf.A05(r8, r9)     // Catch:{ C2W -> 0x0736 }
            r3 = 0
            if (r0 == 0) goto L_0x03e9
            X.DxE r0 = X.C28306DxE.A01(r0)     // Catch:{ C2W -> 0x0736 }
            boolean r0 = r0.A03     // Catch:{ C2W -> 0x0736 }
            r6 = 1
            if (r0 != 0) goto L_0x03ea
        L_0x03e9:
            r6 = 0
        L_0x03ea:
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ IOException -> 0x06fa }
            X.DxW r0 = X.C26068Cri.A03(r0)     // Catch:{ IOException -> 0x06fa }
            byte[] r2 = r0.A0B()     // Catch:{ IOException -> 0x06fa }
            X.DxP r0 = r13.A01     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0429
            X.DxU[] r4 = r0.A00     // Catch:{ C2W -> 0x0736 }
            int r0 = r4.length     // Catch:{ C2W -> 0x0736 }
            X.DxU[] r1 = new X.C28322DxU[r0]     // Catch:{ C2W -> 0x0736 }
            java.lang.System.arraycopy(r4, r3, r1, r3, r0)     // Catch:{ C2W -> 0x0736 }
            r5 = 0
        L_0x0403:
            int r0 = r1.length     // Catch:{ C2W -> 0x0736 }
            if (r3 >= r0) goto L_0x0423
            r0 = r1[r3]     // Catch:{ C2W -> 0x0736 }
            int r4 = r0.A00     // Catch:{ C2W -> 0x0736 }
            r0 = 4
            if (r4 != r0) goto L_0x0420
            r0 = r1[r3]     // Catch:{ IOException -> 0x065e }
            X.1Bx r0 = r0.A01     // Catch:{ IOException -> 0x065e }
            X.1Bz r0 = r0.CP9()     // Catch:{ IOException -> 0x065e }
            byte[] r0 = r0.A0B()     // Catch:{ IOException -> 0x065e }
            boolean r0 = java.util.Arrays.equals(r0, r2)     // Catch:{ IOException -> 0x065e }
            if (r0 == 0) goto L_0x0420
            r5 = 1
        L_0x0420:
            int r3 = r3 + 1
            goto L_0x0403
        L_0x0423:
            if (r5 == 0) goto L_0x066f
            if (r6 != 0) goto L_0x0443
            goto L_0x0667
        L_0x0429:
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ C2W -> 0x0736 }
            X.DxW r1 = X.C26068Cri.A03(r0)     // Catch:{ C2W -> 0x0736 }
            X.DxW r0 = X.C26068Cri.A00(r20)     // Catch:{ C2W -> 0x0736 }
            boolean r0 = r1.equals(r0)     // Catch:{ C2W -> 0x0736 }
            if (r0 != 0) goto L_0x0443
            java.lang.String r0 = "Cannot find matching CRL issuer for certificate."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0443:
            X.1Bz r0 = X.C26284Cwf.A05(r8, r9)     // Catch:{ Exception -> 0x06f2 }
            X.DxE r6 = X.C28306DxE.A01(r0)     // Catch:{ Exception -> 0x06f2 }
            if (r6 == 0) goto L_0x059c
            X.DxT r0 = r6.A01     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x055e
            X.DxE r0 = X.C28306DxE.A01(r6)     // Catch:{ C2W -> 0x0736 }
            X.DxT r3 = r0.A01     // Catch:{ C2W -> 0x0736 }
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ C2W -> 0x0736 }
            int r2 = r3.A00     // Catch:{ C2W -> 0x0736 }
            r4 = 0
            if (r2 != 0) goto L_0x0472
            X.1Bx r0 = r3.A01     // Catch:{ C2W -> 0x0736 }
            X.DxU[] r1 = X.C28317DxP.A01(r0)     // Catch:{ C2W -> 0x0736 }
            r0 = 0
        L_0x0467:
            int r15 = r1.length     // Catch:{ C2W -> 0x0736 }
            if (r0 >= r15) goto L_0x0472
            r15 = r1[r0]     // Catch:{ C2W -> 0x0736 }
            r5.add(r15)     // Catch:{ C2W -> 0x0736 }
            int r0 = r0 + 1
            goto L_0x0467
        L_0x0472:
            r0 = 1
            if (r2 != r0) goto L_0x04b1
            X.Csy r2 = new X.Csy     // Catch:{ C2W -> 0x0736 }
            r2.<init>()     // Catch:{ C2W -> 0x0736 }
            javax.security.auth.x500.X500Principal r1 = r9.getIssuerX500Principal()     // Catch:{ Exception -> 0x0677 }
            X.DxW r1 = X.C26068Cri.A03(r1)     // Catch:{ Exception -> 0x0677 }
            X.Dxl r1 = X.C28339Dxl.A05(r1)     // Catch:{ Exception -> 0x0677 }
            java.util.Enumeration r15 = r1.A0L()     // Catch:{ Exception -> 0x0677 }
        L_0x048a:
            boolean r1 = r15.hasMoreElements()     // Catch:{ Exception -> 0x0677 }
            if (r1 == 0) goto L_0x049a
            java.lang.Object r1 = r15.nextElement()     // Catch:{ Exception -> 0x0677 }
            X.1Bx r1 = (X.AnonymousClass1Bx) r1     // Catch:{ Exception -> 0x0677 }
            r2.A02(r1)     // Catch:{ Exception -> 0x0677 }
            goto L_0x048a
        L_0x049a:
            X.1Bx r1 = r3.A01     // Catch:{ C2W -> 0x0736 }
            X.Dy3 r1 = X.C28339Dxl.A07(r1, r2)     // Catch:{ C2W -> 0x0736 }
            X.DxW r1 = X.C28324DxW.A01(r1)     // Catch:{ C2W -> 0x0736 }
            X.DxU r2 = new X.DxU     // Catch:{ C2W -> 0x0736 }
            r2.<init>()     // Catch:{ C2W -> 0x0736 }
            r2.A01 = r1     // Catch:{ C2W -> 0x0736 }
            r1 = 4
            r2.A00 = r1     // Catch:{ C2W -> 0x0736 }
            r5.add(r2)     // Catch:{ C2W -> 0x0736 }
        L_0x04b1:
            X.DxT r3 = r13.A00     // Catch:{ C2W -> 0x0736 }
            java.lang.String r17 = "No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."
            if (r3 == 0) goto L_0x053b
            int r1 = r3.A00     // Catch:{ C2W -> 0x0736 }
            if (r1 != 0) goto L_0x04cf
            X.1Bx r0 = r3.A01     // Catch:{ C2W -> 0x0736 }
            X.DxU[] r2 = X.C28317DxP.A01(r0)     // Catch:{ C2W -> 0x0736 }
        L_0x04c1:
            int r0 = r2.length     // Catch:{ C2W -> 0x0736 }
            if (r4 >= r0) goto L_0x0532
            r0 = r2[r4]     // Catch:{ C2W -> 0x0736 }
            boolean r0 = r5.contains(r0)     // Catch:{ C2W -> 0x0736 }
            if (r0 != 0) goto L_0x055e
            int r4 = r4 + 1
            goto L_0x04c1
        L_0x04cf:
            if (r1 != r0) goto L_0x0532
            X.DxP r1 = r13.A01     // Catch:{ C2W -> 0x0736 }
            if (r1 == 0) goto L_0x04de
            X.DxU[] r1 = r1.A00     // Catch:{ C2W -> 0x0736 }
            int r0 = r1.length     // Catch:{ C2W -> 0x0736 }
            X.DxU[] r2 = new X.C28322DxU[r0]     // Catch:{ C2W -> 0x0736 }
            java.lang.System.arraycopy(r1, r4, r2, r4, r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x04f0
        L_0x04de:
            X.DxU[] r2 = new X.C28322DxU[r0]     // Catch:{ C2W -> 0x0736 }
            X.DxW r0 = X.C26068Cri.A00(r20)     // Catch:{ Exception -> 0x0680 }
            X.DxU r1 = new X.DxU     // Catch:{ Exception -> 0x0680 }
            r1.<init>()     // Catch:{ Exception -> 0x0680 }
            r1.A01 = r0     // Catch:{ Exception -> 0x0680 }
            r0 = 4
            r1.A00 = r0     // Catch:{ Exception -> 0x0680 }
            r2[r4] = r1     // Catch:{ Exception -> 0x0680 }
        L_0x04f0:
            r1 = 0
        L_0x04f1:
            int r0 = r2.length     // Catch:{ C2W -> 0x0736 }
            if (r1 >= r0) goto L_0x04c1
            r0 = r2[r1]     // Catch:{ C2W -> 0x0736 }
            X.1Bx r0 = r0.A01     // Catch:{ C2W -> 0x0736 }
            X.1Bz r0 = r0.CP9()     // Catch:{ C2W -> 0x0736 }
            X.Dxl r0 = X.C28339Dxl.A05(r0)     // Catch:{ C2W -> 0x0736 }
            java.util.Enumeration r16 = r0.A0L()     // Catch:{ C2W -> 0x0736 }
            X.Csy r15 = new X.Csy     // Catch:{ C2W -> 0x0736 }
            r15.<init>()     // Catch:{ C2W -> 0x0736 }
        L_0x0509:
            boolean r0 = r16.hasMoreElements()     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0519
            java.lang.Object r0 = r16.nextElement()     // Catch:{ C2W -> 0x0736 }
            X.1Bx r0 = (X.AnonymousClass1Bx) r0     // Catch:{ C2W -> 0x0736 }
            r15.A02(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0509
        L_0x0519:
            X.1Bx r0 = r3.A01     // Catch:{ C2W -> 0x0736 }
            X.Dy3 r0 = X.C28339Dxl.A07(r0, r15)     // Catch:{ C2W -> 0x0736 }
            X.DxW r15 = X.C28324DxW.A01(r0)     // Catch:{ C2W -> 0x0736 }
            X.DxU r0 = new X.DxU     // Catch:{ C2W -> 0x0736 }
            r0.<init>()     // Catch:{ C2W -> 0x0736 }
            r0.A01 = r15     // Catch:{ C2W -> 0x0736 }
            r15 = 4
            r0.A00 = r15     // Catch:{ C2W -> 0x0736 }
            r2[r1] = r0     // Catch:{ C2W -> 0x0736 }
            int r1 = r1 + 1
            goto L_0x04f1
        L_0x0532:
            r1 = 0
            r0 = r17
            X.C2W r4 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x03d8
        L_0x053b:
            X.DxP r0 = r13.A01     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0689
            X.DxU[] r2 = r0.A00     // Catch:{ C2W -> 0x0736 }
            int r0 = r2.length     // Catch:{ C2W -> 0x0736 }
            X.DxU[] r1 = new X.C28322DxU[r0]     // Catch:{ C2W -> 0x0736 }
            java.lang.System.arraycopy(r2, r4, r1, r4, r0)     // Catch:{ C2W -> 0x0736 }
        L_0x0547:
            int r0 = r1.length     // Catch:{ C2W -> 0x0736 }
            if (r4 >= r0) goto L_0x0555
            r0 = r1[r4]     // Catch:{ C2W -> 0x0736 }
            boolean r0 = r5.contains(r0)     // Catch:{ C2W -> 0x0736 }
            if (r0 != 0) goto L_0x055e
            int r4 = r4 + 1
            goto L_0x0547
        L_0x0555:
            r1 = 0
            r0 = r17
            X.C2W r4 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x03d8
        L_0x055e:
            java.lang.String r1 = A02     // Catch:{ Exception -> 0x0699 }
            r0 = r20
            X.1Bz r0 = X.C26284Cwf.A05(r1, r0)     // Catch:{ Exception -> 0x0699 }
            X.Dx9 r1 = X.C28301Dx9.A01(r0)     // Catch:{ Exception -> 0x0699 }
            if (r27 == 0) goto L_0x0590
            boolean r0 = r6.A06     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0582
            if (r1 == 0) goto L_0x0582
            X.Dxi r0 = r1.A00     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0582
            byte r0 = r0.A00     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0582
            java.lang.String r0 = "CA Cert CRL only contains user certificates."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0582:
            boolean r0 = r6.A05     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0590
            if (r1 == 0) goto L_0x0691
            X.Dxi r0 = r1.A00     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0691
            byte r0 = r0.A00     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0691
        L_0x0590:
            boolean r0 = r6.A04     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x059c
            java.lang.String r0 = "onlyContainsAttributeCerts boolean is asserted."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x059c:
            if (r7 == 0) goto L_0x05f0
            boolean r0 = r7.hasUnsupportedCriticalExtension()     // Catch:{ C2W -> 0x0736 }
            if (r0 != 0) goto L_0x06e0
            X.1Bz r0 = X.C26284Cwf.A05(r8, r9)     // Catch:{ Exception -> 0x06d8 }
            X.DxE r2 = X.C28306DxE.A01(r0)     // Catch:{ Exception -> 0x06d8 }
            if (r22 == 0) goto L_0x05f0
            javax.security.auth.x500.X500Principal r0 = r7.getIssuerX500Principal()     // Catch:{ C2W -> 0x0736 }
            X.DxW r1 = X.C26068Cri.A03(r0)     // Catch:{ C2W -> 0x0736 }
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ C2W -> 0x0736 }
            X.DxW r0 = X.C26068Cri.A03(r0)     // Catch:{ C2W -> 0x0736 }
            boolean r0 = r1.equals(r0)     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x06d1
            X.1Bz r0 = X.C26284Cwf.A05(r8, r7)     // Catch:{ Exception -> 0x06c9 }
            X.DxE r0 = X.C28306DxE.A01(r0)     // Catch:{ Exception -> 0x06c9 }
            if (r2 != 0) goto L_0x05d1
            if (r0 != 0) goto L_0x06c2
            goto L_0x05d7
        L_0x05d1:
            boolean r0 = r2.equals(r0)     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x06c2
        L_0x05d7:
            java.lang.String r0 = A01     // Catch:{ C2W -> 0x06ba }
            X.1Bz r1 = X.C26284Cwf.A05(r0, r9)     // Catch:{ C2W -> 0x06ba }
            X.1Bz r0 = X.C26284Cwf.A05(r0, r7)     // Catch:{ C2W -> 0x06b2 }
            if (r1 == 0) goto L_0x06aa
            if (r0 == 0) goto L_0x06a2
            boolean r0 = r1.A0J(r0)     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x06eb
            r0 = r20
            X.C26284Cwf.A07(r0, r7, r14, r11)     // Catch:{ C2W -> 0x0736 }
        L_0x05f0:
            int r1 = r11.A00     // Catch:{ C2W -> 0x0736 }
            r0 = 11
            if (r1 != r0) goto L_0x05fb
            r0 = r20
            X.C26284Cwf.A07(r0, r9, r14, r11)     // Catch:{ C2W -> 0x0736 }
        L_0x05fb:
            int r1 = r11.A00     // Catch:{ C2W -> 0x0736 }
            r0 = 8
            if (r1 != r0) goto L_0x0605
            r0 = 11
            r11.A00 = r0     // Catch:{ C2W -> 0x0736 }
        L_0x0605:
            r0 = r37
            int r0 = r0.A00     // Catch:{ C2W -> 0x0736 }
            int r1 = r10.A00     // Catch:{ C2W -> 0x0736 }
            r1 = r1 | r0
            r0 = r37
            r0.A00 = r1     // Catch:{ C2W -> 0x0736 }
            java.util.Set r0 = r9.getCriticalExtensionOIDs()     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x0636
            java.util.HashSet r1 = X.AnonymousClass8BR.A12(r0)     // Catch:{ C2W -> 0x0736 }
            X.1C0 r0 = X.C28314DxM.A0K     // Catch:{ C2W -> 0x0736 }
            java.lang.String r0 = r0.A01     // Catch:{ C2W -> 0x0736 }
            r1.remove(r0)     // Catch:{ C2W -> 0x0736 }
            X.1C0 r0 = X.C28314DxM.A0C     // Catch:{ C2W -> 0x0736 }
            java.lang.String r0 = r0.A01     // Catch:{ C2W -> 0x0736 }
            r1.remove(r0)     // Catch:{ C2W -> 0x0736 }
            boolean r0 = r1.isEmpty()     // Catch:{ C2W -> 0x0736 }
            if (r0 != 0) goto L_0x0636
            java.lang.String r0 = "CRL contains unsupported critical extensions."
            X.C2W r4 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x03d8
        L_0x0636:
            if (r7 == 0) goto L_0x06e7
            java.util.Set r0 = r7.getCriticalExtensionOIDs()     // Catch:{ C2W -> 0x0736 }
            if (r0 == 0) goto L_0x06e7
            java.util.HashSet r1 = X.AnonymousClass8BR.A12(r0)     // Catch:{ C2W -> 0x0736 }
            X.1C0 r0 = X.C28314DxM.A0K     // Catch:{ C2W -> 0x0736 }
            java.lang.String r0 = r0.A01     // Catch:{ C2W -> 0x0736 }
            r1.remove(r0)     // Catch:{ C2W -> 0x0736 }
            X.1C0 r0 = X.C28314DxM.A0C     // Catch:{ C2W -> 0x0736 }
            java.lang.String r0 = r0.A01     // Catch:{ C2W -> 0x0736 }
            r1.remove(r0)     // Catch:{ C2W -> 0x0736 }
            boolean r0 = r1.isEmpty()     // Catch:{ C2W -> 0x0736 }
            if (r0 != 0) goto L_0x06e7
            java.lang.String r0 = "Delta CRL contains unsupported critical extension."
            X.C2W r4 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x03d8
        L_0x065e:
            r1 = move-exception
            java.lang.String r0 = "CRL issuer information from distribution point cannot be decoded."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0667:
            java.lang.String r0 = "Distribution point contains cRLIssuer field but CRL is not indirect."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x066f:
            java.lang.String r0 = "CRL issuer of CRL does not match CRL issuer of distribution point."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0677:
            r1 = move-exception
            java.lang.String r0 = "Could not read CRL issuer."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0680:
            r1 = move-exception
            java.lang.String r0 = "Could not read certificate issuer."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0689:
            java.lang.String r0 = "Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0691:
            java.lang.String r0 = "End CRL only contains CA certificates."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0699:
            r1 = move-exception
            java.lang.String r0 = "Basic constraints extension could not be decoded."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06a2:
            java.lang.String r0 = "Delta CRL authority key identifier is null."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06aa:
            java.lang.String r0 = "CRL authority key identifier is null."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06b2:
            r1 = move-exception
            java.lang.String r0 = "Authority key identifier extension could not be extracted from delta CRL."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06ba:
            r1 = move-exception
            java.lang.String r0 = "Authority key identifier extension could not be extracted from complete CRL."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06c2:
            java.lang.String r0 = "Issuing distribution point extension from delta CRL and complete CRL does not match."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06c9:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension from delta CRL could not be decoded."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06d1:
            java.lang.String r0 = "Complete CRL issuer does not match delta CRL issuer."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06d8:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06e0:
            java.lang.String r0 = "delta CRL has unsupported critical extensions"
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06e7:
            r18 = 1
            goto L_0x00dc
        L_0x06eb:
            java.lang.String r0 = "Delta CRL authority key identifier does not match complete CRL authority key identifier."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06f2:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x06fa:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C2W -> 0x0736 }
            java.lang.String r0 = "Exception encoding CRL issuer: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)     // Catch:{ C2W -> 0x0736 }
            X.C2W r0 = X.C2W.A01(r0, r2)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x070a:
            java.lang.String r0 = "Cannot verify CRL."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0711:
            r1 = move-exception
            java.lang.String r0 = "Issuer certificate for CRL cannot be searched."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0719:
            java.lang.IllegalStateException r0 = X.BE6.A0k()     // Catch:{ IOException -> 0x071e }
            throw r0     // Catch:{ IOException -> 0x071e }
        L_0x071e:
            r1 = move-exception
            java.lang.String r0 = "Subject criteria for certificate selector to find issuer certificate for CRL could not be set."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x0726:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
            goto L_0x0735
        L_0x072e:
            r1 = move-exception
            java.lang.String r0 = "Public key of issuer certificate of CRL could not be retrieved."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x0736 }
        L_0x0735:
            throw r0     // Catch:{ C2W -> 0x0736 }
        L_0x0736:
            r23 = move-exception
            goto L_0x00dc
        L_0x0739:
            if (r18 == 0) goto L_0x0759
            return
        L_0x073c:
            java.lang.String r0 = "CRL issuer is omitted from distribution point but no distributionPoint field present."
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x074b }
            goto L_0x074a
        L_0x0743:
            r1 = move-exception
            java.lang.String r0 = "CRL issuer information from distribution point cannot be decoded."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x074b }
        L_0x074a:
            throw r0     // Catch:{ C2W -> 0x074b }
        L_0x074b:
            r1 = move-exception
            java.lang.String r0 = "Could not get issuer information from distribution point."
            X.C2W r0 = X.C2W.A01(r0, r1)
            throw r0
        L_0x0753:
            java.lang.String r0 = "Validation time is in future."
            X.C2W r23 = X.C2W.A00(r0)
        L_0x0759:
            throw r23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26295Cx7.A0B(java.security.PublicKey, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.util.Date, java.util.Date, java.util.List, X.Dwt, X.Cic, X.DU9, X.E3R, X.COn, X.Cp7):void");
    }
}
