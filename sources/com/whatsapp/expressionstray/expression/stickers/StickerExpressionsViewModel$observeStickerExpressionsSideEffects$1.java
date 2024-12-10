package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass607;
import X.AnonymousClass6TL;
import X.C1176060e;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41561wd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements C22821Di {
        public int label;

        public final C30391dr create(C30391dr r4) {
            return new AnonymousClass1(r1, r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ((AnonymousClass1) create((C30391dr) obj)).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G3 r3 = StickerExpressionsViewModel.this.A0i;
                C1176060e r0 = (C1176060e) r1;
                AnonymousClass607 r02 = new AnonymousClass607(r0.A00, r0.A01);
                this.label = 1;
                if (r3.BJt(r02, this) == r5) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1(StickerExpressionsViewModel stickerExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1 stickerExpressionsViewModel$observeStickerExpressionsSideEffects$1 = new StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1(this.this$0, r4);
        stickerExpressionsViewModel$observeStickerExpressionsSideEffects$1.L$0 = obj;
        return stickerExpressionsViewModel$observeStickerExpressionsSideEffects$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            final AnonymousClass6TL r1 = (AnonymousClass6TL) this.L$0;
            if (r1 instanceof C1176060e) {
                final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
                AnonymousClass1 r2 = new AnonymousClass1((C30391dr) null);
                AnonymousClass3MX.A1Q(new StickerExpressionsViewModel$launchAfterDataLoad$1(stickerExpressionsViewModel, (C30391dr) null, r2), C41561wd.A00(stickerExpressionsViewModel));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
