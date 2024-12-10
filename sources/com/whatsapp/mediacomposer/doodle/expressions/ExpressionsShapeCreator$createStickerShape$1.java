package com.whatsapp.mediacomposer.doodle.expressions;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7JE;
import X.C130376jK;
import X.C1409773u;
import X.C1418377d;
import X.C18600wl;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createStickerShape$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsShapeCreator$createStickerShape$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C22821Di $onShapeReady;
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ C130376jK this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createStickerShape$1$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createStickerShape$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(BHq, r5, r22);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                r22.invoke(BHq);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsShapeCreator$createStickerShape$1(Context context, C130376jK r3, C1418377d r4, C30391dr r5, C22821Di r6) {
        super(2, r5);
        this.$sticker = r4;
        this.this$0 = r3;
        this.$context = context;
        this.$onShapeReady = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C1418377d r3 = this.$sticker;
        return new ExpressionsShapeCreator$createStickerShape$1(this.$context, this.this$0, r3, r8, this.$onShapeReady);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C1418377d r2 = this.$sticker;
            C130376jK r1 = this.this$0;
            final C1409773u BHq = new AnonymousClass7JE(r2, r1.A03).BHq(this.$context, r1.A00, false);
            C18600wl r3 = this.this$0.A06;
            final C22821Di r22 = this.$onShapeReady;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r5) {
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
        return ((ExpressionsShapeCreator$createStickerShape$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
