package com.whatsapp.mediacomposer.doodle.expressions;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass737;
import X.AnonymousClass7JD;
import X.AnonymousClass7KX;
import X.C130376jK;
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

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentEmojiShape$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsShapeCreator$addRecentEmojiShape$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int[] $emoji;
    public int label;
    public final /* synthetic */ C130376jK this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentEmojiShape$1$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentEmojiShape$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass7KX.A00(C17880vN.A0V(C130376jK.this.A04), 22);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsShapeCreator$addRecentEmojiShape$1(C130376jK r2, C30391dr r3, int[] iArr) {
        super(2, r3);
        this.$emoji = iArr;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsShapeCreator$addRecentEmojiShape$1(this.this$0, r5, this.$emoji);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass737 r3 = new AnonymousClass737(this.$emoji);
            C130376jK r2 = this.this$0;
            r2.A02.A0E(new AnonymousClass7JD(r3, r2.A01));
            final C130376jK r32 = this.this$0;
            C18600wl r22 = r32.A06;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r22, r0) == r5) {
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
        return ((ExpressionsShapeCreator$addRecentEmojiShape$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
