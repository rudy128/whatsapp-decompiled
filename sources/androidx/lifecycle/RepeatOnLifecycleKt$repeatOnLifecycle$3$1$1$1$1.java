package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35911n2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {171, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public final /* synthetic */ C35911n2 $mutex;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(C30391dr r2, AnonymousClass1OS r3, C35911n2 r4) {
        super(2, r2);
        this.$mutex = r4;
        this.$block = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(r5, this.$block, this.$mutex);
    }

    public final Object invokeSuspend(Object obj) {
        C35911n2 r2;
        AnonymousClass1OS r1;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r2 = this.$mutex;
            r1 = this.$block;
            this.L$0 = r2;
            this.L$1 = r1;
            this.label = 1;
            if (r2.Bhx(this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            r1 = (AnonymousClass1OS) this.L$1;
            r2 = (C35911n2) this.L$0;
            C30691eM.A01(obj);
        } else if (i == 2) {
            r2 = (C35911n2) this.L$0;
            try {
                C30691eM.A01(obj);
                C27621Wu r0 = C27621Wu.A00;
                r2.CQ9((Object) null);
                return r0;
            } catch (Throwable th) {
                th = th;
                r2.CQ9((Object) null);
                throw th;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        try {
            RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1((C30391dr) null, r1);
            this.L$0 = r2;
            this.L$1 = null;
            this.label = 2;
            if (AnonymousClass1OW.A00(this, repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1) == r5) {
                return r5;
            }
            C27621Wu r02 = C27621Wu.A00;
            r2.CQ9((Object) null);
            return r02;
        } catch (Throwable th2) {
            th = th2;
            r2.CQ9((Object) null);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
