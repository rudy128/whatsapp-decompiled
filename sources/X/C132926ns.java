package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ns  reason: invalid class name and case insensitive filesystem */
public final class C132926ns {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8A1 A01;
    public final /* synthetic */ C133106oB A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;

    public C132926ns(AnonymousClass8A1 r1, C133106oB r2, String str, List list, List list2, int i) {
        this.A02 = r2;
        this.A05 = list;
        this.A04 = list2;
        this.A01 = r1;
        this.A03 = str;
        this.A00 = i;
    }

    public void A00(AnonymousClass6OF r9) {
        C31081ez.A01(AnonymousClass001.A1E(r9, "EligibilityManager/generateEligibilityGraphqlCallback unknown error with exception: ", AnonymousClass000.A10()));
        List list = this.A05;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C108995ce.A1Q(A0D, it);
        }
        List list2 = this.A04;
        C133106oB r1 = this.A02;
        AnonymousClass74A.A06(r1.A01, (AnonymousClass2LF) C18070vi.A0E(r1.A03), r1.A05, A0D, list2, 4);
        this.A01.Bsv(r9);
    }
}
