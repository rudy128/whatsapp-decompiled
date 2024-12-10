package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7R0;
import X.C146507Pj;
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

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$updateListChatJids$2", f = "ListsRepository.kt", i = {0}, l = {155}, m = "invokeSuspend", n = {"status"}, s = {"I$0"})
public final class ListsRepository$updateListChatJids$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $chatJids;
    public final /* synthetic */ C41761x1 $labelInfo;
    public int I$0;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$updateListChatJids$2(C41761x1 r2, ListsRepository listsRepository, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = listsRepository;
        this.$labelInfo = r2;
        this.$chatJids = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsRepository$updateListChatJids$2(this.$labelInfo, this.this$0, this.$chatJids, r6);
    }

    public final Object invokeSuspend(Object obj) {
        int A00;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            A00 = ((C60032nH) this.this$0.A06.get()).A00(this.$chatJids, this.$labelInfo.A03);
            if (A00 != -1) {
                ListsRepository listsRepository = this.this$0;
                listsRepository.A01.A0J(new AnonymousClass7R0(listsRepository, this.$chatJids, this.$labelInfo, 15));
                ListsRepository listsRepository2 = this.this$0;
                C41761x1 r3 = this.$labelInfo;
                this.I$0 = A00;
                this.label = 1;
                if (C30451dy.A00(this, listsRepository2.A0B, new ListsRepository$buildOrRefreshJidsCache$2(r3, listsRepository2, (C30391dr) null)) == r6) {
                    return r6;
                }
            }
            return new Integer(A00);
        } else if (i == 1) {
            A00 = this.I$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        ListsRepository listsRepository3 = this.this$0;
        listsRepository3.A01.A0J(new C146507Pj(listsRepository3, this.$labelInfo, 42));
        return new Integer(A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$updateListChatJids$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
