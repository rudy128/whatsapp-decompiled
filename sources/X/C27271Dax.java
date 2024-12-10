package X;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Dax  reason: case insensitive filesystem */
public class C27271Dax extends CertPath {
    public static final List A00;
    public List certificates;
    public final E3R helper;

    public Iterator getEncodings() {
        return A00.iterator();
    }

    public C27271Dax(InputStream inputStream, String str) {
        super("X.509");
        CertificateException certificateException;
        DZI dzi = new DZI();
        this.helper = dzi;
        try {
            if (str.equalsIgnoreCase("PkiPath")) {
                AnonymousClass1Bz A05 = new C24178Bwo(inputStream).A05();
                if (A05 instanceof C28339Dxl) {
                    Enumeration A0L = ((C28339Dxl) A05).A0L();
                    this.certificates = AnonymousClass000.A13();
                    CertificateFactory instance = CertificateFactory.getInstance("X.509", dzi.A00);
                    while (A0L.hasMoreElements()) {
                        this.certificates.add(0, instance.generateCertificate(BE6.A0h(BE9.A1Z((AnonymousClass1Bx) A0L.nextElement()))));
                    }
                    this.certificates = A00(this.certificates);
                    return;
                }
                certificateException = new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
            } else if (str.equalsIgnoreCase("PKCS7") || str.equalsIgnoreCase("PEM")) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = AnonymousClass000.A13();
                CertificateFactory instance2 = CertificateFactory.getInstance("X.509", dzi.A00);
                while (true) {
                    Certificate generateCertificate = instance2.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
                this.certificates = A00(this.certificates);
                return;
            } else {
                certificateException = new CertificateException(AnonymousClass001.A1H("unsupported encoding: ", str, AnonymousClass000.A10()));
            }
            throw certificateException;
        } catch (IOException e) {
            throw new CertificateException(BEA.A0j(e, "IOException throw while decoding CertPath:\n", AnonymousClass000.A10()));
        } catch (NoSuchProviderException e2) {
            throw new CertificateException(BEA.A0j(e2, "SpongyCastle provider not found while trying to get a CertificateFactory:\n", AnonymousClass000.A10()));
        }
    }

