package com.whatsapp.calling.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4RN;
import X.C27621Wu;
import X.C28596E9n;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.CallArEffectsViewModel$setIsArEffectsUiShown$2", f = "CallArEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallArEffectsViewModel$setIsArEffectsUiShown$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallArEffectsViewModel$setIsArEffectsUiShown$2(CallArEffectsViewModel callArEffectsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callArEffectsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallArEffectsViewModel$setIsArEffectsUiShown$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallArEffectsViewModel$setIsArEffectsUiShown$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            BaseArEffectsViewModel.A06(this.this$0);
            C28596E9n A00 = ((AnonymousClass4RN) this.this$0.A08.get()).A00();
            if (A00 != null) {
                A00.stop();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
