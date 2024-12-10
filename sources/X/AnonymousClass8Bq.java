package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pInfo;
import com.whatsapp.util.Log;

/* renamed from: X.8Bq  reason: invalid class name */
public final class AnonymousClass8Bq extends BroadcastReceiver {
    public BCZ A00;

    public void onReceive(Context context, Intent intent) {
        C18070vi.A0d(intent, 1);
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            WifiP2pInfo wifiP2pInfo = (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
            if (wifiP2pInfo == null) {
                Log.w("p2p/WifiDirectManager/ WiFi P2P broadcast connection changed action with null WifiP2pInfo.");
            } else if (!wifiP2pInfo.groupFormed) {
                Log.i("p2p/WifiDirectManager/ WiFi P2P broadcast connection changed action, group not formed");
            } else {
                BCZ bcz = this.A00;
                if (bcz != null) {
                    bcz.Bpl();
                }
            }
        }
    }
}
