package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$getCompleteLabelInfoListForJidsWithCheckmarks$lists$1", f = "ListsRepository.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$getCompleteLabelInfoListForJidsWithCheckmarks$lists$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$getCompleteLabelInfoListForJidsWithCheckmarks$lists$1(ListsRepository listsRepository, C30391dr r3) {
        super(2, r3);
        this.this$0 = listsRepository;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsRepository$getCompleteLabelInfoListForJidsWithCheckmarks$lists$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsRepository$getCompleteLabelInfoListForJidsWithCheckmarks$lists$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsRepository listsRepository = this.this$0;
            this.label = 1;
            obj = listsRepository.A08(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
