package com.whatsapp.conversationslist.filter;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass3EW;
import X.C1605388w;
import X.C18070vi;
import X.C18090vk;
import X.C18600wl;
import X.C200410p;
import X.C25161Nd;
import X.C25181Nf;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C41531wa;
import X.C41541wb;
import X.C41551wc;
import X.C58112kA;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterViewModel$updateUnreadCountForListsFilters$1", f = "ConversationFilterViewModel.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationFilterViewModel$updateUnreadCountForListsFilters$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $onUpdateFinished;
    public int label;
    public final /* synthetic */ ConversationFilterViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterViewModel$updateUnreadCountForListsFilters$1$1", f = "ConversationFilterViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversationslist.filter.ConversationFilterViewModel$updateUnreadCountForListsFilters$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r5, r2);
        }

        public final Object invokeSuspend(Object obj) {
            C1605388w A00;
            int i;
            C41551wc r2;
            if (this.label == 0) {
                C30691eM.A01(obj);
                ArrayList A06 = ((C25161Nd) ConversationFilterViewModel.this.A03.get()).A06();
                C1605388w A002 = ((C58112kA) C18070vi.A0E(ConversationFilterViewModel.this.A02)).A00("UNREAD_FILTER", (String) null);
                Iterable<C41531wa> iterable = (Iterable) ConversationFilterViewModel.this.A08.getValue();
                ConversationFilterViewModel conversationFilterViewModel = ConversationFilterViewModel.this;
                ArrayList A0D = C29351c6.A0D(iterable);
                for (C41531wa r22 : iterable) {
                    boolean z = r22 instanceof C41551wc;
                    if (z) {
                        A00 = ((C58112kA) conversationFilterViewModel.A02.get()).A00("CUSTOM_LIST_FILTER", r22.A00());
                    } else if (r22 instanceof C41541wb) {
                        A00 = ((C58112kA) C18070vi.A0E(conversationFilterViewModel.A02)).A00(((C41541wb) r22).A02, (String) null);
                    } else {
                        throw new AnonymousClass3EW();
                    }
                    C1605388w[] r0 = new C1605388w[2];
                    AnonymousClass001.A1Q(A002, A00, r0);
                    ArrayList A0m = C29431cG.A0m(C200410p.A0S(r0));
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator it = A06.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (C25181Nf.A00((AnonymousClass1BI) next, A0m)) {
                            A13.add(next);
                        }
                    }
                    int size = A13.size();
                    boolean z2 = r22 instanceof C41541wb;
                    if (z2) {
                        i = ((C41541wb) r22).A00;
                    } else {
                        i = ((C41551wc) r22).A00;
                    }
                    if (size == i) {
                        r2 = r22;
                    } else if (z) {
                        r2 = new C41551wc(((C41551wc) r22).A01, size);
                    } else if (z2) {
                        r2 = new C41541wb(((C41541wb) r22).A02, r22.A00(), size);
                    } else {
                        throw new AnonymousClass3EW();
                    }
                    A0D.add(r2);
                }
                ConversationFilterViewModel.this.A08.setValue(A0D);
                r2.invoke();
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationFilterViewModel$updateUnreadCountForListsFilters$1(ConversationFilterViewModel conversationFilterViewModel, C30391dr r3, C18090vk r4) {
        super(2, r3);
        this.this$0 = conversationFilterViewModel;
        this.$onUpdateFinished = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ConversationFilterViewModel$updateUnreadCountForListsFilters$1(this.this$0, r5, this.$onUpdateFinished);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ConversationFilterViewModel conversationFilterViewModel = this.this$0;
            C18600wl r3 = conversationFilterViewModel.A07;
            final C18090vk r2 = this.$onUpdateFinished;
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
        return ((ConversationFilterViewModel$updateUnreadCountForListsFilters$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
