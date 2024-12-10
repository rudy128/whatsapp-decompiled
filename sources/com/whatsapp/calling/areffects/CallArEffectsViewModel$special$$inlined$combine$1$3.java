package com.whatsapp.calling.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.C106575Wj;
import X.C108335bX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.CallArEffectsViewModel$special$$inlined$combine$1$3", f = "CallArEffectsViewModel.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
public final class CallArEffectsViewModel$special$$inlined$combine$1$3 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public CallArEffectsViewModel$special$$inlined$combine$1$3(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        CallArEffectsViewModel$special$$inlined$combine$1$3 callArEffectsViewModel$special$$inlined$combine$1$3 = new CallArEffectsViewModel$special$$inlined$combine$1$3((C30391dr) obj3);
        callArEffectsViewModel$special$$inlined$combine$1$3.L$0 = obj;
        callArEffectsViewModel$special$$inlined$combine$1$3.L$1 = obj2;
        return callArEffectsViewModel$special$$inlined$combine$1$3.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C108335bX r1;
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r6 = (AnonymousClass1G2) this.L$0;
            C106575Wj[] r5 = (C106575Wj[]) ((Object[]) this.L$1);
            ArrayList A13 = AnonymousClass000.A13();
            for (C106575Wj r12 : r5) {
                if ((r12 instanceof C108335bX) && (r1 = (C108335bX) r12) != null) {
                    A13.add(r1.BUA());
                }
            }
            this.label = 1;
            if (r6.BJt(A13, this) == r8) {
                return r8;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
