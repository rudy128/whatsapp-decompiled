package androidx.compose.foundation.lazy;

import X.AnonymousClass000;
import X.AnonymousClass0OG;
import X.AnonymousClass0OM;
import X.AnonymousClass1OS;
import X.C16100ri;
import X.C16450sH;
import X.C17080ti;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LazyListState$scrollToItem$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public int label;
    public final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(LazyListState lazyListState, C30391dr r3, int i, int i2) {
        super(2, r3);
        this.this$0 = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    /* renamed from: A00 */
    public final Object invoke(C16100ri r3, C30391dr r4) {
        return ((LazyListState$scrollToItem$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new LazyListState$scrollToItem$2(this.this$0, r6, this.$index, this.$scrollOffset);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            LazyListState lazyListState = this.this$0;
            int i = this.$index;
            int i2 = this.$scrollOffset;
            AnonymousClass0OG r1 = lazyListState.A0F;
            AnonymousClass0OG.A00(r1, i, i2);
            r1.A00 = null;
            AnonymousClass0OM r12 = lazyListState.A0E;
            r12.A01.clear();
            r12.A00 = C17080ti.A00;
            C16450sH r0 = lazyListState.A04;
            if (r0 != null) {
                r0.BLX();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
