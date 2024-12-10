package com.whatsapp.areffects.viewmodel.session;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C107855aj;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C88544a4;
import X.C92384hD;
import X.C92584hZ;
import X.C92604hb;
import X.C92614hc;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.session.ArEffectSession$restoreSuspended$1", f = "ArEffectSession.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectSession$restoreSuspended$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $cleanUpJob;
    public final /* synthetic */ C107855aj $effect;
    public final /* synthetic */ boolean $isFromButton;
    public final /* synthetic */ C92384hD $params;
    public int label;
    public final /* synthetic */ ArEffectSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectSession$restoreSuspended$1(C107855aj r2, C92384hD r3, ArEffectSession arEffectSession, C30391dr r5, AnonymousClass1OB r6, boolean z) {
        super(2, r5);
        this.$cleanUpJob = r6;
        this.this$0 = arEffectSession;
        this.$effect = r2;
        this.$params = r3;
        this.$isFromButton = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AnonymousClass1OB r5 = this.$cleanUpJob;
        return new ArEffectSession$restoreSuspended$1(this.$effect, this.$params, this.this$0, r9, r5, this.$isFromButton);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
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
        if (this.this$0.A08.getValue() instanceof C92614hc) {
            C88544a4 A00 = this.this$0.A03.A00(this.$effect, this.$params);
            C107855aj r4 = this.$effect;
            C92384hD r5 = this.$params;
            C92584hZ r22 = new C92584hZ(A00, r4, r5, r5.A03, this.$isFromButton);
            Log.i("ArEffectSession/restoreSuspended Suspended state restored");
            ArEffectSession.A06(this.this$0, new C92604hb(r22));
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectSession$restoreSuspended$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
