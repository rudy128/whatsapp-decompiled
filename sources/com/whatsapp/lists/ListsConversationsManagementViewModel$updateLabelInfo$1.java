package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4YC;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsConversationsManagementViewModel$updateLabelInfo$1", f = "ListsConversationsManagementViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class ListsConversationsManagementViewModel$updateLabelInfo$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $labelId;
    public int label;
    public final /* synthetic */ ListsConversationsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsConversationsManagementViewModel$updateLabelInfo$1(ListsConversationsManagementViewModel listsConversationsManagementViewModel, C30391dr r3, long j) {
        super(2, r3);
        this.this$0 = listsConversationsManagementViewModel;
        this.$labelId = j;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsConversationsManagementViewModel$updateLabelInfo$1(this.this$0, r6, this.$labelId);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsRepository listsRepository = (ListsRepository) this.this$0.A00.get();
            long j = this.$labelId;
            this.label = 1;
            obj = C30451dy.A00(this, listsRepository.A0B, new ListsRepository$getUpdateLabelInfo$2(listsRepository, (C30391dr) null, j));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A01.getValue();
        this.this$0.A01.setValue(new AnonymousClass4YC((C41761x1) obj, ((AnonymousClass4YC) this.this$0.A01.getValue()).A01));
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsConversationsManagementViewModel$updateLabelInfo$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
