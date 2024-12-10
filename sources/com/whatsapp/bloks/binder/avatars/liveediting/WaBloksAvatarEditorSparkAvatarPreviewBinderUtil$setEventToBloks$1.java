package com.whatsapp.bloks.binder.avatars.liveediting;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.BE7;
import X.C108975cc;
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

@DebugMetadata(c = "com.whatsapp.bloks.binder.avatars.liveediting.WaBloksAvatarEditorSparkAvatarPreviewBinderUtil$setEventToBloks$1", f = "WaBloksAvatarEditorSparkAvatarPreviewBinderUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WaBloksAvatarEditorSparkAvatarPreviewBinderUtil$setEventToBloks$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ DOZ $bloksContext;
    public final /* synthetic */ DFL $component;
    public final /* synthetic */ String $errorDetails;
    public final /* synthetic */ String $event;
    public final /* synthetic */ E8A $expression;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBloksAvatarEditorSparkAvatarPreviewBinderUtil$setEventToBloks$1(DOZ doz, DFL dfl, E8A e8a, String str, String str2, C30391dr r7) {
        super(2, r7);
        this.$component = dfl;
        this.$expression = e8a;
        this.$event = str;
        this.$errorDetails = str2;
        this.$bloksContext = doz;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new WaBloksAvatarEditorSparkAvatarPreviewBinderUtil$setEventToBloks$1(this.$bloksContext, this.$component, this.$expression, this.$event, this.$errorDetails, r9);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            DFL dfl = this.$component;
            E8A e8a = this.$expression;
            C20046A4p a4p = new C20046A4p();
            a4p.A03(this.$event, 0);
            C25681CkC.A03(this.$bloksContext, dfl, BE7.A0R(a4p, C108975cc.A0h("error_details", this.$errorDetails), 1), e8a);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaBloksAvatarEditorSparkAvatarPreviewBinderUtil$setEventToBloks$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
