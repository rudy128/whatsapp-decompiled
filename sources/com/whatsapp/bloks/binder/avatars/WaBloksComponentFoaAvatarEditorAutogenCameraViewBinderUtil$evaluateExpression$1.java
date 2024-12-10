package com.whatsapp.bloks.binder.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C199029zJ;
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

@DebugMetadata(c = "com.whatsapp.bloks.binder.avatars.WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1", f = "WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C199029zJ $args;
    public final /* synthetic */ DOZ $bloksContext;
    public final /* synthetic */ DFL $component;
    public final /* synthetic */ E8A $expression;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1(DOZ doz, DFL dfl, C199029zJ r4, E8A e8a, C30391dr r6) {
        super(2, r6);
        this.$component = dfl;
        this.$expression = e8a;
        this.$args = r4;
        this.$bloksContext = doz;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        DFL dfl = this.$component;
        E8A e8a = this.$expression;
        return new WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1(this.$bloksContext, dfl, this.$args, e8a, r8);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            DFL dfl = this.$component;
            E8A e8a = this.$expression;
            C25681CkC.A03(this.$bloksContext, dfl, this.$args, e8a);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
