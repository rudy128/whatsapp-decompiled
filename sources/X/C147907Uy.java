package X;

import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader", f = "EmojiImageViewLoader.kt", i = {0, 0, 0, 0}, l = {153}, m = "loadEmojiIntoView", n = {"this", "task", "validTargetsAfterLoad", "allTargetsValidBeforeLoad"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* renamed from: X.7Uy  reason: invalid class name and case insensitive filesystem */
public final class C147907Uy extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EmojiImageViewLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147907Uy(EmojiImageViewLoader emojiImageViewLoader, C30391dr r2) {
        super(r2);
        this.this$0 = emojiImageViewLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EmojiImageViewLoader.A00((C134666qx) null, this.this$0, this);
    }
}
