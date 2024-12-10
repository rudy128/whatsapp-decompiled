package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.AlS  reason: case insensitive filesystem */
public final class C21519AlS implements X509TrustManager {
    public final /* synthetic */ AnonymousClass9A8 A00;

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    public C21519AlS(AnonymousClass9A8 r1) {
        this.A00 = r1;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Trust manager should not be used to checkClientTrusted");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        C18070vi.A0d(x509CertificateArr, 0);
        if (x509CertificateArr.length != 0) {
            try {
                byte[] encoded = x509CertificateArr[0].getEncoded();
                C18070vi.A0X(encoded);
                A8M a8m = A8M.A00;
                String A14 = C108955ca.A14(AnonymousClass8BW.A1W(encoded, "SHA-256"));
                C18070vi.A0X(A14);
                if (!A14.equals(this.A00.A00.A06)) {
                    Log.e("p2p/HashCheckingSSLSocketFactory/certificate hash not matching");
                    throw new CertificateException("Certificate is not valid");
                }
            } catch (UnsupportedEncodingException e) {
                Log.e("p2p/HashCheckingSSLSocketFactory/failed to encode certificate", e);
                throw new CertificateException("Failed to encode certificate");
            } catch (NoSuchAlgorithmException e2) {
                Log.e("p2p/HashCheckingSSLSocketFactory/failed to encode certificate", e2);
                throw new CertificateException("Failed to encode certificate");
            }
        } else {
            throw new CertificateException("Chain have to have at least 1 certificate");
        }
    }
}
