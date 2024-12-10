package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass5WL;
import X.C108955ca;
import X.C108995ce;
import X.C147277Sn;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment$observeStarredStickerSideEffects$1", f = "StickerExpressionsFragment.kt", i = {}, l = {811}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsFragment$observeStarredStickerSideEffects$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsFragment$observeStarredStickerSideEffects$1(StickerExpressionsFragment stickerExpressionsFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new StickerExpressionsFragment$observeStarredStickerSideEffects$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsFragment$observeStarredStickerSideEffects$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass5WL A0e = C108995ce.A0e(this.this$0, C108955ca.A0P(this.this$0).A0I.A00);
            C147277Sn r0 = new C147277Sn(this.this$0, 23);
            this.label = 1;
            if (A0e.BFC(this, r0) == r5) {
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
