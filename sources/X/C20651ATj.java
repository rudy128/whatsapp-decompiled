package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ATj  reason: case insensitive filesystem */
public final class C20651ATj implements C22508BAp {
    public final /* synthetic */ C20079A6f A00;
    public final /* synthetic */ C186549eN A01;
    public final /* synthetic */ C19989A2b A02;
    public final /* synthetic */ C22821Di A03;

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C188619hi r8 = (C188619hi) obj;
        C18070vi.A0d(r8, 0);
        C19989A2b a2b = this.A02;
        if (a2b != null) {
            a2b.A03("text_search_local_business_request_end");
            a2b.A03("qpl_business_ranking_start");
        }
        List list = r8.A0C;
        C20079A6f a6f = this.A00;
        C196579vI.A01(a6f, list);
        ArrayList A10 = C17880vN.A10(list);
        C199299zl r0 = this.A01.A01;
        ArrayList A0s = C108965cb.A0s(A10);
        String str = r8.A03;
        r0.A00(new C195459tN(a6f, new AP1(r8, a2b, this.A03, A10, 0), r8.A02, str, A0s, 1));
    }

    public C20651ATj(C20079A6f a6f, C186549eN r2, C19989A2b a2b, C22821Di r4) {
        this.A02 = a2b;
        this.A00 = a6f;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void BtA(C190599lD r3, int i) {
        this.A03.invoke(new C169218kY(i));
        C19989A2b a2b = this.A02;
        if (a2b != null) {
            a2b.A03("text_search_local_business_request_end");
        }
    }
}
