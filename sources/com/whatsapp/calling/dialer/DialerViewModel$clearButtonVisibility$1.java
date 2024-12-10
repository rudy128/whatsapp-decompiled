package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerViewModel$clearButtonVisibility$1", f = "DialerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DialerViewModel$clearButtonVisibility$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;

    public DialerViewModel$clearButtonVisibility$1(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        DialerViewModel$clearButtonVisibility$1 dialerViewModel$clearButtonVisibility$1 = new DialerViewModel$clearButtonVisibility$1(r3);
        dialerViewModel$clearButtonVisibility$1.L$0 = obj;
        return dialerViewModel$clearButtonVisibility$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        DialerViewModel$clearButtonVisibility$1 dialerViewModel$clearButtonVisibility$1 = new DialerViewModel$clearButtonVisibility$1((C30391dr) obj2);
        dialerViewModel$clearButtonVisibility$1.L$0 = obj;
        return dialerViewModel$clearButtonVisibility$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return Boolean.valueOf(AnonymousClass000.A1R(((String) this.L$0).length()));
        }
        throw AnonymousClass000.A0l();
    }
}
