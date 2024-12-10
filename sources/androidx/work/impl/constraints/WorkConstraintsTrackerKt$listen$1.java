package androidx.work.impl.constraints;

import X.A2t;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4I4;
import X.AnonymousClass86L;
import X.C147197Se;
import X.C147267Sm;
import X.C18070vi;
import X.C189179ie;
import X.C192949pI;
import X.C23421Fz;
import X.C26092CsA;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import androidx.work.impl.constraints.controllers.ConstraintController$track$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class WorkConstraintsTrackerKt$listen$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass86L $listener;
    public final /* synthetic */ A2t $spec;
    public final /* synthetic */ C189179ie $this_listen;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerKt$listen$1(AnonymousClass86L r2, C189179ie r3, A2t a2t, C30391dr r5) {
        super(2, r5);
        this.$this_listen = r3;
        this.$spec = a2t;
        this.$listener = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new WorkConstraintsTrackerKt$listen$1(this.$listener, this.$this_listen, this.$spec, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C189179ie r0 = this.$this_listen;
            A2t a2t = this.$spec;
            C18070vi.A0d(a2t, 0);
            List list = r0.A00;
            ArrayList<C192949pI> A13 = AnonymousClass000.A13();
            for (Object next : list) {
                if (((C192949pI) next).A01(a2t)) {
                    A13.add(next);
                }
            }
            ArrayList A0D = C29351c6.A0D(A13);
            for (C192949pI constraintController$track$1 : A13) {
                A0D.add(AnonymousClass4I4.A00(new ConstraintController$track$1(constraintController$track$1, (C30391dr) null)));
            }
            C23421Fz A02 = C26092CsA.A02(new C147197Se(C29431cG.A0t(A0D).toArray(new C23421Fz[0]), 0));
            C147267Sm r02 = new C147267Sm(this.$listener, this.$spec, 0);
            this.label = 1;
            if (A02.BFC(this, r02) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WorkConstraintsTrackerKt$listen$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
