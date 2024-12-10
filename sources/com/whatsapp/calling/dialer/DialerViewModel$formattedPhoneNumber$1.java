package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerViewModel$formattedPhoneNumber$1", f = "DialerViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class DialerViewModel$formattedPhoneNumber$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DialerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerViewModel$formattedPhoneNumber$1(DialerViewModel dialerViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = dialerViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        DialerViewModel$formattedPhoneNumber$1 dialerViewModel$formattedPhoneNumber$1 = new DialerViewModel$formattedPhoneNumber$1(this.this$0, r4);
        dialerViewModel$formattedPhoneNumber$1.L$0 = obj;
        return dialerViewModel$formattedPhoneNumber$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            DialerViewModel dialerViewModel = this.this$0;
            this.label = 1;
            obj = dialerViewModel.A04.A06((String) this.L$0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerViewModel$formattedPhoneNumber$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
