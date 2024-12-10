package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass3X7;
import X.AnonymousClass5T4;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C38501rO;
import X.C83274Em;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerFragment$createList$1", f = "ListsManagerFragment.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
public final class ListsManagerFragment$createList$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ListsManagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerFragment$createList$1(ListsManagerFragment listsManagerFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = listsManagerFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsManagerFragment$createList$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsManagerFragment$createList$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsManagerViewModel A0p = AnonymousClass3Ma.A0p(this.this$0);
            ListsManagerFragment listsManagerFragment = this.this$0;
            AnonymousClass3X7 r0 = listsManagerFragment.A05;
            Integer num = null;
            if (r0 == null) {
                AnonymousClass3MW.A1B();
                throw null;
            }
            String str = r0.A01;
            Integer A0v = AnonymousClass3MW.A0v(listsManagerFragment.A15().getInt("arg_entry_point", -1));
            if (A0v.intValue() != -1) {
                num = A0v;
            }
            this.label = 1;
            obj = A0p.A0U(num, str, this);
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C83274Em r9 = (C83274Em) obj;
        AnonymousClass00H r02 = this.this$0.A08;
        if (r02 != null) {
            ListsManagerFragment listsManagerFragment2 = this.this$0;
            ((C38501rO) r02.get()).A03(listsManagerFragment2, r9, new AnonymousClass5T4(listsManagerFragment2));
            return C27621Wu.A00;
        }
        C18070vi.A11("listsUtil");
        throw null;
    }
}
