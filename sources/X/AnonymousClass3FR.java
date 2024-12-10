package X;

import com.whatsapp.comments.MessageCommentsManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.MessageCommentsManager", f = "MessageCommentsManager.kt", i = {0, 0}, l = {160}, m = "ensureMessageCommentInfoLoadedForComment", n = {"this", "updatedCommentInfo"}, s = {"L$0", "L$1"})
/* renamed from: X.3FR  reason: invalid class name */
public final class AnonymousClass3FR extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MessageCommentsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FR(MessageCommentsManager messageCommentsManager, C30391dr r2) {
        super(r2);
        this.this$0 = messageCommentsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass206) null, this);
    }
}
