package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2LO;
import X.C146507Pj;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62522rX;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$reorderLists$2", f = "ListsRepository.kt", i = {}, l = {403}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$reorderLists$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $lists;
    public Object L$0;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$reorderLists$2(ListsRepository listsRepository, List list, C30391dr r4) {
        super(2, r4);
        this.this$0 = listsRepository;
        this.$lists = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsRepository$reorderLists$2(this.this$0, this.$lists, r5);
    }

    public final Object invokeSuspend(Object obj) {
        ListsRepository listsRepository;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C62522rX r4 = (C62522rX) this.this$0.A03.get();
            List list = this.$lists;
            C18070vi.A0d(list, 0);
            AnonymousClass2LO r2 = r4.A01;
            C17890vO.A0r(r2, list, 14);
            r4.A00.A0A(list);
            C17890vO.A0q(r2, 14);
            listsRepository = this.this$0;
            this.L$0 = listsRepository;
            this.label = 1;
            obj = listsRepository.A08(this);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            listsRepository = (ListsRepository) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        listsRepository.A01.A0J(new C146507Pj(listsRepository, obj, 40));
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$reorderLists$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
