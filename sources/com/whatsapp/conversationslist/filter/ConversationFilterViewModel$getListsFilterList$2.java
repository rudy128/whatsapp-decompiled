package com.whatsapp.conversationslist.filter;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41551wc;
import X.C41761x1;
import X.C41941xM;
import com.whatsapp.lists.ListsRepository;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterViewModel$getListsFilterList$2", f = "ConversationFilterViewModel.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationFilterViewModel$getListsFilterList$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ConversationFilterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationFilterViewModel$getListsFilterList$2(ConversationFilterViewModel conversationFilterViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = conversationFilterViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConversationFilterViewModel$getListsFilterList$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConversationFilterViewModel$getListsFilterList$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            obj = ((ListsRepository) this.this$0.A05.get()).A08(this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<C41761x1> iterable = (Iterable) obj;
        ConversationFilterViewModel conversationFilterViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(C29351c6.A0C(iterable, 10));
        for (C41761x1 r2 : iterable) {
            int i2 = r2.A02;
            if (i2 == 0) {
                A00 = new C41551wc(r2, 0);
            } else {
                A00 = ConversationFilterViewModel.A00(conversationFilterViewModel, ConversationFilterViewModel.A03(i2));
            }
            arrayList.add(A00);
        }
        this.this$0.A0V(C41941xM.A00);
        return arrayList;
    }
}
