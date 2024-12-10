package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OB;
import X.C127256e3;
import X.C147207Sf;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34081jt;
import X.C36001nB;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1(StickerExpressionsViewModel stickerExpressionsViewModel, C30391dr r3) {
        super(3, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1 stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1 = new StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1(this.this$0, (C30391dr) obj3);
        stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1.L$0 = obj;
        stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1.L$1 = obj2;
        return stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C147207Sf r0 = new C147207Sf(new C34081jt((AnonymousClass1OB) null, ((C127256e3) this.this$0.A0Q.get()).A01), this.L$1, 11);
            this.label = 1;
            if (C88604aC.A02(this, r0, (AnonymousClass1G2) this.L$0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
