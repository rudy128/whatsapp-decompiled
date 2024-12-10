package X;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import com.whatsapp.util.Log;

public final class AAG implements WifiP2pManager.DnsSdServiceResponseListener {
    public final /* synthetic */ C173658vT A00;

    public void onDnsSdServiceAvailable(String str, String str2, WifiP2pDevice wifiP2pDevice) {
        C18070vi.A0e(str, 0, wifiP2pDevice);
        C173658vT r2 = this.A00;
        if (str.equals(r2.A04)) {
            Log.i("p2p/WifiDirectScannerManager/ Service discovered, instance name: matching, session ID: matching");
            BCZ bcz = r2.A03;
            if (bcz != null) {
                String str3 = wifiP2pDevice.deviceAddress;
                C18070vi.A0W(str3);
                bcz.C5H(str3);
            }
        } else if (AnonymousClass1YF.A0Y(str, "_chattransfer._whatsapp.com", false)) {
            Log.i("p2p/WifiDirectScannerManager/ Service discovered, instance name: matching, session ID: not matching");
            BCZ bcz2 = r2.A03;
            if (bcz2 != null) {
                bcz2.BtG("p2p/WifiDirectScannerManager/ Service discovered, instance name: matching, session ID: not matching");
            }
        } else {
            Log.i("p2p/WifiDirectScannerManager/ Service discovered, instance name: not matching");
        }
    }

    public AAG(C173658vT r1) {
        this.A00 = r1;
    }
}
