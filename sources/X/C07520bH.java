package X;

import androidx.compose.foundation.gestures.AbstractDraggableNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0}, l = {554, 557}, m = "processDragCancel", n = {"this", "$this$processDragCancel"}, s = {"L$0", "L$1"})
/* renamed from: X.0bH  reason: invalid class name and case insensitive filesystem */
public final class C07520bH extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07520bH(AbstractDraggableNode abstractDraggableNode, C30391dr r2) {
        super(r2);
        this.this$0 = abstractDraggableNode;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A05(this, (AnonymousClass1OX) null);
    }
}
