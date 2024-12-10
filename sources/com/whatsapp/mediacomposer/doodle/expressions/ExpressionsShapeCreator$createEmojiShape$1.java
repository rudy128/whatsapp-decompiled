package com.whatsapp.mediacomposer.doodle.expressions;

import X.AnonymousClass000;
import X.AnonymousClass1KW;
import X.AnonymousClass1OS;
import X.AnonymousClass69M;
import X.AnonymousClass737;
import X.C130376jK;
import X.C17960vV;
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

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsShapeCreator$createEmojiShape$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ C22821Di $onShapeReady;
    public int label;
    public final /* synthetic */ C130376jK this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r4, r5, r22);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                r22.invoke(r4);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsShapeCreator$createEmojiShape$1(Context context, C130376jK r3, C30391dr r4, C22821Di r5, int[] iArr) {
        super(2, r4);
        this.$emoji = iArr;
        this.this$0 = r3;
        this.$context = context;
        this.$onShapeReady = r5;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        int[] iArr = this.$emoji;
        return new ExpressionsShapeCreator$createEmojiShape$1(this.$context, this.this$0, r8, this.$onShapeReady, iArr);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass737 r3 = new AnonymousClass737(this.$emoji);
            AnonymousClass1KW r2 = this.this$0.A01;
            Context context = this.$context;
            C17960vV.A00();
            final AnonymousClass69M r4 = new AnonymousClass69M(context, r3, r2, false);
            C18600wl r32 = this.this$0.A06;
            final C22821Di r22 = this.$onShapeReady;
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
        return ((ExpressionsShapeCreator$createEmojiShape$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
