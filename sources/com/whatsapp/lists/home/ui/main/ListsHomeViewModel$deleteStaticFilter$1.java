package com.whatsapp.lists.home.ui.main;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass5Y4;
import X.C106195Ux;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41761x1;
import X.C85964Pp;
import X.C88024Ya;
import X.C96734oK;
import X.C96764oN;
import com.whatsapp.lists.ListsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.home.ui.main.ListsHomeViewModel$deleteStaticFilter$1", f = "ListsHomeViewModel.kt", i = {0, 0}, l = {188}, m = "invokeSuspend", n = {"list", "newSortId"}, s = {"L$0", "J$0"})
public final class ListsHomeViewModel$deleteStaticFilter$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public final /* synthetic */ Integer $updateEntryPoint;
    public long J$0;
    public Object L$0;
    public int label;
    public final /* synthetic */ ListsHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsHomeViewModel$deleteStaticFilter$1(C41761x1 r2, ListsHomeViewModel listsHomeViewModel, Integer num, C30391dr r5) {
        super(2, r5);
        this.this$0 = listsHomeViewModel;
        this.$labelInfo = r2;
        this.$updateEntryPoint = num;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsHomeViewModel$deleteStaticFilter$1(this.$labelInfo, this.this$0, this.$updateEntryPoint, r6);
    }

    public final Object invokeSuspend(Object obj) {
        long longValue;
        long j;
        List list;
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsHomeViewModel listsHomeViewModel = this.this$0;
            ((C85964Pp) C18070vi.A0E(listsHomeViewModel.A02)).A00(this.$labelInfo, C17880vN.A0i(), this.$updateEntryPoint, (Long) null, (Long) null, (Long) null, (Long) null);
            List list2 = ListsHomeViewModel.A00(this.this$0).A00;
            C41761x1 r10 = this.$labelInfo;
            Iterator it = list2.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass5Y4 r3 = (AnonymousClass5Y4) it.next();
                if (!(r3 instanceof C96764oN) || ((C96764oN) r3).A00.A03 != r10.A03) {
                    i2++;
                } else if (i2 >= 0) {
                    Iterator it2 = ListsHomeViewModel.A00(this.this$0).A01.iterator();
                    if (!it2.hasNext()) {
                        longValue = 0;
                    } else {
                        Long l = new Long(((C41761x1) it2.next()).A05);
                        while (it2.hasNext()) {
                            Long l2 = new Long(((C41761x1) it2.next()).A05);
                            if (l.compareTo(l2) < 0) {
                                l = l2;
                            }
                        }
                        longValue = l.longValue();
                    }
                    j = longValue + 1;
                    List list3 = ListsHomeViewModel.A00(this.this$0).A01;
                    C41761x1 r11 = this.$labelInfo;
                    ArrayList A13 = AnonymousClass000.A13();
                    for (Object next : list3) {
                        if (((C41761x1) next).A03 != r11.A03) {
                            A13.add(next);
                        }
                    }
                    C41761x1 r2 = this.$labelInfo;
                    this.L$0 = A13;
                    this.J$0 = j;
                    this.label = 1;
                    list = A13;
                    if (((ListsRepository) this.this$0.A0A.get()).A05(r2, this, j, true) == r8) {
                        return r8;
                    }
                }
            }
            return C27621Wu.A00;
        } else if (i == 1) {
            j = this.J$0;
            C30691eM.A01(obj);
            list = (List) this.L$0;
        } else {
            throw AnonymousClass000.A0l();
        }
        C41761x1 r22 = this.$labelInfo;
        int i3 = r22.A02;
        long j2 = r22.A03;
        C41761x1 r5 = new C41761x1(r22.A06, i3, r22.A01, r22.A00, j2, r22.A04, j, true);
        C88024Ya A00 = ListsHomeViewModel.A00(this.this$0);
        ListsHomeViewModel listsHomeViewModel2 = this.this$0;
        List A03 = ListsHomeViewModel.A03(listsHomeViewModel2, this.$updateEntryPoint, list, ListsHomeViewModel.A00(listsHomeViewModel2).A04);
        List list4 = ListsHomeViewModel.A00(this.this$0).A02;
        ListsHomeViewModel listsHomeViewModel3 = this.this$0;
        List<C41761x1> A0M = C18070vi.A0M(r5);
        Integer num = this.$updateEntryPoint;
        ArrayList A0D = C29351c6.A0D(A0M);
        for (C41761x1 r4 : A0M) {
            A0D.add(new C96734oK(r4, new C106195Ux(listsHomeViewModel3, num)));
        }
        ArrayList A0k = C29431cG.A0k(A0D, list4);
        boolean z = A00.A04;
        List list5 = A00.A03;
        C18070vi.A0d(list, 0);
        C18070vi.A0p(A03, list5, A0k);
        this.this$0.A0F.setValue(new C88024Ya(list, A03, list5, A0k, z));
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsHomeViewModel$deleteStaticFilter$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
