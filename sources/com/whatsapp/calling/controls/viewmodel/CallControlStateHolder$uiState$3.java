package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass4aL;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import X.C93624jH;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$3", f = "CallControlStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallControlStateHolder$uiState$3 extends C30431dv implements C36001nB {
    public int label;
    public final /* synthetic */ AnonymousClass4aL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallControlStateHolder$uiState$3(AnonymousClass4aL r2, C30391dr r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new CallControlStateHolder$uiState$3(this.this$0, (C30391dr) obj3).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4aL r1 = this.this$0;
            Log.i("CallControlState releaseResources");
            C93624jH r12 = r1.A05;
            r12.A02.A02(r12);
            r12.A00 = null;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
