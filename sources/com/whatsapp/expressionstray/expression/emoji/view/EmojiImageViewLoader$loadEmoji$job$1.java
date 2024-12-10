package com.whatsapp.expressionstray.expression.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C108945cZ;
import X.C108975cc;
import X.C134316qO;
import X.C135956t2;
import X.C139496yw;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader$loadEmoji$job$1", f = "EmojiImageViewLoader.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmoji$job$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C135956t2 $task;
    public int label;
    public final /* synthetic */ EmojiImageViewLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmoji$job$1(C135956t2 r2, EmojiImageViewLoader emojiImageViewLoader, C30391dr r4) {
        super(2, r4);
        this.this$0 = emojiImageViewLoader;
        this.$task = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EmojiImageViewLoader$loadEmoji$job$1(this.$task, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        View A0O;
        C139496yw r2;
        int i;
        Integer num;
        Object obj3;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            EmojiImageViewLoader emojiImageViewLoader = this.this$0;
            C135956t2 r5 = this.$task;
            this.label = 1;
            Integer num2 = r5.A03;
            if (num2 != null) {
                C108975cc.A0H(emojiImageViewLoader.A02).A02(num2.intValue(), "emoji_image_loader_load_start", (String) null);
            }
            C134316qO r9 = r5.A02;
            WeakReference weakReference = r5.A04;
            View A0O2 = C108945cZ.A0O(weakReference);
            if (A0O2 != null) {
                obj2 = A0O2.getTag();
            } else {
                obj2 = null;
            }
            if (C18070vi.A18(r9, obj2) && (A0O = C108945cZ.A0O(weakReference)) != null) {
                BitmapDrawable A07 = emojiImageViewLoader.A00.A07(AnonymousClass3MX.A05(A0O), r5.A01, r5.A00);
                if (A07 != null) {
                    View A0O3 = C108945cZ.A0O(weakReference);
                    if (A0O3 != null) {
                        obj3 = A0O3.getTag();
                    } else {
                        obj3 = null;
                    }
                    if (C18070vi.A18(r9, obj3)) {
                        if (C30451dy.A00(this, emojiImageViewLoader.A05, new EmojiImageViewLoader$loadEmojiIntoView$5(A07, r5, emojiImageViewLoader, (C30391dr) null)) == r6) {
                            return r6;
                        }
                    } else if (num2 != null) {
                        r2 = (C139496yw) emojiImageViewLoader.A02.get();
                        i = num2.intValue();
                        num = AnonymousClass00R.A0C;
                    }
                } else if (num2 != null) {
                    r2 = (C139496yw) emojiImageViewLoader.A02.get();
                    i = num2.intValue();
                    num = AnonymousClass00R.A01;
                }
                r2.A01(i, num);
            }
        } else if (i2 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiImageViewLoader$loadEmoji$job$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
