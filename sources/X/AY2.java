package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AY2 implements C22446B8e {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AY2(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity, int i) {
        this.A00 = i;
        this.A01 = brazilPayBloksActivity;
        this.A02 = r1;
    }

    public final void BrN(AnonymousClass8pK r19, A7B a7b, ArrayList arrayList, boolean z) {
        A5I A012;
        ARK ark;
        AnonymousClass8pK r4 = r19;
        ArrayList arrayList2 = arrayList;
        boolean z2 = z;
        A7B a7b2 = a7b;
        if (this.A00 != 0) {
            BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A01;
            C194839sN r3 = (C194839sN) this.A02;
            if (a7b != null) {
                AnonymousClass91q.A0q(r3, (Map) null, a7b2.A00);
            } else {
                brazilPayBloksActivity.A0D.A01().A03(new ARL(r3, r4, brazilPayBloksActivity, arrayList2, z2), r4);
            }
        } else {
            AnonymousClass91q r10 = (AnonymousClass91q) this.A01;
            C194839sN r8 = (C194839sN) this.A02;
            HashMap A11 = C17880vN.A11();
            if (a7b != null) {
                AnonymousClass8BU.A1N(A11, a7b2.A00);
                r8.A01("on_failure", A11);
                return;
            }
            A11.put("verified_state", AnonymousClass8BS.A0b(z2 ? 1 : 0));
            if (z) {
                A012 = r10.A0D.A01();
                ark = new ARK(r8, r4, r10, A11, 1);
            } else if (r19 == null || arrayList == null || arrayList2.isEmpty()) {
                AnonymousClass91q.A0q(r8, (Map) null, -233);
                return;
            } else {
                A012 = r10.A0D.A01();
                ark = new ARK(A11, arrayList2, r10, r8, 2);
            }
            A012.A03(ark, r4);
        }
    }
}
