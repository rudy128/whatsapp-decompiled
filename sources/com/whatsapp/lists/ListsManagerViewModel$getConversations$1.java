package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import X.C88334Zg;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerViewModel$getConversations$1", f = "ListsManagerViewModel.kt", i = {0}, l = {217}, m = "invokeSuspend", n = {"conversations"}, s = {"L$0"})
public final class ListsManagerViewModel$getConversations$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ListsManagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerViewModel$getConversations$1(C41761x1 r2, ListsManagerViewModel listsManagerViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = listsManagerViewModel;
        this.$labelInfo = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsManagerViewModel$getConversations$1(this.$labelInfo, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        List A13;
        Collection collection;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            A13 = AnonymousClass000.A13();
            this.this$0.A09.clear();
            ListsRepository A00 = ListsManagerViewModel.A00(this.this$0);
            C41761x1 r0 = this.$labelInfo;
            this.L$0 = A13;
            this.L$1 = A13;
            this.label = 1;
            obj = A00.A04(r0, this);
            if (obj == r3) {
                return r3;
            }
            collection = A13;
        } else if (i == 1) {
            A13 = (List) this.L$1;
            collection = (Collection) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        A13.addAll(C29431cG.A0m((Collection) obj));
        this.this$0.A09.addAll(collection);
        ListsManagerViewModel listsManagerViewModel = this.this$0;
        listsManagerViewModel.A02 = this.$labelInfo.A06;
        ListsManagerViewModel.A05(listsManagerViewModel, C88334Zg.A00(listsManagerViewModel.A0B), (List) null, (List) null, !listsManagerViewModel.A05, true);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsManagerViewModel$getConversations$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
