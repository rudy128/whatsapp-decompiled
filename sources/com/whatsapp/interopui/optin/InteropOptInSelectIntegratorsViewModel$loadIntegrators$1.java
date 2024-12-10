package com.whatsapp.interopui.optin;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass422;
import X.AnonymousClass423;
import X.AnonymousClass424;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C34651kr;
import X.C83244Ej;
import X.C86884Tl;
import X.C88314Ze;
import X.C89514ca;
import com.whatsapp.interop.integrator.IntegratorManager$refreshIntegrators$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel$loadIntegrators$1", f = "InteropOptInSelectIntegratorsViewModel.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class InteropOptInSelectIntegratorsViewModel$loadIntegrators$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ InteropOptInSelectIntegratorsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropOptInSelectIntegratorsViewModel$loadIntegrators$1(InteropOptInSelectIntegratorsViewModel interopOptInSelectIntegratorsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = interopOptInSelectIntegratorsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InteropOptInSelectIntegratorsViewModel$loadIntegrators$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropOptInSelectIntegratorsViewModel$loadIntegrators$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1DT r3;
        Object obj2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34651kr r32 = (C34651kr) this.this$0.A09.get();
            this.label = 1;
            obj = C30451dy.A00(this, r32.A04, new IntegratorManager$refreshIntegrators$2(r32, (C30391dr) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C83244Ej r8 = (C83244Ej) obj;
        if (r8 instanceof AnonymousClass423) {
            List list = ((AnonymousClass423) r8).A00;
            ArrayList<C89514ca> A13 = AnonymousClass000.A13();
            for (Object next : list) {
                Integer num = ((C89514ca) next).A02;
                if (num == AnonymousClass00R.A01 || num == AnonymousClass00R.A00) {
                    A13.add(next);
                }
            }
            AnonymousClass1DT r5 = this.this$0.A03;
            ArrayList A0D = C29351c6.A0D(A13);
            for (C89514ca r2 : A13) {
                A0D.add(new C86884Tl(r2, r2.A05));
            }
            r5.A0E(A0D);
            r3 = this.this$0.A05;
            int i2 = 0;
            if (!(A13 instanceof Collection) || !A13.isEmpty()) {
                for (C89514ca r0 : A13) {
                    if (r0.A05 && (i2 = i2 + 1) < 0) {
                        AnonymousClass1ZU.A0A();
                        throw null;
                    }
                }
            }
            obj2 = AnonymousClass3MW.A0v(i2);
            r3.A0E(obj2);
        } else if (r8 instanceof AnonymousClass422) {
            this.this$0.A06.A0E(C88314Ze.A00(((AnonymousClass422) r8).A00));
        } else if (r8 instanceof AnonymousClass424) {
            r3 = this.this$0.A06;
            obj2 = C88314Ze.A00(810);
            r3.A0E(obj2);
        } else {
            throw AnonymousClass3MW.A14();
        }
        return C27621Wu.A00;
    }
}
