package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108475bl;
import X.C108495bn;
import X.C23381Fv;
import X.C23401Fx;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99624tC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
public final class FlowExtKt$flowWithLifecycle$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23381Fv $lifecycle;
    public final /* synthetic */ C23401Fx $minActiveState;
    public final /* synthetic */ C23421Fz $this_flowWithLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r5, r42, r1);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                C23421Fz r2 = r1;
                C99624tC A00 = C99624tC.A00(r42, 0);
                this.label = 1;
                if (r2.BFC(this, A00) == r4) {
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
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(C23401Fx r2, C23381Fv r3, C30391dr r4, C23421Fz r5) {
        super(2, r4);
        this.$lifecycle = r3;
        this.$minActiveState = r2;
        this.$this_flowWithLifecycle = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$minActiveState, this.$lifecycle, r6, this.$this_flowWithLifecycle);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    public final Object invokeSuspend(Object obj) {
        C108495bn r4;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C108475bl r42 = (C108475bl) this.L$0;
            C23381Fv r3 = this.$lifecycle;
            C23401Fx r2 = this.$minActiveState;
            final C23421Fz r1 = this.$this_flowWithLifecycle;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.L$0 = r42;
            this.label = 1;
            r4 = r42;
            if (C87334Ve.A00(r2, r3, this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
            r4 = (C108495bn) this.L$0;
        } else {
            throw AnonymousClass000.A0l();
        }
        r4.BF8((Throwable) null);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$flowWithLifecycle$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
