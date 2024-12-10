package X;

import android.net.SSLSessionCache;
import java.net.InetAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.Amz  reason: case insensitive filesystem */
public class C21610Amz extends SSLSocketFactory {
    public final /* synthetic */ SSLSessionCache A00;
    public final /* synthetic */ AnonymousClass9A9 A01;
    public final /* synthetic */ SSLContext A02;
    public final /* synthetic */ SSLSocketFactory A03;

    public C21610Amz(SSLSessionCache sSLSessionCache, AnonymousClass9A9 r2, SSLContext sSLContext, SSLSocketFactory sSLSocketFactory) {
        this.A01 = r2;
        this.A03 = sSLSocketFactory;
        this.A02 = sSLContext;
        this.A00 = sSLSessionCache;
    }

    public static void A00(C21610Amz amz, String str, Socket socket, int i) {
        AnonymousClass9A9 r2 = amz.A01;
        r2.A02(socket);
        C20018A3k.A00(amz.A00, str, amz.A02, i);
        X509Certificate[] x509CertificateArr = AnonymousClass9A9.A01;
        r2.A00.incrementAndGet();
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.A03.createSocket(inetAddress, i);
        AnonymousClass9A9 r3 = this.A01;
        r3.A02(createSocket);
        C20018A3k.A00(this.A00, inetAddress.getHostName(), this.A02, i);
        X509Certificate[] x509CertificateArr = AnonymousClass9A9.A01;
        r3.A00.incrementAndGet();
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.A03.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.A03.createSocket(inetAddress, i, inetAddress2, i2);
        AnonymousClass9A9 r3 = this.A01;
        r3.A02(createSocket);
        C20018A3k.A00(this.A00, inetAddress2.getHostName(), this.A02, i);
        X509Certificate[] x509CertificateArr = AnonymousClass9A9.A01;
        r3.A00.incrementAndGet();
        return createSocket;
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = this.A03.createSocket(str, i);
        A00(this, str, createSocket, i);
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.A03.createSocket(str, i, inetAddress, i2);
        A00(this, str, createSocket, i);
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.A03.createSocket(socket, str, i, z);
        A00(this, str, createSocket, i);
        return createSocket;
    }
}
