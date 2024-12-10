package X;

import androidx.compose.foundation.gestures.DraggableKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0}, l = {689}, m = "onDragOrUp-Axegvzg", n = {"hasDragged", "onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: X.0bU  reason: invalid class name and case insensitive filesystem */
public final class C07620bU extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;

    public C07620bU(C30391dr r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DraggableKt.A04((C17750vA) null, this, (C22821Di) null, (C22821Di) null, 0);
    }
}
