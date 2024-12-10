package com.whatsapp.mediacomposer.doodle.expressions;

import X.AnonymousClass000;
import X.AnonymousClass10T;
import X.AnonymousClass1OS;
import X.AnonymousClass7JE;
import X.AnonymousClass7KX;
import X.C130376jK;
import X.C1418377d;
import X.C17880vN;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentStickerShape$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsShapeCreator$addRecentStickerShape$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ C130376jK this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentStickerShape$1$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentStickerShape$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r4, r22, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                boolean z = r22.A0N;
                AnonymousClass10T A0V = C17880vN.A0V(r4.A04);
                int i = 23;
                if (z) {
                    i = 21;
                }
                AnonymousClass7KX.A00(A0V, i);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsShapeCreator$addRecentStickerShape$1(C130376jK r2, C1418377d r3, C30391dr r4) {
        super(2, r4);
        this.$sticker = r3;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsShapeCreator$addRecentStickerShape$1(this.this$0, this.$sticker, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C1418377d r3 = this.$sticker;
            C130376jK r2 = this.this$0;
            r2.A02.A0E(new AnonymousClass7JE(r3, r2.A03));
            final C130376jK r4 = this.this$0;
            C18600wl r32 = r4.A06;
            final C1418377d r22 = this.$sticker;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r32, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsShapeCreator$addRecentStickerShape$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
