package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass02B;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C91104f9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityV2$initObservables$1$1$1$4", f = "CallLogActivityV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityV2$initObservables$1$1$1$4 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallLogActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityV2$initObservables$1$1$1$4(CallLogActivityV2 callLogActivityV2, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogActivityV2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallLogActivityV2$initObservables$1$1$1$4(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        return new CallLogActivityV2$initObservables$1$1$1$4(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C91104f9 r0 = this.this$0.A0F;
            if (r0 == null) {
                C18070vi.A11("callLogActivityActionMode");
                throw null;
            }
            AnonymousClass02B r02 = r0.A00;
            if (r02 != null) {
                r02.A06();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
