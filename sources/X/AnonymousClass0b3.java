package X;

import androidx.compose.foundation.HoverableNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {116}, m = "emitExit", n = {"this"}, s = {"L$0"})
/* renamed from: X.0b3  reason: invalid class name */
public final class AnonymousClass0b3 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HoverableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0b3(HoverableNode hoverableNode, C30391dr r2) {
        super(r2);
        this.this$0 = hoverableNode;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0O(this);
    }
}
