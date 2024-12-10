package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowVideoAutoPlay$runOnCoroutineScope$1$1", f = "ConversationRowVideoAutoPlay.kt", i = {}, l = {555}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowVideoAutoPlay$runOnCoroutineScope$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowVideoAutoPlay$runOnCoroutineScope$1$1(C30391dr r2, AnonymousClass1OS r3) {
        super(2, r2);
        this.$block = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ConversationRowVideoAutoPlay$runOnCoroutineScope$1$1 conversationRowVideoAutoPlay$runOnCoroutineScope$1$1 = new ConversationRowVideoAutoPlay$runOnCoroutineScope$1$1(r4, this.$block);
        conversationRowVideoAutoPlay$runOnCoroutineScope$1$1.L$0 = obj;
        return conversationRowVideoAutoPlay$runOnCoroutineScope$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass1OS r0 = this.$block;
            this.label = 1;
            if (r0.invoke(obj2, this) == r3) {
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
        return ((ConversationRowVideoAutoPlay$runOnCoroutineScope$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
