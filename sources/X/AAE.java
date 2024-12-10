package X;

import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pManager;

public final /* synthetic */ class AAE implements WifiP2pManager.ChannelListener {
    public final /* synthetic */ A2G A00;

    public final void onChannelDisconnected() {
        A2G a2g = this.A00;
        IntentFilter intentFilter = A2G.A08;
        BCZ bcz = a2g.A03;
        if (bcz != null) {
            bcz.BtG("onChannelDisconnected");
        }
    }

    public /* synthetic */ AAE(A2G a2g) {
        this.A00 = a2g;
    }
}
