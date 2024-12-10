package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41761x1;
import X.C62522rX;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$updateListHidden$status$1", f = "ListsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$updateListHidden$status$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public final /* synthetic */ boolean $newHidden;
    public final /* synthetic */ long $newSortId;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$updateListHidden$status$1(C41761x1 r2, ListsRepository listsRepository, C30391dr r4, long j, boolean z) {
        super(2, r4);
        this.this$0 = listsRepository;
        this.$labelInfo = r2;
        this.$newHidden = z;
        this.$newSortId = j;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        ListsRepository listsRepository = this.this$0;
        return new ListsRepository$updateListHidden$status$1(this.$labelInfo, listsRepository, r9, this.$newSortId, this.$newHidden);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return new Long(((C62522rX) this.this$0.A03.get()).A00(this.$labelInfo.A03, this.$newSortId, this.$newHidden));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$updateListHidden$status$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
