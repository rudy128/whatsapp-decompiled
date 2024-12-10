package com.bloks.components.bkcomponentaeparametricslider;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.BE7;
import X.C20046A4p;
import X.C25681CkC;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.DFL;
import X.DOZ;
import X.E8A;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1", f = "ParametricSliderPreviewUnit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ DOZ $bloksContext;
    public final /* synthetic */ DFL $component;
    public final /* synthetic */ E8A $expression;
    public final /* synthetic */ int $p1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1(DOZ doz, DFL dfl, E8A e8a, C30391dr r5, int i) {
        super(2, r5);
        this.$expression = e8a;
        this.$component = dfl;
        this.$p1 = i;
        this.$bloksContext = doz;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        E8A e8a = this.$expression;
        return new ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1(this.$bloksContext, this.$component, e8a, r8, this.$p1);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            E8A e8a = this.$expression;
            if (e8a != null) {
                DFL dfl = this.$component;
                C20046A4p a4p = new C20046A4p();
                a4p.A03(new Float(((float) this.$p1) / 100.0f), 0);
                C25681CkC.A03(this.$bloksContext, dfl, BE7.A0R(a4p, this.$bloksContext, 1), e8a);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
