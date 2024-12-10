package com.whatsapp.calling.header.ui;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.AnonymousClass4FR;
import X.AnonymousClass5WL;
import X.C23401Fx;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99624tC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.ui.CallScreenDetailsLayout$setupOnAttach$1", f = "CallScreenDetailsLayout.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class CallScreenDetailsLayout$setupOnAttach$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1F9 $lifecycleOwner;
    public int label;
    public final /* synthetic */ CallScreenDetailsLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallScreenDetailsLayout$setupOnAttach$1(AnonymousClass1F9 r2, CallScreenDetailsLayout callScreenDetailsLayout, C30391dr r4) {
        super(2, r4);
        this.this$0 = callScreenDetailsLayout;
        this.$lifecycleOwner = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CallScreenDetailsLayout$setupOnAttach$1(this.$lifecycleOwner, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz r2 = this.this$0.getCallScreenDetailsStateHolder().A03;
            AnonymousClass5WL A00 = AnonymousClass4FR.A00(C23401Fx.STARTED, this.$lifecycleOwner.getLifecycle(), r2);
            C99624tC A002 = C99624tC.A00(this.this$0, 28);
            this.label = 1;
            if (A00.BFC(this, A002) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallScreenDetailsLayout$setupOnAttach$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
