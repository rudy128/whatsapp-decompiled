package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4VQ;
import X.C105425Ry;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C89914dE;
import X.C91644g1;
import android.widget.ImageView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowVideoAutoPlay$initializeMuteButton$1", f = "ConversationRowVideoAutoPlay.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowVideoAutoPlay$initializeMuteButton$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass4VQ this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowVideoAutoPlay$initializeMuteButton$1$1", f = "ConversationRowVideoAutoPlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowVideoAutoPlay$initializeMuteButton$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r4, r5, A0X);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                boolean z = A0X;
                ImageView A0J = AnonymousClass3MX.A0J(r4.A0R);
                if (z) {
                    C89914dE.A00(A0J, r4, 0);
                    AnonymousClass4VQ r0 = r4;
                    AnonymousClass1F9 r3 = r0.A0B;
                    if (r3 == null) {
                        return null;
                    }
                    C91644g1.A00(r3, r0.A0C, new C105425Ry(r0), 9);
                    return r3;
                }
                A0J.setImageResource(2131233488);
                C89914dE.A00(AnonymousClass3MW.A0A(r4.A0R), r4, 1);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowVideoAutoPlay$initializeMuteButton$1(AnonymousClass4VQ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConversationRowVideoAutoPlay$initializeMuteButton$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConversationRowVideoAutoPlay$initializeMuteButton$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass4VQ r4 = this.this$0;
            final boolean A0X = r4.A0E.A0X();
            C18600wl r2 = r4.A0U;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            obj = C30451dy.A00(this, r2, r0);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
