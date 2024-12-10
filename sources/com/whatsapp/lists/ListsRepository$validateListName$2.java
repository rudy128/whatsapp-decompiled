package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1YE;
import X.AnonymousClass1YF;
import X.AnonymousClass42Z;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41691wu;
import X.C41761x1;
import X.C820742a;
import X.C820842c;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$validateListName$2", f = "ListsRepository.kt", i = {0}, l = {208}, m = "invokeSuspend", n = {"listName"}, s = {"L$0"})
public final class ListsRepository$validateListName$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $inputListName;
    public Object L$0;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$validateListName$2(ListsRepository listsRepository, String str, C30391dr r4) {
        super(2, r4);
        this.$inputListName = str;
        this.this$0 = listsRepository;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsRepository$validateListName$2(this.this$0, this.$inputListName, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String A0I;
        C31751g4 r1 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            A0I = AnonymousClass1YF.A0I(this.$inputListName);
            if (A0I.length() == 0) {
                return C820742a.A00;
            }
            if (((C41691wu) this.this$0.A09.get()).A02(A0I)) {
                return AnonymousClass42Z.A00;
            }
            ListsRepository listsRepository = this.this$0;
            this.L$0 = A0I;
            this.label = 1;
            obj = listsRepository.A08(this);
            if (obj == r1) {
                return r1;
            }
        } else if (i == 1) {
            A0I = (String) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        Iterable<C41761x1> iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (C41761x1 r0 : iterable) {
                if (AnonymousClass1YE.A09(r0.A06, A0I, true)) {
                    return AnonymousClass42Z.A00;
                }
            }
        }
        return C820842c.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$validateListName$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
