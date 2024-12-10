package androidx.compose.foundation.lazy;

import X.AnonymousClass000;
import X.AnonymousClass0U0;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C05780Vr;
import X.C11610kO;
import X.C16680sp;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$1", f = "LazyListState.kt", i = {}, l = {495}, m = "invokeSuspend", n = {}, s = {})
public final class LazyListState$updateScrollDeltaForPostLookahead$2$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListState$updateScrollDeltaForPostLookahead$2$1(LazyListState lazyListState, C30391dr r3) {
        super(2, r3);
        this.this$0 = lazyListState;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((LazyListState$updateScrollDeltaForPostLookahead$2$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new LazyListState$updateScrollDeltaForPostLookahead$2$1(this.this$0, r4);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            LazyListState lazyListState = this.this$0;
            C16680sp r0 = LazyListState.A0R;
            C05780Vr r4 = lazyListState.A02;
            Float f = new Float(0.0f);
            AnonymousClass0U0 r02 = new AnonymousClass0U0(new Float(0.5f), 400.0f);
            this.label = 1;
            if (SuspendAnimationKt.A04(r02, r4, f, this, C11610kO.A00) == A03) {
                return A03;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
