package com.whatsapp.productinfra.avatar.liveediting.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.AnonymousClass7B3;
import X.C108475bl;
import X.C156727up;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.CMK;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.viewmodel.ParametricSliderExtKt$bodyParametricChanges$1", f = "ParametricSliderExt.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class ParametricSliderExtKt$bodyParametricChanges$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ CMK $this_bodyParametricChanges;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParametricSliderExtKt$bodyParametricChanges$1(CMK cmk, C30391dr r3) {
        super(2, r3);
        this.$this_bodyParametricChanges = cmk;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ParametricSliderExtKt$bodyParametricChanges$1 parametricSliderExtKt$bodyParametricChanges$1 = new ParametricSliderExtKt$bodyParametricChanges$1(this.$this_bodyParametricChanges, r4);
        parametricSliderExtKt$bodyParametricChanges$1.L$0 = obj;
        return parametricSliderExtKt$bodyParametricChanges$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r3 = (C108475bl) this.L$0;
            AnonymousClass7B3 r2 = new AnonymousClass7B3(r3, 0);
            CMK cmk = this.$this_bodyParametricChanges;
            cmk.A00.add(r2);
            C156727up r0 = new C156727up(cmk, r2);
            this.label = 1;
            if (AnonymousClass4W9.A00(this, r0, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ParametricSliderExtKt$bodyParametricChanges$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
