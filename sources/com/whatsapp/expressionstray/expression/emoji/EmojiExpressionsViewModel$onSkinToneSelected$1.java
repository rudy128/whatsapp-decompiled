package com.whatsapp.expressionstray.expression.emoji;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108485bm;
import X.C117405zj;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$onSkinToneSelected$1", f = "EmojiExpressionsViewModel.kt", i = {}, l = {438}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$onSkinToneSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int[] $newEmoji;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$onSkinToneSelected$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C30391dr r3, int[] iArr, int i) {
        super(2, r3);
        this.this$0 = emojiExpressionsViewModel;
        this.$position = i;
        this.$newEmoji = iArr;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EmojiExpressionsViewModel$onSkinToneSelected$1(this.this$0, r6, this.$newEmoji, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108485bm r3 = this.this$0.A00;
            C117405zj r0 = new C117405zj(this.$newEmoji, this.$position);
            this.label = 1;
            if (r3.CHH(r0, this) == r5) {
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
        return ((EmojiExpressionsViewModel$onSkinToneSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
