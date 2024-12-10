package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6sU  reason: invalid class name and case insensitive filesystem */
public final class C135616sU {
    public final Integer A00;
    public final PublicKey A01;
    public final X509Certificate A02;
    public final X509Certificate A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135616sU) {
                C135616sU r5 = (C135616sU) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A02)) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public C135616sU(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.A02 = x509Certificate;
        this.A03 = x509Certificate2;
        this.A01 = publicKey;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommonCertificate(encryptionCertificate=");
        A10.append(this.A02);
        A10.append(", signature=");
        A10.append(this.A03);
        A10.append(", passwordPublicKey=");
        A10.append(this.A01);
        A10.append(", passwordKeyId=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
