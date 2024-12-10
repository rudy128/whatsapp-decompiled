package com.whatsapp.consent.common;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7SX;
import X.C111095iI;
import X.C18100vl;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.consent.ConsentAgeBanViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.common.AgeBanFragment$onViewCreated$1", f = "AgeBanFragment.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class AgeBanFragment$onViewCreated$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AgeBanFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AgeBanFragment$onViewCreated$1(AgeBanFragment ageBanFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = ageBanFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AgeBanFragment$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AgeBanFragment$onViewCreated$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C18100vl r0;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C111095iI A26 = this.this$0.A26();
            if (A26 instanceof ConsentAgeBanViewModel) {
                r0 = ((ConsentAgeBanViewModel) A26).A03;
            } else {
                r0 = A26.A03;
            }
            AnonymousClass7SX r02 = new AnonymousClass7SX(this.this$0, 1);
            this.label = 1;
            if (((C23421Fz) r0.getValue()).BFC(this, r02) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
