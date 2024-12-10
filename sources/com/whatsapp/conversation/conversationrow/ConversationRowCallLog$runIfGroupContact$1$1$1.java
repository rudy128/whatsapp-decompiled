package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1$1$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$runIfGroupContact$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $block;
    public final /* synthetic */ AnonymousClass1E7 $it;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$runIfGroupContact$1$1$1(AnonymousClass1E7 r2, C30391dr r3, C22821Di r4) {
        super(2, r3);
        this.$block = r4;
        this.$it = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ConversationRowCallLog$runIfGroupContact$1$1$1(this.$it, r5, this.$block);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return this.$block.invoke(this.$it);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowCallLog$runIfGroupContact$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
