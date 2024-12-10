package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C41761x1;
import X.C87334Ve;
import X.C99524sx;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerFragment$onViewCreated$5", f = "ListsManagerFragment.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
public final class ListsManagerFragment$onViewCreated$5 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public int label;
    public final /* synthetic */ ListsManagerFragment this$0;

    @DebugMetadata(c = "com.whatsapp.lists.ListsManagerFragment$onViewCreated$5$1", f = "ListsManagerFragment.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.lists.ListsManagerFragment$onViewCreated$5$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r2, listsManagerFragment, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r3 = AnonymousClass3Ma.A0p(listsManagerFragment).A0C;
                C99524sx r0 = new C99524sx(r2, listsManagerFragment);
                this.label = 1;
                if (r3.BFC(this, r0) == r5) {
                    return r5;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0l();
            } else {
                C30691eM.A01(obj);
            }
            throw AnonymousClass3MW.A13();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerFragment$onViewCreated$5(C41761x1 r2, ListsManagerFragment listsManagerFragment, C30391dr r4) {
        super(2, r4);
        this.this$0 = listsManagerFragment;
        this.$labelInfo = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsManagerFragment$onViewCreated$5(this.$labelInfo, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C37801q9 A1G = this.this$0.A1G();
            C23401Fx r4 = C23401Fx.STARTED;
            final ListsManagerFragment listsManagerFragment = this.this$0;
            final C41761x1 r2 = this.$labelInfo;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r4, A1G, this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsManagerFragment$onViewCreated$5) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
