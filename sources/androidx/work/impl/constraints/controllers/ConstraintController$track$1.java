package androidx.work.impl.constraints.controllers;

import X.A5Z;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.AnonymousClass8KB;
import X.AnonymousClass8KC;
import X.C108475bl;
import X.C17890vO;
import X.C17900vP;
import X.C182049Sw;
import X.C192949pI;
import X.C196019uK;
import X.C20357AHn;
import X.C22007Aw9;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.LinkedHashSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", f = "ContraintControllers.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class ConstraintController$track$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C192949pI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintController$track$1(C192949pI r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ConstraintController$track$1 constraintController$track$1 = new ConstraintController$track$1(this.this$0, r4);
        constraintController$track$1.L$0 = obj;
        return constraintController$track$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r3 = (C108475bl) this.L$0;
            C192949pI r0 = this.this$0;
            C20357AHn aHn = new C20357AHn(r0, r3);
            C196019uK r9 = r0.A00;
            synchronized (r9.A02) {
                LinkedHashSet linkedHashSet = r9.A03;
                if (linkedHashSet.add(aHn)) {
                    if (linkedHashSet.size() == 1) {
                        r9.A00 = r9.A04();
                        A5Z A00 = A5Z.A00();
                        String str = C182049Sw.A00;
                        StringBuilder A10 = AnonymousClass000.A10();
                        C17900vP.A0a(r9, A10);
                        A10.append(": initial state = ");
                        A00.A03(str, C17890vO.A0V(r9.A00, A10));
                        r9.A05();
                    }
                    Object obj3 = r9.A00;
                    C192949pI r1 = aHn.A00;
                    if (r1.A02(obj3)) {
                        obj2 = new AnonymousClass8KB(r1.A00());
                    } else {
                        obj2 = AnonymousClass8KC.A00;
                    }
                    aHn.A01.CQ0(obj2);
                }
            }
            C22007Aw9 aw9 = new C22007Aw9(aHn, this.this$0);
            this.label = 1;
            if (AnonymousClass4W9.A00(this, aw9, r3) == r4) {
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
        return ((ConstraintController$track$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
