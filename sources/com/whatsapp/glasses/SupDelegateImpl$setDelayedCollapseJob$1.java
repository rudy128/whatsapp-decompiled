package com.whatsapp.glasses;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C22821Di;
import X.C24867CNl;
import X.C26996DOs;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import com.facebook.wearable.mediastream.model.SUPToggleState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.glasses.SupDelegateImpl$setDelayedCollapseJob$1", f = "SupDelegateImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
public final class SupDelegateImpl$setDelayedCollapseJob$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C26996DOs this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupDelegateImpl$setDelayedCollapseJob$1(C26996DOs dOs, C30391dr r3) {
        super(2, r3);
        this.this$0 = dOs;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SupDelegateImpl$setDelayedCollapseJob$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SupDelegateImpl$setDelayedCollapseJob$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (C62882s9.A00(this, 3000) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        SUPToggleState sUPToggleState = this.this$0.A01;
        Boolean A0h = AnonymousClass000.A0h();
        SUPToggleState updatedStatusIndicatorAttributes = sUPToggleState.getUpdatedStatusIndicatorAttributes(A0h, (C24867CNl) null, (Boolean) null, (Boolean) null, (Boolean) null);
        if (updatedStatusIndicatorAttributes != null) {
            C26996DOs dOs = this.this$0;
            dOs.A01 = updatedStatusIndicatorAttributes;
            C22821Di r0 = dOs.A04;
            if (r0 != null) {
                r0.invoke(A0h);
            }
        }
        return C27621Wu.A00;
    }
}
