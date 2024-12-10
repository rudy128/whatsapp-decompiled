package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class B1G extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C19989A2b $directoryQplLogger;
    public final /* synthetic */ C195189sw $searchQueryResult;
    public final /* synthetic */ C198529yU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1G(C198529yU r2, C195189sw r3, C19989A2b a2b) {
        super(1);
        this.this$0 = r2;
        this.$searchQueryResult = r3;
        this.$directoryQplLogger = a2b;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9M5 r1 = (AnonymousClass9M5) obj;
        C18070vi.A0d(r1, 0);
        C198529yU r8 = this.this$0;
        C195189sw r5 = this.$searchQueryResult;
        C19989A2b a2b = this.$directoryQplLogger;
        Set set = r5.A04;
        set.add(C17880vN.A0h());
        if (r1 instanceof C169228kZ) {
            C188619hi r4 = ((C169228kZ) r1).A00;
            ((C199359zr) r8.A03.get()).A01(r4);
            List list = r4.A0A;
            C18070vi.A0W(list);
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                AEQ aeq = (AEQ) next;
                C193609qN r0 = r5.A01;
                C18070vi.A0b(aeq);
                AnonymousClass3MZ.A1V(next, A13, C196569vH.A00(r0, aeq) ? 1 : 0);
            }
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                AnonymousClass3MZ.A1V(next2, A132, r5.A02.A0A.contains(next2) ? 1 : 0);
            }
            C188619hi r6 = r5.A02;
            List list2 = r6.A0A;
            AnonymousClass8BW.A1P(A132, list2, A132.size(), 3 - list2.size());
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r8.A00;
            if (businessDirectoryContextualSearchViewModel != null) {
                String str = r5.A03;
                List list3 = r6.A0C;
                List list4 = r6.A09;
                A1Z a1z = r6.A01;
                String str2 = r6.A05;
                String str3 = r6.A08;
                C193609qN r82 = r5.A01;
                boolean z = !C108965cb.A1b(set, 2);
                r4.A0C.size();
                List list5 = r4.A09;
                list5.size();
                list5.size();
                businessDirectoryContextualSearchViewModel.A0V(r82, a1z, str, str2, str3, list2, list3, list4, z);
            }
            if (a2b != null && C108965cb.A1b(set, 2)) {
                a2b.A01();
            }
        } else if (r1 instanceof C169218kY) {
            int i = ((C169218kY) r1).A00;
            r5.A00 = i;
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = r8.A00;
            if (businessDirectoryContextualSearchViewModel2 != null) {
                businessDirectoryContextualSearchViewModel2.A0J.A0J(new C21454AkL(businessDirectoryContextualSearchViewModel2, r5.A03, i, 2));
            }
            if (a2b != null) {
                a2b.A00();
            }
        }
        return C27621Wu.A00;
    }
}
