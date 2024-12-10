package com.whatsapp.comments;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1", f = "MessageCommentsManager.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $callback;
    public final /* synthetic */ AnonymousClass206 $message;
    public int label;
    public final /* synthetic */ MessageCommentsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1(MessageCommentsManager messageCommentsManager, AnonymousClass206 r3, C30391dr r4, AnonymousClass1OS r5) {
        super(2, r4);
        this.this$0 = messageCommentsManager;
        this.$message = r3;
        this.$callback = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1(this.this$0, this.$message, r6, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            MessageCommentsManager messageCommentsManager = this.this$0;
            AnonymousClass206 r0 = this.$message;
            this.label = 1;
            obj = messageCommentsManager.A00(r0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass1OS r1 = this.$callback;
        if (r1 != null) {
            r1.invoke(this.$message, obj);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
