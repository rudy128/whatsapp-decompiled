package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C445823z;
import X.C78943ty;
import android.view.View;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillActionButton$3$1$1", f = "ConversationRowEvent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowEvent$fillActionButton$3$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C445823z $eventMessage;
    public int label;
    public final /* synthetic */ C78943ty this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowEvent$fillActionButton$3$1$1(C78943ty r2, C445823z r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$eventMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ConversationRowEvent$fillActionButton$3$1$1(this.this$0, this.$eventMessage, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C78943ty.A00((View.OnClickListener) null, this.this$0, this.$eventMessage.A0v.A02);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowEvent$fillActionButton$3$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
