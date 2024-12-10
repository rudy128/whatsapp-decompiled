package X;

import com.whatsapp.conversation.comments.ui.TextCommentLayout;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ui.TextCommentLayout", f = "TextCommentLayout.kt", i = {}, l = {118}, m = "getFailedCommentBundle", n = {}, s = {})
/* renamed from: X.4tm  reason: invalid class name and case insensitive filesystem */
public final class C99984tm extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextCommentLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99984tm(TextCommentLayout textCommentLayout, C30391dr r2) {
        super(r2);
        this.this$0 = textCommentLayout;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TextCommentLayout.A00(this.this$0, (AnonymousClass206) null, this);
    }
}
