package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1NA;
import X.AnonymousClass1OS;
import X.AnonymousClass1YF;
import X.AnonymousClass42Y;
import X.AnonymousClass42Z;
import X.AnonymousClass42b;
import X.AnonymousClass7R0;
import X.C17900vP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41691wu;
import X.C41761x1;
import X.C60032nH;
import X.C62522rX;
import X.C820742a;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$createList$2", f = "ListsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$createList$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $chatJids;
    public final /* synthetic */ String $inputListName;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$createList$2(ListsRepository listsRepository, String str, List list, C30391dr r5) {
        super(2, r5);
        this.$inputListName = str;
        this.this$0 = listsRepository;
        this.$chatJids = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsRepository$createList$2(this.this$0, this.$inputListName, this.$chatJids, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            String A0I = AnonymousClass1YF.A0I(this.$inputListName);
            if (A0I.length() == 0) {
                return C820742a.A00;
            }
            if (!((C41691wu) this.this$0.A09.get()).A02(A0I)) {
                long A01 = ((C62522rX) this.this$0.A03.get()).A01(A0I, ((AnonymousClass1NA) this.this$0.A02.get()).A05());
                if (A01 >= 0) {
                    if (AnonymousClass000.A1a(this.$chatJids)) {
                        ((C60032nH) this.this$0.A06.get()).A00(this.$chatJids, A01);
                    }
                    C41761x1 A06 = ((AnonymousClass1NA) this.this$0.A02.get()).A06(A01);
                    if (A06 != null) {
                        ListsRepository listsRepository = this.this$0;
                        listsRepository.A01.A0J(new AnonymousClass7R0(listsRepository, this.$chatJids, A06, 14));
                        return new AnonymousClass42Y(A06);
                    }
                } else if (A01 != -2) {
                    C17900vP.A0e("ListsRepository/Failed to create list with name ", A0I, AnonymousClass000.A10());
                }
                return AnonymousClass42b.A00;
            }
            return AnonymousClass42Z.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$createList$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
