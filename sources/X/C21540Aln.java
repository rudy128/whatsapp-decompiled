package X;

import com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler;
import com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler$connectToHotspot$1;
import com.whatsapp.util.Log;

/* renamed from: X.Aln  reason: case insensitive filesystem */
public final /* synthetic */ class C21540Aln implements C18090vk {
    public final /* synthetic */ WifiDirectScannerConnectionHandler A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final Object invoke() {
        WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        wifiDirectScannerConnectionHandler.A00++;
        Log.i("p2p/WifiDirectScannerConnectionHandler/ retryServiceDiscovery/stopping WiFiDirect since peer has not been discovered and trying to connect to hotspot");
        C173658vT r1 = wifiDirectScannerConnectionHandler.A03;
        if (r1 != null) {
            Log.i("p2p/WifiDirectScannerConnectionHandler/ stopping WifiDirect");
            r1.A01();
            wifiDirectScannerConnectionHandler.A03 = null;
        }
        AnonymousClass3MX.A1Q(new WifiDirectScannerConnectionHandler$connectToHotspot$1(wifiDirectScannerConnectionHandler, str, str2, str3, (C30391dr) null), wifiDirectScannerConnectionHandler.A0C);
        return C27621Wu.A00;
    }

    public /* synthetic */ C21540Aln(WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler, String str, String str2, String str3) {
        this.A00 = wifiDirectScannerConnectionHandler;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }
}
