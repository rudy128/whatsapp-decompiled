package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass4YZ;
import X.C27621Wu;
import X.C30361do;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C445823z;
import X.C73353Va;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoViewModel$logNavigateToEventInfo$1", f = "EventInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoViewModel$logNavigateToEventInfo$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C73353Va this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoViewModel$logNavigateToEventInfo$1(C73353Va r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new EventInfoViewModel$logNavigateToEventInfo$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventInfoViewModel$logNavigateToEventInfo$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass205 r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C73353Va r1 = this.this$0;
            C30361do r2 = r1.A0C;
            C445823z r02 = ((AnonymousClass4YZ) r1.A0F.getValue()).A00;
            if (r02 == null || (r0 = r02.A0v) == null) {
                r0 = r1.A0A;
            }
            r2.A02(r0.A00, 56);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
