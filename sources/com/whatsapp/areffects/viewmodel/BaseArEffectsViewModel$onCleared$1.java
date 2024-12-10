package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$onCleared$1", f = "BaseArEffectsViewModel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
public final class BaseArEffectsViewModel$onCleared$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$onCleared$1(BaseArEffectsViewModel baseArEffectsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = baseArEffectsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new BaseArEffectsViewModel$onCleared$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BaseArEffectsViewModel$onCleared$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            BaseArEffectsViewModel baseArEffectsViewModel = this.this$0;
            this.label = 1;
            if (baseArEffectsViewModel.A0X(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass1OW.A04((CancellationException) null, this.this$0.A0N);
        return C27621Wu.A00;
    }
}
