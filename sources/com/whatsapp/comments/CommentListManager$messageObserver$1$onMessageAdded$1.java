package com.whatsapp.comments;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass4ZK;
import X.AnonymousClass5RA;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72483Me;
import java.util.SortedSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageAdded$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$messageObserver$1$onMessageAdded$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $message;
    public int label;
    public final /* synthetic */ AnonymousClass4ZK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$messageObserver$1$onMessageAdded$1(AnonymousClass4ZK r2, AnonymousClass206 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$message = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommentListManager$messageObserver$1$onMessageAdded$1(this.this$0, this.$message, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G4 r4 = this.this$0.A0A;
            AnonymousClass206 r3 = this.$message;
            do {
                value = r4.getValue();
            } while (!C72483Me.A1E(value, (SortedSet) value, new AnonymousClass5RA(r3), r4));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentListManager$messageObserver$1$onMessageAdded$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
