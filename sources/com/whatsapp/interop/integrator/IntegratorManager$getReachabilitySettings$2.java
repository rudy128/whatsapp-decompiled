package com.whatsapp.interop.integrator;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass9CX;
import X.AnonymousClass9FT;
import X.AnonymousClass9FU;
import X.B6K;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C33971jg;
import X.C34651kr;
import X.C96544o1;
import X.C96554o2;
import X.C96564o3;
import com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.integrator.IntegratorManager$getReachabilitySettings$2", f = "IntegratorManager.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
public final class IntegratorManager$getReachabilitySettings$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C34651kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegratorManager$getReachabilitySettings$2(C34651kr r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new IntegratorManager$getReachabilitySettings$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new IntegratorManager$getReachabilitySettings$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            obj = ((DmaInteropRPCManager) this.this$0.A02.get()).A09(this, 457);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        B6K b6k = (B6K) obj;
        if (b6k instanceof AnonymousClass9FU) {
            AnonymousClass9FU r6 = (AnonymousClass9FU) b6k;
            boolean A18 = C18070vi.A18(r6.A00, "true");
            C17880vN.A1F(C33971jg.A00(AnonymousClass3MX.A0k(this.this$0.A03)).edit(), "interop_reach_enabled", A18);
            if (!A18) {
                return C96554o2.A00;
            }
            List<AnonymousClass9CX> list = r6.A01;
            ArrayList A0D = C29351c6.A0D(list);
            for (AnonymousClass9CX r0 : list) {
                A0D.add(AnonymousClass3MW.A0v((int) r0.A00));
            }
            AnonymousClass3MX.A0k(this.this$0.A03).A03(A0D);
            return new C96544o1(A0D);
        } else if ((b6k instanceof AnonymousClass9FT) || b6k == null) {
            return C96564o3.A00;
        } else {
            throw AnonymousClass3MW.A14();
        }
    }
}
