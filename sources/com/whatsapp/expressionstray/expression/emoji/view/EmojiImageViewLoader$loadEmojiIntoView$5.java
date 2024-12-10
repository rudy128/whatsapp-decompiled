package com.whatsapp.expressionstray.expression.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.C108975cc;
import X.C135956t2;
import X.C139496yw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader$loadEmojiIntoView$5", f = "EmojiImageViewLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmojiIntoView$5 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Drawable $icon;
    public final /* synthetic */ C135956t2 $task;
    public int label;
    public final /* synthetic */ EmojiImageViewLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmojiIntoView$5(Drawable drawable, C135956t2 r3, EmojiImageViewLoader emojiImageViewLoader, C30391dr r5) {
        super(2, r5);
        this.$task = r3;
        this.$icon = drawable;
        this.this$0 = emojiImageViewLoader;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EmojiImageViewLoader$loadEmojiIntoView$5(this.$icon, this.$task, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C135956t2 r3 = this.$task;
            EmojiImageView emojiImageView = (EmojiImageView) r3.A04.get();
            if (emojiImageView != null) {
                emojiImageView.A00(r3.A01.A01(), this.$icon);
                if (this.$task.A03 != null) {
                    C108975cc.A0H(this.this$0.A02).A02(this.$task.A03.intValue(), "emoji_image_loader_load_end", (String) null);
                    ((C139496yw) this.this$0.A02.get()).A01(this.$task.A03.intValue(), AnonymousClass00R.A00);
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiImageViewLoader$loadEmojiIntoView$5) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
