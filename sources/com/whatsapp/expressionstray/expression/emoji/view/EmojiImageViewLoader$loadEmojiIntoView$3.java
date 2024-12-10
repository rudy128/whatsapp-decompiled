package com.whatsapp.expressionstray.expression.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108945cZ;
import X.C134316qO;
import X.C136126tJ;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader$loadEmojiIntoView$3", f = "EmojiImageViewLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmojiIntoView$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $validTargetsAfterLoad;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmojiIntoView$3(List list, C30391dr r3) {
        super(2, r3);
        this.$validTargetsAfterLoad = list;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new EmojiImageViewLoader$loadEmojiIntoView$3(this.$validTargetsAfterLoad, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EmojiImageViewLoader$loadEmojiIntoView$3(this.$validTargetsAfterLoad, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EmojiImageView emojiImageView;
        if (this.label == 0) {
            C30691eM.A01(obj);
            for (C136126tJ r3 : this.$validTargetsAfterLoad) {
                C134316qO r2 = r3.A03;
                WeakReference weakReference = r3.A04;
                View A0O = C108945cZ.A0O(weakReference);
                if (A0O != null) {
                    obj2 = A0O.getTag();
                } else {
                    obj2 = null;
                }
                if (C18070vi.A18(r2, obj2) && (emojiImageView = (EmojiImageView) weakReference.get()) != null) {
                    emojiImageView.A00(r3.A02.A01(), r3.A00);
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
