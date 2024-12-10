package X;

import java.util.List;
import java.util.Set;

public final class B1Z extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Set $fulfilledRequest;
    public final /* synthetic */ C22821Di $onResult;
    public final /* synthetic */ C98494rF $searchQueryResponse;
    public final /* synthetic */ C186549eN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1Z(C186549eN r2, Set set, C22821Di r4, C98494rF r5) {
        super(1);
        this.this$0 = r2;
        this.$fulfilledRequest = set;
        this.$searchQueryResponse = r5;
        this.$onResult = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = (AnonymousClass9M5) obj;
        C18070vi.A0d(obj2, 0);
        Set set = this.$fulfilledRequest;
        C98494rF r4 = this.$searchQueryResponse;
        C22821Di r3 = this.$onResult;
        Integer A0k = C17880vN.A0k();
        set.add(A0k);
        if (obj2 instanceof C169228kZ) {
            List list = ((C188619hi) r4.element).A09;
            List list2 = ((C169228kZ) obj2).A00.A09;
            C18070vi.A0W(list2);
            list.addAll(list2);
            if (set.contains(A0k) && C108965cb.A1b(set, 2)) {
                obj2 = new C169228kZ((C188619hi) r4.element);
            }
            return C27621Wu.A00;
        }
        r3.invoke(obj2);
        return C27621Wu.A00;
    }
}
