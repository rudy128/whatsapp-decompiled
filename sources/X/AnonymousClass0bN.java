package X;

import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 1}, l = {98, 99}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
/* renamed from: X.0bN  reason: invalid class name */
public final class AnonymousClass0bN extends C30421du {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NestedScrollNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0bN(NestedScrollNode nestedScrollNode, C30391dr r2) {
        super(r2);
        this.this$0 = nestedScrollNode;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.C1K(this, 0);
    }
}
