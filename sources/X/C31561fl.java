package X;

import com.whatsapp.util.Log;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1fl  reason: invalid class name and case insensitive filesystem */
public class C31561fl {
    public final C31571fm A00;

    public C31561fl(C18030ve r3, AnonymousClass10I r4) {
        C31571fm r0;
        if (C18020vd.A05(C18040vf.A02, r3, 12179)) {
            r0 = new AnonymousClass34T(r4);
        } else {
            r0 = new C31581fn(r4);
        }
        this.A00 = r0;
    }

    public static C62662rl A00(String str, InetSocketAddress inetSocketAddress, SSLSocketFactory sSLSocketFactory, int i) {
        Socket createSocket = SocketFactory.getDefault().createSocket();
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/try_connect ");
            sb.append(inetSocketAddress);
            sb.append(" (secureSocket? ");
            boolean z = false;
            if (sSLSocketFactory != null) {
                z = true;
            }
            sb.append(z);
            sb.append(')');
            Log.i(sb.toString());
        }
        createSocket.connect(inetSocketAddress, i);
        if (sSLSocketFactory != null) {
            createSocket = sSLSocketFactory.createSocket(createSocket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
            ((SSLSocket) createSocket).startHandshake();
        }
        return new C62662rl(createSocket);
    }
}
