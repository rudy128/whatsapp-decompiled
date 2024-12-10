package X;

import androidx.compose.foundation.gestures.AbstractDraggableNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {536, 539, 541}, m = "processDragStart", n = {"this", "$this$processDragStart", "event", "this", "$this$processDragStart", "event", "interaction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: X.0bT  reason: invalid class name and case insensitive filesystem */
public final class C07610bT extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07610bT(AbstractDraggableNode abstractDraggableNode, C30391dr r2) {
        super(r2);
        this.this$0 = abstractDraggableNode;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A03((AnonymousClass07E) null, this, (AnonymousClass1OX) null);
    }
}
