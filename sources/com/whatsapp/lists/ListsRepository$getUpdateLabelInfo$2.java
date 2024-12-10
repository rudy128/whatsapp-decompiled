package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1NA;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$getUpdateLabelInfo$2", f = "ListsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$getUpdateLabelInfo$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $id;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$getUpdateLabelInfo$2(ListsRepository listsRepository, C30391dr r3, long j) {
        super(2, r3);
        this.this$0 = listsRepository;
        this.$id = j;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsRepository$getUpdateLabelInfo$2(this.this$0, r6, this.$id);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return ((AnonymousClass1NA) this.this$0.A02.get()).A06(this.$id);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$getUpdateLabelInfo$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
