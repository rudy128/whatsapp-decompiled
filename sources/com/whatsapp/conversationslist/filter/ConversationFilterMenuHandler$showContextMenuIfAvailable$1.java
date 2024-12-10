package com.whatsapp.conversationslist.filter;

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
import X.C41531wa;
import android.view.View;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler$showContextMenuIfAvailable$1", f = "ConversationFilterMenuHandler.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationFilterMenuHandler$showContextMenuIfAvailable$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ View $chip;
    public final /* synthetic */ C41531wa $filter;
    public final /* synthetic */ int $index;
    public int label;
    public final /* synthetic */ ConversationFilterMenuHandler this$0;

    @DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler$showContextMenuIfAvailable$1$1", f = "ConversationFilterMenuHandler.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler$showContextMenuIfAvailable$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            return new AnonymousClass1(view, r5, conversationFilterMenuHandler, r8, i2);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                ConversationFilterMenuHandler conversationFilterMenuHandler = conversationFilterMenuHandler;
                View view = view;
                C41531wa r1 = r5;
                int i2 = i2;
                this.label = 1;
                if (ConversationFilterMenuHandler.A00(view, r1, conversationFilterMenuHandler, this, i2) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationFilterMenuHandler$showContextMenuIfAvailable$1(View view, C41531wa r3, ConversationFilterMenuHandler conversationFilterMenuHandler, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = conversationFilterMenuHandler;
        this.$chip = view;
        this.$filter = r3;
        this.$index = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ConversationFilterMenuHandler$showContextMenuIfAvailable$1(this.$chip, this.$filter, this.this$0, r8, this.$index);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ConversationFilterMenuHandler conversationFilterMenuHandler = this.this$0;
            C18600wl r0 = conversationFilterMenuHandler.A0E;
            final View view = this.$chip;
            final C41531wa r5 = this.$filter;
            final int i2 = this.$index;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
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
        return ((ConversationFilterMenuHandler$showContextMenuIfAvailable$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
