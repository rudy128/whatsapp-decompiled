package com.whatsapp.calling.vcoverscroll.view;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.AnonymousClass4FR;
import X.AnonymousClass4I4;
import X.AnonymousClass4I5;
import X.AnonymousClass4I6;
import X.AnonymousClass4PJ;
import X.AnonymousClass4Z8;
import X.C106335Vl;
import X.C106345Vm;
import X.C23401Fx;
import X.C23421Fz;
import X.C27183DXs;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C85914Pf;
import X.C99624tC;
import com.whatsapp.calling.CallLogRepository$getCallLog$1;
import com.whatsapp.calling.vcoverscroll.vm.VCMiniPlayerStateHolder$getUiStateFlow$3;
import com.whatsapp.calling.vcoverscroll.vm.VCMiniPlayerStateHolder$getUiStateFlow$4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView$init$1", f = "VCMiniPlayerView.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
public final class VCMiniPlayerView$init$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1F9 $lifecycleOwner;
    public int label;
    public final /* synthetic */ VCMiniPlayerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCMiniPlayerView$init$1(AnonymousClass1F9 r2, VCMiniPlayerView vCMiniPlayerView, C30391dr r4) {
        super(2, r4);
        this.this$0 = vCMiniPlayerView;
        this.$lifecycleOwner = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new VCMiniPlayerView$init$1(this.$lifecycleOwner, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass4PJ stateHolder = this.this$0.getStateHolder();
            C27183DXs dXs = new C27183DXs((Object) AnonymousClass4Z8.A02(new VCMiniPlayerStateHolder$getUiStateFlow$3(stateHolder, (C30391dr) null), stateHolder.A0C, stateHolder.A0D, AnonymousClass4I6.A00(C106335Vl.A00, AnonymousClass4I4.A00(new CallLogRepository$getCallLog$1(stateHolder.A04, stateHolder.A00, (C30391dr) null))), AnonymousClass4I6.A00(C106345Vm.A00, ((C85914Pf) stateHolder.A06.get()).A00(true))), (Object) new VCMiniPlayerStateHolder$getUiStateFlow$4(stateHolder, (C30391dr) null), 5);
            C23421Fz A00 = AnonymousClass4I5.A00(this.this$0.getLatencySensitiveDispatcher(), AnonymousClass4FR.A00(C23401Fx.STARTED, this.$lifecycleOwner.getLifecycle(), dXs));
            C99624tC A002 = C99624tC.A00(this.this$0, 34);
            this.label = 1;
            if (A00.BFC(this, A002) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VCMiniPlayerView$init$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
