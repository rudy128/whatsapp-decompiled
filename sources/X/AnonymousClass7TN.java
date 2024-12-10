package X;

import com.whatsapp.emoji.search.EmojiSearchProvider;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.emoji.search.EmojiSearchProvider", f = "EmojiSearchProvider.kt", i = {}, l = {38}, m = "searchAwait-0E7RQCE", n = {}, s = {})
/* renamed from: X.7TN  reason: invalid class name */
public final class AnonymousClass7TN extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EmojiSearchProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TN(EmojiSearchProvider emojiSearchProvider, C30391dr r2) {
        super(r2);
        this.this$0 = emojiSearchProvider;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A02((C122596Qz) null, (String) null, this));
    }
}
