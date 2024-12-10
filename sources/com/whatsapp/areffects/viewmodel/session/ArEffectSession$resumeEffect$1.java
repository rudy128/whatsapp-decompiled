package com.whatsapp.areffects.viewmodel.session;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass4D9;
import X.AnonymousClass4DE;
import X.C106575Wj;
import X.C18070vi;
import X.C19971A1g;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C92384hD;
import X.C92584hZ;
import X.C92604hb;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.session.ArEffectSession$resumeEffect$1", f = "ArEffectSession.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectSession$resumeEffect$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $cleanUpJob;
    public final /* synthetic */ String $productSessionId;
    public int label;
    public final /* synthetic */ ArEffectSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectSession$resumeEffect$1(ArEffectSession arEffectSession, String str, C30391dr r4, AnonymousClass1OB r5) {
        super(2, r4);
        this.$cleanUpJob = r5;
        this.this$0 = arEffectSession;
        this.$productSessionId = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ArEffectSession$resumeEffect$1(this.this$0, this.$productSessionId, r6, this.$cleanUpJob);
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
        C106575Wj A01 = ArEffectSession.A01(this.this$0);
        if (A01 instanceof C92604hb) {
            C92584hZ r3 = ((C92604hb) A01).A00;
            C92384hD r02 = r3.A03;
            String str = this.$productSessionId;
            AnonymousClass4D9 r6 = r02.A01;
            AnonymousClass4DE r5 = r02.A00;
            Float f = r02.A03;
            C19971A1g a1g = r02.A02;
            C18070vi.A0d(str, 2);
            C92384hD r4 = new C92384hD(r5, r6, a1g, f, str, false);
            Log.i("ArEffectSession/resumeEffect Resuming");
            this.this$0.A08(r3.A02, r4, r3.A05);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectSession$resumeEffect$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
