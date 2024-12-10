package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsConversationsManagementViewModel$deleteLabels$1", f = "ListsConversationsManagementViewModel.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class ListsConversationsManagementViewModel$deleteLabels$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public int label;
    public final /* synthetic */ ListsConversationsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsConversationsManagementViewModel$deleteLabels$1(C41761x1 r2, ListsConversationsManagementViewModel listsConversationsManagementViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = listsConversationsManagementViewModel;
        this.$labelInfo = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsConversationsManagementViewModel$deleteLabels$1(this.$labelInfo, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            List A0M = C18070vi.A0M(this.$labelInfo);
            this.label = 1;
            if (((ListsRepository) this.this$0.A00.get()).A06(A0M, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsConversationsManagementViewModel$deleteLabels$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
