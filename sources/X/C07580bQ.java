package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", i = {0, 0, 0}, l = {294, 295}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.0bQ  reason: invalid class name and case insensitive filesystem */
public final class C07580bQ extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07580bQ(LazyListState lazyListState, C30391dr r2) {
        super(r2);
        this.this$0 = lazyListState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.CH0((AnonymousClass0CH) null, this, (AnonymousClass1OS) null);
    }
}
