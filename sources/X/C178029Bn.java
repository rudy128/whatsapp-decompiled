package X;

import android.net.wifi.p2p.WifiP2pManager;
import com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager;
import com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: X.9Bn  reason: invalid class name and case insensitive filesystem */
public final class C178029Bn extends C201010v {
    public Runnable A00;
    public Socket A01;
    public final C175248yO A02;
    public final AnonymousClass10I A03;
    public final ServerSocket A04;
    public final C183249Xn A05;
    public final String A06;

    public void run() {
        WifiDirectCreatorManager wifiDirectCreatorManager;
        WifiP2pManager wifiP2pManager;
        AnonymousClass10I r6 = this.A03;
        this.A00 = r6.CGv(new C21356Ail(this, 3), 300000);
        try {
            Log.i("p2p/WifiDirectCreatorNetworkingThread/ Waiting for donor to connect");
            this.A01 = this.A04.accept();
            Runnable runnable = this.A00;
            if (runnable != null) {
                r6.CEz(runnable);
            }
            Log.i("p2p/WifiDirectCreatorNetworkingThread/ Donor connected and restart removed");
            WifiGroupCreatorP2pTransferService wifiGroupCreatorP2pTransferService = this.A05.A00;
            C188019gk r0 = wifiGroupCreatorP2pTransferService.A03;
            if (!(r0 == null || (wifiDirectCreatorManager = r0.A01) == null)) {
                Log.i("p2p/WifiDirectCreatorConnectionHandler/ stopping discoverable service");
                WifiP2pManager.Channel channel = wifiDirectCreatorManager.A00;
                if (!(channel == null || (wifiP2pManager = wifiDirectCreatorManager.A01) == null)) {
                    wifiP2pManager.clearLocalServices(channel, (WifiP2pManager.ActionListener) null);
                }
                wifiDirectCreatorManager.A02();
            }
            AnonymousClass00H r02 = wifiGroupCreatorP2pTransferService.A04;
            if (r02 != null) {
                ((C175248yO) r02.get()).A01(AnonymousClass00R.A0C, (Integer) null);
                Socket socket = this.A01;
                if (socket != null) {
                    InputStream inputStream = socket.getInputStream();
                    OutputStream outputStream = socket.getOutputStream();
                    C175248yO r3 = this.A02;
                    C18070vi.A0b(inputStream);
                    C18070vi.A0b(outputStream);
                    String str = this.A06;
                    C18070vi.A0n(inputStream, outputStream, str);
                    r3.notifyAllObservers(new C20730AWl(inputStream, outputStream, str, 0));
                    return;
                }
                return;
            }
            C18070vi.A11("p2pTransferObservers");
            throw null;
        } catch (SocketException unused) {
            Log.i("p2p/WifiDirectCreatorNetworkingThread/ socket closed");
        } catch (IOException e) {
            Log.e("p2p/WifiDirectCreatorNetworkingThread/ server socket error occurred while waiting for connection", e);
            this.A02.A00(601, "server socket error occurred while waiting for connection");
            Runnable runnable2 = this.A00;
            if (runnable2 != null) {
                r6.CEz(runnable2);
            }
            AnonymousClass1EY.A02(this.A01);
            AnonymousClass1EY.A02(this.A04);
            interrupt();
            Log.i("p2p/WifiDirectCreatorNetworkingThread/ sockets closed and thread interrupted");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178029Bn(C175248yO r2, C183249Xn r3, AnonymousClass10I r4, String str, ServerSocket serverSocket) {
        super("WifiDirectCreatorNetworkingThread");
        C108985cd.A1D(r4, r2);
        this.A06 = str;
        this.A04 = serverSocket;
        this.A03 = r4;
        this.A02 = r2;
        this.A05 = r3;
    }
}
