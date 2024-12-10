package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerFragment$activityResultLauncher$1$1", f = "ListsManagerFragment.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
public final class ListsManagerFragment$activityResultLauncher$1$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ ListsManagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerFragment$activityResultLauncher$1$1(ListsManagerFragment listsManagerFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = listsManagerFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsManagerFragment$activityResultLauncher$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsManagerFragment$activityResultLauncher$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsManagerFragment listsManagerFragment = this.this$0;
            C41761x1 r4 = listsManagerFragment.A04;
            if (r4 != null) {
                ListsManagerViewModel A0p = AnonymousClass3Ma.A0p(listsManagerFragment);
                Integer A0v = AnonymousClass3MW.A0v(listsManagerFragment.A15().getInt("arg_entry_point", -1));
                if (A0v.intValue() == -1) {
                    A0v = null;
                }
                this.L$0 = r4;
                this.label = 1;
                if (A0p.A0T(r4, A0v, this) == r6) {
                    return r6;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
