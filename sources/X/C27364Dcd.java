package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {762}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
/* renamed from: X.Dcd  reason: case insensitive filesystem */
public final class C27364Dcd extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27178DXn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27364Dcd(C30391dr r1, C27178DXn dXn) {
        super(r1);
        this.this$0 = dXn;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A02 = C27178DXn.A02(this, this.this$0);
        if (A02 != C31751g4.COROUTINE_SUSPENDED) {
            return new C26020Cqb(A02);
        }
        return A02;
    }
}
