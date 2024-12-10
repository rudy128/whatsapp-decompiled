package X;

import com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler", f = "WifiDirectScannerConnectionHandler.kt", i = {0, 0}, l = {220}, m = "connectUsingWifiManager", n = {"this", "wifiStateReceiver"}, s = {"L$0", "L$1"})
/* renamed from: X.AoE  reason: case insensitive filesystem */
public final class C21685AoE extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WifiDirectScannerConnectionHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21685AoE(WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler, C30391dr r2) {
        super(r2);
        this.this$0 = wifiDirectScannerConnectionHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WifiDirectScannerConnectionHandler.A01(this.this$0, (String) null, (String) null, this);
    }
}
