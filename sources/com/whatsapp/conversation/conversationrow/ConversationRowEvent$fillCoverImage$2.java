package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C438421d;
import X.C445823z;
import X.C78943ty;
import X.C98114qb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillCoverImage$2", f = "ConversationRowEvent.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowEvent$fillCoverImage$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C445823z $eventMessage;
    public int label;
    public final /* synthetic */ C78943ty this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillCoverImage$2$1", f = "ConversationRowEvent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillCoverImage$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r2, r3, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C438421d A17 = r3.A17();
                C78943ty r0 = r2;
                if (A17 == null) {
                    r0.A0M.A04(8);
                } else {
                    r0.A1S.A0D(r0.A0M.A02(), A17, new C98114qb(r2, 2));
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowEvent$fillCoverImage$2(C78943ty r2, C445823z r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$eventMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ConversationRowEvent$fillCoverImage$2(this.this$0, this.$eventMessage, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A18.A0A(this.$eventMessage.A09);
            C18600wl mainDispatcher = this.this$0.getMainDispatcher();
            final C445823z r3 = this.$eventMessage;
            final C78943ty r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, mainDispatcher, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowEvent$fillCoverImage$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
