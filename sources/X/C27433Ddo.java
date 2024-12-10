package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3087}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* renamed from: X.Ddo  reason: case insensitive filesystem */
public final class C27433Ddo extends C30421du {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27178DXn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27433Ddo(C30391dr r1, C27178DXn dXn) {
        super(r1);
        this.this$0 = dXn;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A03 = C27178DXn.A03(this, this.this$0, (C28244Du5) null, 0, 0);
        if (A03 != C31751g4.COROUTINE_SUSPENDED) {
            return new C26020Cqb(A03);
        }
        return A03;
    }
}
