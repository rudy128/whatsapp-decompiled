package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerViewModel$reorderFavoritesIfNeeded$2", f = "ListsManagerViewModel.kt", i = {}, l = {297}, m = "invokeSuspend", n = {}, s = {})
public final class ListsManagerViewModel$reorderFavoritesIfNeeded$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $jids;
    public final /* synthetic */ C41761x1 $labelInfo;
    public int label;
    public final /* synthetic */ ListsManagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerViewModel$reorderFavoritesIfNeeded$2(C41761x1 r2, ListsManagerViewModel listsManagerViewModel, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = listsManagerViewModel;
        this.$jids = list;
        this.$labelInfo = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsManagerViewModel$reorderFavoritesIfNeeded$2(this.$labelInfo, this.this$0, this.$jids, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsManagerViewModel listsManagerViewModel = this.this$0;
            if (listsManagerViewModel.A03) {
                List list = this.$jids;
                C41761x1 r1 = this.$labelInfo;
                this.label = 1;
                if (ListsManagerViewModel.A00(listsManagerViewModel).A03(r1, list, this) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsManagerViewModel$reorderFavoritesIfNeeded$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
