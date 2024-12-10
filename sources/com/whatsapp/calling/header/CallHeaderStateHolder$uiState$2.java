package com.whatsapp.calling.header;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C93624jH;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.CallHeaderStateHolder$uiState$2", f = "CallHeaderStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallHeaderStateHolder$uiState$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallHeaderStateHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallHeaderStateHolder$uiState$2(CallHeaderStateHolder callHeaderStateHolder, C30391dr r3) {
        super(2, r3);
        this.this$0 = callHeaderStateHolder;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallHeaderStateHolder$uiState$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallHeaderStateHolder$uiState$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            CallHeaderStateHolder callHeaderStateHolder = this.this$0;
            if (!callHeaderStateHolder.A03) {
                C93624jH r1 = callHeaderStateHolder.A09;
                if (r1.A00 == null) {
                    r1.A02.A01(r1);
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
