package X;

import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;

public final /* synthetic */ class AAI implements WifiP2pManager.GroupInfoListener {
    public final /* synthetic */ C108935cY A00;
    public final /* synthetic */ C108935cY A01;

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        C108935cY r2 = this.A00;
        C108935cY r1 = this.A01;
        IntentFilter intentFilter = A2G.A08;
        if (wifiP2pGroup != null && wifiP2pGroup.isGroupOwner()) {
            wifiP2pGroup.getNetworkName();
            String networkName = wifiP2pGroup.getNetworkName();
            C18070vi.A0X(networkName);
            r2.BFN(networkName);
            String passphrase = wifiP2pGroup.getPassphrase();
            C18070vi.A0X(passphrase);
            r1.BFN(passphrase);
        }
    }

    public /* synthetic */ AAI(C108935cY r1, C108935cY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
