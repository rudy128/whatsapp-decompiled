package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4aL;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C93624jH;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$2", f = "CallControlStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallControlStateHolder$uiState$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass4aL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallControlStateHolder$uiState$2(AnonymousClass4aL r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallControlStateHolder$uiState$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallControlStateHolder$uiState$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4aL r1 = this.this$0;
            Log.i("CallControlState acquireResources");
            C93624jH r12 = r1.A05;
            if (r12.A00 == null) {
                r12.A02.A01(r12);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
