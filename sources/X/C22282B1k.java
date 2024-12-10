package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.B1k  reason: case insensitive filesystem */
public final class C22282B1k extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Set $fulfilledRequest;
    public final /* synthetic */ C22821Di $onResult;
    public final /* synthetic */ int $searchQueryBusinessType;
    public final /* synthetic */ C98494rF $searchQueryResponse;
    public final /* synthetic */ C186549eN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22282B1k(C186549eN r2, Set set, C22821Di r4, C98494rF r5, int i) {
        super(1);
        this.this$0 = r2;
        this.$fulfilledRequest = set;
        this.$searchQueryResponse = r5;
        this.$searchQueryBusinessType = i;
        this.$onResult = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = (AnonymousClass9M5) obj;
        C18070vi.A0d(obj2, 0);
        Set set = this.$fulfilledRequest;
        C98494rF r8 = this.$searchQueryResponse;
        int i = this.$searchQueryBusinessType;
        C22821Di r6 = this.$onResult;
        Integer A0i = C17880vN.A0i();
        set.add(A0i);
        if (obj2 instanceof C169228kZ) {
            C188619hi r13 = ((C169228kZ) obj2).A00;
            List list = r13.A09;
            List list2 = ((C188619hi) r8.element).A09;
            C18070vi.A0W(list2);
            list.addAll(list2);
            List list3 = r13.A0A;
            List list4 = r13.A0C;
            A1Z a1z = r13.A01;
            String str = r13.A04;
            String str2 = r13.A05;
            String str3 = r13.A08;
            String str4 = r13.A07;
            int i2 = r13.A00;
            Double d = r13.A02;
            List list5 = list3;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            A1Z a1z2 = a1z;
            Double d2 = d;
            r8.element = new C188619hi(a1z2, d2, str5, str6, str7, str4, r13.A06, r13.A03, list5, list, list4, r13.A0B, i2);
            if ((C108965cb.A1b(set, 4) && set.contains(A0i)) || i == 1) {
                obj2 = new C169228kZ((C188619hi) r8.element);
            }
            return C27621Wu.A00;
        }
        r6.invoke(obj2);
        return C27621Wu.A00;
    }
}
