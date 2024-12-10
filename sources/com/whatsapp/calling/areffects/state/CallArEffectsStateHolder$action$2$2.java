package com.whatsapp.calling.areffects.state;

import X.AnonymousClass000;
import X.C107135Yn;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.state.CallArEffectsStateHolder$action$2$2", f = "CallArEffectsStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallArEffectsStateHolder$action$2$2 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public CallArEffectsStateHolder$action$2$2(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        CallArEffectsStateHolder$action$2$2 callArEffectsStateHolder$action$2$2 = new CallArEffectsStateHolder$action$2$2((C30391dr) obj3);
        callArEffectsStateHolder$action$2$2.L$0 = obj;
        callArEffectsStateHolder$action$2$2.L$1 = obj2;
        return callArEffectsStateHolder$action$2$2.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C107135Yn r2 = (C107135Yn) this.L$0;
            C107135Yn r1 = (C107135Yn) this.L$1;
            if (!r2.Beh(r1)) {
                return r1;
            }
            return r2;
        }
        throw AnonymousClass000.A0l();
    }
}
