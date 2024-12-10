package com.whatsapp.productinfra.avatar.liveediting.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.viewmodel.LiveEditingPlayerExtKt$events$2", f = "LiveEditingPlayerExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LiveEditingPlayerExtKt$events$2 extends C30431dv implements AnonymousClass1OS {
    public int label;

    public LiveEditingPlayerExtKt$events$2(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        return new LiveEditingPlayerExtKt$events$2(r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C30391dr r3 = (C30391dr) obj2;
        if (r3 != null) {
            r3.getContext();
        }
        C27621Wu r0 = C27621Wu.A00;
        C30691eM.A01(r0);
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
