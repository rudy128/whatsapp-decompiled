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

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$updateListHidden$2", f = "ListsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$updateListHidden$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public final /* synthetic */ boolean $newHidden;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$updateListHidden$2(C41761x1 r2, ListsRepository listsRepository, C30391dr r4, boolean z) {
        super(2, r4);
        this.$labelInfo = r2;
        this.$newHidden = z;
        this.this$0 = listsRepository;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsRepository$updateListHidden$2(this.$labelInfo, this.this$0, r6, this.$newHidden);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C41761x1 r0 = this.$labelInfo;
            int i = r0.A02;
            long j = r0.A03;
            String str = r0.A06;
            long j2 = r0.A04;
            ListsRepository.A00(this.this$0, C18460wS.A00, C18070vi.A0M(new C41761x1(str, i, r0.A01, r0.A00, j, j2, r0.A05, this.$newHidden)), false);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$updateListHidden$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
