package com.whatsapp.comments;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass4ZK;
import X.C106025Ug;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72483Me;
import java.util.SortedSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$loadMoreMessages$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$loadMoreMessages$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass4ZK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$loadMoreMessages$1(AnonymousClass4ZK r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommentListManager$loadMoreMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommentListManager$loadMoreMessages$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        SortedSet sortedSet;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4ZK r4 = this.this$0;
            AnonymousClass1G4 r3 = r4.A0A;
            do {
                value = r3.getValue();
                sortedSet = (SortedSet) value;
            } while (!C72483Me.A1E(value, sortedSet, new C106025Ug(r4, sortedSet), r3));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
