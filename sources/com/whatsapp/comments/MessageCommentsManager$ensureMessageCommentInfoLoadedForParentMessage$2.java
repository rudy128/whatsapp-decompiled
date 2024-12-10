package com.whatsapp.comments;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2", f = "MessageCommentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $parentCommentMessage;
    public int label;
    public final /* synthetic */ MessageCommentsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2(MessageCommentsManager messageCommentsManager, AnonymousClass206 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = messageCommentsManager;
        this.$parentCommentMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2(this.this$0, this.$parentCommentMessage, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A01.A02(this.$parentCommentMessage, 40);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
