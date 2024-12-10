package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass1W6;
import X.AnonymousClass4YZ;
import X.C100955Aj;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C445823z;
import X.C73353Va;
import X.C82954Cu;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoViewModel$1", f = "EventInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoViewModel$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C73353Va this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoViewModel$1(C73353Va r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new EventInfoViewModel$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventInfoViewModel$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList A00;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C73353Va r1 = this.this$0;
            AnonymousClass1W6 r0 = r1.A0B;
            C445823z r4 = (C445823z) r0.A01.A05(r1.A0A);
            if (r4 != null) {
                C73353Va r2 = this.this$0;
                AnonymousClass1G4 r12 = r2.A0E;
                do {
                    value = r12.getValue();
                    A00 = C73353Va.A00(r4, r2);
                } while (!r12.BFK(value, new AnonymousClass4YZ(r4, C82954Cu.MAIN, AnonymousClass000.A13(), A00, true)));
                C73353Va r02 = this.this$0;
                r02.A08.A00(r4, "EventInfoViewModel", new C100955Aj(r02, 1));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
