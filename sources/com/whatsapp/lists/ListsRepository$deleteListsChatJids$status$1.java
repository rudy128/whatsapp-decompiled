package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import X.C60032nH;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$deleteListsChatJids$status$1", f = "ListsRepository.kt", i = {0}, l = {172}, m = "invokeSuspend", n = {"status"}, s = {"I$0"})
public final class ListsRepository$deleteListsChatJids$status$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $chatJids;
    public final /* synthetic */ C41761x1 $labelInfo;
    public int I$0;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$deleteListsChatJids$status$1(C41761x1 r2, ListsRepository listsRepository, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = listsRepository;
        this.$labelInfo = r2;
        this.$chatJids = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsRepository$deleteListsChatJids$status$1(this.$labelInfo, this.this$0, this.$chatJids, r6);
    }

    public final Object invokeSuspend(Object obj) {
        int A01;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            A01 = ((C60032nH) this.this$0.A06.get()).A01(this.$chatJids, this.$labelInfo.A03);
            ListsRepository listsRepository = this.this$0;
            long j = this.$labelInfo.A03;
            this.I$0 = A01;
            this.label = 1;
            if (C30451dy.A00(this, listsRepository.A0B, new ListsRepository$removeFromJidsFromCache$2(listsRepository, (C30391dr) null, j)) == r6) {
                return r6;
            }
        } else if (i == 1) {
            A01 = this.I$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return new Integer(A01);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$deleteListsChatJids$status$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
