package com.whatsapp.areffects.viewmodel.session;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.AnonymousClass4RN;
import X.C106575Wj;
import X.C106585Wk;
import X.C160978Av;
import X.C18070vi;
import X.C195109so;
import X.C26983DOf;
import X.C27621Wu;
import X.C28596E9n;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C75603ho;
import X.C92374hC;
import X.C92584hZ;
import X.C92624hd;
import X.C99244sV;
import com.whatsapp.calling.areffects.CallArEffectsViewModel;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.session.ArEffectSession$updateStrength$1", f = "ArEffectSession.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectSession$updateStrength$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $cleanUpJob;
    public final /* synthetic */ C92374hC $params;
    public int label;
    public final /* synthetic */ ArEffectSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectSession$updateStrength$1(C92374hC r2, ArEffectSession arEffectSession, C30391dr r4, AnonymousClass1OB r5) {
        super(2, r4);
        this.$cleanUpJob = r5;
        this.this$0 = arEffectSession;
        this.$params = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        AnonymousClass1OB r3 = this.$cleanUpJob;
        return new ArEffectSession$updateStrength$1(this.$params, this.this$0, r6, r3);
    }

    public final Object invokeSuspend(Object obj) {
        C106575Wj r0;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Log.i("ArEffectSession/updateStrength Cleaning up currently-running jobs");
            AnonymousClass1OB r02 = this.$cleanUpJob;
            this.label = 1;
            if (r02.BhB(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        ArEffectSession arEffectSession = this.this$0;
        C99244sV A00 = C99244sV.A00(this.$params, 0);
        synchronized (arEffectSession) {
            AnonymousClass1G4 r22 = arEffectSession.A08;
            C106575Wj r1 = (C106575Wj) r22.getValue();
            C106575Wj A02 = ArEffectSession.A02(r1, (C106575Wj) A00.invoke(r1));
            ArEffectSession.A07(r1, A02);
            r22.setValue(A02);
            r0 = (C106575Wj) r22.getValue();
        }
        if (r0 instanceof C92584hZ) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ArEffectSession/updateStrength Updating strength to ");
            A10.append(this.$params.A00);
            Log.i(A10.toString());
            C106585Wk r12 = this.this$0.A06;
            C92374hC r23 = this.$params;
            C92624hd r13 = (C92624hd) r12;
            int i2 = r13.A00;
            Object obj2 = r13.A01;
            if (i2 != 0) {
                C75603ho r14 = (C75603ho) obj2;
                AnonymousClass3Ma.A1N(r14, 0, r23);
                Log.i("CameraArEffectsViewModel/Updating strength");
                C160978Av r03 = r14.A07.A0K;
                if (r03 == null) {
                    C18070vi.A11("camera");
                    throw null;
                }
                r03.CQR(r23);
            } else {
                CallArEffectsViewModel callArEffectsViewModel = (CallArEffectsViewModel) obj2;
                AnonymousClass3Ma.A1N(callArEffectsViewModel, 0, r23);
                Log.i("CallArEffectsViewModel/Updating strength");
                C28596E9n A002 = ((AnonymousClass4RN) callArEffectsViewModel.A08.get()).A00();
                if (A002 != null) {
                    C26983DOf dOf = (C26983DOf) A002;
                    synchronized (dOf) {
                        ((C195109so) dOf.A0C.getValue()).A01(r23);
                    }
                }
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectSession$updateStrength$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
