package X;

import com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager;
import com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler;
import com.whatsapp.util.Log;

public class AWC implements B8J {
    public final int A00;
    public final Object A01;

    public AWC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bsl() {
        C175248yO r2;
        int i;
        String str;
        if (this.A00 != 0) {
            Log.e("p2p/WifiDirectScannerConnectionHandler/ Unable to get IP");
            r2 = ((WifiDirectScannerConnectionHandler) this.A01).A06;
            i = 603;
            str = null;
        } else {
            Log.e("p2p/WifiDirectCreatorConnectionHandler/ Failure sending IP address");
            C188019gk r1 = (C188019gk) this.A01;
            WifiDirectCreatorManager wifiDirectCreatorManager = r1.A01;
            if (wifiDirectCreatorManager != null) {
                wifiDirectCreatorManager.A01();
            }
            C173648vS r0 = r1.A00;
            if (r0 != null) {
                r0.A00();
            }
            r2 = r1.A02;
            i = 602;
            str = "fpm/ReceiverConnectionHandler/Failure sending IP address";
        }
        r2.A00(i, str);
    }
}
