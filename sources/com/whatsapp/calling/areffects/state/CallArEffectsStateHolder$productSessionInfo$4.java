package com.whatsapp.calling.areffects.state;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.state.CallArEffectsStateHolder$productSessionInfo$4", f = "CallArEffectsStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallArEffectsStateHolder$productSessionInfo$4 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public CallArEffectsStateHolder$productSessionInfo$4(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        CallArEffectsStateHolder$productSessionInfo$4 callArEffectsStateHolder$productSessionInfo$4 = new CallArEffectsStateHolder$productSessionInfo$4((C30391dr) obj3);
        callArEffectsStateHolder$productSessionInfo$4.L$0 = obj;
        callArEffectsStateHolder$productSessionInfo$4.L$1 = obj2;
        return callArEffectsStateHolder$productSessionInfo$4.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return AnonymousClass1D6.A01(((AnonymousClass1D6) this.L$0).second, this.L$1);
        }
        throw AnonymousClass000.A0l();
    }
}
