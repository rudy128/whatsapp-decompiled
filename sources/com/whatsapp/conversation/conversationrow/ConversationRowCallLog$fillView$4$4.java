package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass22M;
import X.AnonymousClass3MW;
import X.C178119Bw;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C78453sp;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$4$4", f = "ConversationRowCallLog.kt", i = {}, l = {359}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$fillView$4$4 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C178119Bw $callLog;
    public final /* synthetic */ AnonymousClass22M $fMessage;
    public int label;
    public final /* synthetic */ C78453sp this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$4$4$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$4$4$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            AnonymousClass1E7 r2 = A0H;
            C178119Bw r3 = r7;
            return new AnonymousClass1(r5, r2, r3, A0T, r9, A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                CallConfirmationFragment.A03(r5.A0S, A0H, AnonymousClass3MW.A0v(A00), A0T, r7.A0J);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$fillView$4$4(AnonymousClass22M r2, C78453sp r3, C178119Bw r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$callLog = r4;
        this.$fMessage = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ConversationRowCallLog$fillView$4$4(this.$fMessage, this.this$0, this.$callLog, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass1E7 A0H = this.this$0.A0j.A0H(this.$callLog.A04.A01);
            final int A00 = C78453sp.A00(this.$fMessage, this.this$0);
            final String A0T = this.this$0.A0l.A0T(A0H, 7);
            C18600wl mainDispatcher = this.this$0.getMainDispatcher();
            final C178119Bw r7 = this.$callLog;
            final C78453sp r5 = this.this$0;
            AnonymousClass1 r4 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, mainDispatcher, r4) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowCallLog$fillView$4$4) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
