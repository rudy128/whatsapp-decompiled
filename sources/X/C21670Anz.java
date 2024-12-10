package X;

import com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager", f = "DmaInteropRPCManager.kt", i = {0}, l = {66}, m = "sendFetchRPCWithResult", n = {"request"}, s = {"L$0"})
/* renamed from: X.Anz  reason: case insensitive filesystem */
public final class C21670Anz extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DmaInteropRPCManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21670Anz(DmaInteropRPCManager dmaInteropRPCManager, C30391dr r2) {
        super(r2);
        this.this$0 = dmaInteropRPCManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A08(this, 0);
    }
}
