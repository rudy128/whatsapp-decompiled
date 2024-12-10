package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C178119Bw;
import X.C18600wl;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C63982u1;
import X.C78453sp;
import com.whatsapp.jid.GroupJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1", f = "ConversationRowCallLog.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$runIfGroupContact$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $block;
    public final /* synthetic */ C178119Bw $callLog;
    public int label;
    public final /* synthetic */ C78453sp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$runIfGroupContact$1(C78453sp r2, C178119Bw r3, C30391dr r4, C22821Di r5) {
        super(2, r4);
        this.$callLog = r3;
        this.this$0 = r2;
        this.$block = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ConversationRowCallLog$runIfGroupContact$1(this.this$0, this.$callLog, r6, this.$block);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean A0W = this.$callLog.A0W();
            GroupJid groupJid = this.$callLog.A0C;
            C78453sp r0 = this.this$0;
            AnonymousClass1E7 A01 = C63982u1.A01(r0.A0j, r0.A19, groupJid, r0.A1Q, A0W);
            obj = null;
            if (A01 != null) {
                C78453sp r02 = this.this$0;
                C22821Di r2 = this.$block;
                C18600wl mainDispatcher = r02.getMainDispatcher();
                ConversationRowCallLog$runIfGroupContact$1$1$1 conversationRowCallLog$runIfGroupContact$1$1$1 = new ConversationRowCallLog$runIfGroupContact$1$1$1(A01, (C30391dr) null, r2);
                this.label = 1;
                obj = C30451dy.A00(this, mainDispatcher, conversationRowCallLog$runIfGroupContact$1$1$1);
                if (obj == r6) {
                    return r6;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowCallLog$runIfGroupContact$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
