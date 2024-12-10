package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Gl  reason: invalid class name and case insensitive filesystem */
public class C144217Gl implements C72383Ls {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C144217Gl(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void BrC(Exception exc) {
        switch (this.A00) {
            case 2:
                ((C1606789m) this.A01).BrA();
                return;
            case 3:
                ((AnonymousClass8A2) this.A02).BrA();
                return;
            default:
                C18070vi.A0d(exc, 0);
                ((C1606789m) this.A01).Bsw(exc);
                return;
        }
    }

    public void Bsw(Exception exc) {
        if (3 - this.A00 != 0) {
            C18070vi.A0d(exc, 0);
            ((C1606789m) this.A01).Bsw(exc);
            return;
        }
        C18070vi.A0d(exc, 0);
        ((AnonymousClass8A2) this.A02).Bsx(exc, 480);
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C22821Di r1;
        Object obj;
        switch (this.A00) {
            case 0:
                C18070vi.A0h(x509Certificate, x509Certificate2);
                r1 = (C22821Di) this.A02;
                obj = new C135616sU(num, publicKey, x509Certificate, x509Certificate2);
                break;
            case 1:
                C18070vi.A0h(x509Certificate, x509Certificate2);
                r1 = (C22821Di) this.A02;
                obj = new C135776sk(num, publicKey, x509Certificate, x509Certificate2);
                break;
            case 2:
                C18070vi.A0h(x509Certificate, x509Certificate2);
                r1 = (C22821Di) this.A02;
                obj = new C135866st(num, publicKey, x509Certificate, x509Certificate2);
                break;
            default:
                ((AnonymousClass7RO) this.A01).run();
                return;
        }
        r1.invoke(obj);
    }
}
