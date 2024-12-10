package com.whatsapp.labelitem.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import com.whatsapp.lists.ListsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.labelitem.view.AddToListViewModel$getJidsForList$1", f = "AddToListViewModel.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
public final class AddToListViewModel$getJidsForList$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public int label;
    public final /* synthetic */ AddToListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToListViewModel$getJidsForList$1(C41761x1 r2, AddToListViewModel addToListViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = addToListViewModel;
        this.$labelInfo = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AddToListViewModel$getJidsForList$1(this.$labelInfo, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C41761x1 r0 = this.$labelInfo;
            this.label = 1;
            obj = ((ListsRepository) this.this$0.A0J.get()).A04(r0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AddToListViewModel$getJidsForList$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
