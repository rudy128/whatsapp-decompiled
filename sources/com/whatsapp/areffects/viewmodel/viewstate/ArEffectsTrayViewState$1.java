package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass4I6;
import X.AnonymousClass4S8;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99174sO;
import X.C99454sq;
import X.C99574t7;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsTrayViewState$1", f = "ArEffectsTrayViewState.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsTrayViewState$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1G1 $isArEffectsUiShown;
    public final /* synthetic */ ArEffectSession $session;
    public final /* synthetic */ long $trayDismissalTransitionMs;
    public int label;
    public final /* synthetic */ AnonymousClass4S8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsTrayViewState$1(ArEffectSession arEffectSession, AnonymousClass4S8 r3, C30391dr r4, AnonymousClass1G1 r5, long j) {
        super(2, r4);
        this.$isArEffectsUiShown = r5;
        this.$trayDismissalTransitionMs = j;
        this.this$0 = r3;
        this.$session = arEffectSession;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AnonymousClass1G1 r4 = this.$isArEffectsUiShown;
        long j = this.$trayDismissalTransitionMs;
        return new ArEffectsTrayViewState$1(this.$session, this.this$0, r9, r4, j);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C99454sq A00 = AnonymousClass4I6.A00(new C99174sO(this.$trayDismissalTransitionMs, 1), this.$isArEffectsUiShown);
            C99574t7 r0 = new C99574t7(this.$session, this.this$0, 6);
            this.label = 1;
            if (A00.BFC(this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsTrayViewState$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
