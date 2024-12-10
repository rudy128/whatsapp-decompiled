package androidx.compose.foundation.lazy.layout;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C16620sj;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $index;
    public final /* synthetic */ C16620sj $state;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2(C16620sj r2, C30391dr r3, int i) {
        super(2, r3);
        this.$state = r2;
        this.$index = i;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2(this.$state, r5, this.$index);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C16620sj r1 = this.$state;
            int i2 = this.$index;
            this.label = 1;
            if (r1.CH2(this, i2) == A03) {
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
