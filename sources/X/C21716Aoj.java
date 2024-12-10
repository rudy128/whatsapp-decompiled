package X;

import com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager", f = "WifiDirectCreatorManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {98}, m = "createGroup", n = {"this", "p2pTransferObservers", "ssid", "passphrase", "ipAddress", "manager", "channel", "port", "numValuesAwaiting"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
/* renamed from: X.Aoj  reason: case insensitive filesystem */
public final class C21716Aoj extends C30421du {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WifiDirectCreatorManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21716Aoj(WifiDirectCreatorManager wifiDirectCreatorManager, C30391dr r2) {
        super(r2);
        this.this$0 = wifiDirectCreatorManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WifiDirectCreatorManager.A00((C175248yO) null, this.this$0, (String) null, this, 0);
    }
}
