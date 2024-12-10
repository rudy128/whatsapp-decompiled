package X;

import com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/* renamed from: X.8vS  reason: invalid class name and case insensitive filesystem */
public final class C173648vS extends C178039Bo {
    public final int A00;
    public final String A01;
    public final Socket A02;

    public void run() {
        super.run();
        try {
            Socket socket = this.A02;
            socket.bind((SocketAddress) null);
            Log.i("p2p/SendIpThread/Trying to connect to server socket");
            int i = 0;
            while (true) {
                try {
                    String str = this.A01;
                    socket.connect(new InetSocketAddress(str, this.A00), 5000);
                    AWC awc = (AWC) this.A01;
                    if (awc.A00 != 0) {
                        C18070vi.A0d(str, 0);
                        ((WifiDirectScannerConnectionHandler) awc.A01).A08.A00(str, 0);
                    } else {
                        Log.i("p2p/WifiDirectCreatorConnectionHandler/ Successfully sent IP address");
                    }
                } catch (ConnectException unused) {
                    Log.e("p2p/SendIpThread/Failed to connect, retrying");
                    Thread.sleep(1000);
                    i++;
                    if (i >= 10) {
                        this.A01.Bsl();
                        break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("p2p/SendIpThread/Failure while sending IP", e);
            this.A01.Bsl();
        } catch (InterruptedException e2) {
            Log.e("p2p/SendIpThread/Failure while sending IP", e2);
            this.A01.Bsl();
        } catch (Throwable th) {
            A00();
            throw th;
        }
        A00();
    }

    public C173648vS(B8J b8j, String str, Socket socket, C18600wl r4, AnonymousClass1OX r5, int i) {
        super(b8j, r4, r5);
        this.A02 = socket;
        this.A01 = str;
        this.A00 = i;
        this.A00 = socket;
    }
}
