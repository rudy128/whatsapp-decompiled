package com.whatsapp.areffects.viewmodel.savedstate;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C25511Om;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C92474hM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.savedstate.SavedStateHandleStateSaver$getStateToRestore$2", f = "SavedStateHandleStateSaver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SavedStateHandleStateSaver$getStateToRestore$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C92474hM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedStateHandleStateSaver$getStateToRestore$2(C92474hM r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SavedStateHandleStateSaver$getStateToRestore$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SavedStateHandleStateSaver$getStateToRestore$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Iterable iterable = (Iterable) this.this$0.A00.A02("ar_effects_saved_state");
            if (iterable != null) {
                obj2 = C29431cG.A12(iterable);
            } else {
                obj2 = C25511Om.A00;
            }
            this.this$0.A00.A03("ar_effects_saved_state");
            return obj2;
        }
        throw AnonymousClass000.A0l();
    }
}
