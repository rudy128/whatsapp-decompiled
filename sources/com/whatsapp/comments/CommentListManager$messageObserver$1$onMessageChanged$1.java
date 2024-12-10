package com.whatsapp.comments;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass4ZK;
import X.C108485bm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageChanged$1", f = "CommentListManager.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$messageObserver$1$onMessageChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $message;
    public int label;
    public final /* synthetic */ AnonymousClass4ZK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$messageObserver$1$onMessageChanged$1(AnonymousClass4ZK r2, AnonymousClass206 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$message = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommentListManager$messageObserver$1$onMessageChanged$1(this.this$0, this.$message, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108485bm r1 = this.this$0.A08;
            AnonymousClass206 r0 = this.$message;
            this.label = 1;
            if (r1.CHH(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentListManager$messageObserver$1$onMessageChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
