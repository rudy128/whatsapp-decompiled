package com.whatsapp.conversationslist.filter;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C1605388w;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C200410p;
import X.C25161Nd;
import X.C25181Nf;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C32791hl;
import X.C58112kA;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler$markAsRead$1", f = "ConversationFilterMenuHandler.kt", i = {}, l = {318}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationFilterMenuHandler$markAsRead$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $filterType;
    public int label;
    public final /* synthetic */ ConversationFilterMenuHandler this$0;

    @DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler$markAsRead$1$1", f = "ConversationFilterMenuHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler$markAsRead$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(conversationFilterMenuHandler, str, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                Set A0S = C200410p.A0S(new String[]{str, "UNREAD_FILTER"});
                C58112kA r3 = (C58112kA) conversationFilterMenuHandler.A05.get();
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it = A0S.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    C18070vi.A0b(r3);
                    C1605388w A00 = r3.A00(A0v, (String) null);
                    if (A00 != null) {
                        A13.add(A00);
                    }
                }
                ArrayList A06 = ((C25161Nd) conversationFilterMenuHandler.A07.get()).A06();
                ArrayList A132 = AnonymousClass000.A13();
                Iterator it2 = A06.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (C25181Nf.A00((AnonymousClass1BI) next, A13)) {
                        A132.add(next);
                    }
                }
                ((C32791hl) conversationFilterMenuHandler.A06.get()).A03(A132);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationFilterMenuHandler$markAsRead$1(ConversationFilterMenuHandler conversationFilterMenuHandler, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = conversationFilterMenuHandler;
        this.$filterType = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ConversationFilterMenuHandler$markAsRead$1(this.this$0, this.$filterType, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ConversationFilterMenuHandler conversationFilterMenuHandler = this.this$0;
            C18600wl r3 = conversationFilterMenuHandler.A0D;
            final String str = this.$filterType;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r6) {
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
        return ((ConversationFilterMenuHandler$markAsRead$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
