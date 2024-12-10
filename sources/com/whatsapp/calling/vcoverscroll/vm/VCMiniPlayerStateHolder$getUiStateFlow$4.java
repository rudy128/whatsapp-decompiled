package com.whatsapp.calling.vcoverscroll.vm;

import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass4PJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import X.C93634jI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.vcoverscroll.vm.VCMiniPlayerStateHolder$getUiStateFlow$4", f = "VCMiniPlayerStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VCMiniPlayerStateHolder$getUiStateFlow$4 extends C30431dv implements C36001nB {
    public int label;
    public final /* synthetic */ AnonymousClass4PJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCMiniPlayerStateHolder$getUiStateFlow$4(AnonymousClass4PJ r2, C30391dr r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new VCMiniPlayerStateHolder$getUiStateFlow$4(this.this$0, (C30391dr) obj3).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C93634jI.A00((C93634jI) this.this$0.A07.get(), (A99) null);
            this.this$0.A05.A01.clear();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
