package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C18460wS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41761x1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$updateListName$2", f = "ListsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$updateListName$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $updatedLabel;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$updateListName$2(C41761x1 r2, ListsRepository listsRepository, C30391dr r4) {
        super(2, r4);
        this.this$0 = listsRepository;
        this.$updatedLabel = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsRepository$updateListName$2(this.$updatedLabel, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ListsRepository.A00(this.this$0, C18460wS.A00, C18070vi.A0M(this.$updatedLabel), false);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$updateListName$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
