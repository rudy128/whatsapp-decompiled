package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.AnonymousClass3X7;
import X.AnonymousClass42Z;
import X.AnonymousClass5T7;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C38501rO;
import X.C820742a;
import X.C820842c;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerFragment$setupDoneButton$1$1", f = "ListsManagerFragment.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
public final class ListsManagerFragment$setupDoneButton$1$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ListsManagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerFragment$setupDoneButton$1$1(ListsManagerFragment listsManagerFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = listsManagerFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsManagerFragment$setupDoneButton$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsManagerFragment$setupDoneButton$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            ListsManagerViewModel A0p = AnonymousClass3Ma.A0p(this.this$0);
            AnonymousClass3X7 r0 = this.this$0.A05;
            if (r0 == null) {
                str = "adapter";
                C18070vi.A11(str);
                throw null;
            }
            String str2 = r0.A01;
            this.label = 1;
            ListsRepository A00 = ListsManagerViewModel.A00(A0p);
            obj = C30451dy.A00(this, A00.A0B, new ListsRepository$validateListName$2(A00, str2, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i2 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass00H r02 = this.this$0.A08;
        if (r02 != null) {
            C38501rO r3 = (C38501rO) r02.get();
            ListsManagerFragment listsManagerFragment = this.this$0;
            AnonymousClass5T7 r1 = new AnonymousClass5T7(listsManagerFragment);
            C18070vi.A0d(listsManagerFragment, 0);
            if (obj instanceof C820842c) {
                r1.invoke(obj);
            } else {
                if (obj instanceof AnonymousClass42Z) {
                    i = 2131891710;
                } else {
                    i = 2131891731;
                    if (obj instanceof C820742a) {
                        i = 2131891717;
                    }
                }
                C38501rO.A00(listsManagerFragment, r3, i);
            }
            return C27621Wu.A00;
        }
        str = "listsUtil";
        C18070vi.A11(str);
        throw null;
    }
}
