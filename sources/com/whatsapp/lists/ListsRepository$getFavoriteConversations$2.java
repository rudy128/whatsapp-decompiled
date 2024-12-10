package com.whatsapp.lists;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C62482rT;
import com.whatsapp.favorite.FavoriteManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$getFavoriteConversations$2", f = "ListsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$getFavoriteConversations$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$getFavoriteConversations$2(ListsRepository listsRepository, C30391dr r3) {
        super(2, r3);
        this.this$0 = listsRepository;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsRepository$getFavoriteConversations$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsRepository$getFavoriteConversations$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            List<C62482rT> A02 = ((FavoriteManager) this.this$0.A04.get()).A04.A02();
            ArrayList arrayList = new ArrayList(C29351c6.A0C(A02, 10));
            for (C62482rT r0 : A02) {
                arrayList.add(r0.A03);
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
