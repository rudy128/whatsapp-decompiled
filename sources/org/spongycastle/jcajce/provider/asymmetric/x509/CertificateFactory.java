package org.spongycastle.jcajce.provider.asymmetric.x509;

import X.AnonymousClass000;
import X.AnonymousClass1Bw;
import X.AnonymousClass1Bx;
import X.AnonymousClass1C0;
import X.BE6;
import X.BEA;
import X.C17900vP;
import X.C24178Bwo;
import X.C24647CDm;
import X.C25638CjQ;
import X.C27271Dax;
import X.C27277Db5;
import X.C28298Dx6;
import X.C28305DxD;
import X.C28326DxY;
import X.C28339Dxl;
import X.C28340Dxm;
import X.C28341Dxn;
import X.C28405Dyp;
import X.C28407Dyr;
import X.DZI;
import X.E3R;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CertificateFactory extends CertificateFactorySpi {
    public static final C25638CjQ A07 = new C25638CjQ("CERTIFICATE");
    public static final C25638CjQ A08 = new C25638CjQ("CRL");
    public static final C25638CjQ A09 = new C25638CjQ("PKCS7");
    public int A00 = 0;
    public C28340Dxm A01 = null;
    public int A02 = 0;
    public InputStream A03 = null;
    public InputStream A04 = null;
    public C28340Dxm A05 = null;
    public final E3R A06 = new DZI();

    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new C27271Dax(inputStream, str);
    }

    public Iterator engineGetCertPathEncodings() {
        return C27271Dax.A00.iterator();
    }

    private C28405Dyp A00(C28339Dxl dxl) {
        C28305DxD A012;
        if (dxl == null) {
            return null;
        }
        if (dxl.A0K() <= 1 || !(dxl.A0M(0) instanceof AnonymousClass1C0) || !dxl.A0M(0).equals(AnonymousClass1Bw.A2K)) {
            A012 = C28305DxD.A01(dxl);
        } else {
            C28340Dxm dxm = C28326DxY.A01(C28339Dxl.A06((C28341Dxn) dxl.A0M(1), true)).A02;
            this.A01 = dxm;
            if (dxm == null) {
                return null;
            }
            int i = this.A00;
            AnonymousClass1Bx[] r1 = dxm.A00;
            if (i >= r1.length) {
                return null;
            }
            this.A00 = i + 1;
            A012 = C28305DxD.A01(r1[i]);
        }
        return new C28405Dyp(A012, this.A06);
    }

    private C28407Dyr A01() {
        AnonymousClass1Bx r1;
        C28340Dxm dxm = this.A05;
        if (dxm == null) {
            return null;
        }
        do {
            int i = this.A02;
            AnonymousClass1Bx[] r12 = dxm.A00;
            if (i >= r12.length) {
                return null;
            }
            this.A02 = i + 1;
            r1 = r12[i];
        } while (!(r1 instanceof C28339Dxl));
        return new C28407Dyr(C28298Dx6.A01(r1), this.A06);
    }

    private C28407Dyr A02(C28339Dxl dxl) {
        if (dxl == null) {
            return null;
        }
        if (dxl.A0K() <= 1 || !(dxl.A0M(0) instanceof AnonymousClass1C0) || !dxl.A0M(0).equals(AnonymousClass1Bw.A2K)) {
            return new C28407Dyr(C28298Dx6.A01(dxl), this.A06);
        }
        this.A05 = C28326DxY.A01(C28339Dxl.A06((C28341Dxn) dxl.A0M(1), true)).A01;
        return A01();
    }

    public CRL engineGenerateCRL(InputStream inputStream) {
        InputStream inputStream2 = this.A03;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.A03 = inputStream;
            this.A01 = null;
            this.A00 = 0;
        }
        try {
            C28340Dxm dxm = this.A01;
            if (dxm != null) {
                int i = this.A00;
                AnonymousClass1Bx[] r1 = dxm.A00;
                int length = r1.length;
                if (i == length) {
                    this.A01 = null;
                    this.A00 = 0;
                    return null;
                } else if (i >= length) {
                    return null;
                } else {
                    this.A00 = i + 1;
                    return new C28405Dyp(C28305DxD.A01(r1[i]), this.A06);
                }
            } else {
                if (!inputStream.markSupported()) {
                    inputStream = BE6.A0h(C24647CDm.A00(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                if (read != 48) {
                    return A00(A08.A01(inputStream));
                }
                return A00(C28339Dxl.A05(new C24178Bwo(inputStream, true).A05()));
            }
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    public Certificate engineGenerateCertificate(InputStream inputStream) {
        InputStream inputStream2 = this.A04;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.A04 = inputStream;
            this.A05 = null;
            this.A02 = 0;
        }
        try {
            C28340Dxm dxm = this.A05;
            if (dxm == null) {
                if (!inputStream.markSupported()) {
                    inputStream = BE6.A0h(C24647CDm.A00(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                if (read != 48) {
                    return A02(A07.A01(inputStream));
                }
                return A02(C28339Dxl.A05(new C24178Bwo(inputStream).A05()));
            } else if (this.A02 != dxm.A00.length) {
                return A01();
            } else {
                this.A05 = null;
                this.A02 = 0;
                return null;
            }
        } catch (Exception e) {
            throw new C27277Db5(C17900vP.A0C("parsing issue: ", AnonymousClass000.A10(), e), e, this);
        }
    }

    public Collection engineGenerateCertificates(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList A13 = AnonymousClass000.A13();
        while (true) {
            Certificate engineGenerateCertificate = engineGenerateCertificate(bufferedInputStream);
            if (engineGenerateCertificate == null) {
                return A13;
            }
            A13.add(engineGenerateCertificate);
        }
    }

    public Collection engineGenerateCRLs(InputStream inputStream) {
        ArrayList A13 = AnonymousClass000.A13();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL engineGenerateCRL = engineGenerateCRL(bufferedInputStream);
            if (engineGenerateCRL == null) {
                return A13;
            }
            A13.add(engineGenerateCRL);
        }
    }

    public CertPath engineGenerateCertPath(List list) {
        for (Object next : list) {
            if (next != null && !(next instanceof X509Certificate)) {
                throw new CertificateException(BEA.A0j(next, "list contains non X509Certificate object while creating CertPath\n", AnonymousClass000.A10()));
            }
        }
        return new C27271Dax(list);
    }

    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return new C27271Dax(inputStream, "PkiPath");
    }
}
