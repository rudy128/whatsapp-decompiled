package com.whatsapp.lists.home.ui.main;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import X.C85964Pp;
import com.whatsapp.lists.ListsRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.home.ui.main.ListsHomeViewModel$deleteList$1", f = "ListsHomeViewModel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
public final class ListsHomeViewModel$deleteList$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public final /* synthetic */ Integer $updateEntryPoint;
    public int label;
    public final /* synthetic */ ListsHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsHomeViewModel$deleteList$1(C41761x1 r2, ListsHomeViewModel listsHomeViewModel, Integer num, C30391dr r5) {
        super(2, r5);
        this.this$0 = listsHomeViewModel;
        this.$labelInfo = r2;
        this.$updateEntryPoint = num;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsHomeViewModel$deleteList$1(this.$labelInfo, this.this$0, this.$updateEntryPoint, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            List A0M = C18070vi.A0M(this.$labelInfo);
            this.label = 1;
            if (((ListsRepository) this.this$0.A0A.get()).A06(A0M, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        List list = ListsHomeViewModel.A00(this.this$0).A01;
        C41761x1 r7 = this.$labelInfo;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (((C41761x1) next).A03 != r7.A03) {
                A13.add(next);
            }
        }
        ListsHomeViewModel listsHomeViewModel = this.this$0;
        ((C85964Pp) C18070vi.A0E(listsHomeViewModel.A02)).A00(this.$labelInfo, C17880vN.A0i(), this.$updateEntryPoint, (Long) null, (Long) null, (Long) null, (Long) null);
        ListsHomeViewModel.A04(this.this$0, this.$updateEntryPoint, A13, (List) null, 6, false);
        this.this$0.A01 = null;
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsHomeViewModel$deleteList$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
