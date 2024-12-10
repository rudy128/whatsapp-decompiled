package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C19880zA;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41761x1;
import X.C62522rX;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$updateListName$status$1", f = "ListsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$updateListName$status$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public final /* synthetic */ String $newLabelName;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$updateListName$status$1(C41761x1 r2, ListsRepository listsRepository, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = listsRepository;
        this.$labelInfo = r2;
        this.$newLabelName = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsRepository$updateListName$status$1(this.$labelInfo, this.this$0, this.$newLabelName, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C62522rX r2 = (C62522rX) this.this$0.A03.get();
            long j = this.$labelInfo.A03;
            String str = this.$newLabelName;
            C19880zA r1 = this.this$0.A00;
            if (!r1.A07()) {
                return new Long(r2.A02(str, j, 0));
            }
            C19880zA.A02(r1);
            throw AnonymousClass000.A0s("getPredefinedIdByName");
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$updateListName$status$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
