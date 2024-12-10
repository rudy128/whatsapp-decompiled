package com.whatsapp.lists.home.ui.main;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.home.ui.main.ListsHomeViewModel$appendMemberEntities$3", f = "ListsHomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsHomeViewModel$appendMemberEntities$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $id;
    public final /* synthetic */ String $joinedNames;
    public int label;
    public final /* synthetic */ ListsHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsHomeViewModel$appendMemberEntities$3(ListsHomeViewModel listsHomeViewModel, String str, C30391dr r4, long j) {
        super(2, r4);
        this.this$0 = listsHomeViewModel;
        this.$id = j;
        this.$joinedNames = str;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ListsHomeViewModel$appendMemberEntities$3(this.this$0, this.$joinedNames, r8, this.$id);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A0C.put(new Long(this.$id), this.$joinedNames);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsHomeViewModel$appendMemberEntities$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
