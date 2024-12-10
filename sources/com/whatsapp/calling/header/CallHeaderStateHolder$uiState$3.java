package com.whatsapp.calling.header;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import X.C93624jH;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.CallHeaderStateHolder$uiState$3", f = "CallHeaderStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallHeaderStateHolder$uiState$3 extends C30431dv implements C36001nB {
    public int label;
    public final /* synthetic */ CallHeaderStateHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallHeaderStateHolder$uiState$3(CallHeaderStateHolder callHeaderStateHolder, C30391dr r3) {
        super(3, r3);
        this.this$0 = callHeaderStateHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new CallHeaderStateHolder$uiState$3(this.this$0, (C30391dr) obj3).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            CallHeaderStateHolder callHeaderStateHolder = this.this$0;
            if (!callHeaderStateHolder.A03) {
                C93624jH r1 = callHeaderStateHolder.A09;
                r1.A02.A02(r1);
                r1.A00 = null;
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
