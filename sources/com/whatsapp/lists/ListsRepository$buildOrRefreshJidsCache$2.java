package com.whatsapp.lists;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$buildOrRefreshJidsCache$2", f = "ListsRepository.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$buildOrRefreshJidsCache$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$buildOrRefreshJidsCache$2(C41761x1 r2, ListsRepository listsRepository, C30391dr r4) {
        super(2, r4);
        this.this$0 = listsRepository;
        this.$labelInfo = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsRepository$buildOrRefreshJidsCache$2(this.$labelInfo, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$buildOrRefreshJidsCache$2) create(obj, (C30391dr) obj2)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Map map;
        Object l;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsRepository listsRepository = this.this$0;
            map = listsRepository.A0A;
            C41761x1 r2 = this.$labelInfo;
            l = new Long(r2.A03);
            this.L$0 = map;
            this.L$1 = l;
            this.label = 1;
            obj = listsRepository.A04(r2, this);
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            l = this.L$1;
            map = (Map) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map.put(l, obj);
        return C27621Wu.A00;
    }
}
