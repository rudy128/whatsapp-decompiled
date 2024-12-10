package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0, 1}, l = {820, 822}, m = "onDragStopped-sF-c-tU", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: X.0bA  reason: invalid class name and case insensitive filesystem */
public final class C07480bA extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07480bA(ScrollingLogic scrollingLogic, C30391dr r2) {
        super(r2);
        this.this$0 = scrollingLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A06(this, 0);
    }
}
