package com.whatsapp.conversationslist;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.InteropViewModel$loadInteropMessages$1", f = "InteropViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InteropViewModel$loadInteropMessages$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ InteropViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropViewModel$loadInteropMessages$1(InteropViewModel interopViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = interopViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InteropViewModel$loadInteropMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropViewModel$loadInteropMessages$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String format;
        if (this.label == 0) {
            C30691eM.A01(obj);
            InteropViewModel interopViewModel = this.this$0;
            AnonymousClass1DT r3 = interopViewModel.A01;
            int A04 = interopViewModel.A02.A04();
            interopViewModel.A00 = A04;
            if (A04 <= 0) {
                format = null;
            } else {
                format = interopViewModel.A03.A0L().format((long) interopViewModel.A00);
            }
            r3.A0E(format);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
