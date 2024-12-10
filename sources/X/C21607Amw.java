package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: X.Amw  reason: case insensitive filesystem */
public final class C21607Amw extends SSLServerSocketFactory {
    public SSLServerSocketFactory A00;
    public final PrivateKey A01;
    public final Certificate A02;
    public final SSLContext A03;

    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        C18070vi.A0d(inetAddress, 2);
        ServerSocket createServerSocket = A00().createServerSocket(i, i2, inetAddress);
        C18070vi.A0X(createServerSocket);
        return createServerSocket;
    }

    private final SSLServerSocketFactory A00() {
        SSLServerSocketFactory sSLServerSocketFactory = this.A00;
        if (sSLServerSocketFactory == null) {
            SSLContext sSLContext = this.A03;
            C18070vi.A0d(sSLContext, 0);
            try {
                char[] charArray = "pass".toCharArray();
                C18070vi.A0X(charArray);
                KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
                instance.load((InputStream) null, (char[]) null);
                instance.setKeyEntry("self-signed-certificate", this.A01, charArray, new Certificate[]{this.A02});
                KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                instance2.init(instance, charArray);
                sSLContext.init(instance2.getKeyManagers(), (TrustManager[]) null, (SecureRandom) null);
                sSLServerSocketFactory = sSLContext.getServerSocketFactory();
                this.A00 = sSLServerSocketFactory;
            } catch (KeyManagementException e) {
                Log.e("p2p/SslSocketFactoryWithGivenCertificate/", e);
                throw AnonymousClass8BR.A0x(e);
            } catch (KeyStoreException e2) {
                Log.e("p2p/SslSocketFactoryWithGivenCertificate/", e2);
                throw AnonymousClass8BR.A0x(e2);
            } catch (CertificateException e3) {
                Log.e("p2p/SslSocketFactoryWithGivenCertificate/", e3);
                throw AnonymousClass8BR.A0x(e3);
            } catch (IOException e4) {
                Log.e("p2p/SslSocketFactoryWithGivenCertificate/", e4);
                throw AnonymousClass8BR.A0x(e4);
            } catch (NoSuchAlgorithmException e5) {
                Log.e("p2p/SslSocketFactoryWithGivenCertificate/", e5);
                throw AnonymousClass8BR.A0x(e5);
            } catch (UnrecoverableKeyException e6) {
                Log.e("p2p/SslSocketFactoryWithGivenCertificate/", e6);
                throw AnonymousClass8BR.A0x(e6);
            }
        }
        return sSLServerSocketFactory;
    }

    public C21607Amw(PrivateKey privateKey, Certificate certificate) {
        this();
        this.A01 = privateKey;
        this.A02 = certificate;
    }

    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = A00().getDefaultCipherSuites();
        C18070vi.A0X(defaultCipherSuites);
        return defaultCipherSuites;
    }

    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = A00().getSupportedCipherSuites();
        C18070vi.A0X(supportedCipherSuites);
        return supportedCipherSuites;
    }

    public C21607Amw() {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            C18070vi.A0X(instance);
            this.A03 = instance;
        } catch (NoSuchAlgorithmException e) {
            C17890vO.A13(" algorithm not available for SSLContext: ", AnonymousClass000.A11("TLS"), e);
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public ServerSocket createServerSocket(int i) {
        ServerSocket createServerSocket = A00().createServerSocket(i);
        C18070vi.A0X(createServerSocket);
        return createServerSocket;
    }

    public ServerSocket createServerSocket(int i, int i2) {
        ServerSocket createServerSocket = A00().createServerSocket(i, i2);
        C18070vi.A0X(createServerSocket);
        return createServerSocket;
    }

    public ServerSocket createServerSocket() {
        ServerSocket createServerSocket = A00().createServerSocket();
        C18070vi.A0X(createServerSocket);
        return createServerSocket;
    }
}
