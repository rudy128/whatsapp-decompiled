package com.whatsapp.areffects.viewmodel.session;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C106575Wj;
import X.C107085Yi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C92364hB;
import X.C92384hD;
import X.C92584hZ;
import X.C92604hb;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.session.ArEffectSession$suspendEffect$1", f = "ArEffectSession.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectSession$suspendEffect$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $cleanUpJob;
    public int label;
    public final /* synthetic */ ArEffectSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectSession$suspendEffect$1(ArEffectSession arEffectSession, C30391dr r3, AnonymousClass1OB r4) {
        super(2, r3);
        this.$cleanUpJob = r4;
        this.this$0 = arEffectSession;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ArEffectSession$suspendEffect$1(this.this$0, r5, this.$cleanUpJob);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Log.i("ArEffectSession/suspendEffect Cleaning up currently-running jobs");
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
        C106575Wj A01 = ArEffectSession.A01(this.this$0);
        if (A01 instanceof C92584hZ) {
            Log.i("ArEffectSession/suspendEffect Disabling effect");
            C107085Yi r3 = this.this$0.A04;
            C92584hZ r4 = (C92584hZ) A01;
            C92384hD r02 = r4.A03;
            r3.BIg(new C92364hB(r02.A00, r02.A01));
            ArEffectSession.A06(this.this$0, new C92604hb(r4));
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectSession$suspendEffect$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
