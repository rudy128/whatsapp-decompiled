package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.ANn  reason: case insensitive filesystem */
public final class C20502ANn implements BAN {
    public final /* synthetic */ C20009A2z A00;
    public final /* synthetic */ AEW A01;
    public final /* synthetic */ UserJid A02;

    public void Bv6(UserJid userJid) {
        StringBuilder A19 = AnonymousClass3MZ.A19(userJid, 0);
        String A0y = AnonymousClass000.A0y(AnonymousClass8BS.A0g(userJid, "Business JID: ", A19), A19);
        C20009A2z a2z = this.A00;
        a2z.A06.A1U(this.A02.getRawString());
        a2z.A06(userJid);
        a2z.A04.A0G("direct-connection-public-key-error-response", A0y, false);
    }

    public C20502ANn(C20009A2z a2z, AEW aew, UserJid userJid) {
        this.A00 = a2z;
        this.A02 = userJid;
        this.A01 = aew;
    }

    public void Bv7(UserJid userJid, String str, String str2, String str3) {
        C18070vi.A0d(userJid, 0);
        Log.i("DirectConnectionManager/onGetBusinessPublicKeySuccess");
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            String str4 = C19620yd.A0A;
            C18070vi.A0Z(str4);
            Collection<? extends Certificate> generateCertificates = instance.generateCertificates(new ByteArrayInputStream(AnonymousClass8BX.A1a(str4, str)));
            C18070vi.A0b(generateCertificates);
            ArrayList A0D = C29351c6.A0D(generateCertificates);
            for (Object next : generateCertificates) {
                C18070vi.A0z(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                A0D.add(next);
            }
            X509Certificate[] x509CertificateArr = (X509Certificate[]) A0D.toArray(new X509Certificate[0]);
            C18070vi.A0d(x509CertificateArr, 0);
            TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance2.init((KeyStore) null);
            TrustManager trustManager = instance2.getTrustManagers()[0];
            C18070vi.A0z(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, "RSA");
            String A14 = C108955ca.A14(x509CertificateArr[0].getEncoded());
            C20009A2z a2z = this.A00;
            C19830z4 r0 = a2z.A06;
            UserJid userJid2 = this.A02;
            AnonymousClass8BX.A0z(C19830z4.A00(r0), "smb_business_direct_connection_public_key_", userJid2.getRawString(), A14, AnonymousClass000.A10());
            C20009A2z.A00(a2z, this.A01, userJid, userJid2);
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
            Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/", e);
            C20009A2z a2z2 = this.A00;
            a2z2.A06(userJid);
            StringBuilder A11 = AnonymousClass000.A11("\n                        Business JID: ");
            A11.append(userJid.getRawString());
            A11.append("\n                        Exception: ");
            A11.append(e);
            String A0k = AnonymousClass8BW.A0k("\n                        ", A11);
            boolean z = e instanceof NoSuchAlgorithmException;
            AnonymousClass190 r02 = a2z2.A04;
            if (z) {
                r02.A0G("direct-connection-certificate-exception-no-such-algorithm", A0k, true);
            } else {
                r02.A0G("direct-connection-certificate-exception", A0k, true);
            }
        }
    }
}
