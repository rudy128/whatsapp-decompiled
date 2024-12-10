package com.whatsapp.avatar.prefetch;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.prefetch.AvatarPrefetchController$initialize$5", f = "AvatarPrefetchController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarPrefetchController$initialize$5 extends C30431dv implements C36001nB {
    public int label;

    public AvatarPrefetchController$initialize$5(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new AvatarPrefetchController$initialize$5((C30391dr) obj3).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
