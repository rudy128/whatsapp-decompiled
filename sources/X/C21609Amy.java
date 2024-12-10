package X;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.Amy  reason: case insensitive filesystem */
public class C21609Amy extends SSLSocketFactory {
    public final int A00 = 3;
    public final int A01 = 3;
    public final AnonymousClass181 A02;
    public final SSLSocketFactory A03;

    public C21609Amy(AnonymousClass181 r4) {
        this.A02 = r4;
        SocketFactory socketFactory = SSLSocketFactory.getDefault();
        C18070vi.A0z(socketFactory, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
        this.A03 = (SSLSocketFactory) socketFactory;
    }

    public static C21608Amx A00(C21609Amy amy, Object obj) {
        int i = amy.A00;
        return new C21608Amx(amy.A02, (SSLSocket) obj, i, amy.A01);
    }

    public Socket createSocket(String str, int i) {
        return A00(this, this.A03.createSocket(str, i));
    }

    public String[] getDefaultCipherSuites() {
        return this.A03.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return A00(this, this.A03.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return A00(this, this.A03.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return A00(this, this.A03.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return A00(this, this.A03.createSocket(socket, str, i, z));
    }
}
