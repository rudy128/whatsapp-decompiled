package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C23381Fv;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37571pl;
import X.C37581pm;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", i = {}, l = {362}, m = "invokeSuspend", n = {}, s = {})
public final class LifecycleCoroutineScope$launchWhenCreated$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public int label;
    public final /* synthetic */ C37571pl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenCreated$1(C37571pl r2, C30391dr r3, AnonymousClass1OS r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$block = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.this$0, r5, this.$block);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23381Fv r2 = ((C37581pm) this.this$0).A00;
            AnonymousClass1OS r1 = this.$block;
            this.label = 1;
            if (PausingDispatcherKt$whenStateAtLeast$2.A00(C23401Fx.CREATED, r2, this, r1) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LifecycleCoroutineScope$launchWhenCreated$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
