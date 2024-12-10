package com.whatsapp.areffects.viewmodel.session;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.session.ArEffectSession$maybeCancelEnabling$1", f = "ArEffectSession.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectSession$maybeCancelEnabling$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $cleanUpJob;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectSession$maybeCancelEnabling$1(C30391dr r2, AnonymousClass1OB r3) {
        super(2, r2);
        this.$cleanUpJob = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ArEffectSession$maybeCancelEnabling$1(r4, this.$cleanUpJob);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ArEffectSession$maybeCancelEnabling$1((C30391dr) obj2, this.$cleanUpJob).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Log.i("ArEffectSession/maybeCancelEnabling Cleaning up currently-running jobs");
            AnonymousClass1OB r0 = this.$cleanUpJob;
            this.label = 1;
            if (r0.BhB(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
