package X;

import android.net.wifi.p2p.WifiP2pInfo;
import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.Socket;

public final class AWD implements BCZ {
    public final int A00;
    public final /* synthetic */ C188019gk A01;

    public void C5H(String str) {
    }

    public AWD(C188019gk r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void Bpl() {
        Log.i("p2p/WifiDirectCreatorConnectionHandler/ onConnectionChanged");
        C188019gk r3 = this.A01;
        r3.A04.CGF(new C21356Ail(r3, 2));
    }

    public void BtG(String str) {
        Log.i("p2p/WifiDirectCreatorConnectionHandler/ onError");
        C188019gk r2 = this.A01;
        r2.A04.CGF(new C21454AkL(r2, str));
    }

    public void Bz2(WifiP2pInfo wifiP2pInfo) {
        InetAddress inetAddress;
        String hostAddress;
        Log.i("p2p/WifiDirectCreatorConnectionHandler/ onNetworkConnected");
        if (!wifiP2pInfo.isGroupOwner && (inetAddress = wifiP2pInfo.groupOwnerAddress) != null && (hostAddress = inetAddress.getHostAddress()) != null) {
            C188019gk r1 = this.A01;
            int i = this.A00;
            Socket socket = new Socket();
            C173648vS r2 = new C173648vS(new AWC(r1, 0), hostAddress, socket, r1.A05, r1.A06, i);
            r2.start();
            r1.A00 = r2;
        }
    }
}
