package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass1IN;
import X.AnonymousClass1IT;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C18600wl;
import X.C218317o;
import X.C23381Fv;
import X.C23391Fw;
import X.C23401Fx;
import X.C23871Hy;
import X.C27581Wq;
import X.C27591Wr;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C35921n3;
import X.C72473Md;
import X.C91414fe;
import X.C98494rF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public final /* synthetic */ C23401Fx $state;
    public final /* synthetic */ C23381Fv $this_repeatOnLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            C23381Fv r2 = r5;
            return new AnonymousClass1(r4, r2, r8, r7, r8);
        }

        public final Object invokeSuspend(Object obj) {
            C98494rF r9;
            C98494rF r1;
            C27581Wq r6;
            C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                C23381Fv r4 = r5;
                if (((C23391Fw) r4).A02 != C23401Fx.DESTROYED) {
                    r9 = C98494rF.A00();
                    r1 = C98494rF.A00();
                    C23401Fx r5 = r4;
                    AnonymousClass1OX r11 = r8;
                    AnonymousClass1OS r8 = r7;
                    this.L$0 = r9;
                    this.L$1 = r1;
                    this.L$2 = r5;
                    this.L$3 = r4;
                    this.L$4 = r11;
                    this.L$5 = r8;
                    this.label = 1;
                    C31781g7 A0m = C72473Md.A0m(this);
                    C18070vi.A0d(r5, 0);
                    int ordinal = r5.ordinal();
                    if (ordinal == 2) {
                        r6 = C27581Wq.ON_CREATE;
                    } else if (ordinal == 3) {
                        r6 = C27581Wq.ON_START;
                    } else if (ordinal != 4) {
                        r6 = null;
                    } else {
                        r6 = C27581Wq.ON_RESUME;
                    }
                    C91414fe r52 = new C91414fe(r6, C27591Wr.A00(r5), r8, r9, A0m, r11, new C35921n3());
                    r1.element = r52;
                    r4.A05(r52);
                    if (A0m.A0C() == r3) {
                        return r3;
                    }
                }
                return C27621Wu.A00;
            } else if (i == 1) {
                r1 = (C98494rF) this.L$1;
                r9 = (C98494rF) this.L$0;
                try {
                    C30691eM.A01(obj);
                } catch (Throwable th) {
                    AnonymousClass3Ma.A1R((AnonymousClass1OB) r9.element);
                    C218317o r12 = (C218317o) r1.element;
                    if (r12 != null) {
                        r5.A06(r12);
                    }
                    throw th;
                }
            } else {
                throw AnonymousClass000.A0l();
            }
            AnonymousClass3Ma.A1R((AnonymousClass1OB) r9.element);
            C218317o r13 = (C218317o) r1.element;
            if (r13 != null) {
                r5.A06(r13);
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(C23401Fx r2, C23381Fv r3, C30391dr r4, AnonymousClass1OS r5) {
        super(2, r4);
        this.$this_repeatOnLifecycle = r3;
        this.$state = r2;
        this.$block = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$state, this.$this_repeatOnLifecycle, r6, this.$block);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass1OX r8 = (AnonymousClass1OX) this.L$0;
            C18600wl r0 = C23871Hy.A00;
            AnonymousClass1IT r02 = ((AnonymousClass1IT) AnonymousClass1IN.A00).A01;
            final C23381Fv r5 = this.$this_repeatOnLifecycle;
            final C23401Fx r4 = this.$state;
            final AnonymousClass1OS r7 = this.$block;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r02, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
