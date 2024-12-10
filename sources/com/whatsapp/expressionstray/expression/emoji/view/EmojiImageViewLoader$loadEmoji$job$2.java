package com.whatsapp.expressionstray.expression.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C134666qx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader$loadEmoji$job$2", f = "EmojiImageViewLoader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmoji$job$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C134666qx $task;
    public int label;
    public final /* synthetic */ EmojiImageViewLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmoji$job$2(C134666qx r2, EmojiImageViewLoader emojiImageViewLoader, C30391dr r4) {
        super(2, r4);
        this.this$0 = emojiImageViewLoader;
        this.$task = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EmojiImageViewLoader$loadEmoji$job$2(this.$task, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            EmojiImageViewLoader emojiImageViewLoader = this.this$0;
            C134666qx r0 = this.$task;
            this.label = 1;
            if (EmojiImageViewLoader.A00(r0, emojiImageViewLoader, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiImageViewLoader$loadEmoji$job$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