    public List getCertificates() {
        return AnonymousClass8BU.A0y(this.certificates);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.BufferedWriter, X.Bwd, java.io.Writer] */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.DxX, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.Dy6, X.Dxm] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.DxY, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.DxX, java.lang.Object] */
    public byte[] getEncoded(String str) {
        C28357Dy3 dy3;
        char[] cArr;
        int length;
        if (str.equalsIgnoreCase("PkiPath")) {
            C26135Csy csy = new C26135Csy();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                csy.A02(A01((X509Certificate) listIterator.previous()));
            }
            dy3 = new C28357Dy3(csy);
        } else {
            int i = 0;
            if (str.equalsIgnoreCase("PKCS7")) {
                AnonymousClass1C0 r1 = AnonymousClass1Bw.A07;
                ? obj = new Object();
                obj.A02 = true;
                obj.A01 = r1;
                obj.A00 = null;
                C26135Csy csy2 = new C26135Csy();
                while (i != this.certificates.size()) {
                    csy2.A02(A01(BE6.A0z(this.certificates, i)));
                    i++;
                }
                C28337Dxj dxj = new C28337Dxj(1);
                C28360Dy6 dy6 = new C28360Dy6();
                ? dxm = new C28340Dxm(csy2, true);
                dxm.A00 = -1;
                C28360Dy6 dy62 = new C28360Dy6();
                ? obj2 = new Object();
                obj2.A00 = dxj;
                obj2.A03 = dy6;
                obj2.A05 = obj;
                obj2.A01 = dxm;
                obj2.A02 = null;
                obj2.A04 = dy62;
                AnonymousClass1C0 r0 = AnonymousClass1Bw.A2K;
                ? obj3 = new Object();
                obj3.A02 = true;
                obj3.A01 = r0;
                obj3.A00 = obj2;
                dy3 = obj3;
            } else if (str.equalsIgnoreCase("PEM")) {
                ByteArrayOutputStream A15 = C108945cZ.A15();
                ? bufferedWriter = new BufferedWriter(new OutputStreamWriter(A15));
                bufferedWriter.A00 = new char[64];
                String str2 = AnonymousClass1Bo.A00;
                while (i != this.certificates.size()) {
                    try {
                        byte[] encoded = BE6.A0z(this.certificates, i).getEncoded();
                        List unmodifiableList = Collections.unmodifiableList(CGW.A00);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("-----BEGIN ");
                        A10.append("CERTIFICATE");
                        bufferedWriter.write(AnonymousClass000.A0y("-----", A10));
                        bufferedWriter.newLine();
                        if (!unmodifiableList.isEmpty()) {
                            Iterator it = unmodifiableList.iterator();
                            if (it.hasNext()) {
                                it.next();
                                throw AnonymousClass000.A0s("getName");
                            }
                            bufferedWriter.newLine();
                        }
                        byte[] A002 = C197429wg.A00(encoded);
                        int i2 = 0;
                        while (true) {
                            int length2 = A002.length;
                            if (i2 >= length2) {
                                break;
                            }
                            int i3 = 0;
                            while (true) {
                                cArr = bufferedWriter.A00;
                                length = cArr.length;
                                if (i3 == length || i2 + i3 >= length2) {
                                    bufferedWriter.write(cArr, 0, i3);
                                    bufferedWriter.newLine();
                                    i2 += length;
                                } else {
                                    cArr[i3] = (char) A002[i2 + i3];
                                    i3++;
                                }
                            }
                            bufferedWriter.write(cArr, 0, i3);
                            bufferedWriter.newLine();
                            i2 += length;
                        }
                        StringBuilder A102 = AnonymousClass000.A10();
                        C17890vO.A10("-----END ", "CERTIFICATE", "-----", A102);
                        bufferedWriter.write(A102.toString());
                        bufferedWriter.newLine();
                        i++;
                    } catch (Exception unused) {
                        throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                    }
                }
                bufferedWriter.close();
                return A15.toByteArray();
            } else {
                throw new CertificateEncodingException(AnonymousClass001.A1H("unsupported encoding: ", str, AnonymousClass000.A10()));
            }
        }
        try {
            return BE9.A1Z(dy3);
        } catch (IOException e) {
            throw new CertificateEncodingException(AnonymousClass001.A1E(e, "Exception thrown: ", AnonymousClass000.A10()));
        }
    }

    static {
        ArrayList A13 = AnonymousClass000.A13();
        A13.add("PkiPath");
        A13.add("PEM");
        A13.add("PKCS7");
        A00 = Collections.unmodifiableList(A13);
    }

    public static List A00(List list) {
        if (list.size() >= 2) {
            X500Principal issuerX500Principal = ((X509Certificate) C108955ca.A0p(list)).getIssuerX500Principal();
            int i = 1;
            while (i != list.size()) {
                if (issuerX500Principal.equals(BE6.A0z(list, i).getSubjectX500Principal())) {
                    issuerX500Principal = BE6.A0z(list, i).getIssuerX500Principal();
                    i++;
                } else {
                    ArrayList A14 = AnonymousClass000.A14(list);
                    ArrayList A10 = C17880vN.A10(list);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        X509Certificate A0z = BE6.A0z(list, i2);
                        X500Principal subjectX500Principal = A0z.getSubjectX500Principal();
                        int i3 = 0;
                        while (true) {
                            if (i3 != list.size()) {
                                if (BE6.A0z(list, i3).getIssuerX500Principal().equals(subjectX500Principal)) {
                                    break;
                                }
                                i3++;
                            } else {
                                A14.add(A0z);
                                list.remove(i2);
                                break;
                            }
                        }
                    }
                    if (A14.size() <= 1) {
                        for (int i4 = 0; i4 != A14.size(); i4++) {
                            X500Principal issuerX500Principal2 = ((X509Certificate) A14.get(i4)).getIssuerX500Principal();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= list.size()) {
                                    break;
                                }
                                X509Certificate A0z2 = BE6.A0z(list, i5);
                                if (issuerX500Principal2.equals(A0z2.getSubjectX500Principal())) {
                                    A14.add(A0z2);
                                    list.remove(i5);
                                    break;
                                }
                                i5++;
                            }
                        }
                        if (list.size() <= 0) {
                            return A14;
                        }
                    }
                    return A10;
                }
            }
        }
        return list;
    }

    public static AnonymousClass1Bz A01(X509Certificate x509Certificate) {
        try {
            return new C24178Bwo(x509Certificate.getEncoded()).A05();
        } catch (Exception e) {
            throw new CertificateEncodingException(BEA.A0j(e, "Exception while encoding certificate: ", AnonymousClass000.A10()));
        }
    }

    public C27271Dax(List list) {
        super("X.509");
        this.helper = new DZI();
        this.certificates = A00(C17880vN.A10(list));
    }

    public byte[] getEncoded() {
        Iterator it = A00.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }
}
