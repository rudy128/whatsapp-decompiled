package X;

import com.whatsapp.wapdata.generated.md.outgoing.MdRPCManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wapdata.generated.md.outgoing.MdRPCManager", f = "MdRPCManager.kt", i = {}, l = {512}, m = "sendSetPrimaryEphemeralIdentityRPC", n = {}, s = {})
/* renamed from: X.3FD  reason: invalid class name */
public final class AnonymousClass3FD extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MdRPCManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FD(MdRPCManager mdRPCManager, C30391dr r2) {
        super(r2);
        this.this$0 = mdRPCManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((String) null, this, (byte[]) null, 0);
    }
}
