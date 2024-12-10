package com.whatsapp.areffects.viewmodel.session;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C108815cL;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C92364hB;
import X.C92604hb;
import X.C92614hc;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.session.ArEffectSession$disableEffect$1", f = "ArEffectSession.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectSession$disableEffect$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $cleanUpJob;
    public final /* synthetic */ C92364hB $params;
    public final /* synthetic */ C108815cL $reason;
    public int label;
    public final /* synthetic */ ArEffectSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectSession$disableEffect$1(C92364hB r2, C108815cL r3, ArEffectSession arEffectSession, C30391dr r5, AnonymousClass1OB r6) {
        super(2, r5);
        this.$cleanUpJob = r6;
        this.$reason = r3;
        this.this$0 = arEffectSession;
        this.$params = r2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        AnonymousClass1OB r5 = this.$cleanUpJob;
        return new ArEffectSession$disableEffect$1(this.$params, this.$reason, this.this$0, r8, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Log.i("ArEffectSession/disableEffect Cleaning up currently-running jobs");
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
        C92614hc r22 = new C92614hc(this.$reason);
        Object value = this.this$0.A08.getValue();
        if ((value instanceof C92614hc) || (value instanceof C92604hb)) {
            Log.i("ArEffectSession/disableEffect Resetting state");
        } else {
            Log.i("ArEffectSession/disableEffect Disabling effect");
            this.this$0.A04.BIg(this.$params);
        }
        ArEffectSession.A06(this.this$0, r22);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectSession$disableEffect$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
