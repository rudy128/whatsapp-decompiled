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

@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ float $delta;
    public final /* synthetic */ C16620sj $state;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1(C16620sj r2, C30391dr r3, float f) {
        super(2, r3);
        this.$state = r2;
        this.$delta = f;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1(this.$state, r5, this.$delta);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C16620sj r1 = this.$state;
            float f = this.$delta;
            this.label = 1;
            if (r1.BC5(this, f) == A03) {
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
