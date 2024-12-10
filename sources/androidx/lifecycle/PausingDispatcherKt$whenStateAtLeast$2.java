package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass1IN;
import X.AnonymousClass1IT;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C18600wl;
import X.C22342B3t;
import X.C23381Fv;
import X.C23401Fx;
import X.C23871Hy;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C86074Qb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
public final class PausingDispatcherKt$whenStateAtLeast$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public final /* synthetic */ C23401Fx $minState;
    public final /* synthetic */ C23381Fv $this_whenStateAtLeast;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(C23401Fx r2, C23381Fv r3, C30391dr r4, AnonymousClass1OS r5) {
        super(2, r4);
        this.$this_whenStateAtLeast = r3;
        this.$minState = r2;
        this.$block = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$minState, this.$this_whenStateAtLeast, r6, this.$block);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public static Object A00(C23401Fx r3, C23381Fv r4, C30391dr r5, AnonymousClass1OS r6) {
        C18600wl r0 = C23871Hy.A00;
        return C30451dy.A00(r5, ((AnonymousClass1IT) AnonymousClass1IN.A00).A01, new PausingDispatcherKt$whenStateAtLeast$2(r3, r4, (C30391dr) null, r6));
    }

    public final Object invokeSuspend(Object obj) {
        C86074Qb r5;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OB r4 = (AnonymousClass1OB) ((AnonymousClass1OX) this.L$0).getCoroutineContext().get(AnonymousClass1OB.A00);
            if (r4 != null) {
                C22342B3t b3t = new C22342B3t();
                C23381Fv r2 = this.$this_whenStateAtLeast;
                r5 = new C86074Qb(b3t.A00, this.$minState, r2, r4);
                AnonymousClass1OS r0 = this.$block;
                this.L$0 = r5;
                this.label = 1;
                obj = C30451dy.A00(this, b3t, r0);
                if (obj == r7) {
                    return r7;
                }
            } else {
                throw AnonymousClass000.A0n("when[State] methods should have a parent job");
            }
        } else if (i == 1) {
            r5 = (C86074Qb) this.L$0;
            try {
                C30691eM.A01(obj);
            } catch (Throwable th) {
                r5.A00();
                throw th;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        r5.A00();
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
