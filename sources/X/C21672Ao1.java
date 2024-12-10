package X;

import com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager", f = "DmaInteropRPCManager.kt", i = {0}, l = {477}, m = "sendGetReachabilitySettingsRPCWithResult", n = {"request"}, s = {"L$0"})
/* renamed from: X.Ao1  reason: case insensitive filesystem */
public final class C21672Ao1 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DmaInteropRPCManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21672Ao1(DmaInteropRPCManager dmaInteropRPCManager, C30391dr r2) {
        super(r2);
        this.this$0 = dmaInteropRPCManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0A(this, 0);
    }
}
