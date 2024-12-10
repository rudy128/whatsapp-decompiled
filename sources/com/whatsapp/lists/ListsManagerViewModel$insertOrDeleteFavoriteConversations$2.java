package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7R0;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41761x1;
import X.C62482rT;
import com.whatsapp.favorite.FavoriteManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerViewModel$insertOrDeleteFavoriteConversations$2", f = "ListsManagerViewModel.kt", i = {}, l = {353}, m = "invokeSuspend", n = {}, s = {})
public final class ListsManagerViewModel$insertOrDeleteFavoriteConversations$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public int label;
    public final /* synthetic */ ListsManagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerViewModel$insertOrDeleteFavoriteConversations$2(C41761x1 r2, ListsManagerViewModel listsManagerViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = listsManagerViewModel;
        this.$labelInfo = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsManagerViewModel$insertOrDeleteFavoriteConversations$2(this.$labelInfo, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsRepository A00 = ListsManagerViewModel.A00(this.this$0);
            List list = this.this$0.A09;
            C18070vi.A0X(list);
            C41761x1 r5 = this.$labelInfo;
            this.label = 1;
            FavoriteManager favoriteManager = (FavoriteManager) A00.A04.get();
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0D.add(new C62482rT(C17880vN.A0Q(it)));
            }
            favoriteManager.A07(A0D);
            A00.A01.A0J(new AnonymousClass7R0(A00, list, r5, 13));
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsManagerViewModel$insertOrDeleteFavoriteConversations$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
