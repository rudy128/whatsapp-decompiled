package com.whatsapp.conversationslist.filter;

import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.Collection;
import java.util.Collections;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterViewModel$createListsConversationFilters$1", f = "ConversationFilterViewModel.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationFilterViewModel$createListsConversationFilters$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ConversationFilterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationFilterViewModel$createListsConversationFilters$1(ConversationFilterViewModel conversationFilterViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = conversationFilterViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConversationFilterViewModel$createListsConversationFilters$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConversationFilterViewModel$createListsConversationFilters$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1G4 r4;
        Collection singletonList;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ConversationFilterViewModel conversationFilterViewModel = this.this$0;
            r4 = conversationFilterViewModel.A08;
            singletonList = Collections.singletonList(ConversationFilterViewModel.A00(conversationFilterViewModel, "ALL_FILTER"));
            C18070vi.A0X(singletonList);
            ConversationFilterViewModel conversationFilterViewModel2 = this.this$0;
            this.L$0 = r4;
            this.L$1 = singletonList;
            this.label = 1;
            obj = C30451dy.A00(this, conversationFilterViewModel2.A07, new ConversationFilterViewModel$getListsFilterList$2(conversationFilterViewModel2, (C30391dr) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            singletonList = (Collection) this.L$1;
            r4 = (AnonymousClass1G4) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r4.setValue(C29431cG.A0k((Iterable) obj, singletonList));
        return C27621Wu.A00;
    }
}
