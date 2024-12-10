package X;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {357}, m = "reset", n = {"this"}, s = {"L$0"})
/* renamed from: X.0b7  reason: invalid class name */
public final class AnonymousClass0b7 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PressGestureScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0b7(PressGestureScopeImpl pressGestureScopeImpl, C30391dr r2) {
        super(r2);
        this.this$0 = pressGestureScopeImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02(this);
    }
}
