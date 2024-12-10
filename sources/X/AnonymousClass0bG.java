package X;

import androidx.compose.foundation.HoverableNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0, 0}, l = {108}, m = "emitEnter", n = {"this", "interaction"}, s = {"L$0", "L$1"})
/* renamed from: X.0bG  reason: invalid class name */
public final class AnonymousClass0bG extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HoverableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0bG(HoverableNode hoverableNode, C30391dr r2) {
        super(r2);
        this.this$0 = hoverableNode;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0N(this);
    }
}
