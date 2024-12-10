package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass22M;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C178119Bw;
import X.C17890vO;
import X.C18070vi;
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
import X.C89444cT;
import android.content.res.Resources;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2", f = "ConversationRowCallLog.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$fillView$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass22M $fMessage;
    public int label;
    public final /* synthetic */ C78453sp this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r1, r2, A0q, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C78453sp r0 = r2;
                TextEmojiLabel textEmojiLabel = r0.A0C;
                Resources resources = r0.getResources();
                int A0C = ((C42571yO) r2.getCallingMessageUtil().get()).A0C(r1);
                textEmojiLabel.setText(AnonymousClass3MW.A0x(resources, A0q, AnonymousClass3MW.A1a(), 0, A0C));
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$fillView$2(AnonymousClass22M r2, C78453sp r3, C30391dr r4) {
        super(2, r4);
        this.$fMessage = r2;
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ConversationRowCallLog$fillView$2(this.$fMessage, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        UserJid userJid;
        final String A0q;
        C89444cT r0;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C178119Bw r02 = (C178119Bw) this.$fMessage.A00.A02;
            if (r02 == null || (r0 = r02.A04) == null) {
                userJid = null;
            } else {
                userJid = r0.A01;
            }
            AnonymousClass1M9 r03 = this.this$0.A0j;
            if (userJid != null) {
                AnonymousClass1E7 A0H = r03.A0H(userJid);
                C178119Bw r04 = (C178119Bw) this.$fMessage.A00.A02;
                if (r04 == null || !r04.A04.A03) {
                    A0q = AnonymousClass3MY.A0q(this.this$0.A0l, A0H);
                    if (A0q == null) {
                        A0q = "";
                    }
                } else {
                    A0q = this.this$0.getResources().getString(2131898595);
                }
                C18070vi.A0b(A0q);
                C18600wl mainDispatcher = this.this$0.getMainDispatcher();
                final C78453sp r2 = this.this$0;
                final AnonymousClass22M r1 = this.$fMessage;
                AnonymousClass1 r05 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, mainDispatcher, r05) == r6) {
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
        return ((ConversationRowCallLog$fillView$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
