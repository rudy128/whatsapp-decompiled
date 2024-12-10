package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6nT  reason: invalid class name and case insensitive filesystem */
public final class C132736nT {
    public final /* synthetic */ AnonymousClass8A3 A00;
    public final /* synthetic */ C133126oD A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C132736nT(AnonymousClass8A3 r1, C133126oD r2, String str, List list) {
        this.A01 = r2;
        this.A03 = list;
        this.A00 = r1;
        this.A02 = str;
    }

    public void A00(int i, Integer num) {
        AnonymousClass6YJ.A00(AnonymousClass001.A1I("XFamilyCrosspostEligibilityManager/generateEligibilityGraphqlCallback unknown error with code: ", AnonymousClass000.A10(), i), (Throwable) null);
        List list = this.A03;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C108995ce.A1Q(A0D, it);
        }
        C133126oD r1 = this.A01;
        AnonymousClass74B.A06(r1.A01, (AnonymousClass2LI) C18070vi.A0E(r1.A04), r1.A06, A0D, 4);
        this.A00.Bsm(i, num);
    }
}
