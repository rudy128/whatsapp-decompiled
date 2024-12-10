package X;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {728}, m = "withTimeout", n = {"job"}, s = {"L$0"})
/* renamed from: X.0bE  reason: invalid class name */
public final class AnonymousClass0bE extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0bE(SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, C30391dr r2) {
        super(r2);
        this.this$0 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.CSF(this, (AnonymousClass1OS) null, 0);
    }
}
