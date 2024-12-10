package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass4Z2;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ui.TextCommentLayout$getFailedCommentBundle$2", f = "TextCommentLayout.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TextCommentLayout$getFailedCommentBundle$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $message;
    public int label;
    public final /* synthetic */ TextCommentLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextCommentLayout$getFailedCommentBundle$2(TextCommentLayout textCommentLayout, AnonymousClass206 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = textCommentLayout;
        this.$message = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new TextCommentLayout$getFailedCommentBundle$2(this.this$0, this.$message, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass11P time = this.this$0.getTime();
            return AnonymousClass4Z2.A02(this.this$0.getMeManager(), time, this.this$0.getAbProps(), this.this$0.getInFlightMessages(), this.$message);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TextCommentLayout$getFailedCommentBundle$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
