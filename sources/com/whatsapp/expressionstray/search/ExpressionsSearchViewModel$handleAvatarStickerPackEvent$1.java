package com.whatsapp.expressionstray.search;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6EP;
import X.C123146Th;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {532}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C123146Th $event;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1(ExpressionsSearchViewModel expressionsSearchViewModel, C123146Th r3, C30391dr r4) {
        super(2, r4);
        this.$event = r3;
        this.this$0 = expressionsSearchViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1(this.this$0, this.$event, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (this.$event instanceof AnonymousClass6EP) {
                ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
                this.label = 1;
                if (C30451dy.A00(this, expressionsSearchViewModel.A0K, new ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(expressionsSearchViewModel, (C30391dr) null)) == r4) {
                    return r4;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
