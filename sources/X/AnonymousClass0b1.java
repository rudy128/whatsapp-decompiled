package X;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {206}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
/* renamed from: X.0b1  reason: invalid class name */
public final class AnonymousClass0b1 extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0b1(NestedScrollDispatcher nestedScrollDispatcher, C30391dr r2) {
        super(r2);
        this.this$0 = nestedScrollDispatcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this, 0);
    }
}
