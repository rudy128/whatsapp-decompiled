package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1NH;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41761x1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$getConversations$2", f = "ListsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$getConversations$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$getConversations$2(C41761x1 r2, ListsRepository listsRepository, C30391dr r4) {
        super(2, r4);
        this.this$0 = listsRepository;
        this.$labelInfo = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsRepository$getConversations$2(this.$labelInfo, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return ((AnonymousClass1NH) this.this$0.A05.get()).A03(new long[]{this.$labelInfo.A03});
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$getConversations$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
