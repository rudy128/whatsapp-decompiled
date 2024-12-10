package X;

import android.net.wifi.p2p.WifiP2pInfo;
import com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler;
import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;

public final class AWE implements BCZ {
    public CountDownLatch A00;
    public final /* synthetic */ WifiDirectScannerConnectionHandler A01;

    public void Bz2(WifiP2pInfo wifiP2pInfo) {
        String hostAddress;
        Log.i("p2p/WifiDirectScannerConnectionHandler/ onNetworkConnected");
        CountDownLatch countDownLatch = this.A00;
        if (countDownLatch == null || countDownLatch.getCount() != 0) {
            CountDownLatch countDownLatch2 = this.A00;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
            WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler = this.A01;
            WifiDirectScannerConnectionHandler.A03(wifiDirectScannerConnectionHandler);
            if (wifiP2pInfo.isGroupOwner) {
                int i = wifiDirectScannerConnectionHandler.A07.A00;
                C173638vR r0 = new C173638vR(new AWC(wifiDirectScannerConnectionHandler, 1), new C183229Xl(i), wifiDirectScannerConnectionHandler.A0B, wifiDirectScannerConnectionHandler.A0C);
                r0.start();
                wifiDirectScannerConnectionHandler.A02 = r0;
                return;
            }
            InetAddress inetAddress = wifiP2pInfo.groupOwnerAddress;
            if (inetAddress != null && inetAddress.getHostAddress() != null && (hostAddress = wifiP2pInfo.groupOwnerAddress.getHostAddress()) != null) {
                wifiDirectScannerConnectionHandler.A08.A00(hostAddress, 0);
                return;
            }
            return;
        }
        Log.i("p2p/WifiDirectScannerConnectionHandler/ onNetworkConnected/already connected, skipping");
    }

    public AWE(WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler) {
        this.A01 = wifiDirectScannerConnectionHandler;
    }

    public void Bpl() {
        Log.i("p2p/WifiDirectScannerConnectionHandler/ onConnectionChanged");
        WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler = this.A01;
        wifiDirectScannerConnectionHandler.A09.CGF(new C21356Ail(wifiDirectScannerConnectionHandler, 5));
    }

    public void BtG(String str) {
        Log.i("p2p/WifiDirectScannerConnectionHandler/ onError");
        WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler = this.A01;
        Runnable runnable = wifiDirectScannerConnectionHandler.A04;
        if (runnable != null) {
            wifiDirectScannerConnectionHandler.A09.CEz(runnable);
        }
        wifiDirectScannerConnectionHandler.A09.CGF(new C21454AkL(wifiDirectScannerConnectionHandler, str));
    }

    public void C5H(String str) {
        Log.i("p2p/WifiDirectScannerConnectionHandler/ onServiceFound");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.A00 = countDownLatch;
        WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler = this.A01;
        C21467AkY.A00(wifiDirectScannerConnectionHandler.A09, wifiDirectScannerConnectionHandler, countDownLatch, str, 41);
    }
}
