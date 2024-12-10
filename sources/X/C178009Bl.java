package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/* renamed from: X.9Bl  reason: invalid class name and case insensitive filesystem */
public final class C178009Bl extends C201010v {
    public Socket A00;
    public final C182609Va A01;
    public final C20276AEj A02;
    public final String A03;
    public final C175248yO A04;

    public void run() {
        Throwable th;
        int i = 0;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        while (true) {
            try {
                StringBuilder A11 = AnonymousClass000.A11("p2p/WifiDirectScannerNetworkingThread/ Attempt ");
                A11.append(i + 1);
                C17890vO.A1A(A11, ": Trying to connect to receiver");
                Socket socket = this.A00;
                if (socket == null) {
                    C20276AEj aEj = this.A02;
                    int i2 = aEj.A00;
                    C17900vP.A0j("p2p/WifiDirectScannerNetworkingThread/ creating a client socket on port=", AnonymousClass000.A10(), i2);
                    AnonymousClass10E r0 = this.A01.A00.A01;
                    socket = new AnonymousClass9A8(AnonymousClass3MZ.A0l(r0), aEj, (C191189mA) r0.A7e.get()).createSocket();
                    socket.bind((SocketAddress) null);
                    socket.connect(new InetSocketAddress(this.A03, i2), 5000);
                    if (!socket.isConnected()) {
                        th = C17880vN.A0f("Socket is not connected");
                        break;
                    } else {
                        Log.i("p2p/WifiDirectScannerNetworkingThread/ client socket is connected to server socket");
                        this.A00 = socket;
                    }
                }
                if (inputStream == null) {
                    inputStream = socket.getInputStream();
                }
                if (outputStream == null) {
                    outputStream = socket.getOutputStream();
                }
                C175248yO r8 = this.A04;
                if (inputStream != null) {
                    if (outputStream == null) {
                        th = AnonymousClass000.A0k("Required value was null.");
                        break;
                    } else {
                        r8.notifyAllObservers(new C20730AWl(inputStream, outputStream, this.A02.A05, 0));
                        return;
                    }
                } else {
                    th = AnonymousClass000.A0k("Required value was null.");
                    break;
                }
            } catch (IOException e) {
                i++;
                C108985cd.A1M(": Error connecting to server socket", AnonymousClass8BW.A0n(i, "p2p/WifiDirectScannerNetworkingThread/ Attempt "), e);
                if (i < 10) {
                    long j = ((long) i) * 1000;
                    try {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("p2p/WifiDirectScannerNetworkingThread/ Waiting ");
                        A10.append(j);
                        C17890vO.A1A(A10, " ms before retrying...");
                        Thread.sleep(j);
                    } catch (InterruptedException e2) {
                        AnonymousClass8BS.A0x();
                        Log.e("p2p/WifiDirectScannerNetworkingThread/ Thread interrupted during backoff", e2);
                    }
                } else if (this.A00 == null) {
                    Log.e("p2p/WifiDirectScannerNetworkingThread/ Failed to connect after 10 attempts.");
                    this.A04.A00(604, "error connecting to server socket");
                    AnonymousClass1EY.A02(this.A00);
                    interrupt();
                    Log.i("p2p/WifiDirectScannerNetworkingThread/ socket closed and thread interrupted");
                    return;
                } else {
                    return;
                }
            }
        }
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178009Bl(C182609Va r2, C175248yO r3, C20276AEj aEj, String str) {
        super("WifiDirectScannerNetworkingThread");
        C108985cd.A1D(r3, r2);
        this.A03 = str;
        this.A02 = aEj;
        this.A04 = r3;
        this.A01 = r2;
    }
}
