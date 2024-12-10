package com.facebook.avatar.autogen.presenter;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4I6;
import X.AnonymousClass5QS;
import X.C27189DXz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99454sq;
import X.DAS;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.presenter.AECapturePresenter$1", f = "AECapturePresenter.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
public final class AECapturePresenter$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ DAS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AECapturePresenter$1(DAS das, C30391dr r3) {
        super(2, r3);
        this.this$0 = das;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AECapturePresenter$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AECapturePresenter$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            DAS das = this.this$0;
            C99454sq A00 = AnonymousClass4I6.A00(new AnonymousClass5QS(das), das.A06);
            C27189DXz dXz = new C27189DXz(this.this$0, 0);
            this.label = 1;
            if (A00.BFC(this, dXz) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
