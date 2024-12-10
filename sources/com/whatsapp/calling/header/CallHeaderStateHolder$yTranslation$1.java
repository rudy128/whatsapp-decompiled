package com.whatsapp.calling.header;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import X.C86534Sa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.CallHeaderStateHolder$yTranslation$1", f = "CallHeaderStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallHeaderStateHolder$yTranslation$1 extends C30431dv implements C36001nB {
    public /* synthetic */ float F$0;
    public /* synthetic */ Object L$0;
    public int label;

    public CallHeaderStateHolder$yTranslation$1(C30391dr r2) {
        super(3, r2);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            float f = this.F$0;
            if (!((C86534Sa) this.L$0).A0Q) {
                f = 0.0f;
            }
            return new Float(f);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        float A04 = AnonymousClass000.A04(obj);
        CallHeaderStateHolder$yTranslation$1 callHeaderStateHolder$yTranslation$1 = new CallHeaderStateHolder$yTranslation$1((C30391dr) obj3);
        callHeaderStateHolder$yTranslation$1.F$0 = A04;
        callHeaderStateHolder$yTranslation$1.L$0 = obj2;
        return callHeaderStateHolder$yTranslation$1.invokeSuspend(C27621Wu.A00);
    }
}
