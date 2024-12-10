package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0}, l = {831}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"})
/* renamed from: X.0b9  reason: invalid class name */
public final class AnonymousClass0b9 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0b9(ScrollingLogic scrollingLogic, C30391dr r2) {
        super(r2);
        this.this$0 = scrollingLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A05(this, 0);
    }
}
