package X;

import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import java.net.InetAddress;

public class AAF implements WifiP2pManager.ConnectionInfoListener {
    public final int A00;
    public final Object A01;

    public AAF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
        InetAddress inetAddress;
        String hostAddress;
        if (this.A00 != 0) {
            IntentFilter intentFilter = A2G.A08;
            StringBuilder A19 = AnonymousClass3MZ.A19(wifiP2pInfo, 1);
            A19.append("p2p/WifiDirectManager/Connection information available. group_formed: ");
            A19.append(wifiP2pInfo.groupFormed);
            A19.append(" group_owner: ");
            C17900vP.A0r(A19, wifiP2pInfo.isGroupOwner);
            BCZ bcz = ((A2G) this.A01).A03;
            if (bcz != null) {
                bcz.Bz2(wifiP2pInfo);
                return;
            }
            return;
        }
        C108935cY r1 = (C108935cY) this.A01;
        IntentFilter intentFilter2 = A2G.A08;
        if (wifiP2pInfo != null && (inetAddress = wifiP2pInfo.groupOwnerAddress) != null && (hostAddress = inetAddress.getHostAddress()) != null) {
            r1.BFN(hostAddress);
        }
    }
}
