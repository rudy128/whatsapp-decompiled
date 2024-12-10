package X;

import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0, 0}, l = {35}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
/* renamed from: X.0bK  reason: invalid class name and case insensitive filesystem */
public final class C07550bK extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AwaitFirstLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07550bK(AwaitFirstLayoutModifier awaitFirstLayoutModifier, C30391dr r2) {
        super(r2);
        this.this$0 = awaitFirstLayoutModifier;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
