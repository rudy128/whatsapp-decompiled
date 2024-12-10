package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import com.whatsapp.util.Log;

/* renamed from: X.8Bx  reason: invalid class name and case insensitive filesystem */
public final class C161148Bx extends BroadcastReceiver {
    public final /* synthetic */ WifiConfiguration A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C108935cY A02;

    public void onReceive(Context context, Intent intent) {
        boolean z;
        String str;
        C18070vi.A0d(intent, 1);
        try {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            WifiInfo wifiInfo = (WifiInfo) intent.getParcelableExtra("wifiInfo");
            if (networkInfo != null) {
                z = networkInfo.isConnected();
            } else {
                z = false;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("p2p/WifiDirectScannerConnectionHandler/ Broadcast receiver triggered, ssid: ");
            NetworkInfo.DetailedState detailedState = null;
            if (wifiInfo != null) {
                str = wifiInfo.getSSID();
            } else {
                str = null;
            }
            A10.append(str);
            A10.append(", success: ");
            A10.append(z);
            A10.append(", detailed state: ");
            if (networkInfo != null) {
                detailedState = networkInfo.getDetailedState();
            }
            C17900vP.A0b(detailedState, A10);
            if (z && wifiInfo != null && wifiInfo.getSSID() != null && C18070vi.A18(wifiInfo.getSSID(), this.A00.SSID)) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("p2p/WifiDirectScannerConnectionHandler/ Successfully connected to ");
                C17890vO.A1A(A102, this.A01);
                this.A02.BFN(true);
            }
        } catch (Exception e) {
            Log.e("p2p/WifiDirectScannerConnectionHandler/ Error handling WiFi state change", e);
            this.A02.BFO(e);
        }
    }

    public C161148Bx(WifiConfiguration wifiConfiguration, String str, C108935cY r3) {
        this.A00 = wifiConfiguration;
        this.A01 = str;
        this.A02 = r3;
    }
}
