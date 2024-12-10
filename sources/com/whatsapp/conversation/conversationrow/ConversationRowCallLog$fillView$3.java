package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass22M;
import X.AnonymousClass3MX;
import X.C17890vO;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C42571yO;
import X.C78453sp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3", f = "ConversationRowCallLog.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$fillView$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass22M $fMessage;
    public int label;
    public final /* synthetic */ C78453sp this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r2, r3, A0T, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C78453sp r0 = r3;
                r0.A0B.setText(((C42571yO) r0.getCallingMessageUtil().get()).A0F(AnonymousClass3MX.A05(r3), r2, A0T));
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$fillView$3(AnonymousClass22M r2, C78453sp r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$fMessage = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ConversationRowCallLog$fillView$3(this.$fMessage, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1M9 r1 = this.this$0.A0j;
            AnonymousClass1BI r0 = this.$fMessage.A0v.A00;
            if (r0 != null) {
                final String A0T = this.this$0.A0l.A0T(r1.A0H(r0), 7);
                C18600wl mainDispatcher = this.this$0.getMainDispatcher();
                final C78453sp r3 = this.this$0;
                final AnonymousClass22M r2 = this.$fMessage;
                AnonymousClass1 r02 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, mainDispatcher, r02) == r6) {
                    return r6;
                }
            } else {
                throw C17890vO.A0K();
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowCallLog$fillView$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
